package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class AuditJobsPostDetail$$XmlAdapter implements IXmlAdapter<AuditJobsPostDetail> {
    private HashMap<String, ChildElementBinder<AuditJobsPostDetail>> childElementBinders;

    public AuditJobsPostDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditJobsPostDetail>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("JobId", new ChildElementBinder<AuditJobsPostDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobsPostDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsPostDetail auditJobsPostDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditJobsPostDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("State", new ChildElementBinder<AuditJobsPostDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobsPostDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsPostDetail auditJobsPostDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditJobsPostDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CreationTime", new ChildElementBinder<AuditJobsPostDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobsPostDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsPostDetail auditJobsPostDetail) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditJobsPostDetail.creationTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditJobsPostDetail fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AuditJobsPostDetail auditJobsPostDetail = new AuditJobsPostDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditJobsPostDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditJobsPostDetail);
                }
            } else if (eventType == 3 && "JobsDetail".equalsIgnoreCase(xmlPullParser.getName())) {
                return auditJobsPostDetail;
            }
            eventType = xmlPullParser.next();
        }
        return auditJobsPostDetail;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditJobsPostDetail auditJobsPostDetail) throws XmlPullParserException, IOException {
        if (auditJobsPostDetail == null) {
            return;
        }
        xmlSerializer.startTag("", "JobsDetail");
        if (auditJobsPostDetail.jobId != null) {
            xmlSerializer.startTag("", "JobId");
            xmlSerializer.text(String.valueOf(auditJobsPostDetail.jobId));
            xmlSerializer.endTag("", "JobId");
        }
        if (auditJobsPostDetail.state != null) {
            xmlSerializer.startTag("", "State");
            xmlSerializer.text(String.valueOf(auditJobsPostDetail.state));
            xmlSerializer.endTag("", "State");
        }
        if (auditJobsPostDetail.creationTime != null) {
            xmlSerializer.startTag("", "CreationTime");
            xmlSerializer.text(String.valueOf(auditJobsPostDetail.creationTime));
            xmlSerializer.endTag("", "CreationTime");
        }
        xmlSerializer.endTag("", "JobsDetail");
    }
}
