package dev.heybox.hook;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
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

/** 全局广告净化的细分设置页。 */
public final class AdSettingsActivity extends Activity {
    private static final int COLOR_BACKGROUND = Color.rgb(245, 246, 248);
    private static final int COLOR_CARD = Color.WHITE;
    private static final int COLOR_PRIMARY = Color.rgb(28, 29, 33);
    private static final int COLOR_SECONDARY = Color.rgb(139, 142, 151);
    private static final int COLOR_ACCENT = Color.rgb(247, 193, 35);
    private static final int COLOR_DIVIDER = Color.rgb(237, 238, 241);

    private SharedPreferences preferences;
    private LinearLayout childOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(Config.PREFS_NAME, MODE_PRIVATE);
        configureWindow();
        setContentView(createPage());
    }

    private void configureWindow() {
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(Color.WHITE);
        window.setNavigationBarColor(Color.WHITE);
        window.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                        | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
    }

    @SuppressWarnings("deprecation")
    private View createPage() {
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(COLOR_BACKGROUND);
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
        LinearLayout content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(dp(14), dp(8), dp(14), dp(32));
        scrollView.addView(content, new ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        content.addView(createSectionLabel("总开关"));
        LinearLayout masterCard = createCard();
        masterCard.addView(createSwitchRow(
                "开启净化",
                "只安装下方已选项目的 Hook，开屏广告仍由独立开关控制",
                Config.KEY_GLOBAL_AD_CLEAN,
                false,
                checked -> childOptions.setVisibility(
                        checked ? View.VISIBLE : View.GONE)));
        content.addView(masterCard, cardMargins());

        childOptions = new LinearLayout(this);
        childOptions.setOrientation(LinearLayout.VERTICAL);
        childOptions.addView(createSectionLabel("净化项目"));
        LinearLayout childCard = createCard();
        childCard.addView(createSwitchRow(
                "信息流广告对象",
                "过滤推荐、关注、话题和合集列表中的广告内容",
                Config.KEY_AD_CLEAN_FEED,
                true,
                null));
        childCard.addView(createDivider());
        childCard.addView(createSwitchRow(
                "首页气泡、角标、页内广告",
                "移除首页气泡、角标和页内弹层广告",
                Config.KEY_AD_CLEAN_HOME,
                true,
                null));
        childCard.addView(createDivider());
        childCard.addView(createSwitchRow(
                "BBS/话题/签到/游戏/商城等广告横幅",
                "移除上述页面及交易页面中的广告横幅",
                Config.KEY_AD_CLEAN_BANNERS,
                true,
                null));
        childCard.addView(createDivider());
        childCard.addView(createSwitchRow(
                "商城底栏广告",
                "移除商城页面底部浮动广告栏",
                Config.KEY_AD_CLEAN_MALL_BOTTOM,
                true,
                null));
        childOptions.addView(childCard, cardMargins());

        TextView note = new TextView(this);
        note.setText("全部功能默认关闭。总开关关闭时不会安装任何广告净化 Hook；子项选择会保留，并在总开关开启后生效。更改设置后请重启小黑盒。");
        note.setTextColor(COLOR_SECONDARY);
        note.setTextSize(12);
        note.setLineSpacing(dp(2), 1f);
        LinearLayout.LayoutParams noteParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        noteParams.setMargins(dp(12), dp(10), dp(12), 0);
        childOptions.addView(note, noteParams);
        childOptions.setVisibility(preferences.getBoolean(
                Config.KEY_GLOBAL_AD_CLEAN, false) ? View.VISIBLE : View.GONE);
        content.addView(childOptions);

        root.addView(scrollView, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        return root;
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
        title.setText("广告净化");
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

    private TextView createSectionLabel(String label) {
        TextView view = new TextView(this);
        view.setText(label);
        view.setTextColor(COLOR_SECONDARY);
        view.setTextSize(13);
        view.setPadding(dp(10), dp(16), 0, dp(8));
        return view;
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
                                 boolean defaultValue,
                                 ToggleChangeListener changeListener) {
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(dp(16), dp(12), dp(14), dp(12));
        row.setMinimumHeight(dp(64));

        LinearLayout textColumn = new LinearLayout(this);
        textColumn.setOrientation(LinearLayout.VERTICAL);
        TextView titleView = new TextView(this);
        titleView.setText(title);
        titleView.setTextColor(COLOR_PRIMARY);
        titleView.setTextSize(15);
        titleView.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        textColumn.addView(titleView);
        TextView subtitleView = new TextView(this);
        subtitleView.setText(subtitle);
        subtitleView.setTextColor(COLOR_SECONDARY);
        subtitleView.setTextSize(12);
        subtitleView.setPadding(0, dp(3), dp(8), 0);
        textColumn.addView(subtitleView);
        row.addView(textColumn, new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

        Switch toggle = new Switch(this);
        toggle.setChecked(preferences.getBoolean(key, defaultValue));
        toggle.setButtonTintList(null);
        toggle.setTrackTintList(new android.content.res.ColorStateList(
                new int[][]{new int[]{android.R.attr.state_checked}, new int[]{}},
                new int[]{withAlpha(COLOR_ACCENT, 120), Color.rgb(211, 213, 218)}));
        toggle.setThumbTintList(new android.content.res.ColorStateList(
                new int[][]{new int[]{android.R.attr.state_checked}, new int[]{}},
                new int[]{COLOR_ACCENT, Color.WHITE}));
        toggle.setOnCheckedChangeListener((button, checked) -> {
            preferences.edit().putBoolean(key, checked).apply();
            if (changeListener != null) {
                changeListener.onChanged(checked);
            }
        });
        row.setOnClickListener(view -> toggle.setChecked(!toggle.isChecked()));
        row.addView(toggle, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        return row;
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
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 0, 0, dp(6));
        return params;
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    private static int withAlpha(int color, int alpha) {
        return Color.argb(alpha, Color.red(color), Color.green(color), Color.blue(color));
    }

    private interface ToggleChangeListener {
        void onChanged(boolean checked);
    }
}
