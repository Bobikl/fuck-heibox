package com.max.hbcustomview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: TagDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public class f extends Drawable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f69078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f69079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f69085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f69086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LinearGradient f69087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RectF f69088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f69089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69093p;

    public f(String str, float f10, int i10, int i11, int i12, int i13, int i14, int i15) {
        this(str, f10, i10, i11, i12, i13, i14, i15, i14, i15, -1, 0);
    }

    public f(String str, float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f69085h = new Paint(5);
        this.f69086i = new Paint(5);
        this.f69088k = new RectF();
        this.f69089l = new RectF();
        this.f69092o = 0;
        this.f69093p = -1;
        this.f69078a = str;
        this.f69079b = f10;
        this.f69080c = i10;
        this.f69081d = i13;
        this.f69082e = i14;
        this.f69083f = i15;
        this.f69084g = i17;
        this.f69085h.setTextSize(f10);
        int iMeasureText = (int) this.f69085h.measureText(str);
        int iDescent = (int) ((this.f69085h.descent() - this.f69085h.ascent()) + 0.5f);
        this.f69090m = iMeasureText + i14 + i16;
        this.f69091n = iDescent + i15 + i17;
        this.f69087j = new LinearGradient(0.0f, this.f69091n, this.f69090m, 0.0f, i11, i12, Shader.TileMode.CLAMP);
        setBounds(0, 0, this.f69090m, this.f69091n);
        float f11 = i19;
        if (f11 > 0.0f) {
            this.f69092o = i19;
            this.f69093p = i18;
            this.f69086i.setStyle(Paint.Style.STROKE);
            this.f69086i.setStrokeWidth(f11);
            this.f69086i.setColor(i18);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Od, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69085h.setShader(this.f69087j);
        Rect bounds = getBounds();
        this.f69088k.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        RectF rectF = this.f69088k;
        float fHeight = (((rectF.top + (rectF.height() / 2.0f)) - ((this.f69085h.ascent() + this.f69085h.descent()) / 2.0f)) + this.f69083f) - this.f69084g;
        RectF rectF2 = this.f69088k;
        int i10 = this.f69081d;
        canvas.drawRoundRect(rectF2, i10, i10, this.f69085h);
        this.f69085h.setShader(null);
        this.f69085h.setTextSize(this.f69079b);
        this.f69085h.setColor(this.f69080c);
        canvas.drawText(this.f69078a, this.f69082e, fHeight, this.f69085h);
        int i11 = this.f69092o;
        if (i11 > 0.0f) {
            int i12 = i11 / 2;
            this.f69089l.set(bounds.left + i12, bounds.top + i12, bounds.right - i12, bounds.bottom - i12);
            RectF rectF3 = this.f69089l;
            int i13 = this.f69081d;
            canvas.drawRoundRect(rectF3, i13, i13, this.f69086i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f69091n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f69090m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Pd, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69085h.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.f.Qd, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69085h.setColorFilter(colorFilter);
    }
}
