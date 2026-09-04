package com.tencent.cos.xml.model.bucket;

import com.google.android.exoplayer2.text.ttml.d;
import com.tencent.connect.common.Constants;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ListBucketVersionsRequest extends BucketRequest {
    private String delimiter;
    private String encodingType;
    private String keyMarker;
    private String maxKeys;
    private String prefix;
    private String versionIdMarker;

    public ListBucketVersionsRequest(String str) {
        super(str);
        this.maxKeys = Constants.DEFAULT_UIN;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("versions", null);
        String str = this.prefix;
        if (str != null) {
            this.queryParameters.put("prefix", str);
        }
        String str2 = this.keyMarker;
        if (str2 != null) {
            this.queryParameters.put("key-marker", str2);
        }
        String str3 = this.versionIdMarker;
        if (str3 != null) {
            this.queryParameters.put("version-id-marker", str3);
        }
        String str4 = this.delimiter;
        if (str4 != null) {
            this.queryParameters.put(d.f49783b0, str4);
        }
        String str5 = this.encodingType;
        if (str5 != null) {
            this.queryParameters.put("encoding-type", str5);
        }
        if (!this.maxKeys.equals(Constants.DEFAULT_UIN)) {
            this.queryParameters.put("max-keys", this.maxKeys);
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    public void setKeyMarker(String str) {
        if (str != null) {
            this.keyMarker = str;
        }
    }

    public void setMaxKeys(int i10) {
        this.maxKeys = String.valueOf(i10);
    }

    public void setPrefix(String str) {
        if (str != null) {
            this.prefix = str;
        }
    }

    public void setVersionIdMarker(String str) {
        if (str != null) {
            this.versionIdMarker = str;
        }
    }
}
