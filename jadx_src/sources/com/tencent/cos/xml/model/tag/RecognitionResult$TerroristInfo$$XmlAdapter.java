package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class RecognitionResult$TerroristInfo$$XmlAdapter implements IXmlAdapter<RecognitionResult.TerroristInfo> {
    private HashMap<String, ChildElementBinder<RecognitionResult.TerroristInfo>> childElementBinders;

    public RecognitionResult$TerroristInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult.TerroristInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Code", new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                terroristInfo.code = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Msg", new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                terroristInfo.msg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("HitFlag", new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                terroristInfo.hitFlag = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Score", new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                terroristInfo.score = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Label", new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                terroristInfo.label = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult.TerroristInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        RecognitionResult.TerroristInfo terroristInfo = new RecognitionResult.TerroristInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult.TerroristInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, terroristInfo);
                }
            } else if (eventType == 3 && "TerroristInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return terroristInfo;
            }
            eventType = xmlPullParser.next();
        }
        return terroristInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RecognitionResult.TerroristInfo terroristInfo) throws XmlPullParserException, IOException {
        if (terroristInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "TerroristInfo");
        xmlSerializer.startTag("", "Code");
        xmlSerializer.text(String.valueOf(terroristInfo.code));
        xmlSerializer.endTag("", "Code");
        if (terroristInfo.msg != null) {
            xmlSerializer.startTag("", "Msg");
            xmlSerializer.text(String.valueOf(terroristInfo.msg));
            xmlSerializer.endTag("", "Msg");
        }
        xmlSerializer.startTag("", "HitFlag");
        xmlSerializer.text(String.valueOf(terroristInfo.hitFlag));
        xmlSerializer.endTag("", "HitFlag");
        xmlSerializer.startTag("", "Score");
        xmlSerializer.text(String.valueOf(terroristInfo.score));
        xmlSerializer.endTag("", "Score");
        if (terroristInfo.label != null) {
            xmlSerializer.startTag("", "Label");
            xmlSerializer.text(String.valueOf(terroristInfo.label));
            xmlSerializer.endTag("", "Label");
        }
        xmlSerializer.endTag("", "TerroristInfo");
    }
}
