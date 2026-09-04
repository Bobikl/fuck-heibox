package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class AuditConf$$XmlAdapter implements IXmlAdapter<AuditConf> {
    private HashMap<String, ChildElementBinder<AuditConf>> childElementBinders;

    public AuditConf$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditConf>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("DetectType", new ChildElementBinder<AuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditConf$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditConf auditConf) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditConf.detectType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Callback", new ChildElementBinder<AuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditConf$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditConf auditConf) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditConf.callback = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("BizType", new ChildElementBinder<AuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditConf$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditConf auditConf) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditConf.bizType = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditConf fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AuditConf auditConf = new AuditConf();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditConf> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditConf);
                }
            } else if (eventType == 3 && "Conf".equalsIgnoreCase(xmlPullParser.getName())) {
                return auditConf;
            }
            eventType = xmlPullParser.next();
        }
        return auditConf;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditConf auditConf) throws XmlPullParserException, IOException {
        if (auditConf == null) {
            return;
        }
        xmlSerializer.startTag("", "Conf");
        if (auditConf.detectType != null) {
            xmlSerializer.startTag("", "DetectType");
            xmlSerializer.text(String.valueOf(auditConf.detectType));
            xmlSerializer.endTag("", "DetectType");
        }
        if (auditConf.callback != null) {
            xmlSerializer.startTag("", "Callback");
            xmlSerializer.text(String.valueOf(auditConf.callback));
            xmlSerializer.endTag("", "Callback");
        }
        if (auditConf.bizType != null) {
            xmlSerializer.startTag("", "BizType");
            xmlSerializer.text(String.valueOf(auditConf.bizType));
            xmlSerializer.endTag("", "BizType");
        }
        xmlSerializer.endTag("", "Conf");
    }
}
