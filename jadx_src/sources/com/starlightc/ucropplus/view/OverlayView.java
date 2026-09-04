package com.starlightc.ucropplus.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.f0;
import androidx.annotation.l;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.callback.OverlayViewChangeListener;
import com.starlightc.ucropplus.util.RectUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_CENTER_TOUCH_THROUGH = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isShowCropLayer;
    private OverlayViewChangeListener mCallback;
    private boolean mCircleDimmedLayer;
    private Path mCircularPath;
    private Paint mCropFrameCornersPaint;
    private Paint mCropFramePaint;
    protected float[] mCropGridCenter;
    private int mCropGridColumnCount;
    protected float[] mCropGridCorners;
    private Paint mCropGridPaint;
    private int mCropGridRowCount;
    private int mCropRectCornerTouchAreaLineLength;
    private int mCropRectMinSize;
    private final RectF mCropViewRect;
    private int mCurrentTouchCornerIndex;
    private int mDimmedColor;
    private Paint mDimmedStrokePaint;
    private int mFreestyleCropMode;
    private float[] mGridPoints;
    private float mPreviousTouchX;
    private float mPreviousTouchY;
    private boolean mShouldSetupCropBounds;
    private boolean mShowCropFrame;
    private boolean mShowCropGrid;
    private float mTargetAspectRatio;
    private final RectF mTempRect;
    protected int mThisHeight;
    protected int mThisWidth;
    private int mTouchPointThreshold;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCropViewRect = new RectF();
        this.mTempRect = new RectF();
        this.mGridPoints = null;
        this.mCircularPath = new Path();
        this.mDimmedStrokePaint = new Paint(1);
        this.mCropGridPaint = new Paint(1);
        this.mCropFramePaint = new Paint(1);
        this.mCropFrameCornersPaint = new Paint(1);
        this.mFreestyleCropMode = 0;
        this.mPreviousTouchX = -1.0f;
        this.mPreviousTouchY = -1.0f;
        this.mCurrentTouchCornerIndex = -1;
        this.isShowCropLayer = true;
        this.mTouchPointThreshold = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.mCropRectMinSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.mCropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        init();
    }

    private int getCurrentTouchIndex(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51048, new Class[]{cls, cls}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = -1;
        double d10 = this.mTouchPointThreshold;
        for (int i11 = 0; i11 < 8; i11 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f10 - this.mCropGridCorners[i11], 2.0d) + Math.pow(f11 - this.mCropGridCorners[i11 + 1], 2.0d));
            if (dSqrt < d10) {
                i10 = i11 / 2;
                d10 = dSqrt;
            }
        }
        if (this.mFreestyleCropMode == 1 && i10 < 0 && this.mCropViewRect.contains(f10, f11)) {
            return 4;
        }
        return i10;
    }

    private void initCropFrameStyle(@n0 TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, 51052, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R.color.ucrop_color_default_crop_frame));
        this.mCropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.mCropFramePaint.setColor(color);
        this.mCropFramePaint.setStyle(Paint.Style.STROKE);
        this.mCropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.mCropFrameCornersPaint.setColor(color);
        this.mCropFrameCornersPaint.setStyle(Paint.Style.STROKE);
    }

    private void initCropGridStyle(@n0 TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, 51053, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R.color.ucrop_color_default_crop_grid));
        this.mCropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.mCropGridPaint.setColor(color);
        this.mCropGridRowCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.mCropGridColumnCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTouchEvent$0(RectF rectF) {
        if (PatchProxy.proxy(new Object[]{rectF}, this, changeQuickRedirect, false, 51054, new Class[]{RectF.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mCropViewRect.set(rectF);
        updateGridPoints();
        invalidate();
    }

    private void updateCropViewRect(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51047, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.mTempRect.set(this.mCropViewRect);
        int i10 = this.mCurrentTouchCornerIndex;
        if (i10 == 0) {
            RectF rectF = this.mTempRect;
            RectF rectF2 = this.mCropViewRect;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i10 == 1) {
            RectF rectF3 = this.mTempRect;
            RectF rectF4 = this.mCropViewRect;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i10 == 2) {
            RectF rectF5 = this.mTempRect;
            RectF rectF6 = this.mCropViewRect;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i10 == 3) {
            RectF rectF7 = this.mTempRect;
            RectF rectF8 = this.mCropViewRect;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i10 == 4) {
            this.mTempRect.offset(f10 - this.mPreviousTouchX, f11 - this.mPreviousTouchY);
            if (this.mTempRect.left <= getLeft() || this.mTempRect.top <= getTop() || this.mTempRect.right >= getRight() || this.mTempRect.bottom >= getBottom()) {
                return;
            }
            this.mCropViewRect.set(this.mTempRect);
            updateGridPoints();
            postInvalidate();
            return;
        }
        boolean z10 = this.mTempRect.height() >= ((float) this.mCropRectMinSize);
        boolean z11 = this.mTempRect.width() >= ((float) this.mCropRectMinSize);
        RectF rectF9 = this.mCropViewRect;
        rectF9.set(z11 ? this.mTempRect.left : rectF9.left, z10 ? this.mTempRect.top : rectF9.top, z11 ? this.mTempRect.right : rectF9.right, z10 ? this.mTempRect.bottom : rectF9.bottom);
        if (z10 || z11) {
            updateGridPoints();
            postInvalidate();
        }
    }

    private void updateGridPoints() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51042, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RectUtil rectUtil = RectUtil.INSTANCE;
        this.mCropGridCorners = rectUtil.getCornersFromRect(this.mCropViewRect);
        this.mCropGridCenter = rectUtil.getCenterFromRect(this.mCropViewRect);
        this.mGridPoints = null;
        this.mCircularPath.reset();
        this.mCircularPath.addCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, Path.Direction.CW);
    }

    public void drawCropGrid(@n0 Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51050, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.mShowCropGrid) {
            if (this.mGridPoints == null && !this.mCropViewRect.isEmpty()) {
                this.mGridPoints = new float[(this.mCropGridRowCount * 4) + (this.mCropGridColumnCount * 4)];
                int i10 = 0;
                for (int i11 = 0; i11 < this.mCropGridRowCount; i11++) {
                    float[] fArr = this.mGridPoints;
                    int i12 = i10 + 1;
                    RectF rectF = this.mCropViewRect;
                    fArr[i10] = rectF.left;
                    int i13 = i12 + 1;
                    float f10 = i11 + 1.0f;
                    float fHeight = rectF.height() * (f10 / (this.mCropGridRowCount + 1));
                    RectF rectF2 = this.mCropViewRect;
                    fArr[i12] = fHeight + rectF2.top;
                    float[] fArr2 = this.mGridPoints;
                    int i14 = i13 + 1;
                    fArr2[i13] = rectF2.right;
                    i10 = i14 + 1;
                    fArr2[i14] = (rectF2.height() * (f10 / (this.mCropGridRowCount + 1))) + this.mCropViewRect.top;
                }
                for (int i15 = 0; i15 < this.mCropGridColumnCount; i15++) {
                    float[] fArr3 = this.mGridPoints;
                    int i16 = i10 + 1;
                    float f11 = i15 + 1.0f;
                    float fWidth = this.mCropViewRect.width() * (f11 / (this.mCropGridColumnCount + 1));
                    RectF rectF3 = this.mCropViewRect;
                    fArr3[i10] = fWidth + rectF3.left;
                    float[] fArr4 = this.mGridPoints;
                    int i17 = i16 + 1;
                    fArr4[i16] = rectF3.top;
                    int i18 = i17 + 1;
                    float fWidth2 = rectF3.width() * (f11 / (this.mCropGridColumnCount + 1));
                    RectF rectF4 = this.mCropViewRect;
                    fArr4[i17] = fWidth2 + rectF4.left;
                    i10 = i18 + 1;
                    this.mGridPoints[i18] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.mGridPoints;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.mCropGridPaint);
            }
        }
        if (this.mShowCropFrame) {
            canvas.drawRect(this.mCropViewRect, this.mCropFramePaint);
        }
        if (this.mFreestyleCropMode != 0) {
            canvas.save();
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(this.mCropRectCornerTouchAreaLineLength, 0.0f);
            canvas.clipRect(this.mTempRect, Region.Op.DIFFERENCE);
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(0.0f, this.mCropRectCornerTouchAreaLineLength);
            canvas.clipRect(this.mTempRect, Region.Op.DIFFERENCE);
            canvas.drawRect(this.mCropViewRect, this.mCropFrameCornersPaint);
            canvas.restore();
        }
    }

    public void drawDimmedLayer(@n0 Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51049, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.save();
        if (this.mCircleDimmedLayer) {
            canvas.clipPath(this.mCircularPath, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.mCropViewRect, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.mDimmedColor);
        canvas.restore();
        if (this.mCircleDimmedLayer) {
            canvas.drawCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, this.mDimmedStrokePaint);
        }
    }

    @n0
    public RectF getCropViewRect() {
        return this.mCropViewRect;
    }

    public int getFreestyleCropMode() {
        return this.mFreestyleCropMode;
    }

    public OverlayViewChangeListener getOverlayViewChangeListener() {
        return this.mCallback;
    }

    public void init() {
        boolean z10 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51043, new Class[0], Void.TYPE).isSupported;
    }

    @Deprecated
    public boolean isFreestyleCropEnabled() {
        return this.mFreestyleCropMode == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 51045, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        if (this.isShowCropLayer) {
            drawDimmedLayer(canvas);
            drawCropGrid(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51044, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            if (this.mShouldSetupCropBounds) {
                this.mShouldSetupCropBounds = false;
                setTargetAspectRatio(this.mTargetAspectRatio);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 51046, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.mCropViewRect.isEmpty() && this.mFreestyleCropMode != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int currentTouchIndex = getCurrentTouchIndex(x10, y10);
                this.mCurrentTouchCornerIndex = currentTouchIndex;
                boolean z10 = currentTouchIndex != -1;
                if (!z10) {
                    this.mPreviousTouchX = -1.0f;
                    this.mPreviousTouchY = -1.0f;
                } else if (this.mPreviousTouchX < 0.0f) {
                    this.mPreviousTouchX = x10;
                    this.mPreviousTouchY = y10;
                }
                return z10;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.mCurrentTouchCornerIndex != -1) {
                float fMin = Math.min(Math.max(x10, getPaddingLeft()), getWidth() - getPaddingRight());
                float fMin2 = Math.min(Math.max(y10, getPaddingTop()), getHeight() - getPaddingBottom());
                updateCropViewRect(fMin, fMin2);
                this.mPreviousTouchX = fMin;
                this.mPreviousTouchY = fMin2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.mPreviousTouchX = -1.0f;
                this.mPreviousTouchY = -1.0f;
                this.mCurrentTouchCornerIndex = -1;
                OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
                if (overlayViewChangeListener != null && this.mFreestyleCropMode == 2) {
                    overlayViewChangeListener.onCropRectUpdatedWithCropAreaResizeCallback(this.mCropViewRect, new OverlayViewChangeListener.CropAreaResizeCallback() { // from class: com.starlightc.ucropplus.view.b
                        @Override // com.starlightc.ucropplus.callback.OverlayViewChangeListener.CropAreaResizeCallback
                        public final void onCropAreaResize(RectF rectF) {
                            this.f98145a.lambda$onTouchEvent$0(rectF);
                        }
                    });
                } else if (overlayViewChangeListener != null) {
                    overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
                }
            }
        }
        return false;
    }

    public void processStyledAttributes(@n0 TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, 51051, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mCircleDimmedLayer = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R.color.ucrop_color_default_dimmed));
        this.mDimmedColor = color;
        this.mDimmedStrokePaint.setColor(color);
        this.mDimmedStrokePaint.setStyle(Paint.Style.STROKE);
        this.mDimmedStrokePaint.setStrokeWidth(1.0f);
        initCropFrameStyle(typedArray);
        this.mShowCropFrame = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_frame, true);
        initCropGridStyle(typedArray);
        this.mShowCropGrid = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.mCircleDimmedLayer = z10;
    }

    public void setCropFrameColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51038, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mCropFramePaint.setColor(i10);
    }

    public void setCropFrameStrokeWidth(@f0(from = 0) int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51036, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mCropFramePaint.setStrokeWidth(i10);
    }

    public void setCropGridColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51039, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mCropGridPaint.setColor(i10);
    }

    public void setCropGridColumnCount(@f0(from = 0) int i10) {
        this.mCropGridColumnCount = i10;
        this.mGridPoints = null;
    }

    public void setCropGridRowCount(@f0(from = 0) int i10) {
        this.mCropGridRowCount = i10;
        this.mGridPoints = null;
    }

    public void setCropGridStrokeWidth(@f0(from = 0) int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51037, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mCropGridPaint.setStrokeWidth(i10);
    }

    public void setDimmedColor(@l int i10) {
        this.mDimmedColor = i10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.mFreestyleCropMode = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 51034, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mFreestyleCropMode = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(OverlayViewChangeListener overlayViewChangeListener) {
        this.mCallback = overlayViewChangeListener;
    }

    public void setShowCropFrame(boolean z10) {
        this.mShowCropFrame = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.mShowCropGrid = z10;
    }

    public void setShowCropLayer(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51035, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.isShowCropLayer = z10;
        invalidate();
    }

    public void setTargetAspectRatio(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51040, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mTargetAspectRatio = f10;
        if (this.mThisWidth <= 0) {
            this.mShouldSetupCropBounds = true;
        } else {
            setupCropBounds();
            postInvalidate();
        }
    }

    public void setupCropBounds() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51041, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.mThisWidth;
        float f10 = this.mTargetAspectRatio;
        int i11 = (int) (i10 / f10);
        int i12 = this.mThisHeight;
        if (i11 > i12) {
            int i13 = (int) (i12 * f10);
            int i14 = (i10 - i13) / 2;
            this.mCropViewRect.set(getPaddingLeft() + i14, getPaddingTop(), getPaddingLeft() + i13 + i14, getPaddingTop() + this.mThisHeight);
        } else {
            int i15 = (i12 - i11) / 2;
            this.mCropViewRect.set(getPaddingLeft(), getPaddingTop() + i15, getPaddingLeft() + this.mThisWidth, getPaddingTop() + i11 + i15);
        }
        OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
        if (overlayViewChangeListener != null) {
            overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
        }
        updateGridPoints();
    }

    public void updateCropViewRect(RectF rectF) {
        if (PatchProxy.proxy(new Object[]{rectF}, this, changeQuickRedirect, false, 51033, new Class[]{RectF.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mCropViewRect.set(rectF);
    }
}
