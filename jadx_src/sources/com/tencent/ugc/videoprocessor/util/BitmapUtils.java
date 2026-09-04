package com.tencent.ugc.videoprocessor.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapUtils {
    private static final String TAG = "BitmapUtils";

    public static Bitmap rotateImage(float f10, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (bitmapCreateBitmap != bitmap && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }
}
