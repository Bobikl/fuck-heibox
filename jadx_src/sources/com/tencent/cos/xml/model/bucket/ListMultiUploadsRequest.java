package com.tencent.cos.xml.model.bucket;

import com.google.android.exoplayer2.text.ttml.d;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ListMultiUploadsRequest extends BucketRequest {
    private String delimiter;
    private String encodingType;
    private String keyMarker;
    private String maxUploads;
    private String prefix;
    private String uploadIdMarker;

    public ListMultiUploadsRequest(String str) {
        super(str);
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public String getEncodingType() {
        return this.encodingType;
    }

    public String getKeyMarker() {
        return this.keyMarker;
    }

    public String getMaxUploads() {
        return this.maxUploads;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    public String getPrefix() {
        return this.prefix;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("uploads", null);
        String str = this.delimiter;
        if (str != null) {
            this.queryParameters.put(d.f49783b0, str);
        }
        String str2 = this.encodingType;
        if (str2 != null) {
            this.queryParameters.put("encoding-type", str2);
        }
        String str3 = this.prefix;
        if (str3 != null) {
            this.queryParameters.put("prefix", str3);
        }
        String str4 = this.maxUploads;
        if (str4 != null) {
            this.queryParameters.put("max-uploads", str4);
        }
        String str5 = this.keyMarker;
        if (str5 != null) {
            this.queryParameters.put("key-marker", str5);
        }
        String str6 = this.uploadIdMarker;
        if (str6 != null) {
            this.queryParameters.put("upload-id-marker", str6);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setKeyMarker(String str) {
        this.keyMarker = str;
    }

    public void setMaxUploads(String str) {
        this.maxUploads = str;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setUploadIdMarker(String str) {
        this.uploadIdMarker = str;
    }
}
