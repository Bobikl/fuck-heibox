package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class GetAuditJobResponse$AudioScenarioInfo$$XmlAdapter implements IXmlAdapter<GetAuditJobResponse.AudioScenarioInfo> {
    private HashMap<String, ChildElementBinder<GetAuditJobResponse.AudioScenarioInfo>> childElementBinders;

    public GetAuditJobResponse$AudioScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditJobResponse.AudioScenarioInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("HitFlag", new ChildElementBinder<GetAuditJobResponse.AudioScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioScenarioInfo.hitFlag = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Score", new ChildElementBinder<GetAuditJobResponse.AudioScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioScenarioInfo.score = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Keywords", new ChildElementBinder<GetAuditJobResponse.AudioScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$AudioScenarioInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                audioScenarioInfo.keywords = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditJobResponse.AudioScenarioInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo = new GetAuditJobResponse.AudioScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditJobResponse.AudioScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, audioScenarioInfo);
                }
            } else if (eventType == 3 && "AudioScenarioInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return audioScenarioInfo;
            }
            eventType = xmlPullParser.next();
        }
        return audioScenarioInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, GetAuditJobResponse.AudioScenarioInfo audioScenarioInfo) throws XmlPullParserException, IOException {
        if (audioScenarioInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "AudioScenarioInfo");
        xmlSerializer.startTag("", "HitFlag");
        xmlSerializer.text(String.valueOf(audioScenarioInfo.hitFlag));
        xmlSerializer.endTag("", "HitFlag");
        xmlSerializer.startTag("", "Score");
        xmlSerializer.text(String.valueOf(audioScenarioInfo.score));
        xmlSerializer.endTag("", "Score");
        if (audioScenarioInfo.keywords != null) {
            xmlSerializer.startTag("", "Keywords");
            xmlSerializer.text(String.valueOf(audioScenarioInfo.keywords));
            xmlSerializer.endTag("", "Keywords");
        }
        xmlSerializer.endTag("", "AudioScenarioInfo");
    }
}
