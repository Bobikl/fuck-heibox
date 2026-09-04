package com.umeng.socialize.shareboard;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class IndicatorView extends View {
    private int mIndicatorMargin;
    private int mIndicatorWidth;
    private float mLeftPosition;
    private Paint mNormalPaint;
    private int mPageCount;
    private Paint mSelectPaint;
    private int mSelectPosition;

    public IndicatorView(Context context) {
        super(context);
    }

    public IndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IndicatorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @TargetApi(21)
    public IndicatorView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    private int measureHeight(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.mIndicatorWidth * 2);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    private int measureWidth(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i11 = this.mIndicatorWidth;
        int i12 = this.mPageCount;
        int i13 = paddingLeft + (i11 * i12 * 2) + (this.mIndicatorMargin * (i12 - 1));
        this.mLeftPosition = ((getMeasuredWidth() - i13) / 2.0f) + getPaddingLeft();
        if (mode == 1073741824) {
            return Math.max(i13, size);
        }
        return mode == Integer.MIN_VALUE ? Math.min(i13, size) : i13;
    }

    protected int dip2px(float f10) {
        return (int) ((f10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mSelectPaint == null || this.mNormalPaint == null) {
            return;
        }
        float f10 = this.mLeftPosition + this.mIndicatorWidth;
        int i10 = 0;
        while (i10 < this.mPageCount) {
            int i11 = this.mIndicatorWidth;
            canvas.drawCircle(f10, i11, i11, i10 == this.mSelectPosition ? this.mSelectPaint : this.mNormalPaint);
            f10 += this.mIndicatorMargin + (this.mIndicatorWidth * 2);
            i10++;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(measureWidth(i10), measureHeight(i11));
    }

    public void setIndicator(int i10, int i11) {
        this.mIndicatorMargin = dip2px(i11);
        this.mIndicatorWidth = dip2px(i10);
    }

    public void setIndicatorColor(int i10, int i11) {
        Paint paint = new Paint();
        this.mSelectPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mSelectPaint.setAntiAlias(true);
        this.mSelectPaint.setColor(i11);
        Paint paint2 = new Paint();
        this.mNormalPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.mNormalPaint.setAntiAlias(true);
        this.mNormalPaint.setColor(i10);
    }

    public void setPageCount(int i10) {
        this.mPageCount = i10;
        invalidate();
    }

    public void setSelectedPosition(int i10) {
        this.mSelectPosition = i10;
        invalidate();
    }
}
