package com.tencent.cos.xml.model.tag.pic;

import com.google.common.net.c;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class PicObject$$XmlAdapter implements IXmlAdapter<PicObject> {
    private HashMap<String, ChildElementBinder<PicObject>> childElementBinders;

    public PicObject$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PicObject>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Key", new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Location", new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Format", new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(c.f58864t1, new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.width = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Height", new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.height = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Size", new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.size = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Quality", new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.quality = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("ETag", new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                picObject.etag = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PicObject fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PicObject picObject = new PicObject();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PicObject> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, picObject);
                }
            } else if (eventType == 3 && "Object".equalsIgnoreCase(xmlPullParser.getName())) {
                return picObject;
            }
            eventType = xmlPullParser.next();
        }
        return picObject;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PicObject picObject) throws XmlPullParserException, IOException {
        if (picObject == null) {
            return;
        }
        xmlSerializer.startTag("", "Object");
        if (picObject.key != null) {
            xmlSerializer.startTag("", "Key");
            xmlSerializer.text(String.valueOf(picObject.key));
            xmlSerializer.endTag("", "Key");
        }
        if (picObject.location != null) {
            xmlSerializer.startTag("", "Location");
            xmlSerializer.text(String.valueOf(picObject.location));
            xmlSerializer.endTag("", "Location");
        }
        if (picObject.format != null) {
            xmlSerializer.startTag("", "Format");
            xmlSerializer.text(String.valueOf(picObject.format));
            xmlSerializer.endTag("", "Format");
        }
        xmlSerializer.startTag("", c.f58864t1);
        xmlSerializer.text(String.valueOf(picObject.width));
        xmlSerializer.endTag("", c.f58864t1);
        xmlSerializer.startTag("", "Height");
        xmlSerializer.text(String.valueOf(picObject.height));
        xmlSerializer.endTag("", "Height");
        xmlSerializer.startTag("", "Size");
        xmlSerializer.text(String.valueOf(picObject.size));
        xmlSerializer.endTag("", "Size");
        xmlSerializer.startTag("", "Quality");
        xmlSerializer.text(String.valueOf(picObject.quality));
        xmlSerializer.endTag("", "Quality");
        if (picObject.etag != null) {
            xmlSerializer.startTag("", "ETag");
            xmlSerializer.text(String.valueOf(picObject.etag));
            xmlSerializer.endTag("", "ETag");
        }
        xmlSerializer.endTag("", "Object");
    }
}
