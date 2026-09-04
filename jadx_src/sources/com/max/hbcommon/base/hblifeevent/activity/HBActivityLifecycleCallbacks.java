package com.max.hbcommon.base.hblifeevent.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import bb.c;
import com.max.hbcommon.base.hblifeevent.fragment.HBFragmentLifecycleCallbacks;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: HBActivityLifecycleCallbacks.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HBActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@d final Activity activity, @e final Bundle bundle) {
        FragmentManager supportFragmentManager;
        if (PatchProxy.proxy(new Object[]{activity, bundle}, this, changeQuickRedirect, false, c.d.R1, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        a.b(activity, new l<Application.ActivityLifecycleCallbacks, b2>() { // from class: com.max.hbcommon.base.hblifeevent.activity.HBActivityLifecycleCallbacks.onActivityCreated.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                if (PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.Y1, new Class[]{Application.ActivityLifecycleCallbacks.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(activityLifecycleCallbacks, "activityLifecycleCallbacks");
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.Z1, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(activityLifecycleCallbacks);
                return b2.f124493a;
            }
        });
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.C1(new HBFragmentLifecycleCallbacks(), true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@d final Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.d.X1, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        a.b(activity, new l<Application.ActivityLifecycleCallbacks, b2>() { // from class: com.max.hbcommon.base.hblifeevent.activity.HBActivityLifecycleCallbacks.onActivityDestroyed.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                if (PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31106a2, new Class[]{Application.ActivityLifecycleCallbacks.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(activityLifecycleCallbacks, "activityLifecycleCallbacks");
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31129b2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(activityLifecycleCallbacks);
                return b2.f124493a;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@d final Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.d.U1, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        a.b(activity, new l<Application.ActivityLifecycleCallbacks, b2>() { // from class: com.max.hbcommon.base.hblifeevent.activity.HBActivityLifecycleCallbacks.onActivityPaused.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                if (PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31152c2, new Class[]{Application.ActivityLifecycleCallbacks.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(activityLifecycleCallbacks, "activityLifecycleCallbacks");
                activityLifecycleCallbacks.onActivityPaused(activity);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31176d2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(activityLifecycleCallbacks);
                return b2.f124493a;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@d final Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.d.T1, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        a.b(activity, new l<Application.ActivityLifecycleCallbacks, b2>() { // from class: com.max.hbcommon.base.hblifeevent.activity.HBActivityLifecycleCallbacks.onActivityResumed.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                if (PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31199e2, new Class[]{Application.ActivityLifecycleCallbacks.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(activityLifecycleCallbacks, "activityLifecycleCallbacks");
                activityLifecycleCallbacks.onActivityResumed(activity);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31222f2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(activityLifecycleCallbacks);
                return b2.f124493a;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@d final Activity activity, @d final Bundle outState) {
        if (PatchProxy.proxy(new Object[]{activity, outState}, this, changeQuickRedirect, false, c.d.W1, new Class[]{Activity.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        f0.p(outState, "outState");
        a.b(activity, new l<Application.ActivityLifecycleCallbacks, b2>() { // from class: com.max.hbcommon.base.hblifeevent.activity.HBActivityLifecycleCallbacks.onActivitySaveInstanceState.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                if (PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31245g2, new Class[]{Application.ActivityLifecycleCallbacks.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(activityLifecycleCallbacks, "activityLifecycleCallbacks");
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, outState);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31268h2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(activityLifecycleCallbacks);
                return b2.f124493a;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@d final Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.d.S1, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        a.b(activity, new l<Application.ActivityLifecycleCallbacks, b2>() { // from class: com.max.hbcommon.base.hblifeevent.activity.HBActivityLifecycleCallbacks.onActivityStarted.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                if (PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31291i2, new Class[]{Application.ActivityLifecycleCallbacks.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(activityLifecycleCallbacks, "activityLifecycleCallbacks");
                activityLifecycleCallbacks.onActivityStarted(activity);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31314j2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(activityLifecycleCallbacks);
                return b2.f124493a;
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@d final Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.d.V1, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        a.b(activity, new l<Application.ActivityLifecycleCallbacks, b2>() { // from class: com.max.hbcommon.base.hblifeevent.activity.HBActivityLifecycleCallbacks.onActivityStopped.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                if (PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31337k2, new Class[]{Application.ActivityLifecycleCallbacks.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(activityLifecycleCallbacks, "activityLifecycleCallbacks");
                activityLifecycleCallbacks.onActivityStopped(activity);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityLifecycleCallbacks}, this, changeQuickRedirect, false, c.d.f31360l2, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(activityLifecycleCallbacks);
                return b2.f124493a;
            }
        });
    }
}
