package dev.heybox.hook;

import android.content.SharedPreferences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 模块 UI 的本地配置镜像。
 *
 * <p>Modern Xposed 的 Remote Preferences 存放在 LSPosed 数据库中，并不会
 * 自动读取模块 APK 私有目录下的普通 SharedPreferences。这个桥接器保持本地
 * 配置用于 UI 的即时显示，同时把每次编辑同步写入 LSPosed Remote Preferences。</p>
 */
final class PreferenceBridge implements SharedPreferences {
    private static final Object REMOVE = new Object();

    private final SharedPreferences local;
    private volatile SharedPreferences remote;

    PreferenceBridge(SharedPreferences local) {
        this.local = local;
    }

    void bindRemote(SharedPreferences remotePreferences) {
        remote = remotePreferences;
        // 本地文件保存着升级前用户实际选择；首次接入官方 Remote Preferences
        // 时以本地为准进行完整迁移。Editor.apply() 是原子、非阻塞更新。
        Editor editor = remotePreferences.edit().clear();
        copyValues(editor, local.getAll());
        editor.apply();
    }

    void unbindRemote() {
        remote = null;
    }

    boolean isRemoteReady() {
        return remote != null;
    }

    @Override
    public Map<String, ?> getAll() {
        return local.getAll();
    }

    @Override
    public String getString(String key, String defaultValue) {
        return local.getString(key, defaultValue);
    }

    @Override
    public Set<String> getStringSet(String key, Set<String> defaultValues) {
        return local.getStringSet(key, defaultValues);
    }

    @Override
    public int getInt(String key, int defaultValue) {
        return local.getInt(key, defaultValue);
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return local.getLong(key, defaultValue);
    }

    @Override
    public float getFloat(String key, float defaultValue) {
        return local.getFloat(key, defaultValue);
    }

    @Override
    public boolean getBoolean(String key, boolean defaultValue) {
        return local.getBoolean(key, defaultValue);
    }

    @Override
    public boolean contains(String key) {
        return local.contains(key);
    }

    @Override
    public Editor edit() {
        return new BridgeEditor();
    }

    @Override
    public void registerOnSharedPreferenceChangeListener(
            OnSharedPreferenceChangeListener listener) {
        local.registerOnSharedPreferenceChangeListener(listener);
    }

    @Override
    public void unregisterOnSharedPreferenceChangeListener(
            OnSharedPreferenceChangeListener listener) {
        local.unregisterOnSharedPreferenceChangeListener(listener);
    }

    private static void copyValues(Editor editor, Map<String, ?> values) {
        for (Map.Entry<String, ?> entry : values.entrySet()) {
            putValue(editor, entry.getKey(), entry.getValue());
        }
    }

    @SuppressWarnings("unchecked")
    private static void putValue(Editor editor, String key, Object value) {
        if (value == REMOVE || value == null) {
            editor.remove(key);
        } else if (value instanceof String) {
            editor.putString(key, (String) value);
        } else if (value instanceof Set<?>) {
            editor.putStringSet(key, (Set<String>) value);
        } else if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value);
        } else if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value);
        } else {
            throw new IllegalArgumentException(
                    "Unsupported preference type: " + value.getClass().getName());
        }
    }

    private final class BridgeEditor implements Editor {
        private final Map<String, Object> updates = new HashMap<>();
        private boolean clear;

        @Override
        public Editor putString(String key, String value) {
            updates.put(key, value == null ? REMOVE : value);
            return this;
        }

        @Override
        public Editor putStringSet(String key, Set<String> values) {
            updates.put(key, values == null ? REMOVE : new HashSet<>(values));
            return this;
        }

        @Override
        public Editor putInt(String key, int value) {
            updates.put(key, value);
            return this;
        }

        @Override
        public Editor putLong(String key, long value) {
            updates.put(key, value);
            return this;
        }

        @Override
        public Editor putFloat(String key, float value) {
            updates.put(key, value);
            return this;
        }

        @Override
        public Editor putBoolean(String key, boolean value) {
            updates.put(key, value);
            return this;
        }

        @Override
        public Editor remove(String key) {
            updates.put(key, REMOVE);
            return this;
        }

        @Override
        public Editor clear() {
            clear = true;
            updates.clear();
            return this;
        }

        @Override
        public boolean commit() {
            boolean localResult = applyTo(local).commit();
            SharedPreferences target = remote;
            return target == null ? localResult : applyTo(target).commit() && localResult;
        }

        @Override
        public void apply() {
            applyTo(local).apply();
            SharedPreferences target = remote;
            if (target != null) {
                applyTo(target).apply();
            }
        }

        private Editor applyTo(SharedPreferences target) {
            Editor editor = target.edit();
            if (clear) {
                editor.clear();
            }
            for (Map.Entry<String, Object> entry : updates.entrySet()) {
                putValue(editor, entry.getKey(), entry.getValue());
            }
            return editor;
        }
    }
}
