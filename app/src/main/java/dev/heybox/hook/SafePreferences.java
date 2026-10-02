package dev.heybox.hook;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/** 配置读取安全回退，迁移仅接受模块已知键及正确类型。 */
final class SafePreferences {
    private static final Set<String> BOOLEAN_KEYS = new HashSet<>(Arrays.asList(
            Config.KEY_HIDE_PUBLISH, Config.KEY_SHARE_TASK, Config.KEY_DAILY_SHARE_TASK,
            Config.KEY_SKIP_SPLASH_AD, Config.KEY_GLOBAL_AD_CLEAN, Config.KEY_AD_CLEAN_HOME,
            Config.KEY_AD_CLEAN_BANNERS, Config.KEY_AD_CLEAN_MALL_BOTTOM,
            Config.KEY_DISABLE_CLIPBOARD_TOKEN, Config.KEY_EXTERNAL_BROWSER,
            Config.KEY_DISABLE_MEDIA_AUTOPLAY, Config.KEY_DISABLE_GIF_AUTOPLAY,
            Config.KEY_NO_FOREGROUND_REFRESH, Config.KEY_IMAGE_ENHANCE,
            Config.KEY_IMAGE_WIFI_ADAPTIVE, Config.KEY_POST_TEXT_SELECT,
            Config.KEY_SPOOF_VERSION, Config.KEY_SUPPRESS_UPDATE_PROMPT));
    private static final Set<String> STRING_KEYS = new HashSet<>(Arrays.asList(Config.KEY_VERSION_MODE,
            Config.KEY_CUSTOM_VERSION, Config.KEY_LATEST_VERSION));
    private static final Set<String> LONG_KEYS = new HashSet<>(Arrays.asList(Config.KEY_CUSTOM_VERSION_CODE,
            Config.KEY_LATEST_VERSION_CODE));
    private final Consumer<String> diagnostic;
    private final Set<String> reported = new HashSet<>();

    SafePreferences(Consumer<String> diagnostic) {
        this.diagnostic = diagnostic;
    }

    private synchronized void report(String operation, RuntimeException exception) {
        // 不记录配置值；相同键的故障仅记录一次，并限制总记录数。
        if (reported.size() < 32 && reported.add(operation)) {
            diagnostic.accept(operation + " " + exception.getClass().getSimpleName());
        }
    }

    boolean getBoolean(SharedPreferences preferences, String key, boolean fallback) {
        try {
            return preferences.getBoolean(key, fallback);
        } catch (RuntimeException exception) {
            report("CONFIG_READ_ERROR key=" + key, exception);
            return fallback;
        }
    }

    boolean getGifBoolean(SharedPreferences preferences) {
        try {
            if (preferences.contains(Config.KEY_DISABLE_GIF_AUTOPLAY)) {
                return getBoolean(preferences, Config.KEY_DISABLE_GIF_AUTOPLAY, false);
            }
            return getBoolean(preferences, Config.KEY_DISABLE_MEDIA_AUTOPLAY, false);
        } catch (RuntimeException exception) {
            report("CONFIG_GIF_READ_ERROR", exception);
            return false;
        }
    }

    /** -1 表示失败，不标记完成，下次启动仍可重试。 */
    int migrate(SharedPreferences host, SharedPreferences legacy) {
        if (getBoolean(host, Config.KEY_HOST_PREFS_MIGRATED, false)) {
            return 0;
        }
        if (legacy == null) {
            return -1;
        }
        try {
            Map<String, ?> values = legacy.getAll();
            if (values == null) {
                return -1;
            }
            SharedPreferences.Editor editor = host.edit();
            int migrated = 0;
            for (Map.Entry<String, ?> entry : values.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key == null || host.contains(key)) {
                    continue;
                }
                if (BOOLEAN_KEYS.contains(key) && value instanceof Boolean) {
                    editor.putBoolean(key, (Boolean) value);
                } else if (STRING_KEYS.contains(key) && value instanceof String) {
                    editor.putString(key, (String) value);
                } else if (LONG_KEYS.contains(key) && value instanceof Long) {
                    editor.putLong(key, (Long) value);
                } else {
                    continue;
                }
                migrated++;
            }
            editor.putBoolean(Config.KEY_HOST_PREFS_MIGRATED, true).apply();
            return migrated;
        } catch (RuntimeException exception) {
            report("CONFIG_MIGRATION_ERROR", exception);
            return -1;
        }
    }

    void migrateGif(SharedPreferences preferences) {
        try {
            if (!preferences.contains(Config.KEY_DISABLE_MEDIA_AUTOPLAY)) {
                return;
            }
            Object oldValue = preferences.getAll().get(Config.KEY_DISABLE_MEDIA_AUTOPLAY);
            SharedPreferences.Editor editor = preferences.edit();
            if (!preferences.contains(Config.KEY_DISABLE_GIF_AUTOPLAY)
                    && oldValue instanceof Boolean) {
                editor.putBoolean(Config.KEY_DISABLE_GIF_AUTOPLAY, (Boolean) oldValue);
            }
            // 损坏的旧键也移除，但不把默认值写入新键。
            editor.remove(Config.KEY_DISABLE_MEDIA_AUTOPLAY).apply();
        } catch (RuntimeException exception) {
            report("CONFIG_GIF_MIGRATION_ERROR", exception);
        }
    }

    boolean putBoolean(SharedPreferences preferences, String key, boolean value) {
        try {
            preferences.edit().putBoolean(key, value).apply();
            return true;
        } catch (RuntimeException exception) {
            report("CONFIG_WRITE_ERROR key=" + key, exception);
            return false;
        }
    }
}
