package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.qcloud.core.http.HttpResponse;

/* JADX INFO: loaded from: classes4.dex */
public class PreviewDocumentResult extends GetObjectResult {
    private String contentType;
    private String errNo;
    private String previewFilePath;
    private int totalPage;

    public PreviewDocumentResult(String str) {
        this.previewFilePath = str;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getErrNo() {
        return this.errNo;
    }

    public String getPreviewFilePath() {
        return this.previewFilePath;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    @Override // com.tencent.cos.xml.model.object.GetObjectResult, com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        String strHeader = httpResponse.header("X-Total-Page");
        if (strHeader != null) {
            try {
                this.totalPage = Integer.parseInt(strHeader);
            } catch (Error unused) {
            }
        }
        this.contentType = httpResponse.header("Content-Type");
        this.errNo = httpResponse.header("X-ErrNo\t");
    }
}
