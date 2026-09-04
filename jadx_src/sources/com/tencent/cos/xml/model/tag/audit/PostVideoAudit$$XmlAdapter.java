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
public class PostVideoAudit$$XmlAdapter implements IXmlAdapter<PostVideoAudit> {
    private HashMap<String, ChildElementBinder<PostVideoAudit>> childElementBinders;

    public PostVideoAudit$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVideoAudit>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Input", new ChildElementBinder<PostVideoAudit>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit postVideoAudit) throws XmlPullParserException, IOException {
                postVideoAudit.input = (AuditInput) QCloudXml.fromXml(xmlPullParser, AuditInput.class);
            }
        });
        this.childElementBinders.put("Conf", new ChildElementBinder<PostVideoAudit>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit postVideoAudit) throws XmlPullParserException, IOException {
                postVideoAudit.conf = (PostVideoAudit.VideoAuditConf) QCloudXml.fromXml(xmlPullParser, PostVideoAudit.VideoAuditConf.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVideoAudit fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PostVideoAudit postVideoAudit = new PostVideoAudit();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVideoAudit> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVideoAudit);
                }
            } else if (eventType == 3 && "Request".equalsIgnoreCase(xmlPullParser.getName())) {
                return postVideoAudit;
            }
            eventType = xmlPullParser.next();
        }
        return postVideoAudit;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoAudit postVideoAudit) throws XmlPullParserException, IOException {
        if (postVideoAudit == null) {
            return;
        }
        xmlSerializer.startTag("", "Request");
        AuditInput auditInput = postVideoAudit.input;
        if (auditInput != null) {
            QCloudXml.toXml(xmlSerializer, auditInput);
        }
        PostVideoAudit.VideoAuditConf videoAuditConf = postVideoAudit.conf;
        if (videoAuditConf != null) {
            QCloudXml.toXml(xmlSerializer, videoAuditConf);
        }
        xmlSerializer.endTag("", "Request");
    }
}
