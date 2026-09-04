package com.tencent.cos.xml.model.bucket;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.DomainConfiguration;
import com.tencent.cos.xml.transfer.XmlParser;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class GetBucketDomainResult extends CosXmlResult {
    public DomainConfiguration domainConfiguration;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.domainConfiguration = new DomainConfiguration();
        try {
            XmlParser.parseDomainConfiguration(httpResponse.byteStream(), this.domainConfiguration);
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
        }
    }
}
