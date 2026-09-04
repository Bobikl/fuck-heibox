package com.uc.crashsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f104247a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f104248b = false;

    c() {
    }

    private void a(int i10) {
        if (e.u()) {
            com.uc.crashsdk.a.a.a("crashsdk", "[LifeCycle] ignore state change while crashing");
            return;
        }
        boolean z10 = true;
        boolean z11 = 1 == i10;
        if (!z11) {
            Iterator it = b.f104212ab.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = z11;
                    break;
                }
                Object value = ((Map.Entry) it.next()).getValue();
                if (value != null && ((Integer) value).intValue() == 1) {
                    break;
                }
            }
        } else {
            z10 = z11;
            break;
        }
        if (this.f104247a != z10) {
            b.b(z10);
            this.f104247a = z10;
        }
        boolean zIsEmpty = b.f104212ab.isEmpty();
        if (this.f104248b != zIsEmpty) {
            if (zIsEmpty) {
                b.w();
            }
            this.f104248b = zIsEmpty;
        }
    }

    private void a(Activity activity, int i10) {
        if (1 == i10) {
            String unused = b.f104214ad = activity.getComponentName().flattenToShortString();
        } else {
            String unused2 = b.f104214ad = "";
        }
        b.D();
        if (g.L()) {
            b.O();
            synchronized (b.f104212ab) {
                b.f104212ab.put(activity, Integer.valueOf(i10));
                a(i10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (g.L()) {
            b.O();
            synchronized (b.f104212ab) {
                b.f104212ab.remove(activity);
                a(2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity, 2);
    }
}
