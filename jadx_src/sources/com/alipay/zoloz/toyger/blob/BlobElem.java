package com.alipay.zoloz.toyger.blob;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BlobElem {
    public byte[] content;
    public DocInfo docInfo;
    public List<FaceInfo> faceInfos;
    public int idx;
    public String subType;
    public String type;
    public String version;

    public BlobElem() {
    }

    public BlobElem(String str, String str2, int i10, String str3, byte[] bArr, List<FaceInfo> list, DocInfo docInfo) {
        this.type = str;
        this.subType = str2;
        this.idx = i10;
        this.version = str3;
        this.content = bArr;
        this.faceInfos = list;
        this.docInfo = docInfo;
    }
}
