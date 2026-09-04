package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.ObjectRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class GetMediaInfoRequest extends ObjectRequest {
    public GetMediaInfoRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("ci-process", "videoinfo");
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }
}
