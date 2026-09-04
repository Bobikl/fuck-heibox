package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class PostVideoAudit$Snapshot$$XmlAdapter implements IXmlAdapter<PostVideoAudit.Snapshot> {
    private HashMap<String, ChildElementBinder<PostVideoAudit.Snapshot>> childElementBinders;

    public PostVideoAudit$Snapshot$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVideoAudit.Snapshot>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("Mode", new ChildElementBinder<PostVideoAudit.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$Snapshot$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.Snapshot snapshot) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshot.mode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Count", new ChildElementBinder<PostVideoAudit.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$Snapshot$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.Snapshot snapshot) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshot.count = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("TimeInterval", new ChildElementBinder<PostVideoAudit.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$Snapshot$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.Snapshot snapshot) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                snapshot.timeInterval = Float.parseFloat(xmlPullParser.getText());
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVideoAudit.Snapshot fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PostVideoAudit.Snapshot snapshot = new PostVideoAudit.Snapshot();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVideoAudit.Snapshot> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, snapshot);
                }
            } else if (eventType == 3 && "Snapshot".equalsIgnoreCase(xmlPullParser.getName())) {
                return snapshot;
            }
            eventType = xmlPullParser.next();
        }
        return snapshot;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoAudit.Snapshot snapshot) throws XmlPullParserException, IOException {
        if (snapshot == null) {
            return;
        }
        xmlSerializer.startTag("", "Snapshot");
        if (snapshot.mode != null) {
            xmlSerializer.startTag("", "Mode");
            xmlSerializer.text(String.valueOf(snapshot.mode));
            xmlSerializer.endTag("", "Mode");
        }
        xmlSerializer.startTag("", "Count");
        xmlSerializer.text(String.valueOf(snapshot.count));
        xmlSerializer.endTag("", "Count");
        if (snapshot.timeInterval != 0.0f) {
            xmlSerializer.startTag("", "TimeInterval");
            xmlSerializer.text(String.valueOf(snapshot.timeInterval));
            xmlSerializer.endTag("", "TimeInterval");
        }
        xmlSerializer.endTag("", "Snapshot");
    }
}
