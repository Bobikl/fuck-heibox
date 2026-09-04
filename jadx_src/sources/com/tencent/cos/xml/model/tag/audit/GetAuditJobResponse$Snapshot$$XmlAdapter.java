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
public class GetAuditJobResponse$Snapshot$$XmlAdapter implements IXmlAdapter<GetAuditJobResponse.Snapshot> {
    private HashMap<String, ChildElementBinder<GetAuditJobResponse.Snapshot>> childElementBinders;

    public GetAuditJobResponse$Snapshot$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditJobResponse.Snapshot>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Url", new ChildElementBinder<GetAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$Snapshot$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.Snapshot snapshot) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshot.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("SnapshotTime", new ChildElementBinder<GetAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$Snapshot$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.Snapshot snapshot) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshot.snapshotTime = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Text", new ChildElementBinder<GetAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$Snapshot$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.Snapshot snapshot) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshot.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("PornInfo", new ChildElementBinder<GetAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$Snapshot$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.Snapshot snapshot) throws XmlPullParserException, IOException {
                snapshot.pornInfo = (GetAuditJobResponse.SnapshotAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo.class);
            }
        });
        this.childElementBinders.put("TerrorismInfo", new ChildElementBinder<GetAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$Snapshot$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.Snapshot snapshot) throws XmlPullParserException, IOException {
                snapshot.terrorismInfo = (GetAuditJobResponse.SnapshotAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo.class);
            }
        });
        this.childElementBinders.put("PoliticsInfo", new ChildElementBinder<GetAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$Snapshot$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.Snapshot snapshot) throws XmlPullParserException, IOException {
                snapshot.politicsInfo = (GetAuditJobResponse.SnapshotAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo.class);
            }
        });
        this.childElementBinders.put("AdsInfo", new ChildElementBinder<GetAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$Snapshot$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.Snapshot snapshot) throws XmlPullParserException, IOException {
                snapshot.adsInfo = (GetAuditJobResponse.SnapshotAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.SnapshotAuditScenarioInfo.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditJobResponse.Snapshot fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        GetAuditJobResponse.Snapshot snapshot = new GetAuditJobResponse.Snapshot();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditJobResponse.Snapshot> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, snapshot);
                }
            } else if (eventType == 3 && "Snapshot".equalsIgnoreCase(xmlPullParser.getName())) {
                return snapshot;
            }
            eventType = xmlPullParser.next();
        }
        return snapshot;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, GetAuditJobResponse.Snapshot snapshot) throws XmlPullParserException, IOException {
        if (snapshot == null) {
            return;
        }
        xmlSerializer.startTag("", "Snapshot");
        if (snapshot.url != null) {
            xmlSerializer.startTag("", "Url");
            xmlSerializer.text(String.valueOf(snapshot.url));
            xmlSerializer.endTag("", "Url");
        }
        xmlSerializer.startTag("", "SnapshotTime");
        xmlSerializer.text(String.valueOf(snapshot.snapshotTime));
        xmlSerializer.endTag("", "SnapshotTime");
        if (snapshot.text != null) {
            xmlSerializer.startTag("", "Text");
            xmlSerializer.text(String.valueOf(snapshot.text));
            xmlSerializer.endTag("", "Text");
        }
        GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo = snapshot.pornInfo;
        if (snapshotAuditScenarioInfo != null) {
            QCloudXml.toXml(xmlSerializer, snapshotAuditScenarioInfo);
        }
        GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo2 = snapshot.terrorismInfo;
        if (snapshotAuditScenarioInfo2 != null) {
            QCloudXml.toXml(xmlSerializer, snapshotAuditScenarioInfo2);
        }
        GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo3 = snapshot.politicsInfo;
        if (snapshotAuditScenarioInfo3 != null) {
            QCloudXml.toXml(xmlSerializer, snapshotAuditScenarioInfo3);
        }
        GetAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo4 = snapshot.adsInfo;
        if (snapshotAuditScenarioInfo4 != null) {
            QCloudXml.toXml(xmlSerializer, snapshotAuditScenarioInfo4);
        }
        xmlSerializer.endTag("", "Snapshot");
    }
}
