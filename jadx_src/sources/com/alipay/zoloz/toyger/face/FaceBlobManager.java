package com.alipay.zoloz.toyger.face;

import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.CryptoManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FaceBlobManager extends BlobManager<ToygerFaceInfo> {
    protected static final int MONITOR_COMPRESS_RATE = 30;
    protected static final int MONITOR_IMAGE_WIDTH = 160;
    public byte[] bestDepthImage;
    public byte[] bestIRImage;
    public byte[] bestLightImage;
    public String compressFormat;
    public float compressRate;
    public ToygerDepthInfo depthInfo;
    public int desireWidth;
    public TGFrame irFrame;
    public boolean isMirror;
    public boolean isNano;

    public FaceBlobManager() {
    }

    public FaceBlobManager(ToygerFaceBlobConfig toygerFaceBlobConfig, boolean z10) {
        this.config = toygerFaceBlobConfig;
        this.desireWidth = toygerFaceBlobConfig.desiredWidth;
        this.crypto = new CryptoManager(toygerFaceBlobConfig.pubkey, z10);
    }

    public static Rect convertFaceRegion(RectF rectF, int i10, int i11, int i12, boolean z10) {
        if (z10) {
            float f10 = i10;
            float f11 = i11;
            return new Rect((int) ((1.0f - rectF.right) * f10), (int) (rectF.top * f11), (int) ((1.0f - rectF.left) * f10), (int) (rectF.bottom * f11));
        }
        float f12 = i10;
        float f13 = i11;
        return new Rect((int) (rectF.left * f12), (int) (rectF.top * f13), (int) (rectF.right * f12), (int) (rectF.bottom * f13));
    }

    public abstract void addMonitorImage(TGFrame tGFrame);

    public abstract Map<String, Object> generateBlob(Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public abstract byte[] generateBlob(List<ToygerFaceInfo> list, Map<String, Object> map);

    public abstract byte[] generateFaceBlob(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr);

    public abstract byte[] generateLocalMatchingBlob(String str, byte[] bArr, byte[] bArr2, String str2);

    protected String getBlobElemType(ToygerFaceInfo toygerFaceInfo) {
        int i10 = toygerFaceInfo.frame.frameType;
        if (i10 == 0) {
            return BlobManager.SUB_TYPE_PANO;
        }
        if (i10 == 1) {
            return BlobManager.SUB_TYPE_DARK;
        }
        if (i10 == 2) {
            return BlobManager.SUB_TYPE_DEPTH;
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : BlobManager.SUB_TYPE_NANO;
        }
        return BlobManager.SUB_TYPE_IR;
    }

    public abstract byte[] getFileIdBlob(String str);

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public byte[] getKey() {
        return this.crypto.getAESCypher();
    }

    public abstract byte[] getMonitorBlob();

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public abstract boolean isUTF8();
}
