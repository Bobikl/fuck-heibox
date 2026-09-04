package com.tencent.cos.xml.model.ci;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.model.tag.audit.PostAudioAudit;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class PostAudioAuditRequest extends BucketRequest {
    private final PostAudioAudit postAudioAudit;

    public PostAudioAuditRequest(@n0 String str) {
        super(str);
        this.postAudioAudit = new PostAudioAudit();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postAudioAudit.input.object) && TextUtils.isEmpty(this.postAudioAudit.input.url)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "object or url must be non-empty");
        }
        if (TextUtils.isEmpty(this.postAudioAudit.conf.detectType)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "detectType cannot be empty");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "POST";
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return "/audio/auditing";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return RequestBodySerializer.string("application/xml", QCloudXml.toXml(this.postAudioAudit));
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
        this.postAudioAudit.conf.bizType = str;
    }

    public void setCallback(String str) {
        this.postAudioAudit.conf.callback = str;
    }

    public void setCallbackVersion(String str) {
        this.postAudioAudit.conf.callbackVersion = str;
    }

    public void setDetectType(String str) {
        this.postAudioAudit.conf.detectType = str;
    }

    public void setObject(@n0 String str) {
        this.postAudioAudit.input.object = str;
    }

    public void setUrl(@n0 String str) {
        this.postAudioAudit.input.url = str;
    }
}
