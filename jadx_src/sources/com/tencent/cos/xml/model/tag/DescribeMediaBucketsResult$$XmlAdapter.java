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
public class DescribeMediaBucketsResult$$XmlAdapter implements IXmlAdapter<DescribeMediaBucketsResult> {
    private HashMap<String, ChildElementBinder<DescribeMediaBucketsResult>> childElementBinders;

    public DescribeMediaBucketsResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeMediaBucketsResult>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("RequestId", new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                describeMediaBucketsResult.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("TotalCount", new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                describeMediaBucketsResult.totalCount = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("PageNumber", new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                describeMediaBucketsResult.pageNumber = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("PageSize", new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                describeMediaBucketsResult.pageSize = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("MediaBucketList", new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult) throws XmlPullParserException, IOException {
                if (describeMediaBucketsResult.mediaBucketList == null) {
                    describeMediaBucketsResult.mediaBucketList = new ArrayList();
                }
                describeMediaBucketsResult.mediaBucketList.add((DescribeMediaBucketsResult.MediaBucketList) QCloudXml.fromXml(xmlPullParser, DescribeMediaBucketsResult.MediaBucketList.class));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeMediaBucketsResult fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        DescribeMediaBucketsResult describeMediaBucketsResult = new DescribeMediaBucketsResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeMediaBucketsResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, describeMediaBucketsResult);
                }
            } else if (eventType == 3 && "Response".equalsIgnoreCase(xmlPullParser.getName())) {
                return describeMediaBucketsResult;
            }
            eventType = xmlPullParser.next();
        }
        return describeMediaBucketsResult;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, DescribeMediaBucketsResult describeMediaBucketsResult) throws XmlPullParserException, IOException {
        if (describeMediaBucketsResult == null) {
            return;
        }
        xmlSerializer.startTag("", "Response");
        if (describeMediaBucketsResult.requestId != null) {
            xmlSerializer.startTag("", "RequestId");
            xmlSerializer.text(String.valueOf(describeMediaBucketsResult.requestId));
            xmlSerializer.endTag("", "RequestId");
        }
        xmlSerializer.startTag("", "TotalCount");
        xmlSerializer.text(String.valueOf(describeMediaBucketsResult.totalCount));
        xmlSerializer.endTag("", "TotalCount");
        xmlSerializer.startTag("", "PageNumber");
        xmlSerializer.text(String.valueOf(describeMediaBucketsResult.pageNumber));
        xmlSerializer.endTag("", "PageNumber");
        xmlSerializer.startTag("", "PageSize");
        xmlSerializer.text(String.valueOf(describeMediaBucketsResult.pageSize));
        xmlSerializer.endTag("", "PageSize");
        xmlSerializer.startTag("", "MediaBucketList");
        if (describeMediaBucketsResult.mediaBucketList != null) {
            for (int i10 = 0; i10 < describeMediaBucketsResult.mediaBucketList.size(); i10++) {
                QCloudXml.toXml(xmlSerializer, describeMediaBucketsResult.mediaBucketList.get(i10));
            }
        }
        xmlSerializer.endTag("", "MediaBucketList");
        xmlSerializer.endTag("", "Response");
    }
}
