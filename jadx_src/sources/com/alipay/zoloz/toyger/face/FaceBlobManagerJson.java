package com.alipay.zoloz.toyger.face;

import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.Blob;
import com.alipay.zoloz.toyger.blob.BlobElem;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.alipay.zoloz.toyger.blob.Content;
import com.alipay.zoloz.toyger.blob.FaceInfo;
import com.alipay.zoloz.toyger.blob.Meta;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FaceBlobManagerJson extends FaceBlobManager {
    private List<BlobElem> mMonitorBlobElems;

    public FaceBlobManagerJson() {
    }

    public FaceBlobManagerJson(ToygerFaceBlobConfig toygerFaceBlobConfig, boolean z10) {
        super(toygerFaceBlobConfig, z10);
    }

    private Content deSerializerByteArray(String str) {
        if (str != null) {
            return (Content) JSON.parseObject(str, Content.class);
        }
        return null;
    }

    private Meta generateMeta(List<ToygerFaceInfo> list, Map<String, Object> map) {
        Meta meta = new Meta();
        meta.type = "zface";
        meta.score = map;
        meta.serialize = 1;
        HashMap map2 = new HashMap();
        map2.put("ImageType", "jpeg");
        meta.collectInfo = map2;
        return meta;
    }

    private BlobElem generateMonitorBlob(TGFrame tGFrame) {
        BlobElem blobElem = new BlobElem();
        blobElem.type = "face";
        blobElem.subType = BlobManager.SUB_TYPE_SURVEILLANCE;
        blobElem.version = "1.0";
        byte[] bArrProcessFrame = processFrame(tGFrame, 160, 30, "jpeg", !this.isMirror);
        blobElem.content = bArrProcessFrame;
        if (bArrProcessFrame == null) {
            Log.e("TOYGER_FLOW_BlobManager", "failed to generate element content");
            return null;
        }
        Log.i("TOYGER_FLOW_BlobManager", "monitor image length:" + blobElem.content.length);
        return blobElem;
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public void addMonitorImage(TGFrame tGFrame) {
        BlobElem blobElemGenerateMonitorBlob = generateMonitorBlob(tGFrame);
        if (this.mMonitorBlobElems == null) {
            this.mMonitorBlobElems = new ArrayList();
        }
        if (blobElemGenerateMonitorBlob != null) {
            synchronized (this) {
                blobElemGenerateMonitorBlob.idx = this.mMonitorBlobElems.size();
                this.mMonitorBlobElems.add(blobElemGenerateMonitorBlob);
            }
        }
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public Map<String, Object> generateBlob(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        Blob blob = new Blob();
        blob.blobVersion = "1.0";
        Content content = new Content();
        Map map3 = (Map) map.remove(ToygerBaseService.KEY_COMPLETE_BLOB);
        Map map4 = (Map) map.remove(ToygerBaseService.KEY_NINE_SHOT_BLOB);
        Map map5 = (Map) map.remove(ToygerBaseService.KEY_ASYNC_BLOB);
        String str = map3 != null ? (String) map3.get("content") : null;
        String str2 = map4 != null ? (String) map4.get("content") : null;
        String str3 = map5 != null ? (String) map5.get("content") : null;
        Content contentDeSerializerByteArray = deSerializerByteArray(str);
        Content contentDeSerializerByteArray2 = deSerializerByteArray(str2);
        Content contentDeSerializerByteArray3 = deSerializerByteArray(str3);
        if (contentDeSerializerByteArray != null) {
            content.meta = contentDeSerializerByteArray.meta;
            blob.blobElem.addAll(contentDeSerializerByteArray.blob.blobElem);
        }
        if (contentDeSerializerByteArray2 != null) {
            if (content.meta == null) {
                content.meta = contentDeSerializerByteArray2.meta;
            }
            blob.blobElem.addAll(contentDeSerializerByteArray2.blob.blobElem);
        }
        if (contentDeSerializerByteArray3 != null) {
            if (content.meta == null) {
                content.meta = contentDeSerializerByteArray3.meta;
            }
            blob.blobElem.addAll(contentDeSerializerByteArray3.blob.blobElem);
        }
        content.blob = blob;
        map2.put(ToygerBaseService.KEY_COMPLETE_BLOB, JSON.toJSONString(content).getBytes());
        return map2;
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager, com.alipay.zoloz.toyger.blob.BlobManager
    public byte[] generateBlob(List<ToygerFaceInfo> list, Map<String, Object> map) {
        String str = this.compressFormat;
        if (str == null) {
            str = "jpeg";
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.isMirror;
        for (ToygerFaceInfo toygerFaceInfo : list) {
            BlobElem blobElem = new BlobElem();
            blobElem.type = "face";
            blobElem.subType = getBlobElemType(toygerFaceInfo);
            blobElem.version = "1.0";
            blobElem.idx = 0;
            byte[] bArrProcessFrame = processFrame(toygerFaceInfo.frame, str, !z10);
            blobElem.content = bArrProcessFrame;
            if (bArrProcessFrame == null) {
                Log.e("TOYGER_FLOW_BlobManager", "failed to generate element content");
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            blobElem.faceInfos = arrayList2;
            arrayList2.add(generateFaceInfo(toygerFaceInfo, z10));
            arrayList.add(blobElem);
        }
        Object objRemove = map.remove("sensorData");
        if (objRemove != null) {
            BlobElem blobElem2 = new BlobElem();
            blobElem2.type = ak.f104420ac;
            blobElem2.subType = "gyro";
            blobElem2.version = "1.0";
            blobElem2.idx = 1;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sensorData", objRemove);
            jSONObject.put("sensorResult", (Object) Boolean.FALSE);
            blobElem2.content = processSensorData(jSONObject.toJSONString());
            arrayList.add(blobElem2);
        }
        ToygerDepthInfo toygerDepthInfo = this.depthInfo;
        if (toygerDepthInfo != null) {
            BlobElem blobElem3 = new BlobElem();
            blobElem3.type = "face";
            blobElem3.subType = BlobManager.SUB_TYPE_DEPTH;
            blobElem3.content = Base64.encode(processDepthInfo(toygerDepthInfo), 0);
            blobElem3.version = "1.0";
            blobElem3.idx = 2;
            arrayList.add(blobElem3);
        }
        Meta metaGenerateMeta = generateMeta(list, map);
        Blob blob = new Blob();
        blob.blobElem = arrayList;
        blob.blobVersion = "1.0";
        Content content = new Content();
        content.blob = blob;
        content.meta = metaGenerateMeta;
        return JSON.toJSONString(content).getBytes();
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] generateFaceBlob(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr) {
        return null;
    }

    protected FaceInfo generateFaceInfo(ToygerFaceInfo toygerFaceInfo, boolean z10) {
        FaceInfo faceInfo = new FaceInfo();
        TGFrame tGFrame = toygerFaceInfo.frame;
        int i10 = tGFrame.rotation % 180 == 0 ? tGFrame.width : tGFrame.height;
        int i11 = tGFrame.width;
        if (i10 == i11) {
            i11 = tGFrame.height;
        }
        int iIntValue = (i10 <= this.config.getDesiredWidth().intValue() || this.config.getDesiredWidth().intValue() <= 0) ? i10 : this.config.getDesiredWidth().intValue();
        faceInfo.rect = FaceBlobManager.convertFaceRegion(((ToygerFaceAttr) toygerFaceInfo.attr).region(), iIntValue, (int) ((iIntValue / i10) * i11), toygerFaceInfo.frame.rotation, z10);
        faceInfo.quality = ((ToygerFaceAttr) toygerFaceInfo.attr).quality();
        return faceInfo;
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] generateLocalMatchingBlob(String str, byte[] bArr, byte[] bArr2, String str2) {
        String[] strArrSplit;
        Meta meta = new Meta();
        meta.type = "zface";
        HashMap map = new HashMap(2);
        if (bArr2 != null) {
            map.put("imageSig", bArr2);
        }
        if (str != null) {
            map.put("authInfo", str);
        }
        map.put("ImageType", "jpeg");
        meta.collectInfo = map;
        meta.serialize = 1;
        ArrayList arrayList = new ArrayList();
        Blob blob = new Blob();
        if (bArr != null) {
            FaceInfo faceInfo = new FaceInfo();
            if (str2 != null && (strArrSplit = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null && strArrSplit.length != 4) {
                faceInfo.rect.left = Integer.parseInt(strArrSplit[0]);
                faceInfo.rect.top = Integer.parseInt(strArrSplit[1]);
                faceInfo.rect.right = Integer.parseInt(strArrSplit[2]);
                faceInfo.rect.bottom = Integer.parseInt(strArrSplit[3]);
            }
            BlobElem blobElem = new BlobElem();
            blobElem.type = "face";
            blobElem.subType = BlobManager.SUB_TYPE_PANO;
            blobElem.content = bArr;
            blobElem.version = "1.0";
            blobElem.idx = 0;
            ArrayList arrayList2 = new ArrayList();
            blobElem.faceInfos = arrayList2;
            arrayList2.add(faceInfo);
            arrayList.add(blobElem);
        }
        blob.blobElem = arrayList;
        blob.blobVersion = "1.0";
        Content content = new Content();
        content.blob = blob;
        content.meta = meta;
        return JSON.toJSONString(content).getBytes();
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] getFileIdBlob(String str) {
        HashMap map = new HashMap();
        map.put("fileid", str);
        Meta metaGenerateMeta = generateMeta(null, map);
        Content content = new Content();
        content.meta = metaGenerateMeta;
        content.blob = new Blob();
        return JSON.toJSONString(content).getBytes();
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] getMonitorBlob() {
        List<BlobElem> list = this.mMonitorBlobElems;
        byte[] bytes = null;
        if (list != null && !list.isEmpty()) {
            Meta metaGenerateMeta = generateMeta(null, null);
            Blob blob = new Blob();
            blob.blobElem = this.mMonitorBlobElems;
            blob.blobVersion = "1.0";
            Content content = new Content();
            content.blob = blob;
            content.meta = metaGenerateMeta;
            synchronized (this) {
                bytes = JSON.toJSONString(content).getBytes();
            }
        }
        return bytes;
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager, com.alipay.zoloz.toyger.blob.BlobManager
    public boolean isUTF8() {
        return true;
    }
}
