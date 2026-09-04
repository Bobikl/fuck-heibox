package com.max.hbcustomview.spans;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: CustomTypefaceSpan.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends MetricAffectingSpan {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Typeface f69516b;

    public g(Typeface typeface) {
        this.f69516b = typeface;
    }

    private void a(TextPaint textPaint) {
        if (PatchProxy.proxy(new Object[]{textPaint}, this, changeQuickRedirect, false, bb.c.f.Xr, new Class[]{TextPaint.class}, Void.TYPE).isSupported) {
            return;
        }
        Typeface typeface = textPaint.getTypeface();
        int style = (~this.f69516b.getStyle()) & (typeface != null ? typeface.getStyle() : 0);
        if ((style & 1) != 0) {
            textPaint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            textPaint.setTextSkewX(-0.25f);
        }
        textPaint.setTypeface(this.f69516b);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (PatchProxy.proxy(new Object[]{textPaint}, this, changeQuickRedirect, false, bb.c.f.Wr, new Class[]{TextPaint.class}, Void.TYPE).isSupported) {
            return;
        }
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        if (PatchProxy.proxy(new Object[]{textPaint}, this, changeQuickRedirect, false, bb.c.f.Vr, new Class[]{TextPaint.class}, Void.TYPE).isSupported) {
            return;
        }
        a(textPaint);
    }
}
