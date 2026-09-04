package com.tencent.qcloud.qcloudxml.core;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public interface IXmlAdapter<T> {
    T fromXml(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException;

    void toXml(XmlSerializer xmlSerializer, T t10) throws XmlPullParserException, IOException;
}
