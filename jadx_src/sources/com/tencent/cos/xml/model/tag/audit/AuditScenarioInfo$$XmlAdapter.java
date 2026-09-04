package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class AuditScenarioInfo$$XmlAdapter implements IXmlAdapter<AuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<AuditScenarioInfo>> childElementBinders;

    public AuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditScenarioInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("HitFlag", new ChildElementBinder<AuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditScenarioInfo auditScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditScenarioInfo.hitFlag = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Count", new ChildElementBinder<AuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditScenarioInfo auditScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditScenarioInfo.count = Integer.parseInt(xmlPullParser.getText());
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditScenarioInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AuditScenarioInfo auditScenarioInfo = new AuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditScenarioInfo);
                }
            } else if (eventType == 3 && "AuditScenarioInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return auditScenarioInfo;
            }
            eventType = xmlPullParser.next();
        }
        return auditScenarioInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditScenarioInfo auditScenarioInfo) throws XmlPullParserException, IOException {
        if (auditScenarioInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "AuditScenarioInfo");
        xmlSerializer.startTag("", "HitFlag");
        xmlSerializer.text(String.valueOf(auditScenarioInfo.hitFlag));
        xmlSerializer.endTag("", "HitFlag");
        xmlSerializer.startTag("", "Count");
        xmlSerializer.text(String.valueOf(auditScenarioInfo.count));
        xmlSerializer.endTag("", "Count");
        xmlSerializer.endTag("", "AuditScenarioInfo");
    }
}
