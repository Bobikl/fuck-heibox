package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: AutoViewPageTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f104853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f104862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f104863c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    com.umeng.analytics.vshelper.a f104864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Application.ActivityLifecycleCallbacks f104865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, Long> f104866h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f104867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f104868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f104869n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static JSONArray f104856i = new JSONArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Object f104857j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Application f104858k = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static String f104854d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int f104855e = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f104859o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Object f104860p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static ap f104861q = new com.umeng.analytics.vshelper.b();

    /* JADX INFO: compiled from: AutoViewPageTracker.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final l f104871a = new l();

        private a() {
        }
    }

    private l() {
        this.f104866h = new HashMap();
        this.f104867l = false;
        this.f104862b = false;
        this.f104863c = false;
        this.f104868m = 0;
        this.f104869n = 0;
        this.f104864f = PageNameMonitor.getInstance();
        this.f104865g = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.l.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                l.f104861q.a(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (l.f104860p) {
                        if (l.f104859o) {
                            return;
                        }
                    }
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
                    if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                        com.umeng.analytics.b.a().i();
                    }
                } else {
                    l.this.c(activity);
                    com.umeng.analytics.b.a().i();
                    l.this.f104862b = false;
                    l.f104861q.d(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                    synchronized (l.f104860p) {
                        if (l.f104859o) {
                            boolean unused = l.f104859o = false;
                        }
                    }
                    l.this.a(activity);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                    l.this.a(activity);
                }
                l.f104861q.c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (l.this.f104868m <= 0) {
                        if (l.f104854d == null) {
                            l.f104854d = UUID.randomUUID().toString();
                        }
                        if (l.f104855e == -1) {
                            l.f104855e = activity.isTaskRoot() ? 1 : 0;
                        }
                        if (l.f104855e == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap map = new HashMap();
                            map.put("activityName", activity.toString());
                            map.put(PushConsts.KEY_SERVICE_PIT, Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            com.umeng.analytics.b bVarA = com.umeng.analytics.b.a();
                            if (bVarA != null) {
                                bVarA.a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map<String, Object>) map);
                            }
                            l.f104855e = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, j.ar);
                            }
                        } else if (l.f104855e == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap map2 = new HashMap();
                            map2.put("pairUUID", l.f104854d);
                            map2.put(PushConsts.KEY_SERVICE_PIT, Integer.valueOf(Process.myPid()));
                            map2.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map2.put("activityName", activity.toString());
                            if (com.umeng.analytics.b.a() != null) {
                                com.umeng.analytics.b.a().a((Context) activity, "$$_onUMengEnterForeground", (Map<String, Object>) map2);
                            }
                        }
                    }
                    if (l.this.f104869n < 0) {
                        l.e(l.this);
                    } else {
                        l.f(l.this);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                MobclickAgent.PageMode pageMode = UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION;
                MobclickAgent.PageMode pageMode2 = MobclickAgent.PageMode.AUTO;
                if (activity != null) {
                    if (activity.isChangingConfigurations()) {
                        l.a(l.this);
                        return;
                    }
                    l.b(l.this);
                    if (l.this.f104868m <= 0) {
                        if (l.f104855e == 0 && UMUtils.isMainProgress(activity)) {
                            return;
                        }
                        int i10 = l.f104855e;
                        if (i10 == 1 || (i10 == 0 && !UMUtils.isMainProgress(activity))) {
                            HashMap map = new HashMap();
                            map.put("pairUUID", l.f104854d);
                            map.put("reason", "Normal");
                            map.put(PushConsts.KEY_SERVICE_PIT, Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map.put("activityName", activity.toString());
                            com.umeng.analytics.b bVarA = com.umeng.analytics.b.a();
                            if (bVarA != null) {
                                bVarA.a((Context) activity, "$$_onUMengEnterBackground", (Map<String, Object>) map);
                            }
                            if (l.f104854d != null) {
                                l.f104854d = null;
                            }
                        }
                    }
                }
            }
        };
        synchronized (this) {
            if (f104858k != null) {
                g();
            }
        }
    }

    static /* synthetic */ int a(l lVar) {
        int i10 = lVar.f104869n;
        lVar.f104869n = i10 - 1;
        return i10;
    }

    public static synchronized l a(Context context) {
        if (f104858k == null && context != null) {
            if (context instanceof Activity) {
                f104858k = ((Activity) context).getApplication();
            } else if (context instanceof Application) {
                f104858k = (Application) context;
            }
        }
        return a.f104871a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                synchronized (f104860p) {
                    com.umeng.analytics.b.a().h();
                }
                return;
            }
            return;
        }
        if (activity != null) {
            String str = activity.getPackageName() + "." + activity.getLocalClassName();
            this.f104864f.activityResume(str);
            if (!this.f104862b) {
                b(activity);
                synchronized (f104860p) {
                    com.umeng.analytics.b.a().h();
                }
                return;
            }
            this.f104862b = false;
            if (TextUtils.isEmpty(f104853a)) {
                f104853a = str;
            } else {
                if (f104853a.equals(str)) {
                    return;
                }
                b(activity);
                synchronized (f104860p) {
                    com.umeng.analytics.b.a().h();
                }
            }
        }
    }

    public static void a(Context context, String str) {
        if (f104855e == 1 && UMUtils.isMainProgress(context)) {
            HashMap map = new HashMap();
            map.put("pairUUID", f104854d);
            map.put("reason", str);
            if (f104854d != null) {
                f104854d = null;
            }
            if (context != null) {
                map.put(PushConsts.KEY_SERVICE_PIT, Integer.valueOf(Process.myPid()));
                map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                map.put("Context", context.toString());
                com.umeng.analytics.b.a().a(context, "$$_onUMengEnterBackground", (Map<String, Object>) map);
            }
        }
    }

    static /* synthetic */ int b(l lVar) {
        int i10 = lVar.f104868m;
        lVar.f104868m = i10 - 1;
        return i10;
    }

    private void b(Activity activity) {
        f104853a = activity.getPackageName() + "." + activity.getLocalClassName();
        synchronized (this.f104866h) {
            this.f104866h.put(f104853a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        long j10;
        long j11;
        try {
            synchronized (this.f104866h) {
                if (f104853a == null && activity != null) {
                    f104853a = activity.getPackageName() + "." + activity.getLocalClassName();
                }
                j10 = 0;
                if (TextUtils.isEmpty(f104853a) || !this.f104866h.containsKey(f104853a)) {
                    j11 = 0;
                } else {
                    long jLongValue = this.f104866h.get(f104853a).longValue();
                    long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                    this.f104866h.remove(f104853a);
                    j10 = jCurrentTimeMillis;
                    j11 = jLongValue;
                }
            }
            synchronized (f104857j) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(d.f104715v, f104853a);
                    jSONObject.put("duration", j10);
                    jSONObject.put(d.f104717x, j11);
                    jSONObject.put("type", 0);
                    f104856i.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static void c(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f104857j) {
                    string = f104856i.toString();
                    f104856i = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put(e.d.a.f104765c, new JSONArray(string));
                    i.a(context).a(u.a().c(), jSONObject, i.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ int e(l lVar) {
        int i10 = lVar.f104869n;
        lVar.f104869n = i10 + 1;
        return i10;
    }

    static /* synthetic */ int f(l lVar) {
        int i10 = lVar.f104868m;
        lVar.f104868m = i10 + 1;
        return i10;
    }

    private void g() {
        if (this.f104867l) {
            return;
        }
        this.f104867l = true;
        if (f104858k != null) {
            f104858k.registerActivityLifecycleCallbacks(this.f104865g);
        }
    }

    public boolean a() {
        return this.f104867l;
    }

    public void b() {
        this.f104867l = false;
        if (f104858k != null) {
            f104858k.unregisterActivityLifecycleCallbacks(this.f104865g);
            f104858k = null;
        }
    }

    public void b(Context context) {
        synchronized (f104860p) {
            if (!f104859o) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: firstResumeCall = false，直接返回。");
                return;
            }
            f104859o = false;
            Activity globleActivity = DeviceConfig.getGlobleActivity(context);
            if (globleActivity == null) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
                return;
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 补救成功，前台Activity名：" + globleActivity.getLocalClassName());
            a(globleActivity);
        }
    }

    public void c() {
        c((Activity) null);
        b();
    }
}
