package com.tencent.cos.xml.model.tag.audit;

import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class PostVideoAudit$VideoAuditConf$$XmlAdapter implements IXmlAdapter<PostVideoAudit.VideoAuditConf> {
    private HashMap<String, ChildElementBinder<PostVideoAudit.VideoAuditConf>> childElementBinders;

    public PostVideoAudit$VideoAuditConf$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVideoAudit.VideoAuditConf>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("CallbackVersion", new ChildElementBinder<PostVideoAudit.VideoAuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$VideoAuditConf$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.VideoAuditConf videoAuditConf) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                videoAuditConf.callbackVersion = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Snapshot", new ChildElementBinder<PostVideoAudit.VideoAuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$VideoAuditConf$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.VideoAuditConf videoAuditConf) throws XmlPullParserException, IOException {
                videoAuditConf.snapshot = (PostVideoAudit.Snapshot) QCloudXml.fromXml(xmlPullParser, PostVideoAudit.Snapshot.class);
            }
        });
        this.childElementBinders.put("DetectContent", new ChildElementBinder<PostVideoAudit.VideoAuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$VideoAuditConf$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.VideoAuditConf videoAuditConf) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                videoAuditConf.detectContent = Integer.parseInt(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put("DetectType", new ChildElementBinder<PostVideoAudit.VideoAuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$VideoAuditConf$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.VideoAuditConf videoAuditConf) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                videoAuditConf.detectType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("Callback", new ChildElementBinder<PostVideoAudit.VideoAuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$VideoAuditConf$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.VideoAuditConf videoAuditConf) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                videoAuditConf.callback = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put("BizType", new ChildElementBinder<PostVideoAudit.VideoAuditConf>() { // from class: com.tencent.cos.xml.model.tag.audit.PostVideoAudit$VideoAuditConf$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoAudit.VideoAuditConf videoAuditConf) throws XmlPullParserException, IOException {
                xmlPullParser.next();
                videoAuditConf.bizType = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVideoAudit.VideoAuditConf fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PostVideoAudit.VideoAuditConf videoAuditConf = new PostVideoAudit.VideoAuditConf();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVideoAudit.VideoAuditConf> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, videoAuditConf);
                }
            } else if (eventType == 3 && "Conf".equalsIgnoreCase(xmlPullParser.getName())) {
                return videoAuditConf;
            }
            eventType = xmlPullParser.next();
        }
        return videoAuditConf;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoAudit.VideoAuditConf videoAuditConf) throws XmlPullParserException, IOException {
        if (videoAuditConf == null) {
            return;
        }
        xmlSerializer.startTag("", "Conf");
        if (videoAuditConf.callbackVersion != null) {
            xmlSerializer.startTag("", "CallbackVersion");
            xmlSerializer.text(String.valueOf(videoAuditConf.callbackVersion));
            xmlSerializer.endTag("", "CallbackVersion");
        }
        PostVideoAudit.Snapshot snapshot = videoAuditConf.snapshot;
        if (snapshot != null) {
            QCloudXml.toXml(xmlSerializer, snapshot);
        }
        xmlSerializer.startTag("", "DetectContent");
        xmlSerializer.text(String.valueOf(videoAuditConf.detectContent));
        xmlSerializer.endTag("", "DetectContent");
        if (videoAuditConf.detectType != null) {
            xmlSerializer.startTag("", "DetectType");
            xmlSerializer.text(String.valueOf(videoAuditConf.detectType));
            xmlSerializer.endTag("", "DetectType");
        }
        if (videoAuditConf.callback != null) {
            xmlSerializer.startTag("", "Callback");
            xmlSerializer.text(String.valueOf(videoAuditConf.callback));
            xmlSerializer.endTag("", "Callback");
        }
        if (videoAuditConf.bizType != null) {
            xmlSerializer.startTag("", "BizType");
            xmlSerializer.text(String.valueOf(videoAuditConf.bizType));
            xmlSerializer.endTag("", "BizType");
        }
        xmlSerializer.endTag("", "Conf");
    }
}
