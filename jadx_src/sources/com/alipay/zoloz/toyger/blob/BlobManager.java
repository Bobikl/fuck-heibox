package com.alipay.zoloz.toyger.blob;

import android.util.Log;
import com.alipay.face.c;
import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.alipay.zoloz.toyger.face.ToygerDepthInfo;
import i6.b;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BlobManager<Info extends ToygerBiometricInfo> {
    protected static final String BLOB_ELEM_IMAGE_TYPE = "ImageType";
    protected static final String BLOB_ELEM_SUBTYPE_GYRO = "gyro";
    protected static final String BLOB_ELEM_TYPE_DOC = "doc";
    protected static final String BLOB_ELEM_TYPE_FACE = "face";
    protected static final String BLOB_ELEM_TYPE_SENSOR = "sensor";
    public static final String BLOB_VERSION = "1.0";
    protected static final int META_ALGRESULT_BAT = 3;
    protected static final int META_ALGRESULT_DRAGONFLY = 2;
    protected static final int META_ALGRESULT_VERIFY = 1;
    protected static final String META_COLL_KEY_AUTH_INFO = "authInfo";
    protected static final String META_COLL_KEY_IMAGE_SIG = "imageSig";
    public static final int META_SERIALIZER_JSON = 1;
    public static final int META_SERIALIZER_PB = 2;
    protected static final String META_TYPE_DOC = "zdoc";
    protected static final String META_TYPE_FACE = "zface";
    public static final String SUB_TYPE_DARK = "Dark";
    public static final String SUB_TYPE_DEPTH = "Depth";
    public static final String SUB_TYPE_DOC_IMAGE = "docimage";
    public static final String SUB_TYPE_IR = "SLIR";
    public static final String SUB_TYPE_NANO = "Nano";
    public static final String SUB_TYPE_PANO = "Pano";
    public static final String SUB_TYPE_SURVEILLANCE = "Surveillance";
    public static final String SUB_TYPE_VERSION = "1.0";
    protected static final String TAG = "TOYGER_FLOW_BlobManager";
    protected ToygerBlobConfig config;
    protected CryptoManager crypto;

    public abstract byte[] generateBlob(List<Info> list, Map<String, Object> map);

    public abstract byte[] getKey();

    public abstract boolean isUTF8();

    public byte[] processDepthInfo(ToygerDepthInfo toygerDepthInfo) {
        if (toygerDepthInfo == null) {
            return null;
        }
        byte[] bArrEncrypt = this.crypto.encrypt(toygerDepthInfo.depthInfo);
        Log.i("PROCESS_DEPTHINFO", "before length " + toygerDepthInfo.depthInfo.length + "after length " + bArrEncrypt.length);
        return bArrEncrypt;
    }

    protected byte[] processFrame(TGFrame tGFrame, int i10, int i11, String str, boolean z10) {
        if (tGFrame == null || (tGFrame.data == null && tGFrame.byteBuffer == null)) {
            ToygerLog.e(TAG, "BlobManager.processFrame(), frame data is null");
        } else {
            if (tGFrame.data == null) {
                tGFrame.byteBuffer.clear();
                byte[] bArr = new byte[tGFrame.byteBuffer.remaining()];
                tGFrame.data = bArr;
                tGFrame.byteBuffer.get(bArr);
            }
            byte[] bArrB = b.b(tGFrame, i10, i11, str, z10);
            if (bArrB == null) {
                ToygerLog.e(TAG, "ToygerImageUtil frameToBlob return null");
            } else {
                c.w().n0(bArrB);
                byte[] bArrEncrypt = this.crypto.encrypt(bArrB);
                if (bArrEncrypt != null) {
                    return bArrEncrypt;
                }
                ToygerLog.e(TAG, "failed to encrypt");
            }
        }
        return null;
    }

    public byte[] processFrame(TGFrame tGFrame, String str, boolean z10) {
        return processFrame(tGFrame, this.config.getDesiredWidth().intValue(), (int) (this.config.getCompressRate() * 100.0f), str, z10);
    }

    protected byte[] processFrame(byte[] bArr) {
        if (bArr == null) {
            ToygerLog.e(TAG, "ToygerImageUtil frameToBlob return null");
        } else {
            byte[] bArrEncrypt = this.crypto.encrypt(bArr);
            if (bArrEncrypt != null) {
                return bArrEncrypt;
            }
            ToygerLog.e(TAG, "failed to encrypt");
        }
        return null;
    }

    public byte[] processIRFrameInfo(TGFrame tGFrame, boolean z10) {
        int iIntValue = this.config.getDesiredWidth().intValue();
        int compressRate = (int) (this.config.getCompressRate() * 100.0f);
        if (tGFrame == null || tGFrame.data == null) {
            ToygerLog.e(TAG, "BlobManager.processFrame(), frame data is null");
        } else {
            byte[] bArrB = b.b(tGFrame, iIntValue, compressRate, "jpeg", z10);
            if (bArrB == null) {
                ToygerLog.e(TAG, "ToygerImageUtil frameToBlob return null");
            } else {
                byte[] bArrEncrypt = this.crypto.encrypt(bArrB);
                if (bArrEncrypt != null) {
                    return bArrEncrypt;
                }
                ToygerLog.e(TAG, "failed to encrypt");
            }
        }
        return null;
    }

    protected byte[] processSensorData(String str) {
        return this.crypto.encrypt(str.getBytes());
    }
}
