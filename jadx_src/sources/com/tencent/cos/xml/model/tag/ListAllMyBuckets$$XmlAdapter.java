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
public class ListAllMyBuckets$$XmlAdapter implements IXmlAdapter<ListAllMyBuckets> {
    private HashMap<String, ChildElementBinder<ListAllMyBuckets>> childElementBinders;

    public ListAllMyBuckets$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ListAllMyBuckets>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Owner", new ChildElementBinder<ListAllMyBuckets>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets listAllMyBuckets) throws XmlPullParserException, IOException {
                listAllMyBuckets.owner = (ListAllMyBuckets.Owner) QCloudXml.fromXml(xmlPullParser, ListAllMyBuckets.Owner.class);
            }
        });
        this.childElementBinders.put("Buckets", new ChildElementBinder<ListAllMyBuckets>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets listAllMyBuckets) throws XmlPullParserException, IOException {
                if (listAllMyBuckets.buckets == null) {
                    listAllMyBuckets.buckets = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        listAllMyBuckets.buckets.add((ListAllMyBuckets.Bucket) QCloudXml.fromXml(xmlPullParser, ListAllMyBuckets.Bucket.class));
                    } else if (eventType == 3 && "Buckets".equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ListAllMyBuckets fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ListAllMyBuckets listAllMyBuckets = new ListAllMyBuckets();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ListAllMyBuckets> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, listAllMyBuckets);
                }
            } else if (eventType == 3 && "ListAllMyBucketsResult".equalsIgnoreCase(xmlPullParser.getName())) {
                return listAllMyBuckets;
            }
            eventType = xmlPullParser.next();
        }
        return listAllMyBuckets;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, ListAllMyBuckets listAllMyBuckets) throws XmlPullParserException, IOException {
        if (listAllMyBuckets == null) {
            return;
        }
        xmlSerializer.startTag("", "ListAllMyBucketsResult");
        ListAllMyBuckets.Owner owner = listAllMyBuckets.owner;
        if (owner != null) {
            QCloudXml.toXml(xmlSerializer, owner);
        }
        xmlSerializer.startTag("", "Buckets");
        if (listAllMyBuckets.buckets != null) {
            for (int i10 = 0; i10 < listAllMyBuckets.buckets.size(); i10++) {
                QCloudXml.toXml(xmlSerializer, listAllMyBuckets.buckets.get(i10));
            }
        }
        xmlSerializer.endTag("", "Buckets");
        xmlSerializer.endTag("", "ListAllMyBucketsResult");
    }
}
