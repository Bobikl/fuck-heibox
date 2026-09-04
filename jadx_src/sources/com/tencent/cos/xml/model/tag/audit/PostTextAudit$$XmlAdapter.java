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
public class PostTextAudit$$XmlAdapter implements IXmlAdapter<PostTextAudit> {
    private HashMap<String, ChildElementBinder<PostTextAudit>> childElementBinders;

    public PostTextAudit$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostTextAudit>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Input", new ChildElementBinder<PostTextAudit>() { // from class: com.tencent.cos.xml.model.tag.audit.PostTextAudit$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTextAudit postTextAudit) throws XmlPullParserException, IOException {
                postTextAudit.input = (PostTextAudit.TextAuditInput) QCloudXml.fromXml(xmlPullParser, PostTextAudit.TextAuditInput.class);
            }
        });
        this.childElementBinders.put("Conf", new ChildElementBinder<PostTextAudit>() { // from class: com.tencent.cos.xml.model.tag.audit.PostTextAudit$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTextAudit postTextAudit) throws XmlPullParserException, IOException {
                postTextAudit.conf = (AuditConf) QCloudXml.fromXml(xmlPullParser, AuditConf.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostTextAudit fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PostTextAudit postTextAudit = new PostTextAudit();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostTextAudit> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postTextAudit);
                }
            } else if (eventType == 3 && "Request".equalsIgnoreCase(xmlPullParser.getName())) {
                return postTextAudit;
            }
            eventType = xmlPullParser.next();
        }
        return postTextAudit;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTextAudit postTextAudit) throws XmlPullParserException, IOException {
        if (postTextAudit == null) {
            return;
        }
        xmlSerializer.startTag("", "Request");
        PostTextAudit.TextAuditInput textAuditInput = postTextAudit.input;
        if (textAuditInput != null) {
            QCloudXml.toXml(xmlSerializer, textAuditInput);
        }
        AuditConf auditConf = postTextAudit.conf;
        if (auditConf != null) {
            QCloudXml.toXml(xmlSerializer, auditConf);
        }
        xmlSerializer.endTag("", "Request");
    }
}
