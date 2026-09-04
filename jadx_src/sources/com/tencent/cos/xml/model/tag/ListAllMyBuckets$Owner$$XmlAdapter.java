package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class ListAllMyBuckets$Owner$$XmlAdapter implements IXmlAdapter<ListAllMyBuckets.Owner> {
    private HashMap<String, ChildElementBinder<ListAllMyBuckets.Owner>> childElementBinders;

    public ListAllMyBuckets$Owner$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ListAllMyBuckets.Owner>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("ID", new ChildElementBinder<ListAllMyBuckets.Owner>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$Owner$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets.Owner owner) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                owner.f99467id = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("DisplayName", new ChildElementBinder<ListAllMyBuckets.Owner>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$Owner$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets.Owner owner) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                owner.disPlayName = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ListAllMyBuckets.Owner fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ListAllMyBuckets.Owner owner = new ListAllMyBuckets.Owner();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ListAllMyBuckets.Owner> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, owner);
                }
            } else if (eventType == 3 && "Owner".equalsIgnoreCase(xmlPullParser.getName())) {
                return owner;
            }
            eventType = xmlPullParser.next();
        }
        return owner;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, ListAllMyBuckets.Owner owner) throws XmlPullParserException, IOException {
        if (owner == null) {
            return;
        }
        xmlSerializer.startTag("", "Owner");
        if (owner.f99467id != null) {
            xmlSerializer.startTag("", "ID");
            xmlSerializer.text(String.valueOf(owner.f99467id));
            xmlSerializer.endTag("", "ID");
        }
        if (owner.disPlayName != null) {
            xmlSerializer.startTag("", "DisplayName");
            xmlSerializer.text(String.valueOf(owner.disPlayName));
            xmlSerializer.endTag("", "DisplayName");
        }
        xmlSerializer.endTag("", "Owner");
    }
}
