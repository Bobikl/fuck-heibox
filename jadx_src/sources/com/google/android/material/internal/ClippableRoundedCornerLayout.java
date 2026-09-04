package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private Path f54375b;

    public ClippableRoundedCornerLayout(@n0 Context context) {
        super(context);
    }

    public ClippableRoundedCornerLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void a() {
        this.f54375b = null;
        invalidate();
    }

    public void b(float f10, float f11, float f12, float f13, float f14) {
        d(new RectF(f10, f11, f12, f13), f14);
    }

    public void c(@n0 Rect rect, float f10) {
        b(rect.left, rect.top, rect.right, rect.bottom, f10);
    }

    public void d(@n0 RectF rectF, float f10) {
        if (this.f54375b == null) {
            this.f54375b = new Path();
        }
        this.f54375b.reset();
        this.f54375b.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        this.f54375b.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f54375b == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f54375b);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }
}
