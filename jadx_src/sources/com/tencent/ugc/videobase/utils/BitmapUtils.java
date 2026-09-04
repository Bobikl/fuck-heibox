package com.tencent.ugc.videobase.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
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
}
