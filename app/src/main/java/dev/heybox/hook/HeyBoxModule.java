package dev.heybox.hook;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.pm.PackageInfo;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
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
    private static final String MODULE_VERSION = "0.5.6";
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
    private static final String DAILY_SHARE_DATE = "daily_share_date";
    private static final long DAILY_SHARE_START_DELAY_MS = 3500L;
    private static final long DAILY_SHARE_RETRY_DELAY_MS = 5000L;
    private static final int DAILY_SHARE_MAX_FETCH_ATTEMPTS = 2;

    private static final String[] CENTER_VIEW_NAMES = {
            "vg_mid_tab",
            "rb_3",
            "vg_tips_3"
    };

    private boolean hooksInstalled;
    private SharedPreferences preferences;
    private volatile Context targetContext;
    private volatile WeakReference<Activity> lastTargetActivity = new WeakReference<>(null);
    private volatile String latestServerVersion = "";
    private Method appUpdateCheckMethod;
    private Method checkVersionGetVersion;
    private volatile boolean forceLegacyVersionForCheck;
    private volatile boolean spoofVersionSnapshot = true;
    private volatile String versionModeSnapshot = Config.VERSION_MODE_AUTO;
    private volatile String customVersionSnapshot = "";
    private volatile long customVersionCodeSnapshot;
    private volatile String cachedLatestVersionSnapshot = "";
    private volatile long cachedLatestVersionCodeSnapshot;
    /** 版本拦截热路径使用的基准值缓存（目标 APK 当前真实值为 1.3.347/916）。 */
    private volatile String effectiveVersionSnapshot = "1.3.347";
    private volatile long effectiveVersionCodeSnapshot = 916L;
    private volatile boolean dailyShareInProgress;
    private volatile boolean dailyShareFetchRequested;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Map<Object, Runnable> pendingTaskRefreshes = new WeakHashMap<>();
    private final Map<Activity, List<WeakReference<View>>> centerNavigationViews =
            new WeakHashMap<>();
    private volatile Resources centerNavigationResources;
    private volatile int[] centerNavigationIds;
    private String currentProcessName = "";

    @Override
    public void onModuleLoaded(ModuleLoadedParam param) {
        currentProcessName = param.getProcessName();
        try {
            preferences = getRemotePreferences(Config.PREFS_NAME);
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

        synchronized (this) {
            if (hooksInstalled) {
                return;
            }
            hooksInstalled = true;
        }

        ClassLoader classLoader = param.getClassLoader();
        info("PKG_READY package=" + param.getPackageName()
                + " loader=" + classLoader.getClass().getName());

        loadVersionConfigSnapshot();

        installMainUiHooks(classLoader);
        installTaskShareHook(classLoader);
        installTaskButtonHook(classLoader);
        installDailyTaskHook(classLoader);
        installSettingsEntryHook(classLoader);
        installVersionSpoofHooks(classLoader);
        installSplashAdHook(classLoader);
    }

    private void installMainUiHooks(ClassLoader classLoader) {
        try {
            Class<?> mainActivityClass = Class.forName(MAIN_ACTIVITY, false, classLoader);
            Method onCreate = mainActivityClass.getDeclaredMethod("onCreate", Bundle.class);
            Method onResume = mainActivityClass.getDeclaredMethod("onResume");
            Method onNewIntent = mainActivityClass.getDeclaredMethod("onNewIntent", Intent.class);
            onCreate.setAccessible(true);
            onResume.setAccessible(true);
            onNewIntent.setAccessible(true);

            hook(onCreate).intercept(chain -> {
                Activity activity = (Activity) chain.getThisObject();
                targetContext = activity.getApplicationContext();
                lastTargetActivity = new WeakReference<>(activity);

                // 在原始初始化前关闭当前版本控制中心发布入口的静态开关。
                // 即使字段被热修复忽略，方法执行后的 View 处理仍然会生效。
                if (isEnabled(Config.KEY_HIDE_PUBLISH, true)) {
                    disableCurrentCenterFlag(mainActivityClass);
                }

                Object result = chain.proceed();
                if (isEnabled(Config.KEY_HIDE_PUBLISH, true)) {
                    hideCenterNavigation(activity, "onCreate");
                }
                // Activity 完成初始化后再触发内部检查，避免更新管理器拿到未完成
                // 初始化的上下文；SplashActivity 深链路径仍由其自身 Hook 处理。
                handleVersionCheckRequest(activity);
                return result;
            });

            hook(onResume).intercept(chain -> {
                Object result = chain.proceed();
                lastTargetActivity = new WeakReference<>((Activity) chain.getThisObject());
                if (isEnabled(Config.KEY_HIDE_PUBLISH, true)) {
                    hideCenterNavigation((Activity) chain.getThisObject(), "onResume");
                }
                // onCreate 时应用的登录态和网络组件可能尚未准备好。等首页真正
                // resume 后再请求任务列表，避免只有进入“我的任务”页面才触发 n4。
                triggerDailyShareFetch(classLoader);
                return result;
            });

            hook(onNewIntent).intercept(chain -> {
                Object result = chain.proceed();
                Activity activity = (Activity) chain.getThisObject();
                lastTargetActivity = new WeakReference<>(activity);
                handleVersionCheckRequest(activity);
                return result;
            });

            info("HOOK_UI_OK class=" + MAIN_ACTIVITY
                    + " methods=onCreate,onResume,onNewIntent");
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
                    for (WeakReference<View> reference : cachedViews) {
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
                if (!isEnabled(Config.KEY_SHARE_TASK, true)) {
                    return chain.proceed();
                }
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
            Method getUrl = taskClass.getMethod("getUrl");
            Method getState = taskClass.getMethod("getState");
            Method getStateDesc = taskClass.getMethod("getState_desc");
            Method getReportExtra = taskClass.getMethod("getReport_extra");
            Method reportTaskClick = fragmentClass.getMethod("N3", fragmentClass, taskClass);
            Method getTaskShareListener = fragmentClass.getMethod("b4", fragmentClass);
            Field fragmentField = adapterClass.getDeclaredField("b");

            bind.setAccessible(true);
            findView.setAccessible(true);
            fragmentField.setAccessible(true);

            hook(bind).intercept(chain -> {
                Object result = chain.proceed();
                if (!isEnabled(Config.KEY_SHARE_TASK, true)) {
                    return result;
                }
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
                    String stateDesc = stringValue(getStateDesc.invoke(task));
                    String url = stringValue(getUrl.invoke(task));

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

                    String buttonText = readTaskButtonText(holder, findView);
                    Object fragment = fragmentField.get(chain.getThisObject());
                    if (fragment == null) {
                        warn("TASK_BIND_SKIP reason=fragment_missing title=" + title);
                        return result;
                    }

                    info("TASK_BIND_MATCH title=" + title
                            + " type=" + type
                            + " state=" + state
                            + " state_desc=" + stateDesc
                            + " button=" + buttonText
                            + " url=" + url
                            + " src=" + source
                            + " report_extra=" + stringValue(reportExtra));

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
            Class<?> fragmentClass = Class.forName(TASK_FRAGMENT, false, classLoader);
            Class<?> resultClass = Class.forName(TASK_RESULT, false, classLoader);
            Method consume = fragmentClass.getDeclaredMethod(
                    "n4", fragmentClass, resultClass);
            consume.setAccessible(true);
            hook(consume).intercept(chain -> {
                Object result = chain.proceed();
                if (isEnabled(Config.KEY_DAILY_SHARE_TASK, true)
                        && isEnabled(Config.KEY_SHARE_TASK, true)) {
                    scheduleDailyShareTasks(chain.getArg(0), chain.getArg(1), classLoader);
                }
                return result;
            });
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
        if (!isEnabled(Config.KEY_DAILY_SHARE_TASK, true)
                || !isEnabled(Config.KEY_SHARE_TASK, true)) {
            return;
        }
        Context context = targetContext;
        if (context == null) {
            return;
        }
        String day = currentDay();
        if (day.equals(context.getSharedPreferences(
                DAILY_RUNTIME_PREFS, Context.MODE_PRIVATE)
                .getString(DAILY_SHARE_DATE, ""))) {
            return;
        }
        synchronized (this) {
            if (dailyShareFetchRequested || dailyShareInProgress) {
                return;
            }
            dailyShareFetchRequested = true;
        }
        new Handler(Looper.getMainLooper()).postDelayed(
                () -> requestDailyShareList(classLoader, day, 1),
                DAILY_SHARE_START_DELAY_MS);
        info("DAILY_TASK_FETCH_SCHEDULED day=" + day
                + " delay_ms=" + DAILY_SHARE_START_DELAY_MS);
    }

    private void requestDailyShareList(ClassLoader classLoader, String day, int attempt) {
        if (!dailyShareFetchRequested) {
            return;
        }
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
                            new Handler(Looper.getMainLooper()).post(() -> {
                                boolean handled = scheduleDailyShareTasks(
                                        null, taskResult, classLoader);
                                if (!handled) {
                                    scheduleDailyShareRetry(classLoader, day, attempt,
                                            "invalid_or_unhandled_result");
                                }
                            });
                        } else if ("onError".equals(name)) {
                            Throwable fetchError = args != null && args.length > 0
                                    && args[0] instanceof Throwable
                                    ? (Throwable) args[0] : null;
                            scheduleDailyShareRetry(classLoader, day, attempt,
                                    fetchError == null ? "unknown" : fetchError.getMessage());
                        }
                        return null;
                    });
            Method subscribe = observable.getClass().getMethod(
                    "J5", observerClass);
            subscribe.invoke(observable, observer);
            info("DAILY_TASK_FETCH_REQUEST_OK endpoint=/task/list_v2/ attempt=" + attempt);
        } catch (Throwable throwable) {
            scheduleDailyShareRetry(classLoader, day, attempt,
                    unwrap(throwable).getClass().getSimpleName());
            error("DAILY_TASK_FETCH_REQUEST_ERROR attempt=" + attempt, unwrap(throwable));
        }
    }

    private void scheduleDailyShareRetry(ClassLoader classLoader, String day,
                                          int attempt, String reason) {
        warn("DAILY_TASK_FETCH_ERROR attempt=" + attempt + " reason=" + reason);
        if (attempt >= DAILY_SHARE_MAX_FETCH_ATTEMPTS) {
            dailyShareFetchRequested = false;
            warn("DAILY_TASK_FETCH_GIVE_UP day=" + day);
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(
                () -> requestDailyShareList(classLoader, day, attempt + 1),
                DAILY_SHARE_RETRY_DELAY_MS);
    }

    private boolean scheduleDailyShareTasks(Object fragment, Object taskResult,
                                            ClassLoader classLoader) {
        if (taskResult == null || dailyShareInProgress) {
            return false;
        }

        try {
            Context context = fragment == null ? targetContext : getFragmentContext(fragment);
            if (context == null) {
                warn("DAILY_TASK_SKIP reason=context_missing");
                return false;
            }

            String day = currentDay();
            List<Object> tasks = collectShareTasks(taskResult);
            if (tasks.isEmpty()) {
                markDailyShareDay(context, day);
                dailyShareFetchRequested = false;
                info("DAILY_TASK_SKIP reason=no_pending_share_task");
                return true;
            }
            info("DAILY_TASK_DISCOVERED count=" + tasks.size()
                    + " titles=" + taskTitles(tasks));

            synchronized (this) {
                if (dailyShareInProgress) {
                    return false;
                }
                SharedPreferences runtime = context.getSharedPreferences(
                        DAILY_RUNTIME_PREFS, Context.MODE_PRIVATE);
                if (day.equals(runtime.getString(DAILY_SHARE_DATE, ""))) {
                    dailyShareFetchRequested = false;
                    info("DAILY_TASK_SKIP reason=already_run day=" + day);
                    return true;
                }
                // 不在任务真正上报前写入日期；进程被杀或网络失败时，下一次启动
                // 仍可重试，而 dailyShareInProgress 负责阻止当前响应链重复执行。
                dailyShareInProgress = true;
            }

            info("DAILY_TASK_START day=" + day + " count=" + tasks.size());
            Handler handler = new Handler(Looper.getMainLooper());
            DailyShareSummary summary = new DailyShareSummary(tasks.size(), day);
            for (int index = 0; index < tasks.size(); index++) {
                final Object task = tasks.get(index);
                final int taskIndex = index;
                handler.postDelayed(() -> performDailyShareTask(
                        fragment, task, taskIndex, summary, classLoader, context),
                        index * 450L);
            }
            handler.postDelayed(() -> finishDailyShareTasks(
                    fragment, summary, context), tasks.size() * 450L + 350L);
            return true;
        } catch (Throwable throwable) {
            dailyShareInProgress = false;
            error("DAILY_TASK_SCHEDULE_ERROR", unwrap(throwable));
            return false;
        }
    }

    private void markDailyShareDay(Context context, String day) {
        if (context == null || day == null || day.isEmpty()) {
            return;
        }
        context.getSharedPreferences(DAILY_RUNTIME_PREFS, Context.MODE_PRIVATE)
                .edit().putString(DAILY_SHARE_DATE, day).apply();
    }

    private static String currentDay() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(new Date());
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
            markDailyShareDay(context, summary.day);
        }
        // 请求已经结束，允许下一次启动在部分任务失败时重试；完整成功或空列表
        // 会由日期标记阻止同一天重复请求。
        dailyShareFetchRequested = false;
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
        int completed;
        long exp;
        long coin;

        DailyShareSummary(int scheduled, String day) {
            this.scheduled = scheduled;
            this.day = day;
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
            Method adsDestroy = findInheritedMethod(splashClass, "onDestroy");
            Method continueLaunch = splashClass.getMethod("Y1", boolean.class);
            selectAd.setAccessible(true);
            splashInitialize.setAccessible(true);
            adsDestroy.setAccessible(true);
            continueLaunch.setAccessible(true);

            // 比“让广告选择器返回 null”更快：不再创建和绑定广告页面，直接进入
            // SplashActivity 原本的无广告启动分支。隐私协议、登录态和初始化逻辑仍保留。
            hook(splashInitialize).intercept(chain -> {
                Activity splash = (Activity) chain.getThisObject();
                targetContext = splash.getApplicationContext();
                if (splash.getIntent() != null
                        && splash.getIntent().getData() != null
                        && Config.URI_REQUEST_VERSION_CHECK.equals(
                        splash.getIntent().getData().toString())) {
                    // 用完整初始化路径处理一次内部版本检测请求，完成后仍由广告
                    // 选择器 Hook 保证不会显示开屏广告。
                    Object result = chain.proceed();
                    handleVersionCheckRequest(splash);
                    return result;
                }
                if (!isEnabled(Config.KEY_SKIP_SPLASH_AD, true)) {
                    return chain.proceed();
                }
                continueLaunch.invoke(splash, false);
                info("SPLASH_FAST_BYPASS");
                return null;
            });

            // 快速路径没有创建 AdsActivity 的 ViewBinding；其原 onDestroy() 未做空值
            // 判断，会读取 O.j。此时只执行 Activity 自身的销毁即可，避免 NPE。
            hook(adsDestroy).intercept(chain -> {
                if (isEnabled(Config.KEY_SKIP_SPLASH_AD, true)
                        && SPLASH_ACTIVITY.equals(chain.getThisObject().getClass().getName())) {
                    Field binding = chain.getThisObject().getClass().getSuperclass()
                            .getDeclaredField("O");
                    binding.setAccessible(true);
                    if (binding.get(chain.getThisObject()) == null) {
                        // 先补一个轻量 ViewBinding，再让原 onDestroy 正常调用
                        // BaseActivity.onDestroy()；这样既不会读空 O.j，也满足系统的
                        // mCalled 检查。
                        Class<?> bindingClass = Class.forName(
                                "df.e", false, chain.getThisObject().getClass().getClassLoader());
                        Method inflate = bindingClass.getMethod(
                                "c", android.view.LayoutInflater.class);
                        Object value = inflate.invoke(null,
                                ((Activity) chain.getThisObject()).getLayoutInflater());
                        binding.set(chain.getThisObject(), value);
                        info("SPLASH_FAST_DESTROY_BINDING_READY");
                    }
                }
                return chain.proceed();
            });

            hook(selectAd).intercept(chain -> {
                if (!isEnabled(Config.KEY_SKIP_SPLASH_AD, true)) {
                    return chain.proceed();
                }
                info("SPLASH_AD_BYPASS launch=" + chain.getArg(0));
                return null;
            });

            info("HOOK_SPLASH_AD_OK methods=" + SPLASH_ACTIVITY
                    + ".k1,AdsActivity.onDestroy," + OPEN_SCREEN_AD_SELECTOR + ".g");
        } catch (Throwable throwable) {
            error("HOOK_SPLASH_AD_ERROR method=" + OPEN_SCREEN_AD_SELECTOR + ".g", throwable);
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
                handleVersionCheckRequest(activity);
                try {
                    addSettingsEntry(activity, itemConstructor, setTitle, setTitleDesc,
                            setRightDesc, setRightType, arrow);
                } catch (Throwable throwable) {
                    error("SETTINGS_ENTRY_ERROR", unwrap(throwable));
                }
                return result;
            });
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
        setRightDesc.invoke(entry, "5 项功能");
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
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(
                    Config.MODULE_PACKAGE, Config.MODULE_PACKAGE + ".SettingsActivity"));
            // SettingsActivity 虽然由模块 APK 提供，但任务归属小黑盒；不创建模块自己的
            // 最近任务卡片，返回键也会回到小黑盒原设置页。
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
            info("SETTINGS_OPEN_OK");
        } catch (Throwable throwable) {
            error("SETTINGS_OPEN_ERROR", throwable);
        }
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

    /**
     * 自动模式从官方 version_control_info 响应中学习最新 versionName；伪装入口覆盖
     * 应用自己的 x0() 版本工具和 PackageManager 读取，避免改动系统中其他应用的信息。
     */
    private void installVersionSpoofHooks(ClassLoader classLoader) {
        prepareVersionCheck(classLoader);
        installVersionResponseObserver(classLoader);
        installUpdatePromptHooks(classLoader);
        installAppVersionUtilityHook(classLoader);
        installAppVersionCodeUtilityHook(classLoader);
        installNetworkVersionIdentityHook(classLoader);
        installBuildConfigVersionHooks(classLoader);
        installPackageInfoHooks(classLoader);
    }

    private void prepareVersionCheck(ClassLoader classLoader) {
        try {
            Class<?> updateManager = Class.forName(
                    "com.max.xiaoheihe.utils.AppUpdateManager", false, classLoader);
            appUpdateCheckMethod = updateManager.getMethod("r", Context.class);
            appUpdateCheckMethod.setAccessible(true);
            info("VERSION_CHECK_READY method=AppUpdateManager.r");
        } catch (Throwable throwable) {
            error("VERSION_CHECK_PREPARE_ERROR", throwable);
        }
    }

    private void handleVersionCheckRequest(Activity activity) {
        if (activity == null || activity.getIntent() == null
                || activity.getIntent().getData() == null
                || !Config.URI_REQUEST_VERSION_CHECK.equals(
                activity.getIntent().getData().toString())) {
            return;
        }
        // 清掉 data，避免 Activity 复用或配置变化时重复发起请求。
        activity.getIntent().setData(null);
        Method check = appUpdateCheckMethod;
        if (check == null) {
            warn("VERSION_CHECK_REQUEST_SKIP method_missing");
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
            new Handler(Looper.getMainLooper()).postDelayed(() -> {
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
            hook(getVersion).intercept(chain -> {
                Object result = chain.proceed();
                rememberLatestVersion(stringValue(result));
                return result;
            });

            try {
                Method setVersion = versionObject.getMethod("setVersion", String.class);
                hook(setVersion).intercept(chain -> {
                    rememberLatestVersion(stringValue(chain.getArg(0)));
                    return chain.proceed();
                });
            } catch (NoSuchMethodException ignored) {
                // Gson 直接写字段时，getVersion 观察器仍能获取返回值。
            }

            Method getNeedUpdate = versionObject.getMethod("getNeed_update");
            hook(getNeedUpdate).intercept(chain -> {
                Object result = chain.proceed();
                // 主动诊断请求期间保留服务端 need_update 原值，否则始终改成 0
                // 会让测试看起来像“请求成功但没有任何更新结果”。
                return isEnabled(Config.KEY_SPOOF_VERSION, true)
                        && isEnabled(Config.KEY_SUPPRESS_UPDATE_PROMPT, true)
                        && !forceLegacyVersionForCheck ? "0" : result;
            });

            // 更新回调在 need_update=0 时不会主动调用 getVersion()，因此在它判断更新
            // 状态前读取一次响应对象，保证“检查更新”总能刷新自动模式缓存。
            Class<?> resultClass = Class.forName(
                    "com.max.hbutils.bean.Result", false, classLoader);
            Class<?> callbackClass = Class.forName(
                    "com.max.xiaoheihe.utils.AppUpdateManager$i", false, classLoader);
            Method callback = callbackClass.getMethod("onNext", resultClass);
            Method getResult = resultClass.getMethod("getResult");
            hook(callback).intercept(chain -> {
                boolean diagnosticRequest = forceLegacyVersionForCheck;
                String responseVersion = "";
                boolean responseObjectFound = false;
                try {
                    Object envelope = chain.getArg(0);
                    Object value = envelope == null ? null : getResult.invoke(envelope);
                    info("VERSION_RESPONSE_CALLBACK envelope="
                            + (envelope == null ? "null" : envelope.getClass().getSimpleName())
                            + " value="
                            + (value == null ? "null" : value.getClass().getSimpleName()));
                    if (versionObject.isInstance(value)) {
                        responseObjectFound = true;
                        responseVersion = readRawServerVersion(value);
                        info("VERSION_RESPONSE_DATA version=" + responseVersion);
                        rememberLatestVersion(responseVersion);
                    }
                } catch (Throwable throwable) {
                    warn("VERSION_RESPONSE_READ_ERROR "
                            + unwrap(throwable).getClass().getSimpleName());
                }
                if (diagnosticRequest) {
                    forceLegacyVersionForCheck = false;
                    if (responseObjectFound && isPlausibleVersion(responseVersion)) {
                        showVersionCheckToast("版本检测成功：服务器版本 " + responseVersion);
                    } else {
                        showVersionCheckToast("版本检测成功，但服务器未返回版本号");
                    }
                    // 诊断按钮只报告结果，不继续走小黑盒原生升级弹窗。
                    return null;
                }
                Object callbackResult = chain.proceed();
                if (forceLegacyVersionForCheck) {
                    forceLegacyVersionForCheck = false;
                }
                return callbackResult;
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
                    if (isEnabled(Config.KEY_SUPPRESS_UPDATE_PROMPT, true)) {
                        // 普通版本请求失败时，基础 Observer 也可能创建“请升级”
                        // 错误弹窗；独立开关开启时一并吞掉该 UI 错误链。
                        info("VERSION_RESPONSE_ERROR_SUPPRESSED");
                        return null;
                    }
                }
                return chain.proceed();
            });
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
                if (!isEnabled(Config.KEY_SUPPRESS_UPDATE_PROMPT, true)) {
                    return chain.proceed();
                }
                info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager.v");
                return null;
            });

            Method showUpdate = updateManager.getMethod(
                    "w", appCompatActivity, versionObject, Boolean.class);
            hook(showUpdate).intercept(chain -> {
                if (!isEnabled(Config.KEY_SUPPRESS_UPDATE_PROMPT, true)) {
                    return chain.proceed();
                }
                info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager.w");
                return null;
            });

            Method showBeta = updateManager.getMethod(
                    "B", appCompatActivity, betaTestInfo);
            hook(showBeta).intercept(chain -> {
                if (!isEnabled(Config.KEY_SUPPRESS_UPDATE_PROMPT, true)) {
                    return chain.proceed();
                }
                info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager.B");
                return null;
            });

            try {
                Method showReady = updateManager.getDeclaredMethod("C");
                showReady.setAccessible(true);
                hook(showReady).intercept(chain -> {
                    if (!isEnabled(Config.KEY_SUPPRESS_UPDATE_PROMPT, true)) {
                        return chain.proceed();
                    }
                    info("UPDATE_PROMPT_SUPPRESSED method=AppUpdateManager.C");
                    return null;
                });
            } catch (NoSuchMethodException ignored) {
                // C() 是当前版本下载完成后的内部方法，旧版不存在时无需失败整个安装。
                warn("HOOK_UPDATE_PROMPT_SKIP method=AppUpdateManager.C");
            }
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
                if (spoofVersionSnapshot) {
                    Object builder = chain.getArg(0);
                    String endpoint = stringValue(chain.getArg(1));
                    // 诊断请求只对版本控制接口使用低版本身份；不能把 0.0.0
                    // 写入所有并发请求，否则统计/首页请求会被服务端判定为过旧，
                    // 继而在 RxCachedThreadScheduler 上弹升级对话框并导致闪退。
                    boolean diagnosticVersionRequest = forceLegacyVersionForCheck
                            && isVersionCheckEndpoint(endpoint);
                    String version = diagnosticVersionRequest
                            ? "0.0.0" : resolveSpoofVersion("1.3.347");
                    long versionCode = diagnosticVersionRequest
                            ? 1L : resolveSpoofVersionCode(916L);
                    queryMethod.invoke(builder, "version", version);
                    queryMethod.invoke(builder, "build", String.valueOf(versionCode));
                    if (diagnosticVersionRequest) {
                        info("VERSION_CHECK_IDENTITY endpoint=" + endpoint
                                + " version=" + version + " build=" + versionCode);
                    }
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
                method.setAccessible(true);
                hook(method).intercept(chain -> {
                    Object result = chain.proceed();
                    if (!spoofVersionSnapshot
                            || !TARGET_PACKAGE.equals(chain.getArg(0))
                            || !(result instanceof PackageInfo)) {
                        return result;
                    }
                    if (result instanceof PackageInfo) {
                        PackageInfo packageInfo = (PackageInfo) result;
                        packageInfo.versionName = resolveSpoofVersion(packageInfo.versionName);
                        long realVersionCode = getPackageVersionCode(packageInfo);
                        setPackageVersionCode(packageInfo,
                                resolveSpoofVersionCode(realVersionCode));
                    }
                    return result;
                });
                installed++;
            }
            info("HOOK_PACKAGE_INFO_OK overloads=" + installed);
        } catch (Throwable throwable) {
            error("HOOK_PACKAGE_INFO_ERROR", throwable);
        }
    }

    private void rememberLatestVersion(String version) {
        String value = version == null ? "" : version.trim();
        if (!isPlausibleVersion(value) || value.equals(latestServerVersion)) {
            return;
        }
        latestServerVersion = value;
        info("VERSION_LATEST_DETECTED version=" + value);
        // version_control_info 只返回 versionName，没有对应的 versionCode；不把
        // 它写入持久缓存，避免自动模式复用旧编号造成成对标识错配。设置页的
        // 小米商店接口会同时写入两个字段，作为自动伪装的可靠来源。
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
        if (activity == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(() -> {
            try {
                if (!activity.isFinishing()
                        && (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed())) {
                    Toast.makeText(activity, message, Toast.LENGTH_LONG).show();
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
            return isPlausibleVersion(custom) ? custom : real;
        }

        // 仅使用应用商店接口保存的成对数据，避免把更新接口返回的 versionName
        // 与旧的 versionCode 错配。
        String latest = cachedLatestVersionSnapshot;
        if (!isPlausibleVersion(latest)
                || !isPlausibleVersionCode(cachedLatestVersionCodeSnapshot)
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
            return isPlausibleVersionCode(customVersionCodeSnapshot)
                    ? customVersionCodeSnapshot : realVersionCode;
        }
        long latestCode = cachedLatestVersionCodeSnapshot;
        // versionCode 单调递增；更新应用后不使用更低的旧缓存。
        return isPlausibleVersionCode(latestCode) && latestCode >= realVersionCode
                ? latestCode : realVersionCode;
    }

    /** 预计算目标 APK 当前基准版本的伪装结果，减少网络拦截器中的重复比较。 */
    private void refreshEffectiveVersionSnapshot() {
        String effectiveName = "1.3.347";
        long effectiveCode = 916L;
        if (!spoofVersionSnapshot) {
            effectiveVersionSnapshot = effectiveName;
            effectiveVersionCodeSnapshot = effectiveCode;
            return;
        }
        if (Config.VERSION_MODE_CUSTOM.equals(versionModeSnapshot)) {
            if (isPlausibleVersion(customVersionSnapshot)) {
                effectiveName = customVersionSnapshot;
            }
            if (isPlausibleVersionCode(customVersionCodeSnapshot)) {
                effectiveCode = customVersionCodeSnapshot;
            }
        } else {
            if (isPlausibleVersion(cachedLatestVersionSnapshot)
                    && isPlausibleVersionCode(cachedLatestVersionCodeSnapshot)
                    && compareVersions(cachedLatestVersionSnapshot, "1.3.347") >= 0) {
                effectiveName = cachedLatestVersionSnapshot;
            }
            if (isPlausibleVersionCode(cachedLatestVersionCodeSnapshot)
                    && cachedLatestVersionCodeSnapshot >= 916L) {
                effectiveCode = cachedLatestVersionCodeSnapshot;
            }
        }
        effectiveVersionSnapshot = effectiveName;
        effectiveVersionCodeSnapshot = effectiveCode;
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
     * 因此进程启动时读取一次，避免每个网络请求都跨进程访问 RemotePreferences。
     */
    private void loadVersionConfigSnapshot() {
        spoofVersionSnapshot = isEnabled(Config.KEY_SPOOF_VERSION, true);
        versionModeSnapshot = getPreferenceString(
                Config.KEY_VERSION_MODE, Config.VERSION_MODE_AUTO);
        customVersionSnapshot = getPreferenceString(Config.KEY_CUSTOM_VERSION, "").trim();
        customVersionCodeSnapshot = getPreferenceLong(Config.KEY_CUSTOM_VERSION_CODE, 0L);
        cachedLatestVersionSnapshot = getPreferenceString(
                Config.KEY_LATEST_VERSION, "").trim();
        cachedLatestVersionCodeSnapshot = getPreferenceLong(
                Config.KEY_LATEST_VERSION_CODE, 0L);
        refreshEffectiveVersionSnapshot();
        info("VERSION_CONFIG_READY enabled=" + spoofVersionSnapshot
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
