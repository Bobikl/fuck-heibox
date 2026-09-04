package com.tencent.qcloud.qcloudxml.core;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public interface ChildElementBinder<T> {
    void fromXml(XmlPullParser xmlPullParser, T t10) throws XmlPullParserException, IOException;
}
