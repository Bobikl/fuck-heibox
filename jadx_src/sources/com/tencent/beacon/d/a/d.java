package com.tencent.beacon.d.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.beacon.module.StatModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PageTimeLifeCallbacks.java */
/* JADX INFO: loaded from: classes4.dex */
@TargetApi(14)
public class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f98969a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Activity, Long> f98970b = new HashMap(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StatModule f98971c;

    public d(StatModule statModule) {
        this.f98971c = statModule;
    }

    private void a(Activity activity) {
        Long lValueOf = this.f98970b.get(activity);
        if (lValueOf == null) {
            lValueOf = Long.valueOf(this.f98969a);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f98971c.b(activity.getLocalClassName(), jCurrentTimeMillis - lValueOf.longValue(), jCurrentTimeMillis);
        this.f98970b.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f98970b.put(activity, Long.valueOf(System.currentTimeMillis()));
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
