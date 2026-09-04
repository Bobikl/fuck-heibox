package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class AppendObjectResult extends CosXmlResult {
    public String eTag;
    public String nextAppendPosition;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.eTag = httpResponse.header("eTag");
        this.nextAppendPosition = httpResponse.header(Headers.APPEND_OBJECT_NEXT_POSISTION);
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        return super.printResult() + "\n" + this.eTag + "\n" + this.nextAppendPosition + "\n";
    }
}
