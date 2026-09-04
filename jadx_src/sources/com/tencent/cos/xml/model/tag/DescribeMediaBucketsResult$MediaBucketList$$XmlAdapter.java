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
public class DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter implements IXmlAdapter<DescribeMediaBucketsResult.MediaBucketList> {
    private HashMap<String, ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>> childElementBinders;

    public DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("BucketId", new ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult.MediaBucketList mediaBucketList) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                mediaBucketList.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(y3.f135966f, new ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult.MediaBucketList mediaBucketList) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                mediaBucketList.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Region", new ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult.MediaBucketList mediaBucketList) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                mediaBucketList.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CreateTime", new ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult.MediaBucketList mediaBucketList) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                mediaBucketList.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeMediaBucketsResult.MediaBucketList fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        DescribeMediaBucketsResult.MediaBucketList mediaBucketList = new DescribeMediaBucketsResult.MediaBucketList();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaBucketList);
                }
            } else if (eventType == 3 && "MediaBucketList".equalsIgnoreCase(xmlPullParser.getName())) {
                return mediaBucketList;
            }
            eventType = xmlPullParser.next();
        }
        return mediaBucketList;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, DescribeMediaBucketsResult.MediaBucketList mediaBucketList) throws XmlPullParserException, IOException {
        if (mediaBucketList == null) {
            return;
        }
        xmlSerializer.startTag("", "MediaBucketList");
        if (mediaBucketList.bucketId != null) {
            xmlSerializer.startTag("", "BucketId");
            xmlSerializer.text(String.valueOf(mediaBucketList.bucketId));
            xmlSerializer.endTag("", "BucketId");
        }
        if (mediaBucketList.name != null) {
            xmlSerializer.startTag("", y3.f135966f);
            xmlSerializer.text(String.valueOf(mediaBucketList.name));
            xmlSerializer.endTag("", y3.f135966f);
        }
        if (mediaBucketList.region != null) {
            xmlSerializer.startTag("", "Region");
            xmlSerializer.text(String.valueOf(mediaBucketList.region));
            xmlSerializer.endTag("", "Region");
        }
        if (mediaBucketList.createTime != null) {
            xmlSerializer.startTag("", "CreateTime");
            xmlSerializer.text(String.valueOf(mediaBucketList.createTime));
            xmlSerializer.endTag("", "CreateTime");
        }
        xmlSerializer.endTag("", "MediaBucketList");
    }
}
