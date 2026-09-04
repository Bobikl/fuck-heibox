package com.tencent.cos.xml.model.tag.pic;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class PicOriginalInfo$$XmlAdapter implements IXmlAdapter<PicOriginalInfo> {
    private HashMap<String, ChildElementBinder<PicOriginalInfo>> childElementBinders;

    public PicOriginalInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PicOriginalInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Key", new ChildElementBinder<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picOriginalInfo.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Location", new ChildElementBinder<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picOriginalInfo.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("ETag", new ChildElementBinder<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picOriginalInfo.etag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("ImageInfo", new ChildElementBinder<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo) throws XmlPullParserException, IOException {
                picOriginalInfo.imageInfo = (ImageInfo) QCloudXml.fromXml(xmlPullParser, ImageInfo.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PicOriginalInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PicOriginalInfo picOriginalInfo = new PicOriginalInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PicOriginalInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, picOriginalInfo);
                }
            } else if (eventType == 3 && "OriginalInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return picOriginalInfo;
            }
            eventType = xmlPullParser.next();
        }
        return picOriginalInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PicOriginalInfo picOriginalInfo) throws XmlPullParserException, IOException {
        if (picOriginalInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "OriginalInfo");
        if (picOriginalInfo.key != null) {
            xmlSerializer.startTag("", "Key");
            xmlSerializer.text(String.valueOf(picOriginalInfo.key));
            xmlSerializer.endTag("", "Key");
        }
        if (picOriginalInfo.location != null) {
            xmlSerializer.startTag("", "Location");
            xmlSerializer.text(String.valueOf(picOriginalInfo.location));
            xmlSerializer.endTag("", "Location");
        }
        if (picOriginalInfo.etag != null) {
            xmlSerializer.startTag("", "ETag");
            xmlSerializer.text(String.valueOf(picOriginalInfo.etag));
            xmlSerializer.endTag("", "ETag");
        }
        ImageInfo imageInfo = picOriginalInfo.imageInfo;
        if (imageInfo != null) {
            QCloudXml.toXml(xmlSerializer, imageInfo);
        }
        xmlSerializer.endTag("", "OriginalInfo");
    }
}
