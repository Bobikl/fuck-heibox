package com.max.xiaoheihe.module.proxy;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ProxyActivityLifecycleCallbacks.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final C0852a f91561b = new C0852a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91562c = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f91563d = "proxy_manager_id";

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.proxy.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProxyActivityLifecycleCallbacks.kt */
    public static final class C0852a {
        private C0852a() {
        }

        public /* synthetic */ C0852a(u uVar) {
            this();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@d Activity activity, @e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{activity, bundle}, this, changeQuickRedirect, false, 42833, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@d Activity activity) {
        String stringExtra;
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 42839, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(f91563d)) == null) {
            return;
        }
        ProxyManager.f91541g.c(stringExtra, com.max.hbcommon.base.hblifeevent.activity.a.c(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 42836, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 42835, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@d Activity activity, @d Bundle outState) {
        if (PatchProxy.proxy(new Object[]{activity, outState}, this, changeQuickRedirect, false, 42838, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 42834, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 42837, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }
}
