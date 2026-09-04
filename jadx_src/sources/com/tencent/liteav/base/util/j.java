package com.tencent.liteav.base.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t<Boolean> f99703a = new t<>(k.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile WeakReference<Activity> f99704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Boolean f99705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile a f99706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<Integer> f99707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Integer> f99708f;

    public interface a {
        void a(boolean z10);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f99709a = new j(0);
    }

    private j() {
        this.f99704b = null;
        this.f99705c = null;
        this.f99707e = new HashSet();
        this.f99708f = new HashSet();
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.e("ProcessLifecycleOwner", "ProcessStateOwner init failed. Context is null", new Object[0]);
        } else {
            ((Application) applicationContext.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        }
    }

    /* synthetic */ j(byte b10) {
        this();
    }

    public static j a() {
        return b.f99709a;
    }

    public static void a(boolean z10) {
        f99703a.a(Boolean.valueOf(z10));
    }

    private static boolean a(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager == null) {
                Log.e("ProcessLifecycleOwner", "activityManager is null.", new Object[0]);
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                Log.e("ProcessLifecycleOwner", "processInfoList is null.", new Object[0]);
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            Log.e("ProcessLifecycleOwner", "Get App background state failed. ".concat(String.valueOf(e10)), new Object[0]);
            return false;
        }
    }

    private void b(Activity activity) {
        this.f99707e.add(Integer.valueOf(activity.hashCode()));
        this.f99704b = new WeakReference<>(activity);
        b(false);
        Log.i("ProcessLifecycleOwner", "update activity to ".concat(String.valueOf(activity)), new Object[0]);
    }

    private synchronized void b(boolean z10) {
        if (this.f99705c == null || this.f99705c.booleanValue() != z10) {
            this.f99705c = Boolean.valueOf(z10);
            f99703a.a(Boolean.valueOf(z10));
            if (this.f99706d != null) {
                this.f99706d.a(this.f99705c.booleanValue());
            }
        }
    }

    public final synchronized void a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (c() != null) {
            Log.i("ProcessLifecycleOwner", "activity is exists, don't need activity from user", new Object[0]);
            return;
        }
        this.f99704b = new WeakReference<>(activity);
        Log.i("ProcessLifecycleOwner", "update activity to " + activity + " from user", new Object[0]);
    }

    public final synchronized void a(a aVar) {
        this.f99706d = aVar;
    }

    public final synchronized boolean b() {
        if (this.f99705c == null) {
            this.f99705c = f99703a.a();
        }
        return this.f99705c.booleanValue();
    }

    public final Activity c() {
        WeakReference<Activity> weakReference = this.f99704b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        Log.i("ProcessLifecycleOwner", "onActivityDestroyed, activity=".concat(String.valueOf(activity)), new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        this.f99708f.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        int iHashCode = activity.hashCode();
        boolean z10 = true;
        if (this.f99707e.contains(Integer.valueOf(iHashCode))) {
            this.f99707e.remove(Integer.valueOf(iHashCode));
            if (this.f99707e.size() != 0) {
                z10 = false;
            }
            b(z10);
        } else if (this.f99707e.size() != 0) {
            b(false);
        } else if (this.f99708f.contains(Integer.valueOf(iHashCode))) {
            b(true);
        }
        this.f99708f.remove(Integer.valueOf(iHashCode));
    }
}
