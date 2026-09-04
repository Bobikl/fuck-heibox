package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.n0;
import androidx.core.view.j1;

/* JADX INFO: compiled from: AutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int A = 1;
    private static final int B = 315;
    private static final int C = 1575;
    private static final float D = Float.MAX_VALUE;
    private static final float E = 0.2f;
    private static final float F = 1.0f;
    private static final int G = ViewConfiguration.getTapTimeout();
    private static final int H = 500;
    private static final int I = 500;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f21883s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f21884t = Float.MAX_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f21885u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f21886v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f21887w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f21888x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f21889y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f21890z = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f21893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f21894e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21898i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f21903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f21904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f21905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21907r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C0151a f21891b = new C0151a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Interpolator f21892c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f21895f = {0.0f, 0.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f21896g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f21899j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f21900k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f21901l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoScrollHelper.java */
    public static class C0151a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f21910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f21911d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f21917j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f21918k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f21912e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f21916i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f21913f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21914g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f21915h = 0;

        C0151a() {
        }

        private float e(long j10) {
            long j11 = this.f21912e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f21916i;
            if (j12 < 0 || j10 < j12) {
                return a.e((j10 - j11) / this.f21908a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f21917j;
            return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f21918k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f21913f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f21913f;
            this.f21913f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f21914g = (int) (this.f21910c * f10);
            this.f21915h = (int) (f10 * this.f21911d);
        }

        public int b() {
            return this.f21914g;
        }

        public int c() {
            return this.f21915h;
        }

        public int d() {
            float f10 = this.f21910c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f21911d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f21916i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f21916i + ((long) this.f21918k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f21918k = a.f((int) (jCurrentAnimationTimeMillis - this.f21912e), 0, this.f21909b);
            this.f21917j = e(jCurrentAnimationTimeMillis);
            this.f21916i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f21909b = i10;
        }

        public void k(int i10) {
            this.f21908a = i10;
        }

        public void l(float f10, float f11) {
            this.f21910c = f10;
            this.f21911d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f21912e = jCurrentAnimationTimeMillis;
            this.f21916i = -1L;
            this.f21913f = jCurrentAnimationTimeMillis;
            this.f21917j = 0.5f;
            this.f21914g = 0;
            this.f21915h = 0;
        }
    }

    /* JADX INFO: compiled from: AutoScrollHelper.java */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f21905p) {
                if (aVar.f21903n) {
                    aVar.f21903n = false;
                    aVar.f21891b.m();
                }
                C0151a c0151a = a.this.f21891b;
                if (c0151a.h() || !a.this.x()) {
                    a.this.f21905p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f21904o) {
                    aVar2.f21904o = false;
                    aVar2.c();
                }
                c0151a.a();
                a.this.l(c0151a.b(), c0151a.c());
                j1.p1(a.this.f21893d, this);
            }
        }
    }

    public a(@n0 View view) {
        this.f21893d = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        r(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        s(f12, f12);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(G);
        u(500);
        t(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f21895f[i10], f11, this.f21896g[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f21899j[i10];
        float f14 = this.f21900k[i10];
        float f15 = this.f21901l[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f21897h;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f21905p && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f21892c.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f21892c.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void k() {
        if (this.f21903n) {
            this.f21905p = false;
        } else {
            this.f21891b.i();
        }
    }

    private void y() {
        int i10;
        if (this.f21894e == null) {
            this.f21894e = new b();
        }
        this.f21905p = true;
        this.f21903n = true;
        if (this.f21902m || (i10 = this.f21898i) <= 0) {
            this.f21894e.run();
        } else {
            j1.q1(this.f21893d, this.f21894e, i10);
        }
        this.f21902m = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f21893d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public boolean i() {
        return this.f21906q;
    }

    public boolean j() {
        return this.f21907r;
    }

    public abstract void l(int i10, int i11);

    @n0
    public a m(int i10) {
        this.f21898i = i10;
        return this;
    }

    @n0
    public a n(int i10) {
        this.f21897h = i10;
        return this;
    }

    public a o(boolean z10) {
        if (this.f21906q && !z10) {
            k();
        }
        this.f21906q = z10;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f21906q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                k();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    k();
                }
            }
            return this.f21907r && this.f21905p;
        }
        this.f21904o = true;
        this.f21902m = false;
        this.f21891b.l(d(0, motionEvent.getX(), view.getWidth(), this.f21893d.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f21893d.getHeight()));
        if (!this.f21905p && x()) {
            y();
        }
        if (this.f21907r) {
            return false;
        }
    }

    public a p(boolean z10) {
        this.f21907r = z10;
        return this;
    }

    @n0
    public a q(float f10, float f11) {
        float[] fArr = this.f21896g;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @n0
    public a r(float f10, float f11) {
        float[] fArr = this.f21901l;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @n0
    public a s(float f10, float f11) {
        float[] fArr = this.f21900k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @n0
    public a t(int i10) {
        this.f21891b.j(i10);
        return this;
    }

    @n0
    public a u(int i10) {
        this.f21891b.k(i10);
        return this;
    }

    @n0
    public a v(float f10, float f11) {
        float[] fArr = this.f21895f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @n0
    public a w(float f10, float f11) {
        float[] fArr = this.f21899j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean x() {
        C0151a c0151a = this.f21891b;
        int iF = c0151a.f();
        int iD = c0151a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
