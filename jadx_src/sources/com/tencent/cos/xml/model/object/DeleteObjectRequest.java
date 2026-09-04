package com.tencent.cos.xml.model.object;

import com.tencent.qcloud.core.http.RequestBodySerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class DeleteObjectRequest extends ObjectRequest {
    public DeleteObjectRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "DELETE";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public void setVersionId(String str) {
        if (str != null) {
            this.queryParameters.put("versionId", str);
        }
    }
}
