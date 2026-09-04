package w7;

import com.elvishew.xlog.internal.c;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/* JADX INFO: compiled from: DefaultXmlFormatter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f141001a = 4;

    @Override // r7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(String str) {
        if (str == null || str.trim().length() == 0) {
            com.elvishew.xlog.internal.b.e().g("XML empty.");
            return "";
        }
        try {
            StreamSource streamSource = new StreamSource(new StringReader(str));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("indent", "yes");
            transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", String.valueOf(4));
            transformerNewTransformer.transform(streamSource, streamResult);
            return streamResult.getWriter().toString().replaceFirst(">", ">" + c.f42912a);
        } catch (Exception e10) {
            com.elvishew.xlog.internal.b.e().g(e10.getMessage());
            return str;
        }
    }
}
