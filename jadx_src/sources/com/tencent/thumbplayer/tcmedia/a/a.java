package com.tencent.thumbplayer.tcmedia.a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.thumbplayer.tcmedia.core.common.TPVideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static Bitmap a(TPVideoFrame tPVideoFrame) {
        int i10;
        int i11;
        byte[][] bArr = tPVideoFrame.data;
        if (bArr.length <= 0 || (i10 = tPVideoFrame.height) == 0 || (i11 = tPVideoFrame.width) == 0) {
            return null;
        }
        return a(bArr[0], i11, i10, tPVideoFrame.rotation);
    }

    private static Bitmap a(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
        if (i12 == 0) {
            return bitmapCreateBitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i12);
        return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
    }

    public static Bitmap[] b(TPVideoFrame tPVideoFrame) {
        byte[][] bArr = tPVideoFrame.data;
        if (bArr.length <= 0 || tPVideoFrame.height == 0 || tPVideoFrame.width == 0) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[bArr.length];
        int i10 = 0;
        while (true) {
            byte[][] bArr2 = tPVideoFrame.data;
            if (i10 >= bArr2.length) {
                return bitmapArr;
            }
            bitmapArr[i10] = a(bArr2[i10], tPVideoFrame.width, tPVideoFrame.height, tPVideoFrame.rotation);
            i10++;
        }
    }
}
