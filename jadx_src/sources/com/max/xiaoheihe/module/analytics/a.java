package com.max.xiaoheihe.module.analytics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ActivityStackManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f79502b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<WeakReference<Activity>> f79503a = new ArrayList<>();

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.analytics.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityStackManager.java */
    public class C0665a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0665a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@n0 Activity activity, @p0 Bundle bundle) {
            if (PatchProxy.proxy(new Object[]{activity, bundle}, this, changeQuickRedirect, false, 25617, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f79503a.add(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@n0 Activity activity) {
            if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 25618, new Class[]{Activity.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.e(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@n0 Activity activity, @n0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@n0 Activity activity) {
        }
    }

    private a() {
    }

    public static a c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25614, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f79502b == null) {
            synchronized (a.class) {
                if (f79502b == null) {
                    f79502b = new a();
                }
            }
        }
        return f79502b;
    }

    public ArrayList<WeakReference<Activity>> b() {
        return this.f79503a;
    }

    public void d(Application application) {
        if (PatchProxy.proxy(new Object[]{application}, this, changeQuickRedirect, false, 25615, new Class[]{Application.class}, Void.TYPE).isSupported) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C0665a());
    }

    public void e(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 25616, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<WeakReference<Activity>> it = this.f79503a.iterator();
        while (it.hasNext()) {
            if (activity == it.next().get()) {
                it.remove();
            }
        }
    }
}
