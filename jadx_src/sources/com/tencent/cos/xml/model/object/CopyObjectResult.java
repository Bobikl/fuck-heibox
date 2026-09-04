package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.CopyObject;
import com.tencent.cos.xml.model.tag.CosError;
import com.tencent.cos.xml.transfer.XmlSlimParser;
import com.tencent.cos.xml.utils.CloseUtil;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import z5.f;

/* JADX INFO: loaded from: classes4.dex */
public class CopyObjectResult extends CosXmlResult {
    public CopyObject copyObject;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws Throwable {
        super.parseResponseBody(httpResponse);
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                this.copyObject = new CopyObject();
                byte[] bArrBytes = httpResponse.bytes();
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrBytes);
                try {
                    XmlSlimParser.parseCopyObjectResult(byteArrayInputStream2, this.copyObject);
                    if (this.copyObject.eTag == null && bArrBytes != null && bArrBytes.length > 0) {
                        byteArrayInputStream2.reset();
                        CosXmlServiceException cosXmlServiceException = new CosXmlServiceException(f.f141859j);
                        CosError cosError = new CosError();
                        XmlSlimParser.parseError(byteArrayInputStream2, cosError);
                        cosXmlServiceException.setErrorCode(cosError.code);
                        cosXmlServiceException.setErrorMessage(cosError.message);
                        cosXmlServiceException.setRequestId(cosError.requestId);
                        cosXmlServiceException.setServiceName(cosError.resource);
                        cosXmlServiceException.setStatusCode(httpResponse.code());
                        throw cosXmlServiceException;
                    }
                    CloseUtil.closeQuietly(byteArrayInputStream2);
                } catch (IOException e10) {
                    e = e10;
                    throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e);
                } catch (XmlPullParserException e11) {
                    e = e11;
                    throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    CloseUtil.closeQuietly(byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (XmlPullParserException e13) {
            e = e13;
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        CopyObject copyObject = this.copyObject;
        return copyObject != null ? copyObject.toString() : super.printResult();
    }
}
