package com.tencent.cos.xml.model.object;

import androidx.annotation.p0;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.pic.PicUploadResult;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class PutObjectResult extends CosXmlResult {
    public String eTag;
    public PicUploadResult picUploadResult;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.eTag = httpResponse.header("ETag");
        try {
            this.picUploadResult = (PicUploadResult) QCloudXml.fromXml(httpResponse.byteStream(), PicUploadResult.class);
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    @p0
    public PicUploadResult picUploadResult() {
        return this.picUploadResult;
    }
}
