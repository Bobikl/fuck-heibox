package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.core.content.d;
import com.google.android.material.R;

/* JADX INFO: compiled from: ShadowDrawableWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class a extends androidx.appcompat.graphics.drawable.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final double f55020s = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final float f55021t = 1.5f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final float f55022u = 0.25f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final float f55023v = 0.5f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final float f55024w = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    final Paint f55025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    final Paint f55026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    final RectF f55027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f55028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Path f55029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f55030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f55031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f55032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f55033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f55035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f55036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f55037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f55038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f55039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f55040r;

    public a(Context context, Drawable drawable, float f10, float f11, float f12) {
        super(drawable);
        this.f55034l = true;
        this.f55038p = true;
        this.f55040r = false;
        this.f55035m = d.f(context, R.color.design_fab_shadow_start_color);
        this.f55036n = d.f(context, R.color.design_fab_shadow_mid_color);
        this.f55037o = d.f(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f55025c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f55028f = Math.round(f10);
        this.f55027e = new RectF();
        Paint paint2 = new Paint(paint);
        this.f55026d = paint2;
        paint2.setAntiAlias(false);
        r(f11, f12);
    }

    private void c(@n0 Rect rect) {
        float f10 = this.f55031i;
        float f11 = f55021t * f10;
        this.f55027e.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        Drawable drawableA = a();
        RectF rectF = this.f55027e;
        drawableA.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        d();
    }

    private void d() {
        float f10 = this.f55028f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f55032j;
        rectF2.inset(-f11, -f11);
        Path path = this.f55029g;
        if (path == null) {
            this.f55029g = new Path();
        } else {
            path.reset();
        }
        this.f55029g.setFillType(Path.FillType.EVEN_ODD);
        this.f55029g.moveTo(-this.f55028f, 0.0f);
        this.f55029g.rLineTo(-this.f55032j, 0.0f);
        this.f55029g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f55029g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f55029g.close();
        float f12 = -rectF2.top;
        if (f12 > 0.0f) {
            float f13 = this.f55028f / f12;
            this.f55025c.setShader(new RadialGradient(0.0f, 0.0f, f12, new int[]{0, this.f55035m, this.f55036n, this.f55037o}, new float[]{0.0f, f13, ((1.0f - f13) / 2.0f) + f13, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f55026d.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f55035m, this.f55036n, this.f55037o}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f55026d.setAntiAlias(false);
    }

    public static float e(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f55020s) * ((double) f11))) : f10;
    }

    public static float f(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * f55021t)) + ((1.0d - f55020s) * ((double) f11))) : f10 * f55021t;
    }

    private void g(@n0 Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(this.f55039q, this.f55027e.centerX(), this.f55027e.centerY());
        float f10 = this.f55028f;
        float f11 = (-f10) - this.f55032j;
        float f12 = f10 * 2.0f;
        boolean z10 = this.f55027e.width() - f12 > 0.0f;
        boolean z11 = this.f55027e.height() - f12 > 0.0f;
        float f13 = this.f55033k;
        float f14 = f10 / ((f13 - (0.5f * f13)) + f10);
        float f15 = f10 / ((f13 - (f55022u * f13)) + f10);
        float f16 = f10 / ((f13 - (f13 * 1.0f)) + f10);
        int iSave2 = canvas.save();
        RectF rectF = this.f55027e;
        canvas.translate(rectF.left + f10, rectF.top + f10);
        canvas.scale(f14, f15);
        canvas.drawPath(this.f55029g, this.f55025c);
        if (z10) {
            canvas.scale(1.0f / f14, 1.0f);
            canvas.drawRect(0.0f, f11, this.f55027e.width() - f12, -this.f55028f, this.f55026d);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF2 = this.f55027e;
        canvas.translate(rectF2.right - f10, rectF2.bottom - f10);
        canvas.scale(f14, f16);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f55029g, this.f55025c);
        if (z10) {
            canvas.scale(1.0f / f14, 1.0f);
            canvas.drawRect(0.0f, f11, this.f55027e.width() - f12, (-this.f55028f) + this.f55032j, this.f55026d);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF3 = this.f55027e;
        canvas.translate(rectF3.left + f10, rectF3.bottom - f10);
        canvas.scale(f14, r6);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f55029g, this.f55025c);
        if (z11) {
            canvas.scale(1.0f / f16, 1.0f);
            canvas.drawRect(0.0f, f11, this.f55027e.height() - f12, -this.f55028f, this.f55026d);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        RectF rectF4 = this.f55027e;
        canvas.translate(rectF4.right - f10, rectF4.top + f10);
        canvas.scale(f14, f15);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f55029g, this.f55025c);
        if (z11) {
            canvas.scale(1.0f / f15, 1.0f);
            canvas.drawRect(0.0f, f11, this.f55027e.height() - f12, -this.f55028f, this.f55026d);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(iSave);
    }

    private static int s(float f10) {
        int iRound = Math.round(f10);
        return iRound % 2 == 1 ? iRound - 1 : iRound;
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        if (this.f55034l) {
            c(getBounds());
            this.f55034l = false;
        }
        g(canvas);
        super.draw(canvas);
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public boolean getPadding(@n0 Rect rect) {
        int iCeil = (int) Math.ceil(f(this.f55031i, this.f55028f, this.f55038p));
        int iCeil2 = (int) Math.ceil(e(this.f55031i, this.f55028f, this.f55038p));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public float h() {
        return this.f55028f;
    }

    public float i() {
        return this.f55031i;
    }

    public float j() {
        float f10 = this.f55031i;
        return (Math.max(f10, this.f55028f + ((f10 * f55021t) / 2.0f)) * 2.0f) + (this.f55031i * f55021t * 2.0f);
    }

    public float k() {
        float f10 = this.f55031i;
        return (Math.max(f10, this.f55028f + (f10 / 2.0f)) * 2.0f) + (this.f55031i * 2.0f);
    }

    public float l() {
        return this.f55033k;
    }

    public void m(boolean z10) {
        this.f55038p = z10;
        invalidateSelf();
    }

    public void n(float f10) {
        float fRound = Math.round(f10);
        if (this.f55028f == fRound) {
            return;
        }
        this.f55028f = fRound;
        this.f55034l = true;
        invalidateSelf();
    }

    public void o(float f10) {
        r(this.f55033k, f10);
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f55034l = true;
    }

    public final void p(float f10) {
        if (this.f55039q != f10) {
            this.f55039q = f10;
            invalidateSelf();
        }
    }

    public void q(float f10) {
        r(f10, this.f55031i);
    }

    public void r(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float fS = s(f10);
        float fS2 = s(f11);
        if (fS > fS2) {
            if (!this.f55040r) {
                this.f55040r = true;
            }
            fS = fS2;
        }
        if (this.f55033k == fS && this.f55031i == fS2) {
            return;
        }
        this.f55033k = fS;
        this.f55031i = fS2;
        this.f55032j = Math.round(fS * f55021t);
        this.f55030h = fS2;
        this.f55034l = true;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f55025c.setAlpha(i10);
        this.f55026d.setAlpha(i10);
    }
}
