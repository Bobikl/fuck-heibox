package kb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActivityLifecycleCallbacksAdapter.kt */
/* JADX INFO: loaded from: classes9.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@d Activity activity, @e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{activity, bundle}, this, changeQuickRedirect, false, bb.c.e.Q0, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.W0, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.T0, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.S0, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@d Activity activity, @d Bundle outState) {
        if (PatchProxy.proxy(new Object[]{activity, outState}, this, changeQuickRedirect, false, bb.c.e.V0, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.R0, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.U0, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }
}
