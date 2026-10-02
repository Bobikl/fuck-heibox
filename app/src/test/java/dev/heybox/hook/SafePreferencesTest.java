package dev.heybox.hook;

import android.content.SharedPreferences;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

public class SafePreferencesTest {
    private final List<String> logs = new ArrayList<>();
    private final SafePreferences safe = new SafePreferences(logs::add);

    /** 仅替身存储层；测试调用实际生产迁移和读取代码。 */
    private static final class Store {
        final Map<String, Object> values = new HashMap<>();
        boolean failRead, failContains, failApply;
        int applies;
        final SharedPreferences prefs = (SharedPreferences) Proxy.newProxyInstance(
                SharedPreferences.class.getClassLoader(), new Class<?>[]{SharedPreferences.class},
                (proxy, method, args) -> {
                    String name = method.getName();
                    if (name.equals("getAll")) {
                        if (failRead) throw new IllegalStateException("read");
                        return new HashMap<>(values);
                    }
                    if (name.equals("contains")) {
                        if (failContains) throw new IllegalStateException("contains");
                        return values.containsKey(args[0]);
                    }
                    if (name.equals("getBoolean")) {
                        Object value = values.get(args[0]);
                        if (value == null) return args[1];
                        if (!(value instanceof Boolean)) throw new ClassCastException("boolean");
                        return value;
                    }
                    if (name.equals("edit")) return editor();
                    throw new UnsupportedOperationException(name);
                });
        private SharedPreferences.Editor editor() {
            Map<String, Object> updates = new HashMap<>();
            return (SharedPreferences.Editor) Proxy.newProxyInstance(
                    SharedPreferences.Editor.class.getClassLoader(),
                    new Class<?>[]{SharedPreferences.Editor.class}, (proxy, method, args) -> {
                        String name = method.getName();
                        if (name.startsWith("put")) {
                            updates.put((String) args[0], args[1]);
                            return proxy;
                        }
                        if (name.equals("remove")) {
                            updates.put((String) args[0], null);
                            return proxy;
                        }
                        if (name.equals("apply")) {
                            if (failApply) throw new IllegalStateException("write");
                            applies++;
                            updates.forEach((key, value) -> {
                                if (value == null) values.remove(key);
                                else values.put(key, value);
                            });
                            return null;
                        }
                        throw new UnsupportedOperationException(name);
                    });
        }
    }

    @Test public void corruptBooleanFallsBackAndLogIsBounded() {
        Store host = new Store();
        host.values.put(Config.KEY_SHARE_TASK, "not a boolean");
        for (int i = 0; i < 100; i++) {
            assertFalse(safe.getBoolean(host.prefs, Config.KEY_SHARE_TASK, false));
        }
        assertTrue(safe.getBoolean(host.prefs, Config.KEY_SHARE_TASK, true));
        assertEquals(1, logs.size());
        assertFalse(logs.get(0).contains("not a boolean"));
    }

    @Test public void migrationPreservesHostAndWhitelistsTypes() {
        Store host = new Store(), old = new Store();
        host.values.put(Config.KEY_SHARE_TASK, false);
        old.values.put(Config.KEY_SHARE_TASK, true);
        old.values.put(Config.KEY_SKIP_SPLASH_AD, true);
        old.values.put(Config.KEY_IMAGE_ENHANCE, "true");
        old.values.put(Config.KEY_CUSTOM_VERSION, "1.2");
        old.values.put(Config.KEY_CUSTOM_VERSION_CODE, 12L);
        old.values.put(Config.KEY_LATEST_VERSION_CODE, 13);
        old.values.put("foreign_key", true);
        old.values.put(Config.KEY_HOST_PREFS_MIGRATED, true);
        assertEquals(3, safe.migrate(host.prefs, old.prefs));
        assertEquals(false, host.values.get(Config.KEY_SHARE_TASK));
        assertEquals(true, host.values.get(Config.KEY_SKIP_SPLASH_AD));
        assertEquals("1.2", host.values.get(Config.KEY_CUSTOM_VERSION));
        assertEquals(12L, host.values.get(Config.KEY_CUSTOM_VERSION_CODE));
        assertFalse(host.values.containsKey(Config.KEY_LATEST_VERSION_CODE));
        assertFalse(host.values.containsKey(Config.KEY_IMAGE_ENHANCE));
        assertFalse(host.values.containsKey("foreign_key"));
        assertEquals(true, host.values.get(Config.KEY_HOST_PREFS_MIGRATED));
    }

    @Test public void corruptMarkerDoesNotPreventMigration() {
        Store host = new Store(), old = new Store();
        host.values.put(Config.KEY_HOST_PREFS_MIGRATED, "invalid");
        old.values.put(Config.KEY_IMAGE_ENHANCE, true);
        assertEquals(1, safe.migrate(host.prefs, old.prefs));
        assertEquals(true, host.values.get(Config.KEY_HOST_PREFS_MIGRATED));
    }

