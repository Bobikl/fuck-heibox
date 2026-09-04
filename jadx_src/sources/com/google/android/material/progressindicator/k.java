package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.color.m;
import java.util.Arrays;

/* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k extends h<ObjectAnimator> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54812j = 667;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f54813k = 333;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Property<k, Float> f54814l = new b(Float.class, "animationFraction");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f54815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.interpolator.view.animation.b f54816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f54817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54820i;

    /* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            k kVar = k.this;
            kVar.f54818g = (kVar.f54818g + 1) % k.this.f54817f.f54742c.length;
            k.this.f54819h = true;
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    public class b extends Property<k, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(k kVar) {
            return Float.valueOf(kVar.n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, Float f10) {
            kVar.r(f10.floatValue());
        }
    }

    public k(@n0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f54818g = 1;
        this.f54817f = linearProgressIndicatorSpec;
        this.f54816e = new androidx.interpolator.view.animation.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f54820i;
    }

    private void o() {
        if (this.f54815d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f54814l, 0.0f, 1.0f);
            this.f54815d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f54815d.setInterpolator(null);
            this.f54815d.setRepeatCount(-1);
            this.f54815d.addListener(new a());
        }
    }

    private void p() {
        if (!this.f54819h || this.f54804b[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.f54805c;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = m.a(this.f54817f.f54742c[this.f54818g], this.f54803a.getAlpha());
        this.f54819h = false;
    }

    private void s(int i10) {
        this.f54804b[0] = 0.0f;
        float fB = b(i10, 0, 667);
        float[] fArr = this.f54804b;
        float interpolation = this.f54816e.getInterpolation(fB);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f54804b;
        float interpolation2 = this.f54816e.getInterpolation(fB + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f54804b[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.h
    public void a() {
        ObjectAnimator objectAnimator = this.f54815d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.h
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.h
    public void d(@p0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
    }

    @Override // com.google.android.material.progressindicator.h
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.h
    public void g() {
        o();
        q();
        this.f54815d.start();
    }

    @Override // com.google.android.material.progressindicator.h
    public void h() {
    }

    @j1
    void q() {
        this.f54819h = true;
        this.f54818g = 1;
        Arrays.fill(this.f54805c, m.a(this.f54817f.f54742c[0], this.f54803a.getAlpha()));
    }

    @j1
    void r(float f10) {
        this.f54820i = f10;
        s((int) (f10 * 333.0f));
        p();
        this.f54803a.invalidateSelf();
    }
}
