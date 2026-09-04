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
public class GetAuditJobResponse$JobsDetail$$XmlAdapter implements IXmlAdapter<GetAuditJobResponse.JobsDetail> {
    private HashMap<String, ChildElementBinder<GetAuditJobResponse.JobsDetail>> childElementBinders;

    public GetAuditJobResponse$JobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditJobResponse.JobsDetail>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Object", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                jobsDetail.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Result", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                jobsDetail.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Url", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                jobsDetail.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("SnapshotCount", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                jobsDetail.snapshotCount = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Label", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                jobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("PornInfo", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                jobsDetail.pornInfo = (GetAuditJobResponse.AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AuditScenarioInfo.class);
            }
        });
        this.childElementBinders.put("TerrorismInfo", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                jobsDetail.terrorismInfo = (GetAuditJobResponse.AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AuditScenarioInfo.class);
            }
        });
        this.childElementBinders.put("PoliticsInfo", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                jobsDetail.politicsInfo = (GetAuditJobResponse.AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AuditScenarioInfo.class);
            }
        });
        this.childElementBinders.put("AdsInfo", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                jobsDetail.adsInfo = (GetAuditJobResponse.AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AuditScenarioInfo.class);
            }
        });
        this.childElementBinders.put("Snapshot", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                jobsDetail.snapshot = (GetAuditJobResponse.Snapshot) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.Snapshot.class);
            }
        });
        this.childElementBinders.put("AudioSection", new ChildElementBinder<GetAuditJobResponse.JobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$JobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
                jobsDetail.audioSection = (GetAuditJobResponse.AudioSection) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.AudioSection.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditJobResponse.JobsDetail fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        GetAuditJobResponse.JobsDetail jobsDetail = new GetAuditJobResponse.JobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditJobResponse.JobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, jobsDetail);
                }
            } else if (eventType == 3 && "JobsDetail".equalsIgnoreCase(xmlPullParser.getName())) {
                return jobsDetail;
            }
            eventType = xmlPullParser.next();
        }
        return jobsDetail;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, GetAuditJobResponse.JobsDetail jobsDetail) throws XmlPullParserException, IOException {
        if (jobsDetail == null) {
            return;
        }
        xmlSerializer.startTag("", "JobsDetail");
        if (jobsDetail.object != null) {
            xmlSerializer.startTag("", "Object");
            xmlSerializer.text(String.valueOf(jobsDetail.object));
            xmlSerializer.endTag("", "Object");
        }
        if (jobsDetail.result != null) {
            xmlSerializer.startTag("", "Result");
            xmlSerializer.text(String.valueOf(jobsDetail.result));
            xmlSerializer.endTag("", "Result");
        }
        if (jobsDetail.url != null) {
            xmlSerializer.startTag("", "Url");
            xmlSerializer.text(String.valueOf(jobsDetail.url));
            xmlSerializer.endTag("", "Url");
        }
        if (jobsDetail.snapshotCount != null) {
            xmlSerializer.startTag("", "SnapshotCount");
            xmlSerializer.text(String.valueOf(jobsDetail.snapshotCount));
            xmlSerializer.endTag("", "SnapshotCount");
        }
        if (jobsDetail.label != null) {
            xmlSerializer.startTag("", "Label");
            xmlSerializer.text(String.valueOf(jobsDetail.label));
            xmlSerializer.endTag("", "Label");
        }
        GetAuditJobResponse.AuditScenarioInfo auditScenarioInfo = jobsDetail.pornInfo;
        if (auditScenarioInfo != null) {
            QCloudXml.toXml(xmlSerializer, auditScenarioInfo);
        }
        GetAuditJobResponse.AuditScenarioInfo auditScenarioInfo2 = jobsDetail.terrorismInfo;
        if (auditScenarioInfo2 != null) {
            QCloudXml.toXml(xmlSerializer, auditScenarioInfo2);
        }
        GetAuditJobResponse.AuditScenarioInfo auditScenarioInfo3 = jobsDetail.politicsInfo;
        if (auditScenarioInfo3 != null) {
            QCloudXml.toXml(xmlSerializer, auditScenarioInfo3);
        }
        GetAuditJobResponse.AuditScenarioInfo auditScenarioInfo4 = jobsDetail.adsInfo;
        if (auditScenarioInfo4 != null) {
            QCloudXml.toXml(xmlSerializer, auditScenarioInfo4);
        }
        GetAuditJobResponse.Snapshot snapshot = jobsDetail.snapshot;
        if (snapshot != null) {
            QCloudXml.toXml(xmlSerializer, snapshot);
        }
        GetAuditJobResponse.AudioSection audioSection = jobsDetail.audioSection;
        if (audioSection != null) {
            QCloudXml.toXml(xmlSerializer, audioSection);
        }
        xmlSerializer.endTag("", "JobsDetail");
    }
}
