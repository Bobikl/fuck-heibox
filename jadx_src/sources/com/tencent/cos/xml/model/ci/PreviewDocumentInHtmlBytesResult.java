package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class PreviewDocumentInHtmlBytesResult extends CosXmlResult {
    public byte[] data;

    public byte[] getData() {
        return this.data;
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        try {
            this.data = httpResponse.bytes();
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
        }
    }
}
