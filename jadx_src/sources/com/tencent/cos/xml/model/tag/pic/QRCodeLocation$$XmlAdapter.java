package com.tencent.cos.xml.model.tag.pic;

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
public class QRCodeLocation$$XmlAdapter implements IXmlAdapter<QRCodeLocation> {
    private HashMap<String, ChildElementBinder<QRCodeLocation>> childElementBinders;

    public QRCodeLocation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<QRCodeLocation>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("CodeLocation", new ChildElementBinder<QRCodeLocation>() { // from class: com.tencent.cos.xml.model.tag.pic.QRCodeLocation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, QRCodeLocation qRCodeLocation) throws XmlPullParserException, IOException {
                if (qRCodeLocation.points == null) {
                    qRCodeLocation.points = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        qRCodeLocation.points.add((QRCodePoint) QCloudXml.fromXml(xmlPullParser, QRCodePoint.class));
                    } else if (eventType == 3 && "CodeLocation".equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public QRCodeLocation fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        QRCodeLocation qRCodeLocation = new QRCodeLocation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<QRCodeLocation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, qRCodeLocation);
                }
            } else if (eventType == 3 && "CodeLocation".equalsIgnoreCase(xmlPullParser.getName())) {
                return qRCodeLocation;
            }
            eventType = xmlPullParser.next();
        }
        return qRCodeLocation;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, QRCodeLocation qRCodeLocation) throws XmlPullParserException, IOException {
        if (qRCodeLocation == null) {
            return;
        }
        xmlSerializer.startTag("", "CodeLocation");
        xmlSerializer.startTag("", "CodeLocation");
        if (qRCodeLocation.points != null) {
            for (int i10 = 0; i10 < qRCodeLocation.points.size(); i10++) {
                QCloudXml.toXml(xmlSerializer, qRCodeLocation.points.get(i10));
            }
        }
        xmlSerializer.endTag("", "CodeLocation");
        xmlSerializer.endTag("", "CodeLocation");
    }
}
