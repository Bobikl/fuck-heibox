package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.progressindicator.b;

/* JADX INFO: compiled from: IndeterminateDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i<S extends b> extends f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g<S> f54806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private h<ObjectAnimator> f54807t;

    i(@n0 Context context, @n0 b bVar, @n0 g<S> gVar, @n0 h<ObjectAnimator> hVar) {
        super(context, bVar);
        C(gVar);
        B(hVar);
    }

    @n0
    public static i<CircularProgressIndicatorSpec> x(@n0 Context context, @n0 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new i<>(context, circularProgressIndicatorSpec, new c(circularProgressIndicatorSpec), new d(circularProgressIndicatorSpec));
    }

    @n0
    public static i<LinearProgressIndicatorSpec> y(@n0 Context context, @n0 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new i<>(context, linearProgressIndicatorSpec, new j(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f54736g == 0 ? new k(linearProgressIndicatorSpec) : new l(context, linearProgressIndicatorSpec));
    }

    @n0
    g<S> A() {
        return this.f54806s;
    }

    void B(@n0 h<ObjectAnimator> hVar) {
        this.f54807t = hVar;
        hVar.e(this);
    }

    void C(@n0 g<S> gVar) {
        this.f54806s = gVar;
        gVar.f(this);
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
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f54806s.g(canvas, getBounds(), j());
        this.f54806s.c(canvas, this.f54797n);
        int i10 = 0;
        while (true) {
            h<ObjectAnimator> hVar = this.f54807t;
            int[] iArr = hVar.f54805c;
            if (i10 >= iArr.length) {
                canvas.restore();
                return;
            }
            g<S> gVar = this.f54806s;
            Paint paint = this.f54797n;
            float[] fArr = hVar.f54804b;
            int i11 = i10 * 2;
            gVar.b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
            i10++;
        }
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f54806s.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f54806s.e();
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
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
        if (!isRunning()) {
            this.f54807t.a();
        }
        this.f54787d.a(this.f54785b.getContentResolver());
        if (z10 && z12) {
            this.f54807t.g();
        }
        return zW;
    }

    @n0
    h<ObjectAnimator> z() {
        return this.f54807t;
    }
}
