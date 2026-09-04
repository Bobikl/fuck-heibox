package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f51791r = "VideoFrameReleaseHelper";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f51792s = 5000000000L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f51793t = 0.02f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f51794u = 1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f51795v = 30;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f51796w = 500;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f51797x = 20000000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f51798y = 80;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f51799a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final b f51800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final e f51801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Surface f51803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f51804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f51805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f51806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f51807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f51809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f51810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f51811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f51812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f51813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f51814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f51815q;

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    @w0(30)
    public static final class a {
        private a() {
        }

        @androidx.annotation.u
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                com.google.android.exoplayer2.util.u.e(m.f51791r, "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public interface b {

        /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
        public interface a {
            void a(@p0 Display display);
        }

        void a(a aVar);

        void unregister();
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowManager f51816a;

        private c(WindowManager windowManager) {
            this.f51816a = windowManager;
        }

        @p0
        public static b b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.video.m.b
        public void a(b.a aVar) {
            aVar.a(this.f51816a.getDefaultDisplay());
        }

        @Override // com.google.android.exoplayer2.video.m.b
        public void unregister() {
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    @w0(17)
    public static final class d implements b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f51817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private b.a f51818b;

        private d(DisplayManager displayManager) {
            this.f51817a = displayManager;
        }

        private Display b() {
            return this.f51817a.getDisplay(0);
        }

        @p0
        public static b c(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.video.m.b
        public void a(b.a aVar) {
            this.f51818b = aVar;
            this.f51817a.registerDisplayListener(this, u0.y());
            aVar.a(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f51818b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }

        @Override // com.google.android.exoplayer2.video.m.b
        public void unregister() {
            this.f51817a.unregisterDisplayListener(this);
            this.f51818b = null;
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f51819g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f51820h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f51821i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final e f51822j = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f51823b = com.google.android.exoplayer2.j.f46377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f51824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HandlerThread f51825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Choreographer f51826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f51827f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f51825d = handlerThread;
            handlerThread.start();
            Handler handlerX = u0.x(handlerThread.getLooper(), this);
            this.f51824c = handlerX;
            handlerX.sendEmptyMessage(0);
        }

        private void b() {
            int i10 = this.f51827f + 1;
            this.f51827f = i10;
            if (i10 == 1) {
                ((Choreographer) com.google.android.exoplayer2.util.a.g(this.f51826e)).postFrameCallback(this);
            }
        }

        private void c() {
            this.f51826e = Choreographer.getInstance();
        }

        public static e d() {
            return f51822j;
        }

        private void f() {
            int i10 = this.f51827f - 1;
            this.f51827f = i10;
            if (i10 == 0) {
                ((Choreographer) com.google.android.exoplayer2.util.a.g(this.f51826e)).removeFrameCallback(this);
                this.f51823b = com.google.android.exoplayer2.j.f46377b;
            }
        }

        public void a() {
            this.f51824c.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f51823b = j10;
            ((Choreographer) com.google.android.exoplayer2.util.a.g(this.f51826e)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f51824c.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            }
            if (i10 == 1) {
                b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public m(@p0 Context context) {
        b bVarF = f(context);
        this.f51800b = bVarF;
        this.f51801c = bVarF != null ? e.d() : null;
        this.f51809k = com.google.android.exoplayer2.j.f46377b;
        this.f51810l = com.google.android.exoplayer2.j.f46377b;
        this.f51804f = -1.0f;
        this.f51807i = 1.0f;
        this.f51808j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= f51797x;
    }

    private void d() {
        Surface surface;
        if (u0.f51536a < 30 || (surface = this.f51803e) == null || this.f51808j == Integer.MIN_VALUE || this.f51806h == 0.0f) {
            return;
        }
        this.f51806h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    @p0
    private static b f(@p0 Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b bVarC = u0.f51536a >= 17 ? d.c(applicationContext) : null;
        return bVarC == null ? c.b(applicationContext) : bVarC;
    }

    private void p() {
        this.f51811m = 0L;
        this.f51814p = -1L;
        this.f51812n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(@p0 Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f51809k = refreshRate;
            this.f51810l = (refreshRate * f51798y) / 100;
        } else {
            com.google.android.exoplayer2.util.u.m(f51791r, "Unable to query display refresh rate");
            this.f51809k = com.google.android.exoplayer2.j.f46377b;
            this.f51810l = com.google.android.exoplayer2.j.f46377b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    private void s() {
        if (u0.f51536a < 30 || this.f51803e == null) {
            return;
        }
        float fB = this.f51799a.e() ? this.f51799a.b() : this.f51804f;
        float f10 = this.f51805g;
        if (fB == f10) {
            return;
        }
        boolean z10 = true;
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f51805g) < (this.f51799a.e() && (this.f51799a.d() > f51792s ? 1 : (this.f51799a.d() == f51792s ? 0 : -1)) >= 0 ? f51793t : 1.0f)) {
                z10 = false;
            }
        } else if (fB == -1.0f && this.f51799a.c() < 30) {
            z10 = false;
        }
        if (z10) {
            this.f51805g = fB;
            t(false);
        }
    }

    private void t(boolean z10) {
        Surface surface;
        if (u0.f51536a < 30 || (surface = this.f51803e) == null || this.f51808j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f51802d) {
            float f11 = this.f51805g;
            if (f11 != -1.0f) {
                f10 = this.f51807i * f11;
            }
        }
        if (z10 || this.f51806h != f10) {
            this.f51806h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        if (this.f51814p == -1 || !this.f51799a.e()) {
            j11 = j10;
        } else {
            long jA = this.f51815q + ((long) ((this.f51799a.a() * (this.f51811m - this.f51814p)) / this.f51807i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                p();
                j11 = j10;
            }
        }
        this.f51812n = this.f51811m;
        this.f51813o = j11;
        e eVar = this.f51801c;
        if (eVar == null || this.f51809k == com.google.android.exoplayer2.j.f46377b) {
            return j11;
        }
        long j12 = eVar.f51823b;
        return j12 == com.google.android.exoplayer2.j.f46377b ? j11 : e(j11, j12, this.f51809k) - this.f51810l;
    }

    public void g() {
        b bVar = this.f51800b;
        if (bVar != null) {
            bVar.unregister();
            ((e) com.google.android.exoplayer2.util.a.g(this.f51801c)).e();
        }
    }

    public void h() {
        if (this.f51800b != null) {
            ((e) com.google.android.exoplayer2.util.a.g(this.f51801c)).a();
            this.f51800b.a(new b.a() { // from class: com.google.android.exoplayer2.video.k
                @Override // com.google.android.exoplayer2.video.m.b.a
                public final void a(Display display) {
                    this.f51790a.r(display);
                }
            });
        }
    }

    public void i(float f10) {
        this.f51804f = f10;
        this.f51799a.g();
        s();
    }

    public void j(long j10) {
        long j11 = this.f51812n;
        if (j11 != -1) {
            this.f51814p = j11;
            this.f51815q = this.f51813o;
        }
        this.f51811m++;
        this.f51799a.f(j10 * 1000);
        s();
    }

    public void k(float f10) {
        this.f51807i = f10;
        p();
        t(false);
    }

    public void l() {
        p();
    }

    public void m() {
        this.f51802d = true;
        p();
        t(false);
    }

    public void n() {
        this.f51802d = false;
        d();
    }

    public void o(@p0 Surface surface) {
        if (surface instanceof DummySurface) {
            surface = null;
        }
        if (this.f51803e == surface) {
            return;
        }
        d();
        this.f51803e = surface;
        t(true);
    }

    public void q(int i10) {
        if (this.f51808j == i10) {
            return;
        }
        this.f51808j = i10;
        t(true);
    }
}
