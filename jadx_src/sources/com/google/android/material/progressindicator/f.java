package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends Drawable implements androidx.vectordrawable.graphics.drawable.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f54782p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f54783q = 500;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Property<f, Float> f54784r = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f54785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.google.android.material.progressindicator.b f54786c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator f54788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ValueAnimator f54789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f54790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f54792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b.a> f54793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.b.a f54794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f54795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f54796m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f54798o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Paint f54797n = new Paint();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.material.progressindicator.a f54787d = new com.google.android.material.progressindicator.a();

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            f.this.h();
        }
    }

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.super.setVisible(false, false);
            f.this.g();
        }
    }

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class c extends Property<f, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.j());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(f fVar, Float f10) {
            fVar.p(f10.floatValue());
        }
    }

    f(@n0 Context context, @n0 com.google.android.material.progressindicator.b bVar) {
        this.f54785b = context;
        this.f54786c = bVar;
        setAlpha(255);
    }

    private void f(@n0 ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f54795l;
        this.f54795l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f54795l = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        androidx.vectordrawable.graphics.drawable.b.a aVar = this.f54794k;
        if (aVar != null) {
            aVar.b(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f54793j;
        if (list == null || this.f54795l) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        androidx.vectordrawable.graphics.drawable.b.a aVar = this.f54794k;
        if (aVar != null) {
            aVar.c(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f54793j;
        if (list == null || this.f54795l) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    private void i(@n0 ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f54795l;
        this.f54795l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f54795l = z10;
    }

    private void o() {
        if (this.f54788e == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f54784r, 0.0f, 1.0f);
            this.f54788e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f54788e.setInterpolator(com.google.android.material.animation.b.f52897b);
            u(this.f54788e);
        }
        if (this.f54789f == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f54784r, 1.0f, 0.0f);
            this.f54789f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f54789f.setInterpolator(com.google.android.material.animation.b.f52897b);
            q(this.f54789f);
        }
    }

    private void q(@n0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f54789f;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f54789f = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void u(@n0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f54788e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f54788e = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public boolean b(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        List<androidx.vectordrawable.graphics.drawable.b.a> list = this.f54793j;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.f54793j.remove(aVar);
        if (!this.f54793j.isEmpty()) {
            return true;
        }
        this.f54793j = null;
        return true;
    }

    public void c(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        if (this.f54793j == null) {
            this.f54793j = new ArrayList();
        }
        if (this.f54793j.contains(aVar)) {
            return;
        }
        this.f54793j.add(aVar);
    }

    public void clearAnimationCallbacks() {
        this.f54793j.clear();
        this.f54793j = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f54798o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return n() || m();
    }

    float j() {
        if (this.f54786c.b() || this.f54786c.a()) {
            return (this.f54791h || this.f54790g) ? this.f54792i : this.f54796m;
        }
        return 1.0f;
    }

    @n0
    ValueAnimator k() {
        return this.f54789f;
    }

    public boolean l() {
        return v(false, false, false);
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.f54789f;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f54791h;
    }

    public boolean n() {
        ValueAnimator valueAnimator = this.f54788e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f54790g;
    }

    void p(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (this.f54796m != f10) {
            this.f54796m = f10;
            invalidateSelf();
        }
    }

    void r(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        this.f54794k = aVar;
    }

    @j1
    void s(boolean z10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f54791h = z10;
        this.f54792i = f10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f54798o = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        this.f54797n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return v(z10, z11, true);
    }

    public void start() {
        w(true, true, false);
    }

    public void stop() {
        w(false, true, false);
    }

    @j1
    void t(boolean z10, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f54790g = z10;
        this.f54792i = f10;
    }

    public boolean v(boolean z10, boolean z11, boolean z12) {
        return w(z10, z11, z12 && this.f54787d.a(this.f54785b.getContentResolver()) > 0.0f);
    }

    boolean w(boolean z10, boolean z11, boolean z12) {
        o();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f54788e : this.f54789f;
        ValueAnimator valueAnimator2 = z10 ? this.f54789f : this.f54788e;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                f(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                i(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (z12 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.f54786c.b() : this.f54786c.a())) {
            i(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z13;
    }
}
