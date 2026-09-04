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
public class MediaInfoResponse$$XmlAdapter implements IXmlAdapter<MediaInfoResponse> {
    private HashMap<String, ChildElementBinder<MediaInfoResponse>> childElementBinders;

    public MediaInfoResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfoResponse>> map = new HashMap<>();
        this.childElementBinders = map;
        map.put("MediaInfo", new ChildElementBinder<MediaInfoResponse>() { // from class: com.tencent.cos.xml.model.tag.MediaInfoResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoResponse mediaInfoResponse) throws XmlPullParserException, IOException {
                mediaInfoResponse.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfoResponse fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        MediaInfoResponse mediaInfoResponse = new MediaInfoResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfoResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaInfoResponse);
                }
            } else if (eventType == 3 && "Response".equalsIgnoreCase(xmlPullParser.getName())) {
                return mediaInfoResponse;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfoResponse;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfoResponse mediaInfoResponse) throws XmlPullParserException, IOException {
        if (mediaInfoResponse == null) {
            return;
        }
        xmlSerializer.startTag("", "Response");
        MediaInfo mediaInfo = mediaInfoResponse.mediaInfo;
        if (mediaInfo != null) {
            QCloudXml.toXml(xmlSerializer, mediaInfo);
        }
        xmlSerializer.endTag("", "Response");
    }
}
