package com.tencent.qcloud.qcloudxml.core;

import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class QCloudXml {
    static final Map<Class<?>, IXmlAdapter<?>> XML_ADAPTERS = new HashMap();

    private static <T> IXmlAdapter<T> createXmlAdapter(Class<?> cls) {
        Map<Class<?>, IXmlAdapter<?>> map = XML_ADAPTERS;
        IXmlAdapter<T> iXmlAdapter = (IXmlAdapter) map.get(cls);
        if (iXmlAdapter != null) {
            return iXmlAdapter;
        }
        String name = cls.getName();
        try {
            IXmlAdapter<T> iXmlAdapter2 = (IXmlAdapter) Class.forName(name + "$$XmlAdapter").newInstance();
            map.put(cls, (IXmlAdapter<?>) iXmlAdapter2);
            return iXmlAdapter2;
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("No IXmlAdapter for class " + name + " found. Expected name of the xml adapter is " + name + "$$XmlAdapter", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No IXmlAdapter for class " + name + " found. Expected name of the xml adapter is " + name + "$$XmlAdapter", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No IXmlAdapter for class " + name + " found. Expected name of the xml adapter is " + name + "$$XmlAdapter", e12);
        }
    }

    public static <T> T fromXml(InputStream inputStream, Class<T> cls) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "UTF-8");
        return (T) fromXml(xmlPullParserNewPullParser, cls);
    }

    public static <T> T fromXml(XmlPullParser xmlPullParser, Class<T> cls) throws XmlPullParserException, IOException {
        return (T) createXmlAdapter(cls).fromXml(xmlPullParser);
    }

    private static String removeXMLHeader(String str) {
        return (str == null || !str.startsWith("<?xml")) ? str : str.substring(str.indexOf("?>") + 2);
    }

    public static <T> String toXml(T t10) throws XmlPullParserException, IOException {
        if (t10 == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        toXml(xmlSerializerNewSerializer, t10);
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static <T> void toXml(XmlSerializer xmlSerializer, T t10) throws XmlPullParserException, IOException {
        createXmlAdapter(t10.getClass()).toXml(xmlSerializer, t10);
    }
}
