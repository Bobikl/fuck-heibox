package dev.heybox.hook;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Build;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 从小黑盒设置页进入的模块设置页面。 */
public final class SettingsActivity extends Activity {
    private static final String VERSION_SOURCE_URL =
            "https://m.app.mi.com/detailapi/464663";
    private static final Pattern VERSION_NAME_PATTERN = Pattern.compile(
            "\\\"(?:versionName|vname)\\\"\\s*:\\s*\\\"([^\\\"]+)\\\"",
            Pattern.CASE_INSENSITIVE);
    private static final Pattern VERSION_CODE_PATTERN = Pattern.compile(
            "\\\"vcode\\\"\\s*:\\s*\\\"?([0-9]+)\\\"?",
            Pattern.CASE_INSENSITIVE);
    private static final int COLOR_BACKGROUND = Color.rgb(245, 246, 248);
    private static final int COLOR_CARD = Color.WHITE;
    private static final int COLOR_PRIMARY = Color.rgb(28, 29, 33);
    private static final int COLOR_SECONDARY = Color.rgb(139, 142, 151);
    private static final int COLOR_ACCENT = Color.rgb(247, 193, 35);
    private static final int COLOR_DIVIDER = Color.rgb(237, 238, 241);

    private SharedPreferences preferences;
    private LinearLayout content;
    private TextView versionModeValue;
    private TextView versionStatus;
    private TextView selfCheckStatus;
    private LinearLayout customVersionRow;
    private EditText customVersionInput;
    private EditText customVersionCodeInput;
    private volatile HttpURLConnection versionConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(Config.PREFS_NAME, MODE_PRIVATE);
        configureWindow();
        setContentView(createPage());
        refreshVersionArea();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (versionStatus != null) {
            refreshVersionArea();
        }
        if (selfCheckStatus != null) {
            refreshSelfCheck();
        }
    }

    @Override
    protected void onDestroy() {
        HttpURLConnection connection = versionConnection;
        versionConnection = null;
        if (connection != null) {
            connection.disconnect();
        }
        super.onDestroy();
    }

    private void configureWindow() {
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(Color.WHITE);
        window.setNavigationBarColor(Color.WHITE);
        window.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
    }

    private View createPage() {
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(COLOR_BACKGROUND);
        // 某些系统会把从目标应用任务栈打开的 Activity 继续按沉浸式窗口布局。
        // 使用实际 WindowInsets 而不是固定高度，兼容状态栏和挖孔屏。
        root.setOnApplyWindowInsetsListener((view, insets) -> {
            int topInset = insets.getSystemWindowInsetTop();
            if (Build.VERSION.SDK_INT >= 28 && insets.getDisplayCutout() != null) {
                topInset = Math.max(topInset,
                        insets.getDisplayCutout().getSafeInsetTop());
            }
            int leftInset = insets.getSystemWindowInsetLeft();
            int rightInset = insets.getSystemWindowInsetRight();
            int bottomInset = insets.getSystemWindowInsetBottom();
            if (view.getPaddingTop() != topInset
                    || view.getPaddingLeft() != leftInset
                    || view.getPaddingRight() != rightInset
                    || view.getPaddingBottom() != bottomInset) {
                view.setPadding(leftInset, topInset, rightInset, bottomInset);
            }
            return insets;
        });

        root.addView(createTitleBar(), new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(56)));

        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.setClipToPadding(false);

        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(dp(14), dp(8), dp(14), dp(32));
        scrollView.addView(content, new ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        addSectionLabel("净化功能");
        LinearLayout cleanCard = createCard();
        cleanCard.addView(createSwitchRow(
                "隐藏首页发布按钮", "移除底部导航栏中间的发布入口",
                 Config.KEY_HIDE_PUBLISH, false));
        cleanCard.addView(createDivider());
        cleanCard.addView(createSwitchRow(
                "全局广告净化", "移除信息流、首页气泡/角标、页内弹层及商城底栏广告",
                 Config.KEY_GLOBAL_AD_CLEAN, false));
        cleanCard.addView(createDivider());
        cleanCard.addView(createSwitchRow(
                "跳过开屏广告", "独立于全局净化；保留启动流程并跳过广告素材",
                 Config.KEY_SKIP_SPLASH_AD, false));
        cleanCard.addView(createDivider());
        cleanCard.addView(createSwitchRow(
                "禁止读取剪贴板口令", "阻止小黑盒启动/回前台时扫描剪贴板内容",
                 Config.KEY_DISABLE_CLIPBOARD_TOKEN, false));
        content.addView(cleanCard, cardMargins());

        addSectionLabel("任务功能");
        LinearLayout taskCard = createCard();
        taskCard.addView(createSwitchRow(
                "自动完成分享任务", "点击“去完成”后直接上报分享成功",
                 Config.KEY_SHARE_TASK, false));
        taskCard.addView(createDivider());
        taskCard.addView(createSwitchRow(
                "首次启动自动完成分享任务", "每天每个账号只执行一次；需要同时开启上一项",
                 Config.KEY_DAILY_SHARE_TASK, false));
        content.addView(taskCard, cardMargins());

        addSectionLabel("浏览与媒体");
        LinearLayout experienceCard = createCard();
        experienceCard.addView(createSwitchRow(
                "使用外部浏览器打开链接", "普通 http/https 链接交给外部浏览器，内部协议保留",
                 Config.KEY_EXTERNAL_BROWSER, false));
        experienceCard.addView(createDivider());
        experienceCard.addView(createSwitchRow(
                "禁止视频/GIF 自动播放", "推荐流视频保留手动播放；GIF 默认显示静态首帧",
                 Config.KEY_DISABLE_MEDIA_AUTOPLAY, false));
        experienceCard.addView(createDivider());
        experienceCard.addView(createSwitchRow(
                "回前台不自动刷新", "保留签到状态同步，仅阻止首页超时后整页刷新",
                 Config.KEY_NO_FOREGROUND_REFRESH, false));
        experienceCard.addView(createDivider());
        experienceCard.addView(createSwitchRow(
                "图片体验增强", "进入图片查看器后自动请求服务器原图",
                 Config.KEY_IMAGE_ENHANCE, false));
        content.addView(experienceCard, cardMargins());

        addSectionLabel("版本兼容");
        LinearLayout versionCard = createCard();
        versionCard.addView(createSwitchRow(
                "伪装应用版本", "对小黑盒自身的 versionName / versionCode 读取返回目标值",
                 Config.KEY_SPOOF_VERSION, false));
        versionCard.addView(createDivider());
        versionCard.addView(createSwitchRow(
                "屏蔽版本更新弹窗", "检测到当前版本过旧时不显示升级提示",
                 Config.KEY_SUPPRESS_UPDATE_PROMPT, false));
        versionCard.addView(createDivider());
        versionCard.addView(createVersionModeRow());
        versionCard.addView(createDivider());
        versionStatus = createInfoRow("当前目标", "");
        versionCard.addView(versionStatus);
        versionCard.addView(createCustomVersionRow());
        content.addView(versionCard, cardMargins());

        TextView note = new TextView(this);
        note.setText("自动模式从小米应用商店公开接口同时获取 versionName 与 versionCode，并在本机缓存。获取失败时可切换到自定义模式。所有开关默认关闭，设置在重启小黑盒后完全生效；关闭的功能不会安装对应 Hook。");
        note.setTextColor(COLOR_SECONDARY);
        note.setTextSize(12);
        note.setLineSpacing(dp(2), 1f);
        LinearLayout.LayoutParams noteParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        noteParams.setMargins(dp(12), dp(10), dp(12), 0);
        content.addView(note, noteParams);

        TextView openUpdateCheck = createActionButton("获取小黑盒最新版本");
        openUpdateCheck.setOnClickListener(view -> {
            openUpdateCheck.setEnabled(false);
            openUpdateCheck.setText("正在获取…");
            fetchLatestVersion(openUpdateCheck);
        });
        LinearLayout.LayoutParams updateParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(44));
        updateParams.setMargins(dp(12), dp(18), dp(12), 0);
        content.addView(openUpdateCheck, updateParams);

        TextView testVersionCheck = new TextView(this);
        testVersionCheck.setText("在小黑盒内测试版本检测");
        testVersionCheck.setTextColor(COLOR_SECONDARY);
        testVersionCheck.setTextSize(13);
        testVersionCheck.setGravity(Gravity.CENTER);
        testVersionCheck.setPadding(0, dp(8), 0, dp(8));
        testVersionCheck.setOnClickListener(view -> requestTargetVersionCheck());
        LinearLayout.LayoutParams testParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(42));
        testParams.setMargins(dp(12), dp(2), dp(12), 0);
        content.addView(testVersionCheck, testParams);

        addSectionLabel("模块自检");
        LinearLayout selfCheckCard = createCard();
        selfCheckStatus = createInfoRow("Hook 状态", "正在读取…");
        selfCheckStatus.setLineSpacing(dp(2), 1f);
        selfCheckCard.addView(selfCheckStatus);
        selfCheckCard.addView(createDivider());
        TextView refreshSelfCheck = createPlainActionRow("刷新自检结果");
        refreshSelfCheck.setOnClickListener(view -> refreshSelfCheck());
        selfCheckCard.addView(refreshSelfCheck);
        content.addView(selfCheckCard, cardMargins());

        LinearLayout.LayoutParams scrollParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f);
        root.addView(scrollView, scrollParams);
        return root;
    }

    private TextView createActionButton(String text) {
        TextView button = new TextView(this);
        button.setText(text);
        button.setTextColor(COLOR_PRIMARY);
        button.setTextSize(14);
        button.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        button.setGravity(Gravity.CENTER);
        GradientDrawable background = new GradientDrawable();
        background.setColor(COLOR_ACCENT);
        background.setCornerRadius(dp(8));
        button.setBackground(background);
        return button;
    }

    private TextView createPlainActionRow(String text) {
        TextView action = new TextView(this);
        action.setText(text);
        action.setTextColor(COLOR_PRIMARY);
        action.setTextSize(14);
        action.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        action.setGravity(Gravity.CENTER);
        action.setPadding(dp(16), dp(12), dp(16), dp(12));
        action.setMinimumHeight(dp(48));
        return action;
    }

    @SuppressWarnings("deprecation")
    private void refreshSelfCheck() {
        if (selfCheckStatus == null) {
            return;
        }
        VersionIdentity installed = getInstalledTargetVersion();
        if (installed.code <= 0L) {
            selfCheckStatus.setText("Hook 状态  未安装小黑盒\n模块版本  "
                    + Config.MODULE_VERSION);
            return;
        }
        selfCheckStatus.setText("Hook 状态  正在实时检测…\n模块版本  "
                + Config.MODULE_VERSION + "\n目标版本  " + installed.name
                + " (" + installed.code + ")");
        try {
            Intent request = new Intent(Config.ACTION_SELF_CHECK);
            request.setPackage(Config.TARGET_PACKAGE);
            sendOrderedBroadcast(request, null, new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    if (isFinishing() || isDestroyed() || selfCheckStatus == null) {
                        return;
                    }
                    Bundle result = getResultExtras(false);
                    String reportedModule = result == null ? ""
                            : result.getString("module_version", "");
                    String reportedTarget = result == null ? ""
                            : result.getString("target_version", "");
                    String process = result == null ? ""
                            : result.getString("process", "");
                    String groups = result == null ? ""
                            : result.getString("groups", "");
                    String enabled = result == null ? ""
                            : result.getString("enabled", "");
                    boolean current = getResultCode() == Activity.RESULT_OK
                            && Config.MODULE_VERSION.equals(reportedModule);
                    String status = current ? "Hook 已注入且响应正常"
                            : "未收到当前版本 Hook 响应";
                    String time = DateFormat.getTimeInstance(
                            DateFormat.MEDIUM, Locale.getDefault())
                            .format(new Date());
                    selfCheckStatus.setText("Hook 状态  " + status
                            + "\n模块版本  " + Config.MODULE_VERSION
                            + (reportedModule.isEmpty()
                            ? "" : "（响应 " + reportedModule + "）")
                            + "\n目标版本  " + installed.name + " (" + installed.code + ")"
                            + (reportedTarget.isEmpty()
                            ? "" : "\n进程读取版本  " + reportedTarget)
                            + "\n目标进程  " + (process.isEmpty() ? "未响应" : process)
                            + "\n检测时间  " + time
                            + "\n已安装组  " + (groups.isEmpty() ? "无" : groups)
                            + "\n已启用功能  " + (enabled.isEmpty() ? "无" : enabled));
                }
            }, null, Activity.RESULT_CANCELED, null, null);
        } catch (Throwable throwable) {
            selfCheckStatus.setText("Hook 状态  无法读取自检数据\n模块版本  "
                    + Config.MODULE_VERSION + "\n目标版本  " + installed.name
                    + " (" + installed.code + ")\n原因  "
                    + throwable.getClass().getSimpleName());
        }
    }

    /** 目标 APK 没有可见的“检查更新”按钮时，用其内部更新管理器做一次诊断请求。 */
    private void requestTargetVersionCheck() {
        if (!preferences.getBoolean(Config.KEY_SPOOF_VERSION, false)) {
            Toast.makeText(this,
                    "请先开启“伪装应用版本”并重启小黑盒，再运行检测",
                    Toast.LENGTH_LONG).show();
            return;
        }
        try {
            // MainActivity 在目标 APK 清单中未导出，跨应用显式启动会触发
            // SecurityException。使用目标应用真正导出的 Launcher/SplashActivity，
            // 再把诊断 URI 交给 SplashActivity -> MainActivity 的原启动链路。
            Intent intent = getPackageManager().getLaunchIntentForPackage(
                    Config.TARGET_PACKAGE);
            if (intent == null) {
                throw new IllegalStateException("未找到小黑盒启动入口");
            }
            intent.setData(android.net.Uri.parse(Config.URI_REQUEST_VERSION_CHECK));
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION
                    | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            Toast.makeText(this, "正在检查小黑盒版本，结果会直接显示在小黑盒内",
                    Toast.LENGTH_SHORT).show();
        } catch (Throwable throwable) {
            Toast.makeText(this, "请求失败：" + throwable.getClass().getSimpleName(),
                    Toast.LENGTH_LONG).show();
        }
    }

    private void fetchLatestVersion(TextView button) {
        new Thread(() -> {
            String version = "";
            long versionCode = 0L;
            String error = "";
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) new URL(VERSION_SOURCE_URL).openConnection();
                versionConnection = connection;
                connection.setConnectTimeout(8000);
                connection.setReadTimeout(8000);
                connection.setInstanceFollowRedirects(true);
                connection.setRequestProperty("User-Agent",
                        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
                                + "AppleWebKit/537.36 Chrome/126 Safari/537.36");
                connection.setRequestProperty("Accept", "application/json");
                int status = connection.getResponseCode();
                if (status < 200 || status >= 300) {
                    throw new IllegalStateException("HTTP " + status);
                }
                String json = readUtf8(connection.getInputStream());
                Matcher nameMatcher = VERSION_NAME_PATTERN.matcher(json);
                if (nameMatcher.find()) {
                    version = nameMatcher.group(1).trim();
                }
                if (!isPlausibleVersion(version)) {
                    throw new IllegalStateException("接口未返回 versionName");
                }
                Matcher codeMatcher = VERSION_CODE_PATTERN.matcher(json);
                if (codeMatcher.find()) {
                    versionCode = parseLong(codeMatcher.group(1));
                }
                if (!isPlausibleVersionCode(versionCode)) {
                    throw new IllegalStateException("接口未返回 versionCode");
                }
            } catch (Throwable throwable) {
                error = throwable.getMessage() == null
                        ? throwable.getClass().getSimpleName() : throwable.getMessage();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                if (versionConnection == connection) {
                    versionConnection = null;
                }
            }

            String latest = version;
            long latestCode = versionCode;
            String failure = error;
            runOnUiThread(() -> {
                if (isFinishing() || isDestroyed()) {
                    return;
                }
                button.setEnabled(true);
                button.setText("获取小黑盒最新版本");
                if (!isPlausibleVersion(latest) || !isPlausibleVersionCode(latestCode)) {
                    Toast.makeText(this, "获取失败：" + failure,
                            Toast.LENGTH_LONG).show();
                    return;
                }
                VersionIdentity installed = getInstalledTargetVersion();
                if ((isPlausibleVersion(installed.name)
                        && compareVersions(latest, installed.name) < 0)
                        || (installed.code > 0L && latestCode < installed.code)) {
                    Toast.makeText(this,
                            "数据源版本名称或编号低于已安装版本，未写入",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                preferences.edit()
                        .putString(Config.KEY_LATEST_VERSION, latest)
                        .putLong(Config.KEY_LATEST_VERSION_CODE, latestCode)
                        .apply();
                refreshVersionArea();
                Toast.makeText(this,
                        "已获取最新版本 " + latest + " (" + latestCode
                                + ")，重启小黑盒后生效",
                        Toast.LENGTH_LONG).show();
            });
        }, "HeyBoxVersionFetch").start();
    }

    private static String readUtf8(InputStream inputStream) throws Exception {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                inputStream, StandardCharsets.UTF_8))) {
            char[] buffer = new char[8192];
            int count;
            while ((count = reader.read(buffer)) >= 0) {
                result.append(buffer, 0, count);
                if (result.length() > 2_000_000) {
                    break;
                }
            }
        }
        return result.toString();
    }

    private View createTitleBar() {
        FrameLayout bar = new FrameLayout(this);
        bar.setBackgroundColor(Color.WHITE);

        TextView back = new TextView(this);
        back.setText("‹");
        back.setTextSize(40);
        back.setTextColor(COLOR_PRIMARY);
        back.setGravity(Gravity.CENTER);
        back.setContentDescription("返回");
        back.setOnClickListener(view -> finish());
        FrameLayout.LayoutParams backParams = new FrameLayout.LayoutParams(dp(52), dp(56));
        backParams.gravity = Gravity.START | Gravity.CENTER_VERTICAL;
        bar.addView(back, backParams);

        TextView title = new TextView(this);
        title.setText("小黑盒净化");
        title.setTextColor(COLOR_PRIMARY);
        title.setTextSize(18);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        FrameLayout.LayoutParams titleParams = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        titleParams.gravity = Gravity.CENTER;
        bar.addView(title, titleParams);
        return bar;
    }

    private void addSectionLabel(String label) {
        TextView view = new TextView(this);
        view.setText(label);
        view.setTextColor(COLOR_SECONDARY);
        view.setTextSize(13);
        view.setPadding(dp(10), dp(16), 0, dp(8));
        content.addView(view, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    private LinearLayout createCard() {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        GradientDrawable background = new GradientDrawable();
        background.setColor(COLOR_CARD);
        background.setCornerRadius(dp(10));
        card.setBackground(background);
        card.setClipToOutline(true);
        return card;
    }

    @SuppressWarnings("deprecation")
    private View createSwitchRow(String title, String subtitle, String key,
                                 boolean defaultValue) {
        LinearLayout row = createBaseRow();
        LinearLayout textColumn = createTextColumn(title, subtitle);
        row.addView(textColumn, new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

        Switch toggle = new Switch(this);
        toggle.setChecked(preferences.getBoolean(key, defaultValue));
        toggle.setButtonTintList(null);
        toggle.setTrackTintList(new android.content.res.ColorStateList(
                new int[][]{new int[]{android.R.attr.state_checked}, new int[]{}},
                new int[]{withAlpha(COLOR_ACCENT, 120), Color.rgb(211, 213, 218)}));
        toggle.setThumbTintList(new android.content.res.ColorStateList(
                new int[][]{new int[]{android.R.attr.state_checked}, new int[]{}},
                new int[]{COLOR_ACCENT, Color.WHITE}));
        toggle.setOnCheckedChangeListener((button, checked) ->
                preferences.edit().putBoolean(key, checked).apply());
        row.setOnClickListener(view -> toggle.setChecked(!toggle.isChecked()));
        row.addView(toggle, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return row;
    }

    private View createVersionModeRow() {
        LinearLayout row = createBaseRow();
        row.setClickable(true);
        row.setFocusable(true);

        LinearLayout textColumn = createTextColumn(
                "伪装方式", "自动或手动指定 versionName / versionCode");
        row.addView(textColumn, new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

        versionModeValue = new TextView(this);
        versionModeValue.setTextColor(COLOR_SECONDARY);
        versionModeValue.setTextSize(14);
        versionModeValue.setGravity(Gravity.CENTER_VERTICAL | Gravity.END);
        row.addView(versionModeValue, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, dp(52)));

        TextView arrow = new TextView(this);
        arrow.setText("  ›");
        arrow.setTextColor(Color.rgb(188, 190, 196));
        arrow.setTextSize(26);
        arrow.setGravity(Gravity.CENTER);
        row.addView(arrow, new LinearLayout.LayoutParams(dp(22), dp(52)));
        row.setOnClickListener(view -> showVersionModeDialog());
        return row;
    }

    private View createCustomVersionRow() {
        customVersionRow = new LinearLayout(this);
        customVersionRow.setOrientation(LinearLayout.VERTICAL);
        customVersionRow.setPadding(dp(16), dp(6), dp(16), dp(16));

        View divider = createDivider();
        customVersionRow.addView(divider);

        TextView label = new TextView(this);
        label.setText("自定义版本标识");
        label.setTextColor(COLOR_PRIMARY);
        label.setTextSize(14);
        LinearLayout.LayoutParams labelParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        labelParams.topMargin = dp(12);
        customVersionRow.addView(label, labelParams);

        TextView nameHint = createInputLabel("versionName");
        customVersionRow.addView(nameHint);

        LinearLayout inputLine = new LinearLayout(this);
        inputLine.setGravity(Gravity.CENTER_VERTICAL);
        customVersionInput = new EditText(this);
        customVersionInput.setSingleLine(true);
        customVersionInput.setTextSize(15);
        customVersionInput.setTextColor(COLOR_PRIMARY);
        customVersionInput.setHint("例如 1.3.999");
        customVersionInput.setInputType(InputType.TYPE_CLASS_TEXT);
        customVersionInput.setText(preferences.getString(Config.KEY_CUSTOM_VERSION, ""));
        inputLine.addView(customVersionInput, new LinearLayout.LayoutParams(0, dp(48), 1f));

        customVersionRow.addView(inputLine, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView codeHint = createInputLabel("versionCode");
        customVersionRow.addView(codeHint);
        LinearLayout codeLine = new LinearLayout(this);
        codeLine.setGravity(Gravity.CENTER_VERTICAL);
        customVersionCodeInput = new EditText(this);
        customVersionCodeInput.setSingleLine(true);
        customVersionCodeInput.setTextSize(15);
        customVersionCodeInput.setTextColor(COLOR_PRIMARY);
        customVersionCodeInput.setHint("例如 916");
        customVersionCodeInput.setInputType(InputType.TYPE_CLASS_NUMBER);
        long storedCode = preferences.getLong(Config.KEY_CUSTOM_VERSION_CODE, 0L);
        customVersionCodeInput.setText(storedCode > 0L ? String.valueOf(storedCode) : "");
        codeLine.addView(customVersionCodeInput,
                new LinearLayout.LayoutParams(0, dp(48), 1f));

        TextView save = new TextView(this);
        save.setText("保存");
        save.setTextColor(COLOR_PRIMARY);
        save.setTextSize(14);
        save.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        save.setGravity(Gravity.CENTER);
        GradientDrawable saveBackground = new GradientDrawable();
        saveBackground.setColor(COLOR_ACCENT);
        saveBackground.setCornerRadius(dp(7));
        save.setBackground(saveBackground);
        save.setOnClickListener(view -> saveCustomVersion());
        LinearLayout.LayoutParams saveParams = new LinearLayout.LayoutParams(dp(62), dp(36));
        saveParams.leftMargin = dp(12);
        codeLine.addView(save, saveParams);
        customVersionRow.addView(codeLine, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return customVersionRow;
    }

    private TextView createInputLabel(String text) {
        TextView label = new TextView(this);
        label.setText(text);
        label.setTextColor(COLOR_SECONDARY);
        label.setTextSize(12);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = dp(6);
        label.setLayoutParams(params);
        return label;
    }

    private TextView createInfoRow(String title, String value) {
        TextView view = new TextView(this);
        view.setTextColor(COLOR_SECONDARY);
        view.setTextSize(13);
        view.setGravity(Gravity.CENTER_VERTICAL);
        view.setPadding(dp(16), dp(12), dp(16), dp(12));
        view.setText(title + "  " + value);
        return view;
    }

    private LinearLayout createBaseRow() {
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(dp(16), dp(9), dp(12), dp(9));
        row.setMinimumHeight(dp(70));
        return row;
    }

    private LinearLayout createTextColumn(String title, String subtitle) {
        LinearLayout column = new LinearLayout(this);
        column.setOrientation(LinearLayout.VERTICAL);
        column.setGravity(Gravity.CENTER_VERTICAL);

        TextView titleView = new TextView(this);
        titleView.setText(title);
        titleView.setTextColor(COLOR_PRIMARY);
        titleView.setTextSize(16);
        column.addView(titleView);

        TextView subtitleView = new TextView(this);
        subtitleView.setText(subtitle);
        subtitleView.setTextColor(COLOR_SECONDARY);
        subtitleView.setTextSize(12);
        LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        subtitleParams.topMargin = dp(3);
        column.addView(subtitleView, subtitleParams);
        return column;
    }

    private View createDivider() {
        View divider = new View(this);
        divider.setBackgroundColor(COLOR_DIVIDER);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(1));
        params.leftMargin = dp(16);
        divider.setLayoutParams(params);
        return divider;
    }

    private LinearLayout.LayoutParams cardMargins() {
        return new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    private void showVersionModeDialog() {
        String current = preferences.getString(
                Config.KEY_VERSION_MODE, Config.VERSION_MODE_AUTO);
        int checked = Config.VERSION_MODE_CUSTOM.equals(current) ? 1 : 0;
        String[] choices = {"自动跟随应用商店最新版本（推荐）", "自定义两个版本标识"};
        new AlertDialog.Builder(this)
                .setTitle("选择伪装方式")
                .setSingleChoiceItems(choices, checked, (dialog, which) -> {
                    String mode = which == 1
                            ? Config.VERSION_MODE_CUSTOM : Config.VERSION_MODE_AUTO;
                    preferences.edit().putString(Config.KEY_VERSION_MODE, mode).apply();
                    dialog.dismiss();
                    refreshVersionArea();
                })
                .setNegativeButton("取消", null)
                .show();
    }

    private void saveCustomVersion() {
        String value = customVersionInput.getText().toString().trim();
        long versionCode = parseLong(customVersionCodeInput.getText().toString().trim());
        if (!isPlausibleVersion(value)) {
            Toast.makeText(this, "请输入有效的 versionName", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!isPlausibleVersionCode(versionCode)) {
            Toast.makeText(this, "请输入有效的 versionCode", Toast.LENGTH_SHORT).show();
            return;
        }
        preferences.edit()
                .putString(Config.KEY_CUSTOM_VERSION, value)
                .putLong(Config.KEY_CUSTOM_VERSION_CODE, versionCode)
                .apply();
        customVersionInput.clearFocus();
        customVersionCodeInput.clearFocus();
        Toast.makeText(this, "已保存，重启小黑盒后生效", Toast.LENGTH_SHORT).show();
        refreshVersionArea();
    }

    private void refreshVersionArea() {
        String mode = preferences.getString(
                Config.KEY_VERSION_MODE, Config.VERSION_MODE_AUTO);
        boolean custom = Config.VERSION_MODE_CUSTOM.equals(mode);
        versionModeValue.setText(custom ? "自定义" : "自动");
        customVersionRow.setVisibility(custom ? View.VISIBLE : View.GONE);

        VersionIdentity installed = getInstalledTargetVersion();
        String cached = preferences.getString(Config.KEY_LATEST_VERSION, "").trim();
        long cachedCode = preferences.getLong(Config.KEY_LATEST_VERSION_CODE, 0L);
        String customVersion = preferences.getString(Config.KEY_CUSTOM_VERSION, "").trim();
        long customVersionCode = preferences.getLong(Config.KEY_CUSTOM_VERSION_CODE, 0L);
        String target;
        if (custom) {
            target = customVersion.isEmpty() || !isPlausibleVersionCode(customVersionCode)
                    ? "尚未完整设置" : customVersion + " (" + customVersionCode + ")";
        } else {
            target = cached.isEmpty() || !isPlausibleVersionCode(cachedCode)
                    ? "等待获取" : cached + " (" + cachedCode + ")";
        }
        versionStatus.setText(String.format(Locale.ROOT,
                "当前目标  %s\n已安装  %s (%d)",
                target, installed.name, installed.code));
    }

    @SuppressWarnings("deprecation")
    private VersionIdentity getInstalledTargetVersion() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(
                    Config.TARGET_PACKAGE, 0);
            long versionCode = Build.VERSION.SDK_INT >= 28
                    ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            return new VersionIdentity(
                    packageInfo.versionName == null ? "未知" : packageInfo.versionName,
                    versionCode);
        } catch (Throwable ignored) {
            return new VersionIdentity("未安装", 0L);
        }
    }

    private static final class VersionIdentity {
        final String name;
        final long code;

        VersionIdentity(String name, long code) {
            this.name = name;
            this.code = code;
        }
    }

    private static boolean isPlausibleVersion(String value) {
        return value != null && !value.isEmpty() && value.length() <= 64
                && value.matches("[0-9A-Za-z._+\\-]+");
    }

    private static boolean isPlausibleVersionCode(long value) {
        return value > 0L && value <= 0x00000000ffffffffL;
    }

    private static int compareVersions(String left, String right) {
        String[] leftParts = left.split("\\.");
        String[] rightParts = right.split("\\.");
        int count = Math.max(leftParts.length, rightParts.length);
        for (int index = 0; index < count; index++) {
            long leftValue = index < leftParts.length ? parseLong(leftParts[index]) : 0L;
            long rightValue = index < rightParts.length ? parseLong(rightParts[index]) : 0L;
            if (leftValue != rightValue) {
                return Long.compare(leftValue, rightValue);
            }
        }
        return 0;
    }

    private static long parseLong(String value) {
        try {
            return Long.parseLong(value);
        } catch (Throwable ignored) {
            return 0L;
        }
    }

    private static int withAlpha(int color, int alpha) {
        return Color.argb(alpha, Color.red(color), Color.green(color), Color.blue(color));
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }
}
