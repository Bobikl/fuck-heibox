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
public class AuditOcrResults$$XmlAdapter implements IXmlAdapter<AuditOcrResults> {
    private HashMap<String, ChildElementBinder<AuditOcrResults>> childElementBinders;

    public AuditOcrResults$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditOcrResults>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Text", new ChildElementBinder<AuditOcrResults>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditOcrResults$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrResults auditOcrResults) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditOcrResults.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Keywords", new ChildElementBinder<AuditOcrResults>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditOcrResults$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrResults auditOcrResults) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                auditOcrResults.keywords = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Location", new ChildElementBinder<AuditOcrResults>() { // from class: com.tencent.cos.xml.model.tag.audit.AuditOcrResults$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrResults auditOcrResults) throws XmlPullParserException, IOException {
                auditOcrResults.location = (AuditOcrLocation) QCloudXml.fromXml(xmlPullParser, AuditOcrLocation.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditOcrResults fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        AuditOcrResults auditOcrResults = new AuditOcrResults();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditOcrResults> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditOcrResults);
                }
            } else if (eventType == 3 && "OcrResults".equalsIgnoreCase(xmlPullParser.getName())) {
                return auditOcrResults;
            }
            eventType = xmlPullParser.next();
        }
        return auditOcrResults;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditOcrResults auditOcrResults) throws XmlPullParserException, IOException {
        if (auditOcrResults == null) {
            return;
        }
        xmlSerializer.startTag("", "OcrResults");
        if (auditOcrResults.text != null) {
            xmlSerializer.startTag("", "Text");
            xmlSerializer.text(String.valueOf(auditOcrResults.text));
            xmlSerializer.endTag("", "Text");
        }
        if (auditOcrResults.keywords != null) {
            xmlSerializer.startTag("", "Keywords");
            xmlSerializer.text(String.valueOf(auditOcrResults.keywords));
            xmlSerializer.endTag("", "Keywords");
        }
        AuditOcrLocation auditOcrLocation = auditOcrResults.location;
        if (auditOcrLocation != null) {
            QCloudXml.toXml(xmlSerializer, auditOcrLocation);
        }
        xmlSerializer.endTag("", "OcrResults");
    }
}
