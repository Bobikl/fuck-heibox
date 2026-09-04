package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.color.m;
import com.google.android.material.progressindicator.b;

/* JADX INFO: compiled from: DeterminateDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e<S extends b> extends f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f54774x = 10000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f54775y = 50.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final androidx.dynamicanimation.animation.d<e> f54776z = new a("indicatorLevel");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g<S> f54777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.dynamicanimation.animation.h f54778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final androidx.dynamicanimation.animation.g f54779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f54780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f54781w;

    /* JADX INFO: compiled from: DeterminateDrawable.java */
    public class a extends androidx.dynamicanimation.animation.d<e> {
        a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(e eVar) {
            return eVar.D() * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(e eVar, float f10) {
            eVar.G(f10 / 10000.0f);
        }
    }

    e(@n0 Context context, @n0 b bVar, @n0 g<S> gVar) {
        super(context, bVar);
        this.f54781w = false;
        F(gVar);
        androidx.dynamicanimation.animation.h hVar = new androidx.dynamicanimation.animation.h();
        this.f54778t = hVar;
        hVar.g(1.0f);
        hVar.i(50.0f);
        androidx.dynamicanimation.animation.g gVar2 = new androidx.dynamicanimation.animation.g(this, f54776z);
        this.f54779u = gVar2;
        gVar2.D(hVar);
        p(1.0f);
    }

    @n0
    public static e<CircularProgressIndicatorSpec> A(@n0 Context context, @n0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new e<>(context, circularProgressIndicatorSpec, new c(circularProgressIndicatorSpec));
    }

    @n0
    public static e<LinearProgressIndicatorSpec> B(@n0 Context context, @n0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new e<>(context, linearProgressIndicatorSpec, new j(linearProgressIndicatorSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float D() {
        return this.f54780v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(float f10) {
        this.f54780v = f10;
        invalidateSelf();
    }

    @n0
    g<S> C() {
        return this.f54777s;
    }

    public void E(@n0 androidx.dynamicanimation.animation.b.q qVar) {
        this.f54779u.l(qVar);
    }

    void F(@n0 g<S> gVar) {
        this.f54777s = gVar;
        gVar.f(this);
    }

    void H(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.f, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ boolean b(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        return super.b(aVar);
    }

    @Override // com.google.android.material.progressindicator.f, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void c(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar) {
        super.c(aVar);
    }

    @Override // com.google.android.material.progressindicator.f, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f54777s.g(canvas, getBounds(), j());
            this.f54777s.c(canvas, this.f54797n);
            this.f54777s.b(canvas, this.f54797n, 0.0f, D(), m.a(this.f54786c.f54742c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f54777s.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f54777s.e();
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f54779u.E();
        G(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.f
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.f
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.f
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.f54781w) {
            this.f54779u.E();
            G(i10 / 10000.0f);
            return true;
        }
        this.f54779u.t(D() * 10000.0f);
        this.f54779u.z(i10);
        return true;
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@p0 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.f
    public /* bridge */ /* synthetic */ boolean v(boolean z10, boolean z11, boolean z12) {
        return super.v(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.f
    boolean w(boolean z10, boolean z11, boolean z12) {
        boolean zW = super.w(z10, z11, z12);
        float fA = this.f54787d.a(this.f54785b.getContentResolver());
        if (fA == 0.0f) {
            this.f54781w = true;
        } else {
            this.f54781w = false;
            this.f54778t.i(50.0f / fA);
        }
        return zW;
    }

    public void z(@n0 androidx.dynamicanimation.animation.b.q qVar) {
        this.f54779u.b(qVar);
    }
}
