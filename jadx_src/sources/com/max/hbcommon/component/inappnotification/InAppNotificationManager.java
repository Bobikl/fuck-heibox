package com.max.hbcommon.component.inappnotification;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: InAppNotificationManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class InAppNotificationManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static WeakReference<Activity> f67722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private static Notification f67723c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final InAppNotificationManager f67721a = new InAppNotificationManager();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Handler f67724d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Runnable f67725e = new Runnable() { // from class: com.max.hbcommon.component.inappnotification.c
        @Override // java.lang.Runnable
        public final void run() {
            InAppNotificationManager.d();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final kb.b f67726f = new kb.b();

    /* JADX INFO: compiled from: InAppNotificationManager.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67727a;

        static {
            int[] iArr = new int[Direction.valuesCustom().length];
            try {
                iArr[Direction.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Direction.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f67727a = iArr;
        }
    }

    /* JADX INFO: compiled from: InAppNotificationManager.kt */
    public static final class b implements r {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.component.inappnotification.r
        public void a(@dl.d Direction swipeDirection) {
            if (PatchProxy.proxy(new Object[]{swipeDirection}, this, changeQuickRedirect, false, bb.c.e.N, new Class[]{Direction.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(swipeDirection, "swipeDirection");
            InAppNotificationManager.f67721a.k(swipeDirection);
        }
    }

    /* JADX INFO: compiled from: InAppNotificationManager.kt */
    public static final class c implements r {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.component.inappnotification.r
        public void a(@dl.d Direction swipeDirection) {
            if (PatchProxy.proxy(new Object[]{swipeDirection}, this, changeQuickRedirect, false, bb.c.e.T, new Class[]{Direction.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(swipeDirection, "swipeDirection");
            InAppNotificationManager.f67721a.k(swipeDirection);
        }
    }

    private InAppNotificationManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        q info;
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.K, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Notification notification = f67723c;
        Direction directionB = (notification == null || (info = notification.getInfo()) == null) ? null : info.b();
        int i10 = directionB == null ? -1 : a.f67727a[directionB.ordinal()];
        if (i10 == 1) {
            f67721a.n();
            return;
        }
        if (i10 == 2) {
            f67721a.o();
        } else if (i10 != 3) {
            f67721a.q();
        } else {
            f67721a.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.M, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f67721a.m();
    }

    private final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.D, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Notification notification = f67723c;
        if (notification != null) {
            notification.s();
        }
        f67723c = null;
    }

    private final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.B, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Notification notification = f67723c;
        if (notification != null) {
            notification.t();
        }
        f67723c = null;
    }

    private final void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32099y, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Notification notification = f67723c;
        if (notification != null) {
            notification.w();
        }
        f67723c = null;
    }

    private final void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32116z, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Notification notification = f67723c;
        if (notification != null) {
            notification.z();
        }
        f67723c = null;
    }

    private final void q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.A, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Notification notification = f67723c;
        if (notification != null) {
            notification.C();
        }
        f67723c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(com.max.hbcommon.component.inappnotification.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.e.L, new Class[]{com.max.hbcommon.component.inappnotification.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f67721a.u(aVar);
    }

    private final void u(com.max.hbcommon.component.inappnotification.a aVar) {
        View viewG;
        WeakReference<Activity> weakReference;
        Activity activity;
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.e.C, new Class[]{com.max.hbcommon.component.inappnotification.a.class}, Void.TYPE).isSupported || (viewG = aVar.g()) == null || (weakReference = f67722b) == null || (activity = weakReference.get()) == null || activity.isFinishing()) {
            return;
        }
        h();
        m();
        Notification notificationC = new Notification.a(activity).p(aVar.h()).q(aVar.i()).d(aVar.e()).b(aVar.b()).n(aVar.j()).a(aVar.a()).g(viewG).k(300L).l(160L).o(new c()).c();
        f67723c = notificationC;
        if (notificationC != null) {
            notificationC.I();
        }
        if (aVar.c()) {
            f67724d.postDelayed(f67725e, aVar.d());
        }
    }

    @dl.e
    public final Notification g(@dl.d com.max.hbcommon.component.inappnotification.a info) {
        WeakReference<Activity> weakReference;
        Activity activity;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{info}, this, changeQuickRedirect, false, bb.c.e.F, new Class[]{com.max.hbcommon.component.inappnotification.a.class}, Notification.class);
        if (patchProxyResultProxy.isSupported) {
            return (Notification) patchProxyResultProxy.result;
        }
        f0.p(info, "info");
        View viewG = info.g();
        if (viewG == null || (weakReference = f67722b) == null || (activity = weakReference.get()) == null || activity.isFinishing()) {
            return null;
        }
        return new Notification.a(activity).p(info.h()).q(info.i()).d(info.e()).b(info.b()).n(info.j()).a(info.a()).g(viewG).k(300L).l(160L).o(new b()).c();
    }

    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.J, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f67724d.removeCallbacks(f67725e);
    }

    @dl.e
    public final Notification i() {
        return f67723c;
    }

    public final void j() {
        Handler handler;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.H, new Class[0], Void.TYPE).isSupported || (handler = f67724d) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.d
            @Override // java.lang.Runnable
            public final void run() {
                InAppNotificationManager.l();
            }
        });
    }

    public final void k(@dl.d Direction direction) {
        if (PatchProxy.proxy(new Object[]{direction}, this, changeQuickRedirect, false, bb.c.e.I, new Class[]{Direction.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(direction, "direction");
        int i10 = a.f67727a[direction.ordinal()];
        if (i10 == 2) {
            o();
        } else if (i10 == 3) {
            p();
        } else {
            if (i10 != 4) {
                return;
            }
            q();
        }
    }

    public final void r(@dl.d final Application application) {
        if (PatchProxy.proxy(new Object[]{application}, this, changeQuickRedirect, false, bb.c.e.E, new Class[]{Application.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(application, "application");
        f67726f.a(new yh.a<b2>() { // from class: com.max.hbcommon.component.inappnotification.InAppNotificationManager$init$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: InAppNotificationManager.kt */
            public static final class a extends kb.a {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // kb.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(@dl.d Activity activity) {
                    if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.S, new Class[]{Activity.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(activity, "activity");
                    super.onActivityDestroyed(activity);
                    if (InAppNotificationManager.f67723c != null) {
                        InAppNotificationManager.f67721a.j();
                        InAppNotificationManager.f67722b = null;
                    }
                }

                @Override // kb.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(@dl.d Activity activity) {
                    q info;
                    if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.R, new Class[]{Activity.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(activity, "activity");
                    Notification notification = InAppNotificationManager.f67723c;
                    if (((notification == null || (info = notification.getInfo()) == null || !info.a()) ? false : true) || InAppNotificationManager.f67723c == null) {
                        return;
                    }
                    InAppNotificationManager.f67721a.j();
                    InAppNotificationManager.f67722b = null;
                }

                @Override // kb.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(@dl.d Activity activity) {
                    if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.e.Q, new Class[]{Activity.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(activity, "activity");
                    InAppNotificationManager inAppNotificationManager = InAppNotificationManager.f67721a;
                    InAppNotificationManager.f67722b = new WeakReference(activity);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.P, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.O, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                application.registerActivityLifecycleCallbacks(new a());
            }
        });
    }

    public final void s(@dl.e final com.max.hbcommon.component.inappnotification.a aVar, long j10) {
        if (PatchProxy.proxy(new Object[]{aVar, new Long(j10)}, this, changeQuickRedirect, false, bb.c.e.G, new Class[]{com.max.hbcommon.component.inappnotification.a.class, Long.TYPE}, Void.TYPE).isSupported || aVar == null || aVar.g() == null) {
            return;
        }
        f67724d.postDelayed(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.b
            @Override // java.lang.Runnable
            public final void run() {
                InAppNotificationManager.t(aVar);
            }
        }, j10);
    }
}
