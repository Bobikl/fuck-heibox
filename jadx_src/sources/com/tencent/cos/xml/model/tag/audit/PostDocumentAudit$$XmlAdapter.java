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
public class PostDocumentAudit$$XmlAdapter implements IXmlAdapter<PostDocumentAudit> {
    private HashMap<String, ChildElementBinder<PostDocumentAudit>> childElementBinders;

    public PostDocumentAudit$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostDocumentAudit>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Input", new ChildElementBinder<PostDocumentAudit>() { // from class: com.tencent.cos.xml.model.tag.audit.PostDocumentAudit$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostDocumentAudit postDocumentAudit) throws XmlPullParserException, IOException {
                postDocumentAudit.input = (PostDocumentAudit.DocumentAuditInput) QCloudXml.fromXml(xmlPullParser, PostDocumentAudit.DocumentAuditInput.class);
            }
        });
        this.childElementBinders.put("Conf", new ChildElementBinder<PostDocumentAudit>() { // from class: com.tencent.cos.xml.model.tag.audit.PostDocumentAudit$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostDocumentAudit postDocumentAudit) throws XmlPullParserException, IOException {
                postDocumentAudit.conf = (AuditConf) QCloudXml.fromXml(xmlPullParser, AuditConf.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostDocumentAudit fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PostDocumentAudit postDocumentAudit = new PostDocumentAudit();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostDocumentAudit> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postDocumentAudit);
                }
            } else if (eventType == 3 && "Request".equalsIgnoreCase(xmlPullParser.getName())) {
                return postDocumentAudit;
            }
            eventType = xmlPullParser.next();
        }
        return postDocumentAudit;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostDocumentAudit postDocumentAudit) throws XmlPullParserException, IOException {
        if (postDocumentAudit == null) {
            return;
        }
        xmlSerializer.startTag("", "Request");
        PostDocumentAudit.DocumentAuditInput documentAuditInput = postDocumentAudit.input;
        if (documentAuditInput != null) {
            QCloudXml.toXml(xmlSerializer, documentAuditInput);
        }
        AuditConf auditConf = postDocumentAudit.conf;
        if (auditConf != null) {
            QCloudXml.toXml(xmlSerializer, auditConf);
        }
        xmlSerializer.endTag("", "Request");
    }
}
