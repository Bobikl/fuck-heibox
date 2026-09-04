package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class HeadObjectResult extends CosXmlResult {
    public String cosObjectType;
    public String cosStorageClass;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.cosObjectType = httpResponse.header("x-cos-object-type");
        this.cosStorageClass = httpResponse.header("x-cos-storage-class");
    }
}
