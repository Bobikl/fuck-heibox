package com.tencent.cos.xml.transfer;

import com.tencent.cos.xml.model.tag.CompleteMultipartUpload;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes4.dex */
public class XmlSlimBuilder {
    private static void addElement(XmlSerializer xmlSerializer, String str, String str2) throws IOException {
        if (str2 != null) {
            xmlSerializer.startTag("", str);
            xmlSerializer.text(str2);
            xmlSerializer.endTag("", str);
        }
    }

    public static String buildCompleteMultipartUpload(CompleteMultipartUpload completeMultipartUpload) throws XmlPullParserException, IOException {
        if (completeMultipartUpload == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        xmlSerializerNewSerializer.startTag("", "CompleteMultipartUpload");
        List<CompleteMultipartUpload.Part> list = completeMultipartUpload.parts;
        if (list != null) {
            for (CompleteMultipartUpload.Part part : list) {
                if (part != null) {
                    xmlSerializerNewSerializer.startTag("", "Part");
                    addElement(xmlSerializerNewSerializer, "PartNumber", String.valueOf(part.partNumber));
                    addElement(xmlSerializerNewSerializer, "ETag", part.eTag);
                    xmlSerializerNewSerializer.endTag("", "Part");
                }
            }
        }
        xmlSerializerNewSerializer.endTag("", "CompleteMultipartUpload");
        xmlSerializerNewSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    private static String removeXMLHeader(String str) {
        return (str == null || !str.startsWith("<?xml")) ? str : str.substring(str.indexOf("?>") + 2);
    }
}
