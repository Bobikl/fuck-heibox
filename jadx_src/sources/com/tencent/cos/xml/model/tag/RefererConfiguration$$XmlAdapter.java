package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class RefererConfiguration$$XmlAdapter implements IXmlAdapter<RefererConfiguration> {
    private HashMap<String, ChildElementBinder<RefererConfiguration>> childElementBinders;

    public RefererConfiguration$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RefererConfiguration>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Status", new ChildElementBinder<RefererConfiguration>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration refererConfiguration) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                refererConfiguration.status = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("RefererType", new ChildElementBinder<RefererConfiguration>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration refererConfiguration) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                refererConfiguration.refererType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("DomainList", new ChildElementBinder<RefererConfiguration>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration refererConfiguration) throws XmlPullParserException, IOException {
                if (refererConfiguration.domainList == null) {
                    refererConfiguration.domainList = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        refererConfiguration.domainList.add((RefererConfiguration.Domain) QCloudXml.fromXml(xmlPullParser, RefererConfiguration.Domain.class));
                    } else if (eventType == 3 && "DomainList".equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put("EmptyReferConfiguration", new ChildElementBinder<RefererConfiguration>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration refererConfiguration) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                refererConfiguration.emptyReferConfiguration = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RefererConfiguration fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        RefererConfiguration refererConfiguration = new RefererConfiguration();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RefererConfiguration> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, refererConfiguration);
                }
            } else if (eventType == 3 && "RefererConfiguration".equalsIgnoreCase(xmlPullParser.getName())) {
                return refererConfiguration;
            }
            eventType = xmlPullParser.next();
        }
        return refererConfiguration;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RefererConfiguration refererConfiguration) throws XmlPullParserException, IOException {
        if (refererConfiguration == null) {
            return;
        }
        xmlSerializer.startTag("", "RefererConfiguration");
        if (refererConfiguration.status != null) {
            xmlSerializer.startTag("", "Status");
            xmlSerializer.text(String.valueOf(refererConfiguration.status));
            xmlSerializer.endTag("", "Status");
        }
        if (refererConfiguration.refererType != null) {
            xmlSerializer.startTag("", "RefererType");
            xmlSerializer.text(String.valueOf(refererConfiguration.refererType));
            xmlSerializer.endTag("", "RefererType");
        }
        xmlSerializer.startTag("", "DomainList");
        if (refererConfiguration.domainList != null) {
            for (int i10 = 0; i10 < refererConfiguration.domainList.size(); i10++) {
                QCloudXml.toXml(xmlSerializer, refererConfiguration.domainList.get(i10));
            }
        }
        xmlSerializer.endTag("", "DomainList");
        if (refererConfiguration.emptyReferConfiguration != null) {
            xmlSerializer.startTag("", "EmptyReferConfiguration");
            xmlSerializer.text(String.valueOf(refererConfiguration.emptyReferConfiguration));
            xmlSerializer.endTag("", "EmptyReferConfiguration");
        }
        xmlSerializer.endTag("", "RefererConfiguration");
    }
}
