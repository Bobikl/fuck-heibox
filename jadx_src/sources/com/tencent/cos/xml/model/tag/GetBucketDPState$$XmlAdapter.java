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
public class GetBucketDPState$$XmlAdapter implements IXmlAdapter<GetBucketDPState> {
    private HashMap<String, ChildElementBinder<GetBucketDPState>> childElementBinders;

    public GetBucketDPState$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetBucketDPState>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("RequestId", new ChildElementBinder<GetBucketDPState>() { // from class: com.tencent.cos.xml.model.tag.GetBucketDPState$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetBucketDPState getBucketDPState) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                getBucketDPState.RequestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("DocBucketList", new ChildElementBinder<GetBucketDPState>() { // from class: com.tencent.cos.xml.model.tag.GetBucketDPState$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetBucketDPState getBucketDPState) throws XmlPullParserException, IOException {
                getBucketDPState.DocBucketList = (BucketDocumentPreviewState) QCloudXml.fromXml(xmlPullParser, BucketDocumentPreviewState.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetBucketDPState fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        GetBucketDPState getBucketDPState = new GetBucketDPState();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetBucketDPState> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getBucketDPState);
                }
            } else if (eventType == 3 && "Response".equalsIgnoreCase(xmlPullParser.getName())) {
                return getBucketDPState;
            }
            eventType = xmlPullParser.next();
        }
        return getBucketDPState;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, GetBucketDPState getBucketDPState) throws XmlPullParserException, IOException {
        if (getBucketDPState == null) {
            return;
        }
        xmlSerializer.startTag("", "Response");
        if (getBucketDPState.RequestId != null) {
            xmlSerializer.startTag("", "RequestId");
            xmlSerializer.text(String.valueOf(getBucketDPState.RequestId));
            xmlSerializer.endTag("", "RequestId");
        }
        BucketDocumentPreviewState bucketDocumentPreviewState = getBucketDPState.DocBucketList;
        if (bucketDocumentPreviewState != null) {
            QCloudXml.toXml(xmlSerializer, bucketDocumentPreviewState);
        }
        xmlSerializer.endTag("", "Response");
    }
}
