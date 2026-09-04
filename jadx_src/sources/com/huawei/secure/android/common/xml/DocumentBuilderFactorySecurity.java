package com.huawei.secure.android.common.xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.tools.ant.util.y2;

/* JADX INFO: loaded from: classes7.dex */
public class DocumentBuilderFactorySecurity {
    public static DocumentBuilderFactory getInstance() throws ParserConfigurationException, NullPointerException {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setFeature(y2.f137028f, true);
        documentBuilderFactoryNewInstance.setFeature(y2.f137027e, false);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        return documentBuilderFactoryNewInstance;
    }
}
