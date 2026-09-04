package com.tencent.cos.xml.transfer;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.CosError;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.core.http.ResponseBodyConverter;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class ResponseXmlS3BodySerializer<T> extends ResponseBodyConverter<T> {
    private CosXmlResult cosXmlResult;

    public ResponseXmlS3BodySerializer(CosXmlResult cosXmlResult) {
        this.cosXmlResult = cosXmlResult;
    }

    private void parseCOSXMLError(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        int iCode = httpResponse.code();
        if (iCode < 200 || iCode >= 300) {
            CosXmlServiceException cosXmlServiceException = new CosXmlServiceException(httpResponse.message());
            cosXmlServiceException.setStatusCode(iCode);
            cosXmlServiceException.setRequestId(httpResponse.header(Headers.REQUEST_ID));
            InputStream inputStreamByteStream = httpResponse.byteStream();
            if (inputStreamByteStream == null) {
                throw cosXmlServiceException;
            }
            CosError cosError = new CosError();
            try {
                XmlSlimParser.parseError(inputStreamByteStream, cosError);
                String str = cosError.code;
                if (str != null) {
                    cosXmlServiceException.setErrorCode(str);
                }
                String str2 = cosError.message;
                if (str2 != null) {
                    cosXmlServiceException.setErrorMessage(str2);
                }
                String str3 = cosError.requestId;
                if (str3 != null) {
                    cosXmlServiceException.setRequestId(str3);
                }
                String str4 = cosError.resource;
                if (str4 == null) {
                    throw cosXmlServiceException;
                }
                cosXmlServiceException.setServiceName(str4);
                throw cosXmlServiceException;
            } catch (IOException e10) {
                throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
            } catch (XmlPullParserException e11) {
                throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
    public T convert(HttpResponse httpResponse) throws QCloudServiceException, QCloudClientException {
        parseCOSXMLError(httpResponse);
        this.cosXmlResult.parseResponseBody(httpResponse);
        return (T) this.cosXmlResult;
    }
}
