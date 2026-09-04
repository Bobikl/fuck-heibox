package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class RecognitionResult$PornInfo$$XmlAdapter implements IXmlAdapter<RecognitionResult.PornInfo> {
    private HashMap<String, ChildElementBinder<RecognitionResult.PornInfo>> childElementBinders;

    public RecognitionResult$PornInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult.PornInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Code", new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                pornInfo.code = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Msg", new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                pornInfo.msg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("HitFlag", new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                pornInfo.hitFlag = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Score", new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                pornInfo.score = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Label", new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                pornInfo.label = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult.PornInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        RecognitionResult.PornInfo pornInfo = new RecognitionResult.PornInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult.PornInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, pornInfo);
                }
            } else if (eventType == 3 && "PornInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return pornInfo;
            }
            eventType = xmlPullParser.next();
        }
        return pornInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RecognitionResult.PornInfo pornInfo) throws XmlPullParserException, IOException {
        if (pornInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "PornInfo");
        xmlSerializer.startTag("", "Code");
        xmlSerializer.text(String.valueOf(pornInfo.code));
        xmlSerializer.endTag("", "Code");
        if (pornInfo.msg != null) {
            xmlSerializer.startTag("", "Msg");
            xmlSerializer.text(String.valueOf(pornInfo.msg));
            xmlSerializer.endTag("", "Msg");
        }
        xmlSerializer.startTag("", "HitFlag");
        xmlSerializer.text(String.valueOf(pornInfo.hitFlag));
        xmlSerializer.endTag("", "HitFlag");
        xmlSerializer.startTag("", "Score");
        xmlSerializer.text(String.valueOf(pornInfo.score));
        xmlSerializer.endTag("", "Score");
        if (pornInfo.label != null) {
            xmlSerializer.startTag("", "Label");
            xmlSerializer.text(String.valueOf(pornInfo.label));
            xmlSerializer.endTag("", "Label");
        }
        xmlSerializer.endTag("", "PornInfo");
    }
}
