package com.umeng.socialize.shareboard;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class SocializeImageView extends ImageButton {
    public static int BG_SHAPE_CIRCULAR = 1;
    public static int BG_SHAPE_NONE = 0;
    public static int BG_SHAPE_ROUNDED_SQUARE = 2;
    private int mAngle;
    private int mBgShape;
    private int mIconPressedColor;
    private boolean mIsPressEffect;
    private boolean mIsSelected;
    private int mNormalColor;
    protected Paint mNormalPaint;
    private int mPressedColor;
    protected Paint mPressedPaint;
    private RectF mSquareRect;

    public SocializeImageView(Context context) {
        super(context);
        init();
    }

    public SocializeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SocializeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }

    @TargetApi(21)
    public SocializeImageView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        init();
    }

    private void drawCircle(Canvas canvas, Paint paint) {
        float measuredWidth = getMeasuredWidth() / 2;
        canvas.drawCircle(measuredWidth, measuredWidth, measuredWidth, paint);
    }

    private void drawRect(Canvas canvas, Paint paint) {
        if (this.mSquareRect == null) {
            RectF rectF = new RectF();
            this.mSquareRect = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = getMeasuredWidth();
            this.mSquareRect.bottom = getMeasuredWidth();
        }
        RectF rectF2 = this.mSquareRect;
        int i10 = this.mAngle;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
    }

    private void init() {
        setBackground(null);
        setClickable(false);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    protected int dip2px(float f10) {
        return (int) ((f10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mIsPressEffect) {
            if (!isPressed()) {
                if (BG_SHAPE_NONE == this.mBgShape) {
                    clearColorFilter();
                    return;
                } else {
                    this.mIsSelected = false;
                    invalidate();
                    return;
                }
            }
            if (BG_SHAPE_NONE != this.mBgShape) {
                this.mIsSelected = true;
                invalidate();
            } else {
                int i10 = this.mIconPressedColor;
                if (i10 != 0) {
                    setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint;
        int i10 = this.mBgShape;
        if (i10 == BG_SHAPE_NONE) {
            super.onDraw(canvas);
            return;
        }
        if (this.mIsSelected) {
            if (this.mIsPressEffect && (paint = this.mPressedPaint) != null) {
                if (i10 == BG_SHAPE_CIRCULAR) {
                    drawCircle(canvas, paint);
                } else if (i10 == BG_SHAPE_ROUNDED_SQUARE) {
                    drawRect(canvas, paint);
                }
            }
        } else if (i10 == BG_SHAPE_CIRCULAR) {
            drawCircle(canvas, this.mNormalPaint);
        } else if (i10 == BG_SHAPE_ROUNDED_SQUARE) {
            drawRect(canvas, this.mNormalPaint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        setBackgroundColor(i10, 0);
    }

    public void setBackgroundColor(int i10, int i11) {
        this.mNormalColor = i10;
        this.mPressedColor = i11;
        setPressEffectEnable(i11 != 0);
        if (this.mNormalColor != 0) {
            Paint paint = new Paint();
            this.mNormalPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mNormalPaint.setAntiAlias(true);
            this.mNormalPaint.setColor(i10);
        }
        if (this.mPressedColor != 0) {
            Paint paint2 = new Paint();
            this.mPressedPaint = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.mPressedPaint.setAntiAlias(true);
            this.mPressedPaint.setColor(i11);
        }
    }

    public void setBackgroundShape(int i10) {
        setBackgroundShape(i10, 0);
    }

    public void setBackgroundShape(int i10, int i11) {
        this.mBgShape = i10;
        if (i10 != BG_SHAPE_ROUNDED_SQUARE) {
            this.mAngle = 0;
        } else {
            this.mAngle = (int) ((i11 * getResources().getDisplayMetrics().density) + 0.5f);
        }
    }

    public void setPressEffectEnable(boolean z10) {
        this.mIsPressEffect = z10;
    }

    public void setPressedColor(int i10) {
        setPressEffectEnable(i10 != 0);
        this.mIconPressedColor = i10;
    }
}
