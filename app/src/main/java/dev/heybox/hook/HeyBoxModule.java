package dev.heybox.hook;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import io.github.libxposed.api.XposedModule;

/**
 * 仅作用于小黑盒主应用的 Modern Xposed API 102 模块。
 */
public final class HeyBoxModule extends XposedModule {
    private static final String TAG = "HeyBoxHook";
    private static final String MODULE_VERSION = Config.MODULE_VERSION;
    private static final String TARGET_PACKAGE = Config.TARGET_PACKAGE;
    private static final String MAIN_ACTIVITY = "com.max.xiaoheihe.MainActivity";
    private static final String TASK_FRAGMENT =
            "com.max.xiaoheihe.module.account.UserTaskFragmentV2";
    private static final String TASK_ADAPTER = TASK_FRAGMENT + "$c";
    private static final String TASK_INFO =
            "com.max.xiaoheihe.bean.account.TaskInfoObj";
    private static final String TASK_RESULT =
            "com.max.xiaoheihe.bean.account.TaskResultObj";
    private static final String TASK_HOLDER = "com.max.hbcommon.base.adapter.s$e";
    private static final String SHARE_UTIL = "com.max.hbshare.d";
    private static final String SHARE_DATA = "com.max.hbshare.bean.HBShareData";
    private static final String SHARE_LISTENER = "com.umeng.socialize.UMShareListener";
    private static final String SHARE_MEDIA = "com.umeng.socialize.bean.SHARE_MEDIA";
    private static final String SHARE_REPORT_LISTENER = "com.max.hbshare.c$b";
    private static final String GSON_JSON_OBJECT = "com.google.gson.JsonObject";
    private static final String OPEN_SCREEN_AD_SELECTOR =
            "com.max.xiaoheihe.module.ads.b";
    private static final String SPLASH_ACTIVITY = "com.max.xiaoheihe.SplashActivity";
    private static final String TARGET_SETTINGS_ACTIVITY =
            "com.max.xiaoheihe.module.account.SettingActivity";
    private static final String SETTING_ITEM_VIEW =
            "com.max.xiaoheihe.module.account.component.SettingItemView";
    private static final String CHECK_VERSION_OBJECT =
            "com.max.xiaoheihe.bean.account.CheckVersionObj";
    private static final int CURRENT_CHECK_UPDATE_ID = 0x7f0a11cb;
    private static final int CURRENT_TASK_STATE_TEXT_ID = 0x7f0a0f6d;
    private static final int CURRENT_TASK_STATE_CONTAINER_ID = 0x7f0a14c0;
    private static final String DAILY_RUNTIME_PREFS = "heybox_hook_runtime";
    private static final String DAILY_SHARE_DATE_PREFIX = "daily_share_date:";
    private static final String DAILY_SHARE_STATE_PREFIX = "daily_share_state:";
    private static final String DAILY_SHARE_TASKS_PREFIX = "daily_share_tasks:";
    private static final String DAILY_SHARE_STATE_IN_PROGRESS = "IN_PROGRESS";
    private static final String DAILY_SHARE_STATE_CONFIRMED = "CONFIRMED";
    private static final ZoneId DAILY_TASK_ZONE = ZoneId.of("Asia/Shanghai");
    private static final long DAILY_SHARE_START_DELAY_MS = 3500L;
    private static final long DAILY_SHARE_RETRY_DELAY_MS = 5000L;
    private static final int DAILY_SHARE_MAX_FETCH_ATTEMPTS = 2;
    private static final long DAILY_SHARE_FETCH_TIMEOUT_MS = 20000L;
    private static final long DAILY_SHARE_CONFIRM_DELAY_MS = 3000L;
    private static final int DAILY_SHARE_CONFIRM_MAX_ATTEMPTS = 2;
    /** 避免三个埋点在同一个服务端去重/批处理窗口中互相覆盖。 */
    private static final long DAILY_SHARE_REPORT_INTERVAL_MS = 900L;
    private static final boolean VERBOSE_TASK_LOG = false;

    private static final String[] CENTER_VIEW_NAMES = {
            "vg_mid_tab",
            "rb_3",
            "vg_tips_3"
    };

    private boolean hooksInstalled;
    private boolean hooksInitializing;
    private SharedPreferences preferences;
    private volatile Context targetContext;
    private volatile WeakReference<Activity> lastTargetActivity = new WeakReference<>(null);
    private Method appUpdateCheckMethod;
    private Method checkVersionGetVersion;
    private Method loginStateMethod;
    private Method currentUserIdMethod;
    private volatile boolean forceLegacyVersionForCheck;
    /** 只把主动诊断创建的 Observer 当作诊断响应，避免吞掉并发的普通更新请求。 */
    private volatile WeakReference<Object> activeVersionCheckObserver =
            new WeakReference<>(null);
    private volatile WeakReference<Context> activeVersionCheckContext =
            new WeakReference<>(null);
    private final List<WeakReference<Object>> expiredVersionCheckObservers =
            new ArrayList<>();
    private long versionCheckRequestGeneration;
    private volatile boolean hidePublishSnapshot;
    private volatile boolean shareTaskSnapshot;
    private volatile boolean dailyShareTaskSnapshot;
    private volatile boolean skipSplashAdSnapshot;
    private volatile boolean globalAdCleanSnapshot;
    private volatile boolean adCleanFeedSnapshot;
    private volatile boolean adCleanHomeSnapshot;
    private volatile boolean adCleanBannersSnapshot;
    private volatile boolean adCleanMallBottomSnapshot;
    private volatile boolean disableClipboardTokenSnapshot;
    private volatile boolean externalBrowserSnapshot;
    private volatile boolean disableVideoAutoplaySnapshot;
    private volatile boolean disableGifAutoplaySnapshot;
    private volatile boolean noForegroundRefreshSnapshot;
    private volatile boolean imageEnhanceSnapshot;
    private volatile boolean imageWifiAdaptiveSnapshot;
    private volatile boolean postTextSelectSnapshot;
    private volatile boolean suppressUpdatePromptSnapshot;
    private volatile boolean spoofVersionSnapshot;
    private volatile String versionModeSnapshot = Config.VERSION_MODE_AUTO;
    private volatile String customVersionSnapshot = "";
    private volatile long customVersionCodeSnapshot;
    private volatile String cachedLatestVersionSnapshot = "";
    private volatile long cachedLatestVersionCodeSnapshot;
    /** 版本拦截热路径使用的基准值缓存。 */
    private volatile String effectiveVersionSnapshot = Config.TARGET_BASE_VERSION;
    private volatile long effectiveVersionCodeSnapshot = Config.TARGET_BASE_VERSION_CODE;
    private volatile boolean versionIdentityOverrideSnapshot;
    private volatile boolean dailyShareInProgress;
    private volatile boolean dailyShareFetchRequested;
    private long dailyShareRequestGeneration;
    private int dailyShareActiveAttempt;
    private volatile TaskRequestHandle dailyShareActiveRequest;
    private String dailyShareSuppressedDay = "";
    private String dailyShareSuppressedAccount = "";
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Map<Object, Runnable> pendingTaskRefreshes = new WeakHashMap<>();
    private final Map<Activity, List<WeakReference<View>>> centerNavigationViews =
            new WeakHashMap<>();
    private final WeakIdentitySet<Object> requestedOriginalImages = new WeakIdentitySet<>();
    /** 已由查看器普通图片加载器回调确认完成的图片。 */
    private final WeakIdentitySet<Object> loadedViewerImages = new WeakIdentitySet<>();
    /** 只追踪当前选中的查看器页面，滑走后不会继续加载上一张或预加载下一张原图。 */
    private volatile WeakReference<Object> selectedViewerImage = new WeakReference<>(null);
    private volatile WeakReference<TextView> selectedOriginalButton =
            new WeakReference<>(null);
    /** 标记 BaseResUICustomizer.y() 同步调用 K() 的页面选择绑定栈。 */
    private final ThreadLocal<Boolean> selectingViewerPage = new ThreadLocal<>();
    /** 只在 NewsTagListFragment.onHiddenChanged(false) 的同步调用栈内生效。 */
    private final ThreadLocal<Boolean> suppressHomeVisibilityRefresh = new ThreadLocal<>();
    private volatile Resources centerNavigationResources;
    private volatile int[] centerNavigationIds;
    private String currentProcessName = "";
    private final Set<String> installedHookGroups = new LinkedHashSet<>();
    private final Map<String, HookGroupProgress> hookGroupProgress = new LinkedHashMap<>();
    private final Set<String> runtimeHookFailures = new LinkedHashSet<>();

    @Override
    public void onModuleLoaded(ModuleLoadedParam param) {
        currentProcessName = param.getProcessName();
        // 不在每次进程加载时初始化 Remote Preferences。0.6.x 的旧配置只在
        // 宿主迁移标记不存在时按需读取一次，迁移完成后的启动路径没有 Binder 访问。
        info("BOOT module=" + MODULE_VERSION + " process=" + param.getProcessName()
                + " framework=" + getFrameworkName()
                + " api=" + getApiVersion());
    }

    @Override
    public void onPackageReady(PackageReadyParam param) {
        if (!TARGET_PACKAGE.equals(param.getPackageName())) {
            return;
        }

        boolean mainProcess = TARGET_PACKAGE.equals(currentProcessName);
        if (!mainProcess) {
            info("PROCESS_SKIP process=" + currentProcessName);
            return;
        }

        ClassLoader classLoader = param.getClassLoader();
        info("PKG_READY package=" + param.getPackageName()
                + " loader=" + classLoader.getClass().getName());

        Context currentApplication = findCurrentApplication();
        if (currentApplication != null) {
            initializeTargetSafely(currentApplication, classLoader);
            return;
        }
        installHostContextBootstrap(classLoader);
    }

    /**
     * PackageReady 早于 Application.attach 时通过一次性启动 Hook 获取宿主 Context。
     * Application.attach 是 final 方法，不受目标自定义 Application 覆盖影响；完成
     * 初始化后不会再进入任何页面或网络热路径。
     */
    private void installHostContextBootstrap(ClassLoader classLoader) {
        boolean installed = false;
        try {
            Method attach = Application.class.getDeclaredMethod("attach", Context.class);
            attach.setAccessible(true);
            hook(attach).intercept(chain -> {
                Object result = chain.proceed();
                Context context = (Context) chain.getArg(0);
                if (context != null
                        && TARGET_PACKAGE.equals(context.getPackageName())) {
                    initializeTargetSafely(context, classLoader);
                }
                return result;
            });
            info("HOST_CONTEXT_BOOTSTRAP_READY method=Application.attach");
            installed = true;
        } catch (Throwable throwable) {
            warn("HOST_CONTEXT_BOOTSTRAP_SKIP method=Application.attach reason="
                    + throwable.getClass().getSimpleName());
        }
        try {
            Method callOnCreate = Instrumentation.class.getMethod(
                    "callApplicationOnCreate", Application.class);
            hook(callOnCreate).intercept(chain -> {
                Application application = (Application) chain.getArg(0);
                if (application != null
                        && TARGET_PACKAGE.equals(application.getPackageName())) {
                    // 在宿主 Application.onCreate 前完成配置快照与功能 Hook，
                    // SplashActivity 创建前所有启用功能已准备完成。
                    initializeTargetSafely(application, classLoader);
                }
                return chain.proceed();
            });
            info("HOST_CONTEXT_BOOTSTRAP_READY method=Instrumentation.callApplicationOnCreate");
            installed = true;
        } catch (Throwable throwable) {
            warn("HOST_CONTEXT_BOOTSTRAP_SKIP method=Instrumentation.callApplicationOnCreate reason="
                    + throwable.getClass().getSimpleName());
        }
        if (!installed) {
            error("HOST_CONTEXT_BOOTSTRAP_ERROR",
                    new IllegalStateException("No context bootstrap method available"));
        }
    }

    private Context findCurrentApplication() {
        try {
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Method currentApplication = activityThread.getDeclaredMethod("currentApplication");
            currentApplication.setAccessible(true);
            Object application = currentApplication.invoke(null);
            return application instanceof Context ? (Context) application : null;
        } catch (Throwable ignored) {
            return null;
        }
    }

    private void initializeTargetSafely(Context context, ClassLoader classLoader) {
        try {
            initializeTarget(context, classLoader);
        } catch (Throwable throwable) {
            // 启动引导绝不能把异常传回 Application.attach，否则设置功能的一次
            // 兼容问题会直接导致整个小黑盒启动失败。
            error("HOST_INITIALIZE_ERROR", unwrap(throwable));
        }
    }

    private void initializeTarget(Context context, ClassLoader classLoader) throws Throwable {
        synchronized (this) {
            if (hooksInstalled || hooksInitializing) {
                return;
            }
            hooksInitializing = true;
        }

        try {
            Context applicationContext = context.getApplicationContext();
            targetContext = applicationContext == null ? context : applicationContext;
            preferences = targetContext.getSharedPreferences(
                    Config.HOST_PREFS_NAME, Context.MODE_PRIVATE);
            migrateRemotePreferencesIfNeeded(preferences);
            loadFeatureConfigSnapshot();
        } catch (Throwable throwable) {
            // 配置准备阶段尚未安装任何功能 Hook，可以安全释放初始化状态，
            // 让后续的 Application.onCreate 引导或下一次调用重试。
            synchronized (this) {
                hooksInitializing = false;
            }
            throw throwable;
        }

        // 从此处开始各安装器可能已经注册 Hook。即使某个可选功能不兼容，也不能
        // 整体重试，否则已经成功的 Hook 会被重复注册。
        synchronized (this) {
            hooksInstalled = true;
            hooksInitializing = false;
        }

        if (hidePublishSnapshot
                || (shareTaskSnapshot && dailyShareTaskSnapshot)) {
            installMainUiHooks(classLoader);
        }
        if (shareTaskSnapshot) {
            installTaskShareHook(classLoader);
            installTaskButtonHook(classLoader);
        }
        if (shareTaskSnapshot && dailyShareTaskSnapshot) {
            installDailyTaskHook(classLoader);
        }
        installSettingsEntryHook(classLoader);
        if (suppressUpdatePromptSnapshot) {
            installUpdateSuppressionHooks(classLoader);
        }
        if (skipSplashAdSnapshot) {
            installSplashAdHook(classLoader);
        }
        if (globalAdCleanSnapshot && (adCleanFeedSnapshot
                || adCleanHomeSnapshot
                || adCleanBannersSnapshot
                || adCleanMallBottomSnapshot)) {
            installGlobalAdHooks(classLoader);
        }
        if (disableClipboardTokenSnapshot) {
            installClipboardTokenHook(classLoader);
        }
        if (externalBrowserSnapshot) {
            installExternalBrowserHooks(classLoader);
        }
        if (disableVideoAutoplaySnapshot || disableGifAutoplaySnapshot) {
            installMediaAutoplayHooks(classLoader);
        }
        if (noForegroundRefreshSnapshot) {
            installHomeReturnRefreshHook(classLoader);
        }
        if (imageEnhanceSnapshot) {
            installImageEnhancementHook(classLoader);
        }
        if (postTextSelectSnapshot) {
            installPostTextSelectionHook(classLoader);
        }
        info("HOST_CONFIG_READY storage=" + Config.HOST_PREFS_NAME);
    }

