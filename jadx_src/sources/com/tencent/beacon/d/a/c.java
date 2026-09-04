package com.tencent.beacon.d.a;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.exoplayer2.audio.q0;
import com.tencent.beacon.module.StatModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: LifecycleCallbacks.java */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<WeakReference<Activity>> f98961a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f98962b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f98963c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98964d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f98965e = q0.f44202v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f98966f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, String> f98967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StatModule f98968h;

    public c(StatModule statModule) {
        this.f98968h = statModule;
        HashMap map = new HashMap(6);
        this.f98967g = map;
        map.put("A63", "N");
        this.f98967g.put("A66", "F");
    }

    public static SparseArray<WeakReference<Activity>> a() {
        return f98961a;
    }

    private void a(Activity activity) {
        com.tencent.beacon.a.c.b.f98782d = true;
        b(activity);
        if (!this.f98962b) {
            com.tencent.beacon.base.util.c.a("[event] lifecycle callback recover active user.", new Object[0]);
            com.tencent.beacon.a.b.a.a().a(new b(this, activity));
            this.f98962b = true;
        }
        if (c()) {
            d();
        }
    }

    private void a(boolean z10, Activity activity) {
        if (z10) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f98963c > 0) {
                long j10 = this.f98964d;
                if (j10 > 0 && j10 + b() <= jCurrentTimeMillis) {
                    com.tencent.beacon.base.util.c.a("[lifecycle] -> return foreground more than 20s.", new Object[0]);
                    d();
                    StatModule statModule = this.f98968h;
                    if (statModule != null) {
                        statModule.a();
                    }
                }
            }
            this.f98963c = jCurrentTimeMillis;
            this.f98964d = 0L;
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.f98964d = jCurrentTimeMillis2;
        long j11 = this.f98963c;
        if (800 + j11 > jCurrentTimeMillis2) {
            com.tencent.beacon.base.util.c.a("[lifecycle] -> debounce activity switch.", new Object[0]);
            this.f98963c = 0L;
            return;
        }
        if (j11 == 0) {
            this.f98963c = jCurrentTimeMillis2;
        }
        StatModule statModule2 = this.f98968h;
        if (statModule2 != null) {
            statModule2.b();
        }
    }

    private long b() {
        if (this.f98965e <= q0.f44202v) {
            String strA = com.tencent.beacon.e.a.a().a("hotLauncher");
            if (strA != null) {
                try {
                    this.f98965e = Long.valueOf(strA).longValue();
                    com.tencent.beacon.base.util.c.a("[strategy] -> change launcher time: %s ms", strA);
                } catch (NumberFormatException unused) {
                    com.tencent.beacon.base.util.c.b("[strategy] -> event param 'hotLauncher' error.", new Object[0]);
                }
            }
            this.f98965e++;
        }
        return this.f98965e;
    }

    private static void b(Activity activity) {
        if (activity == null || f98961a == null) {
            return;
        }
        int iHashCode = activity.hashCode();
        if (f98961a.get(iHashCode) == null) {
            f98961a.put(iHashCode, new WeakReference<>(activity));
        }
    }

    private boolean c() {
        String strD = com.tencent.beacon.base.util.b.d();
        if ("".equals(this.f98966f)) {
            this.f98966f = com.tencent.beacon.a.d.a.a().getString("LAUEVE_DENGTA", "");
        }
        boolean z10 = false;
        if (!strD.equals(this.f98966f)) {
            com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = com.tencent.beacon.a.d.a.a().edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                sharedPreferencesEditorC0949aEdit.putString("LAUEVE_DENGTA", strD);
            }
            if (!"".equals(this.f98966f)) {
                com.tencent.beacon.base.util.c.a("[core] -> report new day launcher event.", new Object[0]);
                z10 = true;
            }
            this.f98966f = strD;
        }
        return z10;
    }

    private void d() {
        com.tencent.beacon.a.b.a.a().a(new a(this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        a(activity);
        a(true, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(activity);
        a(false, activity);
    }
}
