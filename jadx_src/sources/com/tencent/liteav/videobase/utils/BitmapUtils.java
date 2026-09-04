package com.tencent.liteav.videobase.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public class BitmapUtils {
    public static Bitmap createBitmap(Bitmap bitmap, Matrix matrix, boolean z10) {
        if (bitmap == null) {
            return null;
        }
        bitmap.getConfig();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!z10) {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap createBitmapFromBuffer(ByteBuffer byteBuffer, int i10, int i11) {
        try {
            byteBuffer.position(0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            LiteavLog.e("BitmapUtils", "build bitmap failed.", th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Bitmap createBitmapFromFile(String str, int i10, int i11) {
        int i12;
        try {
            int i13 = 1;
            int i14 = 0;
            switch (new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.a.C, 1)) {
                case 1:
                    i13 = 0;
                    i12 = i14;
                    i14 = i13;
                    break;
                case 2:
                    i12 = i14;
                    i14 = i13;
                    break;
                case 3:
                    i13 = 0;
                    i14 = 180;
                    i12 = i14;
                    i14 = i13;
                    break;
                case 4:
                    i14 = 180;
                    i12 = i14;
                    i14 = i13;
                    break;
                case 5:
                    i14 = 270;
                    i12 = i14;
                    i14 = i13;
                    break;
                case 6:
                    i13 = 0;
                    i14 = 90;
                    i12 = i14;
                    i14 = i13;
                    break;
                case 7:
                    i14 = 90;
                    i12 = i14;
                    i14 = i13;
                    break;
                case 8:
                    i13 = 0;
                    i14 = 270;
                    i12 = i14;
                    i14 = i13;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            Matrix matrix = new Matrix();
            if (i14 != 0) {
                matrix.postScale(-1.0f, 1.0f);
            }
            if (i12 != 0) {
                matrix.postRotate(i12);
            }
            Bitmap bitmapLoadBitmapFile = loadBitmapFile(str, i10, i11, i12);
            return Bitmap.createBitmap(bitmapLoadBitmapFile, 0, 0, bitmapLoadBitmapFile.getWidth(), bitmapLoadBitmapFile.getHeight(), matrix, true);
        } catch (Throwable th2) {
            LiteavLog.e("BitmapUtils", "build bitmap failed, path: ".concat(String.valueOf(str)), th2);
            return null;
        }
    }

    private static Bitmap loadBitmapFile(String str, int i10, int i11, int i12) throws Throwable {
        if (i10 <= 0 || i11 <= 0) {
            return BitmapFactory.decodeFile(str);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i13 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        boolean z10 = i12 == 90 || i12 == 270;
        int i14 = z10 ? options.outHeight : options.outWidth;
        int i15 = z10 ? options.outWidth : options.outHeight;
        if (i14 > i10 || i15 > i11) {
            int i16 = i14 / ((i10 / 2) + 1);
            int i17 = i15 / ((i11 / 2) + 1);
            i13 = i17 > i16 ? i16 : i17;
        }
        options.inSampleSize = i13;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static void saveBitmapToFile(Bitmap bitmap, String str) throws Throwable {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    com.tencent.liteav.base.util.f.a(fileOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    LiteavLog.e("BitmapUtils", "save jpg file failed.", e);
                    com.tencent.liteav.base.util.f.a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    com.tencent.liteav.base.util.f.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
