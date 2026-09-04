package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class IntelligentTieringConfiguration$Transition$$XmlAdapter implements IXmlAdapter<IntelligentTieringConfiguration.Transition> {
    private HashMap<String, ChildElementBinder<IntelligentTieringConfiguration.Transition>> childElementBinders;

    public IntelligentTieringConfiguration$Transition$$XmlAdapter() {
        HashMap<String, ChildElementBinder<IntelligentTieringConfiguration.Transition>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Days", new ChildElementBinder<IntelligentTieringConfiguration.Transition>() { // from class: com.tencent.cos.xml.model.tag.IntelligentTieringConfiguration$Transition$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, IntelligentTieringConfiguration.Transition transition) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                transition.days = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("RequestFrequent", new ChildElementBinder<IntelligentTieringConfiguration.Transition>() { // from class: com.tencent.cos.xml.model.tag.IntelligentTieringConfiguration$Transition$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, IntelligentTieringConfiguration.Transition transition) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                transition.requestFrequent = Integer.parseInt(xmlPullParser.getText());
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public IntelligentTieringConfiguration.Transition fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        IntelligentTieringConfiguration.Transition transition = new IntelligentTieringConfiguration.Transition();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<IntelligentTieringConfiguration.Transition> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, transition);
                }
            } else if (eventType == 3 && "Transition".equalsIgnoreCase(xmlPullParser.getName())) {
                return transition;
            }
            eventType = xmlPullParser.next();
        }
        return transition;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, IntelligentTieringConfiguration.Transition transition) throws XmlPullParserException, IOException {
        if (transition == null) {
            return;
        }
        xmlSerializer.startTag("", "Transition");
        xmlSerializer.startTag("", "Days");
        xmlSerializer.text(String.valueOf(transition.days));
        xmlSerializer.endTag("", "Days");
        xmlSerializer.startTag("", "RequestFrequent");
        xmlSerializer.text(String.valueOf(transition.requestFrequent));
        xmlSerializer.endTag("", "RequestFrequent");
        xmlSerializer.endTag("", "Transition");
    }
}
