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
public class AuditJobPostResponse$$XmlAdapter implements IXmlAdapter<AuditJobPostResponse> {
    private HashMap<String, ChildElementBinder<AuditJobPostResponse>> childElementBinders;

    public AuditJobPostResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditJobPostResponse>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("JobsDetail", new ChildElementBinder<AuditJobPostResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditJobPostResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobPostResponse auditJobPostResponse) throws XmlPullParserException, IOException {
                auditJobPostResponse.jobsDetail = (AuditJobsPostDetail) QCloudXml.fromXml(xmlPullParser, AuditJobsPostDetail.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditJobPostResponse fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AuditJobPostResponse auditJobPostResponse = new AuditJobPostResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditJobPostResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditJobPostResponse);
                }
            } else if (eventType == 3 && "Response".equalsIgnoreCase(xmlPullParser.getName())) {
                return auditJobPostResponse;
            }
            eventType = xmlPullParser.next();
        }
        return auditJobPostResponse;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditJobPostResponse auditJobPostResponse) throws XmlPullParserException, IOException {
        if (auditJobPostResponse == null) {
            return;
        }
        xmlSerializer.startTag("", "Response");
        AuditJobsPostDetail auditJobsPostDetail = auditJobPostResponse.jobsDetail;
        if (auditJobsPostDetail != null) {
            QCloudXml.toXml(xmlSerializer, auditJobsPostDetail);
        }
        xmlSerializer.endTag("", "Response");
    }
}
