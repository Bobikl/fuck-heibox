package com.tencent.cos.xml.model.object;

import com.google.common.net.c;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class OptionObjectResult extends CosXmlResult {
    public List<String> accessControlAllowHeaders;
    public List<String> accessControlAllowMethods;
    public String accessControlAllowOrigin;
    public List<String> accessControlExposeHeaders;
    public long accessControlMaxAge;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.accessControlAllowOrigin = httpResponse.header(c.T);
        if (httpResponse.header(c.X) != null) {
            this.accessControlMaxAge = Long.parseLong(httpResponse.header(c.X));
        }
        if (httpResponse.header(c.S) != null) {
            this.accessControlAllowMethods = Arrays.asList(httpResponse.header(c.S).split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        }
        if (httpResponse.header(c.R) != null) {
            this.accessControlAllowHeaders = Arrays.asList(httpResponse.header(c.R).split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        }
        if (httpResponse.header(c.W) != null) {
            this.accessControlExposeHeaders = Arrays.asList(httpResponse.header(c.W).split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        return super.printResult() + "\n" + this.accessControlAllowOrigin + "\n" + this.accessControlMaxAge + "\n";
    }
}
