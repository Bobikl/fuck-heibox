package com.tencent.cos.xml.transfer;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.object.GetObjectBytesResult;
import com.tencent.cos.xml.model.tag.CosError;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.core.http.ResponseBodyConverter;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class ResponseBytesConverter<T> extends ResponseBodyConverter<T> {
    private GetObjectBytesResult getObjectBytesResult;

    public ResponseBytesConverter(GetObjectBytesResult getObjectBytesResult) {
        this.getObjectBytesResult = getObjectBytesResult;
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
                cosXmlServiceException.setErrorCode(cosError.code);
                cosXmlServiceException.setErrorMessage(cosError.message);
                cosXmlServiceException.setRequestId(cosError.requestId);
                cosXmlServiceException.setServiceName(cosError.resource);
                throw cosXmlServiceException;
            } catch (IOException e10) {
                throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
            } catch (XmlPullParserException e11) {
                throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
    public T convert(HttpResponse<T> httpResponse) throws QCloudServiceException, QCloudClientException {
        parseCOSXMLError(httpResponse);
        this.getObjectBytesResult.parseResponseBody(httpResponse);
        return (T) this.getObjectBytesResult;
    }
}
