package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class RefererConfiguration$Domain$$XmlAdapter implements IXmlAdapter<RefererConfiguration.Domain> {
    private HashMap<String, ChildElementBinder<RefererConfiguration.Domain>> childElementBinders;

    public RefererConfiguration$Domain$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RefererConfiguration.Domain>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Domain", new ChildElementBinder<RefererConfiguration.Domain>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$Domain$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration.Domain domain) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                domain.domain = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RefererConfiguration.Domain fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        RefererConfiguration.Domain domain = new RefererConfiguration.Domain();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RefererConfiguration.Domain> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, domain);
                }
            } else if (eventType == 3 && "Domain".equalsIgnoreCase(xmlPullParser.getName())) {
                return domain;
            }
            eventType = xmlPullParser.next();
        }
        return domain;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RefererConfiguration.Domain domain) throws XmlPullParserException, IOException {
        if (domain == null) {
            return;
        }
        xmlSerializer.startTag("", "Domain");
        String str = domain.domain;
        if (str != null) {
            xmlSerializer.text(String.valueOf(str));
        }
        xmlSerializer.endTag("", "Domain");
    }
}
