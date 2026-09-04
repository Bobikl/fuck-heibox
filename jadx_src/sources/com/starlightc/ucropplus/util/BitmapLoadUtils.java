package com.starlightc.ucropplus.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Registry;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.callback.BitmapLoadCallback;
import com.starlightc.ucropplus.task.BitmapLoadTask;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapLoadUtils {
    private static final String CONTENT_SCHEME = "content";
    private static final String TAG = "BitmapLoadUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int calculateInSampleSize(@n0 BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            while (true) {
                if (i12 / i14 <= i11 && i13 / i14 <= i10) {
                    break;
                }
                i14 *= 2;
            }
        }
        return i14;
    }

    public static int calculateMaxBitmapSize(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 50901, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int iSqrt = (int) Math.sqrt(Math.pow(point.x, 2.0d) + Math.pow(point.y, 2.0d));
        Canvas canvas = new Canvas();
        int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (iMin > 0) {
            iSqrt = Math.min(iSqrt, iMin);
        }
        int maxTextureSize = EglUtils.getMaxTextureSize();
        if (maxTextureSize > 0) {
            iSqrt = Math.min(iSqrt, maxTextureSize);
        }
        Log.d(TAG, "maxBitmapSize: " + iSqrt);
        return iSqrt;
    }

    public static void close(@p0 Closeable closeable) {
        if (PatchProxy.proxy(new Object[]{closeable}, null, changeQuickRedirect, true, 50902, new Class[]{Closeable.class}, Void.TYPE).isSupported || closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static Bitmap decodeBitmapFromStream(InputStream inputStream, BitmapFactory.Options options) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, options}, null, changeQuickRedirect, true, 50899, new Class[]{InputStream.class, BitmapFactory.Options.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmapDecodeByteArray = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            } catch (Exception e10) {
                Log.e(Registry.f40559m, e10.toString());
            }
            return bitmapDecodeByteArray;
        } finally {
            close(byteArrayOutputStream);
        }
    }

    public static void decodeBitmapInBackground(@n0 Context context, @n0 Uri uri, @p0 Uri uri2, int i10, int i11, BitmapLoadCallback bitmapLoadCallback) {
        Object[] objArr = {context, uri, uri2, new Integer(i10), new Integer(i11), bitmapLoadCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50897, new Class[]{Context.class, Uri.class, Uri.class, cls, cls, BitmapLoadCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        new BitmapLoadTask(context, uri, uri2, i10, i11, bitmapLoadCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static int exifToDegrees(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int exifToTranslation(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    public static int getExifOrientation(@n0 Context context, @n0 Uri uri) {
        int orientation = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, uri}, null, changeQuickRedirect, true, 50900, new Class[]{Context.class, Uri.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return 0;
            }
            orientation = new ImageHeaderParser(inputStreamOpenInputStream).getOrientation();
            close(inputStreamOpenInputStream);
            return orientation;
        } catch (IOException e10) {
            Log.e(TAG, "getExifOrientation: " + uri.toString(), e10);
            return orientation;
        }
    }

    public static boolean hasContentScheme(Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, null, changeQuickRedirect, true, 50903, new Class[]{Uri.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return uri != null && "content".equals(uri.getScheme());
    }

    public static Bitmap transformBitmap(@n0 Bitmap bitmap, @n0 Matrix matrix) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, matrix}, null, changeQuickRedirect, true, 50898, new Class[]{Bitmap.class, Matrix.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(bitmapCreateBitmap) ? bitmapCreateBitmap : bitmap;
        } catch (OutOfMemoryError e10) {
            Log.e(TAG, "transformBitmap: ", e10);
            return bitmap;
        }
    }
}
