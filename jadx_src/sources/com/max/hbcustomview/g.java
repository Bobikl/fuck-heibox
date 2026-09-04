package com.max.hbcustomview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: TextDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends Drawable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f69116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69119d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f69121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearGradient f69122g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f69125j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f69120e = new Paint(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f69123h = new RectF();

    public g(String str, TextPaint textPaint, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f69116a = str;
        this.f69118c = i13;
        this.f69119d = i14;
        this.f69117b = i10;
        this.f69121f = textPaint;
        int iMeasureText = (int) textPaint.measureText(str);
        int iDescent = (int) ((textPaint.descent() - textPaint.ascent()) + 0.5f);
        this.f69124i = iMeasureText + (i14 * 2);
        this.f69125j = iDescent + (i15 * 2);
        this.f69122g = new LinearGradient(0.0f, this.f69125j, this.f69124i, 0.0f, i11, i12, Shader.TileMode.CLAMP);
        setBounds(0, 0, this.f69124i, this.f69125j);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.Rd, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69120e.setShader(this.f69122g);
        Rect bounds = getBounds();
        this.f69123h.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        RectF rectF = this.f69123h;
        float fHeight = (rectF.top + (rectF.height() / 2.0f)) - ((this.f69121f.ascent() + this.f69121f.descent()) / 2.0f);
        RectF rectF2 = this.f69123h;
        int i10 = this.f69118c;
        canvas.drawRoundRect(rectF2, i10, i10, this.f69120e);
        this.f69121f.setColor(this.f69117b);
        canvas.drawText(this.f69116a, this.f69119d, fHeight, this.f69121f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f69125j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f69124i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Sd, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69120e.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, bb.c.f.Td, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69120e.setColorFilter(colorFilter);
    }
}
