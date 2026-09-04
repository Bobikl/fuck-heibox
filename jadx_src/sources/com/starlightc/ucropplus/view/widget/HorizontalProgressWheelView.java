package com.starlightc.ucropplus.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.l;
import androidx.core.content.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;

/* JADX INFO: loaded from: classes4.dex */
public class HorizontalProgressWheelView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Rect mCanvasClipBounds;
    private float mLastTouchedPosition;
    private int mMiddleLineColor;
    private int mProgressLineHeight;
    private int mProgressLineMargin;
    private Paint mProgressLinePaint;
    private int mProgressLineWidth;
    private Paint mProgressMiddleLinePaint;
    private boolean mScrollStarted;
    private ScrollingListener mScrollingListener;
    private float mTotalScrollDistance;

    public interface ScrollingListener {
        void onScroll(float f10, float f11);

        void onScrollEnd();

        void onScrollStart();
    }

    public HorizontalProgressWheelView(Context context) {
        this(context, null);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCanvasClipBounds = new Rect();
        init();
    }

    @TargetApi(21)
    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mCanvasClipBounds = new Rect();
    }

    private void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51172, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mMiddleLineColor = d.f(getContext(), R.color.ucrop_color_widget_rotate_mid_line);
        this.mProgressLineWidth = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);
        this.mProgressLineHeight = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);
        this.mProgressLineMargin = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.mProgressLinePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mProgressLinePaint.setStrokeWidth(this.mProgressLineWidth);
        this.mProgressLinePaint.setColor(getResources().getColor(R.color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.mProgressLinePaint);
        this.mProgressMiddleLinePaint = paint2;
        paint2.setColor(this.mMiddleLineColor);
        this.mProgressMiddleLinePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressMiddleLinePaint.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }

    private void onScrollEvent(MotionEvent motionEvent, float f10) {
        if (PatchProxy.proxy(new Object[]{motionEvent, new Float(f10)}, this, changeQuickRedirect, false, 51171, new Class[]{MotionEvent.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mTotalScrollDistance -= f10;
        postInvalidate();
        this.mLastTouchedPosition = motionEvent.getX();
        ScrollingListener scrollingListener = this.mScrollingListener;
        if (scrollingListener != null) {
            scrollingListener.onScroll(-f10, this.mTotalScrollDistance);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51170, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        canvas.getClipBounds(this.mCanvasClipBounds);
        int iWidth = this.mCanvasClipBounds.width();
        int i10 = this.mProgressLineWidth;
        int i11 = this.mProgressLineMargin;
        int i12 = iWidth / (i10 + i11);
        float f10 = this.mTotalScrollDistance % (i11 + i10);
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i12 / 4;
            if (i13 < i14) {
                this.mProgressLinePaint.setAlpha((int) ((i13 / i14) * 255.0f));
            } else if (i13 > (i12 * 3) / 4) {
                this.mProgressLinePaint.setAlpha((int) (((i12 - i13) / i14) * 255.0f));
            } else {
                this.mProgressLinePaint.setAlpha(255);
            }
            float f11 = -f10;
            Rect rect = this.mCanvasClipBounds;
            float f12 = rect.left + f11 + ((this.mProgressLineWidth + this.mProgressLineMargin) * i13);
            float fCenterY = rect.centerY() - (this.mProgressLineHeight / 4.0f);
            Rect rect2 = this.mCanvasClipBounds;
            canvas.drawLine(f12, fCenterY, ((this.mProgressLineWidth + this.mProgressLineMargin) * i13) + f11 + rect2.left, rect2.centerY() + (this.mProgressLineHeight / 4.0f), this.mProgressLinePaint);
        }
        canvas.drawLine(this.mCanvasClipBounds.centerX(), this.mCanvasClipBounds.centerY() - (this.mProgressLineHeight / 2.0f), this.mCanvasClipBounds.centerX(), (this.mProgressLineHeight / 2.0f) + this.mCanvasClipBounds.centerY(), this.mProgressMiddleLinePaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 51169, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchedPosition = motionEvent.getX();
        } else if (action == 1) {
            ScrollingListener scrollingListener = this.mScrollingListener;
            if (scrollingListener != null) {
                this.mScrollStarted = false;
                scrollingListener.onScrollEnd();
            }
        } else if (action == 2) {
            float x10 = motionEvent.getX() - this.mLastTouchedPosition;
            if (x10 != 0.0f) {
                if (!this.mScrollStarted) {
                    this.mScrollStarted = true;
                    ScrollingListener scrollingListener2 = this.mScrollingListener;
                    if (scrollingListener2 != null) {
                        scrollingListener2.onScrollStart();
                    }
                }
                onScrollEvent(motionEvent, x10);
            }
        }
        return true;
    }

    public void setMiddleLineColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51168, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mMiddleLineColor = i10;
        this.mProgressMiddleLinePaint.setColor(i10);
        invalidate();
    }

    public void setScrollingListener(ScrollingListener scrollingListener) {
        this.mScrollingListener = scrollingListener;
    }
}
