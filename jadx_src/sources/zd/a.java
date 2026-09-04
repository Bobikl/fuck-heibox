package zd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TopSpan.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends ReplacementSpan {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f141967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f141968c;

    public a(int i10, int i11) {
        this.f141967b = i10;
        this.f141968c = i11;
    }

    private final TextPaint a(Paint paint) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, c.k.fy, new Class[]{Paint.class}, TextPaint.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextPaint) patchProxyResultProxy.result;
        }
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(this.f141967b);
        textPaint.setColor(this.f141968c);
        return textPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@d Canvas canvas, @d CharSequence text, int i10, int i11, float f10, int i12, int i13, int i14, @d Paint paint) {
        Object[] objArr = {canvas, text, new Integer(i10), new Integer(i11), new Float(f10), new Integer(i12), new Integer(i13), new Integer(i14), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.ey, new Class[]{Canvas.class, CharSequence.class, cls, cls, Float.TYPE, cls, cls, cls, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        f0.p(text, "text");
        f0.p(paint, "paint");
        CharSequence charSequenceSubSequence = text.subSequence(i10, i11);
        TextPaint textPaintA = a(paint);
        Paint.FontMetricsInt fontMetricsInt = textPaintA.getFontMetricsInt();
        f0.o(fontMetricsInt, "getFontMetricsInt(...)");
        canvas.drawText(charSequenceSubSequence.toString(), f10, i13 - ((((fontMetricsInt.descent + i13) + i13) + fontMetricsInt.ascent) - (i12 + i14)), textPaintA);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@d Paint paint, @d CharSequence text, int i10, int i11, @e Paint.FontMetricsInt fontMetricsInt) {
        Object[] objArr = {paint, text, new Integer(i10), new Integer(i11), fontMetricsInt};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.dy, new Class[]{Paint.class, CharSequence.class, cls, cls, Paint.FontMetricsInt.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(paint, "paint");
        f0.p(text, "text");
        return (int) a(paint).measureText(text.subSequence(i10, i11).toString());
    }
}
