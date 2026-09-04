package com.tencent.cos.xml.model.tag;

import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class InitiateMultipartUpload {
    public String bucket;
    public String key;
    public String uploadId;

    public String toString() {
        return "{InitiateMultipartUpload:\nBucket:" + this.bucket + "\nKey:" + this.key + "\nUploadId:" + this.uploadId + "\n" + g.f141884d;
    }
}
