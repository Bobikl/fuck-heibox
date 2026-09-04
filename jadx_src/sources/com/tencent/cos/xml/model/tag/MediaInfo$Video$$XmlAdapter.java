package com.tencent.cos.xml.model.tag;

import com.google.common.net.c;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class MediaInfo$Video$$XmlAdapter implements IXmlAdapter<MediaInfo.Video> {
    private HashMap<String, ChildElementBinder<MediaInfo.Video>> childElementBinders;

    public MediaInfo$Video$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo.Video>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Index", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.index = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("CodecName", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.codecName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CodecLongName", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.codecLongName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CodecTimeBase", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.codecTimeBase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CodecTagString", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.codecTagString = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CodecTag", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.codecTag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Profile", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.profile = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Height", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.height = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(c.f58864t1, new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.width = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("HasBFrame", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.hasBFrame = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("RefFrames", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.refFrames = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Sar", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.sar = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Dar", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.dar = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("PixFormat", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.pixFormat = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("FieldOrder", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.fieldOrder = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Level", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.level = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Fps", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.fps = Float.parseFloat(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("AvgFps", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.avgFps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Timebase", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.timebase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("StartTime", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.20
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.startTime = Float.parseFloat(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Duration", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.21
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.duration = Float.parseFloat(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Bitrate", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.22
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.bitrate = Float.parseFloat(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("NumFrames", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.23
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.numFrames = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Language", new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.24
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                video.language = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo.Video fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        MediaInfo.Video video = new MediaInfo.Video();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo.Video> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, video);
                }
            } else if (eventType == 3 && "Video".equalsIgnoreCase(xmlPullParser.getName())) {
                return video;
            }
            eventType = xmlPullParser.next();
        }
        return video;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfo.Video video) throws XmlPullParserException, IOException {
        if (video == null) {
            return;
        }
        xmlSerializer.startTag("", "Video");
        xmlSerializer.startTag("", "Index");
        xmlSerializer.text(String.valueOf(video.index));
        xmlSerializer.endTag("", "Index");
        if (video.codecName != null) {
            xmlSerializer.startTag("", "CodecName");
            xmlSerializer.text(String.valueOf(video.codecName));
            xmlSerializer.endTag("", "CodecName");
        }
        if (video.codecLongName != null) {
            xmlSerializer.startTag("", "CodecLongName");
            xmlSerializer.text(String.valueOf(video.codecLongName));
            xmlSerializer.endTag("", "CodecLongName");
        }
        if (video.codecTimeBase != null) {
            xmlSerializer.startTag("", "CodecTimeBase");
            xmlSerializer.text(String.valueOf(video.codecTimeBase));
            xmlSerializer.endTag("", "CodecTimeBase");
        }
        if (video.codecTagString != null) {
            xmlSerializer.startTag("", "CodecTagString");
            xmlSerializer.text(String.valueOf(video.codecTagString));
            xmlSerializer.endTag("", "CodecTagString");
        }
        if (video.codecTag != null) {
            xmlSerializer.startTag("", "CodecTag");
            xmlSerializer.text(String.valueOf(video.codecTag));
            xmlSerializer.endTag("", "CodecTag");
        }
        if (video.profile != null) {
            xmlSerializer.startTag("", "Profile");
            xmlSerializer.text(String.valueOf(video.profile));
            xmlSerializer.endTag("", "Profile");
        }
        xmlSerializer.startTag("", "Height");
        xmlSerializer.text(String.valueOf(video.height));
        xmlSerializer.endTag("", "Height");
        xmlSerializer.startTag("", c.f58864t1);
        xmlSerializer.text(String.valueOf(video.width));
        xmlSerializer.endTag("", c.f58864t1);
        xmlSerializer.startTag("", "HasBFrame");
        xmlSerializer.text(String.valueOf(video.hasBFrame));
        xmlSerializer.endTag("", "HasBFrame");
        xmlSerializer.startTag("", "RefFrames");
        xmlSerializer.text(String.valueOf(video.refFrames));
        xmlSerializer.endTag("", "RefFrames");
        if (video.sar != null) {
            xmlSerializer.startTag("", "Sar");
            xmlSerializer.text(String.valueOf(video.sar));
            xmlSerializer.endTag("", "Sar");
        }
        if (video.dar != null) {
            xmlSerializer.startTag("", "Dar");
            xmlSerializer.text(String.valueOf(video.dar));
            xmlSerializer.endTag("", "Dar");
        }
        if (video.pixFormat != null) {
            xmlSerializer.startTag("", "PixFormat");
            xmlSerializer.text(String.valueOf(video.pixFormat));
            xmlSerializer.endTag("", "PixFormat");
        }
        if (video.fieldOrder != null) {
            xmlSerializer.startTag("", "FieldOrder");
            xmlSerializer.text(String.valueOf(video.fieldOrder));
            xmlSerializer.endTag("", "FieldOrder");
        }
        xmlSerializer.startTag("", "Level");
        xmlSerializer.text(String.valueOf(video.level));
        xmlSerializer.endTag("", "Level");
        xmlSerializer.startTag("", "Fps");
        xmlSerializer.text(String.valueOf(video.fps));
        xmlSerializer.endTag("", "Fps");
        if (video.avgFps != null) {
            xmlSerializer.startTag("", "AvgFps");
            xmlSerializer.text(String.valueOf(video.avgFps));
            xmlSerializer.endTag("", "AvgFps");
        }
        if (video.timebase != null) {
            xmlSerializer.startTag("", "Timebase");
            xmlSerializer.text(String.valueOf(video.timebase));
            xmlSerializer.endTag("", "Timebase");
        }
        xmlSerializer.startTag("", "StartTime");
        xmlSerializer.text(String.valueOf(video.startTime));
        xmlSerializer.endTag("", "StartTime");
        xmlSerializer.startTag("", "Duration");
        xmlSerializer.text(String.valueOf(video.duration));
        xmlSerializer.endTag("", "Duration");
        xmlSerializer.startTag("", "Bitrate");
        xmlSerializer.text(String.valueOf(video.bitrate));
        xmlSerializer.endTag("", "Bitrate");
        xmlSerializer.startTag("", "NumFrames");
        xmlSerializer.text(String.valueOf(video.numFrames));
        xmlSerializer.endTag("", "NumFrames");
        if (video.language != null) {
            xmlSerializer.startTag("", "Language");
            xmlSerializer.text(String.valueOf(video.language));
            xmlSerializer.endTag("", "Language");
        }
        xmlSerializer.endTag("", "Video");
    }
}
