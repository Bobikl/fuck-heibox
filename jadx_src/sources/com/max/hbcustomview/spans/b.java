package com.max.hbcustomview.spans;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CenteredImageSpan.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends ImageSpan {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f69511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f69512h;

    public b(Context context, int i10) {
        super(context, i10);
        this.f69506b = -1;
        this.f69507c = 0;
        this.f69508d = 0;
        this.f69509e = 0;
        this.f69510f = 0;
        this.f69511g = false;
        this.f69512h = new Rect();
        this.f69507c = 0;
        this.f69508d = 0;
    }

    public b(Context context, int i10, int i11) {
        super(context, i10);
        this.f69506b = -1;
        this.f69507c = 0;
        this.f69508d = 0;
        this.f69509e = 0;
        this.f69510f = 0;
        this.f69511g = false;
        this.f69512h = new Rect();
        this.f69506b = i11;
        this.f69507c = 0;
        this.f69508d = 0;
    }

    public b(Drawable drawable, int i10) {
        this(drawable, i10, 0, 0);
    }

    public b(Drawable drawable, int i10, int i11, int i12) {
        this(drawable, i10, i11, i12, 0, 0);
    }

    public b(Drawable drawable, int i10, int i11, int i12, int i13, int i14) {
        super(drawable, i10);
        this.f69506b = -1;
        this.f69507c = 0;
        this.f69508d = 0;
        this.f69509e = 0;
        this.f69510f = 0;
        this.f69511g = false;
        this.f69512h = new Rect();
        this.f69507c = i11;
        this.f69508d = i12;
        this.f69509e = i13;
        this.f69510f = i14;
    }

    public void a(Rect rect) {
        if (PatchProxy.proxy(new Object[]{rect}, this, changeQuickRedirect, false, bb.c.f.Pr, new Class[]{Rect.class}, Void.TYPE).isSupported || rect == null) {
            return;
        }
        this.f69511g = true;
        this.f69512h.set(rect);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@n0 Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @n0 Paint paint) {
        Object[] objArr = {canvas, charSequence, new Integer(i10), new Integer(i11), new Float(f10), new Integer(i12), new Integer(i13), new Integer(i14), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Nr, new Class[]{Canvas.class, CharSequence.class, cls, cls, Float.TYPE, cls, cls, cls, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = getDrawable();
        if (this.f69511g) {
            drawable.setBounds(this.f69512h);
        }
        int i15 = this.f69506b;
        if (i15 != -1) {
            drawable.setColorFilter(i15, PorterDuff.Mode.SRC_ATOP);
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f11 = this.f69507c + f10;
        int i16 = ((((((fontMetricsInt.descent + i13) + i13) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2)) + this.f69509e) - this.f69510f;
        canvas.save();
        canvas.translate(f11, i16);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(@n0 Paint paint, CharSequence charSequence, int i10, int i11, @p0 Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, new Integer(i10), new Integer(i11), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Or, new Class[]{Paint.class, CharSequence.class, cls, cls, Paint.FontMetricsInt.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69507c + super.getSize(paint, charSequence, i10, i11, fontMetricsInt) + this.f69508d;
    }
}