    @Test public void readFailureRetriesWithoutCompletionMarker() {
        Store host = new Store(), old = new Store();
        old.values.put(Config.KEY_IMAGE_ENHANCE, true);
        old.failRead = true;
        assertEquals(-1, safe.migrate(host.prefs, old.prefs));
        assertEquals(0, host.applies);
        assertFalse(host.values.containsKey(Config.KEY_HOST_PREFS_MIGRATED));
        old.failRead = false;
        assertEquals(1, safe.migrate(host.prefs, old.prefs));
    }

    @Test public void absentRemoteDoesNotMarkCompletedButEmptyRemoteDoes() {
        Store host = new Store(), old = new Store();
        assertEquals(-1, safe.migrate(host.prefs, null));
        assertEquals(0, host.applies);
        assertEquals(0, safe.migrate(host.prefs, old.prefs));
        assertEquals(1, host.applies);
    }

    @Test public void completedMigrationDoesNotReadRemoteAgain() {
        Store host = new Store(), old = new Store();
        host.values.put(Config.KEY_HOST_PREFS_MIGRATED, true);
        old.failRead = true;
        assertEquals(0, safe.migrate(host.prefs, old.prefs));
        assertEquals(0, host.applies);
    }

    @Test public void containsOrApplyFailureCannotCompleteMigration() {
        Store host = new Store(), old = new Store();
        old.values.put(Config.KEY_IMAGE_ENHANCE, true);
        host.failContains = true;
        assertEquals(-1, safe.migrate(host.prefs, old.prefs));
        host.failContains = false;
        host.failApply = true;
        assertEquals(-1, safe.migrate(host.prefs, old.prefs));
        assertTrue(host.values.isEmpty());
        host.failApply = false;
        assertEquals(1, safe.migrate(host.prefs, old.prefs));
    }

    @Test public void gifMigrationPreservesNewValueAndRemovesOld() {
        Store host = new Store();
        host.values.put(Config.KEY_DISABLE_MEDIA_AUTOPLAY, true);
        host.values.put(Config.KEY_DISABLE_GIF_AUTOPLAY, false);
        safe.migrateGif(host.prefs);
        assertEquals(false, host.values.get(Config.KEY_DISABLE_GIF_AUTOPLAY));
        assertFalse(host.values.containsKey(Config.KEY_DISABLE_MEDIA_AUTOPLAY));
        assertEquals(1, host.applies);
    }

    @Test public void gifMigrationCopiesOnlyBooleanAndDoesNotInventDefault() {
        Store host = new Store();
        host.values.put(Config.KEY_DISABLE_MEDIA_AUTOPLAY, true);
        safe.migrateGif(host.prefs);
        assertEquals(true, host.values.get(Config.KEY_DISABLE_GIF_AUTOPLAY));
        Store corrupt = new Store();
        corrupt.values.put(Config.KEY_DISABLE_MEDIA_AUTOPLAY, "true");
        safe.migrateGif(corrupt.prefs);
        assertFalse(corrupt.values.containsKey(Config.KEY_DISABLE_GIF_AUTOPLAY));
        assertFalse(corrupt.values.containsKey(Config.KEY_DISABLE_MEDIA_AUTOPLAY));
    }

    @Test public void gifSnapshotUsesLegacyOnlyWhenNewKeyIsAbsent() {
        Store host = new Store();
        host.values.put(Config.KEY_DISABLE_MEDIA_AUTOPLAY, true);
        assertTrue(safe.getGifBoolean(host.prefs));
        host.values.put(Config.KEY_DISABLE_GIF_AUTOPLAY, false);
        assertFalse(safe.getGifBoolean(host.prefs));
        host.values.put(Config.KEY_DISABLE_GIF_AUTOPLAY, "invalid");
        assertFalse(safe.getGifBoolean(host.prefs));
    }

    @Test public void gifSnapshotContainsFailureFallsBackWithoutThrowing() {
        Store host = new Store();
        host.values.put(Config.KEY_DISABLE_MEDIA_AUTOPLAY, true);
        host.failContains = true;
        assertFalse(safe.getGifBoolean(host.prefs));
    }

    @Test public void failedWriteReturnsFalseAndExistingValueStays() {
        Store host = new Store();
        host.values.put(Config.KEY_IMAGE_ENHANCE, false);
        host.failApply = true;
        assertFalse(safe.putBoolean(host.prefs, Config.KEY_IMAGE_ENHANCE, true));
        assertEquals(false, host.values.get(Config.KEY_IMAGE_ENHANCE));
        host.failApply = false;
        assertTrue(safe.putBoolean(host.prefs, Config.KEY_IMAGE_ENHANCE, true));
        assertEquals(true, host.values.get(Config.KEY_IMAGE_ENHANCE));
    }
}
