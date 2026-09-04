package com.tencent.cos.xml.model.tag.pic;

import androidx.exifinterface.media.a;
import com.google.common.net.c;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class ImageInfo$$XmlAdapter implements IXmlAdapter<ImageInfo> {
    private HashMap<String, ChildElementBinder<ImageInfo>> childElementBinders;

    public ImageInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ImageInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Format", new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(c.f58864t1, new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.width = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Height", new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.height = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Quality", new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.quality = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Ave", new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.ave = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(a.C, new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                imageInfo.orientation = Integer.parseInt(xmlPullParser.getText());
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ImageInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ImageInfo imageInfo = new ImageInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ImageInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, imageInfo);
                }
            } else if (eventType == 3 && "ImageInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return imageInfo;
            }
            eventType = xmlPullParser.next();
        }
        return imageInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, ImageInfo imageInfo) throws XmlPullParserException, IOException {
        if (imageInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "ImageInfo");
        if (imageInfo.format != null) {
            xmlSerializer.startTag("", "Format");
            xmlSerializer.text(String.valueOf(imageInfo.format));
            xmlSerializer.endTag("", "Format");
        }
        xmlSerializer.startTag("", c.f58864t1);
        xmlSerializer.text(String.valueOf(imageInfo.width));
        xmlSerializer.endTag("", c.f58864t1);
        xmlSerializer.startTag("", "Height");
        xmlSerializer.text(String.valueOf(imageInfo.height));
        xmlSerializer.endTag("", "Height");
        xmlSerializer.startTag("", "Quality");
        xmlSerializer.text(String.valueOf(imageInfo.quality));
        xmlSerializer.endTag("", "Quality");
        if (imageInfo.ave != null) {
            xmlSerializer.startTag("", "Ave");
            xmlSerializer.text(String.valueOf(imageInfo.ave));
            xmlSerializer.endTag("", "Ave");
        }
        xmlSerializer.startTag("", a.C);
        xmlSerializer.text(String.valueOf(imageInfo.orientation));
        xmlSerializer.endTag("", a.C);
        xmlSerializer.endTag("", "ImageInfo");
    }
}
