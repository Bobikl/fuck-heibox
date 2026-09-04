package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.j1;
import androidx.annotation.k0;
import androidx.annotation.p0;
import androidx.annotation.x;

/* JADX INFO: compiled from: LottieValueAnimator.java */
/* JADX INFO: loaded from: classes6.dex */
public class g extends c implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.g f37835k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f37828d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37829e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37830f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f37831g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37832h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f37833i = -2.14748365E9f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f37834j = 2.14748365E9f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @j1
    protected boolean f37836l = false;

    private void C() {
        if (this.f37835k == null) {
            return;
        }
        float f10 = this.f37831g;
        if (f10 < this.f37833i || f10 > this.f37834j) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f37833i), Float.valueOf(this.f37834j), Float.valueOf(this.f37831g)));
        }
    }

    private float j() {
        com.airbnb.lottie.g gVar = this.f37835k;
        if (gVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / gVar.i()) / Math.abs(this.f37828d);
    }

    private boolean n() {
        return m() < 0.0f;
    }

    public void B(float f10) {
        this.f37828d = f10;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @k0
    public void cancel() {
        a();
        r();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        q();
        if (this.f37835k == null || !isRunning()) {
            return;
        }
        com.airbnb.lottie.e.a("LottieValueAnimator#doFrame");
        long j11 = this.f37830f;
        float fJ = (j11 != 0 ? j10 - j11 : 0L) / j();
        float f10 = this.f37831g;
        if (n()) {
            fJ = -fJ;
        }
        float f11 = f10 + fJ;
        this.f37831g = f11;
        boolean z10 = !i.e(f11, l(), k());
        this.f37831g = i.c(this.f37831g, l(), k());
        this.f37830f = j10;
        e();
        if (z10) {
            if (getRepeatCount() == -1 || this.f37832h < getRepeatCount()) {
                c();
                this.f37832h++;
                if (getRepeatMode() == 2) {
                    this.f37829e = !this.f37829e;
                    u();
                } else {
                    this.f37831g = n() ? k() : l();
                }
                this.f37830f = j10;
            } else {
                this.f37831g = this.f37828d < 0.0f ? l() : k();
                r();
                b(n());
            }
        }
        C();
        com.airbnb.lottie.e.b("LottieValueAnimator#doFrame");
    }

    public void f() {
        this.f37835k = null;
        this.f37833i = -2.14748365E9f;
        this.f37834j = 2.14748365E9f;
    }

    @k0
    public void g() {
        r();
        b(n());
    }

    @Override // android.animation.ValueAnimator
    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float getAnimatedFraction() {
        float fL;
        float fK;
        float fL2;
        if (this.f37835k == null) {
            return 0.0f;
        }
        if (n()) {
            fL = k() - this.f37831g;
            fK = k();
            fL2 = l();
        } else {
            fL = this.f37831g - l();
            fK = k();
            fL2 = l();
        }
        return fL / (fK - fL2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.g gVar = this.f37835k;
        if (gVar == null) {
            return 0L;
        }
        return (long) gVar.d();
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float h() {
        com.airbnb.lottie.g gVar = this.f37835k;
        if (gVar == null) {
            return 0.0f;
        }
        return (this.f37831g - gVar.r()) / (this.f37835k.f() - this.f37835k.r());
    }

    public float i() {
        return this.f37831g;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f37836l;
    }

    public float k() {
        com.airbnb.lottie.g gVar = this.f37835k;
        if (gVar == null) {
            return 0.0f;
        }
        float f10 = this.f37834j;
        return f10 == 2.14748365E9f ? gVar.f() : f10;
    }

    public float l() {
        com.airbnb.lottie.g gVar = this.f37835k;
        if (gVar == null) {
            return 0.0f;
        }
        float f10 = this.f37833i;
        return f10 == -2.14748365E9f ? gVar.r() : f10;
    }

    public float m() {
        return this.f37828d;
    }

    @k0
    public void o() {
        r();
    }

    @k0
    public void p() {
        this.f37836l = true;
        d(n());
        w((int) (n() ? k() : l()));
        this.f37830f = 0L;
        this.f37832h = 0;
        q();
    }

    protected void q() {
        if (isRunning()) {
            s(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @k0
    protected void r() {
        s(true);
    }

    @k0
    protected void s(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f37836l = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f37829e) {
            return;
        }
        this.f37829e = false;
        u();
    }

    @k0
    public void t() {
        this.f37836l = true;
        q();
        this.f37830f = 0L;
        if (n() && i() == l()) {
            this.f37831g = k();
        } else {
            if (n() || i() != k()) {
                return;
            }
            this.f37831g = l();
        }
    }

    public void u() {
        B(-m());
    }

    public void v(com.airbnb.lottie.g gVar) {
        boolean z10 = this.f37835k == null;
        this.f37835k = gVar;
        if (z10) {
            y((int) Math.max(this.f37833i, gVar.r()), (int) Math.min(this.f37834j, gVar.f()));
        } else {
            y((int) gVar.r(), (int) gVar.f());
        }
        float f10 = this.f37831g;
        this.f37831g = 0.0f;
        w((int) f10);
        e();
    }

    public void w(float f10) {
        if (this.f37831g == f10) {
            return;
        }
        this.f37831g = i.c(f10, l(), k());
        this.f37830f = 0L;
        e();
    }

    public void x(float f10) {
        y(this.f37833i, f10);
    }

    public void y(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        com.airbnb.lottie.g gVar = this.f37835k;
        float fR = gVar == null ? -3.4028235E38f : gVar.r();
        com.airbnb.lottie.g gVar2 = this.f37835k;
        float f12 = gVar2 == null ? Float.MAX_VALUE : gVar2.f();
        float fC = i.c(f10, fR, f12);
        float fC2 = i.c(f11, fR, f12);
        if (fC == this.f37833i && fC2 == this.f37834j) {
            return;
        }
        this.f37833i = fC;
        this.f37834j = fC2;
        w((int) i.c(this.f37831g, fC, fC2));
    }

    public void z(int i10) {
        y(i10, (int) this.f37834j);
    }
}
