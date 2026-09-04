package com.tencent.cos.xml.model.tag;

import com.tencent.cos.xml.model.tag.pic.ImageInfo;
import com.tencent.cos.xml.model.tag.pic.PicObject;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class CompleteMultipartUploadResult$$XmlAdapter implements IXmlAdapter<CompleteMultipartUploadResult> {
    private HashMap<String, ChildElementBinder<CompleteMultipartUploadResult>> childElementBinders;

    public CompleteMultipartUploadResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CompleteMultipartUploadResult>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Key", new ChildElementBinder<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                completeMultipartUploadResult.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Location", new ChildElementBinder<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                completeMultipartUploadResult.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("ETag", new ChildElementBinder<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                completeMultipartUploadResult.eTag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("ImageInfo", new ChildElementBinder<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult) throws XmlPullParserException, IOException {
                completeMultipartUploadResult.imageInfo = (ImageInfo) QCloudXml.fromXml(xmlPullParser, ImageInfo.class);
            }
        });
        this.childElementBinders.put("ProcessResults", new ChildElementBinder<CompleteMultipartUploadResult>() { // from class: com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CompleteMultipartUploadResult completeMultipartUploadResult) throws XmlPullParserException, IOException {
                if (completeMultipartUploadResult.processResults == null) {
                    completeMultipartUploadResult.processResults = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        completeMultipartUploadResult.processResults.add((PicObject) QCloudXml.fromXml(xmlPullParser, PicObject.class));
                    } else if (eventType == 3 && "ProcessResults".equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CompleteMultipartUploadResult fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        CompleteMultipartUploadResult completeMultipartUploadResult = new CompleteMultipartUploadResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CompleteMultipartUploadResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, completeMultipartUploadResult);
                }
            } else if (eventType == 3 && "CompleteMultipartUploadResult".equalsIgnoreCase(xmlPullParser.getName())) {
                return completeMultipartUploadResult;
            }
            eventType = xmlPullParser.next();
        }
        return completeMultipartUploadResult;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CompleteMultipartUploadResult completeMultipartUploadResult) throws XmlPullParserException, IOException {
        if (completeMultipartUploadResult == null) {
            return;
        }
        xmlSerializer.startTag("", "CompleteMultipartUploadResult");
        if (completeMultipartUploadResult.key != null) {
            xmlSerializer.startTag("", "Key");
            xmlSerializer.text(String.valueOf(completeMultipartUploadResult.key));
            xmlSerializer.endTag("", "Key");
        }
        if (completeMultipartUploadResult.location != null) {
            xmlSerializer.startTag("", "Location");
            xmlSerializer.text(String.valueOf(completeMultipartUploadResult.location));
            xmlSerializer.endTag("", "Location");
        }
        if (completeMultipartUploadResult.eTag != null) {
            xmlSerializer.startTag("", "ETag");
            xmlSerializer.text(String.valueOf(completeMultipartUploadResult.eTag));
            xmlSerializer.endTag("", "ETag");
        }
        ImageInfo imageInfo = completeMultipartUploadResult.imageInfo;
        if (imageInfo != null) {
            QCloudXml.toXml(xmlSerializer, imageInfo);
        }
        xmlSerializer.startTag("", "ProcessResults");
        if (completeMultipartUploadResult.processResults != null) {
            for (int i10 = 0; i10 < completeMultipartUploadResult.processResults.size(); i10++) {
                QCloudXml.toXml(xmlSerializer, completeMultipartUploadResult.processResults.get(i10));
            }
        }
        xmlSerializer.endTag("", "ProcessResults");
        xmlSerializer.endTag("", "CompleteMultipartUploadResult");
    }
}
