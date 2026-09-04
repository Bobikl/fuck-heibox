package com.max.hbcustomview.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ClickableCenteredImageSpan.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public c(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@n0 Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @n0 Paint paint) {
        Object[] objArr = {canvas, charSequence, new Integer(i10), new Integer(i11), new Float(f10), new Integer(i12), new Integer(i13), new Integer(i14), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Qr, new Class[]{Canvas.class, CharSequence.class, cls, cls, Float.TYPE, cls, cls, cls, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i15 = ((((fontMetricsInt.descent + i13) + i13) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f10, i15);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, charSequence, new Integer(i10), new Integer(i11), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Rr, new Class[]{Paint.class, CharSequence.class, cls, cls, Paint.FontMetricsInt.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            Rect bounds = getDrawable().getBounds();
            if (fontMetricsInt != null) {
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                int i12 = fontMetricsInt2.bottom - fontMetricsInt2.top;
                int i13 = bounds.bottom - bounds.top;
                int i14 = (i13 / 2) - (i12 / 4);
                int i15 = -((i13 / 2) + (i12 / 4));
                fontMetricsInt.ascent = i15;
                fontMetricsInt.top = i15;
                fontMetricsInt.bottom = i14;
                fontMetricsInt.descent = i14;
            }
            return bounds.right;
        } catch (Exception unused) {
            return 20;
        }
    }
}
