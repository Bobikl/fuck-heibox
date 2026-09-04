package com.tencent.cos.xml.model.bucket;

import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DeleteBucketLifecycleRequest extends BucketRequest {
    public DeleteBucketLifecycleRequest(String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "DELETE";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("lifecycle", null);
        return this.queryParameters;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }
}
