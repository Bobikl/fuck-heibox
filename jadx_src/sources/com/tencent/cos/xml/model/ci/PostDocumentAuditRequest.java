package com.tencent.cos.xml.model.ci;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.model.tag.audit.PostDocumentAudit;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class PostDocumentAuditRequest extends BucketRequest {
    private final PostDocumentAudit postDocumentAudit;

    public PostDocumentAuditRequest(@n0 String str, @n0 String str2) {
        super(str);
        PostDocumentAudit postDocumentAudit = new PostDocumentAudit();
        this.postDocumentAudit = postDocumentAudit;
        postDocumentAudit.input.url = str2;
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postDocumentAudit.input.url)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "object or url must be non-empty");
        }
        if (TextUtils.isEmpty(this.postDocumentAudit.conf.detectType)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "detectType cannot be empty");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "POST";
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return "/document/auditing";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return RequestBodySerializer.string("application/xml", QCloudXml.toXml(this.postDocumentAudit));
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e11);
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, CosXmlServiceConfig.CI_HOST_FORMAT);
    }

    public void setBizType(String str) {
        this.postDocumentAudit.conf.bizType = str;
    }

    public void setCallback(String str) {
        this.postDocumentAudit.conf.callback = str;
    }

    public void setDetectType(String str) {
        this.postDocumentAudit.conf.detectType = str;
    }

    public void setType(String str) {
        this.postDocumentAudit.input.type = str;
    }
}
