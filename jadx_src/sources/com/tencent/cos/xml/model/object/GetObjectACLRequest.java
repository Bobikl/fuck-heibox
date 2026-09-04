package com.tencent.cos.xml.model.object;

import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GetObjectACLRequest extends ObjectRequest {
    public GetObjectACLRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("acl", null);
        return this.queryParameters;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }
}
