package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class AuditJobsDetail$$XmlAdapter implements IXmlAdapter<AuditJobsDetail> {
    private HashMap<String, ChildElementBinder<AuditJobsDetail>> childElementBinders;

    public AuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditJobsDetail>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Code", new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Message", new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("JobId", new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("State", new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CreationTime", new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditJobsDetail fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AuditJobsDetail auditJobsDetail = new AuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditJobsDetail);
                }
            } else if (eventType == 3 && "JobsDetail".equalsIgnoreCase(xmlPullParser.getName())) {
                return auditJobsDetail;
            }
            eventType = xmlPullParser.next();
        }
        return auditJobsDetail;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditJobsDetail auditJobsDetail) throws XmlPullParserException, IOException {
        if (auditJobsDetail == null) {
            return;
        }
        xmlSerializer.startTag("", "JobsDetail");
        if (auditJobsDetail.code != null) {
            xmlSerializer.startTag("", "Code");
            xmlSerializer.text(String.valueOf(auditJobsDetail.code));
            xmlSerializer.endTag("", "Code");
        }
        if (auditJobsDetail.message != null) {
            xmlSerializer.startTag("", "Message");
            xmlSerializer.text(String.valueOf(auditJobsDetail.message));
            xmlSerializer.endTag("", "Message");
        }
        if (auditJobsDetail.jobId != null) {
            xmlSerializer.startTag("", "JobId");
            xmlSerializer.text(String.valueOf(auditJobsDetail.jobId));
            xmlSerializer.endTag("", "JobId");
        }
        if (auditJobsDetail.state != null) {
            xmlSerializer.startTag("", "State");
            xmlSerializer.text(String.valueOf(auditJobsDetail.state));
            xmlSerializer.endTag("", "State");
        }
        if (auditJobsDetail.creationTime != null) {
            xmlSerializer.startTag("", "CreationTime");
            xmlSerializer.text(String.valueOf(auditJobsDetail.creationTime));
            xmlSerializer.endTag("", "CreationTime");
        }
        xmlSerializer.endTag("", "JobsDetail");
    }
}
