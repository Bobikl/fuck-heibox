package com.tencent.cos.xml.model.bucket;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.CORSConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class PutBucketCORSRequest extends BucketRequest {
    private CORSConfiguration corsConfiguration;

    public PutBucketCORSRequest(String str) {
        super(str);
        CORSConfiguration cORSConfiguration = new CORSConfiguration();
        this.corsConfiguration = cORSConfiguration;
        cORSConfiguration.corsRules = new ArrayList();
    }

    public void addCORSRule(CORSConfiguration.CORSRule cORSRule) {
        if (cORSRule != null) {
            this.corsConfiguration.corsRules.add(cORSRule);
        }
    }

    public void addCORSRules(List<CORSConfiguration.CORSRule> list) {
        if (list != null) {
            this.corsConfiguration.corsRules.addAll(list);
        }
    }

    public CORSConfiguration getCorsConfiguration() {
        return this.corsConfiguration;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "PUT";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("cors", null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return RequestBodySerializer.string("application/xml", XmlBuilder.buildCORSConfigurationXML(this.corsConfiguration));
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e11);
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }
}
