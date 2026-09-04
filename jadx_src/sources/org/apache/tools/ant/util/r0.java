package org.apache.tools.ant.util;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.tools.ant.BuildException;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: JAXPUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f136897a = j0.O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SAXParserFactory f136898b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SAXParserFactory f136899c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static DocumentBuilderFactory f136900d = null;

    private static BuildException a(SAXException sAXException) {
        Exception exception = sAXException.getException();
        return exception != null ? new BuildException(exception) : new BuildException(sAXException);
    }

    public static DocumentBuilder b() throws BuildException {
        try {
            return c().newDocumentBuilder();
        } catch (ParserConfigurationException e10) {
            throw new BuildException(e10);
        }
    }

    private static synchronized DocumentBuilderFactory c() throws BuildException {
        if (f136900d == null) {
            try {
                f136900d = DocumentBuilderFactory.newInstance();
            } catch (FactoryConfigurationError e10) {
                throw new BuildException("Document builder factory has not been configured correctly: " + e10.getMessage(), e10);
            }
        }
        return f136900d;
    }

    public static synchronized SAXParserFactory d() throws BuildException {
        if (f136899c == null) {
            SAXParserFactory sAXParserFactoryJ = j();
            f136899c = sAXParserFactoryJ;
            sAXParserFactoryJ.setNamespaceAware(true);
        }
        return f136899c;
    }

    public static XMLReader e() throws BuildException {
        try {
            return k(d()).getXMLReader();
        } catch (SAXException e10) {
            throw a(e10);
        }
    }

    public static Parser f() throws BuildException {
        try {
            return k(g()).getParser();
        } catch (SAXException e10) {
            throw a(e10);
        }
    }

    public static synchronized SAXParserFactory g() throws BuildException {
        if (f136898b == null) {
            f136898b = j();
        }
        return f136898b;
    }

    public static String h(File file) {
        return f136897a.q0(file.getAbsolutePath());
    }

    public static XMLReader i() throws BuildException {
        try {
            return k(g()).getXMLReader();
        } catch (SAXException e10) {
            throw a(e10);
        }
    }

    public static SAXParserFactory j() throws BuildException {
        try {
            return SAXParserFactory.newInstance();
        } catch (FactoryConfigurationError e10) {
            throw new BuildException("XML parser factory has not been configured correctly: " + e10.getMessage(), e10);
        }
    }

    private static SAXParser k(SAXParserFactory sAXParserFactory) throws BuildException {
        try {
            return sAXParserFactory.newSAXParser();
        } catch (ParserConfigurationException e10) {
            throw new BuildException("Cannot create parser for the given configuration: " + e10.getMessage(), e10);
        } catch (SAXException e11) {
            throw a(e11);
        }
    }
}
