package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class GetAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter implements IXmlAdapter<GetAuditJobResponse.SnapshotAuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo>> childElementBinders;

    public GetAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("HitFlag", new ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshotAuditScenarioInfo.hitFlag = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Score", new ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshotAuditScenarioInfo.score = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Label", new ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshotAuditScenarioInfo.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("SubLabel", new ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshotAuditScenarioInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("OcrResults", new ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo) throws XmlPullParserException, IOException {
                snapshotAuditScenarioInfo.ocrResults = (AuditOcrResults) QCloudXml.fromXml(xmlPullParser, AuditOcrResults.class);
            }
        });
        this.childElementBinders.put("ObjectResults", new ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo) throws XmlPullParserException, IOException {
                snapshotAuditScenarioInfo.objectResults = (GetAuditJobResponse.ObjectResults) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.ObjectResults.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditJobResponse.SnapshotAuditScenarioInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo = new GetAuditJobResponse.SnapshotAuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditJobResponse.SnapshotAuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, snapshotAuditScenarioInfo);
                }
            } else if (eventType == 3 && "SnapshotAuditScenarioInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return snapshotAuditScenarioInfo;
            }
            eventType = xmlPullParser.next();
        }
        return snapshotAuditScenarioInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo) throws XmlPullParserException, IOException {
        if (snapshotAuditScenarioInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "SnapshotAuditScenarioInfo");
        xmlSerializer.startTag("", "HitFlag");
        xmlSerializer.text(String.valueOf(snapshotAuditScenarioInfo.hitFlag));
        xmlSerializer.endTag("", "HitFlag");
        xmlSerializer.startTag("", "Score");
        xmlSerializer.text(String.valueOf(snapshotAuditScenarioInfo.score));
        xmlSerializer.endTag("", "Score");
        if (snapshotAuditScenarioInfo.label != null) {
            xmlSerializer.startTag("", "Label");
            xmlSerializer.text(String.valueOf(snapshotAuditScenarioInfo.label));
            xmlSerializer.endTag("", "Label");
        }
        if (snapshotAuditScenarioInfo.subLabel != null) {
            xmlSerializer.startTag("", "SubLabel");
            xmlSerializer.text(String.valueOf(snapshotAuditScenarioInfo.subLabel));
            xmlSerializer.endTag("", "SubLabel");
        }
        AuditOcrResults auditOcrResults = snapshotAuditScenarioInfo.ocrResults;
        if (auditOcrResults != null) {
            QCloudXml.toXml(xmlSerializer, auditOcrResults);
        }
        GetAuditJobResponse.ObjectResults objectResults = snapshotAuditScenarioInfo.objectResults;
        if (objectResults != null) {
            QCloudXml.toXml(xmlSerializer, objectResults);
        }
        xmlSerializer.endTag("", "SnapshotAuditScenarioInfo");
    }
}
