package com.tencent.cos.xml.model.object;

import com.tencent.qcloud.core.http.RequestBodySerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class HeadObjectRequest extends ObjectRequest {
    public HeadObjectRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "HEAD";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public void setIfModifiedSince(String str) {
        if (str != null) {
            addHeader("If-Modified-Since", str);
        }
    }

    public void setVersionId(String str) {
        if (str != null) {
            this.queryParameters.put("versionId", str);
        }
    }
}
