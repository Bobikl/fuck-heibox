package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class RecognitionResult$AdsInfo$$XmlAdapter implements IXmlAdapter<RecognitionResult.AdsInfo> {
    private HashMap<String, ChildElementBinder<RecognitionResult.AdsInfo>> childElementBinders;

    public RecognitionResult$AdsInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult.AdsInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Code", new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                adsInfo.code = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Msg", new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                adsInfo.msg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("HitFlag", new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                adsInfo.hitFlag = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Score", new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                adsInfo.score = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Label", new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                adsInfo.label = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult.AdsInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        RecognitionResult.AdsInfo adsInfo = new RecognitionResult.AdsInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult.AdsInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, adsInfo);
                }
            } else if (eventType == 3 && "AdsInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return adsInfo;
            }
            eventType = xmlPullParser.next();
        }
        return adsInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RecognitionResult.AdsInfo adsInfo) throws XmlPullParserException, IOException {
        if (adsInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "AdsInfo");
        xmlSerializer.startTag("", "Code");
        xmlSerializer.text(String.valueOf(adsInfo.code));
        xmlSerializer.endTag("", "Code");
        if (adsInfo.msg != null) {
            xmlSerializer.startTag("", "Msg");
            xmlSerializer.text(String.valueOf(adsInfo.msg));
            xmlSerializer.endTag("", "Msg");
        }
        xmlSerializer.startTag("", "HitFlag");
        xmlSerializer.text(String.valueOf(adsInfo.hitFlag));
        xmlSerializer.endTag("", "HitFlag");
        xmlSerializer.startTag("", "Score");
        xmlSerializer.text(String.valueOf(adsInfo.score));
        xmlSerializer.endTag("", "Score");
        if (adsInfo.label != null) {
            xmlSerializer.startTag("", "Label");
            xmlSerializer.text(String.valueOf(adsInfo.label));
            xmlSerializer.endTag("", "Label");
        }
        xmlSerializer.endTag("", "AdsInfo");
    }
}
