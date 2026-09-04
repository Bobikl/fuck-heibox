package com.max.hbcustomview.swipebacklayout;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Stack;

/* JADX INFO: compiled from: SlideFinishManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f69586c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Stack<Activity> f69587b = new Stack<>();

    private c() {
    }

    public static c a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.Os, new Class[0], c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        if (f69586c == null) {
            synchronized (c.class) {
                if (f69586c == null) {
                    f69586c = new c();
                }
            }
        }
        return f69586c;
    }

    public Activity b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ss, new Class[0], Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        if (this.f69587b.size() < 2) {
            return null;
        }
        Stack<Activity> stack = this.f69587b;
        return stack.get(stack.size() - 2);
    }

    @p0
    public Activity c(Activity activity) {
        Activity activityLastElement;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.f.Ts, new Class[]{Activity.class}, Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        try {
            if (this.f69587b.size() <= 1) {
                return null;
            }
            Stack<Activity> stack = this.f69587b;
            Activity activity2 = stack.get(stack.size() - 2);
            try {
                if (activity.equals(activity2)) {
                    int iIndexOf = this.f69587b.indexOf(activity);
                    if (iIndexOf > 0) {
                        activityLastElement = this.f69587b.get(iIndexOf - 1);
                    } else if (this.f69587b.size() == 2) {
                        activityLastElement = this.f69587b.lastElement();
                    }
                    return activityLastElement;
                }
            } catch (Exception unused) {
            }
            return activity2;
        } catch (Exception unused2) {
            return null;
        }
    }

    public void d(Application application) {
        if (PatchProxy.proxy(new Object[]{application}, this, changeQuickRedirect, false, bb.c.f.Ps, new Class[]{Application.class}, Void.TYPE).isSupported) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{activity, bundle}, this, changeQuickRedirect, false, bb.c.f.Qs, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69587b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.f.Rs, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69587b.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
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
