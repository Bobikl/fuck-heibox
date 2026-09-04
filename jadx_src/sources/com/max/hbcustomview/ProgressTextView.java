package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.j1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class ProgressTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f68579h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f68580i = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f68581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f68582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f68583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f68584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f68585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f68586g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public ProgressTextView(@n0 Context context) {
        this(context, null);
    }

    public ProgressTextView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressTextView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68717t2);
        this.f68581b = typedArrayObtainStyledAttributes.getInt(R.styleable.ProgressTextView_direction, 0);
        this.f68582c = typedArrayObtainStyledAttributes.getFloat(R.styleable.ProgressTextView_progress, 0.0f);
        this.f68583d = typedArrayObtainStyledAttributes.getFloat(R.styleable.ProgressTextView_maxProgress, 1.0f);
        this.f68584e = typedArrayObtainStyledAttributes.getColor(R.styleable.ProgressTextView_defaultColor, j1.f21601t);
        this.f68585f = typedArrayObtainStyledAttributes.getColor(R.styleable.ProgressTextView_progressColor, -1);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f68586g = paint;
        paint.setColor(this.f68584e);
        paint.setTextSize(getTextSize());
    }

    private void f(Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32166b9, new Class[]{Canvas.class, cls, cls, cls, cls, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68586g.setColor(i10);
        canvas.save();
        canvas.clipRect(f10, 0.0f, f11, f13);
        CharSequence text = getText();
        float fMeasureText = (f12 - this.f68586g.measureText(text, 0, text.length())) / 2.0f;
        Paint.FontMetrics fontMetrics = this.f68586g.getFontMetrics();
        canvas.drawText(text, 0, text.length(), fMeasureText, (f13 / 2.0f) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), this.f68586g);
        canvas.restore();
    }

    public int getDefaultColor() {
        return this.f68584e;
    }

    public int getDirection() {
        return this.f68581b;
    }

    public float getMaxProgress() {
        return this.f68583d;
    }

    public float getProgress() {
        return this.f68582c;
    }

    public int getProgressColor() {
        return this.f68585f;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32143a9, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        f(canvas, 0.0f, measuredWidth, measuredWidth, measuredHeight, this.f68584e);
        float f12 = this.f68583d;
        float f13 = f12 > 0.0f ? this.f68582c / f12 : 0.0f;
        if (f13 == 0.0f) {
            return;
        }
        int i10 = this.f68581b;
        if (i10 == 0) {
            f10 = 0.0f;
            f11 = f13 * measuredWidth;
        } else {
            f10 = i10 == 1 ? (1.0f - f13) * measuredWidth : 0.0f;
            f11 = measuredWidth;
        }
        f(canvas, f10, f11, measuredWidth, measuredHeight, this.f68585f);
    }

    public void setDefaultColor(int i10) {
        this.f68584e = i10;
    }

    public void setDirection(int i10) {
        this.f68581b = i10;
    }

    public void setMaxProgress(float f10) {
        this.f68583d = f10;
    }

    public void setProgress(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.f32189c9, new Class[]{Float.TYPE}, Void.TYPE).isSupported || f10 == this.f68582c) {
            return;
        }
        this.f68582c = f10;
        invalidate();
    }

    public void setProgressColor(int i10) {
        this.f68585f = i10;
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, bb.c.f.Z8, new Class[]{Typeface.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setTypeface(typeface);
        Paint paint = this.f68586g;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
    }
}
