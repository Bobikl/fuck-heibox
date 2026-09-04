package com.tencent.cos.xml.model.object;

import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DeleteObjectTaggingRequest extends ObjectRequest {
    private String versionId;

    public DeleteObjectTaggingRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "DELETE";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("tagging", null);
        String str = this.versionId;
        if (str != null) {
            this.queryParameters.put("versionId", str);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}
