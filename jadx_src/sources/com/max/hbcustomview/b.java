package com.max.hbcustomview;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.UpdateAppearance;
import androidx.annotation.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ForegroundColorTypefaceSpan.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends MetricAffectingSpan implements UpdateAppearance {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Typeface f68983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f68984c;

    public b(@dl.d Typeface typeface, @l int i10) {
        f0.p(typeface, "typeface");
        this.f68983b = typeface;
        this.f68984c = i10;
    }

    private final void a(Paint paint) {
        if (PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, bb.c.f.W5, new Class[]{Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        Typeface typeface = paint.getTypeface();
        int style = (~this.f68983b.getStyle()) & (typeface != null ? typeface.getStyle() : 0);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setColor(this.f68984c);
        paint.setTypeface(this.f68983b);
    }

    @l
    public final int b() {
        return this.f68984c;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@dl.d TextPaint drawState) {
        if (PatchProxy.proxy(new Object[]{drawState}, this, changeQuickRedirect, false, bb.c.f.U5, new Class[]{TextPaint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(drawState, "drawState");
        a(drawState);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@dl.d TextPaint paint) {
        if (PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, bb.c.f.V5, new Class[]{TextPaint.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(paint, "paint");
        a(paint);
    }
}
