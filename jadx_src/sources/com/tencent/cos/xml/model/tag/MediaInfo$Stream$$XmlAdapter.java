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
public class MediaInfo$Stream$$XmlAdapter implements IXmlAdapter<MediaInfo.Stream> {
    private HashMap<String, ChildElementBinder<MediaInfo.Stream>> childElementBinders;

    public MediaInfo$Stream$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo.Stream>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Video", new ChildElementBinder<MediaInfo.Stream>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Stream$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Stream stream) throws XmlPullParserException, IOException {
                stream.video = (MediaInfo.Video) QCloudXml.fromXml(xmlPullParser, MediaInfo.Video.class);
            }
        });
        this.childElementBinders.put("Audio", new ChildElementBinder<MediaInfo.Stream>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Stream$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Stream stream) throws XmlPullParserException, IOException {
                stream.audio = (MediaInfo.Audio) QCloudXml.fromXml(xmlPullParser, MediaInfo.Audio.class);
            }
        });
        this.childElementBinders.put("Subtitle", new ChildElementBinder<MediaInfo.Stream>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Stream$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Stream stream) throws XmlPullParserException, IOException {
                stream.subtitle = (MediaInfo.Subtitle) QCloudXml.fromXml(xmlPullParser, MediaInfo.Subtitle.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo.Stream fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        MediaInfo.Stream stream = new MediaInfo.Stream();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo.Stream> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, stream);
                }
            } else if (eventType == 3 && "Stream".equalsIgnoreCase(xmlPullParser.getName())) {
                return stream;
            }
            eventType = xmlPullParser.next();
        }
        return stream;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfo.Stream stream) throws XmlPullParserException, IOException {
        if (stream == null) {
            return;
        }
        xmlSerializer.startTag("", "Stream");
        MediaInfo.Video video = stream.video;
        if (video != null) {
            QCloudXml.toXml(xmlSerializer, video);
        }
        MediaInfo.Audio audio = stream.audio;
        if (audio != null) {
            QCloudXml.toXml(xmlSerializer, audio);
        }
        MediaInfo.Subtitle subtitle = stream.subtitle;
        if (subtitle != null) {
            QCloudXml.toXml(xmlSerializer, subtitle);
        }
        xmlSerializer.endTag("", "Stream");
    }
}
