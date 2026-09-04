package com.tencent.cos.xml.model.tag.pic;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class QRCodePoint$$XmlAdapter implements IXmlAdapter<QRCodePoint> {
    private HashMap<String, ChildElementBinder<QRCodePoint>> childElementBinders;

    public QRCodePoint$$XmlAdapter() {
        HashMap<String, ChildElementBinder<QRCodePoint>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Point", new ChildElementBinder<QRCodePoint>() { // from class: com.tencent.cos.xml.model.tag.pic.QRCodePoint$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, QRCodePoint qRCodePoint) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                qRCodePoint.point = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public QRCodePoint fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        QRCodePoint qRCodePoint = new QRCodePoint();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<QRCodePoint> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, qRCodePoint);
                }
            } else if (eventType == 3 && "Point".equalsIgnoreCase(xmlPullParser.getName())) {
                return qRCodePoint;
            }
            eventType = xmlPullParser.next();
        }
        return qRCodePoint;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, QRCodePoint qRCodePoint) throws XmlPullParserException, IOException {
        if (qRCodePoint == null) {
            return;
        }
        xmlSerializer.startTag("", "Point");
        if (qRCodePoint.point != null) {
            xmlSerializer.startTag("", "Point");
            xmlSerializer.text(String.valueOf(qRCodePoint.point));
            xmlSerializer.endTag("", "Point");
        }
        xmlSerializer.endTag("", "Point");
    }
}
