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
public class PostAudioAudit$$XmlAdapter implements IXmlAdapter<PostAudioAudit> {
    private HashMap<String, ChildElementBinder<PostAudioAudit>> childElementBinders;

    public PostAudioAudit$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostAudioAudit>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Input", new ChildElementBinder<PostAudioAudit>() { // from class: com.tencent.cos.xml.model.tag.audit.PostAudioAudit$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostAudioAudit postAudioAudit) throws XmlPullParserException, IOException {
                postAudioAudit.input = (AuditInput) QCloudXml.fromXml(xmlPullParser, AuditInput.class);
            }
        });
        this.childElementBinders.put("Conf", new ChildElementBinder<PostAudioAudit>() { // from class: com.tencent.cos.xml.model.tag.audit.PostAudioAudit$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostAudioAudit postAudioAudit) throws XmlPullParserException, IOException {
                postAudioAudit.conf = (PostAudioAudit.AudioAuditConf) QCloudXml.fromXml(xmlPullParser, PostAudioAudit.AudioAuditConf.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostAudioAudit fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PostAudioAudit postAudioAudit = new PostAudioAudit();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostAudioAudit> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postAudioAudit);
                }
            } else if (eventType == 3 && "Request".equalsIgnoreCase(xmlPullParser.getName())) {
                return postAudioAudit;
            }
            eventType = xmlPullParser.next();
        }
        return postAudioAudit;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostAudioAudit postAudioAudit) throws XmlPullParserException, IOException {
        if (postAudioAudit == null) {
            return;
        }
        xmlSerializer.startTag("", "Request");
        AuditInput auditInput = postAudioAudit.input;
        if (auditInput != null) {
            QCloudXml.toXml(xmlSerializer, auditInput);
        }
        PostAudioAudit.AudioAuditConf audioAuditConf = postAudioAudit.conf;
        if (audioAuditConf != null) {
            QCloudXml.toXml(xmlSerializer, audioAuditConf);
        }
        xmlSerializer.endTag("", "Request");
    }
}
