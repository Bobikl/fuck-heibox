package com.tencent.cos.xml.model.bucket;

import com.tencent.qcloud.core.http.RequestBodySerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class DeleteBucketRequest extends BucketRequest {
    public DeleteBucketRequest(String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "DELETE";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }
}
