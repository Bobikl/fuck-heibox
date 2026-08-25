package dev.heybox.hook;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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

/**
 * 直接运行在小黑盒进程中的全屏设置页。
 *
 * <p>它不是模块 APK 的 Activity，不发生跨包跳转，也不会启动模块应用进程。
 * 页面只在用户点击设置入口后构建，关闭后不注册监听器或后台任务。</p>
 */
final class HostSettingsDialog extends Dialog {
    interface RuntimeBridge {
        String getSelfCheckReport();

        void requestVersionCheck();
    }

    private interface ToggleChangeListener {
        void onChanged(boolean checked);
    }

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

    private final Activity host;
    private final SharedPreferences preferences;
    private final RuntimeBridge runtimeBridge;
    private LinearLayout content;
    private TextView versionModeValue;
    private TextView versionStatus;
    private TextView selfCheckStatus;
    private TextView adCleanValue;
    private View imageAdaptiveContainer;
    private LinearLayout customVersionRow;
    private EditText customVersionInput;
    private EditText customVersionCodeInput;
    private volatile HttpURLConnection versionConnection;
    private boolean adPage;

    HostSettingsDialog(Activity host, SharedPreferences preferences,
                       RuntimeBridge runtimeBridge) {
        super(host, android.R.style.Theme_Material_Light_NoActionBar);
        this.host = host;
        this.preferences = preferences;
        this.runtimeBridge = runtimeBridge;
        setOwnerActivity(host);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureWindow();
        showMainPage();
    }

