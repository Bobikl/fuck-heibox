package com.tencent.cos.xml.model.tag.audit;

import androidx.exifinterface.media.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class GetAuditJobResponse$AudioSection$$XmlAdapter implements IXmlAdapter<GetAuditJobResponse.AudioSection> {
    private HashMap<String, ChildElementBinder<GetAuditJobResponse.AudioSection>> childElementBinders;

    public GetAuditJobResponse$AudioSection$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditJobResponse.AudioSection>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Url", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioSection.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Text", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioSection.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(a.f23327o0, new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioSection.offsetTime = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Duration", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioSection.duration = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Label", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioSection.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Result", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioSection.result = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("PornInfo", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                audioSection.pornInfo = (GetAuditJobResponse.AudioScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AudioScenarioInfo.class);
            }
        });
        this.childElementBinders.put("TerrorismInfo", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                audioSection.terrorismInfo = (GetAuditJobResponse.AudioScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AudioScenarioInfo.class);
            }
        });
        this.childElementBinders.put("PoliticsInfo", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                audioSection.politicsInfo = (GetAuditJobResponse.AudioScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AudioScenarioInfo.class);
            }
        });
        this.childElementBinders.put("AdsInfo", new ChildElementBinder<GetAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioSection$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
                audioSection.adsInfo = (GetAuditJobResponse.AudioScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AudioScenarioInfo.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditJobResponse.AudioSection fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        GetAuditJobResponse.AudioSection audioSection = new GetAuditJobResponse.AudioSection();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditJobResponse.AudioSection> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, audioSection);
                }
            } else if (eventType == 3 && "AudioSection".equalsIgnoreCase(xmlPullParser.getName())) {
                return audioSection;
            }
            eventType = xmlPullParser.next();
        }
        return audioSection;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, GetAuditJobResponse.AudioSection audioSection) throws XmlPullParserException, IOException {
        if (audioSection == null) {
            return;
        }
        xmlSerializer.startTag("", "AudioSection");
        if (audioSection.url != null) {
            xmlSerializer.startTag("", "Url");
            xmlSerializer.text(String.valueOf(audioSection.url));
            xmlSerializer.endTag("", "Url");
        }
        if (audioSection.text != null) {
            xmlSerializer.startTag("", "Text");
            xmlSerializer.text(String.valueOf(audioSection.text));
            xmlSerializer.endTag("", "Text");
        }
        xmlSerializer.startTag("", a.f23327o0);
        xmlSerializer.text(String.valueOf(audioSection.offsetTime));
        xmlSerializer.endTag("", a.f23327o0);
        xmlSerializer.startTag("", "Duration");
        xmlSerializer.text(String.valueOf(audioSection.duration));
        xmlSerializer.endTag("", "Duration");
        if (audioSection.label != null) {
            xmlSerializer.startTag("", "Label");
            xmlSerializer.text(String.valueOf(audioSection.label));
            xmlSerializer.endTag("", "Label");
        }
        xmlSerializer.startTag("", "Result");
        xmlSerializer.text(String.valueOf(audioSection.result));
        xmlSerializer.endTag("", "Result");
        GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo = audioSection.pornInfo;
        if (audioScenarioInfo != null) {
            QCloudXml.toXml(xmlSerializer, audioScenarioInfo);
        }
        GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo2 = audioSection.terrorismInfo;
        if (audioScenarioInfo2 != null) {
            QCloudXml.toXml(xmlSerializer, audioScenarioInfo2);
        }
        GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo3 = audioSection.politicsInfo;
        if (audioScenarioInfo3 != null) {
            QCloudXml.toXml(xmlSerializer, audioScenarioInfo3);
        }
        GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo4 = audioSection.adsInfo;
        if (audioScenarioInfo4 != null) {
            QCloudXml.toXml(xmlSerializer, audioScenarioInfo4);
        }
        xmlSerializer.endTag("", "AudioSection");
    }
}
