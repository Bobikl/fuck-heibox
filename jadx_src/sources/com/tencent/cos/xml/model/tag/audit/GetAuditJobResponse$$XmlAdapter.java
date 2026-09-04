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
public class GetAuditJobResponse$$XmlAdapter implements IXmlAdapter<GetAuditJobResponse> {
    private HashMap<String, ChildElementBinder<GetAuditJobResponse>> childElementBinders;

    public GetAuditJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditJobResponse>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("JobsDetail", new ChildElementBinder<GetAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse getAuditJobResponse) throws XmlPullParserException, IOException {
                getAuditJobResponse.jobsDetail = (GetAuditJobResponse.JobsDetail) QCloudXml.fromXml(xmlPullParser, GetAuditJobResponse.JobsDetail.class);
            }
        });
        this.childElementBinders.put("NonExistJobIds", new ChildElementBinder<GetAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse getAuditJobResponse) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                getAuditJobResponse.nonExistJobIds = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditJobResponse fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        GetAuditJobResponse getAuditJobResponse = new GetAuditJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getAuditJobResponse);
                }
            } else if (eventType == 3 && "Response".equalsIgnoreCase(xmlPullParser.getName())) {
                return getAuditJobResponse;
            }
            eventType = xmlPullParser.next();
        }
        return getAuditJobResponse;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, GetAuditJobResponse getAuditJobResponse) throws XmlPullParserException, IOException {
        if (getAuditJobResponse == null) {
            return;
        }
        xmlSerializer.startTag("", "Response");
        GetAuditJobResponse.JobsDetail jobsDetail = getAuditJobResponse.jobsDetail;
        if (jobsDetail != null) {
            QCloudXml.toXml(xmlSerializer, jobsDetail);
        }
        if (getAuditJobResponse.nonExistJobIds != null) {
            xmlSerializer.startTag("", "NonExistJobIds");
            xmlSerializer.text(String.valueOf(getAuditJobResponse.nonExistJobIds));
            xmlSerializer.endTag("", "NonExistJobIds");
        }
        xmlSerializer.endTag("", "Response");
    }
}
