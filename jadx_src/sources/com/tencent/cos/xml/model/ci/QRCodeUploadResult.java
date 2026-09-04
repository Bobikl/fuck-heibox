package com.tencent.cos.xml.model.ci;

import com.google.common.net.c;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.tag.pic.PicOriginalInfo;
import com.tencent.cos.xml.model.tag.pic.QRCodeInfo;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class QRCodeUploadResult extends ImageUploadResult {
    public PicUploadResult picUploadResult;

    @XmlBean(name = "Object")
    public static class PicObject {

        @XmlElement(name = "ETag")
        public String etag;

        @XmlElement(name = "Format")
        public String format;

        @XmlElement(name = "Height")
        public int height;

        @XmlElement(name = "Key")
        public String key;

        @XmlElement(name = "Location")
        public String location;

        @XmlElement(name = "QRcodeInfo")
        public QRCodeInfo qrCodeInfo;

        @XmlElement(name = "Quality")
        public int quality;

        @XmlElement(name = "Size")
        public int size;

        @XmlElement(name = c.f58864t1)
        public int width;

        public PicObject() {
        }

        public PicObject(String str, String str2, String str3, int i10, int i11, int i12, int i13) {
            this.key = str;
            this.location = str2;
            this.format = str3;
            this.width = i10;
            this.height = i11;
            this.size = i12;
            this.quality = i13;
        }
    }

    @XmlBean(name = "UploadResult")
    public static class PicUploadResult {

        @XmlElement(name = "OriginalInfo")
        public PicOriginalInfo originalInfo;

        @XmlElement(name = "ProcessResults")
        public List<PicObject> processResults;
    }

    public PicUploadResult getPicUploadResult() {
        return this.picUploadResult;
    }

    @Override // com.tencent.cos.xml.model.ci.ImageUploadResult, com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        try {
            this.picUploadResult = (PicUploadResult) QCloudXml.fromXml(httpResponse.byteStream(), PicUploadResult.class);
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
