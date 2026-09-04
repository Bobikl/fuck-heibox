package com.max.hbcommon.component.ezcalendarview.utils;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: RoundRectDrawableWithShadow.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends Drawable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final double f67690t = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final float f67691u = 1.5f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Paint f67695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Paint f67696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final RectF f67697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f67698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Path f67699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f67700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f67701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f67702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f67703l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f67707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f67708q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final RectF f67693b = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f67704m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f67705n = 922746880;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f67706o = 50331648;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f67709r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f67710s = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f67692a = c.a(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Paint f67694c = new Paint(5);

    public b(int i10, int i11, float f10, float f11, float f12) {
        this.f67707p = i10;
        this.f67708q = i11;
        Paint paint = new Paint(5);
        this.f67695d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f67698g = (int) (f10 + 0.5f);
        this.f67697f = new RectF();
        Paint paint2 = new Paint(this.f67695d);
        this.f67696e = paint2;
        paint2.setAntiAlias(false);
        t(f11, f12);
    }

    private void a(Rect rect) {
        if (PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, bb.c.e.f31726c, new Class[]{Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = this.f67701j;
        float f11 = f67691u * f10;
        this.f67697f.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        b();
    }

    private void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31709b, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        float f10 = this.f67698g;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f67702k;
        rectF2.inset(-f11, -f11);
        Path path = this.f67699h;
        if (path == null) {
            this.f67699h = new Path();
        } else {
            path.reset();
        }
        this.f67699h.setFillType(Path.FillType.EVEN_ODD);
        this.f67699h.moveTo(-this.f67698g, 0.0f);
        this.f67699h.rLineTo(-this.f67702k, 0.0f);
        this.f67699h.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f67699h.arcTo(rectF, 270.0f, -90.0f, false);
        this.f67699h.close();
        float f12 = this.f67698g;
        float f13 = f12 / (this.f67702k + f12);
        Paint paint = this.f67695d;
        float f14 = this.f67698g + this.f67702k;
        int i10 = this.f67705n;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f67706o}, new float[]{0.0f, f13, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f67696e;
        float f15 = this.f67698g;
        float f16 = this.f67702k;
        int i11 = this.f67705n;
        paint2.setShader(new LinearGradient(0.0f, (-f15) + f16, 0.0f, (-f15) - f16, new int[]{i11, i11, this.f67706o}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f67696e.setAntiAlias(false);
    }

    static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f67690t) * ((double) f11))) : f10;
    }

    static float d(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * f67691u)) + ((1.0d - f67690t) * ((double) f11))) : f10 * f67691u;
    }

    private void e(Canvas canvas, RectF rectF, float f10, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, rectF, new Float(f10), paint}, this, changeQuickRedirect, false, bb.c.e.f31743d, new Class[]{Canvas.class, RectF.class, Float.TYPE, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }

    private void f(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.e.f31692a, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = this.f67698g;
        float f11 = (-f10) - this.f67702k;
        float f12 = f10 + this.f67692a + (this.f67703l / 2.0f);
        float f13 = f12 * 2.0f;
        boolean z10 = this.f67697f.width() - f13 > 0.0f;
        boolean z11 = this.f67697f.height() - f13 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f67697f;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f67699h, this.f67695d);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f67697f.width() - f13, -this.f67698g, this.f67696e);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.f67697f;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f67699h, this.f67695d);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f67697f.width() - f13, (-this.f67698g) + this.f67702k, this.f67696e);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.f67697f;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f67699h, this.f67695d);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f67697f.height() - f13, -this.f67698g, this.f67696e);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.f67697f;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f67699h, this.f67695d);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f67697f.height() - f13, -this.f67698g, this.f67696e);
        }
        canvas.restoreToCount(iSave4);
    }

    private int v(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.d.Kr, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f67704m) {
            a(getBounds());
            this.f67704m = false;
        }
        canvas.translate(0.0f, this.f67703l / 2.0f);
        f(canvas);
        canvas.translate(0.0f, (-this.f67703l) / 2.0f);
        int i10 = this.f67707p;
        if (i10 != this.f67708q) {
            this.f67694c.setShader(new LinearGradient(0.0f, 0.0f, this.f67697f.right, 0.0f, this.f67707p, this.f67708q, Shader.TileMode.CLAMP));
        } else {
            this.f67694c.setColor(i10);
        }
        e(canvas, this.f67697f, this.f67698g, this.f67694c);
    }

    float g() {
        return this.f67698g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, bb.c.d.Hr, new Class[]{Rect.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int iCeil = (int) Math.ceil(d(this.f67701j, this.f67698g, this.f67709r));
        int iCeil2 = (int) Math.ceil(c(this.f67701j, this.f67698g, this.f67709r));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    void h(Rect rect) {
        if (PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, bb.c.e.f31760e, new Class[]{Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        getPadding(rect);
    }

    float i() {
        return this.f67701j;
    }

    float j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31828i, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float f10 = this.f67701j;
        return (Math.max(f10, this.f67698g + this.f67692a + ((f10 * f67691u) / 2.0f)) * 2.0f) + (((this.f67701j * f67691u) + this.f67692a) * 2.0f);
    }

    float k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31811h, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float f10 = this.f67701j;
        return (Math.max(f10, this.f67698g + this.f67692a + (f10 / 2.0f)) * 2.0f) + ((this.f67701j + this.f67692a) * 2.0f);
    }

    public int l() {
        return this.f67706o;
    }

    float m() {
        return this.f67703l;
    }

    public int n() {
        return this.f67705n;
    }

    public void o(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Dr, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67709r = z10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        if (PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, bb.c.d.Fr, new Class[]{Rect.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBoundsChange(rect);
        this.f67704m = true;
    }

    void p(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.Jr, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float f11 = (int) (f10 + 0.5f);
        if (this.f67698g == f11) {
            return;
        }
        this.f67698g = f11;
        this.f67704m = true;
        invalidateSelf();
    }

    void q(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.e.f31794g, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        t(this.f67703l, f10);
    }

    public void r(int i10) {
        this.f67706o = i10;
    }

    void s(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.e.f31777f, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        t(f10, this.f67701j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Er, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67694c.setAlpha(i10);
        this.f67695d.setAlpha(i10);
        this.f67696e.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.d.Ir, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67694c.setColorFilter(colorFilter);
        this.f67695d.setColorFilter(colorFilter);
        this.f67696e.setColorFilter(colorFilter);
    }

    void t(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.Gr, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 < 0.0f || f11 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float fV = v(f10);
        float fV2 = v(f11);
        if (fV > fV2) {
            if (!this.f67710s) {
                this.f67710s = true;
            }
            fV = fV2;
        }
        if (this.f67703l == fV && this.f67701j == fV2) {
            return;
        }
        this.f67703l = fV;
        this.f67701j = fV2;
        float f12 = fV * f67691u;
        int i10 = this.f67692a;
        this.f67702k = (int) (f12 + i10 + 0.5f);
        this.f67700i = fV2 + i10;
        this.f67704m = true;
        invalidateSelf();
    }

    public void u(int i10) {
        this.f67705n = i10;
    }
}
