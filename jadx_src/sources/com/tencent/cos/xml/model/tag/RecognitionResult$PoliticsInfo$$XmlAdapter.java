package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class RecognitionResult$PoliticsInfo$$XmlAdapter implements IXmlAdapter<RecognitionResult.PoliticsInfo> {
    private HashMap<String, ChildElementBinder<RecognitionResult.PoliticsInfo>> childElementBinders;

    public RecognitionResult$PoliticsInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult.PoliticsInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Code", new ChildElementBinder<RecognitionResult.PoliticsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PoliticsInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PoliticsInfo politicsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                politicsInfo.code = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Msg", new ChildElementBinder<RecognitionResult.PoliticsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PoliticsInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PoliticsInfo politicsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                politicsInfo.msg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("HitFlag", new ChildElementBinder<RecognitionResult.PoliticsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PoliticsInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PoliticsInfo politicsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                politicsInfo.hitFlag = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Score", new ChildElementBinder<RecognitionResult.PoliticsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PoliticsInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PoliticsInfo politicsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                politicsInfo.score = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Label", new ChildElementBinder<RecognitionResult.PoliticsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PoliticsInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PoliticsInfo politicsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                politicsInfo.label = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult.PoliticsInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        RecognitionResult.PoliticsInfo politicsInfo = new RecognitionResult.PoliticsInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult.PoliticsInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, politicsInfo);
                }
            } else if (eventType == 3 && "PoliticsInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return politicsInfo;
            }
            eventType = xmlPullParser.next();
        }
        return politicsInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RecognitionResult.PoliticsInfo politicsInfo) throws XmlPullParserException, IOException {
        if (politicsInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "PoliticsInfo");
        xmlSerializer.startTag("", "Code");
        xmlSerializer.text(String.valueOf(politicsInfo.code));
        xmlSerializer.endTag("", "Code");
        if (politicsInfo.msg != null) {
            xmlSerializer.startTag("", "Msg");
            xmlSerializer.text(String.valueOf(politicsInfo.msg));
            xmlSerializer.endTag("", "Msg");
        }
        xmlSerializer.startTag("", "HitFlag");
        xmlSerializer.text(String.valueOf(politicsInfo.hitFlag));
        xmlSerializer.endTag("", "HitFlag");
        xmlSerializer.startTag("", "Score");
        xmlSerializer.text(String.valueOf(politicsInfo.score));
        xmlSerializer.endTag("", "Score");
        if (politicsInfo.label != null) {
            xmlSerializer.startTag("", "Label");
            xmlSerializer.text(String.valueOf(politicsInfo.label));
            xmlSerializer.endTag("", "Label");
        }
        xmlSerializer.endTag("", "PoliticsInfo");
    }
}
