package com.tencent.cos.xml.model.tag;

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
public class Tagging$TagSet$$XmlAdapter implements IXmlAdapter<Tagging.TagSet> {
    private HashMap<String, ChildElementBinder<Tagging.TagSet>> childElementBinders;

    public Tagging$TagSet$$XmlAdapter() {
        HashMap<String, ChildElementBinder<Tagging.TagSet>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Tags", new ChildElementBinder<Tagging.TagSet>() { // from class: com.tencent.cos.xml.model.tag.Tagging$TagSet$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Tagging.TagSet tagSet) throws XmlPullParserException, IOException {
                if (tagSet.tags == null) {
                    tagSet.tags = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        tagSet.tags.add((Tagging.Tag) QCloudXml.fromXml(xmlPullParser, Tagging.Tag.class));
                    } else if (eventType == 3 && "Tags".equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public Tagging.TagSet fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Tagging.TagSet tagSet = new Tagging.TagSet();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<Tagging.TagSet> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, tagSet);
                }
            } else if (eventType == 3 && "TagSet".equalsIgnoreCase(xmlPullParser.getName())) {
                return tagSet;
            }
            eventType = xmlPullParser.next();
        }
        return tagSet;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, Tagging.TagSet tagSet) throws XmlPullParserException, IOException {
        if (tagSet == null) {
            return;
        }
        xmlSerializer.startTag("", "TagSet");
        if (tagSet.tags != null) {
            for (int i10 = 0; i10 < tagSet.tags.size(); i10++) {
                QCloudXml.toXml(xmlSerializer, tagSet.tags.get(i10));
            }
        }
        xmlSerializer.endTag("", "TagSet");
    }
}
