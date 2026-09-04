package com.tencent.cos.xml.model.bucket;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.IntelligentTieringConfiguration;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;

/* JADX INFO: loaded from: classes4.dex */
public class GetBucketIntelligentTieringResult extends CosXmlResult {
    private IntelligentTieringConfiguration configuration;

    public IntelligentTieringConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        try {
            this.configuration = (IntelligentTieringConfiguration) QCloudXml.fromXml(httpResponse.byteStream(), IntelligentTieringConfiguration.class);
        } catch (Exception e10) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), "", e10.getCause());
        }
    }
}
