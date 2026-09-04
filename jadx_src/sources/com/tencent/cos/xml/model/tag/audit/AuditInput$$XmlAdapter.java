package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class AuditInput$$XmlAdapter implements IXmlAdapter<AuditInput> {
    private HashMap<String, ChildElementBinder<AuditInput>> childElementBinders;

    public AuditInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditInput>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Object", new ChildElementBinder<AuditInput>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditInput auditInput) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditInput.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Url", new ChildElementBinder<AuditInput>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditInput auditInput) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditInput.url = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditInput fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AuditInput auditInput = new AuditInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditInput);
                }
            } else if (eventType == 3 && "Input".equalsIgnoreCase(xmlPullParser.getName())) {
                return auditInput;
            }
            eventType = xmlPullParser.next();
        }
        return auditInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditInput auditInput) throws XmlPullParserException, IOException {
        if (auditInput == null) {
            return;
        }
        xmlSerializer.startTag("", "Input");
        if (auditInput.object != null) {
            xmlSerializer.startTag("", "Object");
            xmlSerializer.text(String.valueOf(auditInput.object));
            xmlSerializer.endTag("", "Object");
        }
        if (auditInput.url != null) {
            xmlSerializer.startTag("", "Url");
            xmlSerializer.text(String.valueOf(auditInput.url));
            xmlSerializer.endTag("", "Url");
        }
        xmlSerializer.endTag("", "Input");
    }
}
