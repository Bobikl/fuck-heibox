package com.alipay.zoloz.toyger.blob;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Blob {
    public List<BlobElem> blobElem;
    public String blobVersion;

    public Blob() {
    }

    public Blob(String str, List<BlobElem> list) {
        this.blobVersion = str;
        this.blobElem = list;
    }
}
