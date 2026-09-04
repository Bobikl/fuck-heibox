package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class Tagging$$XmlAdapter implements IXmlAdapter<Tagging> {
    private HashMap<String, ChildElementBinder<Tagging>> childElementBinders;

    public Tagging$$XmlAdapter() {
        HashMap<String, ChildElementBinder<Tagging>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("TagSet", new ChildElementBinder<Tagging>() { // from class: com.tencent.cos.xml.model.tag.Tagging$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Tagging tagging) throws XmlPullParserException, IOException {
                tagging.tagSet = (Tagging.TagSet) QCloudXml.fromXml(xmlPullParser, Tagging.TagSet.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public Tagging fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Tagging tagging = new Tagging();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<Tagging> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, tagging);
                }
            } else if (eventType == 3 && "Tagging".equalsIgnoreCase(xmlPullParser.getName())) {
                return tagging;
            }
            eventType = xmlPullParser.next();
        }
        return tagging;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, Tagging tagging) throws XmlPullParserException, IOException {
        if (tagging == null) {
            return;
        }
        xmlSerializer.startTag("", "Tagging");
        Tagging.TagSet tagSet = tagging.tagSet;
        if (tagSet != null) {
            QCloudXml.toXml(xmlSerializer, tagSet);
        }
        xmlSerializer.endTag("", "Tagging");
    }
}
