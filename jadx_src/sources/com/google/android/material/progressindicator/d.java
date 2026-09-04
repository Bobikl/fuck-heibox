package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.j1;
import androidx.annotation.n0;
import com.google.android.material.color.m;

/* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends h<ObjectAnimator> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54750l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f54751m = 5400;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f54752n = 667;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f54753o = 667;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f54754p = 333;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f54755q = 333;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54759u = -20;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f54760v = 250;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f54761w = 1520;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f54764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ObjectAnimator f54765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.interpolator.view.animation.b f54766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f54767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f54770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b.a f54771k;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f54756r = {0, bb.c.b.Ym, bb.c.d.Vb, bb.c.e.f31838i9};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f54757s = {bb.c.b.R9, 2017, bb.c.d.Mo, bb.c.f.f32393l5};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f54758t = {1000, bb.c.d.f31317j5, bb.c.e.f32068w2, bb.c.f.Gb};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Property<d, Float> f54762x = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Property<d, Float> f54763y = new C0427d(Float.class, "completeEndFraction");

    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f54768h = (dVar.f54768h + 4) % d.this.f54767g.f54742c.length;
        }
    }

    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            androidx.vectordrawable.graphics.drawable.b.a aVar = dVar.f54771k;
            if (aVar != null) {
                aVar.b(dVar.f54803a);
            }
        }
    }

    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class c extends Property<d, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.t(f10.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class C0427d extends Property<d, Float> {
        C0427d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.u(f10.floatValue());
        }
    }

    public d(@n0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f54768h = 0;
        this.f54771k = null;
        this.f54767g = circularProgressIndicatorSpec;
        this.f54766f = new androidx.interpolator.view.animation.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.f54769i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f54770j;
    }

    private void q() {
        if (this.f54764d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f54762x, 0.0f, 1.0f);
            this.f54764d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f54764d.setInterpolator(null);
            this.f54764d.setRepeatCount(-1);
            this.f54764d.addListener(new a());
        }
        if (this.f54765e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f54763y, 0.0f, 1.0f);
            this.f54765e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f54765e.setInterpolator(this.f54766f);
            this.f54765e.addListener(new b());
        }
    }

    private void r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float fB = b(i10, f54758t[i11], bb.c.b.f30987v3);
            if (fB >= 0.0f && fB <= 1.0f) {
                int i12 = i11 + this.f54768h;
                int[] iArr = this.f54767g.f54742c;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                this.f54805c[0] = com.google.android.material.animation.d.b().evaluate(this.f54766f.getInterpolation(fB), Integer.valueOf(m.a(iArr[length], this.f54803a.getAlpha())), Integer.valueOf(m.a(this.f54767g.f54742c[length2], this.f54803a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f10) {
        this.f54770j = f10;
    }

    private void v(int i10) {
        float[] fArr = this.f54804b;
        float f10 = this.f54769i;
        fArr[0] = (f10 * 1520.0f) - 20.0f;
        fArr[1] = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float fB = b(i10, f54756r[i11], bb.c.b.R9);
            float[] fArr2 = this.f54804b;
            fArr2[1] = fArr2[1] + (this.f54766f.getInterpolation(fB) * 250.0f);
            float fB2 = b(i10, f54757s[i11], bb.c.b.R9);
            float[] fArr3 = this.f54804b;
            fArr3[0] = fArr3[0] + (this.f54766f.getInterpolation(fB2) * 250.0f);
        }
        float[] fArr4 = this.f54804b;
        float f11 = fArr4[0];
        float f12 = fArr4[1];
        float f13 = f11 + ((f12 - f11) * this.f54770j);
        fArr4[0] = f13;
        fArr4[0] = f13 / 360.0f;
        fArr4[1] = f12 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.h
    void a() {
        ObjectAnimator objectAnimator = this.f54764d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.h
    public void c() {
        s();
    }

    @Override // com.google.android.material.progressindicator.h
    public void d(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        this.f54771k = aVar;
    }

    @Override // com.google.android.material.progressindicator.h
    void f() {
        ObjectAnimator objectAnimator = this.f54765e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f54803a.isVisible()) {
            this.f54765e.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void g() {
        q();
        s();
        this.f54764d.start();
    }

    @Override // com.google.android.material.progressindicator.h
    public void h() {
        this.f54771k = null;
    }

    @j1
    void s() {
        this.f54768h = 0;
        this.f54805c[0] = m.a(this.f54767g.f54742c[0], this.f54803a.getAlpha());
        this.f54770j = 0.0f;
    }

    @j1
    void t(float f10) {
        this.f54769i = f10;
        int i10 = (int) (f10 * 5400.0f);
        v(i10);
        r(i10);
        this.f54803a.invalidateSelf();
    }
}
