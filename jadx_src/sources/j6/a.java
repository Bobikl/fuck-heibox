package j6;

import android.graphics.Bitmap;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BitmapHelper;

/* JADX INFO: compiled from: ToygerImageAndroid.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements i6.a {
    private int c(TGFrame tGFrame) {
        switch (tGFrame.frameMode) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 4;
            default:
                return -1;
        }
    }

    @Override // i6.a
    public Bitmap a(TGFrame tGFrame, int i10, float f10, String str, boolean z10) {
        if (tGFrame == null) {
            ToygerLog.e(i6.a.f119227a, "ToygerImageAndroid.tgFrameToBitmap input tgframe = null");
            return null;
        }
        int iC = c(tGFrame);
        if (iC < 0) {
            ToygerLog.e(i6.a.f119227a, "ToygerImageAndroid.tgFrameToBitmap unrecognized mode");
            return null;
        }
        Bitmap bitmapBytes2Bitmap = BitmapHelper.bytes2Bitmap(tGFrame.data, tGFrame.width, tGFrame.height, iC);
        if (bitmapBytes2Bitmap == null) {
            ToygerLog.e(i6.a.f119227a, "ToygerImageAndroid.tgFrameToBitmap BitmapHelper.bytes2Bitmap error");
            return null;
        }
        Bitmap bitmapRotateBitmap = BitmapHelper.rotateBitmap(bitmapBytes2Bitmap, tGFrame.rotation);
        if (z10) {
            bitmapRotateBitmap = BitmapHelper.flipBitmap(bitmapRotateBitmap, 0);
        }
        if (bitmapRotateBitmap == null) {
            return null;
        }
        if (bitmapRotateBitmap.getWidth() <= i10 || i10 <= 0) {
            i10 = bitmapRotateBitmap.getWidth();
        }
        if (i10 != tGFrame.width) {
            bitmapRotateBitmap = BitmapHelper.resize(bitmapRotateBitmap, i10);
        }
        return bitmapRotateBitmap;
    }

    @Override // i6.a
    public byte[] b(TGFrame tGFrame, int i10, float f10, String str, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrBitmapToByteArray = null;
        if (tGFrame != null) {
            Bitmap bitmapA = a(tGFrame, i10, f10, str, false);
            if (bitmapA != null) {
                bArrBitmapToByteArray = BitmapHelper.bitmapToByteArray(bitmapA, f10);
            } else {
                ToygerLog.e(i6.a.f119227a, "ToygerImageAndroid.tgFrameToBlob resizedBitmap = null");
            }
        } else {
            ToygerLog.e(i6.a.f119227a, "ToygerImageAndroid.tgFrameToBlob input tgframe = null");
        }
        ToygerLog.i(i6.a.f119227a, "ToygerImageAndroid.tgFrameToBlob(desiredWidth=" + i10 + ", compressRate=" + f10 + ") cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms.");
        return bArrBitmapToByteArray;
    }
}
