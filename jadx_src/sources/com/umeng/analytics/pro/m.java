package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;

/* JADX INFO: compiled from: BackgroundMonitor.java */
/* JADX INFO: loaded from: classes4.dex */
public class m implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f104872a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f104873b = 3000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f104874c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f104875d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f104876e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<n> f104877f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f104878g = new a();

    /* JADX INFO: compiled from: BackgroundMonitor.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!m.this.f104874c || !m.this.f104875d) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> still foreground.");
                return;
            }
            m.this.f104874c = false;
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> went background.");
            for (int i10 = 0; i10 < m.this.f104877f.size(); i10++) {
                ((n) m.this.f104877f.get(i10)).n();
            }
        }
    }

    private m() {
    }

    public static m a() {
        return f104872a;
    }

    public static void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f104872a);
        }
    }

    public synchronized void a(n nVar) {
        if (nVar != null) {
            this.f104877f.add(nVar);
        }
    }

    public synchronized void b(n nVar) {
        if (nVar != null) {
            for (int i10 = 0; i10 < this.f104877f.size(); i10++) {
                if (this.f104877f.get(i10) == nVar) {
                    this.f104877f.remove(i10);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f104875d = true;
        a aVar = this.f104878g;
        if (aVar != null) {
            this.f104876e.removeCallbacks(aVar);
            this.f104876e.postDelayed(this.f104878g, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f104875d = false;
        this.f104874c = true;
        a aVar = this.f104878g;
        if (aVar != null) {
            this.f104876e.removeCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