    @Override
    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(
                    WindowManager.LayoutParams.MATCH_PARENT,
                    WindowManager.LayoutParams.MATCH_PARENT);
        }
    }

    @Override
    public void onBackPressed() {
        if (adPage) {
            showMainPage();
        } else {
            dismiss();
        }
    }

    @Override
    public void dismiss() {
        HttpURLConnection connection = versionConnection;
        versionConnection = null;
        if (connection != null) {
            connection.disconnect();
        }
        super.dismiss();
    }

    private void configureWindow() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND
                | WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(Color.WHITE);
        window.setNavigationBarColor(Color.WHITE);
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        }
        window.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                        | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    }

    private void showMainPage() {
        adPage = false;
        resetPageReferences();
        setContentView(createMainPage());
        refreshVersionArea();
        refreshAdCleanValue();
        refreshSelfCheck();
    }

    private void resetPageReferences() {
        content = null;
        versionModeValue = null;
        versionStatus = null;
        selfCheckStatus = null;
        adCleanValue = null;
        imageAdaptiveContainer = null;
        customVersionRow = null;
        customVersionInput = null;
        customVersionCodeInput = null;
    }

    private View createMainPage() {
        LinearLayout root = createInsetRoot();
        root.addView(createTitleBar("小黑盒净化", this::dismiss),
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, dp(56)));

        ScrollView scrollView = new ScrollView(host);
        scrollView.setFillViewport(true);
        scrollView.setClipToPadding(false);
        content = new LinearLayout(host);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(dp(14), dp(8), dp(14), dp(32));
        scrollView.addView(content, new ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        addSectionLabel("净化功能");
        LinearLayout cleanCard = createCard();
        cleanCard.addView(createSwitchRow(
                "隐藏首页发布按钮", "移除底部导航栏中间的发布入口",
                Config.KEY_HIDE_PUBLISH, false));
        cleanCard.addView(createDivider());
        cleanCard.addView(createAdCleanRow());
        cleanCard.addView(createDivider());
        cleanCard.addView(createSwitchRow(
                "跳过开屏广告", "独立于全局净化；保留启动流程并跳过广告素材",
                Config.KEY_SKIP_SPLASH_AD, false));
        cleanCard.addView(createDivider());
        cleanCard.addView(createSwitchRow(
                "禁止读取剪贴板口令", "阻止小黑盒启动或回前台时扫描剪贴板",
                Config.KEY_DISABLE_CLIPBOARD_TOKEN, false));
        content.addView(cleanCard, cardMargins());

        addSectionLabel("任务功能");
        LinearLayout taskCard = createCard();
        taskCard.addView(createSwitchRow(
                "自动完成分享任务", "点击“去完成”后直接上报分享成功",
                Config.KEY_SHARE_TASK, false));
        taskCard.addView(createDivider());
        taskCard.addView(createSwitchRow(
                "首次启动自动完成分享任务", "每天每个账号只执行一次；需同时开启上一项",
                Config.KEY_DAILY_SHARE_TASK, false));
        content.addView(taskCard, cardMargins());

        addSectionLabel("浏览、阅读与媒体");
        LinearLayout experienceCard = createCard();
        experienceCard.addView(createSwitchRow(
                "使用外部浏览器打开链接", "普通 http/https 链接交给外部浏览器",
                Config.KEY_EXTERNAL_BROWSER, false));
        experienceCard.addView(createDivider());
        experienceCard.addView(createSwitchRow(
                "强制开启帖子正文文字选择", "只作用于帖子正文渲染器",
                Config.KEY_POST_TEXT_SELECT, false));
        experienceCard.addView(createDivider());
        experienceCard.addView(createSwitchRow(
                "禁止视频/GIF 自动播放", "视频保留手动播放；GIF 默认显示静态首帧",
                Config.KEY_DISABLE_MEDIA_AUTOPLAY, false));
        experienceCard.addView(createDivider());
        experienceCard.addView(createSwitchRow(
                "回前台不自动刷新", "保留签到同步，仅阻止首页超时整页刷新",
                Config.KEY_NO_FOREGROUND_REFRESH, false));
        experienceCard.addView(createDivider());
        experienceCard.addView(createSwitchRow(
                "图片查看器自动加载原图", "进入图片查看器后自动请求服务器原图",
                Config.KEY_IMAGE_ENHANCE, false, checked -> {
                    if (imageAdaptiveContainer != null) {
                        imageAdaptiveContainer.setVisibility(
                                checked ? View.VISIBLE : View.GONE);
                    }
                }));
        LinearLayout adaptiveContainer = new LinearLayout(host);
        adaptiveContainer.setOrientation(LinearLayout.VERTICAL);
        adaptiveContainer.addView(createDivider());
        adaptiveContainer.addView(createSwitchRow(
                "根据网络自适应查看原图", "Wi-Fi自动加载；移动网络保持普通图片",
                Config.KEY_IMAGE_WIFI_ADAPTIVE, false));
        imageAdaptiveContainer = adaptiveContainer;
        adaptiveContainer.setVisibility(preferences.getBoolean(
                Config.KEY_IMAGE_ENHANCE, false) ? View.VISIBLE : View.GONE);
        experienceCard.addView(adaptiveContainer);
        content.addView(experienceCard, cardMargins());

        addSectionLabel("版本兼容");
        LinearLayout versionCard = createCard();
        versionCard.addView(createSwitchRow(
                "伪装应用版本", "覆盖小黑盒读取的 versionName 与 versionCode",
                Config.KEY_SPOOF_VERSION, false));
        versionCard.addView(createDivider());
        versionCard.addView(createSwitchRow(
                "屏蔽版本更新弹窗", "不显示服务器要求升级时的提示",
                Config.KEY_SUPPRESS_UPDATE_PROMPT, false));
        versionCard.addView(createDivider());
        versionCard.addView(createVersionModeRow());
        versionCard.addView(createDivider());
        versionStatus = createInfoRow("当前目标", "");
        versionCard.addView(versionStatus);
        versionCard.addView(createCustomVersionRow());
        content.addView(versionCard, cardMargins());

        TextView note = new TextView(host);
        note.setText("设置直接保存在小黑盒进程中。全部功能默认关闭；修改后请彻底重启小黑盒，关闭的功能不会安装对应 Hook。");
        note.setTextColor(COLOR_SECONDARY);
        note.setTextSize(12);
        note.setLineSpacing(dp(2), 1f);
        LinearLayout.LayoutParams noteParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        noteParams.setMargins(dp(12), dp(10), dp(12), 0);
        content.addView(note, noteParams);

        TextView fetchVersion = createActionButton("获取小黑盒最新版本");
        fetchVersion.setOnClickListener(view -> {
            fetchVersion.setEnabled(false);
            fetchVersion.setText("正在获取…");
            fetchLatestVersion(fetchVersion);
        });
        LinearLayout.LayoutParams fetchParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(44));
        fetchParams.setMargins(dp(12), dp(18), dp(12), 0);
        content.addView(fetchVersion, fetchParams);

        TextView testVersion = createPlainActionRow("在小黑盒内测试版本检测");
        testVersion.setTextColor(COLOR_SECONDARY);
        testVersion.setOnClickListener(view -> runtimeBridge.requestVersionCheck());
        LinearLayout.LayoutParams testParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(42));
        testParams.setMargins(dp(12), dp(2), dp(12), 0);
        content.addView(testVersion, testParams);

        addSectionLabel("模块自检");
        LinearLayout selfCheckCard = createCard();
        selfCheckStatus = createInfoRow("Hook 状态", "正在读取…");
        selfCheckStatus.setLineSpacing(dp(2), 1f);
        selfCheckCard.addView(selfCheckStatus);
        selfCheckCard.addView(createDivider());
        TextView refresh = createPlainActionRow("刷新自检结果");
        refresh.setOnClickListener(view -> refreshSelfCheck());
        selfCheckCard.addView(refresh);
        content.addView(selfCheckCard, cardMargins());

        root.addView(scrollView, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        return root;
    }

    private LinearLayout createInsetRoot() {
        LinearLayout root = new LinearLayout(host);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(COLOR_BACKGROUND);
        root.setOnApplyWindowInsetsListener((view, insets) -> {
            int top = insets.getSystemWindowInsetTop();
            if (Build.VERSION.SDK_INT >= 28 && insets.getDisplayCutout() != null) {
                top = Math.max(top, insets.getDisplayCutout().getSafeInsetTop());
            }
            int left = insets.getSystemWindowInsetLeft();
            int right = insets.getSystemWindowInsetRight();
            int bottom = insets.getSystemWindowInsetBottom();
            if (view.getPaddingLeft() != left || view.getPaddingTop() != top
                    || view.getPaddingRight() != right
                    || view.getPaddingBottom() != bottom) {
                view.setPadding(left, top, right, bottom);
            }
            return insets;
        });
        return root;
    }

    private View createAdCleanRow() {
        LinearLayout row = createBaseRow();
        LinearLayout column = createTextColumn(
                "全局广告净化", "进入二级页面选择需要净化的广告类型");
        row.addView(column, new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        adCleanValue = new TextView(host);
        adCleanValue.setTextColor(COLOR_SECONDARY);
        adCleanValue.setTextSize(13);
        adCleanValue.setGravity(Gravity.CENTER_VERTICAL | Gravity.END);
        row.addView(adCleanValue, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, dp(52)));
        TextView arrow = createArrow();
        row.addView(arrow, new LinearLayout.LayoutParams(dp(22), dp(52)));
        row.setOnClickListener(view -> showAdPage());
        return row;
    }

    private void showAdPage() {
        adPage = true;
        LinearLayout root = createInsetRoot();
        root.addView(createTitleBar("广告净化", this::showMainPage),
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, dp(56)));
        ScrollView scrollView = new ScrollView(host);
        scrollView.setFillViewport(true);
        LinearLayout page = new LinearLayout(host);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(dp(14), dp(8), dp(14), dp(32));
        scrollView.addView(page, new ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        page.addView(createSectionLabelView("总开关"));
        LinearLayout masterCard = createCard();
        LinearLayout children = new LinearLayout(host);
        children.setOrientation(LinearLayout.VERTICAL);
        masterCard.addView(createSwitchRow(
                "开启净化", "只安装下方选中项目的 Hook，开屏广告使用独立开关",
                Config.KEY_GLOBAL_AD_CLEAN, false,
                checked -> children.setVisibility(
                        checked ? View.VISIBLE : View.GONE)));
        page.addView(masterCard, cardMargins());

        children.addView(createSectionLabelView("净化项目"));
        LinearLayout childCard = createCard();
        childCard.addView(createSwitchRow(
                "信息流广告对象", "过滤推荐、关注、话题和合集列表中的广告内容",
                Config.KEY_AD_CLEAN_FEED, true));
        childCard.addView(createDivider());
        childCard.addView(createSwitchRow(
                "首页气泡、角标、页内广告", "移除首页气泡、角标和页内弹层广告",
                Config.KEY_AD_CLEAN_HOME, true));
        childCard.addView(createDivider());
        childCard.addView(createSwitchRow(
                "BBS/话题/签到/游戏/商城等广告横幅", "移除上述页面和交易页面广告横幅",
                Config.KEY_AD_CLEAN_BANNERS, true));
        childCard.addView(createDivider());
        childCard.addView(createSwitchRow(
                "商城底栏广告", "移除商城页面底部浮动广告栏",
                Config.KEY_AD_CLEAN_MALL_BOTTOM, true));
        children.addView(childCard, cardMargins());
        TextView adNote = new TextView(host);
        adNote.setText("总开关关闭时不会安装广告净化 Hook；子项选择会保留。更改后请重启小黑盒。");
        adNote.setTextColor(COLOR_SECONDARY);
        adNote.setTextSize(12);
        adNote.setPadding(dp(12), dp(10), dp(12), 0);
        children.addView(adNote);
        children.setVisibility(preferences.getBoolean(
                Config.KEY_GLOBAL_AD_CLEAN, false) ? View.VISIBLE : View.GONE);
        page.addView(children);
        root.addView(scrollView, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        setContentView(root);
    }

    private void refreshAdCleanValue() {
        if (adCleanValue == null) {
            return;
        }
        if (!preferences.getBoolean(Config.KEY_GLOBAL_AD_CLEAN, false)) {
            adCleanValue.setText("未开启");
            return;
        }
        int enabled = 0;
        enabled += preferences.getBoolean(Config.KEY_AD_CLEAN_FEED, true) ? 1 : 0;
        enabled += preferences.getBoolean(Config.KEY_AD_CLEAN_HOME, true) ? 1 : 0;
        enabled += preferences.getBoolean(Config.KEY_AD_CLEAN_BANNERS, true) ? 1 : 0;
        enabled += preferences.getBoolean(
                Config.KEY_AD_CLEAN_MALL_BOTTOM, true) ? 1 : 0;
        adCleanValue.setText("已开启 · " + enabled + "项");
    }

    private void refreshSelfCheck() {
        if (selfCheckStatus == null) {
            return;
        }
        try {
            String time = DateFormat.getTimeInstance(
                    DateFormat.MEDIUM, Locale.getDefault()).format(new Date());
            selfCheckStatus.setText(runtimeBridge.getSelfCheckReport()
                    + "\n检测时间  " + time);
        } catch (Throwable throwable) {
            selfCheckStatus.setText("Hook 状态  自检读取失败\n原因  "
                    + throwable.getClass().getSimpleName());
        }
    }

    private View createVersionModeRow() {
        LinearLayout row = createBaseRow();
        row.addView(createTextColumn(
                        "伪装方式", "自动或手动指定 versionName / versionCode"),
                new LinearLayout.LayoutParams(
                        0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        versionModeValue = new TextView(host);
        versionModeValue.setTextColor(COLOR_SECONDARY);
        versionModeValue.setTextSize(14);
        versionModeValue.setGravity(Gravity.CENTER_VERTICAL | Gravity.END);
        row.addView(versionModeValue, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, dp(52)));
        row.addView(createArrow(), new LinearLayout.LayoutParams(dp(22), dp(52)));
        row.setOnClickListener(view -> showVersionModeDialog());
        return row;
    }

    private View createCustomVersionRow() {
        customVersionRow = new LinearLayout(host);
        customVersionRow.setOrientation(LinearLayout.VERTICAL);
        customVersionRow.setPadding(dp(16), dp(6), dp(16), dp(16));
        customVersionRow.addView(createDivider());

        TextView label = new TextView(host);
        label.setText("自定义版本标识");
        label.setTextColor(COLOR_PRIMARY);
        label.setTextSize(14);
        LinearLayout.LayoutParams labelParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        labelParams.topMargin = dp(12);
        customVersionRow.addView(label, labelParams);
        customVersionRow.addView(createInputLabel("versionName"));

        customVersionInput = new EditText(host);
        customVersionInput.setSingleLine(true);
        customVersionInput.setTextSize(15);
        customVersionInput.setTextColor(COLOR_PRIMARY);
        customVersionInput.setHint("例如 1.3.999");
        customVersionInput.setInputType(InputType.TYPE_CLASS_TEXT);
        customVersionInput.setText(preferences.getString(
                Config.KEY_CUSTOM_VERSION, ""));
        customVersionRow.addView(customVersionInput,
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, dp(48)));

        customVersionRow.addView(createInputLabel("versionCode"));
        LinearLayout codeLine = new LinearLayout(host);
        codeLine.setGravity(Gravity.CENTER_VERTICAL);
        customVersionCodeInput = new EditText(host);
        customVersionCodeInput.setSingleLine(true);
        customVersionCodeInput.setTextSize(15);
        customVersionCodeInput.setTextColor(COLOR_PRIMARY);
        customVersionCodeInput.setHint("例如 916");
        customVersionCodeInput.setInputType(InputType.TYPE_CLASS_NUMBER);
        long storedCode = preferences.getLong(
                Config.KEY_CUSTOM_VERSION_CODE, 0L);
        customVersionCodeInput.setText(
                storedCode > 0L ? String.valueOf(storedCode) : "");
        codeLine.addView(customVersionCodeInput,
                new LinearLayout.LayoutParams(0, dp(48), 1f));
        TextView save = createActionButton("保存");
        save.setOnClickListener(view -> saveCustomVersion());
        LinearLayout.LayoutParams saveParams = new LinearLayout.LayoutParams(
                dp(62), dp(36));
        saveParams.leftMargin = dp(12);
        codeLine.addView(save, saveParams);
        customVersionRow.addView(codeLine);
        return customVersionRow;
    }

    private void showVersionModeDialog() {
        String current = preferences.getString(
                Config.KEY_VERSION_MODE, Config.VERSION_MODE_AUTO);
        int checked = Config.VERSION_MODE_CUSTOM.equals(current) ? 1 : 0;
        new AlertDialog.Builder(host)
                .setTitle("选择伪装方式")
                .setSingleChoiceItems(new String[]{
                        "自动跟随应用商店最新版本（推荐）",
                        "自定义两个版本标识"
                }, checked, (dialog, which) -> {
                    preferences.edit().putString(
                            Config.KEY_VERSION_MODE,
                            which == 1 ? Config.VERSION_MODE_CUSTOM
                                    : Config.VERSION_MODE_AUTO).apply();
                    dialog.dismiss();
                    refreshVersionArea();
                })
                .setNegativeButton("取消", null)
                .show();
    }

    private void saveCustomVersion() {
        String name = customVersionInput.getText().toString().trim();
        long code = parseLong(customVersionCodeInput.getText().toString().trim());
        if (!isPlausibleVersion(name)) {
            Toast.makeText(host, "请输入有效的 versionName",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        if (!isPlausibleVersionCode(code)) {
            Toast.makeText(host, "请输入有效的 versionCode",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        preferences.edit()
                .putString(Config.KEY_CUSTOM_VERSION, name)
                .putLong(Config.KEY_CUSTOM_VERSION_CODE, code)
                .apply();
        customVersionInput.clearFocus();
        customVersionCodeInput.clearFocus();
        Toast.makeText(host, "已保存，重启小黑盒后生效",
                Toast.LENGTH_SHORT).show();
        refreshVersionArea();
    }

    private void refreshVersionArea() {
        if (versionModeValue == null || versionStatus == null
                || customVersionRow == null) {
            return;
        }
        String mode = preferences.getString(
                Config.KEY_VERSION_MODE, Config.VERSION_MODE_AUTO);
        boolean custom = Config.VERSION_MODE_CUSTOM.equals(mode);
        versionModeValue.setText(custom ? "自定义" : "自动");
        customVersionRow.setVisibility(custom ? View.VISIBLE : View.GONE);
        String cached = preferences.getString(
                Config.KEY_LATEST_VERSION, "").trim();
        long cachedCode = preferences.getLong(
                Config.KEY_LATEST_VERSION_CODE, 0L);
        String customName = preferences.getString(
                Config.KEY_CUSTOM_VERSION, "").trim();
        long customCode = preferences.getLong(
                Config.KEY_CUSTOM_VERSION_CODE, 0L);
        String target = custom
                ? (!isPlausibleVersion(customName) || !isPlausibleVersionCode(customCode)
                ? "尚未完整设置" : customName + " (" + customCode + ")")
                : (!isPlausibleVersion(cached) || !isPlausibleVersionCode(cachedCode)
                ? "等待获取" : cached + " (" + cachedCode + ")");
        versionStatus.setText("当前目标  " + target
                + "\n模块适配基准  1.3.347 (916)");
    }

    private void fetchLatestVersion(TextView button) {
        new Thread(() -> {
            String version = "";
            long versionCode = 0L;
            String error = "";
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) new URL(
                        VERSION_SOURCE_URL).openConnection();
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
                Matcher codeMatcher = VERSION_CODE_PATTERN.matcher(json);
                if (codeMatcher.find()) {
                    versionCode = parseLong(codeMatcher.group(1));
                }
                if (!isPlausibleVersion(version)
                        || !isPlausibleVersionCode(versionCode)) {
                    throw new IllegalStateException("接口未返回完整版本标识");
                }
            } catch (Throwable throwable) {
                error = throwable.getMessage() == null
                        ? throwable.getClass().getSimpleName()
                        : throwable.getMessage();
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
                if (versionConnection == connection) {
                    versionConnection = null;
                }
            }
            String resultName = version;
            long resultCode = versionCode;
            String failure = error;
            host.runOnUiThread(() -> {
                if (!isShowing() || host.isFinishing() || host.isDestroyed()) {
                    return;
                }
                button.setEnabled(true);
                button.setText("获取小黑盒最新版本");
                if (!isPlausibleVersion(resultName)
                        || !isPlausibleVersionCode(resultCode)) {
                    Toast.makeText(host, "获取失败：" + failure,
                            Toast.LENGTH_LONG).show();
                    return;
                }
                if (compareVersions(resultName, "1.3.347") < 0
                        || resultCode < 916L) {
                    Toast.makeText(host, "数据源版本低于模块适配基准，未写入",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                preferences.edit()
                        .putString(Config.KEY_LATEST_VERSION, resultName)
                        .putLong(Config.KEY_LATEST_VERSION_CODE, resultCode)
                        .apply();
                refreshVersionArea();
                Toast.makeText(host,
                        "已获取 " + resultName + " (" + resultCode
                                + ")，重启小黑盒后生效",
                        Toast.LENGTH_LONG).show();
            });
        }, "HeyBoxVersionFetch").start();
    }

    private FrameLayout createTitleBar(String titleText, Runnable backAction) {
        FrameLayout bar = new FrameLayout(host);
        bar.setBackgroundColor(Color.WHITE);
        TextView back = new TextView(host);
        back.setText("‹");
        back.setTextSize(40);
        back.setTextColor(COLOR_PRIMARY);
        back.setGravity(Gravity.CENTER);
        back.setContentDescription("返回");
        back.setOnClickListener(view -> backAction.run());
        FrameLayout.LayoutParams backParams = new FrameLayout.LayoutParams(
                dp(52), dp(56));
        backParams.gravity = Gravity.START | Gravity.CENTER_VERTICAL;
        bar.addView(back, backParams);
        TextView title = new TextView(host);
        title.setText(titleText);
        title.setTextColor(COLOR_PRIMARY);
        title.setTextSize(18);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        FrameLayout.LayoutParams titleParams = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        titleParams.gravity = Gravity.CENTER;
        bar.addView(title, titleParams);
        return bar;
    }

    private void addSectionLabel(String label) {
        content.addView(createSectionLabelView(label));
    }

    private TextView createSectionLabelView(String label) {
        TextView view = new TextView(host);
        view.setText(label);
        view.setTextColor(COLOR_SECONDARY);
        view.setTextSize(13);
        view.setPadding(dp(10), dp(16), 0, dp(8));
        return view;
    }

    private LinearLayout createCard() {
        LinearLayout card = new LinearLayout(host);
        card.setOrientation(LinearLayout.VERTICAL);
        GradientDrawable background = new GradientDrawable();
        background.setColor(COLOR_CARD);
        background.setCornerRadius(dp(10));
        card.setBackground(background);
        card.setClipToOutline(true);
        return card;
    }

    private View createSwitchRow(String title, String subtitle,
                                 String key, boolean defaultValue) {
        return createSwitchRow(title, subtitle, key, defaultValue, null);
    }

    @SuppressWarnings("deprecation")
    private View createSwitchRow(String title, String subtitle,
                                 String key, boolean defaultValue,
                                 ToggleChangeListener listener) {
        LinearLayout row = createBaseRow();
        row.addView(createTextColumn(title, subtitle),
                new LinearLayout.LayoutParams(
                        0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        Switch toggle = new Switch(host);
        toggle.setChecked(preferences.getBoolean(key, defaultValue));
        toggle.setButtonTintList(null);
        toggle.setTrackTintList(new android.content.res.ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_checked}, new int[]{}
                }, new int[]{
                        withAlpha(COLOR_ACCENT, 120), Color.rgb(211, 213, 218)
                }));
        toggle.setThumbTintList(new android.content.res.ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_checked}, new int[]{}
                }, new int[]{COLOR_ACCENT, Color.WHITE}));
        toggle.setOnCheckedChangeListener((button, checked) -> {
            preferences.edit().putBoolean(key, checked).apply();
            if (listener != null) {
                listener.onChanged(checked);
            }
        });
        row.setOnClickListener(view -> toggle.setChecked(!toggle.isChecked()));
        row.addView(toggle, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        return row;
    }

    private LinearLayout createBaseRow() {
        LinearLayout row = new LinearLayout(host);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(dp(16), dp(9), dp(12), dp(9));
        row.setMinimumHeight(dp(70));
        return row;
    }

    private LinearLayout createTextColumn(String title, String subtitle) {
        LinearLayout column = new LinearLayout(host);
        column.setOrientation(LinearLayout.VERTICAL);
        column.setGravity(Gravity.CENTER_VERTICAL);
        TextView titleView = new TextView(host);
        titleView.setText(title);
        titleView.setTextColor(COLOR_PRIMARY);
        titleView.setTextSize(16);
        column.addView(titleView);
        TextView subtitleView = new TextView(host);
        subtitleView.setText(subtitle);
        subtitleView.setTextColor(COLOR_SECONDARY);
        subtitleView.setTextSize(12);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = dp(3);
        column.addView(subtitleView, params);
        return column;
    }

    private View createDivider() {
        View divider = new View(host);
        divider.setBackgroundColor(COLOR_DIVIDER);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(1));
        params.leftMargin = dp(16);
        divider.setLayoutParams(params);
        return divider;
    }

    private TextView createArrow() {
        TextView arrow = new TextView(host);
        arrow.setText("  ›");
        arrow.setTextColor(Color.rgb(188, 190, 196));
        arrow.setTextSize(26);
        arrow.setGravity(Gravity.CENTER);
        return arrow;
    }

    private TextView createActionButton(String text) {
        TextView button = new TextView(host);
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
        TextView action = new TextView(host);
        action.setText(text);
        action.setTextColor(COLOR_PRIMARY);
        action.setTextSize(14);
        action.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        action.setGravity(Gravity.CENTER);
        action.setPadding(dp(16), dp(12), dp(16), dp(12));
        action.setMinimumHeight(dp(48));
        return action;
    }

    private TextView createInfoRow(String title, String value) {
        TextView view = new TextView(host);
        view.setTextColor(COLOR_SECONDARY);
        view.setTextSize(13);
        view.setGravity(Gravity.CENTER_VERTICAL);
        view.setPadding(dp(16), dp(12), dp(16), dp(12));
        view.setText(title + "  " + value);
        return view;
    }

    private TextView createInputLabel(String text) {
        TextView label = new TextView(host);
        label.setText(text);
        label.setTextColor(COLOR_SECONDARY);
        label.setTextSize(12);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = dp(6);
        label.setLayoutParams(params);
        return label;
    }

    private LinearLayout.LayoutParams cardMargins() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.bottomMargin = dp(6);
        return params;
    }

    private int dp(int value) {
        return Math.round(value
                * host.getResources().getDisplayMetrics().density);
    }

    private static int withAlpha(int color, int alpha) {
        return Color.argb(alpha, Color.red(color), Color.green(color), Color.blue(color));
    }

    private static long parseLong(String value) {
        try {
            return Long.parseLong(value);
        } catch (Throwable ignored) {
            return 0L;
        }
    }

    private static boolean isPlausibleVersion(String value) {
        return value != null && !value.isEmpty() && value.length() <= 64
                && value.matches("[0-9A-Za-z._+\\-]+");
    }

    private static boolean isPlausibleVersionCode(long value) {
        return value > 0L && value <= Integer.MAX_VALUE;
    }

    private static int compareVersions(String first, String second) {
        String[] a = first == null ? new String[0] : first.split("\\.");
        String[] b = second == null ? new String[0] : second.split("\\.");
        int count = Math.max(a.length, b.length);
        for (int index = 0; index < count; index++) {
            long left = index < a.length ? numericPrefix(a[index]) : 0L;
            long right = index < b.length ? numericPrefix(b[index]) : 0L;
            if (left != right) {
                return Long.compare(left, right);
            }
        }
        return first.compareTo(second);
    }

    private static long numericPrefix(String value) {
        long result = 0L;
        for (int index = 0; index < value.length(); index++) {
            char current = value.charAt(index);
            if (current < '0' || current > '9') {
                break;
            }
            result = Math.min(Integer.MAX_VALUE,
                    result * 10L + current - '0');
        }
        return result;
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
}
