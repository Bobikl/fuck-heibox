package com.ss.bytertc.engine.live;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.realx.base.CalledByNative;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TranscodingDataManager {
    private static Context mContext;

    public static void SetContext(Context context) {
        mContext = context;
    }

    @CalledByNative
    static byte[] getCompressImageBuf(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        byteBuffer.rewind();
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
