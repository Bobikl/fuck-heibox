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
public class MediaInfo$$XmlAdapter implements IXmlAdapter<MediaInfo> {
    private HashMap<String, ChildElementBinder<MediaInfo>> childElementBinders;

    public MediaInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Stream", new ChildElementBinder<MediaInfo>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo mediaInfo) throws XmlPullParserException, IOException {
                mediaInfo.stream = (MediaInfo.Stream) QCloudXml.fromXml(xmlPullParser, MediaInfo.Stream.class);
            }
        });
        this.childElementBinders.put("Format", new ChildElementBinder<MediaInfo>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo mediaInfo) throws XmlPullParserException, IOException {
                mediaInfo.format = (MediaInfo.Format) QCloudXml.fromXml(xmlPullParser, MediaInfo.Format.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        MediaInfo mediaInfo = new MediaInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaInfo);
                }
            } else if (eventType == 3 && "MediaInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return mediaInfo;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfo mediaInfo) throws XmlPullParserException, IOException {
        if (mediaInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "MediaInfo");
        MediaInfo.Stream stream = mediaInfo.stream;
        if (stream != null) {
            QCloudXml.toXml(xmlSerializer, stream);
        }
        MediaInfo.Format format = mediaInfo.format;
        if (format != null) {
            QCloudXml.toXml(xmlSerializer, format);
        }
        xmlSerializer.endTag("", "MediaInfo");
    }
}
