package dev.heybox.hook;

/** 模块设置项；Hook 进程通过 Modern Xposed RemotePreferences 读取同一份数据。 */
public final class Config {
    public static final String MODULE_PACKAGE = "dev.heybox.hook";
    public static final String TARGET_PACKAGE = "com.max.xiaoheihe";
    public static final String PREFS_NAME = "heybox_hook";

    public static final String KEY_HIDE_PUBLISH = "hide_publish";
    public static final String KEY_SHARE_TASK = "share_task";
    /** 每个自然日首次收到任务列表时，自动上报可完成的分享任务。 */
    public static final String KEY_DAILY_SHARE_TASK = "daily_share_task";
    public static final String KEY_SKIP_SPLASH_AD = "skip_splash_ad";
    public static final String KEY_SPOOF_VERSION = "spoof_version";
    public static final String KEY_VERSION_MODE = "version_mode";
    public static final String KEY_CUSTOM_VERSION = "custom_version";
    public static final String KEY_CUSTOM_VERSION_CODE = "custom_version_code";
    public static final String KEY_LATEST_VERSION = "latest_version";
    public static final String KEY_LATEST_VERSION_CODE = "latest_version_code";

    public static final String VERSION_MODE_AUTO = "auto";
    public static final String VERSION_MODE_CUSTOM = "custom";

    public static final String ACTION_CACHE_LATEST_VERSION =
            MODULE_PACKAGE + ".CACHE_LATEST_VERSION";
    public static final String ACTION_REQUEST_VERSION_CHECK =
            MODULE_PACKAGE + ".REQUEST_VERSION_CHECK";
    public static final String URI_REQUEST_VERSION_CHECK =
            "xiaoheihe://heyboxhook/version-check";
    public static final String EXTRA_LATEST_VERSION = "latest_version";
    public static final String EXTRA_LATEST_VERSION_CODE = "latest_version_code";
    public static final String URI_OPEN_SETTINGS =
            "xiaoheihe://heyboxhook/settings";

    private Config() {
    }
}
