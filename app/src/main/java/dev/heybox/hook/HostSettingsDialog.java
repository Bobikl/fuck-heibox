package dev.heybox.hook;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;

/**
 * 直接运行在小黑盒进程中的全屏设置页。
 *
 * <p>它不是模块 APK 的 Activity，不发生跨包跳转，也不会启动模块应用进程。
 * 页面只在用户点击设置入口后构建，关闭后不注册监听器或后台任务。</p>
 */
final class HostSettingsDialog extends Dialog {


    private interface ToggleChangeListener {
        void onChanged(boolean checked);
    }

    private static final int COLOR_ACCENT = Color.rgb(247, 193, 35);

    private final Activity host;
    private final SharedPreferences preferences;
    private final SafePreferences safePreferences;
    private final boolean darkMode;
    private final int backgroundColor;
    private final int cardColor;
    private final int primaryColor;
    private final int secondaryColor;
    private final int dividerColor;
    private LinearLayout content;
    private TextView adCleanValue;
    private View imageAdaptiveContainer;
    private boolean adPage;

    HostSettingsDialog(Activity host, SharedPreferences preferences,
                       SafePreferences safePreferences) {
        this(host, preferences, safePreferences, isSystemDarkMode(host));
    }

    private HostSettingsDialog(Activity host, SharedPreferences preferences,
                               SafePreferences safePreferences, boolean darkMode) {
        super(host, darkMode ? android.R.style.Theme_Material_NoActionBar
                : android.R.style.Theme_Material_Light_NoActionBar);
        this.host = host;
        this.preferences = preferences;
        this.safePreferences = safePreferences;
        this.darkMode = darkMode;
        backgroundColor = darkMode ? 0xff121316 : 0xfff5f6f8;
        cardColor = darkMode ? 0xff202126 : Color.WHITE;
        primaryColor = darkMode ? 0xfff0f1f4 : 0xff1c1d21;
        secondaryColor = darkMode ? 0xffb0b4bf : 0xff626772;
        dividerColor = darkMode ? 0xff353740 : 0xffedeef1;
        migrateMediaAutoplayPreference();
        setOwnerActivity(host);
    }

    private static boolean isSystemDarkMode(Context context) {
        UiModeManager uiModeManager = context.getSystemService(UiModeManager.class);
        int mode = uiModeManager == null ? -1 : uiModeManager.getNightMode();
        // 小黑盒可单独覆盖应用的夜间模式。设置页读取系统选择和当前生效的配置。
        if (mode == UiModeManager.MODE_NIGHT_YES || mode == UiModeManager.MODE_NIGHT_NO) {
            return mode == UiModeManager.MODE_NIGHT_YES;
        }
        int uiMode = Resources.getSystem().getConfiguration().uiMode;
        return (uiMode & Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;
    }

    private void migrateMediaAutoplayPreference() {
        safePreferences.migrateGif(preferences);
    }

    private boolean readBoolean(String key, boolean fallback) {
        return safePreferences.getBoolean(preferences, key, fallback);
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
        super.dismiss();
    }

    private void configureWindow() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(cardColor));
        window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND
                | WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(cardColor);
        window.setNavigationBarColor(backgroundColor);
        View decor = window.getDecorView();
        if (Build.VERSION.SDK_INT >= 29) {
            decor.setForceDarkAllowed(false);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        }
        int lightBarFlags = darkMode ? 0
                : View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
        decor.setSystemUiVisibility(
                lightBarFlags | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    }

    private void showMainPage() {
        adPage = false;
        resetPageReferences();
        setContentView(createMainPage());
        refreshAdCleanValue();
    }

    private void resetPageReferences() {
        content = null;
        adCleanValue = null;
        imageAdaptiveContainer = null;
    }

