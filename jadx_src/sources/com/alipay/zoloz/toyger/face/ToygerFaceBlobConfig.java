package com.alipay.zoloz.toyger.face;

import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.alipay.zoloz.toyger.blob.BlobManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerFaceBlobConfig extends ToygerBlobConfig {
    public List<String> collection;
    public int desiredWidth;
    public String uploadImageType;
    public float upload_compress_rate;

    public ToygerFaceBlobConfig() {
        this.upload_compress_rate = 0.7f;
        this.desiredWidth = 480;
        ArrayList arrayList = new ArrayList();
        this.collection = arrayList;
        arrayList.add(BlobManager.SUB_TYPE_PANO);
        this.uploadImageType = "jpeg";
    }

    public ToygerFaceBlobConfig(float f10, int i10, String str, String str2) {
        this.upload_compress_rate = f10;
        this.desiredWidth = i10;
        this.pubkey = str;
        this.uploadImageType = str2;
    }

    public static ToygerFaceBlobConfig from(String str, String str2) {
        if (str == null || str2 == null) {
            return new ToygerFaceBlobConfig();
        }
        ToygerFaceBlobConfig toygerFaceBlobConfig = (ToygerFaceBlobConfig) JSON.parseObject(str, ToygerFaceBlobConfig.class);
        if (toygerFaceBlobConfig.desiredWidth <= 0) {
            toygerFaceBlobConfig.desiredWidth = 1280;
        }
        if (toygerFaceBlobConfig.collection == null) {
            toygerFaceBlobConfig.collection = new ArrayList();
        }
        toygerFaceBlobConfig.pubkey = str2;
        if (toygerFaceBlobConfig.uploadImageType == null) {
            toygerFaceBlobConfig.uploadImageType = "jpeg";
        }
        return toygerFaceBlobConfig;
    }

    @Override // com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig
    public float getCompressRate() {
        return this.upload_compress_rate;
    }

    @Override // com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig
    public Integer getDesiredWidth() {
        return Integer.valueOf(this.desiredWidth);
    }

    public int getMinWidth(int i10) {
        int i11 = this.desiredWidth;
        return i11 > i10 ? i10 : i11;
    }

    public String toString() {
        return "ToygerFaceBlobConfig{upload_compress_rate=" + this.upload_compress_rate + ", desiredWidth=" + this.desiredWidth + ", collection=" + this.collection + ", uploadImageType='" + this.uploadImageType + "'}";
    }
}
