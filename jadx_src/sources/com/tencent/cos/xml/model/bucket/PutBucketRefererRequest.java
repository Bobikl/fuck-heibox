package com.tencent.cos.xml.model.bucket;

import androidx.annotation.n0;
import com.max.xiaoheihe.module.account.MeHomeActivity;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.RefererConfiguration;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class PutBucketRefererRequest extends BucketRequest {
    private final RefererConfiguration refererConfiguration;

    public PutBucketRefererRequest(String str, boolean z10, RefererConfiguration.RefererType refererType) {
        super(str);
        RefererConfiguration refererConfiguration = new RefererConfiguration();
        this.refererConfiguration = refererConfiguration;
        refererConfiguration.setEnabled(z10);
        refererConfiguration.setRefererType(refererType);
        refererConfiguration.setAllowEmptyRefer(false);
        refererConfiguration.domainList = new ArrayList();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        List<RefererConfiguration.Domain> list = this.refererConfiguration.domainList;
        if (list == null || list.size() <= 0) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "DomainList must not be null");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "PUT";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(MeHomeActivity.O, null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return RequestBodySerializer.string("application/xml", QCloudXml.toXml(this.refererConfiguration));
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

    public void setAllowEmptyRefer(boolean z10) {
        this.refererConfiguration.setAllowEmptyRefer(z10);
    }

    public void setDomainList(@n0 List<RefererConfiguration.Domain> list) {
        this.refererConfiguration.domainList = list;
    }

    public void setEnabled(boolean z10) {
        this.refererConfiguration.setEnabled(z10);
    }

    public void setRefererType(@n0 RefererConfiguration.RefererType refererType) {
        this.refererConfiguration.setRefererType(refererType);
    }
}
