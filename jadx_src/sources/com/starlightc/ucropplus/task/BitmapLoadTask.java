package com.starlightc.ucropplus.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.OkHttpClientStore;
import com.starlightc.ucropplus.callback.BitmapLoadCallback;
import com.starlightc.ucropplus.model.ExifInfo;
import com.starlightc.ucropplus.util.BitmapLoadUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.z;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapLoadTask extends AsyncTask<Void, Void, BitmapWorkerResult> {
    private static final int MAX_BITMAP_SIZE = 104857600;
    private static final String TAG = "BitmapWorkerTask";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final WeakReference<Context> mContext;
    private Uri mInputUri;
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public static class BitmapWorkerResult {
        Bitmap mBitmapResult;
        Exception mBitmapWorkerException;
        ExifInfo mExifInfo;

        public BitmapWorkerResult(@n0 Bitmap bitmap, @n0 ExifInfo exifInfo) {
            this.mBitmapResult = bitmap;
            this.mExifInfo = exifInfo;
        }

        public BitmapWorkerResult(@n0 Exception exc) {
            this.mBitmapWorkerException = exc;
        }
    }

    public BitmapLoadTask(@n0 Context context, @n0 Uri uri, @p0 Uri uri2, int i10, int i11, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = new WeakReference<>(context);
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i10;
        this.mRequiredHeight = i11;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    private boolean checkSize(Bitmap bitmap, BitmapFactory.Options options) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, options}, this, changeQuickRedirect, false, 50263, new Class[]{Bitmap.class, BitmapFactory.Options.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    private void downloadFile(@n0 Uri uri, @p0 Uri uri2) throws Throwable {
        Closeable closeable;
        c0 c0Var;
        if (PatchProxy.proxy(new Object[]{uri, uri2}, this, changeQuickRedirect, false, 50261, new Class[]{Uri.class, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d(TAG, "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.mContext.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        z client = OkHttpClientStore.INSTANCE.getClient();
        BufferedSource bufferedSource = null;
        try {
            c0 c0VarExecute = client.a(new a0.a().B(uri.toString()).b()).execute();
            try {
                BufferedSource bodySource = c0VarExecute.q().getBodySource();
                try {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    Sink sink = Okio.sink(outputStreamOpenOutputStream);
                    bodySource.readAll(sink);
                    BitmapLoadUtils.close(bodySource);
                    BitmapLoadUtils.close(sink);
                    BitmapLoadUtils.close(c0VarExecute.q());
                    client.getDispatcher().b();
                    this.mInputUri = this.mOutputUri;
                } catch (Throwable th2) {
                    th = th2;
                    c0Var = c0VarExecute;
                    closeable = null;
                    bufferedSource = bodySource;
                    BitmapLoadUtils.close(bufferedSource);
                    BitmapLoadUtils.close(closeable);
                    if (c0Var != null) {
                        BitmapLoadUtils.close(c0Var.q());
                    }
                    client.getDispatcher().b();
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c0Var = c0VarExecute;
                closeable = null;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            c0Var = null;
        }
    }

    private void processInputUri() throws IOException, NullPointerException {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50260, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String scheme = this.mInputUri.getScheme();
        Log.d(TAG, "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                downloadFile(this.mInputUri, this.mOutputUri);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e(TAG, "Downloading failed", e10);
                throw e10;
            }
        }
        if ("file".equals(scheme) || "content".equals(scheme)) {
            return;
        }
        Log.e(TAG, "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    @n0
    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public BitmapWorkerResult doInBackground2(Void... voidArr) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voidArr}, this, changeQuickRedirect, false, 50259, new Class[]{Void[].class}, BitmapWorkerResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (BitmapWorkerResult) patchProxyResultProxy.result;
        }
        Context context = this.mContext.get();
        if (context == null) {
            return new BitmapWorkerResult(new NullPointerException("context is null"));
        }
        if (this.mInputUri == null) {
            return new BitmapWorkerResult(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            processInputUri();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = BitmapLoadUtils.calculateInSampleSize(options, this.mRequiredWidth, this.mRequiredHeight);
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeBitmapFromStream = null;
            while (!z10) {
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmapDecodeBitmapFromStream = BitmapLoadUtils.decodeBitmapFromStream(inputStreamOpenInputStream, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            BitmapWorkerResult bitmapWorkerResult = new BitmapWorkerResult(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                            BitmapLoadUtils.close(inputStreamOpenInputStream);
                            return bitmapWorkerResult;
                        }
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        if (!checkSize(bitmapDecodeBitmapFromStream, options)) {
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        throw th2;
                    }
                } catch (IOException e10) {
                    Log.e(TAG, "doInBackground: ImageDecoder.createSource: ", e10);
                    return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]", e10));
                } catch (OutOfMemoryError e11) {
                    Log.e(TAG, "doInBackground: BitmapFactory.decodeFileDescriptor: ", e11);
                    options.inSampleSize *= 2;
                }
            }
            if (bitmapDecodeBitmapFromStream == null) {
                return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]"));
            }
            int exifOrientation = BitmapLoadUtils.getExifOrientation(context, this.mInputUri);
            int iExifToDegrees = BitmapLoadUtils.exifToDegrees(exifOrientation);
            int iExifToTranslation = BitmapLoadUtils.exifToTranslation(exifOrientation);
            ExifInfo exifInfo = new ExifInfo(exifOrientation, iExifToDegrees, iExifToTranslation);
            Matrix matrix = new Matrix();
            if (iExifToDegrees != 0) {
                matrix.preRotate(iExifToDegrees);
            }
            if (iExifToTranslation != 1) {
                matrix.postScale(iExifToTranslation, 1.0f);
            }
            return !matrix.isIdentity() ? new BitmapWorkerResult(BitmapLoadUtils.transformBitmap(bitmapDecodeBitmapFromStream, matrix), exifInfo) : new BitmapWorkerResult(bitmapDecodeBitmapFromStream, exifInfo);
        } catch (IOException | NullPointerException e12) {
            return new BitmapWorkerResult(e12);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [com.starlightc.ucropplus.task.BitmapLoadTask$BitmapWorkerResult, java.lang.Object] */
    @Override // android.os.AsyncTask
    @n0
    public /* bridge */ /* synthetic */ BitmapWorkerResult doInBackground(Void[] voidArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voidArr}, this, changeQuickRedirect, false, 50265, new Class[]{Object[].class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : doInBackground2(voidArr);
    }

    /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    public void onPostExecute2(@n0 BitmapWorkerResult bitmapWorkerResult) {
        if (PatchProxy.proxy(new Object[]{bitmapWorkerResult}, this, changeQuickRedirect, false, 50262, new Class[]{BitmapWorkerResult.class}, Void.TYPE).isSupported) {
            return;
        }
        Exception exc = bitmapWorkerResult.mBitmapWorkerException;
        if (exc == null) {
            this.mBitmapLoadCallback.onBitmapLoaded(bitmapWorkerResult.mBitmapResult, bitmapWorkerResult.mExifInfo, this.mInputUri, this.mOutputUri);
        } else {
            this.mBitmapLoadCallback.onFailure(exc);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(@n0 BitmapWorkerResult bitmapWorkerResult) {
        if (PatchProxy.proxy(new Object[]{bitmapWorkerResult}, this, changeQuickRedirect, false, 50264, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        onPostExecute2(bitmapWorkerResult);
    }
}
