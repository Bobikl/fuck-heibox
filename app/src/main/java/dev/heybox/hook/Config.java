package dev.heybox.hook;

/** 模块设置项；Hook 进程通过 Modern Xposed RemotePreferences 读取同一份数据。 */
public final class Config {
    public static final String MODULE_VERSION = "0.6.0";
    public static final String MODULE_PACKAGE = "dev.heybox.hook";
    public static final String TARGET_PACKAGE = "com.max.xiaoheihe";
    public static final String PREFS_NAME = "heybox_hook";
    public static final String ACTION_SELF_CHECK =
            "dev.heybox.hook.action.SELF_CHECK_060";

    public static final String KEY_HIDE_PUBLISH = "hide_publish";
    public static final String KEY_SHARE_TASK = "share_task";
    /** 每个自然日首次收到任务列表时，自动上报可完成的分享任务。 */
    public static final String KEY_DAILY_SHARE_TASK = "daily_share_task";
    public static final String KEY_SKIP_SPLASH_AD = "skip_splash_ad";
    /** 净化信息流、首页气泡/角标、页内弹层及商城底栏广告；开屏由独立开关控制。 */
    public static final String KEY_GLOBAL_AD_CLEAN = "global_ad_clean";
    public static final String KEY_DISABLE_CLIPBOARD_TOKEN = "disable_clipboard_token";
    public static final String KEY_EXTERNAL_BROWSER = "external_browser";
    public static final String KEY_DISABLE_MEDIA_AUTOPLAY = "disable_media_autoplay";
    public static final String KEY_NO_FOREGROUND_REFRESH = "no_foreground_refresh";
    public static final String KEY_IMAGE_ENHANCE = "image_enhance";
    public static final String KEY_SPOOF_VERSION = "spoof_version";
    /** 是否拦截小黑盒检测到旧版本后创建的升级提示。 */
    public static final String KEY_SUPPRESS_UPDATE_PROMPT = "suppress_update_prompt";
    public static final String KEY_VERSION_MODE = "version_mode";
    public static final String KEY_CUSTOM_VERSION = "custom_version";
    public static final String KEY_CUSTOM_VERSION_CODE = "custom_version_code";
    public static final String KEY_LATEST_VERSION = "latest_version";
    public static final String KEY_LATEST_VERSION_CODE = "latest_version_code";

    public static final String VERSION_MODE_AUTO = "auto";
    public static final String VERSION_MODE_CUSTOM = "custom";

    public static final String URI_REQUEST_VERSION_CHECK =
            "xiaoheihe://heyboxhook/version-check";

    private Config() {
    }
}
