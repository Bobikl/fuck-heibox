package com.max.video.device;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OrientationEventManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f75917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f75918b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f75920d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f75922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private a f75923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private OrientationEventListener f75924h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f75919c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f75921e = 1;

    /* JADX INFO: compiled from: OrientationEventManager.kt */
    public interface a {

        /* JADX INFO: renamed from: com.max.video.device.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OrientationEventManager.kt */
        public static final class C0617a {
            public static ChangeQuickRedirect changeQuickRedirect;

            public static int a(@d a aVar, int i10) {
                return i10;
            }

            public static int b(@d a aVar, int i10) {
                return i10;
            }

            public static int c(@d a aVar, int i10) {
                return i10;
            }

            public static int d(@d a aVar, int i10) {
                return i10;
            }
        }

        int a(int i10);

        int b(int i10);

        int c(int i10);

        int d(int i10);
    }

    /* JADX INFO: compiled from: OrientationEventManager.kt */
    public static final class b extends OrientationEventListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f75925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f75926b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, c cVar) {
            super(context, 5);
            this.f75925a = context;
            this.f75926b = cVar;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Ik, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f75926b.i() || !this.f75926b.h()) {
                try {
                    this.f75926b.w(Settings.System.getInt(this.f75925a.getContentResolver(), "accelerometer_rotation") == 0);
                } catch (Settings.SettingNotFoundException e10) {
                    e10.printStackTrace();
                }
                boolean z10 = System.currentTimeMillis() - this.f75926b.f75922f > 500;
                if ((260 <= i10 && i10 < 281) && z10) {
                    c.b(this.f75926b);
                    this.f75926b.f75922f = System.currentTimeMillis();
                } else {
                    if ((70 <= i10 && i10 < 91) && z10) {
                        c.d(this.f75926b);
                        this.f75926b.f75922f = System.currentTimeMillis();
                    } else if ((i10 >= 300 || i10 <= 30) && z10) {
                        c.c(this.f75926b);
                        this.f75926b.f75922f = System.currentTimeMillis();
                    } else {
                        if ((160 <= i10 && i10 < 201) && z10) {
                            c.e(this.f75926b);
                            this.f75926b.f75922f = System.currentTimeMillis();
                        }
                    }
                }
                if (this.f75926b.k()) {
                    this.f75926b.f75921e = ye.a.f141789a.d(this.f75925a);
                }
            }
        }
    }

    public static final /* synthetic */ void b(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.m.Ek, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.l();
    }

    public static final /* synthetic */ void c(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.m.Gk, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.m();
    }

    public static final /* synthetic */ void d(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.m.Fk, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.n();
    }

    public static final /* synthetic */ void e(c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.m.Hk, new Class[]{c.class}, Void.TYPE).isSupported) {
            return;
        }
        cVar.o();
    }

    private final void l() {
        int i10;
        a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Ak, new Class[0], Void.TYPE).isSupported || (i10 = this.f75921e) == 6 || i10 == 0) {
            return;
        }
        if ((this.f75920d && i10 != 8) || this.f75917a || (aVar = this.f75923g) == null) {
            return;
        }
        this.f75921e = aVar.d(i10);
    }

    private final void m() {
        int i10;
        a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Ck, new Class[0], Void.TYPE).isSupported || (i10 = this.f75921e) == 7 || i10 == 1) {
            return;
        }
        if ((this.f75920d && i10 != 9) || this.f75917a || (aVar = this.f75923g) == null) {
            return;
        }
        this.f75921e = aVar.b(i10);
    }

    private final void n() {
        int i10;
        a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Bk, new Class[0], Void.TYPE).isSupported || (i10 = this.f75921e) == 6 || i10 == 8) {
            return;
        }
        if ((this.f75920d && i10 != 0) || this.f75917a || (aVar = this.f75923g) == null) {
            return;
        }
        this.f75921e = aVar.a(i10);
    }

    private final void o() {
        int i10;
        a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Dk, new Class[0], Void.TYPE).isSupported || (i10 = this.f75921e) == 7 || i10 == 9) {
            return;
        }
        if ((this.f75920d && i10 != 1) || this.f75917a || (aVar = this.f75923g) == null) {
            return;
        }
        this.f75921e = aVar.c(i10);
    }

    public final boolean h() {
        return this.f75919c;
    }

    public final boolean i() {
        return this.f75918b;
    }

    public final boolean j() {
        return this.f75917a;
    }

    public final boolean k() {
        return this.f75920d;
    }

    public final void p() {
        OrientationEventListener orientationEventListener;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35140xk, new Class[0], Void.TYPE).isSupported || (orientationEventListener = this.f75924h) == null) {
            return;
        }
        orientationEventListener.disable();
    }

    public final void q() {
        OrientationEventListener orientationEventListener;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35162yk, new Class[0], Void.TYPE).isSupported || (orientationEventListener = this.f75924h) == null) {
            return;
        }
        orientationEventListener.enable();
    }

    public final void r(@d Context context, @e a aVar) {
        if (PatchProxy.proxy(new Object[]{context, aVar}, this, changeQuickRedirect, false, bb.c.m.f35184zk, new Class[]{Context.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        this.f75923g = aVar;
        this.f75924h = new b(context, this);
        this.f75921e = ye.a.f141789a.d(context);
        OrientationEventListener orientationEventListener = this.f75924h;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
    }

    public final void s(boolean z10) {
        this.f75918b = z10;
    }

    public final void t(boolean z10) {
        this.f75917a = z10;
    }

    public final void u(@e a aVar) {
        this.f75923g = aVar;
    }

    public final void v(boolean z10) {
        this.f75919c = z10;
    }

    public final void w(boolean z10) {
        this.f75920d = z10;
    }
}
