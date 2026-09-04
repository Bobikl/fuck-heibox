package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import z8.v;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f52371f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f52372b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f52373c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("sInstance")
    private final ArrayList f52374d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("sInstance")
    private boolean f52375e = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @v8.a
    public interface InterfaceC0409a {
        @v8.a
        void a(boolean z10);
    }

    @v8.a
    private a() {
    }

    @n0
    @v8.a
    public static a b() {
        return f52371f;
    }

    @v8.a
    public static void c(@n0 Application application) {
        a aVar = f52371f;
        synchronized (aVar) {
            if (!aVar.f52375e) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f52375e = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f52371f) {
            Iterator it = this.f52374d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0409a) it.next()).a(z10);
            }
        }
    }

    @v8.a
    public void a(@n0 InterfaceC0409a interfaceC0409a) {
        synchronized (f52371f) {
            this.f52374d.add(interfaceC0409a);
        }
    }

    @v8.a
    public boolean d() {
        return this.f52372b.get();
    }

    @v8.a
    @TargetApi(16)
    public boolean e(boolean z10) {
        if (!this.f52373c.get()) {
            if (!v.e()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f52373c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f52372b.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@n0 Activity activity, @p0 Bundle bundle) {
        boolean zCompareAndSet = this.f52372b.compareAndSet(true, false);
        this.f52373c.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@n0 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@n0 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@n0 Activity activity) {
        boolean zCompareAndSet = this.f52372b.compareAndSet(true, false);
        this.f52373c.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@n0 Activity activity, @n0 Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@n0 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@n0 Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@n0 Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f52372b.compareAndSet(false, true)) {
            this.f52373c.set(true);
            f(true);
        }
    }
}
