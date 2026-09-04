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
public class PutBucketDPState$$XmlAdapter implements IXmlAdapter<PutBucketDPState> {
    private HashMap<String, ChildElementBinder<PutBucketDPState>> childElementBinders;

    public PutBucketDPState$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PutBucketDPState>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("RequestId", new ChildElementBinder<PutBucketDPState>() { // from class: com.tencent.cos.xml.model.tag.PutBucketDPState$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PutBucketDPState putBucketDPState) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                putBucketDPState.RequestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("DocBucket", new ChildElementBinder<PutBucketDPState>() { // from class: com.tencent.cos.xml.model.tag.PutBucketDPState$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PutBucketDPState putBucketDPState) throws XmlPullParserException, IOException {
                putBucketDPState.DocBucket = (BucketDocumentPreviewState) QCloudXml.fromXml(xmlPullParser, BucketDocumentPreviewState.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PutBucketDPState fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PutBucketDPState putBucketDPState = new PutBucketDPState();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PutBucketDPState> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, putBucketDPState);
                }
            } else if (eventType == 3 && "Response".equalsIgnoreCase(xmlPullParser.getName())) {
                return putBucketDPState;
            }
            eventType = xmlPullParser.next();
        }
        return putBucketDPState;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PutBucketDPState putBucketDPState) throws XmlPullParserException, IOException {
        if (putBucketDPState == null) {
            return;
        }
        xmlSerializer.startTag("", "Response");
        if (putBucketDPState.RequestId != null) {
            xmlSerializer.startTag("", "RequestId");
            xmlSerializer.text(String.valueOf(putBucketDPState.RequestId));
            xmlSerializer.endTag("", "RequestId");
        }
        BucketDocumentPreviewState bucketDocumentPreviewState = putBucketDPState.DocBucket;
        if (bucketDocumentPreviewState != null) {
            QCloudXml.toXml(xmlSerializer, bucketDocumentPreviewState);
        }
        xmlSerializer.endTag("", "Response");
    }
}
