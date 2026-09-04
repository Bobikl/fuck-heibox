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
public class PicUploadResult$$XmlAdapter implements IXmlAdapter<PicUploadResult> {
    private HashMap<String, ChildElementBinder<PicUploadResult>> childElementBinders;

    public PicUploadResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PicUploadResult>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("OriginalInfo", new ChildElementBinder<PicUploadResult>() { // from class: com.tencent.cos.xml.model.tag.pic.PicUploadResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicUploadResult picUploadResult) throws XmlPullParserException, IOException {
                picUploadResult.originalInfo = (PicOriginalInfo) QCloudXml.fromXml(xmlPullParser, PicOriginalInfo.class);
            }
        });
        this.childElementBinders.put("ProcessResults", new ChildElementBinder<PicUploadResult>() { // from class: com.tencent.cos.xml.model.tag.pic.PicUploadResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicUploadResult picUploadResult) throws XmlPullParserException, IOException {
                if (picUploadResult.processResults == null) {
                    picUploadResult.processResults = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        picUploadResult.processResults.add((PicObject) QCloudXml.fromXml(xmlPullParser, PicObject.class));
                    } else if (eventType == 3 && "ProcessResults".equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PicUploadResult fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PicUploadResult picUploadResult = new PicUploadResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PicUploadResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, picUploadResult);
                }
            } else if (eventType == 3 && "UploadResult".equalsIgnoreCase(xmlPullParser.getName())) {
                return picUploadResult;
            }
            eventType = xmlPullParser.next();
        }
        return picUploadResult;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PicUploadResult picUploadResult) throws XmlPullParserException, IOException {
        if (picUploadResult == null) {
            return;
        }
        xmlSerializer.startTag("", "UploadResult");
        PicOriginalInfo picOriginalInfo = picUploadResult.originalInfo;
        if (picOriginalInfo != null) {
            QCloudXml.toXml(xmlSerializer, picOriginalInfo);
        }
        xmlSerializer.startTag("", "ProcessResults");
        if (picUploadResult.processResults != null) {
            for (int i10 = 0; i10 < picUploadResult.processResults.size(); i10++) {
                QCloudXml.toXml(xmlSerializer, picUploadResult.processResults.get(i10));
            }
        }
        xmlSerializer.endTag("", "ProcessResults");
        xmlSerializer.endTag("", "UploadResult");
    }
}
