package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class Tagging$Tag$$XmlAdapter implements IXmlAdapter<Tagging.Tag> {
    private HashMap<String, ChildElementBinder<Tagging.Tag>> childElementBinders;

    public Tagging$Tag$$XmlAdapter() {
        HashMap<String, ChildElementBinder<Tagging.Tag>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Key", new ChildElementBinder<Tagging.Tag>() { // from class: com.tencent.cos.xml.model.tag.Tagging$Tag$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Tagging.Tag tag) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                tag.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Value", new ChildElementBinder<Tagging.Tag>() { // from class: com.tencent.cos.xml.model.tag.Tagging$Tag$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Tagging.Tag tag) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                tag.value = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public Tagging.Tag fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Tagging.Tag tag = new Tagging.Tag();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<Tagging.Tag> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, tag);
                }
            } else if (eventType == 3 && "Tag".equalsIgnoreCase(xmlPullParser.getName())) {
                return tag;
            }
            eventType = xmlPullParser.next();
        }
        return tag;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, Tagging.Tag tag) throws XmlPullParserException, IOException {
        if (tag == null) {
            return;
        }
        xmlSerializer.startTag("", "Tag");
        if (tag.key != null) {
            xmlSerializer.startTag("", "Key");
            xmlSerializer.text(String.valueOf(tag.key));
            xmlSerializer.endTag("", "Key");
        }
        if (tag.value != null) {
            xmlSerializer.startTag("", "Value");
            xmlSerializer.text(String.valueOf(tag.value));
            xmlSerializer.endTag("", "Value");
        }
        xmlSerializer.endTag("", "Tag");
    }
}
