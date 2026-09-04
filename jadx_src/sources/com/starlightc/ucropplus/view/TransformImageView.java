package com.starlightc.ucropplus.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.f0;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.callback.BitmapLoadCallback;
import com.starlightc.ucropplus.callback.SimpleAction;
import com.starlightc.ucropplus.model.ExifInfo;
import com.starlightc.ucropplus.model.ImageFilterInfo;
import com.starlightc.ucropplus.util.BitmapLoadUtils;
import com.starlightc.ucropplus.util.FastBitmapDrawable;
import com.starlightc.ucropplus.util.RectUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class TransformImageView extends AppCompatImageView {
    private static final int MATRIX_VALUES_COUNT = 9;
    private static final int RECT_CENTER_POINT_COORDS = 2;
    private static final int RECT_CORNER_POINTS_COORDS = 8;
    private static final String TAG = "TransformImageView";
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean enableFilter;
    public ImageFilterInfo filter;
    public boolean isRatioChecked;
    public boolean isReload;
    protected boolean mBitmapDecoded;
    protected boolean mBitmapLaidOut;
    protected final float[] mCurrentImageCenter;
    protected final float[] mCurrentImageCorners;
    public Matrix mCurrentImageMatrix;
    private ExifInfo mExifInfo;
    private String mImageInputPath;
    private Uri mImageInputUri;
    private String mImageOutputPath;
    private Uri mImageOutputUri;
    private float[] mInitialImageCenter;
    private float[] mInitialImageCorners;
    private final float[] mMatrixValues;
    private int mMaxBitmapSize;
    protected int mThisHeight;
    protected int mThisWidth;
    protected TransformImageListener mTransformImageListener;
    private Bitmap originBitmap;
    private SimpleAction ratioCheckAction;
    protected Handler uiHandler;

    public interface TransformImageListener {
        void onLoadComplete();

        void onLoadFailure(@n0 Exception exc);

        void onRotate(float f10);

        void onScale(float f10);
    }

    public TransformImageView(Context context) {
        this(context, null);
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCurrentImageCorners = new float[8];
        this.mCurrentImageCenter = new float[2];
        this.mMatrixValues = new float[9];
        this.mCurrentImageMatrix = new Matrix();
        this.mBitmapDecoded = false;
        this.mBitmapLaidOut = false;
        this.isRatioChecked = false;
        this.isReload = false;
        this.filter = null;
        this.enableFilter = true;
        this.mMaxBitmapSize = 0;
        this.ratioCheckAction = null;
        this.uiHandler = new Handler(Looper.getMainLooper());
        init();
    }

    static /* synthetic */ void access$600(TransformImageView transformImageView, View view) {
        if (PatchProxy.proxy(new Object[]{transformImageView, view}, null, changeQuickRedirect, true, 51138, new Class[]{TransformImageView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        transformImageView.safeRequestLayout(view);
    }

    private Bitmap getImgFromAssets(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 51137, new Class[]{String.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            return BitmapFactory.decodeStream(getResources().getAssets().open(str));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private boolean isSafeToRequestDirectly(View view) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 51115, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (view.isInLayout()) {
            return !view.isLayoutRequested();
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        return !z10;
    }

    @k0
    private void safeRequestLayout(final View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 51116, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (isSafeToRequestDirectly(view)) {
            view.requestLayout();
        } else {
            Objects.requireNonNull(view);
            post(new Runnable() { // from class: com.starlightc.ucropplus.view.c
                @Override // java.lang.Runnable
                public final void run() {
                    view.requestLayout();
                }
            });
        }
    }

    private void updateCurrentImagePoints() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51136, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCorners, this.mInitialImageCorners);
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCenter, this.mInitialImageCenter);
    }

    public float getCurrentAngle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51124, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : getMatrixAngle(this.mCurrentImageMatrix);
    }

    public Matrix getCurrentImageMatrix() {
        return this.mCurrentImageMatrix;
    }

    public float getCurrentScale() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51121, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : getMatrixScale(this.mCurrentImageMatrix);
    }

    public ExifInfo getExifInfo() {
        return this.mExifInfo;
    }

    public int getFilterType() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51119, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ImageFilterInfo imageFilterInfo = this.filter;
        if (imageFilterInfo == null) {
            return -1;
        }
        return imageFilterInfo.getType();
    }

    public String getImageInputPath() {
        return this.mImageInputPath;
    }

    public Uri getImageInputUri() {
        return this.mImageInputUri;
    }

    public String getImageOutputPath() {
        return this.mImageOutputPath;
    }

    public Uri getImageOutputUri() {
        return this.mImageOutputUri;
    }

    public float getMatrixAngle(@n0 Matrix matrix) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, 51125, new Class[]{Matrix.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) (-(Math.atan2(getMatrixValue(matrix, 1), getMatrixValue(matrix, 0)) * 57.29577951308232d));
    }

    public float getMatrixScale(@n0 Matrix matrix) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, 51123, new Class[]{Matrix.class}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (float) Math.sqrt(Math.pow(getMatrixValue(matrix, 0), 2.0d) + Math.pow(getMatrixValue(matrix, 3), 2.0d));
    }

    public float getMatrixValue(@n0 Matrix matrix, @f0(from = 0, to = 9) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matrix, new Integer(i10)}, this, changeQuickRedirect, false, 51134, new Class[]{Matrix.class, Integer.TYPE}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i10];
    }

    public int getMaxBitmapSize() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51111, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (this.mMaxBitmapSize <= 0) {
            this.mMaxBitmapSize = BitmapLoadUtils.calculateMaxBitmapSize(getContext());
        }
        return this.mMaxBitmapSize;
    }

    @p0
    public Bitmap getViewBitmap() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51127, new Class[0], Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (getDrawable() == null || !(getDrawable() instanceof FastBitmapDrawable)) {
            return null;
        }
        return ((FastBitmapDrawable) getDrawable()).getBitmap();
    }

    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51131, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void onImageLaidOut() {
        Drawable drawable;
        SimpleAction simpleAction;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51133, new Class[0], Void.TYPE).isSupported || (drawable = getDrawable()) == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d(TAG, String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        RectUtil rectUtil = RectUtil.INSTANCE;
        this.mInitialImageCorners = rectUtil.getCornersFromRect(rectF);
        this.mInitialImageCenter = rectUtil.getCenterFromRect(rectF);
        this.mBitmapLaidOut = true;
        if (this.isReload) {
            this.isReload = false;
        }
        if (!this.isRatioChecked && (simpleAction = this.ratioCheckAction) != null && intrinsicWidth != 0.0f) {
            simpleAction.doAction(Float.valueOf(intrinsicWidth / intrinsicHeight));
            this.isRatioChecked = true;
        }
        TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onLoadComplete();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51132, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.mBitmapDecoded && !this.mBitmapLaidOut)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            onImageLaidOut();
        }
    }

    public void postRotate(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51130, new Class[]{cls, cls, cls}, Void.TYPE).isSupported || f10 == 0.0f) {
            return;
        }
        this.mCurrentImageMatrix.postRotate(f10, f11, f12);
        setImageMatrix(this.mCurrentImageMatrix);
        TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onRotate(getMatrixAngle(this.mCurrentImageMatrix));
        }
    }

    public void postScale(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51129, new Class[]{cls, cls, cls}, Void.TYPE).isSupported || f10 == 0.0f) {
            return;
        }
        this.mCurrentImageMatrix.postScale(f10, f10, f11, f12);
        setImageMatrix(this.mCurrentImageMatrix);
        TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onScale(getMatrixScale(this.mCurrentImageMatrix));
        }
    }

    public void postTranslate(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 51128, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.mCurrentImageMatrix.postTranslate(f10, f11);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void printMatrix(@n0 String str, @n0 Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{str, matrix}, this, changeQuickRedirect, false, 51135, new Class[]{String.class, Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d(TAG, str + ": matrix: { x: " + getMatrixValue(matrix, 2) + ", y: " + getMatrixValue(matrix, 5) + ", scale: " + getMatrixScale(matrix) + ", angle: " + getMatrixAngle(matrix) + " }");
    }

    public void refreshFromCacheUri() throws Exception {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51120, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.isReload = true;
        Uri uri = this.mImageOutputUri;
        setImageUri(uri, uri);
    }

    public void reset() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51122, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mCurrentImageMatrix.reset();
        this.mBitmapDecoded = false;
        this.mBitmapLaidOut = false;
    }

    public void setFilter(ImageFilterInfo imageFilterInfo) {
        if (PatchProxy.proxy(new Object[]{imageFilterInfo}, this, changeQuickRedirect, false, 51117, new Class[]{ImageFilterInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        setFilter(imageFilterInfo, false);
    }

    public void setFilter(ImageFilterInfo imageFilterInfo, boolean z10) {
        if (PatchProxy.proxy(new Object[]{imageFilterInfo, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51118, new Class[]{ImageFilterInfo.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageFilterInfo imageFilterInfo2 = this.filter;
        if (imageFilterInfo2 == null || z10) {
            if (imageFilterInfo != null) {
                this.filter = imageFilterInfo;
                try {
                    refreshFromCacheUri();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            return;
        }
        if (imageFilterInfo == null || imageFilterInfo2.getType() != imageFilterInfo.getType()) {
            this.filter = imageFilterInfo;
            try {
                refreshFromCacheUri();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 51112, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        setImageDrawable(new FastBitmapDrawable(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, 51126, new Class[]{Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageMatrix(matrix);
        this.mCurrentImageMatrix.set(matrix);
        updateCurrentImagePoints();
    }

    public void setImageUri(@n0 Uri uri, @p0 Uri uri2) throws Exception {
        if (PatchProxy.proxy(new Object[]{uri, uri2}, this, changeQuickRedirect, false, 51114, new Class[]{Uri.class, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        int maxBitmapSize = getMaxBitmapSize();
        BitmapLoadUtils.decodeBitmapInBackground(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new BitmapLoadCallback() { // from class: com.starlightc.ucropplus.view.TransformImageView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.callback.BitmapLoadCallback
            public void onBitmapLoaded(@n0 Bitmap bitmap, @n0 ExifInfo exifInfo, @n0 Uri uri3, @p0 Uri uri4) {
                if (PatchProxy.proxy(new Object[]{bitmap, exifInfo, uri3, uri4}, this, changeQuickRedirect, false, 51141, new Class[]{Bitmap.class, ExifInfo.class, Uri.class, Uri.class}, Void.TYPE).isSupported) {
                    return;
                }
                TransformImageView.this.mImageInputUri = uri3;
                TransformImageView.this.mImageOutputUri = uri4;
                TransformImageView.this.mImageInputPath = uri3.getPath();
                TransformImageView.this.mImageOutputPath = uri4 != null ? uri4.getPath() : null;
                TransformImageView.this.mExifInfo = exifInfo;
                TransformImageView transformImageView = TransformImageView.this;
                transformImageView.mBitmapDecoded = true;
                transformImageView.originBitmap = bitmap;
                TransformImageView.this.mCurrentImageMatrix.reset();
                TransformImageView.this.setImageBitmap(bitmap);
                TransformImageView transformImageView2 = TransformImageView.this;
                TransformImageView.access$600(transformImageView2, transformImageView2);
            }

            @Override // com.starlightc.ucropplus.callback.BitmapLoadCallback
            public void onFailure(@n0 Exception exc) {
                if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 51142, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                    return;
                }
                Log.e(TransformImageView.TAG, "onFailure: setImageUri", exc);
                TransformImageListener transformImageListener = TransformImageView.this.mTransformImageListener;
                if (transformImageListener != null) {
                    transformImageListener.onLoadFailure(exc);
                }
            }
        });
    }

    public void setImageUriWithCallBack(@n0 Uri uri, @p0 Uri uri2, final BitmapLoadCallback bitmapLoadCallback) throws Exception {
        if (PatchProxy.proxy(new Object[]{uri, uri2, bitmapLoadCallback}, this, changeQuickRedirect, false, 51113, new Class[]{Uri.class, Uri.class, BitmapLoadCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        int maxBitmapSize = getMaxBitmapSize();
        BitmapLoadUtils.decodeBitmapInBackground(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new BitmapLoadCallback() { // from class: com.starlightc.ucropplus.view.TransformImageView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.callback.BitmapLoadCallback
            public void onBitmapLoaded(@n0 Bitmap bitmap, @n0 ExifInfo exifInfo, @n0 Uri uri3, @p0 Uri uri4) {
                if (PatchProxy.proxy(new Object[]{bitmap, exifInfo, uri3, uri4}, this, changeQuickRedirect, false, 51139, new Class[]{Bitmap.class, ExifInfo.class, Uri.class, Uri.class}, Void.TYPE).isSupported) {
                    return;
                }
                TransformImageView.this.mImageInputUri = uri3;
                TransformImageView.this.mImageOutputUri = uri4;
                TransformImageView.this.mImageInputPath = uri3.getPath();
                TransformImageView.this.mImageOutputPath = uri4 != null ? uri4.getPath() : null;
                TransformImageView.this.mExifInfo = exifInfo;
                TransformImageView transformImageView = TransformImageView.this;
                transformImageView.mBitmapDecoded = true;
                transformImageView.originBitmap = bitmap;
                TransformImageView.this.setImageBitmap(bitmap);
                TransformImageView transformImageView2 = TransformImageView.this;
                TransformImageView.access$600(transformImageView2, transformImageView2);
                bitmapLoadCallback.onBitmapLoaded(bitmap, exifInfo, uri3, uri4);
            }

            @Override // com.starlightc.ucropplus.callback.BitmapLoadCallback
            public void onFailure(@n0 Exception exc) {
                if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 51140, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                    return;
                }
                Log.e(TransformImageView.TAG, "onFailure: setImageUri", exc);
                TransformImageListener transformImageListener = TransformImageView.this.mTransformImageListener;
                if (transformImageListener != null) {
                    transformImageListener.onLoadFailure(exc);
                }
                bitmapLoadCallback.onFailure(exc);
            }
        });
    }

    public void setMaxBitmapSize(int i10) {
        this.mMaxBitmapSize = i10;
    }

    public void setRatioCheckAction(SimpleAction simpleAction) {
        this.ratioCheckAction = simpleAction;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (PatchProxy.proxy(new Object[]{scaleType}, this, changeQuickRedirect, false, 51110, new Class[]{ImageView.ScaleType.class}, Void.TYPE).isSupported) {
            return;
        }
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w(TAG, "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(TransformImageListener transformImageListener) {
        this.mTransformImageListener = transformImageListener;
    }
}
