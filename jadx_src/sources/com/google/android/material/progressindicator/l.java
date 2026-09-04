package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.j1;
import androidx.annotation.n0;
import com.google.android.material.R;
import com.google.android.material.color.m;
import java.util.Arrays;

/* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l extends h<ObjectAnimator> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54822l = 1800;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f54823m = {bb.c.b.f30812n7, bb.c.b.V7, bb.c.b.f30931sd, bb.c.b.f31017wb};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f54824n = {bb.c.b.tl, 1000, bb.c.b.f30987v3, 0};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Property<l, Float> f54825o = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f54826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ObjectAnimator f54827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Interpolator[] f54828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f54829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f54832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b.a f54833k;

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l lVar = l.this;
            lVar.f54830h = (lVar.f54830h + 1) % l.this.f54829g.f54742c.length;
            l.this.f54831i = true;
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            l.this.a();
            l lVar = l.this;
            androidx.vectordrawable.graphics.drawable.b.a aVar = lVar.f54833k;
            if (aVar != null) {
                aVar.b(lVar.f54803a);
            }
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class c extends Property<l, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(l lVar) {
            return Float.valueOf(lVar.n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(l lVar, Float f10) {
            lVar.r(f10.floatValue());
        }
    }

    public l(@n0 Context context, @n0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f54830h = 0;
        this.f54833k = null;
        this.f54829g = linearProgressIndicatorSpec;
        this.f54828f = new Interpolator[]{androidx.vectordrawable.graphics.drawable.d.b(context, R.anim.linear_indeterminate_line1_head_interpolator), androidx.vectordrawable.graphics.drawable.d.b(context, R.anim.linear_indeterminate_line1_tail_interpolator), androidx.vectordrawable.graphics.drawable.d.b(context, R.anim.linear_indeterminate_line2_head_interpolator), androidx.vectordrawable.graphics.drawable.d.b(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f54832j;
    }

    private void o() {
        if (this.f54826d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f54825o, 0.0f, 1.0f);
            this.f54826d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f54826d.setInterpolator(null);
            this.f54826d.setRepeatCount(-1);
            this.f54826d.addListener(new a());
        }
        if (this.f54827e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f54825o, 1.0f);
            this.f54827e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f54827e.setInterpolator(null);
            this.f54827e.addListener(new b());
        }
    }

    private void p() {
        if (this.f54831i) {
            Arrays.fill(this.f54805c, m.a(this.f54829g.f54742c[this.f54830h], this.f54803a.getAlpha()));
            this.f54831i = false;
        }
    }

    private void s(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f54804b[i11] = Math.max(0.0f, Math.min(1.0f, this.f54828f[i11].getInterpolation(b(i10, f54824n[i11], f54823m[i11]))));
        }
    }

    @Override // com.google.android.material.progressindicator.h
    public void a() {
        ObjectAnimator objectAnimator = this.f54826d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.h
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.h
    public void d(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        this.f54833k = aVar;
    }

    @Override // com.google.android.material.progressindicator.h
    public void f() {
        ObjectAnimator objectAnimator = this.f54827e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f54803a.isVisible()) {
            this.f54827e.setFloatValues(this.f54832j, 1.0f);
            this.f54827e.setDuration((long) ((1.0f - this.f54832j) * 1800.0f));
            this.f54827e.start();
        }
    }

    @Override // com.google.android.material.progressindicator.h
    public void g() {
        o();
        q();
        this.f54826d.start();
    }

    @Override // com.google.android.material.progressindicator.h
    public void h() {
        this.f54833k = null;
    }

    @j1
    void q() {
        this.f54830h = 0;
        int iA = m.a(this.f54829g.f54742c[0], this.f54803a.getAlpha());
        int[] iArr = this.f54805c;
        iArr[0] = iA;
        iArr[1] = iA;
    }

    @j1
    void r(float f10) {
        this.f54832j = f10;
        s((int) (f10 * 1800.0f));
        p();
        this.f54803a.invalidateSelf();
    }
}
