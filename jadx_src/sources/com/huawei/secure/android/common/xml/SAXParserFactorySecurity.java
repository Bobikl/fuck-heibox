package com.huawei.secure.android.common.xml;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.tools.ant.util.y2;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* JADX INFO: loaded from: classes7.dex */
public class SAXParserFactorySecurity {
    public static SAXParserFactory getInstance() throws SAXNotRecognizedException, SAXNotSupportedException, ParserConfigurationException, NullPointerException {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setFeature(y2.f137028f, true);
        sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
        sAXParserFactoryNewInstance.setFeature(y2.f137027e, false);
        sAXParserFactoryNewInstance.setFeature(y2.f137032j, false);
        sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/string-interning", true);
        return sAXParserFactoryNewInstance;
    }
}
