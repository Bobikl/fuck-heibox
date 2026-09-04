package com.tencent.cos.xml.model.ci;

import androidx.annotation.n0;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class GetDescribeMediaBucketsRequest extends CosXmlRequest {
    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return "/mediabucket";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return String.format("ci.%s.myqcloud.com", cosXmlServiceConfig.getRegion());
    }

    public void setBucketName(@n0 String str) {
        this.queryParameters.put("bucketName", str);
    }

    public void setBucketNames(@n0 String str) {
        this.queryParameters.put("bucketNames", str);
    }

    public void setPageNumber(int i10) {
        this.queryParameters.put("pageNumber", String.valueOf(i10));
    }

    public void setPageSize(int i10) {
        this.queryParameters.put("pageSize", String.valueOf(i10));
    }

    public void setRegions(@n0 String str) {
        this.queryParameters.put("regions", str);
    }
}
