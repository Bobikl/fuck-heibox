package i6;

import android.graphics.Bitmap;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGFrame;

/* JADX INFO: compiled from: ToygerImageUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j6.a f119228a = new j6.a();

    public static Bitmap a(TGFrame tGFrame, int i10, float f10, boolean z10) {
        return f119228a.a(tGFrame, i10, f10, null, z10);
    }

    public static byte[] b(TGFrame tGFrame, int i10, float f10, String str, boolean z10) {
        ToygerLog.i("TOYGER_FLOW_ANDROID::ToygerImageUtil:ToygerImageNative::tgFrameToBlob imageOptimized:false");
        byte[] bArrB = f119228a.b(tGFrame, i10, f10, str, z10);
        if (bArrB == null) {
            ToygerLog.e("TOYGER_FLOW_ANDROID::ToygerImageUtil:ToygerImageAndroid::tgFrameToBlob");
        }
        ToygerLog.i("TOYGER_FLOW_ANDROID:: ToygerImageUtil.tgFrameToBlob", str + " image size " + (bArrB == null ? 0 : bArrB.length));
        return bArrB;
    }
}