    private void migrateRemotePreferencesIfNeeded(SharedPreferences hostPreferences) {
        if (hostPreferences.getBoolean(Config.KEY_HOST_PREFS_MIGRATED, false)) {
            return;
        }
        SharedPreferences.Editor editor = hostPreferences.edit();
        int migrated = 0;
        SharedPreferences legacy = null;
        try {
            // 仅首次迁移进入这里。迁移标记写入后，后续进程启动不会再创建
            // LSPosed Remote Preferences 连接。
            legacy = getRemotePreferences(Config.PREFS_NAME);
        } catch (Throwable throwable) {
            warn("HOST_CONFIG_MIGRATION_OPEN_ERROR "
                    + unwrap(throwable).getClass().getSimpleName());
            // 不写迁移完成标记，下次启动仍有机会读取旧配置。
            return;
        }
        if (legacy != null) {
            try {
                for (Map.Entry<String, ?> entry : legacy.getAll().entrySet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value instanceof String) {
                        editor.putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        editor.putBoolean(key, (Boolean) value);
                    } else if (value instanceof Integer) {
                        editor.putInt(key, (Integer) value);
                    } else if (value instanceof Long) {
                        editor.putLong(key, (Long) value);
                    } else if (value instanceof Float) {
                        editor.putFloat(key, (Float) value);
                    } else if (value instanceof Set<?>) {
                        @SuppressWarnings("unchecked")
                        Set<String> values = (Set<String>) value;
                        editor.putStringSet(key, new LinkedHashSet<>(values));
                    } else {
                        continue;
                    }
                    migrated++;
                }
            } catch (Throwable throwable) {
                warn("HOST_CONFIG_MIGRATION_READ_ERROR "
                        + throwable.getClass().getSimpleName());
                // 读取失败时不把空配置标记成迁移完成。
                return;
            }
        }
        // SharedPreferences.apply() 会立即更新当前进程内存值，并异步落盘，避免在
        // Application 启动主线程上执行同步 fsync。
        editor.putBoolean(Config.KEY_HOST_PREFS_MIGRATED, true).apply();
        info("HOST_CONFIG_MIGRATED count=" + migrated);
    }

    private void installMainUiHooks(ClassLoader classLoader) {
        final Class<?> mainActivityClass;
        try {
            mainActivityClass = Class.forName(MAIN_ACTIVITY, false, classLoader);
            Method onCreate = mainActivityClass.getDeclaredMethod("onCreate", Bundle.class);
            onCreate.setAccessible(true);

            hook(onCreate).intercept(chain -> {
                Activity activity = (Activity) chain.getThisObject();
                targetContext = activity.getApplicationContext();
                lastTargetActivity = new WeakReference<>(activity);

                // 在原始初始化前关闭当前版本控制中心发布入口的静态开关。
                // 即使字段被热修复忽略，方法执行后的 View 处理仍然会生效。
                if (hidePublishSnapshot) {
                    disableCurrentCenterFlag(mainActivityClass);
                }

                Object result = chain.proceed();
                if (hidePublishSnapshot) {
                    hideCenterNavigation(activity, "onCreate");
                }
                return result;
            });
            recordHookGroup("基础/自检");
            if (hidePublishSnapshot) {
                recordHookGroup("隐藏发布按钮");
            }
            info("HOOK_UI_CREATE_OK class=" + MAIN_ACTIVITY);
        } catch (Throwable throwable) {
            error("HOOK_UI_CREATE_ERROR class=" + MAIN_ACTIVITY, throwable);
            return;
        }

        boolean needsResumeHook = hidePublishSnapshot
                || (shareTaskSnapshot && dailyShareTaskSnapshot);
        if (needsResumeHook) {
            try {
                Method onResume = mainActivityClass.getDeclaredMethod("onResume");
                onResume.setAccessible(true);
                hook(onResume).intercept(chain -> {
                    Object result = chain.proceed();
                    lastTargetActivity = new WeakReference<>((Activity) chain.getThisObject());
                    if (hidePublishSnapshot) {
                        hideCenterNavigation((Activity) chain.getThisObject(), "onResume");
                    }
                    // onCreate 时应用的登录态和网络组件可能尚未准备好。等首页真正
                    // resume 后再请求任务列表，避免只有进入“我的任务”页面才触发 n4。
                    triggerDailyShareFetch(classLoader);
                    return result;
                });
                recordHookGroup("首页恢复监听");
                info("HOOK_UI_RESUME_OK class=" + MAIN_ACTIVITY);
            } catch (Throwable throwable) {
                error("HOOK_UI_RESUME_ERROR class=" + MAIN_ACTIVITY, throwable);
            }
        }
    }

    private void disableCurrentCenterFlag(Class<?> mainActivityClass) {
        try {
            Field field = mainActivityClass.getDeclaredField("E4");
            if (field.getType() != boolean.class || !Modifier.isStatic(field.getModifiers())) {
                return;
            }
            field.setAccessible(true);
            if (field.getBoolean(null)) {
                field.setBoolean(null, false);
                info("UI_FLAG_DISABLED field=MainActivity.E4");
            }
        } catch (NoSuchFieldException ignored) {
            // 字段名可能在后续版本变化；按资源名隐藏 View 是主要方案。
        } catch (Throwable throwable) {
            warn("UI_FLAG_ERROR " + throwable.getClass().getSimpleName()
                    + ":" + throwable.getMessage());
        }
    }

    private void hideCenterNavigation(Activity activity, String source) {
        if (activity == null) {
            return;
        }

        try {
            Resources resources = activity.getResources();
            int[] ids = centerNavigationIds;
            if (ids == null || centerNavigationResources != resources) {
                synchronized (this) {
                    ids = centerNavigationIds;
                    if (ids == null || centerNavigationResources != resources) {
                        ids = new int[CENTER_VIEW_NAMES.length];
                        for (int index = 0; index < CENTER_VIEW_NAMES.length; index++) {
                            ids[index] = resources.getIdentifier(
                                    CENTER_VIEW_NAMES[index], "id", TARGET_PACKAGE);
                        }
                        centerNavigationResources = resources;
                        centerNavigationIds = ids;
                    }
                }
            }
            int changed = 0;
            int found = 0;
            List<WeakReference<View>> cachedViews;
            synchronized (centerNavigationViews) {
                cachedViews = centerNavigationViews.get(activity);
                boolean resolveViews = cachedViews == null
                        || cachedViews.size() != ids.length;
                if (!resolveViews) {
                    for (int index = 0; index < cachedViews.size(); index++) {
                        // null 条目表示该资源在当前布局中不存在；它不是失效缓存，
                        // 不能因此在每次 onResume 都重新遍历整棵 View 树。
                        if (ids[index] == 0) {
                            continue;
                        }
                        WeakReference<View> reference = cachedViews.get(index);
                        if (reference == null) {
                            continue;
                        }
                        View cached = reference.get();
                        if (cached == null || !cached.isAttachedToWindow()) {
                            resolveViews = true;
                            break;
                        }
                    }
                }
                if (resolveViews) {
                    cachedViews = new ArrayList<>(ids.length);
                    for (int id : ids) {
                        View view = id == 0 ? null : activity.findViewById(id);
                        cachedViews.add(view == null ? null : new WeakReference<>(view));
                    }
                    centerNavigationViews.put(activity, cachedViews);
                }
            }

            for (WeakReference<View> reference : cachedViews) {
                View view = reference == null ? null : reference.get();
                if (view == null) {
                    continue;
                }

                found++;
                if (view.getVisibility() != View.GONE || view.isClickable()) {
                    view.setVisibility(View.GONE);
                    view.setClickable(false);
                    view.setFocusable(false);
                    changed++;
                }
            }

            if (changed > 0) {
                info("UI_HIDE_OK source=" + source
                        + " found=" + found
                        + " changed=" + changed);
            }
        } catch (Throwable throwable) {
            recordRuntimeFallback("隐藏发布按钮/" + source, throwable);
        }
    }

    private void installTaskShareHook(ClassLoader classLoader) {
        try {
            Class<?> shareUtilClass = Class.forName(SHARE_UTIL, false, classLoader);
            Class<?> shareDataClass = Class.forName(SHARE_DATA, false, classLoader);
            Method shareEntry = shareUtilClass.getDeclaredMethod(
                    "E", android.content.Context.class, shareDataClass);
            Method getShareListener = shareDataClass.getMethod("getShareListener");
            Method getReportExtra = shareDataClass.getMethod("getReport_extra");
            Method getTitle = shareDataClass.getMethod("getTitle");
            shareEntry.setAccessible(true);
            getShareListener.setAccessible(true);
            getReportExtra.setAccessible(true);
            getTitle.setAccessible(true);

            hook(shareEntry).intercept(chain -> {
                Object shareData = chain.getArg(1);
                Object listener = null;
                try {
                    listener = shareData == null
                            ? null : getShareListener.invoke(shareData);
                    if (!containsTaskListener(listener)) {
                        return chain.proceed();
                    }
                    Object reportExtra = getReportExtra.invoke(shareData);
                    String title = stringValue(getTitle.invoke(shareData));
                    String source = resolveShareSource(title, reportExtra);
                    Object reportingListener = createReportingListener(
                            source, listener, reportExtra, classLoader);
                    String media = dispatchShareSuccess(reportingListener, classLoader);
                    info("SHARE_BYPASS_OK listener=" + listener.getClass().getName()
                            + " src=" + source
                            + " media=" + media
                            + " report_extra=" + stringValue(reportExtra));
                    // 原方法返回 void。这里不继续执行，从而不显示真实分享面板。
                    return null;
                } catch (Throwable throwable) {
                    // 回调失败时回退原分享流程，避免“去完成”按钮失效。
                    recordRuntimeFallback("分享任务入口", throwable);
                    return chain.proceed();
                }
            });

            recordHookGroup("分享任务入口");
            info("HOOK_SHARE_OK method=" + SHARE_UTIL + ".E(Context,HBShareData)");
        } catch (Throwable throwable) {
            error("HOOK_SHARE_ERROR method=" + SHARE_UTIL + ".E", throwable);
        }
    }

    /**
     * 任务接口会把部分“分享”任务下发成 type=url，所以点击后不会进入统一分享入口。
     * 在任务行完成绑定后接管“去完成”的容器点击。不能只调用任务页回调，因为它只弹
     * “分享成功”Toast；必须再套用应用自己的 ShareReportUtils.Listener，让原生
     * /share/behavior/success 埋点携带正确 src 和 report_extra 上报到服务端。
     */
    private void installTaskButtonHook(ClassLoader classLoader) {
        try {
            Class<?> adapterClass = Class.forName(TASK_ADAPTER, false, classLoader);
            Class<?> holderClass = Class.forName(TASK_HOLDER, false, classLoader);
            Class<?> taskClass = Class.forName(TASK_INFO, false, classLoader);
            Class<?> fragmentClass = Class.forName(TASK_FRAGMENT, false, classLoader);

            Method bind = adapterClass.getDeclaredMethod("o", holderClass, taskClass);
            Method findView = holderClass.getMethod("i", int.class);
            Method getTitle = taskClass.getMethod("getTitle");
            Method getType = taskClass.getMethod("getType");
            Method getState = taskClass.getMethod("getState");
            Method getReportExtra = taskClass.getMethod("getReport_extra");
            Method reportTaskClick = fragmentClass.getMethod("N3", fragmentClass, taskClass);
            Method getTaskShareListener = fragmentClass.getMethod("b4", fragmentClass);
            Field fragmentField = adapterClass.getDeclaredField("b");

            bind.setAccessible(true);
            findView.setAccessible(true);
            fragmentField.setAccessible(true);

            hook(bind).intercept(chain -> {
                Object result = chain.proceed();
                Object holder = chain.getArg(0);
                Object task = chain.getArg(1);
                if (holder == null || task == null) {
                    return result;
                }

                try {
                    String title = stringValue(getTitle.invoke(task));
                    String type = stringValue(getType.invoke(task));
                    if (!isShareTask(title, type)) {
                        return result;
                    }

                    String state = stringValue(getState.invoke(task));

                    // 已完成和待领奖按钮保留原行为，只接管仍需“去完成”的任务。
                    if ("finish".equals(state) || "can_reward".equals(state)) {
                        return result;
                    }

                    // report_extra 解析和 source 映射只对仍需完成的分享任务执行，
                    // 避免 Adapter 每次绑定已完成任务时重复反射解析 JSON。
                    Object reportExtra = getReportExtra.invoke(task);
                    String source = resolveShareSource(title, reportExtra);

                    View stateContainer = findTaskStateView(holder, findView, "vg_state",
                            CURRENT_TASK_STATE_CONTAINER_ID);
                    if (stateContainer == null || stateContainer.getVisibility() != View.VISIBLE) {
                        return result;
                    }

                    Object fragment = fragmentField.get(chain.getThisObject());
                    if (fragment == null) {
                        warn("TASK_BIND_SKIP reason=fragment_missing title=" + title);
                        return result;
                    }

                    // 任务 Adapter 会频繁绑定；不在生产热路径输出完整 JSON 和 URL。
                    if (VERBOSE_TASK_LOG) {
                        String buttonText = readTaskButtonText(holder, findView);
                        info("TASK_BIND_MATCH title=" + title
                                + " type=" + type
                                + " state=" + state
                                + " button=" + buttonText
                                + " src=" + source);
                    }

                    stateContainer.setClickable(true);
                    stateContainer.setOnClickListener(view -> {
                        // 保留应用原本的任务点击埋点，但不再执行 url 跳转。
                        try {
                            reportTaskClick.invoke(null, fragment, task);
                        } catch (Throwable throwable) {
                            warn("TASK_REPORT_ERROR title=" + title + " error="
                                    + unwrap(throwable).getClass().getSimpleName());
                        }

                        try {
                            Object listener = getTaskShareListener.invoke(null, fragment);
                            if (listener == null) {
                                throw new IllegalStateException("task share listener is null");
                            }
                            Object reportingListener = createReportingListener(
                                    source, listener, reportExtra, classLoader);
                            String media = dispatchShareSuccess(reportingListener, classLoader);
                            info("TASK_SHARE_REPORT_OK title=" + title
                                    + " type=" + type
                                    + " src=" + source
                                    + " media=" + media);

                            // success 事件是立即上报；稍后静默拉取服务端状态。多个
                            // 任务连续完成时只保留最后一次刷新，避免重复 u4() 请求。
                            scheduleSilentTaskRefresh(fragment, "TASK");
                        } catch (Throwable throwable) {
                            error("TASK_SHARE_REPORT_ERROR title=" + title,
                                    unwrap(throwable));
                        }
                    });
                } catch (Throwable throwable) {
                    recordRuntimeFallback("分享任务按钮绑定", throwable);
                }
                return result;
            });

            recordHookGroup("分享任务按钮");
            info("HOOK_TASK_BUTTON_OK method=" + TASK_ADAPTER + ".o(holder,task)");
        } catch (Throwable throwable) {
            error("HOOK_TASK_BUTTON_ERROR method=" + TASK_ADAPTER + ".o", throwable);
        }
    }

    /**
     * 任务页请求成功后会由 UserTaskFragmentV2.n4(fragment, TaskResultObj) 消费数据。
     * 在这个统一入口处理“每日首次启动”功能，不依赖用户是否点开了某一行任务，
     * 也不会把同一天的多次进程启动重复计数。
     */
    private void installDailyTaskHook(ClassLoader classLoader) {
        try {
            try {
                Class<?> accountUtils = Class.forName(
                        "com.max.xiaoheihe.utils.i0", false, classLoader);
                loginStateMethod = accountUtils.getDeclaredMethod("s");
                currentUserIdMethod = accountUtils.getDeclaredMethod("j");
                loginStateMethod.setAccessible(true);
                currentUserIdMethod.setAccessible(true);
                recordHookGroup("每日任务账号");
            } catch (Throwable throwable) {
                loginStateMethod = null;
                currentUserIdMethod = null;
                warn("DAILY_TASK_ACCOUNT_PREPARE_ERROR error="
                        + unwrap(throwable).getClass().getSimpleName());
            }

            Class<?> fragmentClass = Class.forName(TASK_FRAGMENT, false, classLoader);
            Class<?> resultClass = Class.forName(TASK_RESULT, false, classLoader);
            Method consume = fragmentClass.getDeclaredMethod(
                    "n4", fragmentClass, resultClass);
            consume.setAccessible(true);
            hook(consume).intercept(chain -> {
                Object result = chain.proceed();
                scheduleDailyShareTasks(chain.getArg(0), chain.getArg(1), classLoader);
                return result;
            });
            recordHookGroup("每日分享任务");
            info("HOOK_DAILY_TASK_OK method=" + TASK_FRAGMENT + ".n4");
        } catch (Throwable throwable) {
            error("HOOK_DAILY_TASK_ERROR method=" + TASK_FRAGMENT + ".n4", throwable);
        }
    }

    /**
     * 首页稳定 resume 后直接请求任务接口；不再依赖用户进入“我的任务”页面。
     * 请求链复用原生 u4() 的 IO/Main 调度，失败时只做一次有限重试。
     */
    private void triggerDailyShareFetch(ClassLoader classLoader) {
        if (!dailyShareTaskSnapshot || !shareTaskSnapshot) {
            return;
        }
        Context context = targetContext;
        if (context == null) {
            return;
        }
        String accountKey = resolveDailyAccountKey();
        if (accountKey.isEmpty()) {
            return;
        }
        String day = currentDay();
        DailyShareRuntimeState runtimeState = readDailyShareState(
                context, accountKey);
        if (day.equals(runtimeState.day)
                && DAILY_SHARE_STATE_CONFIRMED.equals(runtimeState.state)) {
            return;
        }
        if (day.equals(runtimeState.day)
                && DAILY_SHARE_STATE_IN_PROGRESS.equals(runtimeState.state)) {
            info("DAILY_TASK_RECOVERY_SCHEDULED day=" + day
                    + " previous_tasks=" + runtimeState.taskKeys.size());
        }
        final long generation;
        synchronized (this) {
            if (day.equals(dailyShareSuppressedDay)
                    && accountKey.equals(dailyShareSuppressedAccount)) {
                return;
            }
            if (dailyShareFetchRequested || dailyShareInProgress) {
                return;
            }
            dailyShareFetchRequested = true;
            dailyShareActiveAttempt = 1;
            generation = ++dailyShareRequestGeneration;
        }
        mainHandler.postDelayed(
                () -> requestDailyShareList(
                        classLoader, day, accountKey, 1, generation),
                DAILY_SHARE_START_DELAY_MS);
        info("DAILY_TASK_FETCH_SCHEDULED day=" + day
                + " delay_ms=" + DAILY_SHARE_START_DELAY_MS);
    }

    private void requestDailyShareList(ClassLoader classLoader, String day,
                                       String accountKey, int attempt, long generation) {
        if (!isDailyShareRequestActive(generation, attempt)) {
            return;
        }
        if (!day.equals(currentDay()) || !accountKey.equals(resolveDailyAccountKey())) {
            invalidateDailyShareRequest();
            return;
        }
        AtomicBoolean responseReceived = new AtomicBoolean();
        AtomicReference<TaskRequestHandle> requestHolder = new AtomicReference<>();
        try {
            TaskRequestHandle request = requestTaskListOnce(classLoader, new TaskListCallback() {
                @Override
                public void onResult(Object taskResult) {
                    responseReceived.set(true);
                    if (!isDailyShareRequestActive(generation, attempt)) {
                        return;
                    }
                    if (!accountKey.equals(resolveDailyAccountKey())) {
                        invalidateDailyShareRequest();
                        return;
                    }
                    boolean handled = scheduleDailyShareTasks(
                            null, taskResult, classLoader);
                    if (!handled) {
                        scheduleDailyShareRetry(classLoader, day, accountKey,
                                attempt, generation, "invalid_or_unhandled_result");
                    }
                }

                @Override
                public void onFailure(String reason) {
                    responseReceived.set(true);
                    if (isDailyShareRequestActive(generation, attempt)) {
                        scheduleDailyShareRetry(classLoader, day, accountKey,
                                attempt, generation, reason);
                    }
                }
            });
            requestHolder.set(request);
            replaceDailyShareActiveRequest(request, generation, attempt);
            mainHandler.postDelayed(() -> {
                if (!responseReceived.get()
                        && isDailyShareRequestActive(generation, attempt)) {
                    TaskRequestHandle active = requestHolder.get();
                    if (active != null) {
                        active.cancel();
                    }
                    scheduleDailyShareRetry(classLoader, day, accountKey,
                            attempt, generation, "timeout");
                }
            }, DAILY_SHARE_FETCH_TIMEOUT_MS);
            info("DAILY_TASK_FETCH_REQUEST_OK endpoint=/task/list_v2/ attempt=" + attempt);
        } catch (Throwable throwable) {
            scheduleDailyShareRetry(classLoader, day, accountKey,
                    attempt, generation,
                    unwrap(throwable).getClass().getSimpleName());
            error("DAILY_TASK_FETCH_REQUEST_ERROR attempt=" + attempt, unwrap(throwable));
        }
    }

    /** 使用小黑盒原生任务接口和 RxJava 调度读取一次任务列表，不触发任务页面刷新。 */
    private TaskRequestHandle requestTaskListOnce(ClassLoader classLoader,
                                                  TaskListCallback callback) throws Throwable {
        Class<?> networkFactory = Class.forName(
                "com.max.xiaoheihe.network.i", false, classLoader);
        Object service = networkFactory.getMethod("a").invoke(null);
        Class<?> serviceClass = Class.forName(
                "com.max.xiaoheihe.network.e", false, classLoader);
        Object observable = serviceClass.getMethod("ib").invoke(service);

        Class<?> schedulerClass = Class.forName(
                "io.reactivex.h0", false, classLoader);
        Object ioScheduler = Class.forName(
                "io.reactivex.schedulers.b", false, classLoader)
                .getMethod("d").invoke(null);
        observable = observable.getClass().getMethod(
                "I5", schedulerClass).invoke(observable, ioScheduler);
        Object mainScheduler = Class.forName(
                "io.reactivex.android.schedulers.a", false, classLoader)
                .getMethod("c").invoke(null);
        observable = observable.getClass().getMethod(
                "a4", schedulerClass).invoke(observable, mainScheduler);

        TaskRequestHandle request = new TaskRequestHandle();
        Class<?> observerClass = Class.forName("io.reactivex.g0", false, classLoader);
        Object observer = Proxy.newProxyInstance(classLoader,
                new Class<?>[]{observerClass}, (proxy, method, args) -> {
                    String name = method.getName();
                    if ("onSubscribe".equals(name) && args != null && args.length > 0) {
                        request.attachDisposable(args[0]);
                    } else if ("onNext".equals(name) && args != null && args.length > 0) {
                        if (!request.finish()) {
                            return null;
                        }
                        Object taskResult = unwrapTaskResult(args[0]);
                        mainHandler.post(() -> callback.onResult(taskResult));
                    } else if ("onError".equals(name)) {
                        if (!request.finish()) {
                            return null;
                        }
                        Throwable error = args != null && args.length > 0
                                && args[0] instanceof Throwable
                                ? (Throwable) args[0] : null;
                        String reason = error == null ? "unknown"
                                : error.getClass().getSimpleName() + ":"
                                + errorMessage(error);
                        mainHandler.post(() -> callback.onFailure(reason));
                    } else if ("onComplete".equals(name)) {
                        if (request.finish()) {
                            mainHandler.post(() -> callback.onFailure(
                                    "completed_without_result"));
                        }
                    } else if ("hashCode".equals(name)) {
                        return System.identityHashCode(proxy);
                    } else if ("equals".equals(name)) {
                        return args != null && args.length == 1 && proxy == args[0];
                    } else if ("toString".equals(name)) {
                        return "HeyBoxTaskListObserver";
                    }
                    return null;
                });
        Method subscribe = observable.getClass().getMethod("J5", observerClass);
        subscribe.invoke(observable, observer);
        return request;
    }

    private static Object unwrapTaskResult(Object envelope) {
        if (envelope == null) {
            return null;
        }
        try {
            Method getResult = envelope.getClass().getMethod("getResult");
            return getResult.invoke(envelope);
        } catch (NoSuchMethodException ignored) {
            // 某些网络层直接回调 TaskResultObj。
            return envelope;
        } catch (Throwable throwable) {
            return null;
        }
    }

    private void scheduleDailyShareRetry(ClassLoader classLoader, String day,
                                          String accountKey, int attempt,
                                          long generation, String reason) {
        TaskRequestHandle request;
        boolean giveUp;
        synchronized (this) {
            if (!dailyShareFetchRequested
                    || dailyShareRequestGeneration != generation
                    || dailyShareActiveAttempt != attempt) {
                return;
            }
            request = dailyShareActiveRequest;
            dailyShareActiveRequest = null;
            giveUp = attempt >= DAILY_SHARE_MAX_FETCH_ATTEMPTS;
            if (giveUp) {
                dailyShareFetchRequested = false;
                dailyShareActiveAttempt = 0;
                dailyShareRequestGeneration++;
                dailyShareSuppressedDay = day;
                dailyShareSuppressedAccount = accountKey;
            } else {
                dailyShareActiveAttempt = attempt + 1;
            }
        }
        if (request != null) {
            request.cancel();
        }
        if (giveUp) {
            warn("DAILY_TASK_FETCH_GIVE_UP day=" + day + " reason=" + reason);
            return;
        }
        warn("DAILY_TASK_FETCH_ERROR attempt=" + attempt + " reason=" + reason);
        mainHandler.postDelayed(
                () -> requestDailyShareList(classLoader, day, accountKey,
                        attempt + 1, generation),
                DAILY_SHARE_RETRY_DELAY_MS);
    }

    private synchronized boolean isDailyShareRequestActive(long generation, int attempt) {
        return dailyShareFetchRequested
                && dailyShareRequestGeneration == generation
                && dailyShareActiveAttempt == attempt;
    }

    private void invalidateDailyShareRequest() {
        TaskRequestHandle request;
        synchronized (this) {
            request = dailyShareActiveRequest;
            dailyShareActiveRequest = null;
            dailyShareFetchRequested = false;
            dailyShareActiveAttempt = 0;
            dailyShareRequestGeneration++;
        }
        if (request != null) {
            request.cancel();
        }
    }

    private void replaceDailyShareActiveRequest(TaskRequestHandle request,
                                                long generation, int attempt) {
        TaskRequestHandle previous;
        synchronized (this) {
            if (!isDailyShareRequestActive(generation, attempt)) {
                request.cancel();
                return;
            }
            previous = dailyShareActiveRequest;
            dailyShareActiveRequest = request;
        }
        if (previous != null && previous != request) {
            previous.cancel();
        }
    }

    private boolean scheduleDailyShareTasks(Object fragment, Object taskResult,
                                            ClassLoader classLoader) {
        if (taskResult == null) {
            return false;
        }
        if (dailyShareInProgress) {
            return true;
        }

        try {
            Context context = fragment == null ? targetContext : getFragmentContext(fragment);
            if (context == null) {
                warn("DAILY_TASK_SKIP reason=context_missing");
                return false;
            }

            String day = currentDay();
            String accountKey = resolveDailyAccountKey();
            if (accountKey.isEmpty()) {
                warn("DAILY_TASK_SKIP reason=not_logged_in");
                return false;
            }
            TaskCollectionResult collection = collectShareTasks(taskResult);
            if (!collection.isReliable()) {
                warn("DAILY_TASK_PARSE_INCOMPATIBLE examined=" + collection.examined
                        + " failures=" + collection.parseFailures
                        + " structure=" + collection.structureRecognized);
                return false;
            }
            List<Object> tasks = collection.tasks;
            synchronized (this) {
                dailyShareSuppressedDay = "";
                dailyShareSuppressedAccount = "";
            }
            if (tasks.isEmpty()) {
                writeDailyShareState(context, day, accountKey,
                        DAILY_SHARE_STATE_CONFIRMED, new LinkedHashSet<>());
                invalidateDailyShareRequest();
                info("DAILY_TASK_SKIP reason=no_pending_share_task");
                return true;
            }
            info("DAILY_TASK_DISCOVERED count=" + tasks.size()
                    + " titles=" + taskTitles(tasks));

            synchronized (this) {
                if (dailyShareInProgress) {
                    return true;
                }
                SharedPreferences runtime = context.getSharedPreferences(
                        DAILY_RUNTIME_PREFS, Context.MODE_PRIVATE);
                if (day.equals(runtime.getString(dailyShareDateKey(accountKey), ""))
                        && DAILY_SHARE_STATE_CONFIRMED.equals(runtime.getString(
                        dailyShareStateKey(accountKey), ""))) {
                    invalidateDailyShareRequest();
                    info("DAILY_TASK_SKIP reason=already_confirmed day=" + day);
                    return true;
                }
                // 这里只写 IN_PROGRESS。进程中断或服务器未确认时，下一次启动会先
                // 重新读取服务端，仅处理仍处于 pending 的任务；绝不提前写完成态。
                writeDailyShareState(context, day, accountKey,
                        DAILY_SHARE_STATE_IN_PROGRESS, collectTaskKeys(tasks));
                dailyShareInProgress = true;
            }

            info("DAILY_TASK_START day=" + day + " count=" + tasks.size());
            DailyShareSummary summary = new DailyShareSummary(
                    tasks.size(), day, accountKey, fragment);
            for (int index = 0; index < tasks.size(); index++) {
                final Object task = tasks.get(index);
                final int taskIndex = index;
                mainHandler.postDelayed(() -> performDailyShareTask(
                        fragment, task, taskIndex, summary, classLoader, context),
                        index * DAILY_SHARE_REPORT_INTERVAL_MS);
            }
            mainHandler.postDelayed(() -> finishDailyShareTasks(
                            summary, context, classLoader),
                    tasks.size() * DAILY_SHARE_REPORT_INTERVAL_MS + 350L);
            return true;
        } catch (Throwable throwable) {
            dailyShareInProgress = false;
            error("DAILY_TASK_SCHEDULE_ERROR", unwrap(throwable));
            return false;
        }
    }

    private void writeDailyShareState(Context context, String day, String accountKey,
                                      String state, Set<String> taskKeys) {
        if (context == null || day == null || day.isEmpty()
                || accountKey == null || accountKey.isEmpty()
                || state == null || state.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editor = context.getSharedPreferences(
                        DAILY_RUNTIME_PREFS, Context.MODE_PRIVATE).edit()
                .putString(dailyShareDateKey(accountKey), day)
                .putString(dailyShareStateKey(accountKey), state);
        if (taskKeys == null || taskKeys.isEmpty()) {
            editor.remove(dailyShareTasksKey(accountKey));
        } else {
            editor.putStringSet(dailyShareTasksKey(accountKey),
                    new LinkedHashSet<>(taskKeys));
        }
        // 每个账号每天最多写入数次，使用同步提交确保进程立即被杀时状态仍可恢复。
        if (!editor.commit()) {
            warn("DAILY_TASK_STATE_WRITE_FAILED day=" + day + " state=" + state);
        }
    }

    private static String dailyShareDateKey(String accountKey) {
        return DAILY_SHARE_DATE_PREFIX + accountKey;
    }

    private static String dailyShareStateKey(String accountKey) {
        return DAILY_SHARE_STATE_PREFIX + accountKey;
    }

    private static String dailyShareTasksKey(String accountKey) {
        return DAILY_SHARE_TASKS_PREFIX + accountKey;
    }

    private DailyShareRuntimeState readDailyShareState(Context context, String accountKey) {
        SharedPreferences runtime = context.getSharedPreferences(
                DAILY_RUNTIME_PREFS, Context.MODE_PRIVATE);
        String day = runtime.getString(dailyShareDateKey(accountKey), "");
        String state = runtime.getString(dailyShareStateKey(accountKey), "");
        Set<String> stored = runtime.getStringSet(dailyShareTasksKey(accountKey), null);
        // 0.7.5 及更早版本只有日期，没有可信的完成态。把它视为未知状态并重新
        // 查询服务器；已完成时只产生一次列表请求，不会再次提交分享任务。
        return new DailyShareRuntimeState(day, state,
                stored == null ? new LinkedHashSet<>() : new LinkedHashSet<>(stored));
    }

    private String resolveDailyAccountKey() {
        Method login = loginStateMethod;
        Method userId = currentUserIdMethod;
        if (login == null || userId == null) {
            return "";
        }
        try {
            if (!Boolean.TRUE.equals(login.invoke(null))) {
                return "";
            }
            return stringValue(userId.invoke(null)).trim();
        } catch (Throwable ignored) {
            return "";
        }
    }

    private static String currentDay() {
        return LocalDate.now(DAILY_TASK_ZONE).toString();
    }

    private Context getFragmentContext(Object fragment) {
        try {
            Method getContext = fragment.getClass().getMethod("getContext");
            Object value = getContext.invoke(fragment);
            if (value instanceof Context) {
                return (Context) value;
            }
        } catch (Throwable ignored) {
            // 某些 Fragment 生命周期边界可能暂时没有 Context，回退到首页上下文。
        }
        Context fallback = targetContext;
        return fallback == null ? null : fallback;
    }

    @SuppressWarnings("unchecked")
    private TaskCollectionResult collectShareTasks(Object taskResult) throws Throwable {
        TaskCollectionResult result = new TaskCollectionResult();
        Method getTaskList = taskResult.getClass().getMethod("getTask_list");
        Object groups = getTaskList.invoke(taskResult);
        result.structureRecognized = groups == null || groups instanceof List;
        if (groups instanceof List) {
            for (Object group : (List<Object>) groups) {
                if (group == null) {
                    continue;
                }
                Method getTasks = group.getClass().getMethod("getTasks");
                Object taskList = getTasks.invoke(group);
                if (taskList != null && !(taskList instanceof List)) {
                    result.structureRecognized = false;
                }
                if (taskList instanceof List) {
                    for (Object task : (List<Object>) taskList) {
                        addPendingShareTask(result, task);
                    }
                }
            }
        }

        // task_list 与 task_lines 是并列区域，不是互斥的。之前只有在
        // task_list 为空时才读取 task_lines，导致常见的“两项在 task_list、
        // 游戏评价在 task_lines”响应被漏掉一项。
        Method getLines;
        try {
            getLines = taskResult.getClass().getMethod("getTask_lines");
        } catch (NoSuchMethodException ignored) {
            // 旧版本没有 task_lines，已经检查过 task_list。
            return result;
        }
        Object lines = getLines.invoke(taskResult);
        if (lines != null) {
            Method getItems = lines.getClass().getMethod("getTask_line_items");
            Object items = getItems.invoke(lines);
            if (items != null && !(items instanceof List)) {
                result.structureRecognized = false;
            }
            if (items instanceof List) {
                for (Object line : (List<Object>) items) {
                    if (line == null) {
                        continue;
                    }
                    Method getTasks = line.getClass().getMethod("getTasks");
                    Object taskList = getTasks.invoke(line);
                    if (taskList != null && !(taskList instanceof List)) {
                        result.structureRecognized = false;
                    }
                    if (taskList instanceof List) {
                        for (Object task : (List<Object>) taskList) {
                            addPendingShareTask(result, task);
                        }
                    }
                }
            }
        }
        return result;
    }

    private void addPendingShareTask(TaskCollectionResult result, Object task) {
        if (task == null) {
            return;
        }
        result.examined++;
        try {
            Method getTitle = task.getClass().getMethod("getTitle");
            Method getType = task.getClass().getMethod("getType");
            Method getState = task.getClass().getMethod("getState");
            String title = stringValue(getTitle.invoke(task));
            String type = stringValue(getType.invoke(task));
            String state = stringValue(getState.invoke(task));
            if (isShareTask(title, type)
                    && !"finish".equalsIgnoreCase(state)
                    && !"can_reward".equalsIgnoreCase(state)
                    && !containsEquivalentTask(result.tasks, task)) {
                result.tasks.add(task);
            }
        } catch (Throwable throwable) {
            result.parseFailures++;
            warn("DAILY_TASK_READ_ERROR error="
                    + unwrap(throwable).getClass().getSimpleName());
        }
    }

    private Set<String> collectTaskKeys(List<Object> tasks) {
        Set<String> keys = new LinkedHashSet<>();
        for (Object task : tasks) {
            String key = taskIdentity(task);
            if (!key.isEmpty()) {
                keys.add(key);
            }
        }
        return keys;
    }

    private boolean containsEquivalentTask(List<Object> tasks, Object candidate) {
        if (tasks.contains(candidate)) {
            return true;
        }
        String candidateKey = taskIdentity(candidate);
        if (candidateKey.isEmpty()) {
            return false;
        }
        for (Object existing : tasks) {
            if (candidateKey.equals(taskIdentity(existing))) {
                return true;
            }
        }
        return false;
    }

    private String taskTitles(List<Object> tasks) {
        StringBuilder result = new StringBuilder();
        for (Object task : tasks) {
            if (result.length() > 0) {
                result.append(" | ");
            }
            try {
                result.append(stringValue(task.getClass().getMethod("getTitle")
                        .invoke(task)));
            } catch (Throwable ignored) {
                result.append("<unknown>");
            }
        }
        return result.toString();
    }

    private String taskIdentity(Object task) {
        if (task == null) {
            return "";
        }
        for (String getterName : new String[]{"getTask_id", "getTaskId", "getId"}) {
            try {
                Method getter = task.getClass().getMethod(getterName);
                String value = stringValue(getter.invoke(task));
                if (!value.isEmpty()) {
                    return "id:" + value;
                }
            } catch (Throwable ignored) {
                // 不同版本字段名不同，继续尝试下一个。
            }
        }
        try {
            String title = stringValue(task.getClass().getMethod("getTitle").invoke(task));
            String type = stringValue(task.getClass().getMethod("getType").invoke(task));
            String url = "";
            try {
                url = stringValue(task.getClass().getMethod("getUrl").invoke(task));
            } catch (Throwable ignored) {
                // 标题与类型在当前任务列表中已经足以稳定区分三个分享任务。
            }
            return title + "|" + type + "|" + url;
        } catch (Throwable ignored) {
            return "";
        }
    }

    private void performDailyShareTask(Object fragment, Object task, int index,
                                       DailyShareSummary summary, ClassLoader classLoader,
                                       Context context) {
        String title = "";
        try {
            if (!summary.accountKey.equals(resolveDailyAccountKey())) {
                throw new IllegalStateException("account changed");
            }
            Class<?> fragmentClass = Class.forName(TASK_FRAGMENT, false, classLoader);
            Class<?> taskClass = Class.forName(TASK_INFO, false, classLoader);
            Method reportTaskClick = fragmentClass.getMethod("N3", fragmentClass, taskClass);
            Method getReportExtra = taskClass.getMethod("getReport_extra");
            Method getTitle = taskClass.getMethod("getTitle");
            Object reportExtra = getReportExtra.invoke(task);
            title = stringValue(getTitle.invoke(task));
            String source = resolveShareSource(title, reportExtra);

            if (fragment != null) {
                reportTaskClick.invoke(null, fragment, task);
            }
            Object silentListener = createSilentShareListener(classLoader);
            Object reportingListener = createReportingListener(
                    source, silentListener, reportExtra, classLoader);
            String media = dispatchShareSuccess(reportingListener, classLoader);
            long exp = readTaskReward(task, "getAward_exp");
            long coin = readTaskReward(task, "getAward_coin");
            if (exp == 0L || coin == 0L) {
                long[] parsed = readRewardDescriptions(task);
                if (exp == 0L) {
                    exp = parsed[0];
                }
                if (coin == 0L) {
                    coin = parsed[1];
                }
            }
            synchronized (summary) {
                summary.completed++;
                summary.exp += exp;
                summary.coin += coin;
                summary.reports.add(new DailyShareRecord(
                        taskIdentity(task), exp, coin));
            }
            info("DAILY_TASK_OK index=" + index + " title=" + title
                    + " src=" + source + " media=" + media
                    + " exp=" + exp + " coin=" + coin);
        } catch (Throwable throwable) {
            error("DAILY_TASK_ERROR index=" + index + " title=" + title,
                    unwrap(throwable));
        }
    }

    private void finishDailyShareTasks(DailyShareSummary summary, Context context,
                                       ClassLoader classLoader) {
        int completed;
        long exp;
        long coin;
        synchronized (summary) {
            completed = summary.completed;
            exp = summary.exp;
            coin = summary.coin;
        }
        if (completed <= 0) {
            dailyShareInProgress = false;
            invalidateDailyShareRequest();
            warn("DAILY_TASK_FINISH completed=0");
            Toast.makeText(context,
                    "今日分享任务自动完成失败，请在任务页手动完成",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        info("DAILY_TASK_REPORT_FINISH reported=" + completed
                + " scheduled=" + summary.scheduled
                + " exp=" + exp + " coin=" + coin
                + " confirm_delay_ms=" + DAILY_SHARE_CONFIRM_DELAY_MS);
        mainHandler.postDelayed(() -> requestDailyShareConfirmation(
                        summary, context, classLoader, 1),
                DAILY_SHARE_CONFIRM_DELAY_MS);
    }

    /** 分享成功回调只代表请求已提交；重新读取服务端状态后才统计完成数与奖励。 */
    private void requestDailyShareConfirmation(DailyShareSummary summary, Context context,
                                               ClassLoader classLoader, int attempt) {
        if (!dailyShareInProgress) {
            return;
        }
        if (!summary.day.equals(currentDay())
                || !summary.accountKey.equals(resolveDailyAccountKey())) {
            finishDailyShareConfirmationFailure(
                    summary, context, "日期或账号已经变化");
            return;
        }
        AtomicBoolean responseReceived = new AtomicBoolean();
        AtomicReference<TaskRequestHandle> requestHolder = new AtomicReference<>();
        try {
            TaskRequestHandle request = requestTaskListOnce(classLoader, new TaskListCallback() {
                @Override
                public void onResult(Object taskResult) {
                    if (!responseReceived.compareAndSet(false, true)) {
                        return;
                    }
                    handleDailyShareConfirmation(
                            summary, context, classLoader, taskResult, attempt);
                }

                @Override
                public void onFailure(String reason) {
                    if (!responseReceived.compareAndSet(false, true)) {
                        return;
                    }
                    retryOrFinishDailyShareConfirmation(
                            summary, context, classLoader, attempt, reason);
                }
            });
            requestHolder.set(request);
            summary.replaceActiveRequest(request);
            mainHandler.postDelayed(() -> {
                if (responseReceived.compareAndSet(false, true)) {
                    TaskRequestHandle active = requestHolder.get();
                    if (active != null) {
                        active.cancel();
                    }
                    retryOrFinishDailyShareConfirmation(summary, context, classLoader,
                            attempt, "timeout");
                }
            }, DAILY_SHARE_FETCH_TIMEOUT_MS);
            info("DAILY_TASK_CONFIRM_REQUEST attempt=" + attempt);
        } catch (Throwable throwable) {
            retryOrFinishDailyShareConfirmation(summary, context, classLoader,
                    attempt, unwrap(throwable).getClass().getSimpleName());
        }
    }

    private void handleDailyShareConfirmation(DailyShareSummary summary, Context context,
                                              ClassLoader classLoader, Object taskResult,
                                              int attempt) {
        try {
            if (taskResult == null) {
                retryOrFinishDailyShareConfirmation(summary, context, classLoader,
                        attempt, "empty_result");
                return;
            }
            TaskCollectionResult collection = collectShareTasks(taskResult);
            if (!collection.isReliable()) {
                retryOrFinishDailyShareConfirmation(summary, context, classLoader,
                        attempt, "parse_incompatible");
                return;
            }
            List<Object> pendingTasks = collection.tasks;
            Set<String> pendingKeys = new LinkedHashSet<>();
            for (Object task : pendingTasks) {
                String key = taskIdentity(task);
                if (!key.isEmpty()) {
                    pendingKeys.add(key);
                }
            }

            List<DailyShareRecord> reports;
            int localCompleted;
            synchronized (summary) {
                reports = new ArrayList<>(summary.reports);
                localCompleted = summary.completed;
            }
            int confirmed = 0;
            long confirmedExp = 0L;
            long confirmedCoin = 0L;
            for (DailyShareRecord record : reports) {
                boolean stillPending = record.taskKey.isEmpty()
                        ? !pendingTasks.isEmpty()
                        : pendingKeys.contains(record.taskKey);
                if (!stillPending) {
                    confirmed++;
                    confirmedExp += record.exp;
                    confirmedCoin += record.coin;
                }
            }

            boolean allConfirmed = localCompleted >= summary.scheduled
                    && pendingTasks.isEmpty();
            if (!allConfirmed && attempt < DAILY_SHARE_CONFIRM_MAX_ATTEMPTS) {
                info("DAILY_TASK_CONFIRM_PENDING attempt=" + attempt
                        + " confirmed=" + confirmed
                        + " pending=" + pendingTasks.size());
                mainHandler.postDelayed(() -> requestDailyShareConfirmation(
                                summary, context, classLoader, attempt + 1),
                        DAILY_SHARE_CONFIRM_DELAY_MS);
                return;
            }
            if (!allConfirmed && schedulePendingDailyShareRepair(
                    summary, context, classLoader, pendingTasks)) {
                return;
            }
            finishDailyShareConfirmation(summary, context, confirmed,
                    confirmedExp, confirmedCoin, pendingTasks.size(), allConfirmed);
        } catch (Throwable throwable) {
            retryOrFinishDailyShareConfirmation(summary, context, classLoader,
                    attempt, unwrap(throwable).getClass().getSimpleName());
        }
    }

    /**
     * 两次服务端确认后，仅补报本轮最初提交但仍处于待完成状态的任务一次。
     * 正常成功路径不会进入这里，因此不会增加日常请求；补报仍在同一次启动流程中，
     * 也不会破坏“每天只自动执行一次”的语义。
     */
    private boolean schedulePendingDailyShareRepair(DailyShareSummary summary,
                                                    Context context,
                                                    ClassLoader classLoader,
                                                    List<Object> pendingTasks) {
        if (pendingTasks == null || pendingTasks.isEmpty()) {
            return false;
        }
        List<Object> repairTasks = new ArrayList<>();
        synchronized (summary) {
            if (summary.repairAttempted) {
                return false;
            }
            Set<String> scheduledKeys = new LinkedHashSet<>();
            for (DailyShareRecord record : summary.reports) {
                if (!record.taskKey.isEmpty()) {
                    scheduledKeys.add(record.taskKey);
                }
            }
            for (Object task : pendingTasks) {
                String key = taskIdentity(task);
                if (!key.isEmpty() && scheduledKeys.contains(key)) {
                    repairTasks.add(task);
                }
            }
            if (repairTasks.isEmpty()) {
                return false;
            }
            summary.repairAttempted = true;
        }

        info("DAILY_TASK_REPAIR_START count=" + repairTasks.size()
                + " titles=" + taskTitles(repairTasks));
        for (int index = 0; index < repairTasks.size(); index++) {
            Object task = repairTasks.get(index);
            int repairIndex = index;
            mainHandler.postDelayed(() -> performDailyShareRepairTask(
                            summary, task, repairIndex, classLoader),
                    index * DAILY_SHARE_REPORT_INTERVAL_MS);
        }
        mainHandler.postDelayed(() -> requestDailyShareConfirmation(
                        summary, context, classLoader, 1),
                repairTasks.size() * DAILY_SHARE_REPORT_INTERVAL_MS
                        + DAILY_SHARE_CONFIRM_DELAY_MS);
        return true;
    }

    private void performDailyShareRepairTask(DailyShareSummary summary, Object task,
                                             int index, ClassLoader classLoader) {
        String title = "";
        try {
            if (!dailyShareInProgress
                    || !summary.day.equals(currentDay())
                    || !summary.accountKey.equals(resolveDailyAccountKey())) {
                throw new IllegalStateException("daily task context changed");
            }
            Class<?> taskClass = Class.forName(TASK_INFO, false, classLoader);
            Method getReportExtra = taskClass.getMethod("getReport_extra");
            Method getTitle = taskClass.getMethod("getTitle");
            Object reportExtra = getReportExtra.invoke(task);
            title = stringValue(getTitle.invoke(task));
            String source = resolveShareSource(title, reportExtra);
            Object reportingListener = createReportingListener(
                    source, createSilentShareListener(classLoader),
                    reportExtra, classLoader);
            String media = dispatchShareSuccess(reportingListener, classLoader);
            info("DAILY_TASK_REPAIR_OK index=" + index
                    + " title=" + title + " src=" + source + " media=" + media);
        } catch (Throwable throwable) {
            error("DAILY_TASK_REPAIR_ERROR index=" + index + " title=" + title,
                    unwrap(throwable));
        }
    }

    private void retryOrFinishDailyShareConfirmation(DailyShareSummary summary,
                                                     Context context,
                                                     ClassLoader classLoader,
                                                     int attempt, String reason) {
        summary.cancelActiveRequest();
        if (attempt < DAILY_SHARE_CONFIRM_MAX_ATTEMPTS) {
            warn("DAILY_TASK_CONFIRM_RETRY attempt=" + attempt
                    + " reason=" + reason);
            mainHandler.postDelayed(() -> requestDailyShareConfirmation(
                            summary, context, classLoader, attempt + 1),
                    DAILY_SHARE_RETRY_DELAY_MS);
            return;
        }
        finishDailyShareConfirmationFailure(summary, context, reason);
    }

    private void finishDailyShareConfirmation(DailyShareSummary summary, Context context,
                                               int confirmed, long exp, long coin,
                                               int pending, boolean allConfirmed) {
        summary.cancelActiveRequest();
        dailyShareInProgress = false;
        invalidateDailyShareRequest();
        if (allConfirmed) {
            writeDailyShareState(context, summary.day, summary.accountKey,
                    DAILY_SHARE_STATE_CONFIRMED, new LinkedHashSet<>());
        }
        if (confirmed > 0) {
            String message = String.format(Locale.ROOT,
                    "今日自动完成 %d 个分享任务，获得 %d 经验、%d 盒币",
                    confirmed, exp, coin);
            if (!allConfirmed) {
                message += "；仍有 " + pending + " 个待确认";
            }
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context,
                    "分享任务已提交，但服务器暂未确认，请稍后在任务页查看",
                    Toast.LENGTH_SHORT).show();
        }
        info("DAILY_TASK_CONFIRM_FINISH confirmed=" + confirmed
                + " scheduled=" + summary.scheduled
                + " pending=" + pending
                + " all_confirmed=" + allConfirmed
                + " exp=" + exp + " coin=" + coin);
        Object fragment = summary.fragmentReference.get();
        scheduleSilentTaskRefresh(fragment, "DAILY");
    }

    private void finishDailyShareConfirmationFailure(DailyShareSummary summary,
                                                     Context context, String reason) {
        summary.cancelActiveRequest();
        dailyShareInProgress = false;
        invalidateDailyShareRequest();
        warn("DAILY_TASK_CONFIRM_FAILED reason=" + reason);
        Toast.makeText(context,
                "分享任务已提交，但服务器确认失败，请稍后在任务页查看",
                Toast.LENGTH_SHORT).show();
        Object fragment = summary.fragmentReference.get();
        scheduleSilentTaskRefresh(fragment, "DAILY");
    }

    /** 将同一个任务页在短时间内的多次刷新合并为一次 u4() 请求。 */
    private void scheduleSilentTaskRefresh(Object fragment, String source) {
        if (fragment == null) {
            return;
        }
        WeakReference<Object> fragmentReference = new WeakReference<>(fragment);
        final Runnable[] refreshHolder = new Runnable[1];
        Runnable refresh = () -> {
            Object target = fragmentReference.get();
            if (target == null) {
                return;
            }
            try {
                Method method = target.getClass().getDeclaredMethod("u4");
                method.setAccessible(true);
                method.invoke(target);
                info(source + "_TASK_SILENT_REFRESH_OK");
            } catch (Throwable throwable) {
                warn(source + "_TASK_SILENT_REFRESH_ERROR error="
                        + unwrap(throwable).getClass().getSimpleName());
            } finally {
                synchronized (pendingTaskRefreshes) {
                    if (pendingTaskRefreshes.get(target) == refreshHolder[0]) {
                        pendingTaskRefreshes.remove(target);
                    }
                }
            }
        };
        refreshHolder[0] = refresh;

        synchronized (pendingTaskRefreshes) {
            Runnable previous = pendingTaskRefreshes.put(fragment, refresh);
            if (previous != null) {
                mainHandler.removeCallbacks(previous);
            }
            mainHandler.postDelayed(refresh, 2500L);
        }
    }

    private Object createSilentShareListener(ClassLoader classLoader) throws Throwable {
        Class<?> listenerClass = Class.forName(SHARE_LISTENER, true, classLoader);
        return Proxy.newProxyInstance(classLoader, new Class<?>[]{listenerClass},
                (proxy, method, args) -> {
                    if (method.getReturnType() == boolean.class) {
                        return false;
                    }
                    if (method.getReturnType() == int.class) {
                        return 0;
                    }
                    if (method.getReturnType() == long.class) {
                        return 0L;
                    }
                    return null;
                });
    }

    private long readTaskReward(Object task, String getterName) {
        try {
            Method getter = task.getClass().getMethod(getterName);
            return parseReward(stringValue(getter.invoke(task)));
        } catch (Throwable ignored) {
            return 0L;
        }
    }

    @SuppressWarnings("unchecked")
    private long[] readRewardDescriptions(Object task) {
        long exp = 0L;
        long coin = 0L;
        try {
            Method getter = task.getClass().getMethod("getAward_desc_v2");
            Object values = getter.invoke(task);
            if (values instanceof List) {
                for (Object item : (List<Object>) values) {
                    if (item == null) {
                        continue;
                    }
                    Method getDesc = item.getClass().getMethod("getDesc");
                    String desc = stringValue(getDesc.invoke(item));
                    long value = parseReward(desc);
                    if (desc.contains("经验") || desc.toLowerCase(Locale.ROOT).contains("exp")) {
                        exp += value;
                    } else if (desc.contains("盒币") || desc.contains("H币")
                            || desc.toLowerCase(Locale.ROOT).contains("coin")) {
                        coin += value;
                    }
                }
            }
        } catch (Throwable ignored) {
            // 奖励描述仅用于提示，不影响任务上报。
        }
        return new long[]{exp, coin};
    }

    private static long parseReward(String value) {
        if (value == null || value.isEmpty()) {
            return 0L;
        }
        StringBuilder digits = new StringBuilder();
        boolean started = false;
        for (int index = 0; index < value.length(); index++) {
            char ch = value.charAt(index);
            if (Character.isDigit(ch)) {
                digits.append(ch);
                started = true;
            } else if (started) {
                break;
            }
        }
        if (digits.length() == 0) {
            return 0L;
        }
        try {
            return Long.parseLong(digits.toString());
        } catch (NumberFormatException ignored) {
            return 0L;
        }
    }

    private interface TaskListCallback {
        void onResult(Object taskResult);

        void onFailure(String reason);
    }

    /** 通过反射持有宿主 RxJava Disposable，超时和状态失效时真正取消订阅。 */
    private static final class TaskRequestHandle {
        private final AtomicBoolean terminal = new AtomicBoolean();
        private final AtomicReference<Object> disposable = new AtomicReference<>();

        void attachDisposable(Object value) {
            if (value == null) {
                return;
            }
            if (!disposable.compareAndSet(null, value)) {
                dispose(value);
                return;
            }
            if (terminal.get()) {
                dispose(disposable.getAndSet(null));
            }
        }

        boolean finish() {
            if (!terminal.compareAndSet(false, true)) {
                return false;
            }
            dispose(disposable.getAndSet(null));
            return true;
        }

        void cancel() {
            terminal.set(true);
            dispose(disposable.getAndSet(null));
        }

        private static void dispose(Object value) {
            if (value == null) {
                return;
            }
            try {
                Method dispose = value.getClass().getMethod("dispose");
                dispose.setAccessible(true);
                dispose.invoke(value);
            } catch (Throwable ignored) {
                // 订阅已经终止或宿主 RxJava 接口变化时无需影响主流程。
            }
        }
    }

    private static final class TaskCollectionResult {
        final List<Object> tasks = new ArrayList<>();
        int examined;
        int parseFailures;
        boolean structureRecognized;

        boolean isReliable() {
            return structureRecognized && parseFailures == 0;
        }
    }

    private static final class DailyShareRuntimeState {
        final String day;
        final String state;
        final Set<String> taskKeys;

        DailyShareRuntimeState(String day, String state, Set<String> taskKeys) {
            this.day = day == null ? "" : day;
            this.state = state == null ? "" : state;
            this.taskKeys = taskKeys;
        }
    }

    private static final class HookGroupProgress {
        final int installed;
        final int expected;

        HookGroupProgress(int installed, int expected) {
            this.installed = installed;
            this.expected = expected;
        }
    }

    /**
     * WeakHashMap 依赖对象的 equals/hashCode，而 MediaData 会在加载过程中把 URL、
     * 原图地址和状态写回自身，导致 hashCode 改变后无法再命中。查看器图片数量很小，
     * 使用弱引用线性表按对象身份比较既不会持有页面，也避开可变哈希问题。
     */
    private static final class WeakIdentitySet<T> {
        private final List<WeakReference<T>> entries = new ArrayList<>();

        boolean contains(T target) {
            if (target == null) {
                return false;
            }
            for (int index = entries.size() - 1; index >= 0; index--) {
                T value = entries.get(index).get();
                if (value == null) {
                    entries.remove(index);
                } else if (value == target) {
                    return true;
                }
            }
            return false;
        }

        boolean add(T target) {
            if (target == null || contains(target)) {
                return false;
            }
            entries.add(new WeakReference<>(target));
            return true;
        }

        boolean remove(T target) {
            boolean removed = false;
            for (int index = entries.size() - 1; index >= 0; index--) {
                T value = entries.get(index).get();
                if (value == null || value == target) {
                    entries.remove(index);
                    removed |= value == target;
                }
            }
            return removed;
        }
    }

    /** O(1) 弱身份映射：键的 equals/hashCode 变化不会破坏缓存，也不会强持有宿主模型。 */
    private static final class WeakIdentityMap<K, V> {
        private final ReferenceQueue<K> queue = new ReferenceQueue<>();
        private final Map<IdentityWeakReference<K>, V> values = new HashMap<>();

        V get(K key) {
            if (key == null) {
                return null;
            }
            removeCollectedKeys();
            return values.get(new IdentityWeakReference<>(key, null));
        }

        void put(K key, V value) {
            if (key == null) {
                return;
            }
            removeCollectedKeys();
            values.put(new IdentityWeakReference<>(key, queue), value);
        }

        @SuppressWarnings("unchecked")
        private void removeCollectedKeys() {
            IdentityWeakReference<K> reference;
            while ((reference = (IdentityWeakReference<K>) queue.poll()) != null) {
                values.remove(reference);
            }
        }
    }

    private static final class IdentityWeakReference<T> extends WeakReference<T> {
        private final int identityHash;

        IdentityWeakReference(T referent, ReferenceQueue<T> queue) {
            super(referent, queue);
            identityHash = System.identityHashCode(referent);
        }

        @Override
        public int hashCode() {
            return identityHash;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdentityWeakReference<?>)) {
                return false;
            }
            Object mine = get();
            return mine != null && mine == ((IdentityWeakReference<?>) other).get();
        }
    }

    private static final class DailyShareRecord {
        final String taskKey;
        final long exp;
        final long coin;

        DailyShareRecord(String taskKey, long exp, long coin) {
            this.taskKey = taskKey;
            this.exp = exp;
            this.coin = coin;
        }
    }

    private static final class DailyShareSummary {
        final int scheduled;
        final String day;
        final String accountKey;
        final WeakReference<Object> fragmentReference;
        final List<DailyShareRecord> reports = new ArrayList<>();
        int completed;
        long exp;
        long coin;
        boolean repairAttempted;
        private TaskRequestHandle activeRequest;

        DailyShareSummary(int scheduled, String day, String accountKey,
                          Object fragment) {
            this.scheduled = scheduled;
            this.day = day;
            this.accountKey = accountKey;
            this.fragmentReference = new WeakReference<>(fragment);
        }

        synchronized void replaceActiveRequest(TaskRequestHandle request) {
            TaskRequestHandle previous = activeRequest;
            activeRequest = request;
            if (previous != null && previous != request) {
                previous.cancel();
            }
        }

        synchronized void cancelActiveRequest() {
            TaskRequestHandle request = activeRequest;
            activeRequest = null;
            if (request != null) {
                request.cancel();
            }
        }
    }

    /**
     * AdsActivity 获取不到开屏广告时，本身就会调用 SplashActivity.Y1(false)
     * 进入完整的原启动流程。让开屏广告选择器返回 null 比直接跳 MainActivity 更稳妥，
     * 不会绕过隐私协议、登录态、访客模式和深链处理。
     */
    private void installSplashAdHook(ClassLoader classLoader) {
        int installed = 0;
        try {
            Class<?> selectorClass = Class.forName(
                    OPEN_SCREEN_AD_SELECTOR, false, classLoader);
            Method selectAd = selectorClass.getDeclaredMethod("g", boolean.class);
            selectAd.setAccessible(true);
            hook(selectAd).intercept(chain -> {
                info("SPLASH_AD_BYPASS launch=" + chain.getArg(0));
                return null;
            });
            installed++;
            info("HOOK_SPLASH_SELECTOR_OK method=" + OPEN_SCREEN_AD_SELECTOR + ".g");
        } catch (Throwable throwable) {
            warn("HOOK_SPLASH_SELECTOR_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

        try {
            Class<?> splashClass = Class.forName(SPLASH_ACTIVITY, false, classLoader);
            Method splashInitialize = findInheritedMethod(splashClass, "k1");
            Method continueLaunch = splashClass.getMethod("Y1", boolean.class);
            Field adBindingField = splashClass.getSuperclass().getDeclaredField("O");
            Class<?> adBindingClass = Class.forName("df.e", false, classLoader);
            Constructor<?> emptyBindingConstructor = null;
            for (Constructor<?> constructor : adBindingClass.getDeclaredConstructors()) {
                boolean referencesOnly = true;
                for (Class<?> parameter : constructor.getParameterTypes()) {
                    if (parameter.isPrimitive()) {
                        referencesOnly = false;
                        break;
                    }
                }
                if (referencesOnly && constructor.getParameterCount() == 12) {
                    emptyBindingConstructor = constructor;
                    break;
                }
            }
            if (emptyBindingConstructor == null) {
                throw new NoSuchMethodException("df.e reference-only constructor");
            }
            splashInitialize.setAccessible(true);
            continueLaunch.setAccessible(true);
            adBindingField.setAccessible(true);
            emptyBindingConstructor.setAccessible(true);
            final Constructor<?> bindingConstructor = emptyBindingConstructor;

            // 比“让广告选择器返回 null”更快：不再创建和绑定广告页面，直接进入
            // SplashActivity 原本的无广告启动分支。隐私协议、登录态和初始化逻辑仍保留。
            hook(splashInitialize).intercept(chain -> {
                Activity splash = (Activity) chain.getThisObject();
                targetContext = splash.getApplicationContext();
                try {
                    // AdsActivity.onDestroy() 只读取 O.j。提前写入全空轻量 binding，
                    // 避免为了销毁流程在主线程 inflate 整套广告布局。
                    if (adBindingField.get(splash) == null) {
                        adBindingField.set(splash, bindingConstructor.newInstance(
                                new Object[bindingConstructor.getParameterCount()]));
                    }
                    continueLaunch.invoke(splash, false);
                    info("SPLASH_FAST_BYPASS");
                    return null;
                } catch (Throwable throwable) {
                    // 目标结构变化时回退原初始化；选择器兼容 Hook 若已安装，
                    // 仍会让宿主走原生无广告分支。
                    recordRuntimeFallback("开屏快速路径", throwable);
                    return chain.proceed();
                }
            });
            installed++;
            recordHookGroup("开屏快速路径");
            info("HOOK_SPLASH_FAST_OK method=" + SPLASH_ACTIVITY + ".k1");
        } catch (Throwable throwable) {
            warn("HOOK_SPLASH_FAST_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }
        recordHookProgress("开屏广告", installed, 2);
        if (installed > 0) {
            info("HOOK_SPLASH_AD_OK methods=" + installed);
        } else {
            error("HOOK_SPLASH_AD_ERROR",
                    new IllegalStateException("No splash ad hook installed"));
        }
    }

    /**
     * 广告净化只拦截广告模型的低频 getter 和明确的展示入口，不扫描 View 树，
     * 也不在 RecyclerView 绑定热路径按资源名反复查找。
     */
    private void installGlobalAdHooks(ClassLoader classLoader) {
        int installed = 0;
        int expected = 0;
        if (adCleanHomeSnapshot) {
            expected += 6;
            int categoryInstalled = 0;
            try {
                Class<?> mainActivity = Class.forName(MAIN_ACTIVITY, false, classLoader);
                categoryInstalled += hookAdVoidMethod(mainActivity, "K2");
                categoryInstalled += hookAdVoidMethod(mainActivity, "S2");
                try {
                    Class<?> innerAd = Class.forName(
                            "com.max.xiaoheihe.bean.InnerAdsInfoObj", false, classLoader);
                    categoryInstalled += hookAdVoidMethod(
                            mainActivity, "V3", innerAd);
                } catch (Throwable throwable) {
                    warn("AD_MAIN_HOOK_SKIP method=V3 reason="
                            + unwrap(throwable).getClass().getSimpleName());
                }
            } catch (Throwable throwable) {
                warn("AD_MAIN_HOOK_SKIP reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
            categoryInstalled += hookEmptyListNoArgGetter(classLoader,
                    "com.max.xiaoheihe.bean.AdsInfosObj", "getInner_ads");
            categoryInstalled += hookConstantNoArgGetter(classLoader,
                    "com.max.xiaoheihe.bean.ads.OverallAdInfo", "getBubble_ad", null);
            categoryInstalled += hookConstantNoArgGetter(classLoader,
                    "com.max.xiaoheihe.bean.ads.OverallAdInfo", "getHome_corner_ad", null);
            installed += categoryInstalled;
            recordHookProgress("广告/首页与页内", categoryInstalled, 6);
        }

        if (adCleanFeedSnapshot) {
            expected += 12;
            int categoryInstalled = hookEmptyListNoArgGetter(classLoader,
                    "com.max.xiaoheihe.bean.bbs.FeedsContentAdObj", "getBanners");
            try {
                Class<?> feedsAd = Class.forName(
                        "com.max.xiaoheihe.bean.bbs.FeedsContentAdObj", false, classLoader);
                String[][] feedGetters = {
                        {"com.max.xiaoheihe.bean.news.LinkListResultObj", "getLinks"},
                        {"com.max.xiaoheihe.bean.bbs.BBSTopicLinksObj", "getLinks"},
                        {"com.max.xiaoheihe.bean.bbs.HashtagLinkListResultObj", "getLinks"},
                        {"com.max.xiaoheihe.bean.bbs.BBSFollowedMomentsObj", "getMoments"},
                        {"com.max.xiaoheihe.bean.bbs.ProfileEventResult", "getMoments"},
                        {"com.max.xiaoheihe.bean.news.SubjectDetailResultOjb", "getNews_list"},
                        {"com.max.xiaoheihe.bean.news.ConceptFeedsResult", "getLinks"},
                        {"com.max.xiaoheihe.bean.bbs.BbsRecommendObj", "getLinks"},
                        {"com.max.xiaoheihe.bean.bbs.CollectionFolder", "getLinks"},
                        {"com.max.xiaoheihe.bean.bbs.RecallFeedsResult", "getVisible_links"},
                        {"com.max.xiaoheihe.bean.bbs.RecallFeedsResult", "getUnexposed_links"}
                };
                for (String[] target : feedGetters) {
                    categoryInstalled += hookFilteredFeedGetter(
                            classLoader, target[0], target[1], feedsAd);
                }
            } catch (Throwable throwable) {
                warn("AD_FEED_CLASS_SKIP reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
            installed += categoryInstalled;
            recordHookProgress("广告/信息流对象", categoryInstalled, 12);
        }

        if (adCleanBannersSnapshot) {
            expected += 9;
            int categoryInstalled = 0;
            String[][] bannerGetters = {
                    {"com.max.xiaoheihe.bean.bbs.BBSTopicLinksObj", "getBanner"},
                    {"com.max.xiaoheihe.bean.bbs.BbsRecommendObj", "getBanner"},
                    {"com.max.xiaoheihe.bean.bbs.BBSTopicBannerResult", "getAds_banner"},
                    {"com.max.xiaoheihe.bean.bbs.HashtagLinkListResultObj", "getAds_banner"},
                    {"com.max.xiaoheihe.bean.account.SignInResultObj", "getAds_banner"},
                    {"com.max.xiaoheihe.bean.game.gameoverview.GameOverviewBannerObj", "getAd_list"},
                    {"com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult", "getBanner"},
                    {"com.max.xiaoheihe.bean.mall.MallHeaderObj", "getBanners"},
                    {"com.max.xiaoheihe.bean.mall.MallProductObj", "getBanners"}
            };
            for (String[] target : bannerGetters) {
                categoryInstalled += hookEmptyListNoArgGetter(
                        classLoader, target[0], target[1]);
            }
            installed += categoryInstalled;
            recordHookProgress("广告/横幅", categoryInstalled, 9);
        }

        if (adCleanMallBottomSnapshot) {
            expected++;
            int categoryInstalled = 0;
            try {
                Class<?> manager = Class.forName(
                        "com.max.xiaoheihe.module.mall.BottomBarManager", false, classLoader);
                Class<?> protocol = Class.forName(
                        "com.max.xiaoheihe.bean.WebProtocolObj", false, classLoader);
                Class<?> notificationType = Class.forName(
                        "com.max.xiaoheihe.module.mall.NotificationType",
                        false, classLoader);
                Method showBottomAd = manager.getDeclaredMethod("c", View.class,
                        protocol, Context.class, int.class, notificationType);
                if (showBottomAd.getReturnType() != void.class) {
                    throw new NoSuchMethodException("BottomBarManager.c return type is not void");
                }
                showBottomAd.setAccessible(true);
                hook(showBottomAd).intercept(chain -> null);
                installed++;
                categoryInstalled++;
            } catch (Throwable throwable) {
                warn("AD_MALL_HOOK_SKIP reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
            recordHookProgress("广告/商城底栏", categoryInstalled, 1);
        }

        recordHookProgress("广告净化", installed, expected);
        if (installed > 0) {
            info("HOOK_GLOBAL_AD_OK methods=" + installed);
        } else {
            warn("HOOK_GLOBAL_AD_EMPTY");
        }
    }

    private int hookConstantNoArgGetter(ClassLoader classLoader, String className,
                                         String methodName, Object value) {
        try {
            Class<?> owner = Class.forName(className, false, classLoader);
            Method getter = owner.getMethod(methodName);
            Class<?> returnType = getter.getReturnType();
            if (returnType == void.class || returnType.isPrimitive()
                    || (value != null && !returnType.isInstance(value))) {
                throw new NoSuchMethodException(className + "." + methodName
                        + " incompatible return type " + returnType.getName());
            }
            hook(getter).intercept(chain -> value);
            return 1;
        } catch (Throwable throwable) {
            warn("AD_GETTER_SKIP method=" + className + "." + methodName
                    + " reason=" + unwrap(throwable).getClass().getSimpleName());
            return 0;
        }
    }

    private int hookEmptyListNoArgGetter(ClassLoader classLoader, String className,
                                         String methodName) {
        try {
            Class<?> owner = Class.forName(className, false, classLoader);
            Method getter = owner.getMethod(methodName);
            if (!getter.getReturnType().isAssignableFrom(ArrayList.class)) {
                throw new NoSuchMethodException(className + "." + methodName
                        + " cannot accept ArrayList");
            }
            // 宿主未来即使对返回列表执行 clear/add，也不会修改共享不可变对象或
            // 影响其它模型实例。广告 getter 都是低频数据读取，单次空列表分配可接受。
            hook(getter).intercept(chain -> new ArrayList<>());
            return 1;
        } catch (Throwable throwable) {
            warn("AD_GETTER_SKIP method=" + className + "." + methodName
                    + " reason=" + unwrap(throwable).getClass().getSimpleName());
            return 0;
        }
    }

    private int hookAdVoidMethod(Class<?> owner, String methodName,
                                 Class<?>... parameterTypes) {
        try {
            Method method = owner.getDeclaredMethod(methodName, parameterTypes);
            if (method.getReturnType() != void.class) {
                throw new NoSuchMethodException(owner.getName() + "." + methodName
                        + " return type is not void");
            }
            method.setAccessible(true);
            hook(method).intercept(chain -> null);
            return 1;
        } catch (Throwable throwable) {
            warn("AD_MAIN_HOOK_SKIP method=" + methodName + " reason="
                    + unwrap(throwable).getClass().getSimpleName());
            return 0;
        }
    }

    private static Object filterFeedAds(Object value, Class<?> feedsAdClass) {
        if (!(value instanceof List<?>)) {
            return value;
        }
        List<?> source = (List<?>) value;
        boolean containsAd = false;
        for (Object item : source) {
            if (item != null && feedsAdClass.isInstance(item)) {
                containsAd = true;
                break;
            }
        }
        if (!containsAd) {
            return value;
        }
        ArrayList<Object> filtered = new ArrayList<>(source.size());
        for (Object item : source) {
            if (item == null || !feedsAdClass.isInstance(item)) {
                filtered.add(item);
            }
        }
        return filtered;
    }

    private static final class FeedFilterCache {
        final Object source;
        final int sourceSize;
        final long contentStamp;
        final Object filtered;

        FeedFilterCache(Object source, int sourceSize, long contentStamp, Object filtered) {
            this.source = source;
            this.sourceSize = sourceSize;
            this.contentStamp = contentStamp;
            this.filtered = filtered;
        }
    }

    /** 只使用元素身份生成顺序敏感指纹；对象内部字段变化不影响广告类型判断。 */
    private static long feedContentStamp(List<?> source) {
        long stamp = 0xcbf29ce484222325L;
        for (Object item : source) {
            stamp ^= item == null ? 0L : System.identityHashCode(item);
            stamp *= 0x100000001b3L;
        }
        return stamp;
    }

    /**
     * 同一个结果对象的 getter 会在 RecyclerView 绑定期间被反复调用。按宿主结果对象
     * 缓存过滤结果。列表实例、长度或元素身份/顺序任一变化时重新过滤，避免同一个
     * List 原位 set 后继续返回旧数据；弱键按身份比较，不依赖可变模型的 hashCode。
     */
    private int hookFilteredFeedGetter(ClassLoader classLoader, String className,
                                       String methodName, Class<?> feedsAdClass) {
        try {
            Class<?> owner = Class.forName(className, false, classLoader);
            Method getter = owner.getMethod(methodName);
            if (!getter.getReturnType().isAssignableFrom(ArrayList.class)) {
                throw new NoSuchMethodException(className + "." + methodName
                        + " cannot accept filtered ArrayList");
            }
            WeakIdentityMap<Object, FeedFilterCache> cache = new WeakIdentityMap<>();
            hook(getter).intercept(chain -> {
                Object value = chain.proceed();
                if (!(value instanceof List<?>)) {
                    return value;
                }
                Object model = chain.getThisObject();
                List<?> source = (List<?>) value;
                int sourceSize = source.size();
                long contentStamp = feedContentStamp(source);
                if (model != null) {
                    synchronized (cache) {
                        FeedFilterCache cached = cache.get(model);
                        if (cached != null && cached.source == value
                                && cached.sourceSize == sourceSize
                                && cached.contentStamp == contentStamp) {
                            return cached.filtered;
                        }
                    }
                }

                final Object filtered;
                try {
                    filtered = filterFeedAds(value, feedsAdClass);
                } catch (Throwable throwable) {
                    recordRuntimeFallback("信息流广告过滤", throwable);
                    return value;
                }
                if (model != null) {
                    synchronized (cache) {
                        cache.put(model, new FeedFilterCache(
                                value, sourceSize, contentStamp, filtered));
                    }
                }
                return filtered;
            });
            return 1;
        } catch (Throwable throwable) {
            warn("AD_FEED_GETTER_SKIP method=" + className + "." + methodName
                    + " reason=" + unwrap(throwable).getClass().getSimpleName());
            return 0;
        }
    }

    private void installClipboardTokenHook(ClassLoader classLoader) {
        try {
            Class<?> manager = Class.forName(
                    "com.max.xiaoheihe.module.copyedtoken.CopyedTokenManager",
                    false, classLoader);
            Method checkClipboard = manager.getDeclaredMethod(
                    "c", Activity.class, boolean.class);
            checkClipboard.setAccessible(true);
            hook(checkClipboard).intercept(chain -> null);
            recordHookGroup("剪贴板保护");
            info("HOOK_CLIPBOARD_TOKEN_OK method=CopyedTokenManager.c");
        } catch (Throwable throwable) {
            error("HOOK_CLIPBOARD_TOKEN_ERROR", throwable);
        }
    }

    private void installExternalBrowserHooks(ClassLoader classLoader) {
        int installed = 0;
        try {
            Class<?> router = Class.forName(
                    "com.max.xiaoheihe.base.router.b", false, classLoader);
            installed += hookExternalBrowserMethod(router, "j0",
                    Context.class, String.class);
            installed += hookExternalBrowserMethod(router, "k0",
                    Context.class, String.class);
            try {
                Class<?> webCallback = Class.forName(
                        "com.max.xiaoheihe.module.webview.t", false, classLoader);
                installed += hookExternalBrowserMethod(router, "l0",
                        Context.class, String.class, android.webkit.WebView.class,
                        String.class, webCallback);
            } catch (Throwable throwable) {
                warn("EXTERNAL_BROWSER_HOOK_SKIP method=l0 reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
        } catch (Throwable throwable) {
            error("HOOK_EXTERNAL_BROWSER_ERROR", throwable);
        }
        recordHookProgress("外部浏览器", installed, 3);
        if (installed > 0) {
            info("HOOK_EXTERNAL_BROWSER_OK methods=" + installed);
        }
    }

    private int hookExternalBrowserMethod(Class<?> router, String methodName,
                                          Class<?>... parameterTypes) {
        try {
            Method method = router.getMethod(methodName, parameterTypes);
            if (method.getReturnType() != void.class) {
                throw new NoSuchMethodException(router.getName() + "." + methodName
                        + " return type is not void");
            }
            hook(method).intercept(chain -> {
                Context context = (Context) chain.getArg(0);
                String url = (String) chain.getArg(1);
                return openExternalUrl(context, url) ? null : chain.proceed();
            });
            recordHookGroup("外部浏览器/" + methodName);
            return 1;
        } catch (Throwable throwable) {
            warn("EXTERNAL_BROWSER_HOOK_SKIP method=" + methodName + " reason="
                    + unwrap(throwable).getClass().getSimpleName());
            return 0;
        }
    }

    private boolean openExternalUrl(Context context, String url) {
        if (context == null || !isHttpUrl(url)) {
            return false;
        }
        Uri uri;
        try {
            uri = Uri.parse(url);
        } catch (Throwable ignored) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme == null || !("http".equalsIgnoreCase(scheme)
                || "https".equalsIgnoreCase(scheme))) {
            return false;
        }
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            List<ResolveInfo> candidates = context.getPackageManager()
                    .queryIntentActivities(intent,
                            android.content.pm.PackageManager.MATCH_DEFAULT_ONLY);
            List<ResolveInfo> externalCandidates = new ArrayList<>();
            for (ResolveInfo candidate : candidates) {
                String candidatePackage = candidate.activityInfo == null
                        ? "" : candidate.activityInfo.packageName;
                if (!candidatePackage.isEmpty()
                        && !TARGET_PACKAGE.equals(candidatePackage)
                        && !Config.MODULE_PACKAGE.equals(candidatePackage)) {
                    externalCandidates.add(candidate);
                }
            }
            if (externalCandidates.isEmpty()) {
                return false;
            }

            Set<String> browserPackages = new LinkedHashSet<>();
            Intent browserSelector = Intent.makeMainSelectorActivity(
                    Intent.ACTION_MAIN, Intent.CATEGORY_APP_BROWSER);
            for (ResolveInfo browser : context.getPackageManager().queryIntentActivities(
                    browserSelector, android.content.pm.PackageManager.MATCH_DEFAULT_ONLY)) {
                if (browser.activityInfo != null) {
                    browserPackages.add(browser.activityInfo.packageName);
                }
            }
            List<ResolveInfo> browserCandidates = new ArrayList<>();
            if (!browserPackages.isEmpty()) {
                for (ResolveInfo candidate : externalCandidates) {
                    if (browserPackages.contains(candidate.activityInfo.packageName)) {
                        browserCandidates.add(candidate);
                    }
                }
            }
            List<ResolveInfo> preferredCandidates = browserCandidates.isEmpty()
                    ? externalCandidates : browserCandidates;

            ResolveInfo resolved = context.getPackageManager().resolveActivity(
                    intent, android.content.pm.PackageManager.MATCH_DEFAULT_ONLY);
            String packageName = resolved == null || resolved.activityInfo == null
                    ? "" : resolved.activityInfo.packageName;
            ResolveInfo defaultExternal = null;
            for (ResolveInfo candidate : preferredCandidates) {
                if (packageName.equals(candidate.activityInfo.packageName)) {
                    defaultExternal = candidate;
                    break;
                }
            }
            Intent launchIntent;
            if (defaultExternal != null) {
                launchIntent = new Intent(intent).setComponent(new ComponentName(
                        defaultExternal.activityInfo.packageName,
                        defaultExternal.activityInfo.name));
            } else {
                ArrayList<Intent> explicitIntents = new ArrayList<>();
                for (ResolveInfo candidate : preferredCandidates) {
                    explicitIntents.add(new Intent(intent).setComponent(new ComponentName(
                            candidate.activityInfo.packageName, candidate.activityInfo.name)));
                }
                Intent primary = explicitIntents.remove(0);
                launchIntent = Intent.createChooser(primary, "选择外部浏览器");
                if (!explicitIntents.isEmpty()) {
                    launchIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,
                            explicitIntents.toArray(new Intent[0]));
                }
            }
            if (!(context instanceof Activity)) {
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            }
            context.startActivity(launchIntent);
            return true;
        } catch (Throwable throwable) {
            warn("EXTERNAL_BROWSER_FALLBACK reason="
                    + throwable.getClass().getSimpleName());
            return false;
        }
    }

    private static boolean isHttpUrl(String value) {
        return value != null && (value.regionMatches(true, 0, "http://", 0, 7)
                || value.regionMatches(true, 0, "https://", 0, 8));
    }

    private void installMediaAutoplayHooks(ClassLoader classLoader) {
        int installed = 0;
        int expected = 0;
        if (disableVideoAutoplaySnapshot) {
            expected += 4;
            installed += installRecommendedVideoAutoplayHooks(classLoader);
        }
        if (disableGifAutoplaySnapshot) {
            expected++;
            installed += installFeedGifAutoplayHook(classLoader);
        }

        recordHookProgress("媒体防自动播放", installed, expected);
        if (installed > 0) {
            info("HOOK_MEDIA_AUTOPLAY_OK methods=" + installed);
        } else {
            warn("HOOK_MEDIA_AUTOPLAY_EMPTY");
        }
    }

    /**
     * 只截断推荐列表主动寻找可见卡片并播放的入口，播放器和点击播放逻辑保持原样。
     * 相比在 AbsVideoView.play/start 热路径里判断调用来源，这种方式没有全局播放开销。
     */
    private int installRecommendedVideoAutoplayHooks(ClassLoader classLoader) {
        int installed = 0;
        try {
            Class<?> fragment = Class.forName(
                    "com.max.xiaoheihe.module.game.GameRecommendV2Fragment",
                    false, classLoader);
            Method autoPlayVisibleCard = fragment.getDeclaredMethod("j4");
            autoPlayVisibleCard.setAccessible(true);
            hook(autoPlayVisibleCard).intercept(chain -> null);
            installed++;
        } catch (Throwable throwable) {
            warn("MEDIA_VIDEO_V2_HOOK_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

        // 深层兜底：V2 当前只有自动扫描传 false，播放按钮传 true。
        try {
            Class<?> videoView = Class.forName(
                    "com.max.xiaoheihe.module.game.component.GameVideoCardView",
                    false, classLoader);
            Class<?> videoData = Class.forName(
                    "com.max.xiaoheihe.bean.game.recommend.GameCardVideoObj",
                    false, classLoader);
            Method play = videoView.getDeclaredMethod("l", videoData, boolean.class);
            play.setAccessible(true);
            hook(play).intercept(chain -> Boolean.FALSE.equals(chain.getArg(1))
                    ? null : chain.proceed());
            installed++;
        } catch (Throwable throwable) {
            warn("MEDIA_VIDEO_CARD_HOOK_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

        // 兼容旧推荐页：滚动后的自动播放在 t4()，首次绑定由适配器布尔标记触发。
        try {
            Class<?> legacyFragment = Class.forName(
                    "com.max.xiaoheihe.module.game.GameMobileRecFragment",
                    false, classLoader);
            Method autoPlayAfterScroll = legacyFragment.getDeclaredMethod("t4", int.class);
            autoPlayAfterScroll.setAccessible(true);
            hook(autoPlayAfterScroll).intercept(chain -> null);

            Class<?> legacyAdapter = Class.forName(
                    "com.max.xiaoheihe.module.game.GameMobileRecFragment$f",
                    false, classLoader);
            Constructor<?> constructor = legacyAdapter.getDeclaredConstructor(legacyFragment);
            Field firstAutoPlay = legacyAdapter.getDeclaredField("f84523b");
            constructor.setAccessible(true);
            firstAutoPlay.setAccessible(true);
            hook(constructor).intercept(chain -> {
                Object result = chain.proceed();
                firstAutoPlay.setBoolean(chain.getThisObject(), false);
                return result;
            });
            installed += 2;
        } catch (Throwable throwable) {
            warn("MEDIA_VIDEO_LEGACY_HOOK_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

        recordHookProgress("媒体/推荐视频", installed, 4);
        return installed;
    }

    /** 列表加载器静止 GIF；全屏查看器使用另一套加载器，因此点开后仍会自动播放。 */
    private int installFeedGifAutoplayHook(ClassLoader classLoader) {
        try {
            Class<?> imageLoader = Class.forName("com.max.hbimage.b", false, classLoader);
            Class<?> requestBuilder = Class.forName(
                    "com.bumptech.glide.i", false, classLoader);
            Class<?> requestOptions = Class.forName(
                    "com.bumptech.glide.request.h", false, classLoader);
            Method disableAnimation = requestOptions.getMethod("r");
            Constructor<?> requestOptionsConstructor = requestOptions.getConstructor();
            Method load = imageLoader.getDeclaredMethod("J", requestBuilder,
                    requestOptions, String.class, android.widget.ImageView.class);
            disableAnimation.setAccessible(true);
            load.setAccessible(true);
            hook(load).intercept(chain -> {
                if (!isGifResource(stringValue(chain.getArg(2)))) {
                    return chain.proceed();
                }
                final Object[] arguments;
                try {
                    Object options = chain.getArg(1);
                    if (options == null) {
                        options = requestOptionsConstructor.newInstance();
                    }
                    Object disabledOptions = disableAnimation.invoke(options);
                    arguments = chain.getArgs().toArray();
                    arguments[1] = disabledOptions;
                } catch (Throwable throwable) {
                    recordRuntimeFallback("GIF静止", throwable);
                    return chain.proceed();
                }
                return chain.proceed(arguments);
            });
            recordHookProgress("媒体/GIF列表", 1, 1);
            return 1;
        } catch (Throwable throwable) {
            recordHookProgress("媒体/GIF列表", 0, 1);
            warn("MEDIA_GIF_HOOK_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
            return 0;
        }
    }

    private static boolean isGifResource(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        // 图片加载器会为每张图进入这里；单次扫描只在可能的首字符处比较，
        // 避免为三个 token 各遍历一次 URL，也不创建 lowercase 临时字符串。
        for (int index = 0; index < value.length(); index++) {
            char candidate = value.charAt(index);
            if ((candidate == '.' && value.regionMatches(true, index,
                    ".gif", 0, 4))
                    || ((candidate == 'f' || candidate == 'F')
                    && value.regionMatches(true, index, "format=gif", 0, 10))
                    || ((candidate == 'i' || candidate == 'I')
                    && value.regionMatches(true, index, "image/gif", 0, 9))) {
                return true;
            }
        }
        return false;
    }

    /**
     * 阻止返回首页后的自动刷新，同时保留手动下拉刷新。
     *
     * <p>只处理从其它底部页面返回时，NewsTagListFragment.onHiddenChanged(false)
     * 在离开超过 180 秒后同步调用 D3() 的路径。再次主动点击已选中的首页所发送的
     * gotop 广播保持原样，因此用户仍可通过再次点击首页回到顶部。</p>
     */
    private void installHomeReturnRefreshHook(ClassLoader classLoader) {
        int installed = 0;
        try {
            Class<?> newsTagList = Class.forName(
                    "com.max.xiaoheihe.module.news.NewsTagListFragment",
                    false, classLoader);
            Method visibilityChanged = newsTagList.getMethod(
                    "onHiddenChanged", boolean.class);
            Method autoRefresh = newsTagList.getMethod("D3");
            hook(visibilityChanged).intercept(chain -> {
                if (!Boolean.FALSE.equals(chain.getArg(0))) {
                    return chain.proceed();
                }
                suppressHomeVisibilityRefresh.set(Boolean.TRUE);
                try {
                    return chain.proceed();
                } finally {
                    suppressHomeVisibilityRefresh.remove();
                }
            });
            installed++;
            hook(autoRefresh).intercept(chain ->
                    Boolean.TRUE.equals(suppressHomeVisibilityRefresh.get())
                            ? null : chain.proceed());
            installed++;
        } catch (Throwable throwable) {
            warn("HOME_STALE_VISIBILITY_HOOK_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

        recordHookProgress("阻止返回首页自动刷新", installed, 2);
        if (installed > 0) {
            info("HOOK_HOME_RETURN_REFRESH_OK methods=" + installed
                    + " stale=NewsTagListFragment.onHiddenChanged");
        } else {
            warn("HOOK_HOME_RETURN_REFRESH_EMPTY");
        }
    }

    /**
     * 只在全屏图片查看器的普通图片完成加载后点击一次“查看原图”。
     * 不改变信息流缩略图请求，也不与查看器入场动画争抢网络和解码资源。
     */
    private void installImageEnhancementHook(ClassLoader classLoader) {
        try {
            Class<?> customizer = Class.forName(
                    "com.max.xiaoheihe.utils.imageviewer.ui.BaseResUICustomizer",
                    false, classLoader);
            Class<?> mediaData = Class.forName(
                    "com.max.xiaoheihe.utils.imageviewer.MediaData", false, classLoader);
            Method updateOriginal = customizer.getMethod(
                    "K", mediaData, TextView.class);
            Method isOriginal = mediaData.getMethod("j");
            Method getOriginalUrl = mediaData.getMethod("g");
            Method updateLoadedUrl = mediaData.getMethod("H", String.class);
            Class<?> viewHolder = Class.forName(
                    "androidx.recyclerview.widget.RecyclerView$ViewHolder",
                    false, classLoader);
            Method pageSelected = customizer.getMethod("y", int.class, viewHolder,
                    TextView.class, TextView.class, android.widget.ImageView.class);

            // y() 是查看器真正的 onPageSelected 入口。进入下一页时先使上一页失效，
            // 并只允许 y() 同步触发的首次 K() 登记新的当前 MediaData。
            hook(pageSelected).intercept(chain -> {
                synchronized (requestedOriginalImages) {
                    selectedViewerImage = new WeakReference<>(null);
                    selectedOriginalButton = new WeakReference<>(null);
                }
                selectingViewerPage.set(Boolean.TRUE);
                try {
                    return chain.proceed();
                } finally {
                    selectingViewerPage.remove();
                }
            });

            // HBImageLoader 仅在 Glide 的 onResourceReady 回调中写入当前 URL；因此 H()
            // 返回时可以视为普通图片已真正加载完成，而不是仅完成页面或按钮绑定。
            hook(updateLoadedUrl).intercept(chain -> {
                Object result = chain.proceed();
                Object data = chain.getThisObject();
                TextView currentButton = null;
                synchronized (requestedOriginalImages) {
                    loadedViewerImages.add(data);
                    if (selectedViewerImage.get() == data) {
                        currentButton = selectedOriginalButton.get();
                    }
                }
                if (currentButton != null) {
                    requestOriginalImage(data, currentButton,
                            isOriginal, getOriginalUrl);
                }
                return result;
            });

            hook(updateOriginal).intercept(chain -> {
                Object result = chain.proceed();
                Object data = chain.getArg(0);
                TextView originalButton = (TextView) chain.getArg(1);
                try {
                    boolean currentPage;
                    boolean loaded;
                    synchronized (requestedOriginalImages) {
                        if (Boolean.TRUE.equals(selectingViewerPage.get())) {
                            selectedViewerImage = new WeakReference<>(data);
                            selectedOriginalButton = new WeakReference<>(originalButton);
                        }
                        currentPage = selectedViewerImage.get() == data
                                && selectedOriginalButton.get() == originalButton;
                        loaded = currentPage && loadedViewerImages.contains(data);
                    }
                    if (data == null || originalButton == null) {
                        return result;
                    }
                    if (loaded) {
                        requestOriginalImage(data, originalButton,
                                isOriginal, getOriginalUrl);
                    }
                } catch (Throwable throwable) {
                    recordRuntimeFallback("自动加载原图", throwable);
                }
                return result;
            });
            recordHookGroup("图片增强");
            info("HOOK_IMAGE_ENHANCE_OK method=BaseResUICustomizer.y/K+MediaData.H");
        } catch (Throwable throwable) {
            error("HOOK_IMAGE_ENHANCE_ERROR", throwable);
        }
    }

    /**
     * 该方法只会在普通图完成后或已完成图片的原图按钮晚到时调用。
     * performClick 通过 View.post 排到当前加载回调和布局工作之后，避免同一帧重载。
     */
    private void requestOriginalImage(Object data, TextView originalButton,
                                      Method isOriginal, Method getOriginalUrl) {
        if (data == null || originalButton == null) {
            return;
        }
        try {
            if (Boolean.TRUE.equals(isOriginal.invoke(data))
                    || stringValue(getOriginalUrl.invoke(data)).isEmpty()
                    || !originalButton.hasOnClickListeners()) {
                return;
            }
            if (imageWifiAdaptiveSnapshot
                    && !hasUsableWifi(originalButton.getContext())) {
                return;
            }
            synchronized (requestedOriginalImages) {
                if (selectedViewerImage.get() != data
                        || selectedOriginalButton.get() != originalButton
                        || !requestedOriginalImages.add(data)) {
                    return;
                }
            }
            originalButton.post(() -> {
                boolean keepRegistered = false;
                try {
                    synchronized (requestedOriginalImages) {
                        if (selectedViewerImage.get() != data
                                || selectedOriginalButton.get() != originalButton) {
                            requestedOriginalImages.remove(data);
                            return;
                        }
                    }
                    keepRegistered = originalButton.isAttachedToWindow()
                            && originalButton.performClick();
                } catch (Throwable throwable) {
                    recordRuntimeFallback("自动加载原图", throwable);
                } finally {
                    if (!keepRegistered) {
                        synchronized (requestedOriginalImages) {
                            requestedOriginalImages.remove(data);
                        }
                    }
                }
            });
        } catch (Throwable throwable) {
            synchronized (requestedOriginalImages) {
                requestedOriginalImages.remove(data);
            }
            recordRuntimeFallback("自动加载原图", throwable);
        }
    }

    /** 网络状态只在图片查看器准备自动加载原图时读取，不监听网络变化。 */
    private static boolean hasUsableWifi(Context context) {
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager manager = (ConnectivityManager)
                    context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (manager == null) {
                return false;
            }
            Network active = manager.getActiveNetwork();
            NetworkCapabilities activeCapabilities = active == null
                    ? null : manager.getNetworkCapabilities(active);
            if (hasWifiInternet(activeCapabilities)) {
                return true;
            }
            if (activeCapabilities == null
                    || !activeCapabilities.hasTransport(
                    NetworkCapabilities.TRANSPORT_VPN)) {
                // 移动网络是当前默认网络时，即使后台还挂着非默认 Wi-Fi，
                // 也必须按流量网络处理，不能自动加载原图。
                return false;
            }
            // VPN 是默认网络时，公开 SDK 无法直接读取其底层网络，只在这个
            // 低频路径中扫描已连接网络以判断 VPN 是否运行于 Wi-Fi 之上。
            for (Network network : manager.getAllNetworks()) {
                if (hasWifiInternet(manager.getNetworkCapabilities(network))) {
                    return true;
                }
            }
        } catch (Throwable ignored) {
            // 无权限或系统网络服务异常时按非 Wi-Fi 处理，避免误用流量加载原图。
        }
        return false;
    }

    private static boolean hasWifiInternet(NetworkCapabilities capabilities) {
        return capabilities != null
                && capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
                && capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
    }

    /**
     * 只处理 PostUtils.Companion.a() 在帖子正文容器中新加入的直属 TextView。
     * 评论、消息、用户资料和其它 ExpressionTextView 均不经过这个渲染器。
     */
    private void installPostTextSelectionHook(ClassLoader classLoader) {
        try {
            Class<?> renderer = Class.forName(
                    "com.max.xiaoheihe.module.bbs.post.utils.PostUtils$Companion",
                    false, classLoader);
            Class<?> linkInfo = Class.forName(
                    "com.max.xiaoheihe.bean.bbs.LinkInfoObj", false, classLoader);
            Method renderBody = renderer.getMethod("a", Activity.class,
                    android.view.LayoutInflater.class, List.class,
                    ViewGroup.class, linkInfo, boolean.class);
            hook(renderBody).intercept(chain -> {
                ViewGroup body = (ViewGroup) chain.getArg(3);
                int previousChildren = body == null ? 0 : body.getChildCount();
                Object result = chain.proceed();
                if (body == null) {
                    return result;
                }
                try {
                    int childCount = body.getChildCount();
                    for (int index = previousChildren; index < childCount; index++) {
                        View child = body.getChildAt(index);
                        if (child instanceof TextView) {
                            ((TextView) child).setTextIsSelectable(true);
                        }
                    }
                } catch (Throwable throwable) {
                    recordRuntimeFallback("帖子正文文字选择", throwable);
                }
                return result;
            });
            recordHookGroup("帖子正文文字选择");
            info("HOOK_POST_TEXT_SELECT_OK method=PostUtils.Companion.a");
        } catch (Throwable throwable) {
            error("HOOK_POST_TEXT_SELECT_ERROR", throwable);
        }
    }

    private static Method findInheritedMethod(Class<?> type, String name,
                                               Class<?>... parameterTypes)
            throws NoSuchMethodException {
        for (Class<?> current = type; current != null; current = current.getSuperclass()) {
            try {
                return current.getDeclaredMethod(name, parameterTypes);
            } catch (NoSuchMethodException ignored) {
                // 继续检查父类。
            }
        }
        throw new NoSuchMethodException(type.getName() + "." + name);
    }

    /** 在小黑盒原生设置列表中插入一个使用原生 SettingItemView 的入口。 */
    private void installSettingsEntryHook(ClassLoader classLoader) {
        try {
            Class<?> settingsClass = Class.forName(
                    TARGET_SETTINGS_ACTIVITY, false, classLoader);
            Class<?> itemClass = Class.forName(SETTING_ITEM_VIEW, false, classLoader);
            Class<?> itemTypeClass = Class.forName(
                    SETTING_ITEM_VIEW + "$Type", false, classLoader);
            Method initialize = settingsClass.getDeclaredMethod("k1");
            Constructor<?> itemConstructor = itemClass.getConstructor(Context.class);
            Method setTitle = itemClass.getMethod("setTitle", String.class);
            Method setTitleDesc = itemClass.getMethod("setTitleDesc", String.class);
            Method setRightDesc = itemClass.getMethod("setRightDesc", String.class);
            Method setRightType = itemClass.getMethod("setRightType", itemTypeClass);
            Object arrow = enumConstant(itemTypeClass, "Arrow");
            initialize.setAccessible(true);

            hook(initialize).intercept(chain -> {
                Object result = chain.proceed();
                Activity activity = (Activity) chain.getThisObject();
                targetContext = activity.getApplicationContext();
                lastTargetActivity = new WeakReference<>(activity);
                try {
                    addSettingsEntry(activity, itemConstructor, setTitle, setTitleDesc,
                            setRightDesc, setRightType, arrow);
                } catch (Throwable throwable) {
                    recordRuntimeFallback("设置入口渲染", throwable);
                    error("SETTINGS_ENTRY_ERROR", unwrap(throwable));
                }
                return result;
            });
            recordHookGroup("设置入口");
            info("HOOK_SETTINGS_OK method=" + TARGET_SETTINGS_ACTIVITY + ".k1");
        } catch (Throwable throwable) {
            error("HOOK_SETTINGS_ERROR class=" + TARGET_SETTINGS_ACTIVITY, throwable);
        }
    }

    private void addSettingsEntry(Activity activity, Constructor<?> itemConstructor,
                                  Method setTitle, Method setTitleDesc,
                                  Method setRightDesc, Method setRightType,
                                  Object arrow) throws Throwable {
        int checkUpdateId = activity.getResources().getIdentifier(
                "vg_check_update", "id", TARGET_PACKAGE);
        if (checkUpdateId == 0) {
            checkUpdateId = CURRENT_CHECK_UPDATE_ID;
        }
        View reference = activity.findViewById(checkUpdateId);
        if (reference == null || !(reference.getParent() instanceof ViewGroup)) {
            throw new IllegalStateException("check update row/parent not found");
        }

        ViewGroup parent = (ViewGroup) reference.getParent();
        for (int index = 0; index < parent.getChildCount(); index++) {
            Object tag = parent.getChildAt(index).getTag();
            if ("heybox_hook_settings_entry".equals(tag)) {
                return;
            }
        }

        View entry = (View) itemConstructor.newInstance(activity);
        entry.setId(View.generateViewId());
        entry.setTag("heybox_hook_settings_entry");
        entry.setContentDescription("进入小黑盒净化设置");
        setTitle.invoke(entry, "小黑盒净化");
        setTitleDesc.invoke(entry, "");
        setRightDesc.invoke(entry, "点击管理");
        setRightType.invoke(entry, arrow);
        entry.setOnClickListener(view -> openModuleSettings(activity));

        int insertionIndex = parent.indexOfChild(reference) + 1;
        ViewGroup.LayoutParams layoutParams = copyLayoutParams(reference.getLayoutParams());
        parent.addView(entry, insertionIndex, layoutParams);
        info("SETTINGS_ENTRY_OK parent=" + parent.getClass().getName()
                + " index=" + insertionIndex);
    }

    private void openModuleSettings(Activity activity) {
        try {
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            HostSettingsDialog dialog = new HostSettingsDialog(
                    activity,
                    preferences,
                    new HostSettingsDialog.RuntimeBridge() {
                        @Override
                        public String getSelfCheckReport() {
                            return buildEmbeddedSelfCheckReport();
                        }
                    });
            dialog.show();
            info("SETTINGS_OPEN_OK mode=host_dialog");
        } catch (Throwable throwable) {
            error("SETTINGS_OPEN_ERROR", throwable);
            Toast.makeText(activity,
                    "设置页打开失败：" + throwable.getClass().getSimpleName(),
                    Toast.LENGTH_LONG).show();
        }
    }

    private String buildEmbeddedSelfCheckReport() {
        Set<String> installed;
        synchronized (installedHookGroups) {
            installed = new LinkedHashSet<>(installedHookGroups);
        }
        Map<String, HookGroupProgress> progress;
        synchronized (hookGroupProgress) {
            progress = new LinkedHashMap<>(hookGroupProgress);
        }
        Set<String> runtimeFailures;
        synchronized (runtimeHookFailures) {
            runtimeFailures = new LinkedHashSet<>(runtimeHookFailures);
        }
        List<String> missing = new ArrayList<>();
        List<String> partial = new ArrayList<>();
        for (String expected : expectedHookGroups()) {
            HookGroupProgress group = progress.get(expected);
            if (group != null && group.installed == 0) {
                missing.add(expected + " 0/" + group.expected);
            } else if (group != null && group.installed < group.expected) {
                partial.add(expected + " " + group.installed + "/" + group.expected);
            } else if (group == null && !installed.contains(expected)) {
                missing.add(expected);
            }
        }
        String enabled = enabledFeatureSummary();
        boolean healthy = missing.isEmpty() && partial.isEmpty()
                && runtimeFailures.isEmpty();
        List<String> progressDetails = new ArrayList<>();
        for (Map.Entry<String, HookGroupProgress> entry : progress.entrySet()) {
            HookGroupProgress value = entry.getValue();
            progressDetails.add(entry.getKey() + " " + value.installed
                    + "/" + value.expected);
        }
        return "Hook 状态  " + (healthy ? "安装完整" : "部分功能异常")
                + "\n模块版本  " + MODULE_VERSION
                + "\n目标版本  " + readTargetVersion(targetContext)
                + "\n目标进程  " + currentProcessName
                + "\n已安装组  " + (installed.isEmpty()
                ? "无" : String.join("、", installed))
                + "\n安装计数  " + (progressDetails.isEmpty()
                ? "无" : String.join("、", progressDetails))
                + "\n缺失组  " + (missing.isEmpty()
                ? "无" : String.join("、", missing))
                + "\n部分安装  " + (partial.isEmpty()
                ? "无" : String.join("、", partial))
                + "\n运行期回退  " + (runtimeFailures.isEmpty()
                ? "无" : String.join("、", runtimeFailures))
                + "\n本次进程已启用  " + (enabled.isEmpty() ? "无" : enabled);
    }

    private Set<String> expectedHookGroups() {
        Set<String> expected = new LinkedHashSet<>();
        expected.add("设置入口");
        if (hidePublishSnapshot || (shareTaskSnapshot && dailyShareTaskSnapshot)) {
            expected.add("基础/自检");
            expected.add("首页恢复监听");
        }
        if (hidePublishSnapshot) {
            expected.add("隐藏发布按钮");
        }
        if (shareTaskSnapshot) {
            expected.add("分享任务入口");
            expected.add("分享任务按钮");
        }
        if (shareTaskSnapshot && dailyShareTaskSnapshot) {
            expected.add("每日分享任务");
            expected.add("每日任务账号");
        }
        if (skipSplashAdSnapshot) {
            expected.add("开屏广告");
            expected.add("开屏快速路径");
        }
        if (globalAdCleanSnapshot) {
            if (adCleanFeedSnapshot) {
                expected.add("广告/信息流对象");
            }
            if (adCleanHomeSnapshot) {
                expected.add("广告/首页与页内");
            }
            if (adCleanBannersSnapshot) {
                expected.add("广告/横幅");
            }
            if (adCleanMallBottomSnapshot) {
                expected.add("广告/商城底栏");
            }
            if (adCleanFeedSnapshot || adCleanHomeSnapshot
                    || adCleanBannersSnapshot || adCleanMallBottomSnapshot) {
                expected.add("广告净化");
            }
        }
        if (disableClipboardTokenSnapshot) {
            expected.add("剪贴板保护");
        }
        if (externalBrowserSnapshot) {
            expected.add("外部浏览器");
            expected.add("外部浏览器/j0");
            expected.add("外部浏览器/k0");
            expected.add("外部浏览器/l0");
        }
        if (disableVideoAutoplaySnapshot || disableGifAutoplaySnapshot) {
            expected.add("媒体防自动播放");
        }
        if (disableVideoAutoplaySnapshot) {
            expected.add("媒体/推荐视频");
        }
        if (disableGifAutoplaySnapshot) {
            expected.add("媒体/GIF列表");
        }
        if (noForegroundRefreshSnapshot) {
            expected.add("阻止返回首页自动刷新");
        }
        if (imageEnhanceSnapshot) {
            expected.add("图片增强");
        }
        if (postTextSelectSnapshot) {
            expected.add("帖子正文文字选择");
        }
        if (suppressUpdatePromptSnapshot) {
            expected.add("更新响应");
            expected.add("更新弹窗");
        }
        return expected;
    }

    private ViewGroup.LayoutParams copyLayoutParams(ViewGroup.LayoutParams source) {
        if (source == null) {
            return new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        try {
            Constructor<?> constructor = source.getClass().getConstructor(
                    ViewGroup.LayoutParams.class);
            return (ViewGroup.LayoutParams) constructor.newInstance(source);
        } catch (Throwable ignored) {
            if (source instanceof ViewGroup.MarginLayoutParams) {
                return new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) source);
            }
            return new ViewGroup.LayoutParams(source);
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static Object enumConstant(Class<?> enumClass, String name) {
        return Enum.valueOf((Class<? extends Enum>) enumClass.asSubclass(Enum.class), name);
    }

    /** 当前版本兼容区只保留更新提示抑制，不安装任何版本身份或诊断请求 Hook。 */
    private void installUpdateSuppressionHooks(ClassLoader classLoader) {
        installUpdateResponseSuppression(classLoader);
        installUpdatePromptHooks(classLoader);
    }

    private void installUpdateResponseSuppression(ClassLoader classLoader) {
        int installed = 0;
        final int expected = 2;
        try {
            Class<?> versionObject = Class.forName(
                    CHECK_VERSION_OBJECT, false, classLoader);
            Method getNeedUpdate = versionObject.getMethod("getNeed_update");
            Class<?> returnType = getNeedUpdate.getReturnType();
            final Object noUpdate;
            if (returnType == String.class) {
                noUpdate = "0";
            } else if (returnType == int.class || returnType == Integer.class) {
                noUpdate = 0;
            } else if (returnType == boolean.class || returnType == Boolean.class) {
                noUpdate = false;
            } else {
                throw new NoSuchMethodException(
                        "CheckVersionObj.getNeed_update unsupported return type");
            }
            hook(getNeedUpdate).intercept(chain -> noUpdate);
            installed++;
        } catch (Throwable throwable) {
            warn("HOOK_UPDATE_RESPONSE_SKIP method=getNeed_update reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

        try {
            Class<?> callbackClass = Class.forName(
                    "com.max.xiaoheihe.utils.AppUpdateManager$i", false, classLoader);
            Class<?> networkCallback = Class.forName(
                    "com.max.hbcommon.network.d", false, classLoader);
            Method onError = networkCallback.getMethod("onError", Throwable.class);
            if (onError.getReturnType() != void.class) {
                throw new NoSuchMethodException("network.d.onError return type is not void");
            }
            hook(onError).intercept(chain -> {
                if (callbackClass.isInstance(chain.getThisObject())) {
                    info("UPDATE_RESPONSE_ERROR_SUPPRESSED");
                    return null;
                }
                return chain.proceed();
            });
            installed++;
        } catch (Throwable throwable) {
            warn("HOOK_UPDATE_RESPONSE_SKIP method=onError reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }
        recordHookProgress("更新响应", installed, expected);
        info("HOOK_UPDATE_RESPONSE_READY methods=" + installed);
    }

    /** 伪装应用自身的版本读取和请求参数；当前没有入口调用，保留供以后重新设计。 */
    private void installVersionSpoofHooks(ClassLoader classLoader) {
        if (spoofVersionSnapshot) {
            prepareVersionCheck(classLoader);
        }
        installVersionResponseObserver(classLoader);
        if (suppressUpdatePromptSnapshot) {
            installUpdatePromptHooks(classLoader);
        }
        if (spoofVersionSnapshot) {
            // 主动诊断需要在一次请求窗口内覆写 version/build。只有伪装功能开启
            // 时才安装网络热路径 Hook，全部关闭时网络请求没有任何模块分支开销。
            installNetworkVersionIdentityHook(classLoader);
            // 自动模式尚未获取有效的新版本，或目标恰好等于基准版本时，没有身份
            // 需要覆写；此时不安装应用版本/PackageInfo 热路径 Hook。
            if (versionIdentityOverrideSnapshot) {
                installAppVersionUtilityHook(classLoader);
                installAppVersionCodeUtilityHook(classLoader);
                installBuildConfigVersionHooks(classLoader);
                installPackageInfoHooks(classLoader);
            } else {
                info("VERSION_IDENTITY_HOOKS_SKIP reason=no_effective_override");
            }
        }
    }

    private void prepareVersionCheck(ClassLoader classLoader) {
        try {
            Class<?> updateManager = Class.forName(
                    "com.max.xiaoheihe.utils.AppUpdateManager", false, classLoader);
            appUpdateCheckMethod = updateManager.getMethod("r", Context.class);
            appUpdateCheckMethod.setAccessible(true);
            recordHookGroup("版本检测");
            info("VERSION_CHECK_READY method=AppUpdateManager.r");
        } catch (Throwable throwable) {
            error("VERSION_CHECK_PREPARE_ERROR", throwable);
        }
    }

    private void requestVersionCheckFromSettings(Activity activity) {
        if (!spoofVersionSnapshot) {
            showVersionCheckToast("请先开启“伪装应用版本”并重启小黑盒，再运行检测");
            return;
        }
        lastTargetActivity = new WeakReference<>(activity);
        Method check = appUpdateCheckMethod;
        if (check == null) {
            warn("VERSION_CHECK_REQUEST_SKIP method_missing");
            showVersionCheckToast("版本检测失败：当前小黑盒版本不支持内部检测");
            return;
        }
        Activity requestContext = lastTargetActivity.get();
        if (requestContext == null || requestContext.isFinishing()
                || requestContext.isDestroyed()
                || SPLASH_ACTIVITY.equals(requestContext.getClass().getName())) {
            requestContext = activity;
        }
        final long requestGeneration;
        synchronized (this) {
            if (forceLegacyVersionForCheck) {
                showVersionCheckToast("版本检测正在进行，请稍候");
                return;
            }
            forceLegacyVersionForCheck = true;
            activeVersionCheckObserver = new WeakReference<>(null);
            activeVersionCheckContext = new WeakReference<>(requestContext);
            requestGeneration = ++versionCheckRequestGeneration;
        }
        try {
            // 当前版本已是最新版时，官方接口可能只返回 need_update=0 而省略
            // version。仅在这次主动检测的请求窗口中临时报告 0.0.0，让官方
            // 接口返回完整的最新版信息；不会影响平时的版本伪装结果。
            check.invoke(null, requestContext);
            info("VERSION_CHECK_REQUEST_OK context="
                    + requestContext.getClass().getSimpleName());
            mainHandler.postDelayed(() -> {
                if (finishVersionCheckRequest(requestGeneration, null)) {
                    warn("VERSION_CHECK_REQUEST_TIMEOUT");
                    showVersionCheckToast("版本检测失败：请求超时");
                }
            }, 30000L);
        } catch (Throwable throwable) {
            finishVersionCheckRequest(requestGeneration, null);
            error("VERSION_CHECK_REQUEST_ERROR", unwrap(throwable));
            showVersionCheckToast("版本检测失败：请求异常");
        }
    }

    private void installVersionResponseObserver(ClassLoader classLoader) {
        try {
            Class<?> versionObject = Class.forName(
                    CHECK_VERSION_OBJECT, false, classLoader);
            Method getVersion = versionObject.getMethod("getVersion");
            checkVersionGetVersion = getVersion;

            if (suppressUpdatePromptSnapshot) {
                Method getNeedUpdate = versionObject.getMethod("getNeed_update");
                hook(getNeedUpdate).intercept(chain -> {
                    Object result = chain.proceed();
                    // 主动诊断请求期间保留服务端 need_update 原值，否则改成 0。
                    return !forceLegacyVersionForCheck ? "0" : result;
                });
            }

            Class<?> resultClass = Class.forName(
                    "com.max.hbutils.bean.Result", false, classLoader);
            Class<?> callbackClass = Class.forName(
                    "com.max.xiaoheihe.utils.AppUpdateManager$i", false, classLoader);
            Constructor<?> callbackConstructor = callbackClass.getDeclaredConstructor(
                    Context.class);
            callbackConstructor.setAccessible(true);
            hook(callbackConstructor).intercept(chain -> {
                Object result = chain.proceed();
                synchronized (this) {
                    if (forceLegacyVersionForCheck
                            && activeVersionCheckObserver.get() == null
                            && activeVersionCheckContext.get() == chain.getArg(0)) {
                        activeVersionCheckObserver =
                                new WeakReference<>(chain.getThisObject());
                    }
                }
                return result;
            });
            Method callback = callbackClass.getMethod("onNext", resultClass);
            Method getResult = resultClass.getMethod("getResult");
            hook(callback).intercept(chain -> {
                Object observer = chain.getThisObject();
                if (consumeExpiredVersionCheckObserver(observer)) {
                    info("VERSION_RESPONSE_LATE_SUPPRESSED");
                    return null;
                }
                boolean diagnosticRequest = isActiveVersionCheckObserver(observer);
                if (!diagnosticRequest) {
                    return chain.proceed();
                }
                String responseVersion = "";
                boolean responseObjectFound = false;
                try {
                    Object envelope = chain.getArg(0);
                    Object value = envelope == null ? null : getResult.invoke(envelope);
                    if (versionObject.isInstance(value)) {
                        responseObjectFound = true;
                        responseVersion = readRawServerVersion(value);
                        info("VERSION_RESPONSE_DATA version=" + responseVersion);
                    }
                } catch (Throwable throwable) {
                    warn("VERSION_RESPONSE_READ_ERROR "
                            + unwrap(throwable).getClass().getSimpleName());
                }
                finishVersionCheckRequest(0L, observer);
                if (responseObjectFound && isPlausibleVersion(responseVersion)) {
                    showVersionCheckToast("版本检测成功：服务器版本 " + responseVersion);
                } else {
                    showVersionCheckToast("版本检测成功，但服务器未返回版本号");
                }
                // 诊断按钮只报告结果，不继续走小黑盒原生升级弹窗。
                return null;
            });

            Class<?> networkCallback = Class.forName(
                    "com.max.hbcommon.network.d", false, classLoader);
            Method onError = networkCallback.getMethod("onError", Throwable.class);
            hook(onError).intercept(chain -> {
                Object self = chain.getThisObject();
                if (callbackClass.isInstance(self)) {
                    if (consumeExpiredVersionCheckObserver(self)) {
                        info("VERSION_RESPONSE_LATE_ERROR_SUPPRESSED");
                        return null;
                    }
                    Throwable error = (Throwable) chain.getArg(0);
                    warn("VERSION_RESPONSE_ERROR "
                            + (error == null ? "null" : error.getClass().getSimpleName()
                            + ":" + error.getMessage()));
                    if (isActiveVersionCheckObserver(self)) {
                        // 诊断接口可能以 ApiException("请升级至最新版本")结束。
                        // 原始 BaseObserver 会在 RxCachedThreadScheduler 上创建
                        // Dialog，既重复弹窗又会触发 Handler/Looper 崩溃；诊断
                        // 失败只记录日志，不把错误交回 UI 错误处理链。
                        finishVersionCheckRequest(0L, self);
                        showVersionCheckToast("版本检测失败：" + errorMessage(error));
                        return null;
                    }
                    if (suppressUpdatePromptSnapshot) {
                        // 普通版本请求失败时，基础 Observer 也可能创建“请升级”
                        // 错误弹窗；独立开关开启时一并吞掉该 UI 错误链。
                        info("VERSION_RESPONSE_ERROR_SUPPRESSED");
                        return null;
                    }
                }
                return chain.proceed();
            });
            recordHookGroup("版本响应");
            info("HOOK_VERSION_RESPONSE_OK class=" + CHECK_VERSION_OBJECT);
        } catch (Throwable throwable) {
            error("HOOK_VERSION_RESPONSE_ERROR class=" + CHECK_VERSION_OBJECT, throwable);
        }
    }

    private boolean isActiveVersionCheckObserver(Object observer) {
        return observer != null && forceLegacyVersionForCheck
                && activeVersionCheckObserver.get() == observer;
    }

    /**
     * generation 非零时用于超时/调用失败清理；observer 非空时只结束对应回调。
     * 返回 true 表示本次确实完成了仍处于活动状态的诊断。
     */
    private synchronized boolean finishVersionCheckRequest(long generation,
                                                             Object observer) {
        if (!forceLegacyVersionForCheck) {
            return false;
        }
        if (generation != 0L && generation != versionCheckRequestGeneration) {
            return false;
        }
        if (observer != null && activeVersionCheckObserver.get() != observer) {
            return false;
        }
        if (generation != 0L) {
            Object expired = activeVersionCheckObserver.get();
            if (expired != null) {
                synchronized (expiredVersionCheckObservers) {
                    expiredVersionCheckObservers.add(new WeakReference<>(expired));
                    expiredVersionCheckObservers.removeIf(reference ->
                            reference.get() == null);
                }
            }
        }
        forceLegacyVersionForCheck = false;
        activeVersionCheckObserver = new WeakReference<>(null);
        activeVersionCheckContext = new WeakReference<>(null);
        return true;
    }

    private boolean consumeExpiredVersionCheckObserver(Object observer) {
        if (observer == null) {
            return false;
        }
        synchronized (expiredVersionCheckObservers) {
            for (int index = expiredVersionCheckObservers.size() - 1;
                 index >= 0; index--) {
                Object expired = expiredVersionCheckObservers.get(index).get();
                if (expired == null || expired == observer) {
                    expiredVersionCheckObservers.remove(index);
                    if (expired == observer) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 屏蔽小黑盒在服务端判断当前版本过旧时创建的升级弹窗。
     *
     * AppUpdateManager.i.onNext() 在 force_push=1 时会调用 v()，v() 再调用
     * w() 创建真正的升级对话框；部分入口会直接调用 w()，测试版提示则走 B()。
     * 这些方法都是 void，因此直接短路即可，不改变版本接口返回值，也不影响其余
     * 网络请求和应用内版本伪装逻辑。C() 是下载完成后的“新版本已准备好”对话框，
     * 一并拦截，避免在其它入口重新显示同一个升级提示。
     */
    private void installUpdatePromptHooks(ClassLoader classLoader) {
        int installed = 0;
        try {
            Class<?> updateManager = Class.forName(
                    "com.max.xiaoheihe.utils.AppUpdateManager", false, classLoader);
            Class<?> appCompatActivity = Class.forName(
                    "androidx.appcompat.app.AppCompatActivity", false, classLoader);
            try {
                Class<?> versionObject = Class.forName(
                        CHECK_VERSION_OBJECT, false, classLoader);
                installed += hookUpdatePromptMethod(updateManager, "v",
                        appCompatActivity, versionObject);
                installed += hookUpdatePromptMethod(updateManager, "w",
                        appCompatActivity, versionObject, Boolean.class);
            } catch (Throwable throwable) {
                warn("HOOK_UPDATE_PROMPT_SKIP group=normal reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
            try {
                Class<?> betaTestInfo = Class.forName(
                        "com.max.xiaoheihe.bean.account.BetaTestInfo", false, classLoader);
                installed += hookUpdatePromptMethod(updateManager, "B",
                        appCompatActivity, betaTestInfo);
            } catch (Throwable throwable) {
                warn("HOOK_UPDATE_PROMPT_SKIP method=AppUpdateManager.B reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
            installed += hookUpdatePromptMethod(updateManager, "C");
        } catch (Throwable throwable) {
            error("HOOK_UPDATE_PROMPT_ERROR", throwable);
        }
        recordHookProgress("更新弹窗", installed, 4);
        if (installed > 0) {
            info("HOOK_UPDATE_PROMPT_OK methods=" + installed);
        }
    }

    private int hookUpdatePromptMethod(Class<?> updateManager, String methodName,
                                       Class<?>... parameterTypes) {
        try {
            Method method = updateManager.getDeclaredMethod(methodName, parameterTypes);
            if (method.getReturnType() != void.class) {
                throw new NoSuchMethodException("AppUpdateManager." + methodName
                        + " return type is not void");
            }
            method.setAccessible(true);
            hook(method).intercept(chain -> {
                info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager." + methodName);
                return null;
            });
            recordHookGroup("更新弹窗/" + methodName);
            return 1;
        } catch (Throwable throwable) {
            warn("HOOK_UPDATE_PROMPT_SKIP method=AppUpdateManager." + methodName
                    + " reason=" + unwrap(throwable).getClass().getSimpleName());
            return 0;
        }
    }

    private void installAppVersionUtilityHook(ClassLoader classLoader) {
        try {
            Class<?> utils = Class.forName("com.max.xiaoheihe.utils.d", false, classLoader);
            Method getVersionName = utils.getDeclaredMethod("x0");
            getVersionName.setAccessible(true);
            hook(getVersionName).intercept(chain -> {
                Object result = chain.proceed();
                return resolveSpoofVersion(stringValue(result));
            });
            recordHookGroup("版本伪装");
            info("HOOK_VERSION_UTIL_OK method=com.max.xiaoheihe.utils.d.x0");
        } catch (Throwable throwable) {
            error("HOOK_VERSION_UTIL_ERROR method=com.max.xiaoheihe.utils.d.x0", throwable);
        }
    }

    /**
     * 当前 APK 的 BuildConfig 被混淆为 com.max.xiaoheihe.a：g=versionCode，
     * h=versionName。字段值大多已被编译器内联，因此优先 Hook 读取入口；这里仍
     * 同步可写字段，覆盖反射或热修复读取场景。
     */
    private void installBuildConfigVersionHooks(ClassLoader classLoader) {
        try {
            Class<?> buildConfig = Class.forName("com.max.xiaoheihe.a", false, classLoader);
            setStaticStringField(buildConfig, "g",
                    String.valueOf(resolveSpoofVersionCode(Config.TARGET_BASE_VERSION_CODE)));
            setStaticStringField(buildConfig, "h",
                    resolveSpoofVersion(Config.TARGET_BASE_VERSION));
            info("HOOK_BUILD_CONFIG_OK class=com.max.xiaoheihe.a fields=g,h");
        } catch (Throwable throwable) {
            error("HOOK_BUILD_CONFIG_ERROR class=com.max.xiaoheihe.a", throwable);
        }
    }

    /** 小黑盒路由服务对外暴露的 build/versionCode 读取入口。 */
    private void installAppVersionCodeUtilityHook(ClassLoader classLoader) {
        try {
            Class<?> service = Class.forName(
                    "com.max.xiaoheihe.router.serviceimpl.b", false, classLoader);
            Method getVersionCode = service.getDeclaredMethod("o");
            getVersionCode.setAccessible(true);
            hook(getVersionCode).intercept(chain -> {
                Object result = chain.proceed();
                long real = parsePositiveLong(stringValue(result));
                long resolved = resolveSpoofVersionCode(real);
                return resolved > 0L ? String.valueOf(resolved) : result;
            });
            recordHookGroup("版本Code读取");
            info("HOOK_VERSION_CODE_UTIL_OK method=router.serviceimpl.b.o");
        } catch (Throwable throwable) {
            error("HOOK_VERSION_CODE_UTIL_ERROR method=router.serviceimpl.b.o", throwable);
        }
    }

    /**
     * 小黑盒在每个 API 请求中分别提交 version 与 build；其中 build=916 就是
     * versionCode，而不是显示用 versionName。这里在原拦截器完成后覆盖这两个参数。
     */
    private void installNetworkVersionIdentityHook(ClassLoader classLoader) {
        try {
            Class<?> interceptor = Class.forName(
                    "com.max.xiaoheihe.router.serviceimpl.i", false, classLoader);
            Class<?> urlBuilder = Class.forName("okhttp3.t$a", false, classLoader);
            Method appendQuery = findTwoStringFluentMethod(urlBuilder, "c");
            Method replaceQuery;
            try {
                // 当前 OkHttp Builder.W() 会先删除同名参数，再写入未编码值；使用它
                // 避免原拦截器的 version/build 与伪装值同时出现在 URL 中。
                replaceQuery = findTwoStringFluentMethod(urlBuilder, "W");
            } catch (NoSuchMethodException ignored) {
                // 旧版 Builder 没有 R() 时回退到原有追加方法。
                replaceQuery = null;
            }
            Method configure = interceptor.getDeclaredMethod(
                    "b", urlBuilder, String.class);
            appendQuery.setAccessible(true);
            if (replaceQuery != null) {
                replaceQuery.setAccessible(true);
            }
            final Method queryMethod = replaceQuery == null ? appendQuery : replaceQuery;
            configure.setAccessible(true);
            hook(configure).intercept(chain -> {
                Object result = chain.proceed();
                String endpoint = forceLegacyVersionForCheck
                        ? stringValue(chain.getArg(1)) : "";
                // 诊断不依赖“伪装版本”总开关；否则默认关闭全部功能后诊断按钮失效。
                boolean diagnosticVersionRequest = forceLegacyVersionForCheck
                        && isVersionCheckEndpoint(endpoint);
                if (!diagnosticVersionRequest && !versionIdentityOverrideSnapshot) {
                    return result;
                }

                Object builder = chain.getArg(0);
                String version = diagnosticVersionRequest
                        ? "0.0.0" : effectiveVersionSnapshot;
                long versionCode = diagnosticVersionRequest
                        ? 1L : effectiveVersionCodeSnapshot;
                try {
                    queryMethod.invoke(builder, "version", version);
                    queryMethod.invoke(builder, "build", String.valueOf(versionCode));
                } catch (Throwable throwable) {
                    // 原拦截器已经生成了完整请求；覆写失败时保留其真实版本参数，
                    // 不能让模块异常中断所有网络请求。
                    recordRuntimeFallback("网络版本参数", throwable);
                    return result;
                }
                if (diagnosticVersionRequest) {
                    info("VERSION_CHECK_IDENTITY endpoint=" + endpoint
                            + " version=" + version + " build=" + versionCode);
                }
                return result;
            });
            recordHookGroup("网络版本参数");
            info("HOOK_NETWORK_VERSION_OK method=router.serviceimpl.i.b params=version,build"
                    + " replace=" + (replaceQuery != null));
        } catch (Throwable throwable) {
            error("HOOK_NETWORK_VERSION_ERROR method=router.serviceimpl.i.b", throwable);
        }
    }

    private static Method findTwoStringFluentMethod(Class<?> owner, String preferredName)
            throws NoSuchMethodException {
        for (Method method : owner.getDeclaredMethods()) {
            Class<?>[] parameters = method.getParameterTypes();
            if (preferredName.equals(method.getName())
                    && parameters.length == 2
                    && parameters[0] == String.class
                    && parameters[1] == String.class) {
                return method;
            }
        }
        throw new NoSuchMethodException(owner.getName() + "." + preferredName
                + "(String,String)");
    }

    private static long parsePositiveLong(String value) {
        try {
            long parsed = Long.parseLong(value);
            return parsed > 0L ? parsed : 0L;
        } catch (Throwable ignored) {
            return 0L;
        }
    }

    private void setStaticStringField(Class<?> owner, String name, String value) {
        try {
            Field field = owner.getDeclaredField(name);
            if (field.getType() == String.class && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(null, value);
            }
        } catch (Throwable throwable) {
            warn("BUILD_CONFIG_FIELD_SKIP field=" + name + " reason="
                    + throwable.getClass().getSimpleName());
        }
    }

    private void installPackageInfoHooks(ClassLoader classLoader) {
        try {
            Class<?> implementation = Class.forName(
                    "android.app.ApplicationPackageManager", false, classLoader);
            int installed = 0;
            for (Method method : implementation.getDeclaredMethods()) {
                Class<?>[] parameters = method.getParameterTypes();
                if (!"getPackageInfo".equals(method.getName())
                        || parameters.length < 1
                        || parameters[0] != String.class
                        || method.getReturnType() != PackageInfo.class) {
                    continue;
                }
                try {
                    method.setAccessible(true);
                    hook(method).intercept(chain -> {
                        Object result = chain.proceed();
                        if (!versionIdentityOverrideSnapshot
                                || !TARGET_PACKAGE.equals(chain.getArg(0))
                                || !(result instanceof PackageInfo)) {
                            return result;
                        }
                        PackageInfo packageInfo = (PackageInfo) result;
                        try {
                            applySpoofPackageIdentity(packageInfo);
                        } catch (Throwable throwable) {
                            recordRuntimeFallback("PackageInfo版本伪装", throwable);
                        }
                        return result;
                    });
                    installed++;
                } catch (Throwable throwable) {
                    warn("HOOK_PACKAGE_INFO_OVERLOAD_SKIP method=" + method
                            + " reason=" + throwable.getClass().getSimpleName());
                }
            }
            if (installed > 0) {
                recordHookGroup("PackageInfo版本");
                info("HOOK_PACKAGE_INFO_OK overloads=" + installed);
            } else {
                warn("HOOK_PACKAGE_INFO_EMPTY");
            }
        } catch (Throwable throwable) {
            error("HOOK_PACKAGE_INFO_ERROR", throwable);
        }
    }

    private static boolean isVersionCheckEndpoint(String endpoint) {
        if (endpoint == null) {
            return false;
        }
        String value = endpoint.toLowerCase(Locale.ROOT);
        return value.contains("version_control_info")
                || value.contains("version-control-info");
    }

    private void showVersionCheckToast(String message) {
        Activity activity = lastTargetActivity.get();
        Context context = activity == null ? targetContext : activity;
        if (context == null) {
            return;
        }
        mainHandler.post(() -> {
            try {
                if (activity == null
                        || (!activity.isFinishing() && !activity.isDestroyed())) {
                    Toast.makeText(context, message, Toast.LENGTH_LONG).show();
                }
            } catch (Throwable throwable) {
                warn("VERSION_CHECK_TOAST_ERROR "
                        + throwable.getClass().getSimpleName());
            }
        });
    }

    private static String errorMessage(Throwable throwable) {
        if (throwable == null) {
            return "未知错误";
        }
        String message = throwable.getMessage();
        return message == null || message.isEmpty()
                ? throwable.getClass().getSimpleName() : message;
    }

    private String readRawServerVersion(Object versionObject) {
        if (versionObject == null) {
            return "";
        }
        try {
            Field field = versionObject.getClass().getDeclaredField("version");
            field.setAccessible(true);
            return stringValue(field.get(versionObject));
        } catch (Throwable ignored) {
            try {
                Method getter = checkVersionGetVersion;
                return getter == null ? "" : stringValue(getter.invoke(versionObject));
            } catch (Throwable ignoredAgain) {
                return "";
            }
        }
    }

    private String resolveSpoofVersion(String realVersion) {
        String real = realVersion == null ? "" : realVersion;
        if (!spoofVersionSnapshot) {
            return real;
        }

        if (Config.TARGET_BASE_VERSION.equals(real)) {
            return effectiveVersionSnapshot;
        }

        String mode = versionModeSnapshot;
        if (Config.VERSION_MODE_CUSTOM.equals(mode)) {
            String custom = customVersionSnapshot;
            return isPlausibleVersion(custom)
                    && isPlausibleVersionCode(customVersionCodeSnapshot) ? custom : real;
        }

        // 仅使用应用商店接口保存的成对数据，避免把更新接口返回的 versionName
        // 与旧的 versionCode 错配。
        String latest = cachedLatestVersionSnapshot;
        if (!isPlausibleVersion(latest)
                || !isPlausibleVersionCode(cachedLatestVersionCodeSnapshot)
                || cachedLatestVersionCodeSnapshot < Config.TARGET_BASE_VERSION_CODE
                || compareVersions(latest, real) < 0) {
            return real;
        }
        return latest;
    }

    private long resolveSpoofVersionCode(long realVersionCode) {
        if (!spoofVersionSnapshot) {
            return realVersionCode;
        }

        if (realVersionCode == Config.TARGET_BASE_VERSION_CODE) {
            return effectiveVersionCodeSnapshot;
        }
        if (Config.VERSION_MODE_CUSTOM.equals(versionModeSnapshot)) {
            return isPlausibleVersion(customVersionSnapshot)
                    && isPlausibleVersionCode(customVersionCodeSnapshot)
                    ? customVersionCodeSnapshot : realVersionCode;
        }
        long latestCode = cachedLatestVersionCodeSnapshot;
        // versionCode 单调递增；更新应用后不使用更低的旧缓存。
        return isPlausibleVersion(cachedLatestVersionSnapshot)
                && compareVersions(cachedLatestVersionSnapshot,
                        Config.TARGET_BASE_VERSION) >= 0
                && isPlausibleVersionCode(latestCode) && latestCode >= realVersionCode
                ? latestCode : realVersionCode;
    }

    /** 预计算目标 APK 当前基准版本的伪装结果，减少网络拦截器中的重复比较。 */
    private void refreshEffectiveVersionSnapshot() {
        String effectiveName = Config.TARGET_BASE_VERSION;
        long effectiveCode = Config.TARGET_BASE_VERSION_CODE;
        if (!spoofVersionSnapshot) {
            effectiveVersionSnapshot = effectiveName;
            effectiveVersionCodeSnapshot = effectiveCode;
            versionIdentityOverrideSnapshot = false;
            return;
        }
        if (Config.VERSION_MODE_CUSTOM.equals(versionModeSnapshot)) {
            if (isPlausibleVersion(customVersionSnapshot)
                    && isPlausibleVersionCode(customVersionCodeSnapshot)) {
                effectiveName = customVersionSnapshot;
                effectiveCode = customVersionCodeSnapshot;
            }
        } else {
            if (isPlausibleVersion(cachedLatestVersionSnapshot)
                    && isPlausibleVersionCode(cachedLatestVersionCodeSnapshot)
                    && compareVersions(cachedLatestVersionSnapshot,
                            Config.TARGET_BASE_VERSION) >= 0
                    && cachedLatestVersionCodeSnapshot
                            >= Config.TARGET_BASE_VERSION_CODE) {
                effectiveName = cachedLatestVersionSnapshot;
                effectiveCode = cachedLatestVersionCodeSnapshot;
            }
        }
        effectiveVersionSnapshot = effectiveName;
        effectiveVersionCodeSnapshot = effectiveCode;
        versionIdentityOverrideSnapshot = !Config.TARGET_BASE_VERSION.equals(effectiveName)
                || effectiveCode != Config.TARGET_BASE_VERSION_CODE;
    }

    private void applySpoofPackageIdentity(PackageInfo packageInfo) {
        String realName = packageInfo.versionName == null ? "" : packageInfo.versionName;
        long realCode = getPackageVersionCode(packageInfo);
        String resolvedName = realName;
        long resolvedCode = realCode;
        if (Config.TARGET_BASE_VERSION.equals(realName)
                && realCode == Config.TARGET_BASE_VERSION_CODE) {
            resolvedName = effectiveVersionSnapshot;
            resolvedCode = effectiveVersionCodeSnapshot;
        } else if (Config.VERSION_MODE_CUSTOM.equals(versionModeSnapshot)) {
            if (isPlausibleVersion(customVersionSnapshot)
                    && isPlausibleVersionCode(customVersionCodeSnapshot)) {
                resolvedName = customVersionSnapshot;
                resolvedCode = customVersionCodeSnapshot;
            }
        } else if (isPlausibleVersion(cachedLatestVersionSnapshot)
                && isPlausibleVersionCode(cachedLatestVersionCodeSnapshot)
                && compareVersions(cachedLatestVersionSnapshot, realName) >= 0
                && cachedLatestVersionCodeSnapshot >= realCode) {
            resolvedName = cachedLatestVersionSnapshot;
            resolvedCode = cachedLatestVersionCodeSnapshot;
        }
        if (!resolvedName.equals(realName) || resolvedCode != realCode) {
            packageInfo.versionName = resolvedName;
            setPackageVersionCode(packageInfo, resolvedCode);
        }
    }

    @SuppressWarnings("deprecation")
    private static long getPackageVersionCode(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28
                ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    @SuppressWarnings("deprecation")
    private static void setPackageVersionCode(PackageInfo packageInfo, long versionCode) {
        packageInfo.versionCode = (int) versionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                // 部分厂商 SDK stub 未公开该字段，运行时反射兼容 Android 9+。
                Field major = PackageInfo.class.getField("versionCodeMajor");
                major.setInt(packageInfo, (int) (versionCode >>> 32));
            } catch (Throwable ignored) {
                // 当前目标的 versionCode 位于 32 位范围，major 缺失时仍可正确返回。
            }
        }
    }

    /**
     * 版本号读取位于请求拦截器热路径中。配置只承诺重启目标应用后完全生效，
     * 因此进程启动时读取一次宿主配置，避免每个网络请求都访问 SharedPreferences。
     */
    private void loadFeatureConfigSnapshot() {
        hidePublishSnapshot = isEnabled(Config.KEY_HIDE_PUBLISH, false);
        shareTaskSnapshot = isEnabled(Config.KEY_SHARE_TASK, false);
        dailyShareTaskSnapshot = isEnabled(Config.KEY_DAILY_SHARE_TASK, false);
        skipSplashAdSnapshot = isEnabled(Config.KEY_SKIP_SPLASH_AD, false);
        globalAdCleanSnapshot = isEnabled(Config.KEY_GLOBAL_AD_CLEAN, false);
        adCleanFeedSnapshot = globalAdCleanSnapshot
                && isEnabled(Config.KEY_AD_CLEAN_FEED, true);
        adCleanHomeSnapshot = globalAdCleanSnapshot
                && isEnabled(Config.KEY_AD_CLEAN_HOME, true);
        adCleanBannersSnapshot = globalAdCleanSnapshot
                && isEnabled(Config.KEY_AD_CLEAN_BANNERS, true);
        adCleanMallBottomSnapshot = globalAdCleanSnapshot
                && isEnabled(Config.KEY_AD_CLEAN_MALL_BOTTOM, true);
        disableClipboardTokenSnapshot = isEnabled(
                Config.KEY_DISABLE_CLIPBOARD_TOKEN, false);
        externalBrowserSnapshot = isEnabled(Config.KEY_EXTERNAL_BROWSER, false);
        // 0.7.3 及更早版本只有一个媒体开关。设置页会一次性迁移；在用户尚未
        // 打开设置页时也读取旧值，避免升级后的第一次宿主启动出现配置失效。
        boolean legacyMediaAutoplay = isEnabled(
                Config.KEY_DISABLE_MEDIA_AUTOPLAY, false);
        disableVideoAutoplaySnapshot = preferences.contains(
                Config.KEY_DISABLE_VIDEO_AUTOPLAY)
                ? isEnabled(Config.KEY_DISABLE_VIDEO_AUTOPLAY, false)
                : legacyMediaAutoplay;
        disableGifAutoplaySnapshot = preferences.contains(
                Config.KEY_DISABLE_GIF_AUTOPLAY)
                ? isEnabled(Config.KEY_DISABLE_GIF_AUTOPLAY, false)
                : legacyMediaAutoplay;
        noForegroundRefreshSnapshot = isEnabled(
                Config.KEY_NO_FOREGROUND_REFRESH, false);
        imageEnhanceSnapshot = isEnabled(Config.KEY_IMAGE_ENHANCE, false);
        imageWifiAdaptiveSnapshot = imageEnhanceSnapshot
                && isEnabled(Config.KEY_IMAGE_WIFI_ADAPTIVE, false);
        postTextSelectSnapshot = isEnabled(Config.KEY_POST_TEXT_SELECT, false);
        suppressUpdatePromptSnapshot = isEnabled(
                Config.KEY_SUPPRESS_UPDATE_PROMPT, false);
        // 版本伪装、在线版本获取和主动版本检测暂时停止提供。即使旧配置仍然
        // 留有开关，本版本也不会安装版本身份或网络请求热路径 Hook。
        spoofVersionSnapshot = false;
        versionIdentityOverrideSnapshot = false;
        info("FEATURE_CONFIG_READY hide_publish=" + hidePublishSnapshot
                + " share=" + shareTaskSnapshot
                + " daily_share=" + dailyShareTaskSnapshot
                + " splash=" + skipSplashAdSnapshot
                + " global_ads=" + globalAdCleanSnapshot
                + "[feed=" + adCleanFeedSnapshot
                + ",home=" + adCleanHomeSnapshot
                + ",banners=" + adCleanBannersSnapshot
                + ",mall_bottom=" + adCleanMallBottomSnapshot + "]"
                + " clipboard=" + disableClipboardTokenSnapshot
                + " external_browser=" + externalBrowserSnapshot
                + " video_autoplay=" + disableVideoAutoplaySnapshot
                + " gif_autoplay=" + disableGifAutoplaySnapshot
                + " no_foreground_refresh=" + noForegroundRefreshSnapshot
                + " image_enhance=" + imageEnhanceSnapshot
                + " image_wifi=" + imageWifiAdaptiveSnapshot
                + " post_text_select=" + postTextSelectSnapshot
                + " suppress_update=" + suppressUpdatePromptSnapshot
                + " spoof_version=" + spoofVersionSnapshot
                + " mode=" + versionModeSnapshot
                + " cached=" + cachedLatestVersionSnapshot
                + "(" + cachedLatestVersionCodeSnapshot + ")");
    }

    private boolean isEnabled(String key, boolean defaultValue) {
        try {
            return preferences == null ? defaultValue
                    : preferences.getBoolean(key, defaultValue);
        } catch (Throwable throwable) {
            return defaultValue;
        }
    }

    private String getPreferenceString(String key, String defaultValue) {
        try {
            return preferences == null ? defaultValue
                    : preferences.getString(key, defaultValue);
        } catch (Throwable throwable) {
            return defaultValue;
        }
    }

    private long getPreferenceLong(String key, long defaultValue) {
        try {
            return preferences == null ? defaultValue
                    : preferences.getLong(key, defaultValue);
        } catch (Throwable throwable) {
            return defaultValue;
        }
    }

    private static boolean isPlausibleVersion(String value) {
        if (value == null || value.isEmpty() || value.length() > 64) {
            return false;
        }
        for (int index = 0; index < value.length(); index++) {
            char character = value.charAt(index);
            boolean allowed = (character >= '0' && character <= '9')
                    || (character >= 'A' && character <= 'Z')
                    || (character >= 'a' && character <= 'z')
                    || character == '.' || character == '_'
                    || character == '+' || character == '-';
            if (!allowed) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPlausibleVersionCode(long value) {
        return value > 0L && value <= 0x00000000ffffffffL;
    }

    private static int compareVersions(String left, String right) {
        if (right == null || right.isEmpty()) {
            return 1;
        }
        String[] leftParts = left.split("[^0-9]+");
        String[] rightParts = right.split("[^0-9]+");
        int length = Math.max(leftParts.length, rightParts.length);
        for (int index = 0; index < length; index++) {
            long leftValue = numericPart(leftParts, index);
            long rightValue = numericPart(rightParts, index);
            if (leftValue != rightValue) {
                return Long.compare(leftValue, rightValue);
            }
        }
        return 0;
    }

    private static long numericPart(String[] parts, int index) {
        if (index >= parts.length || parts[index].isEmpty()) {
            return 0L;
        }
        try {
            return Long.parseLong(parts[index]);
        } catch (NumberFormatException ignored) {
            return 0L;
        }
    }

    private static boolean isShareTask(String title, String type) {
        return "share".equalsIgnoreCase(type)
                || (title != null && title.contains("分享"));
    }

    private View findTaskStateView(Object holder, Method findView, String name,
                                   int currentVersionId) throws Throwable {
        // 优先按当前 APK 的精确 id 获取；再通过 Resources 名称解析，兼容资源 id 变化。
        Object direct = findView.invoke(holder, currentVersionId);
        if (direct instanceof View) {
            return (View) direct;
        }

        Object text = findView.invoke(holder, CURRENT_TASK_STATE_TEXT_ID);
        if (text instanceof View) {
            View textView = (View) text;
            int namedId = textView.getResources().getIdentifier(
                    name, "id", TARGET_PACKAGE);
            if (namedId != 0) {
                Object named = findView.invoke(holder, namedId);
                if (named instanceof View) {
                    return (View) named;
                }
            }
        }
        return null;
    }

    private String readTaskButtonText(Object holder, Method findView) {
        try {
            Object button = findView.invoke(holder, CURRENT_TASK_STATE_TEXT_ID);
            if (button instanceof TextView) {
                return stringValue(((TextView) button).getText());
            }
        } catch (Throwable ignored) {
            // 仅用于日志，不影响点击接管。
        }
        return "";
    }

    private static String stringValue(Object value) {
        return value == null ? "" : String.valueOf(value);
    }

    /**
     * 生成应用原生分享上报监听器。其 onResult 会先调用任务页监听器显示 Toast，随后
     * 立即上报 /share/behavior/success；这才是服务端判定分享任务完成的真实路径。
     */
    private Object createReportingListener(String source, Object listener, Object reportExtra,
                                           ClassLoader classLoader) throws Throwable {
        if (listener == null) {
            throw new IllegalArgumentException("share listener is null");
        }
        if (SHARE_REPORT_LISTENER.equals(listener.getClass().getName())) {
            return listener;
        }

        Class<?> reporterClass = Class.forName(SHARE_REPORT_LISTENER, true, classLoader);
        Class<?> listenerClass = Class.forName(SHARE_LISTENER, true, classLoader);
        Class<?> jsonObjectClass = Class.forName(GSON_JSON_OBJECT, true, classLoader);
        if (!listenerClass.isInstance(listener)) {
            throw new IllegalArgumentException("unexpected listener="
                    + listener.getClass().getName());
        }

        if (reportExtra != null && jsonObjectClass.isInstance(reportExtra)) {
            Constructor<?> constructor = reporterClass.getDeclaredConstructor(
                    String.class, listenerClass, jsonObjectClass);
            constructor.setAccessible(true);
            return constructor.newInstance(source, listener, reportExtra);
        }

        Constructor<?> constructor = reporterClass.getDeclaredConstructor(
                String.class, listenerClass);
        constructor.setAccessible(true);
        return constructor.newInstance(source, listener);
    }

    /**
     * 先按任务标题识别用户可见的任务类型，再读取 report_extra 作为其它任务的
     * 服务端提示。游戏评价任务的 report_extra 在部分响应中会复用 game_detail
     * 或通用 link；如果先信任它，/share/behavior/success 会带错 src，服务端就
     * 不会把这一次上报计入“分享游戏评价”。标题是该任务最稳定的判别依据。
     */
    private String resolveShareSource(String title, Object reportExtra) {
        String titleSource = resolveTitleShareSource(title);
        if (!titleSource.isEmpty()) {
            return titleSource;
        }

        for (String key : new String[]{"src", "share_src", "share_source", "page_type"}) {
            String value = readJsonString(reportExtra, key);
            if (isKnownShareSource(value)) {
                return value;
            }
        }

        String json = stringValue(reportExtra);
        for (String source : SHARE_SOURCES) {
            if (json.contains("\"" + source + "\"") || json.contains(":" + source)) {
                return source;
            }
        }

        // 没有标题时，继续使用 report_extra 中的嵌套值；未知任务最终按 link
        // 处理，保持对未来新增分享任务的兼容。
        return "link";
    }

    private String resolveTitleShareSource(String title) {
        String text = title == null ? "" : title;
        if (text.contains("游戏详情")) {
            return "game_detail";
        }
        if (text.contains("游戏评价") || text.contains("游戏评论")
                || (text.contains("游戏") && text.contains("评测"))) {
            return "game_comment";
        }
        if (text.contains("游戏合集")) {
            return "game_collection";
        }
        if (text.contains("帖子评论") || text.contains("帖子评价")) {
            return "link_comment";
        }
        if (text.contains("帖子")) {
            return "link";
        }
        if (text.contains("新闻评论") || text.contains("资讯评论")) {
            return "news_comment";
        }
        if (text.contains("新闻") || text.contains("资讯")) {
            return "news";
        }
        if (text.contains("百科") || text.contains("Wiki") || text.contains("wiki")) {
            return "wiki";
        }
        if (text.contains("话题")) {
            return "hashtag_share";
        }
        return "";
    }

    private String readJsonString(Object jsonObject, String key) {
        if (jsonObject == null) {
            return "";
        }
        try {
            Method get = jsonObject.getClass().getMethod("get", String.class);
            Object element = get.invoke(jsonObject, key);
            if (element == null) {
                return "";
            }
            Method isJsonNull = element.getClass().getMethod("isJsonNull");
            if (Boolean.TRUE.equals(isJsonNull.invoke(element))) {
                return "";
            }
            Method getAsString = element.getClass().getMethod("getAsString");
            return stringValue(getAsString.invoke(element));
        } catch (Throwable ignored) {
            return "";
        }
    }

    private static boolean isKnownShareSource(String source) {
        if (source == null || source.isEmpty()) {
            return false;
        }
        for (String candidate : SHARE_SOURCES) {
            if (candidate.equals(source)) {
                return true;
            }
        }
        return false;
    }

    private static final String[] SHARE_SOURCES = {
            "game_detail_screenshot", "link_detail_screenshot", "steam_screen_shot",
            "game_collection", "news_comment", "link_comment", "game_comment",
            "destiny2_detail", "steam_friend_code", "order_detail", "roll_room",
            "tag_project", "avatar_store", "apex_detail", "dac_detail", "ow_detail",
            "achieve_detail", "achieve_page", "hashtag_share", "game_detail", "news",
            "link", "web", "wiki", "lottery", "dota2"
    };

    /**
     * 识别任务页自己的 UMShareListener；同时递归展开分享上报包装器，兼容后续版本。
     */
    private boolean containsTaskListener(Object listener) {
        Set<Object> visited = Collections.newSetFromMap(new IdentityHashMap<>());
        return containsTaskListener(listener, visited, 0);
    }

    private boolean containsTaskListener(Object listener, Set<Object> visited, int depth) {
        if (listener == null || depth > 3 || !visited.add(listener)) {
            return false;
        }

        Class<?> type = listener.getClass();
        String name = type.getName();
        if (name.startsWith(TASK_FRAGMENT + "$")) {
            return true;
        }

        Class<?> enclosingClass = type.getEnclosingClass();
        if (enclosingClass != null && TASK_FRAGMENT.equals(enclosingClass.getName())) {
            return true;
        }

        for (Class<?> current = type; current != null && current != Object.class;
             current = current.getSuperclass()) {
            for (Field field : current.getDeclaredFields()) {
                if (!SHARE_LISTENER.equals(field.getType().getName())) {
                    continue;
                }
                try {
                    field.setAccessible(true);
                    if (containsTaskListener(field.get(listener), visited, depth + 1)) {
                        return true;
                    }
                } catch (Throwable ignored) {
                    // 某个包装字段不可读时继续检查其他字段。
                }
            }
        }
        return false;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private String dispatchShareSuccess(Object listener, ClassLoader classLoader) throws Throwable {
        Class<?> mediaClass = Class.forName(SHARE_MEDIA, true, classLoader);
        Object media;
        try {
            media = Enum.valueOf((Class<? extends Enum>) mediaClass.asSubclass(Enum.class), "WEIXIN");
        } catch (IllegalArgumentException ignored) {
            Object[] constants = mediaClass.getEnumConstants();
            if (constants == null || constants.length == 0) {
                throw new IllegalStateException("SHARE_MEDIA has no enum constants");
            }
            media = constants[0];
        }

        Method onStart = listener.getClass().getMethod("onStart", mediaClass);
        Method onResult = listener.getClass().getMethod("onResult", mediaClass);
        onStart.setAccessible(true);
        onResult.setAccessible(true);

        try {
            onStart.invoke(listener, media);
        } catch (Throwable throwable) {
            warn("SHARE_ON_START_ERROR " + unwrap(throwable).getClass().getSimpleName());
        }
        onResult.invoke(listener, media);
        return ((Enum<?>) media).name();
    }

    private static Throwable unwrap(Throwable throwable) {
        if (throwable instanceof InvocationTargetException
                && ((InvocationTargetException) throwable).getTargetException() != null) {
            return ((InvocationTargetException) throwable).getTargetException();
        }
        return throwable;
    }

    private void recordHookGroup(String group) {
        synchronized (installedHookGroups) {
            installedHookGroups.add(group);
        }
    }

    private void recordHookProgress(String group, int installed, int expected) {
        HookGroupProgress progress = new HookGroupProgress(
                Math.max(0, installed), Math.max(1, expected));
        synchronized (hookGroupProgress) {
            hookGroupProgress.put(group, progress);
        }
        if (installed > 0) {
            recordHookGroup(group);
        }
    }

    /** 热路径结构变化时只记录一次并回退宿主原逻辑，避免日志风暴。 */
    private void recordRuntimeFallback(String hook, Throwable throwable) {
        Throwable cause = unwrap(throwable);
        String detail = hook + ":" + cause.getClass().getSimpleName();
        boolean first;
        synchronized (runtimeHookFailures) {
            first = runtimeHookFailures.add(detail);
        }
        if (first) {
            warn("RUNTIME_HOOK_FALLBACK hook=" + hook
                    + " reason=" + cause.getClass().getSimpleName());
        }
    }

    private static String readTargetVersion(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager()
                    .getPackageInfo(TARGET_PACKAGE, 0);
            return stringValue(packageInfo.versionName)
                    + " (" + getPackageVersionCode(packageInfo) + ")";
        } catch (Throwable ignored) {
            return "未知";
        }
    }

    private String enabledFeatureSummary() {
        List<String> enabled = new ArrayList<>();
        if (hidePublishSnapshot) {
            enabled.add("隐藏发布按钮");
        }
        if (globalAdCleanSnapshot) {
            List<String> adGroups = new ArrayList<>(4);
            if (adCleanFeedSnapshot) {
                adGroups.add("信息流");
            }
            if (adCleanHomeSnapshot) {
                adGroups.add("首页/页内");
            }
            if (adCleanBannersSnapshot) {
                adGroups.add("横幅");
            }
            if (adCleanMallBottomSnapshot) {
                adGroups.add("商城底栏");
            }
            enabled.add("广告净化[" + (adGroups.isEmpty()
                    ? "无子项" : String.join("/", adGroups)) + "]");
        }
        if (skipSplashAdSnapshot) {
            enabled.add("跳过开屏广告");
        }
        if (disableClipboardTokenSnapshot) {
            enabled.add("剪贴板保护");
        }
        if (shareTaskSnapshot) {
            enabled.add("分享任务");
        }
        if (shareTaskSnapshot && dailyShareTaskSnapshot) {
            enabled.add("每日任务");
        }
        if (externalBrowserSnapshot) {
            enabled.add("外部浏览器");
        }
        if (disableVideoAutoplaySnapshot) {
            enabled.add("推荐视频不自动播放");
        }
        if (disableGifAutoplaySnapshot) {
            enabled.add("信息流GIF静止");
        }
        if (noForegroundRefreshSnapshot) {
            enabled.add("禁止返回首页自动刷新");
        }
        if (imageEnhanceSnapshot) {
            enabled.add(imageWifiAdaptiveSnapshot
                    ? "图片增强[仅Wi-Fi]" : "图片增强");
        }
        if (postTextSelectSnapshot) {
            enabled.add("帖子正文文字选择");
        }
        if (suppressUpdatePromptSnapshot) {
            enabled.add("屏蔽更新弹窗");
        }
        return String.join("、", enabled);
    }

    private void info(String message) {
        Log.i(TAG, message);
        log(Log.INFO, TAG, message);
    }

    private void warn(String message) {
        Log.w(TAG, message);
        log(Log.WARN, TAG, message);
    }

    private void error(String message, Throwable throwable) {
        Log.e(TAG, message, throwable);
        log(Log.ERROR, TAG, message, throwable);
    }
}
