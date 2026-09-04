package com.tencent.cos.xml.model.ci;

import androidx.annotation.n0;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* JADX INFO: loaded from: classes4.dex */
public class GetVideoAuditRequest extends BucketRequest {
    private final String jobId;

    public GetVideoAuditRequest(String str, @n0 String str2) {
        super(str);
        this.jobId = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return "/video/auditing/" + this.jobId;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, CosXmlServiceConfig.CI_HOST_FORMAT);
    }
}
