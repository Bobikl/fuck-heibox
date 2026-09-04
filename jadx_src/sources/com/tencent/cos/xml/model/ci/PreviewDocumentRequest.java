package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.GetObjectRequest;

/* JADX INFO: loaded from: classes4.dex */
public class PreviewDocumentRequest extends GetObjectRequest {
    private int page;

    public PreviewDocumentRequest(String str, String str2, String str3, int i10) {
        this(str, str2, str3, i10 + ".jpg", i10);
    }

    public PreviewDocumentRequest(String str, String str2, String str3, String str4, int i10) {
        super(str, str2, str3, str4);
        this.queryParameters.put("ci-process", "doc-preview");
        this.page = i10;
        this.queryParameters.put("page", String.valueOf(i10));
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (this.page < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "Please set a valid page number");
        }
    }

    @Override // com.tencent.cos.xml.model.object.GetObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    public PreviewDocumentRequest setSrcType(String str) {
        this.queryParameters.put("srcType", str);
        return this;
    }
}
