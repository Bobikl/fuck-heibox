package dev.heybox.hook;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
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
import java.lang.ref.WeakReference;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Map;
import java.util.WeakHashMap;

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
    private static final String HOME_GO_TOP_ACTION =
            "com.max.xiaoheihe.news.gotop";
    private static final String SETTING_ITEM_VIEW =
            "com.max.xiaoheihe.module.account.component.SettingItemView";
    private static final String CHECK_VERSION_OBJECT =
            "com.max.xiaoheihe.bean.account.CheckVersionObj";
    private static final int CURRENT_CHECK_UPDATE_ID = 0x7f0a11cb;
    private static final int CURRENT_TASK_STATE_TEXT_ID = 0x7f0a0f6d;
    private static final int CURRENT_TASK_STATE_CONTAINER_ID = 0x7f0a14c0;
    private static final String DAILY_RUNTIME_PREFS = "heybox_hook_runtime";
    private static final String DAILY_SHARE_DATE_PREFIX = "daily_share_date:";
    private static final long DAILY_SHARE_START_DELAY_MS = 3500L;
    private static final long DAILY_SHARE_RETRY_DELAY_MS = 5000L;
    private static final int DAILY_SHARE_MAX_FETCH_ATTEMPTS = 2;
    private static final long DAILY_SHARE_FETCH_TIMEOUT_MS = 20000L;
    private static final boolean VERBOSE_TASK_LOG = false;

    private static final String[] CENTER_VIEW_NAMES = {
            "vg_mid_tab",
            "rb_3",
            "vg_tips_3"
    };

    private boolean hooksInstalled;
    private SharedPreferences preferences;
    private SharedPreferences remoteMigrationPreferences;
    private volatile Context targetContext;
    private volatile WeakReference<Activity> lastTargetActivity = new WeakReference<>(null);
    private Method appUpdateCheckMethod;
    private Method checkVersionGetVersion;
    private Method loginStateMethod;
    private Method currentUserIdMethod;
    private volatile boolean forceLegacyVersionForCheck;
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
    private volatile boolean disableMediaAutoplaySnapshot;
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
    /** 版本拦截热路径使用的基准值缓存（目标 APK 当前真实值为 1.3.347/916）。 */
    private volatile String effectiveVersionSnapshot = "1.3.347";
    private volatile long effectiveVersionCodeSnapshot = 916L;
    private volatile boolean versionIdentityOverrideSnapshot;
    private volatile boolean dailyShareInProgress;
    private volatile boolean dailyShareFetchRequested;
    private long dailyShareRequestGeneration;
    private int dailyShareActiveAttempt;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Map<Object, Runnable> pendingTaskRefreshes = new WeakHashMap<>();
    private final Map<Activity, List<WeakReference<View>>> centerNavigationViews =
            new WeakHashMap<>();
    private final Set<Object> requestedOriginalImages =
            Collections.newSetFromMap(new WeakHashMap<>());
    private volatile Resources centerNavigationResources;
    private volatile int[] centerNavigationIds;
    private String currentProcessName = "";
    private final Set<String> installedHookGroups = new LinkedHashSet<>();

    @Override
    public void onModuleLoaded(ModuleLoadedParam param) {
        currentProcessName = param.getProcessName();
        try {
            // 0.6.x 使用 LSPosed Remote Preferences。0.7.0 首次启动时只读
            // 一次旧配置并迁移到小黑盒自己的私有配置，之后设置页和 Hook
            // 位于同一进程，不再需要启动模块应用或保持 Binder 服务。
            remoteMigrationPreferences = getRemotePreferences(Config.PREFS_NAME);
        } catch (Throwable throwable) {
            error("PREFERENCES_INIT_ERROR", throwable);
        }
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

    private void initializeTarget(Context context, ClassLoader classLoader) {
        synchronized (this) {
            if (hooksInstalled) {
                return;
            }
            hooksInstalled = true;
        }

        Context applicationContext = context.getApplicationContext();
        targetContext = applicationContext == null ? context : applicationContext;
        preferences = targetContext.getSharedPreferences(
                Config.HOST_PREFS_NAME, Context.MODE_PRIVATE);
        migrateRemotePreferencesIfNeeded(preferences);

        loadFeatureConfigSnapshot();

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
        if (spoofVersionSnapshot || suppressUpdatePromptSnapshot) {
            installVersionSpoofHooks(classLoader);
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
        if (disableMediaAutoplaySnapshot) {
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
            remoteMigrationPreferences = null;
            return;
        }
        SharedPreferences.Editor editor = hostPreferences.edit();
        int migrated = 0;
        SharedPreferences legacy = remoteMigrationPreferences;
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
            }
        }
        editor.putBoolean(Config.KEY_HOST_PREFS_MIGRATED, true).commit();
        remoteMigrationPreferences = null;
        info("HOST_CONFIG_MIGRATED count=" + migrated);
    }

    private void installMainUiHooks(ClassLoader classLoader) {
        try {
            Class<?> mainActivityClass = Class.forName(MAIN_ACTIVITY, false, classLoader);
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

            boolean needsResumeHook = hidePublishSnapshot
                    || (shareTaskSnapshot && dailyShareTaskSnapshot);
            if (needsResumeHook) {
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
            }

            recordHookGroup("基础/自检");
            if (hidePublishSnapshot) {
                recordHookGroup("隐藏发布按钮");
            }
            info("HOOK_UI_OK class=" + MAIN_ACTIVITY
                    + " resume=" + needsResumeHook
                    + " new_intent=false");
        } catch (Throwable throwable) {
            error("HOOK_UI_ERROR class=" + MAIN_ACTIVITY, throwable);
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
                        // 资源不存在时缓存的是空引用；它不是失效缓存，不能因此在
                        // 每次 onResume 都重新遍历整棵 View 树。
                        if (ids[index] == 0) {
                            continue;
                        }
                        WeakReference<View> reference = cachedViews.get(index);
                        View cached = reference == null ? null : reference.get();
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
                        cachedViews.add(new WeakReference<>(view));
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
            error("UI_HIDE_ERROR source=" + source, throwable);
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
                Object listener = shareData == null ? null : getShareListener.invoke(shareData);

                if (!containsTaskListener(listener)) {
                    return chain.proceed();
                }

                try {
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
                    error("SHARE_BYPASS_ERROR listener=" + listener.getClass().getName()
                            + " fallback=original", unwrap(throwable));
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
                    error("TASK_BIND_ERROR", unwrap(throwable));
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
        if (day.equals(context.getSharedPreferences(
                DAILY_RUNTIME_PREFS, Context.MODE_PRIVATE)
                .getString(dailyShareDateKey(accountKey), ""))) {
            return;
        }
        final long generation;
        synchronized (this) {
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
        final boolean[] emitted = {false};
        try {
            Class<?> networkFactory = Class.forName(
                    "com.max.xiaoheihe.network.i", false, classLoader);
            Object service = networkFactory.getMethod("a").invoke(null);
            Class<?> serviceClass = Class.forName(
                    "com.max.xiaoheihe.network.e", false, classLoader);
            Object observable = serviceClass.getMethod("ib").invoke(service);

            // UserTaskFragmentV2.u4() 使用同样的 RxJava 调度。原先直接 J5()
            // 订阅会让启动请求时序不稳定，且可能把网络工作落到主线程。
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

            Class<?> observerClass = Class.forName("io.reactivex.g0", false, classLoader);
            Object observer = Proxy.newProxyInstance(classLoader,
                    new Class<?>[]{observerClass}, (proxy, method, args) -> {
                        String name = method.getName();
                        if ("onNext".equals(name) && args != null && args.length > 0) {
                            if (!isDailyShareRequestActive(generation, attempt)) {
                                return null;
                            }
                            emitted[0] = true;
                            Object envelope = args[0];
                            Object value = envelope;
                            try {
                                Method getResult = envelope == null ? null
                                        : envelope.getClass().getMethod("getResult");
                                if (getResult != null) {
                                    value = getResult.invoke(envelope);
                                }
                            } catch (Throwable ignored) {
                                // 某些网络层直接回调 TaskResultObj。
                            }
                            Object taskResult = value;
                            mainHandler.post(() -> {
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
                                            attempt, generation,
                                            "invalid_or_unhandled_result");
                                }
                            });
                        } else if ("onError".equals(name)) {
                            Throwable fetchError = args != null && args.length > 0
                                    && args[0] instanceof Throwable
                                    ? (Throwable) args[0] : null;
                            scheduleDailyShareRetry(classLoader, day, accountKey,
                                    attempt, generation,
                                    fetchError == null ? "unknown" : fetchError.getMessage());
                        } else if ("onComplete".equals(name) && !emitted[0]) {
                            scheduleDailyShareRetry(classLoader, day, accountKey,
                                    attempt, generation, "completed_without_result");
                        }
                        return null;
                    });
            Method subscribe = observable.getClass().getMethod(
                    "J5", observerClass);
            subscribe.invoke(observable, observer);
            mainHandler.postDelayed(() -> {
                if (!emitted[0] && isDailyShareRequestActive(generation, attempt)) {
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

    private void scheduleDailyShareRetry(ClassLoader classLoader, String day,
                                          String accountKey, int attempt,
                                          long generation, String reason) {
        synchronized (this) {
            if (!dailyShareFetchRequested
                    || dailyShareRequestGeneration != generation
                    || dailyShareActiveAttempt != attempt) {
                return;
            }
            if (attempt >= DAILY_SHARE_MAX_FETCH_ATTEMPTS) {
                dailyShareFetchRequested = false;
                dailyShareActiveAttempt = 0;
                dailyShareRequestGeneration++;
                warn("DAILY_TASK_FETCH_GIVE_UP day=" + day);
                return;
            }
            dailyShareActiveAttempt = attempt + 1;
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

    private synchronized void invalidateDailyShareRequest() {
        dailyShareFetchRequested = false;
        dailyShareActiveAttempt = 0;
        dailyShareRequestGeneration++;
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
            List<Object> tasks = collectShareTasks(taskResult);
            if (tasks.isEmpty()) {
                markDailyShareDay(context, day, accountKey);
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
                if (day.equals(runtime.getString(dailyShareDateKey(accountKey), ""))) {
                    invalidateDailyShareRequest();
                    info("DAILY_TASK_SKIP reason=already_run day=" + day);
                    return true;
                }
                // 不在任务真正上报前写入日期；进程被杀或网络失败时，下一次启动
                // 仍可重试，而 dailyShareInProgress 负责阻止当前响应链重复执行。
                dailyShareInProgress = true;
            }

            info("DAILY_TASK_START day=" + day + " count=" + tasks.size());
            DailyShareSummary summary = new DailyShareSummary(
                    tasks.size(), day, accountKey);
            for (int index = 0; index < tasks.size(); index++) {
                final Object task = tasks.get(index);
                final int taskIndex = index;
                mainHandler.postDelayed(() -> performDailyShareTask(
                        fragment, task, taskIndex, summary, classLoader, context),
                        index * 450L);
            }
            mainHandler.postDelayed(() -> finishDailyShareTasks(
                    fragment, summary, context), tasks.size() * 450L + 350L);
            return true;
        } catch (Throwable throwable) {
            dailyShareInProgress = false;
            error("DAILY_TASK_SCHEDULE_ERROR", unwrap(throwable));
            return false;
        }
    }

    private void markDailyShareDay(Context context, String day, String accountKey) {
        if (context == null || day == null || day.isEmpty()
                || accountKey == null || accountKey.isEmpty()) {
            return;
        }
        context.getSharedPreferences(DAILY_RUNTIME_PREFS, Context.MODE_PRIVATE)
                .edit().putString(dailyShareDateKey(accountKey), day).apply();
    }

    private static String dailyShareDateKey(String accountKey) {
        return DAILY_SHARE_DATE_PREFIX + accountKey;
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
        return LocalDate.now().toString();
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
    private List<Object> collectShareTasks(Object taskResult) throws Throwable {
        List<Object> result = new ArrayList<>();
        Method getTaskList = taskResult.getClass().getMethod("getTask_list");
        Object groups = getTaskList.invoke(taskResult);
        if (groups instanceof List) {
            for (Object group : (List<Object>) groups) {
                if (group == null) {
                    continue;
                }
                Method getTasks = group.getClass().getMethod("getTasks");
                Object taskList = getTasks.invoke(group);
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
        try {
            Method getLines = taskResult.getClass().getMethod("getTask_lines");
            Object lines = getLines.invoke(taskResult);
            if (lines != null) {
                Method getItems = lines.getClass().getMethod("getTask_line_items");
                Object items = getItems.invoke(lines);
                if (items instanceof List) {
                    for (Object line : (List<Object>) items) {
                        if (line == null) {
                            continue;
                        }
                        Method getTasks = line.getClass().getMethod("getTasks");
                        Object taskList = getTasks.invoke(line);
                        if (taskList instanceof List) {
                            for (Object task : (List<Object>) taskList) {
                                addPendingShareTask(result, task);
                            }
                        }
                    }
                }
            }
        } catch (NoSuchMethodException ignored) {
            // 旧版本没有 task_lines，已经检查过 task_list。
        }
        return result;
    }

    private void addPendingShareTask(List<Object> result, Object task) {
        if (task == null) {
            return;
        }
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
                    && !containsEquivalentTask(result, task)) {
                result.add(task);
            }
        } catch (Throwable throwable) {
            warn("DAILY_TASK_READ_ERROR error="
                    + unwrap(throwable).getClass().getSimpleName());
        }
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
            String url = stringValue(task.getClass().getMethod("getUrl").invoke(task));
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
            }
            info("DAILY_TASK_OK index=" + index + " title=" + title
                    + " src=" + source + " media=" + media
                    + " exp=" + exp + " coin=" + coin);
        } catch (Throwable throwable) {
            error("DAILY_TASK_ERROR index=" + index + " title=" + title,
                    unwrap(throwable));
        }
    }

    private void finishDailyShareTasks(Object fragment, DailyShareSummary summary,
                                       Context context) {
        int completed;
        long exp;
        long coin;
        synchronized (summary) {
            completed = summary.completed;
            exp = summary.exp;
            coin = summary.coin;
        }
        dailyShareInProgress = false;
        boolean allCompleted = completed >= summary.scheduled;
        if (allCompleted && completed > 0) {
            markDailyShareDay(context, summary.day, summary.accountKey);
        }
        // 请求已经结束，允许下一次启动在部分任务失败时重试；完整成功或空列表
        // 会由日期标记阻止同一天重复请求。
        invalidateDailyShareRequest();
        if (completed <= 0) {
            warn("DAILY_TASK_FINISH completed=0");
            return;
        }

        Toast.makeText(context,
                String.format(Locale.ROOT,
                        "今日自动完成 %d 个分享任务，获得 %d 经验、%d 盒币",
                        completed, exp, coin),
                Toast.LENGTH_SHORT).show();
        info("DAILY_TASK_FINISH completed=" + completed
                + " scheduled=" + summary.scheduled
                + " all_completed=" + allCompleted
                + " exp=" + exp + " coin=" + coin);

        // 等待服务端处理 success 事件后静默拉取一次任务状态；与手动任务共用
        // 防抖队列，不触发全屏 Loading。
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

    private static final class DailyShareSummary {
        final int scheduled;
        final String day;
        final String accountKey;
        int completed;
        long exp;
        long coin;

        DailyShareSummary(int scheduled, String day, String accountKey) {
            this.scheduled = scheduled;
            this.day = day;
            this.accountKey = accountKey;
        }
    }

    /**
     * AdsActivity 获取不到开屏广告时，本身就会调用 SplashActivity.Y1(false)
     * 进入完整的原启动流程。让开屏广告选择器返回 null 比直接跳 MainActivity 更稳妥，
     * 不会绕过隐私协议、登录态、访客模式和深链处理。
     */
    private void installSplashAdHook(ClassLoader classLoader) {
        try {
            Class<?> selectorClass = Class.forName(
                    OPEN_SCREEN_AD_SELECTOR, false, classLoader);
            Class<?> splashClass = Class.forName(SPLASH_ACTIVITY, false, classLoader);
            Method selectAd = selectorClass.getDeclaredMethod("g", boolean.class);
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
            selectAd.setAccessible(true);
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
                    // 目标结构变化时回退原初始化；广告选择器仍会返回 null，保证稳定。
                    warn("SPLASH_FAST_BYPASS_FALLBACK error="
                            + unwrap(throwable).getClass().getSimpleName());
                    return chain.proceed();
                }
            });

            hook(selectAd).intercept(chain -> {
                info("SPLASH_AD_BYPASS launch=" + chain.getArg(0));
                return null;
            });

            recordHookGroup("开屏广告");
            info("HOOK_SPLASH_AD_OK methods=" + SPLASH_ACTIVITY
                    + ".k1," + OPEN_SCREEN_AD_SELECTOR + ".g");
        } catch (Throwable throwable) {
            error("HOOK_SPLASH_AD_ERROR method=" + OPEN_SCREEN_AD_SELECTOR + ".g", throwable);
        }
    }

    /**
     * 广告净化只拦截广告模型的低频 getter 和明确的展示入口，不扫描 View 树，
     * 也不在 RecyclerView 绑定热路径按资源名反复查找。
     */
    private void installGlobalAdHooks(ClassLoader classLoader) {
        int installed = 0;
        if (adCleanHomeSnapshot) {
            int categoryInstalled = 0;
            try {
                Class<?> mainActivity = Class.forName(MAIN_ACTIVITY, false, classLoader);
                Class<?> innerAd = Class.forName(
                        "com.max.xiaoheihe.bean.InnerAdsInfoObj", false, classLoader);
                Method loadInnerAds = mainActivity.getDeclaredMethod("K2");
                Method showInnerAd = mainActivity.getDeclaredMethod("V3", innerAd);
                Method showBubbleAd = mainActivity.getDeclaredMethod("S2");
                loadInnerAds.setAccessible(true);
                showInnerAd.setAccessible(true);
                showBubbleAd.setAccessible(true);
                hook(loadInnerAds).intercept(chain -> null);
                hook(showInnerAd).intercept(chain -> null);
                hook(showBubbleAd).intercept(chain -> null);
                categoryInstalled += 3;
            } catch (Throwable throwable) {
                warn("AD_MAIN_HOOK_SKIP reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
            categoryInstalled += hookConstantNoArgGetter(classLoader,
                    "com.max.xiaoheihe.bean.AdsInfosObj", "getInner_ads",
                    Collections.emptyList());
            categoryInstalled += hookConstantNoArgGetter(classLoader,
                    "com.max.xiaoheihe.bean.ads.OverallAdInfo", "getBubble_ad", null);
            categoryInstalled += hookConstantNoArgGetter(classLoader,
                    "com.max.xiaoheihe.bean.ads.OverallAdInfo", "getHome_corner_ad", null);
            installed += categoryInstalled;
            if (categoryInstalled > 0) {
                recordHookGroup("广告/首页与页内");
            }
        }

        if (adCleanFeedSnapshot) {
            int categoryInstalled = hookConstantNoArgGetter(classLoader,
                    "com.max.xiaoheihe.bean.bbs.FeedsContentAdObj", "getBanners",
                    Collections.emptyList());
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
                    try {
                        Class<?> owner = Class.forName(target[0], false, classLoader);
                        Method getter = owner.getMethod(target[1]);
                        hook(getter).intercept(chain ->
                                filterFeedAds(chain.proceed(), feedsAd));
                        categoryInstalled++;
                    } catch (Throwable throwable) {
                        warn("AD_FEED_GETTER_SKIP method=" + target[0] + "." + target[1]
                                + " reason=" + unwrap(throwable).getClass().getSimpleName());
                    }
                }
            } catch (Throwable throwable) {
                warn("AD_FEED_CLASS_SKIP reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
            installed += categoryInstalled;
            if (categoryInstalled > 0) {
                recordHookGroup("广告/信息流对象");
            }
        }

        if (adCleanBannersSnapshot) {
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
                categoryInstalled += hookConstantNoArgGetter(
                        classLoader, target[0], target[1], Collections.emptyList());
            }
            installed += categoryInstalled;
            if (categoryInstalled > 0) {
                recordHookGroup("广告/横幅");
            }
        }

        if (adCleanMallBottomSnapshot) {
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
                showBottomAd.setAccessible(true);
                hook(showBottomAd).intercept(chain -> null);
                installed++;
                recordHookGroup("广告/商城底栏");
            } catch (Throwable throwable) {
                warn("AD_MALL_HOOK_SKIP reason="
                        + unwrap(throwable).getClass().getSimpleName());
            }
        }

        if (installed > 0) {
            recordHookGroup("广告净化");
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
            hook(getter).intercept(chain -> value);
            return 1;
        } catch (Throwable throwable) {
            warn("AD_GETTER_SKIP method=" + className + "." + methodName
                    + " reason=" + unwrap(throwable).getClass().getSimpleName());
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
        try {
            Class<?> router = Class.forName(
                    "com.max.xiaoheihe.base.router.b", false, classLoader);
            Class<?> webCallback = Class.forName(
                    "com.max.xiaoheihe.module.webview.t", false, classLoader);
            Method open = router.getMethod("j0", Context.class, String.class);
            Method openTemplate = router.getMethod("k0", Context.class, String.class);
            Method openFromWeb = router.getMethod("l0", Context.class, String.class,
                    android.webkit.WebView.class, String.class, webCallback);
            Method[] methods = {open, openTemplate, openFromWeb};
            for (Method method : methods) {
                hook(method).intercept(chain -> {
                    Context context = (Context) chain.getArg(0);
                    String url = (String) chain.getArg(1);
                    return openExternalUrl(context, url) ? null : chain.proceed();
                });
            }
            recordHookGroup("外部浏览器");
            info("HOOK_EXTERNAL_BROWSER_OK methods=j0,k0,l0");
        } catch (Throwable throwable) {
            error("HOOK_EXTERNAL_BROWSER_ERROR", throwable);
        }
    }

    private boolean openExternalUrl(Context context, String url) {
        if (context == null || url == null) {
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
            ResolveInfo resolved = context.getPackageManager().resolveActivity(
                    intent, android.content.pm.PackageManager.MATCH_DEFAULT_ONLY);
            String packageName = resolved == null || resolved.activityInfo == null
                    ? "" : resolved.activityInfo.packageName;
            if (packageName.isEmpty() || TARGET_PACKAGE.equals(packageName)) {
                List<ResolveInfo> candidates = context.getPackageManager()
                        .queryIntentActivities(intent,
                                android.content.pm.PackageManager.MATCH_DEFAULT_ONLY);
                packageName = "";
                for (ResolveInfo candidate : candidates) {
                    String candidatePackage = candidate.activityInfo == null
                            ? "" : candidate.activityInfo.packageName;
                    if (!candidatePackage.isEmpty()
                            && !TARGET_PACKAGE.equals(candidatePackage)
                            && !Config.MODULE_PACKAGE.equals(candidatePackage)) {
                        packageName = candidatePackage;
                        break;
                    }
                }
            }
            if (packageName.isEmpty() || TARGET_PACKAGE.equals(packageName)) {
                return false;
            }
            intent.setPackage(packageName);
            if (!(context instanceof Activity)) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            }
            context.startActivity(intent);
            return true;
        } catch (Throwable throwable) {
            warn("EXTERNAL_BROWSER_FALLBACK reason="
                    + throwable.getClass().getSimpleName());
            return false;
        }
    }

    private void installMediaAutoplayHooks(ClassLoader classLoader) {
        int installed = 0;
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
            warn("MEDIA_VIDEO_HOOK_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

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
                Object options = chain.getArg(1);
                if (options == null) {
                    options = requestOptionsConstructor.newInstance();
                }
                Object disabledOptions = disableAnimation.invoke(options);
                Object[] arguments = chain.getArgs().toArray();
                arguments[1] = disabledOptions;
                return chain.proceed(arguments);
            });
            installed++;
        } catch (Throwable throwable) {
            warn("MEDIA_GIF_HOOK_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

        try {
            Class<?> imageViewerBuilder = Class.forName(
                    "com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper$a",
                    false, classLoader);
            Method disableViewerGif = imageViewerBuilder.getMethod("a");
            Method startViewer = imageViewerBuilder.getMethod("p");
            hook(startViewer).intercept(chain -> {
                disableViewerGif.invoke(chain.getThisObject());
                return chain.proceed();
            });
            installed++;
        } catch (Throwable throwable) {
            warn("MEDIA_VIEWER_GIF_HOOK_SKIP reason="
                    + unwrap(throwable).getClass().getSimpleName());
        }

        if (installed > 0) {
            recordHookGroup("媒体防自动播放");
            info("HOOK_MEDIA_AUTOPLAY_OK methods=" + installed);
        } else {
            warn("HOOK_MEDIA_AUTOPLAY_EMPTY");
        }
    }

    private static boolean isGifResource(String value) {
        return containsIgnoreCase(value, ".gif")
                || containsIgnoreCase(value, "format=gif")
                || containsIgnoreCase(value, "image/gif");
    }

    private static boolean containsIgnoreCase(String value, String token) {
        int limit = value.length() - token.length();
        for (int index = 0; index <= limit; index++) {
            if (value.regionMatches(true, index, token, 0, token.length())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 阻止点击底部“首页”时发送的回顶刷新指令。
     *
     * <p>MainActivity 会在首页按钮的点击回调中广播
     * {@code com.max.xiaoheihe.news.gotop}，DiscoveryFragment 收到后调用当前首页
     * 子页面的 D3()，最终触发列表回顶和整页刷新。旧实现误拦截了 MainActivity.R3()；
     * 该方法处理的是应用进程从后台回到前台后的超时逻辑，与底部页面切换无关。</p>
     */
    private void installHomeReturnRefreshHook(ClassLoader classLoader) {
        try {
            Class<?> receiverClass = Class.forName(
                    "com.max.xiaoheihe.module.news.DiscoveryFragment$NewMsgBroadcastReceiver",
                    false, classLoader);
            Method onReceive = receiverClass.getMethod(
                    "onReceive", Context.class, Intent.class);
            hook(onReceive).intercept(chain -> {
                Intent intent = (Intent) chain.getArg(1);
                if (intent != null && HOME_GO_TOP_ACTION.equals(intent.getAction())) {
                    return null;
                }
                return chain.proceed();
            });
            recordHookGroup("阻止返回首页自动刷新");
            info("HOOK_HOME_RETURN_REFRESH_OK receiver=DiscoveryFragment action="
                    + HOME_GO_TOP_ACTION);
        } catch (Throwable throwable) {
            error("HOOK_HOME_RETURN_REFRESH_ERROR", throwable);
        }
    }

    /** 只在全屏图片查看器内自动点击一次“查看原图”，不改变信息流缩略图请求。 */
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
            hook(updateOriginal).intercept(chain -> {
                Object result = chain.proceed();
                Object data = chain.getArg(0);
                TextView originalButton = (TextView) chain.getArg(1);
                if (data != null && originalButton != null
                        && Boolean.FALSE.equals(isOriginal.invoke(data))
                        && !stringValue(getOriginalUrl.invoke(data)).isEmpty()
                        && originalButton.hasOnClickListeners()) {
                    if (imageWifiAdaptiveSnapshot
                            && !hasUsableWifi(originalButton.getContext())) {
                        return result;
                    }
                    synchronized (requestedOriginalImages) {
                        if (!requestedOriginalImages.add(data)) {
                            return result;
                        }
                    }
                    originalButton.performClick();
                }
                return result;
            });
            recordHookGroup("图片增强");
            info("HOOK_IMAGE_ENHANCE_OK method=BaseResUICustomizer.K");
        } catch (Throwable throwable) {
            error("HOOK_IMAGE_ENHANCE_ERROR", throwable);
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
                int childCount = body.getChildCount();
                for (int index = previousChildren; index < childCount; index++) {
                    View child = body.getChildAt(index);
                    if (child instanceof TextView) {
                        ((TextView) child).setTextIsSelectable(true);
                    }
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

                        @Override
                        public void requestVersionCheck() {
                            requestVersionCheckFromSettings(activity);
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
        String groups;
        synchronized (installedHookGroups) {
            groups = String.join("、", installedHookGroups);
        }
        String enabled = enabledFeatureSummary();
        return "Hook 状态  已注入且响应正常"
                + "\n模块版本  " + MODULE_VERSION
                + "\n目标版本  " + readTargetVersion(targetContext)
                + "\n目标进程  " + currentProcessName
                + "\n已安装组  " + (groups.isEmpty() ? "无" : groups)
                + "\n已启用功能  " + (enabled.isEmpty() ? "无" : enabled);
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

    /** 伪装应用自身的版本读取和请求参数，不改动系统中其他应用的信息。 */
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
            installAppVersionUtilityHook(classLoader);
            installAppVersionCodeUtilityHook(classLoader);
            installBuildConfigVersionHooks(classLoader);
            installPackageInfoHooks(classLoader);
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
        try {
            // 当前版本已是最新版时，官方接口可能只返回 need_update=0 而省略
            // version。仅在这次主动检测的请求窗口中临时报告 0.0.0，让官方
            // 接口返回完整的最新版信息；不会影响平时的版本伪装结果。
            forceLegacyVersionForCheck = true;
            Activity requestContext = lastTargetActivity.get();
            if (requestContext == null || requestContext.isFinishing()
                    || requestContext.isDestroyed()
                    || SPLASH_ACTIVITY.equals(requestContext.getClass().getName())) {
                requestContext = activity;
            }
            check.invoke(null, requestContext);
            info("VERSION_CHECK_REQUEST_OK context="
                    + requestContext.getClass().getSimpleName());
            mainHandler.postDelayed(() -> {
                if (forceLegacyVersionForCheck) {
                    forceLegacyVersionForCheck = false;
                    warn("VERSION_CHECK_REQUEST_TIMEOUT");
                    showVersionCheckToast("版本检测失败：请求超时");
                }
            }, 30000L);
        } catch (Throwable throwable) {
            forceLegacyVersionForCheck = false;
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
            Method callback = callbackClass.getMethod("onNext", resultClass);
            Method getResult = resultClass.getMethod("getResult");
            hook(callback).intercept(chain -> {
                boolean diagnosticRequest = forceLegacyVersionForCheck;
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
                forceLegacyVersionForCheck = false;
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
                    Throwable error = (Throwable) chain.getArg(0);
                    warn("VERSION_RESPONSE_ERROR "
                            + (error == null ? "null" : error.getClass().getSimpleName()
                            + ":" + error.getMessage()));
                    if (forceLegacyVersionForCheck) {
                        // 诊断接口可能以 ApiException("请升级至最新版本")结束。
                        // 原始 BaseObserver 会在 RxCachedThreadScheduler 上创建
                        // Dialog，既重复弹窗又会触发 Handler/Looper 崩溃；诊断
                        // 失败只记录日志，不把错误交回 UI 错误处理链。
                        forceLegacyVersionForCheck = false;
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
        try {
            Class<?> updateManager = Class.forName(
                    "com.max.xiaoheihe.utils.AppUpdateManager", false, classLoader);
            Class<?> appCompatActivity = Class.forName(
                    "androidx.appcompat.app.AppCompatActivity", false, classLoader);
            Class<?> versionObject = Class.forName(
                    CHECK_VERSION_OBJECT, false, classLoader);
            Class<?> betaTestInfo = Class.forName(
                    "com.max.xiaoheihe.bean.account.BetaTestInfo", false, classLoader);

            Method showForcedUpdate = updateManager.getMethod(
                    "v", appCompatActivity, versionObject);
            hook(showForcedUpdate).intercept(chain -> {
                info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager.v");
                return null;
            });

            Method showUpdate = updateManager.getMethod(
                    "w", appCompatActivity, versionObject, Boolean.class);
            hook(showUpdate).intercept(chain -> {
                info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager.w");
                return null;
            });

            Method showBeta = updateManager.getMethod(
                    "B", appCompatActivity, betaTestInfo);
            hook(showBeta).intercept(chain -> {
                info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager.B");
                return null;
            });

            try {
                Method showReady = updateManager.getDeclaredMethod("C");
                showReady.setAccessible(true);
                hook(showReady).intercept(chain -> {
                    info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager.C");
                    return null;
                });
            } catch (NoSuchMethodException ignored) {
                // C() 是当前版本下载完成后的内部方法，旧版不存在时无需失败整个安装。
                warn("HOOK_UPDATE_PROMPT_SKIP method=AppUpdateManager.C");
            }
            recordHookGroup("更新弹窗");
            info("HOOK_UPDATE_PROMPT_OK methods=AppUpdateManager.v,w,B,C");
        } catch (Throwable throwable) {
            error("HOOK_UPDATE_PROMPT_ERROR", throwable);
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
                    String.valueOf(resolveSpoofVersionCode(916L)));
            setStaticStringField(buildConfig, "h", resolveSpoofVersion("1.3.347"));
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
                queryMethod.invoke(builder, "version", version);
                queryMethod.invoke(builder, "build", String.valueOf(versionCode));
                if (diagnosticVersionRequest) {
                    info("VERSION_CHECK_IDENTITY endpoint=" + endpoint
                            + " version=" + version + " build=" + versionCode);
                }
                return result;
            });
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
                        applySpoofPackageIdentity(packageInfo);
                        return result;
                    });
                    installed++;
                } catch (Throwable throwable) {
                    warn("HOOK_PACKAGE_INFO_OVERLOAD_SKIP method=" + method
                            + " reason=" + throwable.getClass().getSimpleName());
                }
            }
            info("HOOK_PACKAGE_INFO_OK overloads=" + installed);
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

        if ("1.3.347".equals(real)
                && isPlausibleVersion(effectiveVersionSnapshot)) {
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
                || cachedLatestVersionCodeSnapshot < 916L
                || compareVersions(latest, real) < 0) {
            return real;
        }
        return latest;
    }

    private long resolveSpoofVersionCode(long realVersionCode) {
        if (!spoofVersionSnapshot) {
            return realVersionCode;
        }

        if (realVersionCode == 916L && isPlausibleVersionCode(effectiveVersionCodeSnapshot)) {
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
                && compareVersions(cachedLatestVersionSnapshot, "1.3.347") >= 0
                && isPlausibleVersionCode(latestCode) && latestCode >= realVersionCode
                ? latestCode : realVersionCode;
    }

    /** 预计算目标 APK 当前基准版本的伪装结果，减少网络拦截器中的重复比较。 */
    private void refreshEffectiveVersionSnapshot() {
        String effectiveName = "1.3.347";
        long effectiveCode = 916L;
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
                    && compareVersions(cachedLatestVersionSnapshot, "1.3.347") >= 0
                    && cachedLatestVersionCodeSnapshot >= 916L) {
                effectiveName = cachedLatestVersionSnapshot;
                effectiveCode = cachedLatestVersionCodeSnapshot;
            }
        }
        effectiveVersionSnapshot = effectiveName;
        effectiveVersionCodeSnapshot = effectiveCode;
        versionIdentityOverrideSnapshot = !"1.3.347".equals(effectiveName)
                || effectiveCode != 916L;
    }

    private void applySpoofPackageIdentity(PackageInfo packageInfo) {
        String realName = packageInfo.versionName == null ? "" : packageInfo.versionName;
        long realCode = getPackageVersionCode(packageInfo);
        String resolvedName = realName;
        long resolvedCode = realCode;
        if (Config.VERSION_MODE_CUSTOM.equals(versionModeSnapshot)) {
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
        disableMediaAutoplaySnapshot = isEnabled(
                Config.KEY_DISABLE_MEDIA_AUTOPLAY, false);
        noForegroundRefreshSnapshot = isEnabled(
                Config.KEY_NO_FOREGROUND_REFRESH, false);
        imageEnhanceSnapshot = isEnabled(Config.KEY_IMAGE_ENHANCE, false);
        imageWifiAdaptiveSnapshot = imageEnhanceSnapshot
                && isEnabled(Config.KEY_IMAGE_WIFI_ADAPTIVE, false);
        postTextSelectSnapshot = isEnabled(Config.KEY_POST_TEXT_SELECT, false);
        suppressUpdatePromptSnapshot = isEnabled(
                Config.KEY_SUPPRESS_UPDATE_PROMPT, false);
        spoofVersionSnapshot = isEnabled(Config.KEY_SPOOF_VERSION, false);
        versionModeSnapshot = getPreferenceString(
                Config.KEY_VERSION_MODE, Config.VERSION_MODE_AUTO);
        customVersionSnapshot = getPreferenceString(Config.KEY_CUSTOM_VERSION, "").trim();
        customVersionCodeSnapshot = getPreferenceLong(Config.KEY_CUSTOM_VERSION_CODE, 0L);
        cachedLatestVersionSnapshot = getPreferenceString(
                Config.KEY_LATEST_VERSION, "").trim();
        cachedLatestVersionCodeSnapshot = getPreferenceLong(
                Config.KEY_LATEST_VERSION_CODE, 0L);
        refreshEffectiveVersionSnapshot();
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
                + " media_autoplay=" + disableMediaAutoplaySnapshot
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
        return value != null && !value.isEmpty() && value.length() <= 64
                && value.matches("[0-9A-Za-z._+\\-]+");
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
        if (disableMediaAutoplaySnapshot) {
            enabled.add("媒体静止");
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
        if (spoofVersionSnapshot) {
            enabled.add("版本伪装");
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
