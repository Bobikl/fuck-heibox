package com.tencent.cos.xml.model.bucket;

import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GetBucketACLRequest extends BucketRequest {
    public GetBucketACLRequest(String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("acl", null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }
}
