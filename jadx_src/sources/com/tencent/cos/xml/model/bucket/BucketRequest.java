package com.tencent.cos.xml.model.bucket;

import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.CosXmlRequest;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BucketRequest extends CosXmlRequest {
    public BucketRequest(String str) {
        this.bucket = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        if (this.requestURL == null && this.bucket == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "bucket must not be null");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getUrlPath(this.bucket, "/");
    }
}
