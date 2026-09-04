package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.PostResponse;
import com.tencent.cos.xml.transfer.XmlSlimParser;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class PostObjectResult extends CosXmlResult {
    public String eTag;
    public String location;
    public PostResponse postResponse;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.eTag = httpResponse.header("ETag");
        this.location = httpResponse.header("Location");
        this.postResponse = new PostResponse();
        try {
            if (httpResponse.byteStream() != null) {
                XmlSlimParser.parsePostResponseResult(httpResponse.byteStream(), this.postResponse);
            }
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        return super.printResult();
    }
}
