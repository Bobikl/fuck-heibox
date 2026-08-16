package dev.heybox.hook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/** 将小黑盒更新接口返回的最新版本信息持久化到模块设置中。 */
public final class ConfigReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !Config.ACTION_CACHE_LATEST_VERSION.equals(intent.getAction())
                || intent.getData() == null
                || !"heyboxhook".equals(intent.getData().getScheme())) {
            return;
        }

        String version = intent.getStringExtra(Config.EXTRA_LATEST_VERSION);
        if (!isPlausibleVersion(version)) {
            return;
        }

        long versionCode = intent.getLongExtra(Config.EXTRA_LATEST_VERSION_CODE, 0L);
        // versionName 和 versionCode 必须成对缓存；只收到名称时不能覆盖旧的
        // versionCode，否则自动模式会把不同版本的两个标识拼在一起。
        if (!isPlausibleVersionCode(versionCode)) {
            return;
        }

        android.content.SharedPreferences.Editor editor = context
                .getSharedPreferences(Config.PREFS_NAME, Context.MODE_PRIVATE)
                .edit()
                .putString(Config.KEY_LATEST_VERSION, version.trim())
                .putLong(Config.KEY_LATEST_VERSION_CODE, versionCode);
        editor.apply();
    }

    private static boolean isPlausibleVersion(String value) {
        if (value == null) {
            return false;
        }
        String text = value.trim();
        return !text.isEmpty() && text.length() <= 64
                && text.matches("[0-9A-Za-z._+\\-]+");
    }

    private static boolean isPlausibleVersionCode(long value) {
        return value > 0L && value <= 0x00000000ffffffffL;
    }
}
