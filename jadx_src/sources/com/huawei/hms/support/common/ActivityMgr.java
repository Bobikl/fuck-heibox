package com.huawei.hms.support.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;
import lg.a;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityMgr implements Application.ActivityLifecycleCallbacks {
    public static final ActivityMgr INST = new ActivityMgr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f62676a;

    private ActivityMgr() {
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public Activity getCurrentActivity() {
        if (this.f62676a == null) {
            HMSLog.i("ActivityMgr", "mCurrentActivity is " + this.f62676a);
            return null;
        }
        HMSLog.i("ActivityMgr", "mCurrentActivity.get() is " + this.f62676a.get());
        return this.f62676a.get();
    }

    public void init(Application application) {
        HMSLog.d("ActivityMgr", a.f131415h);
        if (application == null) {
            HMSLog.w("ActivityMgr", "init failed for app is null");
            return;
        }
        ActivityMgr activityMgr = INST;
        application.unregisterActivityLifecycleCallbacks(activityMgr);
        application.registerActivityLifecycleCallbacks(activityMgr);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        HMSLog.d("ActivityMgr", "onCreated:" + a(activity));
        this.f62676a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        HMSLog.d("ActivityMgr", "onResumed:" + a(activity));
        this.f62676a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        HMSLog.d("ActivityMgr", "onStarted:" + a(activity));
        this.f62676a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
