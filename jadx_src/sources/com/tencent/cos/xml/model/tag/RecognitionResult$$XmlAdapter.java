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
public class RecognitionResult$$XmlAdapter implements IXmlAdapter<RecognitionResult> {
    private HashMap<String, ChildElementBinder<RecognitionResult>> childElementBinders;

    public RecognitionResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("PornInfo", new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult) throws XmlPullParserException, IOException {
                recognitionResult.pornInfo = (RecognitionResult.PornInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.PornInfo.class);
            }
        });
        this.childElementBinders.put("PoliticsInfo", new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult) throws XmlPullParserException, IOException {
                recognitionResult.politicsInfo = (RecognitionResult.PoliticsInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.PoliticsInfo.class);
            }
        });
        this.childElementBinders.put("TerroristInfo", new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult) throws XmlPullParserException, IOException {
                recognitionResult.terroristInfo = (RecognitionResult.TerroristInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.TerroristInfo.class);
            }
        });
        this.childElementBinders.put("AdsInfo", new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult) throws XmlPullParserException, IOException {
                recognitionResult.adsInfo = (RecognitionResult.AdsInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.AdsInfo.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        RecognitionResult recognitionResult = new RecognitionResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, recognitionResult);
                }
            } else if (eventType == 3 && "RecognitionResult".equalsIgnoreCase(xmlPullParser.getName())) {
                return recognitionResult;
            }
            eventType = xmlPullParser.next();
        }
        return recognitionResult;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RecognitionResult recognitionResult) throws XmlPullParserException, IOException {
        if (recognitionResult == null) {
            return;
        }
        xmlSerializer.startTag("", "RecognitionResult");
        RecognitionResult.PornInfo pornInfo = recognitionResult.pornInfo;
        if (pornInfo != null) {
            QCloudXml.toXml(xmlSerializer, pornInfo);
        }
        RecognitionResult.PoliticsInfo politicsInfo = recognitionResult.politicsInfo;
        if (politicsInfo != null) {
            QCloudXml.toXml(xmlSerializer, politicsInfo);
        }
        RecognitionResult.TerroristInfo terroristInfo = recognitionResult.terroristInfo;
        if (terroristInfo != null) {
            QCloudXml.toXml(xmlSerializer, terroristInfo);
        }
        RecognitionResult.AdsInfo adsInfo = recognitionResult.adsInfo;
        if (adsInfo != null) {
            QCloudXml.toXml(xmlSerializer, adsInfo);
        }
        xmlSerializer.endTag("", "RecognitionResult");
    }
}
