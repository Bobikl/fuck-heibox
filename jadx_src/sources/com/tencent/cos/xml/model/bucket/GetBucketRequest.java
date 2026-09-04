package com.tencent.cos.xml.model.bucket;

import com.google.android.exoplayer2.text.ttml.d;
import com.tencent.connect.common.Constants;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GetBucketRequest extends BucketRequest {
    private String delimiter;
    private String encodingType;
    private String marker;
    private String maxKeys;
    private String prefix;

    public GetBucketRequest(String str) {
        super(str);
        this.prefix = null;
        this.delimiter = null;
        this.marker = null;
        this.maxKeys = Constants.DEFAULT_UIN;
    }

    public GetBucketRequest(String str, String str2, String str3) {
        super(str2);
        this.delimiter = null;
        this.marker = null;
        this.maxKeys = Constants.DEFAULT_UIN;
        this.region = str;
        this.prefix = str3;
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public String getEncodingType() {
        return this.encodingType;
    }

    public String getMarker() {
        return this.marker;
    }

    public long getMaxKeys() {
        return Long.parseLong(this.maxKeys);
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
        String str = this.prefix;
        if (str != null) {
            this.queryParameters.put("prefix", str);
        }
        String str2 = this.delimiter;
        if (str2 != null) {
            this.queryParameters.put(d.f49783b0, str2);
        }
        String str3 = this.encodingType;
        if (str3 != null) {
            this.queryParameters.put("encoding-type", str3);
        }
        String str4 = this.marker;
        if (str4 != null) {
            this.queryParameters.put("marker", str4);
        }
        String str5 = this.maxKeys;
        if (str5 != null) {
            this.queryParameters.put("max-keys", str5);
        }
        String str6 = this.prefix;
        if (str6 != null) {
            this.queryParameters.put("prefix", str6);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    @Deprecated
    public void setDelimiter(char c10) {
        setDelimiter(String.valueOf(c10));
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setMarker(String str) {
        this.marker = str;
    }

    public void setMaxKeys(long j10) {
        this.maxKeys = String.valueOf(j10);
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }
}
