package com.starlightc.ucropplus.view.widget;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.core.content.res.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.view.widget.HBRingProgressBar;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBRingProgressBar.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class HBRingProgressBar extends View {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final Paint mBackPaint;

    @e
    private int[] mColorArray;

    @d
    private final Paint mProgPaint;
    private int mProgress;

    @d
    private RectF mRectF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBRingProgressBar(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HBRingProgressBar(@d Context context, @e @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HBRingProgressBar(@d Context context, @e @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.mRectF = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HBRingProgressBar);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Paint paint = new Paint();
        this.mBackPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRingProgressBar_backWidth, 5.0f));
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.HBRingProgressBar_backColor, -3355444));
        Paint paint2 = new Paint();
        this.mProgPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRingProgressBar_progWidth, 10.0f));
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.HBRingProgressBar_progColor, -16776961));
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.HBRingProgressBar_progStartColor, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.HBRingProgressBar_progFirstColor, -1);
        this.mColorArray = (color == -1 || color2 == -1) ? null : new int[]{color, color2};
        this.mProgress = typedArrayObtainStyledAttributes.getInteger(R.styleable.HBRingProgressBar_ringProgress, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgress$lambda$0(HBRingProgressBar this$0, ValueAnimator animation) {
        if (PatchProxy.proxy(new Object[]{this$0, animation}, null, changeQuickRedirect, true, 51167, new Class[]{HBRingProgressBar.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.mProgress = ((Integer) animatedValue).intValue();
        this$0.invalidate();
    }

    @Override // android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51158, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(this.mRectF, 0.0f, 360.0f, false, this.mBackPaint);
        canvas.drawArc(this.mRectF, 275.0f, (this.mProgress * 360.0f) / 100.0f, false, this.mProgPaint);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51157, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int strokeWidth = (int) ((measuredWidth > measuredHeight ? measuredHeight : measuredWidth) - (this.mBackPaint.getStrokeWidth() > this.mProgPaint.getStrokeWidth() ? this.mBackPaint : this.mProgPaint).getStrokeWidth());
        int paddingLeft = getPaddingLeft() + ((measuredWidth - strokeWidth) / 2);
        int paddingTop = getPaddingTop() + ((measuredHeight - strokeWidth) / 2);
        this.mRectF.set(paddingLeft, paddingTop, paddingLeft + strokeWidth, paddingTop + strokeWidth);
        int[] iArr = this.mColorArray;
        if (iArr != null) {
            f0.m(iArr);
            if (iArr.length > 1) {
                Paint paint = this.mProgPaint;
                float measuredWidth2 = getMeasuredWidth();
                int[] iArr2 = this.mColorArray;
                f0.m(iArr2);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, measuredWidth2, iArr2, (float[]) null, Shader.TileMode.MIRROR));
            }
        }
    }

    public final void setBackColor(@n int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51162, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mBackPaint.setColor(i.e(getResources(), i10, null));
        invalidate();
    }

    public final void setBackWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51161, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mBackPaint.setStrokeWidth(f10);
        invalidate();
    }

    public final void setProgColor(@n int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51164, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mProgPaint.setColor(i.e(getResources(), i10, null));
        this.mProgPaint.setShader(null);
        invalidate();
    }

    public final void setProgColor(@n int i10, @n int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51165, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.mColorArray = new int[]{i.e(getResources(), i10, null), i.e(getResources(), i11, null)};
        Paint paint = this.mProgPaint;
        float measuredWidth = getMeasuredWidth();
        int[] iArr = this.mColorArray;
        f0.m(iArr);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, measuredWidth, iArr, (float[]) null, Shader.TileMode.MIRROR));
        invalidate();
    }

    public final void setProgColor(@n @e int[] iArr) {
        if (PatchProxy.proxy(new Object[]{iArr}, this, changeQuickRedirect, false, 51166, new Class[]{int[].class}, Void.TYPE).isSupported || iArr == null || iArr.length < 2) {
            return;
        }
        this.mColorArray = new int[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int[] iArr2 = this.mColorArray;
            f0.m(iArr2);
            iArr2[i10] = i.e(getResources(), iArr[i10], null);
        }
        Paint paint = this.mProgPaint;
        float measuredWidth = getMeasuredWidth();
        int[] iArr3 = this.mColorArray;
        f0.m(iArr3);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, measuredWidth, iArr3, (float[]) null, Shader.TileMode.MIRROR));
        invalidate();
    }

    public final void setProgWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51163, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mProgPaint.setStrokeWidth(f10);
        invalidate();
    }

    public final void setProgress(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51159, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mProgress = i10;
        postInvalidate();
    }

    public final void setProgress(int i10, long j10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Long(j10)}, this, changeQuickRedirect, false, 51160, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (j10 <= 0) {
            this.mProgress = i10;
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.mProgress, i10);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wg.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HBRingProgressBar.setProgress$lambda$0(this.f141045b, valueAnimator);
            }
        });
        valueAnimatorOfInt.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfInt.setDuration(j10);
        valueAnimatorOfInt.start();
    }
}
