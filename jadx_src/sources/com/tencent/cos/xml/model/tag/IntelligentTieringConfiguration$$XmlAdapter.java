package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class IntelligentTieringConfiguration$$XmlAdapter implements IXmlAdapter<IntelligentTieringConfiguration> {
    private HashMap<String, ChildElementBinder<IntelligentTieringConfiguration>> childElementBinders;

    public IntelligentTieringConfiguration$$XmlAdapter() {
        HashMap<String, ChildElementBinder<IntelligentTieringConfiguration>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Status", new ChildElementBinder<IntelligentTieringConfiguration>() { // from class: com.tencent.cos.xml.model.tag.IntelligentTieringConfiguration$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, IntelligentTieringConfiguration intelligentTieringConfiguration) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                intelligentTieringConfiguration.status = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Transition", new ChildElementBinder<IntelligentTieringConfiguration>() { // from class: com.tencent.cos.xml.model.tag.IntelligentTieringConfiguration$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, IntelligentTieringConfiguration intelligentTieringConfiguration) throws XmlPullParserException, IOException {
                intelligentTieringConfiguration.transition = (IntelligentTieringConfiguration.Transition) QCloudXml.fromXml(xmlPullParser, IntelligentTieringConfiguration.Transition.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public IntelligentTieringConfiguration fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        IntelligentTieringConfiguration intelligentTieringConfiguration = new IntelligentTieringConfiguration();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<IntelligentTieringConfiguration> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, intelligentTieringConfiguration);
                }
            } else if (eventType == 3 && "IntelligentTieringConfiguration".equalsIgnoreCase(xmlPullParser.getName())) {
                return intelligentTieringConfiguration;
            }
            eventType = xmlPullParser.next();
        }
        return intelligentTieringConfiguration;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, IntelligentTieringConfiguration intelligentTieringConfiguration) throws XmlPullParserException, IOException {
        if (intelligentTieringConfiguration == null) {
            return;
        }
        xmlSerializer.startTag("", "IntelligentTieringConfiguration");
        if (intelligentTieringConfiguration.status != null) {
            xmlSerializer.startTag("", "Status");
            xmlSerializer.text(String.valueOf(intelligentTieringConfiguration.status));
            xmlSerializer.endTag("", "Status");
        }
        IntelligentTieringConfiguration.Transition transition = intelligentTieringConfiguration.transition;
        if (transition != null) {
            QCloudXml.toXml(xmlSerializer, transition);
        }
        xmlSerializer.endTag("", "IntelligentTieringConfiguration");
    }
}