    private View createMainPage() {
        LinearLayout root = createInsetRoot();
        root.addView(createTitleBar("小黑盒净化", this::dismiss),
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, dp(56)));

        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setFillViewport(true);
        scrollView.setClipToPadding(false);
        content = new LinearLayout(getContext());
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
        cleanCard.addView(createDivider());
        cleanCard.addView(createSwitchRow(
                "静默消息", "隐藏消息中心里官方消息和游戏优惠的红点",
                Config.KEY_SILENT_MESSAGES, false));
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
                "禁止信息流 GIF 自动播放", "列表中显示静态首帧；点开后自动播放",
                Config.KEY_DISABLE_GIF_AUTOPLAY, false));
        experienceCard.addView(createDivider());
        experienceCard.addView(createSwitchRow(
                "返回首页不自动刷新", "从其他底部页面返回首页时保留当前位置；手动下拉刷新不受影响",
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
        LinearLayout adaptiveContainer = new LinearLayout(getContext());
        adaptiveContainer.setOrientation(LinearLayout.VERTICAL);
        adaptiveContainer.addView(createDivider());
        adaptiveContainer.addView(createSwitchRow(
                "根据网络自适应查看原图", "Wi-Fi自动加载；移动网络保持普通图片",
                Config.KEY_IMAGE_WIFI_ADAPTIVE, false));
        imageAdaptiveContainer = adaptiveContainer;
        adaptiveContainer.setVisibility(readBoolean(
                Config.KEY_IMAGE_ENHANCE, false) ? View.VISIBLE : View.GONE);
        experienceCard.addView(adaptiveContainer);
        content.addView(experienceCard, cardMargins());

        addSectionLabel("版本兼容");
        LinearLayout versionCard = createCard();
        versionCard.addView(createSwitchRow(
                "屏蔽版本更新弹窗", "不显示服务器要求升级时的提示",
                Config.KEY_SUPPRESS_UPDATE_PROMPT, false));
        content.addView(versionCard, cardMargins());

        TextView note = new TextView(getContext());
        note.setText("设置直接保存在小黑盒进程中。全部功能默认关闭；修改后请彻底重启小黑盒，关闭的功能不会安装对应 Hook。");
        note.setTextColor(secondaryColor);
        note.setTextSize(12);
        note.setLineSpacing(dp(2), 1f);
        LinearLayout.LayoutParams noteParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        noteParams.setMargins(dp(12), dp(10), dp(12), 0);
        content.addView(note, noteParams);

        root.addView(scrollView, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        return root;
    }

    private LinearLayout createInsetRoot() {
        LinearLayout root = new LinearLayout(getContext());
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(backgroundColor);
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
        adCleanValue = new TextView(getContext());
        adCleanValue.setTextColor(secondaryColor);
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
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setFillViewport(true);
        LinearLayout page = new LinearLayout(getContext());
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(dp(14), dp(8), dp(14), dp(32));
        scrollView.addView(page, new ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        page.addView(createSectionLabelView("总开关"));
        LinearLayout masterCard = createCard();
        LinearLayout children = new LinearLayout(getContext());
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
        TextView adNote = new TextView(getContext());
        adNote.setText("总开关关闭时不会安装广告净化 Hook；子项选择会保留。更改后请重启小黑盒。");
        adNote.setTextColor(secondaryColor);
        adNote.setTextSize(12);
        adNote.setPadding(dp(12), dp(10), dp(12), 0);
        children.addView(adNote);
        children.setVisibility(readBoolean(
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
        if (!readBoolean(Config.KEY_GLOBAL_AD_CLEAN, false)) {
            adCleanValue.setText("未开启");
            return;
        }
        int enabled = 0;
        enabled += readBoolean(Config.KEY_AD_CLEAN_HOME, true) ? 1 : 0;
        enabled += readBoolean(Config.KEY_AD_CLEAN_BANNERS, true) ? 1 : 0;
        enabled += readBoolean(
                Config.KEY_AD_CLEAN_MALL_BOTTOM, true) ? 1 : 0;
        adCleanValue.setText("已开启 · " + enabled + "项");
    }



    private FrameLayout createTitleBar(String titleText, Runnable backAction) {
        FrameLayout bar = new FrameLayout(getContext());
        bar.setBackgroundColor(cardColor);
        TextView back = new TextView(getContext());
        back.setText("‹");
        back.setTextSize(40);
        back.setTextColor(primaryColor);
        back.setGravity(Gravity.CENTER);
        back.setContentDescription("返回");
        back.setOnClickListener(view -> backAction.run());
        FrameLayout.LayoutParams backParams = new FrameLayout.LayoutParams(
                dp(52), dp(56));
        backParams.gravity = Gravity.START | Gravity.CENTER_VERTICAL;
        bar.addView(back, backParams);
        TextView title = new TextView(getContext());
        title.setText(titleText);
        title.setTextColor(primaryColor);
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
        TextView view = new TextView(getContext());
        view.setText(label);
        view.setTextColor(secondaryColor);
        view.setTextSize(13);
        view.setPadding(dp(10), dp(16), 0, dp(8));
        return view;
    }

    private LinearLayout createCard() {
        LinearLayout card = new LinearLayout(getContext());
        card.setOrientation(LinearLayout.VERTICAL);
        GradientDrawable background = new GradientDrawable();
        background.setColor(cardColor);
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
        Switch toggle = new Switch(getContext());
        toggle.setChecked(readBoolean(key, defaultValue));
        toggle.setContentDescription(title);
        toggle.setButtonTintList(null);
        toggle.setTrackTintList(new android.content.res.ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_checked}, new int[]{}
                }, new int[]{
                        withAlpha(COLOR_ACCENT, 120), darkMode ? 0xff51545c : 0xffd3d5da
                }));
        toggle.setThumbTintList(new android.content.res.ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_checked}, new int[]{}
                }, new int[]{COLOR_ACCENT, darkMode ? 0xffd2d4d9 : Color.WHITE}));
        boolean[] restoring = {false};
        toggle.setOnCheckedChangeListener((button, checked) -> {
            if (restoring[0]) {
                return;
            }
            if (!safePreferences.putBoolean(preferences, key, checked)) {
                restoring[0] = true;
                toggle.setChecked(!checked);
                restoring[0] = false;
                Toast.makeText(host, "设置保存失败，请重试", Toast.LENGTH_SHORT).show();
                return;
            }
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
        LinearLayout row = new LinearLayout(getContext());
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(dp(16), dp(9), dp(12), dp(9));
        row.setMinimumHeight(dp(70));
        return row;
    }

    private LinearLayout createTextColumn(String title, String subtitle) {
        LinearLayout column = new LinearLayout(getContext());
        column.setOrientation(LinearLayout.VERTICAL);
        column.setGravity(Gravity.CENTER_VERTICAL);
        TextView titleView = new TextView(getContext());
        titleView.setText(title);
        titleView.setTextColor(primaryColor);
        titleView.setTextSize(16);
        column.addView(titleView);
        TextView subtitleView = new TextView(getContext());
        subtitleView.setText(subtitle);
        subtitleView.setTextColor(secondaryColor);
        subtitleView.setTextSize(12);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = dp(3);
        column.addView(subtitleView, params);
        return column;
    }

    private View createDivider() {
        View divider = new View(getContext());
        divider.setBackgroundColor(dividerColor);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(1));
        params.leftMargin = dp(16);
        divider.setLayoutParams(params);
        return divider;
    }

    private TextView createArrow() {
        TextView arrow = new TextView(getContext());
        arrow.setText("  ›");
        arrow.setTextColor(secondaryColor);
        arrow.setTextSize(26);
        arrow.setGravity(Gravity.CENTER);
        return arrow;
    }

    private TextView createPlainActionRow(String text) {
        TextView action = new TextView(getContext());
        action.setText(text);
        action.setTextColor(primaryColor);
        action.setTextSize(14);
        action.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        action.setGravity(Gravity.CENTER);
        action.setPadding(dp(16), dp(12), dp(16), dp(12));
        action.setMinimumHeight(dp(48));
        return action;
    }

    private TextView createInfoRow(String title, String value) {
        TextView view = new TextView(getContext());
        view.setTextColor(secondaryColor);
        view.setTextSize(13);
        view.setGravity(Gravity.CENTER_VERTICAL);
        view.setPadding(dp(16), dp(12), dp(16), dp(12));
        view.setText(title + "  " + value);
        return view;
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

}
