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
public class BucketDocumentPreviewState$$XmlAdapter implements IXmlAdapter<BucketDocumentPreviewState> {
    private HashMap<String, ChildElementBinder<BucketDocumentPreviewState>> childElementBinders;

    public BucketDocumentPreviewState$$XmlAdapter() {
        HashMap<String, ChildElementBinder<BucketDocumentPreviewState>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put(y3.f135966f, new ChildElementBinder<BucketDocumentPreviewState>() { // from class: com.tencent.cos.xml.model.tag.BucketDocumentPreviewState$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BucketDocumentPreviewState bucketDocumentPreviewState) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                bucketDocumentPreviewState.Name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CreateTime", new ChildElementBinder<BucketDocumentPreviewState>() { // from class: com.tencent.cos.xml.model.tag.BucketDocumentPreviewState$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BucketDocumentPreviewState bucketDocumentPreviewState) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                bucketDocumentPreviewState.CreateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Region", new ChildElementBinder<BucketDocumentPreviewState>() { // from class: com.tencent.cos.xml.model.tag.BucketDocumentPreviewState$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BucketDocumentPreviewState bucketDocumentPreviewState) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                bucketDocumentPreviewState.Region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("BucketId", new ChildElementBinder<BucketDocumentPreviewState>() { // from class: com.tencent.cos.xml.model.tag.BucketDocumentPreviewState$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BucketDocumentPreviewState bucketDocumentPreviewState) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                bucketDocumentPreviewState.BucketId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public BucketDocumentPreviewState fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        BucketDocumentPreviewState bucketDocumentPreviewState = new BucketDocumentPreviewState();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<BucketDocumentPreviewState> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, bucketDocumentPreviewState);
                }
            } else if (eventType == 3 && "BucketDocumentPreviewState".equalsIgnoreCase(xmlPullParser.getName())) {
                return bucketDocumentPreviewState;
            }
            eventType = xmlPullParser.next();
        }
        return bucketDocumentPreviewState;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, BucketDocumentPreviewState bucketDocumentPreviewState) throws XmlPullParserException, IOException {
        if (bucketDocumentPreviewState == null) {
            return;
        }
        xmlSerializer.startTag("", "BucketDocumentPreviewState");
        if (bucketDocumentPreviewState.Name != null) {
            xmlSerializer.startTag("", y3.f135966f);
            xmlSerializer.text(String.valueOf(bucketDocumentPreviewState.Name));
            xmlSerializer.endTag("", y3.f135966f);
        }
        if (bucketDocumentPreviewState.CreateTime != null) {
            xmlSerializer.startTag("", "CreateTime");
            xmlSerializer.text(String.valueOf(bucketDocumentPreviewState.CreateTime));
            xmlSerializer.endTag("", "CreateTime");
        }
        if (bucketDocumentPreviewState.Region != null) {
            xmlSerializer.startTag("", "Region");
            xmlSerializer.text(String.valueOf(bucketDocumentPreviewState.Region));
            xmlSerializer.endTag("", "Region");
        }
        if (bucketDocumentPreviewState.BucketId != null) {
            xmlSerializer.startTag("", "BucketId");
            xmlSerializer.text(String.valueOf(bucketDocumentPreviewState.BucketId));
            xmlSerializer.endTag("", "BucketId");
        }
        xmlSerializer.endTag("", "BucketDocumentPreviewState");
    }
}
