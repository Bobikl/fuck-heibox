package com.tencent.cos.xml.model.ci;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.RecognitionResult;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class SensitiveContentRecognitionResult extends CosXmlResult {

    @XmlElement(name = "RecognitionResult")
    public RecognitionResult recognitionResult;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        try {
            this.recognitionResult = (RecognitionResult) QCloudXml.fromXml(httpResponse.byteStream(), RecognitionResult.class);
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
