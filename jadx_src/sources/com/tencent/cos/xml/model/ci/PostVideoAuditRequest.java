package com.tencent.cos.xml.model.ci;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.model.tag.audit.PostVideoAudit;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class PostVideoAuditRequest extends BucketRequest {
    private final PostVideoAudit postVideoAudit;

    public PostVideoAuditRequest(@n0 String str) {
        super(str);
        this.postVideoAudit = new PostVideoAudit();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postVideoAudit.input.object) && TextUtils.isEmpty(this.postVideoAudit.input.url)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "object or url must be non-empty");
        }
        if (TextUtils.isEmpty(this.postVideoAudit.conf.detectType)) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "detectType cannot be empty");
        }
        if (this.postVideoAudit.conf.snapshot.count == 0) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "count cannot be 0");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "POST";
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return "/video/auditing";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return RequestBodySerializer.string("application/xml", QCloudXml.toXml(this.postVideoAudit));
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
        this.postVideoAudit.conf.bizType = str;
    }

    public void setCallback(String str) {
        this.postVideoAudit.conf.callback = str;
    }

    public void setCallbackVersion(String str) {
        this.postVideoAudit.conf.callbackVersion = str;
    }

    public void setCount(int i10) {
        this.postVideoAudit.conf.snapshot.count = i10;
    }

    public void setDetectContent(int i10) {
        this.postVideoAudit.conf.detectContent = i10;
    }

    public void setDetectType(String str) {
        this.postVideoAudit.conf.detectType = str;
    }

    public void setMode(String str) {
        this.postVideoAudit.conf.snapshot.mode = str;
    }

    public void setObject(@n0 String str) {
        this.postVideoAudit.input.object = str;
    }

    public void setTimeInterval(float f10) {
        this.postVideoAudit.conf.snapshot.timeInterval = f10;
    }

    public void setUrl(@n0 String str) {
        this.postVideoAudit.input.url = str;
    }
}
