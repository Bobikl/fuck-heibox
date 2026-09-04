package com.huawei.secure.android.common.xml;

import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes7.dex */
public class XmlPullParserFactorySecurity {
    public static XmlPullParserFactory getInstance() throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes", false);
        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#validation", false);
        return xmlPullParserFactoryNewInstance;
    }
}
