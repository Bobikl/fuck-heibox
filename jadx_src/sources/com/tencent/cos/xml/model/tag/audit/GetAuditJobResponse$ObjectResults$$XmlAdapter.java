package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.apache.tools.ant.taskdefs.y3;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class GetAuditJobResponse$ObjectResults$$XmlAdapter implements IXmlAdapter<GetAuditJobResponse.ObjectResults> {
    private HashMap<String, ChildElementBinder<GetAuditJobResponse.ObjectResults>> childElementBinders;

    public GetAuditJobResponse$ObjectResults$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditJobResponse.ObjectResults>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put(y3.f135966f, new ChildElementBinder<GetAuditJobResponse.ObjectResults>() { // from class: com.tencent.cos.xml.model.tag.audit.GetAuditJobResponse$ObjectResults$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditJobResponse.ObjectResults objectResults) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                objectResults.name = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditJobResponse.ObjectResults fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        GetAuditJobResponse.ObjectResults objectResults = new GetAuditJobResponse.ObjectResults();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditJobResponse.ObjectResults> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, objectResults);
                }
            } else if (eventType == 3 && "ObjectResults".equalsIgnoreCase(xmlPullParser.getName())) {
                return objectResults;
            }
            eventType = xmlPullParser.next();
        }
        return objectResults;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, GetAuditJobResponse.ObjectResults objectResults) throws XmlPullParserException, IOException {
        if (objectResults == null) {
            return;
        }
        xmlSerializer.startTag("", "ObjectResults");
        if (objectResults.name != null) {
            xmlSerializer.startTag("", y3.f135966f);
            xmlSerializer.text(String.valueOf(objectResults.name));
            xmlSerializer.endTag("", y3.f135966f);
        }
        xmlSerializer.endTag("", "ObjectResults");
    }
}
