package com.tencent.cos.xml.model.tag;

import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class PostResponse {
    public String bucket;
    public String eTag;
    public String key;
    public String location;

    public String toString() {
        return "{PostResponse:\nLocation:" + this.location + "\nBucket:" + this.bucket + "\nKey:" + this.key + "\nETag:" + this.eTag + "\n" + g.f141884d;
    }
}
