package com.starlightc.ucropplus.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.callback.BitmapCropCallback;
import com.starlightc.ucropplus.callback.CropBoundsChangeListener;
import com.starlightc.ucropplus.callback.OverlayViewChangeListener;
import com.starlightc.ucropplus.model.CropParameters;
import com.starlightc.ucropplus.model.ImageState;
import com.starlightc.ucropplus.task.BitmapCropTask;
import com.starlightc.ucropplus.util.CubicEasing;
import com.starlightc.ucropplus.util.RectUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class CropImageView extends TransformImageView {
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;
    public static final int DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = 500;
    public static final int DEFAULT_MAX_BITMAP_SIZE = 0;
    public static final float DEFAULT_MAX_SCALE_MULTIPLIER = 10.0f;
    public static final float SOURCE_IMAGE_ASPECT_RATIO = 0.0f;
    public static ChangeQuickRedirect changeQuickRedirect;
    private CropBoundsChangeListener mCropBoundsChangeListener;
    private final RectF mCropRect;
    private long mImageToWrapCropBoundsAnimDuration;
    private int mMaxResultImageSizeX;
    private int mMaxResultImageSizeY;
    private float mMaxScale;
    private float mMaxScaleMultiplier;
    private float mMinScale;
    private float mTargetAspectRatio;
    private final Matrix mTempMatrix;
    private Runnable mWrapCropBoundsRunnable;
    private Runnable mZoomImageToPositionRunnable;

    public static class WrapCropBoundsRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final float mCenterDiffX;
        private final float mCenterDiffY;
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final long mDurationMs;
        private final float mOldScale;
        private final float mOldX;
        private final float mOldY;
        private final long mStartTime = System.currentTimeMillis();
        private final boolean mWillBeImageInBoundsAfterTranslate;

        public WrapCropBoundsRunnable(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j10;
            this.mOldX = f10;
            this.mOldY = f11;
            this.mCenterDiffX = f12;
            this.mCenterDiffY = f13;
            this.mOldScale = f14;
            this.mDeltaScale = f15;
            this.mWillBeImageInBoundsAfterTranslate = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51022, new Class[0], Void.TYPE).isSupported || (cropImageView = this.mCropImageView.get()) == null) {
                return;
            }
            float fMin = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float fEaseOut = CubicEasing.easeOut(fMin, 0.0f, this.mCenterDiffX, this.mDurationMs);
            float fEaseOut2 = CubicEasing.easeOut(fMin, 0.0f, this.mCenterDiffY, this.mDurationMs);
            float fEaseInOut = CubicEasing.easeInOut(fMin, 0.0f, this.mDeltaScale, this.mDurationMs);
            if (fMin < this.mDurationMs) {
                float[] fArr = cropImageView.mCurrentImageCenter;
                cropImageView.postTranslate(fEaseOut - (fArr[0] - this.mOldX), fEaseOut2 - (fArr[1] - this.mOldY));
                if (!this.mWillBeImageInBoundsAfterTranslate) {
                    cropImageView.zoomInImage(this.mOldScale + fEaseInOut, cropImageView.mCropRect.centerX(), cropImageView.mCropRect.centerY());
                }
                if (cropImageView.isImageWrapCropBounds()) {
                    return;
                }
                cropImageView.post(this);
            }
        }
    }

    public static class WrapImageRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final float mCenterDiffX;
        private final float mCenterDiffY;
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final long mDurationMs;
        private final float mOldScale;
        private final float mOldX;
        private final float mOldY;
        private final long mStartTime = System.currentTimeMillis();
        private final boolean mWillBeImageInBoundsAfterTranslate;

        public WrapImageRunnable(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j10;
            this.mOldX = f10;
            this.mOldY = f11;
            this.mCenterDiffX = f12;
            this.mCenterDiffY = f13;
            this.mOldScale = f14;
            this.mDeltaScale = f15;
            this.mWillBeImageInBoundsAfterTranslate = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51023, new Class[0], Void.TYPE).isSupported || (cropImageView = this.mCropImageView.get()) == null) {
                return;
            }
            float fMin = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float fEaseOut = CubicEasing.easeOut(fMin, 0.0f, this.mCenterDiffX, this.mDurationMs);
            float fEaseOut2 = CubicEasing.easeOut(fMin, 0.0f, this.mCenterDiffY, this.mDurationMs);
            float fEaseInOut = CubicEasing.easeInOut(fMin, 0.0f, this.mDeltaScale, this.mDurationMs);
            if (fMin < this.mDurationMs) {
                float[] fArr = cropImageView.mCurrentImageCenter;
                cropImageView.postTranslate(fEaseOut - (fArr[0] - this.mOldX), fEaseOut2 - (fArr[1] - this.mOldY));
                if (!this.mWillBeImageInBoundsAfterTranslate) {
                    cropImageView.zoomInImage(this.mOldScale + fEaseInOut, cropImageView.mCropRect.centerX(), cropImageView.mCropRect.centerY());
                }
                if (cropImageView.isCropBoundsWrapImage()) {
                    return;
                }
                cropImageView.post(this);
            }
        }
    }

    public static class ZoomImageToPosition implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final float mDestX;
        private final float mDestY;
        private final long mDurationMs;
        private final float mOldScale;
        private final long mStartTime = System.currentTimeMillis();

        public ZoomImageToPosition(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j10;
            this.mOldScale = f10;
            this.mDeltaScale = f11;
            this.mDestX = f12;
            this.mDestY = f13;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51024, new Class[0], Void.TYPE).isSupported || (cropImageView = this.mCropImageView.get()) == null) {
                return;
            }
            float fMin = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float fEaseInOut = CubicEasing.easeInOut(fMin, 0.0f, this.mDeltaScale, this.mDurationMs);
            if (fMin >= this.mDurationMs) {
                cropImageView.setImageToWrapCropBounds();
            } else {
                cropImageView.zoomInImage(this.mOldScale + fEaseInOut, this.mDestX, this.mDestY);
                cropImageView.post(this);
            }
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCropRect = new RectF();
        this.mTempMatrix = new Matrix();
        this.mMaxScaleMultiplier = 10.0f;
        this.mZoomImageToPositionRunnable = null;
        this.mMaxResultImageSizeX = 0;
        this.mMaxResultImageSizeY = 0;
        this.mImageToWrapCropBoundsAnimDuration = 500L;
    }

    static /* synthetic */ void access$000(CropImageView cropImageView) {
        if (PatchProxy.proxy(new Object[]{cropImageView}, null, changeQuickRedirect, true, 51020, new Class[]{CropImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        cropImageView.calculateImageScaleBounds();
    }

    private float[] calculateImageIndents() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51008, new Class[0], float[].class);
        if (patchProxyResultProxy.isSupported) {
            return (float[]) patchProxyResultProxy.result;
        }
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] fArr = this.mCurrentImageCorners;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        RectUtil rectUtil = RectUtil.INSTANCE;
        float[] cornersFromRect = rectUtil.getCornersFromRect(this.mCropRect);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        this.mTempMatrix.mapPoints(cornersFromRect);
        RectF rectFTrapToRect = rectUtil.trapToRect(fArrCopyOf);
        RectF rectFTrapToRect2 = rectUtil.trapToRect(cornersFromRect);
        float f10 = rectFTrapToRect.left - rectFTrapToRect2.left;
        float f11 = rectFTrapToRect.top - rectFTrapToRect2.top;
        float f12 = rectFTrapToRect.right - rectFTrapToRect2.right;
        float f13 = rectFTrapToRect.bottom - rectFTrapToRect2.bottom;
        float[] fArr2 = new float[4];
        if (f10 <= 0.0f) {
            f10 = 0.0f;
        }
        fArr2[0] = f10;
        if (f11 <= 0.0f) {
            f11 = 0.0f;
        }
        fArr2[1] = f11;
        if (f12 >= 0.0f) {
            f12 = 0.0f;
        }
        fArr2[2] = f12;
        if (f13 >= 0.0f) {
            f13 = 0.0f;
        }
        fArr2[3] = f13;
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(getCurrentAngle());
        this.mTempMatrix.mapPoints(fArr2);
        return fArr2;
    }

    private void calculateImageScaleBounds() {
        Drawable drawable;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51015, new Class[0], Void.TYPE).isSupported || (drawable = getDrawable()) == null) {
            return;
        }
        calculateImageScaleBounds(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private void calculateImageScaleBounds(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51016, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        float fMin = Math.min(Math.min(this.mCropRect.width() / f10, this.mCropRect.width() / f11), Math.min(this.mCropRect.height() / f11, this.mCropRect.height() / f10));
        this.mMinScale = fMin;
        this.mMaxScale = fMin * this.mMaxScaleMultiplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCropRectWithResizeCropAreaCallback$0(float f10, float f11, float f12, float f13, float f14, Matrix matrix, Matrix matrix2, Matrix matrix3, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, OverlayViewChangeListener.CropAreaResizeCallback cropAreaResizeCallback, ValueAnimator valueAnimator) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14), matrix, matrix2, matrix3, rectF, rectF2, rectF3, rectF4, cropAreaResizeCallback, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51019, new Class[]{cls, cls, cls, cls, cls, Matrix.class, Matrix.class, Matrix.class, RectF.class, RectF.class, RectF.class, RectF.class, OverlayViewChangeListener.CropAreaResizeCallback.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f15 = f10 * animatedFraction;
        float f16 = f11 * animatedFraction;
        float f17 = ((f12 - 1.0f) * animatedFraction) + 1.0f;
        matrix.reset();
        matrix2.set(matrix3);
        rectF.set(rectF2);
        rectF3.set(rectF4);
        matrix.postTranslate(f15, f16);
        matrix.postScale(f17, f17, f13 + f15, f14 + f16);
        matrix2.postConcat(matrix);
        setImageMatrix(matrix2);
        matrix.mapRect(rectF3);
        this.mCropRect.set(rectF3);
        matrix.mapRect(rectF);
        cropAreaResizeCallback.onCropAreaResize(rectF);
        invalidate();
    }

    private void setupInitialImagePosition(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51017, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        float fWidth = this.mCropRect.width();
        float fHeight = this.mCropRect.height();
        float fMax = Math.max(this.mCropRect.width() / f10, this.mCropRect.height() / f11);
        RectF rectF = this.mCropRect;
        float f12 = ((fWidth - (f10 * fMax)) / 2.0f) + rectF.left;
        float f13 = ((fHeight - (f11 * fMax)) / 2.0f) + rectF.top;
        this.mCurrentImageMatrix.reset();
        this.mCurrentImageMatrix.postScale(fMax, fMax);
        this.mCurrentImageMatrix.postTranslate(f12, f13);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void cancelAllAnimations() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51003, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        removeCallbacks(this.mWrapCropBoundsRunnable);
        removeCallbacks(this.mZoomImageToPositionRunnable);
    }

    public void checkRatio() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50995, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setImageToWrapCropBounds();
    }

    public void cropAndSaveImage(@n0 Bitmap.CompressFormat compressFormat, int i10, @p0 BitmapCropCallback bitmapCropCallback) {
        if (PatchProxy.proxy(new Object[]{compressFormat, new Integer(i10), bitmapCropCallback}, this, changeQuickRedirect, false, 50991, new Class[]{Bitmap.CompressFormat.class, Integer.TYPE, BitmapCropCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        cancelAllAnimations();
        setImageToWrapCropBounds(false);
        ImageState imageState = new ImageState(this.mCropRect, RectUtil.INSTANCE.trapToRect(this.mCurrentImageCorners), getCurrentScale(), getCurrentAngle());
        CropParameters cropParameters = new CropParameters(this.mMaxResultImageSizeX, this.mMaxResultImageSizeY, compressFormat, i10, getImageInputPath(), getImageOutputPath(), getExifInfo());
        cropParameters.setContentImageInputUri(getImageInputUri());
        cropParameters.setContentImageOutputUri(getImageOutputUri());
        new BitmapCropTask(getContext(), getViewBitmap(), imageState, cropParameters, bitmapCropCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void fitCropBoundsAndImage() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51006, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (isImageWrapCropBounds()) {
            setCropBoundsFitImage(true);
        } else {
            setImageToWrapCropBounds();
        }
    }

    @p0
    public CropBoundsChangeListener getCropBoundsChangeListener() {
        return this.mCropBoundsChangeListener;
    }

    public RectF getCropRect() {
        return this.mCropRect;
    }

    public float getMaxScale() {
        return this.mMaxScale;
    }

    public float getMinScale() {
        return this.mMinScale;
    }

    public float getTargetAspectRatio() {
        return this.mTargetAspectRatio;
    }

    public int getmMaxResultImageSizeX() {
        return this.mMaxResultImageSizeX;
    }

    public int getmMaxResultImageSizeY() {
        return this.mMaxResultImageSizeY;
    }

    public boolean isCropBoundsWrapImage() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51012, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : isCropBoundsWrapImage(this.mCurrentImageCorners);
    }

    public boolean isCropBoundsWrapImage(float[] fArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fArr}, this, changeQuickRedirect, false, 51013, new Class[]{float[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        RectUtil rectUtil = RectUtil.INSTANCE;
        float[] cornersFromRect = rectUtil.getCornersFromRect(this.mCropRect);
        this.mTempMatrix.mapPoints(cornersFromRect);
        return rectUtil.trapToRect(cornersFromRect).contains(rectUtil.trapToRect(fArrCopyOf));
    }

    public boolean isImageWrapCropBounds() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51010, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : isImageWrapCropBounds(this.mCurrentImageCorners);
    }

    public boolean isImageWrapCropBounds(float[] fArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fArr}, this, changeQuickRedirect, false, 51011, new Class[]{float[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        RectUtil rectUtil = RectUtil.INSTANCE;
        float[] cornersFromRect = rectUtil.getCornersFromRect(this.mCropRect);
        this.mTempMatrix.mapPoints(cornersFromRect);
        return rectUtil.trapToRect(fArrCopyOf).contains(rectUtil.trapToRect(cornersFromRect));
    }

    @Override // com.starlightc.ucropplus.view.TransformImageView
    public void onImageLaidOut() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51009, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onImageLaidOut();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.mTargetAspectRatio == 0.0f) {
            this.mTargetAspectRatio = intrinsicWidth / intrinsicHeight;
        }
        int i10 = this.mThisWidth;
        float f10 = this.mTargetAspectRatio;
        int i11 = (int) (i10 / f10);
        int i12 = this.mThisHeight;
        if (i11 > i12) {
            int i13 = (int) (i12 * f10);
            int i14 = (i10 - i13) / 2;
            this.mCropRect.set(i14, 0.0f, i13 + i14, i12);
        } else {
            int i15 = (i12 - i11) / 2;
            this.mCropRect.set(0.0f, i15, i10, i11 + i15);
        }
        calculateImageScaleBounds(intrinsicWidth, intrinsicHeight);
        setupInitialImagePosition(intrinsicWidth, intrinsicHeight);
        CropBoundsChangeListener cropBoundsChangeListener = this.mCropBoundsChangeListener;
        if (cropBoundsChangeListener != null) {
            cropBoundsChangeListener.onCropAspectRatioChanged(this.mTargetAspectRatio);
        }
        TransformImageView.TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onScale(getCurrentScale());
            this.mTransformImageListener.onRotate(getCurrentAngle());
        }
    }

    public void postRotate(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51002, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        postRotate(f10, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    @Override // com.starlightc.ucropplus.view.TransformImageView
    public void postScale(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51001, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 > 1.0f && getCurrentScale() * f10 <= getMaxScale()) {
            super.postScale(f10, f11, f12);
        } else {
            if (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale()) {
                return;
            }
            super.postScale(f10, f11, f12);
        }
    }

    public void processStyledAttributes(@n0 TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, 51018, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        float fAbs = Math.abs(typedArray.getFloat(R.styleable.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float fAbs2 = Math.abs(typedArray.getFloat(R.styleable.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            this.mTargetAspectRatio = 0.0f;
        } else {
            this.mTargetAspectRatio = fAbs / fAbs2;
        }
    }

    public void setCropBoundsChangeListener(@p0 CropBoundsChangeListener cropBoundsChangeListener) {
        this.mCropBoundsChangeListener = cropBoundsChangeListener;
    }

    public void setCropBoundsFitImage(boolean z10) {
        float f10;
        float f11;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51007, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || !this.mBitmapLaidOut || isCropBoundsWrapImage()) {
            return;
        }
        float[] fArr = this.mCurrentImageCenter;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.mCropRect.centerX() - f12;
        float fCenterY = this.mCropRect.centerY() - f13;
        float fMax = 0.0f;
        this.mTempMatrix.reset();
        this.mTempMatrix.setTranslate(fCenterX, fCenterY);
        float[] fArr2 = this.mCurrentImageCorners;
        float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        boolean zIsCropBoundsWrapImage = isCropBoundsWrapImage(fArrCopyOf);
        if (zIsCropBoundsWrapImage) {
            float[] fArrCalculateImageIndents = calculateImageIndents();
            float f14 = -(fArrCalculateImageIndents[0] + fArrCalculateImageIndents[2]);
            f11 = -(fArrCalculateImageIndents[1] + fArrCalculateImageIndents[3]);
            f10 = f14;
        } else {
            RectF rectF = new RectF(this.mCropRect);
            this.mTempMatrix.reset();
            this.mTempMatrix.setRotate(getCurrentAngle());
            this.mTempMatrix.mapRect(rectF);
            float[] rectSidesFromCorners = RectUtil.INSTANCE.getRectSidesFromCorners(this.mCurrentImageCorners);
            fMax = (Math.max(rectF.width() / rectSidesFromCorners[0], rectF.height() / rectSidesFromCorners[1]) * currentScale) - currentScale;
            f10 = fCenterX;
            f11 = fCenterY;
        }
        float f15 = fMax;
        if (!z10) {
            postTranslate(f10, f11);
            zoomInImage(currentScale + f15, this.mCropRect.centerX(), this.mCropRect.centerY());
        } else {
            WrapImageRunnable wrapImageRunnable = new WrapImageRunnable(this, this.mImageToWrapCropBoundsAnimDuration, f12, f13, f10, f11, currentScale, f15, zIsCropBoundsWrapImage);
            this.mWrapCropBoundsRunnable = wrapImageRunnable;
            post(wrapImageRunnable);
        }
    }

    public void setCropRect(RectF rectF) {
        if (PatchProxy.proxy(new Object[]{rectF}, this, changeQuickRedirect, false, 50992, new Class[]{RectF.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mTargetAspectRatio = rectF.width() / rectF.height();
        this.mCropRect.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        calculateImageScaleBounds();
        setImageToWrapCropBounds();
    }

    public void setCropRectWithResizeCropAreaCallback(RectF rectF, final OverlayViewChangeListener.CropAreaResizeCallback cropAreaResizeCallback) {
        if (PatchProxy.proxy(new Object[]{rectF, cropAreaResizeCallback}, this, changeQuickRedirect, false, 50994, new Class[]{RectF.class, OverlayViewChangeListener.CropAreaResizeCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        RectF rectF2 = new RectF(rectF.left + getPaddingLeft(), rectF.top + getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        Rect rect = new Rect();
        getDrawingRect(rect);
        Rect rect2 = new Rect(rect.left + getPaddingLeft(), rect.top + getPaddingTop(), rect.right - getPaddingRight(), rect.bottom - getPaddingBottom());
        final float fMin = Math.min(rectF2.width() != 0.0f ? Math.abs(rect2.width()) / Math.abs(rectF2.width()) : 1.0f, rectF2.height() != 0.0f ? Math.abs(rect2.height()) / Math.abs(rectF2.height()) : 1.0f);
        final float fCenterX = rectF2.centerX();
        final float fCenterY = rectF2.centerY();
        final float fCenterX2 = rect2.centerX() - fCenterX;
        final float fCenterY2 = rect2.centerY() - fCenterY;
        final Matrix matrix = new Matrix();
        final RectF rectF3 = new RectF();
        final RectF rectF4 = new RectF(rectF);
        final Matrix matrix2 = new Matrix();
        final Matrix matrix3 = new Matrix(this.mCurrentImageMatrix);
        final RectF rectF5 = new RectF();
        final RectF rectF6 = new RectF(rectF2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.starlightc.ucropplus.view.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f98131b.lambda$setCropRectWithResizeCropAreaCallback$0(fCenterX2, fCenterY2, fMin, fCenterX, fCenterY, matrix, matrix2, matrix3, rectF3, rectF4, rectF5, rectF6, cropAreaResizeCallback, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.starlightc.ucropplus.view.CropImageView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@n0 Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@n0 Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 51021, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                    return;
                }
                CropImageView.access$000(CropImageView.this);
                CropImageView.this.setImageToWrapCropBounds();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@n0 Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@n0 Animator animator) {
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void setImageToWrapCropBounds() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51004, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z10) {
        float f10;
        float f11;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51005, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || !this.mBitmapLaidOut || isImageWrapCropBounds()) {
            return;
        }
        float[] fArr = this.mCurrentImageCenter;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.mCropRect.centerX() - f12;
        float fCenterY = this.mCropRect.centerY() - f13;
        float fMax = 0.0f;
        this.mTempMatrix.reset();
        this.mTempMatrix.setTranslate(fCenterX, fCenterY);
        float[] fArr2 = this.mCurrentImageCorners;
        float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        boolean zIsImageWrapCropBounds = isImageWrapCropBounds(fArrCopyOf);
        if (zIsImageWrapCropBounds) {
            float[] fArrCalculateImageIndents = calculateImageIndents();
            float f14 = -(fArrCalculateImageIndents[0] + fArrCalculateImageIndents[2]);
            f11 = -(fArrCalculateImageIndents[1] + fArrCalculateImageIndents[3]);
            f10 = f14;
        } else {
            RectF rectF = new RectF(this.mCropRect);
            this.mTempMatrix.reset();
            this.mTempMatrix.setRotate(getCurrentAngle());
            this.mTempMatrix.mapRect(rectF);
            float[] rectSidesFromCorners = RectUtil.INSTANCE.getRectSidesFromCorners(this.mCurrentImageCorners);
            fMax = (Math.max(rectF.width() / rectSidesFromCorners[0], rectF.height() / rectSidesFromCorners[1]) * currentScale) - currentScale;
            f10 = fCenterX;
            f11 = fCenterY;
        }
        float f15 = fMax;
        if (z10) {
            WrapCropBoundsRunnable wrapCropBoundsRunnable = new WrapCropBoundsRunnable(this, this.mImageToWrapCropBoundsAnimDuration, f12, f13, f10, f11, currentScale, f15, zIsImageWrapCropBounds);
            this.mWrapCropBoundsRunnable = wrapCropBoundsRunnable;
            post(wrapCropBoundsRunnable);
        } else {
            postTranslate(f10, f11);
            if (zIsImageWrapCropBounds) {
                return;
            }
            zoomInImage(currentScale + f15, this.mCropRect.centerX(), this.mCropRect.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(@f0(from = AndroidComposeViewAccessibilityDelegateCompat.F) long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 50996, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.mImageToWrapCropBoundsAnimDuration = j10;
    }

    public void setMaxResultImageSizeX(@f0(from = 10) int i10) {
        this.mMaxResultImageSizeX = i10;
    }

    public void setMaxResultImageSizeY(@f0(from = 10) int i10) {
        this.mMaxResultImageSizeY = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.mMaxScaleMultiplier = f10;
    }

    public void setTargetAspectRatio(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 50993, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.mTargetAspectRatio = f10;
            return;
        }
        if (f10 == 0.0f) {
            this.mTargetAspectRatio = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
            checkRatio();
        } else {
            this.mTargetAspectRatio = f10;
        }
        CropBoundsChangeListener cropBoundsChangeListener = this.mCropBoundsChangeListener;
        if (cropBoundsChangeListener != null) {
            cropBoundsChangeListener.onCropAspectRatioChanged(this.mTargetAspectRatio);
        }
    }

    public void zoomImageToPosition(float f10, float f11, float f12, long j10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51014, new Class[]{cls, cls, cls, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        ZoomImageToPosition zoomImageToPosition = new ZoomImageToPosition(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.mZoomImageToPositionRunnable = zoomImageToPosition;
        post(zoomImageToPosition);
    }

    public void zoomInImage(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 50999, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        zoomInImage(f10, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public void zoomInImage(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51000, new Class[]{cls, cls, cls}, Void.TYPE).isSupported && f10 <= getMaxScale()) {
            postScale(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void zoomOutImage(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 50997, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        zoomOutImage(f10, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public void zoomOutImage(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50998, new Class[]{cls, cls, cls}, Void.TYPE).isSupported && f10 >= getMinScale()) {
            postScale(f10 / getCurrentScale(), f11, f12);
        }
    }
}
