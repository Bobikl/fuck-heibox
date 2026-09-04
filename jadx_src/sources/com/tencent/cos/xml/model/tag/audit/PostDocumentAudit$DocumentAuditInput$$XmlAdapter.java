package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class PostDocumentAudit$DocumentAuditInput$$XmlAdapter implements IXmlAdapter<PostDocumentAudit.DocumentAuditInput> {
    private HashMap<String, ChildElementBinder<PostDocumentAudit.DocumentAuditInput>> childElementBinders;

    public PostDocumentAudit$DocumentAuditInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostDocumentAudit.DocumentAuditInput>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Url", new ChildElementBinder<PostDocumentAudit.DocumentAuditInput>() { // from class: com.tencent.cos.xml.model.tag.audit.PostDocumentAudit$DocumentAuditInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostDocumentAudit.DocumentAuditInput documentAuditInput) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                documentAuditInput.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Type", new ChildElementBinder<PostDocumentAudit.DocumentAuditInput>() { // from class: com.tencent.cos.xml.model.tag.audit.PostDocumentAudit$DocumentAuditInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostDocumentAudit.DocumentAuditInput documentAuditInput) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                documentAuditInput.type = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostDocumentAudit.DocumentAuditInput fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PostDocumentAudit.DocumentAuditInput documentAuditInput = new PostDocumentAudit.DocumentAuditInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostDocumentAudit.DocumentAuditInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, documentAuditInput);
                }
            } else if (eventType == 3 && "Input".equalsIgnoreCase(xmlPullParser.getName())) {
                return documentAuditInput;
            }
            eventType = xmlPullParser.next();
        }
        return documentAuditInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostDocumentAudit.DocumentAuditInput documentAuditInput) throws XmlPullParserException, IOException {
        if (documentAuditInput == null) {
            return;
        }
        xmlSerializer.startTag("", "Input");
        if (documentAuditInput.url != null) {
            xmlSerializer.startTag("", "Url");
            xmlSerializer.text(String.valueOf(documentAuditInput.url));
            xmlSerializer.endTag("", "Url");
        }
        if (documentAuditInput.type != null) {
            xmlSerializer.startTag("", "Type");
            xmlSerializer.text(String.valueOf(documentAuditInput.type));
            xmlSerializer.endTag("", "Type");
        }
        xmlSerializer.endTag("", "Input");
    }
}
