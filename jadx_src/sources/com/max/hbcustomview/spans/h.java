package com.max.hbcustomview.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: TopOffsetImageSpan.java */
/* JADX INFO: loaded from: classes10.dex */
public class h extends ImageSpan {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f69517b;

    public h(@n0 Drawable drawable, float f10) {
        super(drawable);
        this.f69517b = f10;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@n0 Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @n0 Paint paint) {
        Object[] objArr = {canvas, charSequence, new Integer(i10), new Integer(i11), new Float(f10), new Integer(i12), new Integer(i13), new Integer(i14), paint};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Yr, new Class[]{Canvas.class, CharSequence.class, cls, cls, Float.TYPE, cls, cls, cls, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Drawable drawable = getDrawable();
            canvas.save();
            try {
                canvas.translate(f10, this.f69517b);
                drawable.draw(canvas);
                canvas.restore();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
