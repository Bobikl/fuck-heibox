package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class MediaInfo$Subtitle$$XmlAdapter implements IXmlAdapter<MediaInfo.Subtitle> {
    private HashMap<String, ChildElementBinder<MediaInfo.Subtitle>> childElementBinders;

    public MediaInfo$Subtitle$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo.Subtitle>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Index", new ChildElementBinder<MediaInfo.Subtitle>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Subtitle$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Subtitle subtitle) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                subtitle.index = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Language", new ChildElementBinder<MediaInfo.Subtitle>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Subtitle$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Subtitle subtitle) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                subtitle.language = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo.Subtitle fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        MediaInfo.Subtitle subtitle = new MediaInfo.Subtitle();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo.Subtitle> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, subtitle);
                }
            } else if (eventType == 3 && "Subtitle".equalsIgnoreCase(xmlPullParser.getName())) {
                return subtitle;
            }
            eventType = xmlPullParser.next();
        }
        return subtitle;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfo.Subtitle subtitle) throws XmlPullParserException, IOException {
        if (subtitle == null) {
            return;
        }
        xmlSerializer.startTag("", "Subtitle");
        xmlSerializer.startTag("", "Index");
        xmlSerializer.text(String.valueOf(subtitle.index));
        xmlSerializer.endTag("", "Index");
        if (subtitle.language != null) {
            xmlSerializer.startTag("", "Language");
            xmlSerializer.text(String.valueOf(subtitle.language));
            xmlSerializer.endTag("", "Language");
        }
        xmlSerializer.endTag("", "Subtitle");
    }
}
