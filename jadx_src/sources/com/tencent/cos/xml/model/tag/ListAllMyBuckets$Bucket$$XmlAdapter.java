package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.apache.tools.ant.taskdefs.y3;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class ListAllMyBuckets$Bucket$$XmlAdapter implements IXmlAdapter<ListAllMyBuckets.Bucket> {
    private HashMap<String, ChildElementBinder<ListAllMyBuckets.Bucket>> childElementBinders;

    public ListAllMyBuckets$Bucket$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ListAllMyBuckets.Bucket>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put(y3.f135966f, new ChildElementBinder<ListAllMyBuckets.Bucket>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$Bucket$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets.Bucket bucket) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                bucket.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Location", new ChildElementBinder<ListAllMyBuckets.Bucket>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$Bucket$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets.Bucket bucket) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                bucket.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CreationDate", new ChildElementBinder<ListAllMyBuckets.Bucket>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$Bucket$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets.Bucket bucket) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                bucket.createDate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Type", new ChildElementBinder<ListAllMyBuckets.Bucket>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$Bucket$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets.Bucket bucket) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                bucket.type = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ListAllMyBuckets.Bucket fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ListAllMyBuckets.Bucket bucket = new ListAllMyBuckets.Bucket();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ListAllMyBuckets.Bucket> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, bucket);
                }
            } else if (eventType == 3 && "Bucket".equalsIgnoreCase(xmlPullParser.getName())) {
                return bucket;
            }
            eventType = xmlPullParser.next();
        }
        return bucket;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, ListAllMyBuckets.Bucket bucket) throws XmlPullParserException, IOException {
        if (bucket == null) {
            return;
        }
        xmlSerializer.startTag("", "Bucket");
        if (bucket.name != null) {
            xmlSerializer.startTag("", y3.f135966f);
            xmlSerializer.text(String.valueOf(bucket.name));
            xmlSerializer.endTag("", y3.f135966f);
        }
        if (bucket.location != null) {
            xmlSerializer.startTag("", "Location");
            xmlSerializer.text(String.valueOf(bucket.location));
            xmlSerializer.endTag("", "Location");
        }
        if (bucket.createDate != null) {
            xmlSerializer.startTag("", "CreationDate");
            xmlSerializer.text(String.valueOf(bucket.createDate));
            xmlSerializer.endTag("", "CreationDate");
        }
        if (bucket.type != null) {
            xmlSerializer.startTag("", "Type");
            xmlSerializer.text(String.valueOf(bucket.type));
            xmlSerializer.endTag("", "Type");
        }
        xmlSerializer.endTag("", "Bucket");
    }
}
