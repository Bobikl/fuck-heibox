package com.tencent.cos.xml.model.tag.pic;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class QRCodeInfo$$XmlAdapter implements IXmlAdapter<QRCodeInfo> {
    private HashMap<String, ChildElementBinder<QRCodeInfo>> childElementBinders;

    public QRCodeInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<QRCodeInfo>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("CodeUrl", new ChildElementBinder<QRCodeInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.QRCodeInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, QRCodeInfo qRCodeInfo) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                qRCodeInfo.codeUrl = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("CodeLocation", new ChildElementBinder<QRCodeInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.QRCodeInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, QRCodeInfo qRCodeInfo) throws XmlPullParserException, IOException {
                qRCodeInfo.location = (QRCodeLocation) QCloudXml.fromXml(xmlPullParser, QRCodeLocation.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public QRCodeInfo fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        QRCodeInfo qRCodeInfo = new QRCodeInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<QRCodeInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, qRCodeInfo);
                }
            } else if (eventType == 3 && "QRcodeInfo".equalsIgnoreCase(xmlPullParser.getName())) {
                return qRCodeInfo;
            }
            eventType = xmlPullParser.next();
        }
        return qRCodeInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, QRCodeInfo qRCodeInfo) throws XmlPullParserException, IOException {
        if (qRCodeInfo == null) {
            return;
        }
        xmlSerializer.startTag("", "QRcodeInfo");
        if (qRCodeInfo.codeUrl != null) {
            xmlSerializer.startTag("", "CodeUrl");
            xmlSerializer.text(String.valueOf(qRCodeInfo.codeUrl));
            xmlSerializer.endTag("", "CodeUrl");
        }
        QRCodeLocation qRCodeLocation = qRCodeInfo.location;
        if (qRCodeLocation != null) {
            QCloudXml.toXml(xmlSerializer, qRCodeLocation);
        }
        xmlSerializer.endTag("", "QRcodeInfo");
    }
}
