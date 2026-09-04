package com.tencent.cos.xml.model.tag.audit;

import com.google.common.net.c;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class AuditOcrLocation$$XmlAdapter implements IXmlAdapter<AuditOcrLocation> {
    private HashMap<String, ChildElementBinder<AuditOcrLocation>> childElementBinders;

    public AuditOcrLocation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditOcrLocation>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("X", new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditOcrLocation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditOcrLocation.f99475x = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Y", new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditOcrLocation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditOcrLocation.f99476y = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Height", new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditOcrLocation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditOcrLocation.height = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(c.f58864t1, new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditOcrLocation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditOcrLocation.width = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("Rotate", new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditOcrLocation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditOcrLocation.rotate = Integer.parseInt(xmlPullParser.getText());
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditOcrLocation fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AuditOcrLocation auditOcrLocation = new AuditOcrLocation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditOcrLocation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditOcrLocation);
                }
            } else if (eventType == 3 && "Location".equalsIgnoreCase(xmlPullParser.getName())) {
                return auditOcrLocation;
            }
            eventType = xmlPullParser.next();
        }
        return auditOcrLocation;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditOcrLocation auditOcrLocation) throws XmlPullParserException, IOException {
        if (auditOcrLocation == null) {
            return;
        }
        xmlSerializer.startTag("", "Location");
        xmlSerializer.startTag("", "X");
        xmlSerializer.text(String.valueOf(auditOcrLocation.f99475x));
        xmlSerializer.endTag("", "X");
        xmlSerializer.startTag("", "Y");
        xmlSerializer.text(String.valueOf(auditOcrLocation.f99476y));
        xmlSerializer.endTag("", "Y");
        xmlSerializer.startTag("", "Height");
        xmlSerializer.text(String.valueOf(auditOcrLocation.height));
        xmlSerializer.endTag("", "Height");
        xmlSerializer.startTag("", c.f58864t1);
        xmlSerializer.text(String.valueOf(auditOcrLocation.width));
        xmlSerializer.endTag("", c.f58864t1);
        xmlSerializer.startTag("", "Rotate");
        xmlSerializer.text(String.valueOf(auditOcrLocation.rotate));
        xmlSerializer.endTag("", "Rotate");
        xmlSerializer.endTag("", "Location");
    }
}
