package com.starlightc.ucropplus.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.exifinterface.media.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.callback.BitmapCropCallback;
import com.starlightc.ucropplus.model.CropParameters;
import com.starlightc.ucropplus.model.ExifInfo;
import com.starlightc.ucropplus.model.ImageState;
import com.starlightc.ucropplus.util.BitmapLoadUtils;
import com.starlightc.ucropplus.util.FileUtils;
import com.starlightc.ucropplus.util.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {
    private static final String CONTENT_SCHEME = "content";
    private static final String TAG = "BitmapCropTask";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int cropOffsetX;
    private int cropOffsetY;
    private final Bitmap.CompressFormat mCompressFormat;
    private final int mCompressQuality;
    private final WeakReference<Context> mContext;
    private final BitmapCropCallback mCropCallback;
    private final RectF mCropRect;
    private int mCroppedImageHeight;
    private int mCroppedImageWidth;
    private float mCurrentAngle;
    private final RectF mCurrentImageRect;
    private float mCurrentScale;
    private final ExifInfo mExifInfo;
    private final String mImageInputPath;
    private final Uri mImageInputUri;
    private final String mImageOutputPath;
    private final Uri mImageOutputUri;
    private final int mMaxResultImageSizeX;
    private final int mMaxResultImageSizeY;
    private Bitmap mViewBitmap;

    public BitmapCropTask(@n0 Context context, @p0 Bitmap bitmap, @n0 ImageState imageState, @n0 CropParameters cropParameters, @p0 BitmapCropCallback bitmapCropCallback) {
        this.mContext = new WeakReference<>(context);
        this.mViewBitmap = bitmap;
        this.mCropRect = imageState.getCropRect();
        this.mCurrentImageRect = imageState.getCurrentImageRect();
        this.mCurrentScale = imageState.getCurrentScale();
        this.mCurrentAngle = imageState.getCurrentAngle();
        this.mMaxResultImageSizeX = cropParameters.getMaxResultImageSizeX();
        this.mMaxResultImageSizeY = cropParameters.getMaxResultImageSizeY();
        this.mCompressFormat = cropParameters.getCompressFormat();
        this.mCompressQuality = cropParameters.getCompressQuality();
        this.mImageInputPath = cropParameters.getImageInputPath();
        this.mImageOutputPath = cropParameters.getImageOutputPath();
        this.mImageInputUri = cropParameters.getContentImageInputUri();
        this.mImageOutputUri = cropParameters.getContentImageOutputUri();
        this.mExifInfo = cropParameters.getExifInfo();
        this.mCropCallback = bitmapCropCallback;
    }

    private void copyExifForOutputFile(Context context) throws Throwable {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50253, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zHasContentScheme = BitmapLoadUtils.hasContentScheme(this.mImageInputUri);
        boolean zHasContentScheme2 = BitmapLoadUtils.hasContentScheme(this.mImageOutputUri);
        if (zHasContentScheme && zHasContentScheme2) {
            ImageHeaderParser.copyExif(context, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageInputUri, this.mImageOutputUri);
            return;
        }
        if (zHasContentScheme) {
            ImageHeaderParser.copyExif(context, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageInputUri, this.mImageOutputPath);
        } else if (zHasContentScheme2) {
            ImageHeaderParser.copyExif(context, new a(this.mImageInputPath), this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputUri);
        } else {
            ImageHeaderParser.copyExif(new a(this.mImageInputPath), this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputPath);
        }
    }

    private boolean crop() throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50252, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Context context = this.mContext.get();
        if (context == null) {
            return false;
        }
        if (this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0) {
            float fWidth = this.mCropRect.width() / this.mCurrentScale;
            float fHeight = this.mCropRect.height() / this.mCurrentScale;
            int i10 = this.mMaxResultImageSizeX;
            if (fWidth > i10 || fHeight > this.mMaxResultImageSizeY) {
                float fMin = Math.min(i10 / fWidth, this.mMaxResultImageSizeY / fHeight);
                Bitmap bitmap = this.mViewBitmap;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * fMin), Math.round(this.mViewBitmap.getHeight() * fMin), false);
                Bitmap bitmap2 = this.mViewBitmap;
                if (bitmap2 != bitmapCreateScaledBitmap) {
                    bitmap2.recycle();
                }
                this.mViewBitmap = bitmapCreateScaledBitmap;
                this.mCurrentScale /= fMin;
            }
        }
        if (this.mCurrentAngle != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.mCurrentAngle, this.mViewBitmap.getWidth() / 2, this.mViewBitmap.getHeight() / 2);
            Bitmap bitmap3 = this.mViewBitmap;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.mViewBitmap.getHeight(), matrix, true);
            Bitmap bitmap4 = this.mViewBitmap;
            if (bitmap4 != bitmapCreateBitmap) {
                bitmap4.recycle();
            }
            this.mViewBitmap = bitmapCreateBitmap;
        }
        this.cropOffsetX = Math.round((this.mCropRect.left - this.mCurrentImageRect.left) / this.mCurrentScale);
        this.cropOffsetY = Math.round((this.mCropRect.top - this.mCurrentImageRect.top) / this.mCurrentScale);
        this.mCroppedImageWidth = Math.round(this.mCropRect.width() / this.mCurrentScale);
        int iRound = Math.round(this.mCropRect.height() / this.mCurrentScale);
        this.mCroppedImageHeight = iRound;
        boolean zShouldCrop = shouldCrop(this.mCroppedImageWidth, iRound);
        Log.i(TAG, "Should crop: " + zShouldCrop);
        if (!zShouldCrop) {
            FileUtils.copyFile(context, this.mImageInputUri, this.mImageOutputUri);
            return false;
        }
        saveImage(Bitmap.createBitmap(this.mViewBitmap, this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight));
        if (!this.mCompressFormat.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        copyExifForOutputFile(context);
        return true;
    }

    private void saveImage(@n0 Bitmap bitmap) throws Throwable {
        Context context;
        ByteArrayOutputStream byteArrayOutputStream;
        if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 50254, new Class[]{Bitmap.class}, Void.TYPE).isSupported || (context = this.mContext.get()) == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(this.mImageOutputUri);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(this.mCompressFormat, this.mCompressQuality, byteArrayOutputStream);
                    outputStreamOpenOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    BitmapLoadUtils.close(outputStreamOpenOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = outputStreamOpenOutputStream;
                    try {
                        Log.e(TAG, e.getLocalizedMessage());
                        BitmapLoadUtils.close(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        BitmapLoadUtils.close(outputStream);
                        BitmapLoadUtils.close(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = outputStreamOpenOutputStream;
                    BitmapLoadUtils.close(outputStream);
                    BitmapLoadUtils.close(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
        BitmapLoadUtils.close(byteArrayOutputStream);
    }

    private boolean shouldCrop(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50255, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int iRound = Math.round(Math.max(i10, i11) / 1000.0f) + 1;
        if (this.mMaxResultImageSizeX <= 0 || this.mMaxResultImageSizeY <= 0) {
            float f10 = iRound;
            if (Math.abs(this.mCropRect.left - this.mCurrentImageRect.left) <= f10 && Math.abs(this.mCropRect.top - this.mCurrentImageRect.top) <= f10 && Math.abs(this.mCropRect.bottom - this.mCurrentImageRect.bottom) <= f10 && Math.abs(this.mCropRect.right - this.mCurrentImageRect.right) <= f10 && this.mCurrentAngle == 0.0f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.Throwable] */
    @Override // android.os.AsyncTask
    @p0
    public /* bridge */ /* synthetic */ Throwable doInBackground(Void[] voidArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voidArr}, this, changeQuickRedirect, false, 50258, new Class[]{Object[].class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : doInBackground2(voidArr);
    }

    @p0
    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public Throwable doInBackground2(Void... voidArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voidArr}, this, changeQuickRedirect, false, 50251, new Class[]{Void[].class}, Throwable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Throwable) patchProxyResultProxy.result;
        }
        Bitmap bitmap = this.mViewBitmap;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.mCurrentImageRect.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.mImageOutputUri == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            crop();
            this.mViewBitmap = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(@p0 Throwable th2) {
        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 50257, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        onPostExecute2(th2);
    }

    /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    public void onPostExecute2(@p0 Throwable th2) {
        BitmapCropCallback bitmapCropCallback;
        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 50256, new Class[]{Throwable.class}, Void.TYPE).isSupported || (bitmapCropCallback = this.mCropCallback) == null) {
            return;
        }
        if (th2 == null) {
            this.mCropCallback.onBitmapCropped(BitmapLoadUtils.hasContentScheme(this.mImageOutputUri) ? this.mImageOutputUri : Uri.fromFile(new File(this.mImageOutputPath)), this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight);
        } else {
            bitmapCropCallback.onCropFailure(th2);
        }
    }
}
