package com.tencent.cos.xml.model;

import androidx.annotation.p0;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.qcloud.core.http.HttpResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CosXmlResult {
    public String accessUrl;
    public Map<String, List<String>> headers;
    public int httpCode;
    public String httpMessage;

    @p0
    public String getHeader(String str) {
        List<String> list;
        if (!this.headers.containsKey(str) || (list = this.headers.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        this.httpCode = httpResponse.code();
        this.httpMessage = httpResponse.message();
        this.headers = httpResponse.headers();
    }

    public String printResult() {
        return this.httpCode + "|" + this.httpMessage;
    }
}
