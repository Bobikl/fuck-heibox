package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class PostTextAudit$TextAuditInput$$XmlAdapter implements IXmlAdapter<PostTextAudit.TextAuditInput> {
    private HashMap<String, ChildElementBinder<PostTextAudit.TextAuditInput>> childElementBinders;

    public PostTextAudit$TextAuditInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostTextAudit.TextAuditInput>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Object", new ChildElementBinder<PostTextAudit.TextAuditInput>() { // from class: com.tencent.cos.xml.model.tag.audit.PostTextAudit$TextAuditInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTextAudit.TextAuditInput textAuditInput) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                textAuditInput.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Content", new ChildElementBinder<PostTextAudit.TextAuditInput>() { // from class: com.tencent.cos.xml.model.tag.audit.PostTextAudit$TextAuditInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTextAudit.TextAuditInput textAuditInput) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                textAuditInput.content = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostTextAudit.TextAuditInput fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PostTextAudit.TextAuditInput textAuditInput = new PostTextAudit.TextAuditInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostTextAudit.TextAuditInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, textAuditInput);
                }
            } else if (eventType == 3 && "Input".equalsIgnoreCase(xmlPullParser.getName())) {
                return textAuditInput;
            }
            eventType = xmlPullParser.next();
        }
        return textAuditInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTextAudit.TextAuditInput textAuditInput) throws XmlPullParserException, IOException {
        if (textAuditInput == null) {
            return;
        }
        xmlSerializer.startTag("", "Input");
        if (textAuditInput.object != null) {
            xmlSerializer.startTag("", "Object");
            xmlSerializer.text(String.valueOf(textAuditInput.object));
            xmlSerializer.endTag("", "Object");
        }
        if (textAuditInput.content != null) {
            xmlSerializer.startTag("", "Content");
            xmlSerializer.text(String.valueOf(textAuditInput.content));
            xmlSerializer.endTag("", "Content");
        }
        xmlSerializer.endTag("", "Input");
    }
}
