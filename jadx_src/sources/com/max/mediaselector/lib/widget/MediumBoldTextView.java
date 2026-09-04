package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import bb.c;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class MediumBoldTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f75577b;

    public MediumBoldTextView(Context context) {
        super(context);
        this.f75577b = 0.6f;
        f(context, null);
    }

    public MediumBoldTextView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75577b = 0.6f;
        f(context, attributeSet);
    }

    private void f(Context context, @p0 AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, c.m.f34976qa, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported || attributeSet == null) {
            return;
        }
        this.f75577b = context.obtainStyledAttributes(attributeSet, R.styleable.U1).getFloat(R.styleable.PsMediumBoldTextView_stroke_Width, this.f75577b);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.m.f34998ra, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        TextPaint paint = getPaint();
        float strokeWidth = paint.getStrokeWidth();
        float f10 = this.f75577b;
        if (strokeWidth != f10) {
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        super.onDraw(canvas);
    }

    public void setStrokeWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.f35020sa, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75577b = f10;
        invalidate();
    }
}
