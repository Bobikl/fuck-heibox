package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/* JADX INFO: compiled from: DOMElementWriter.java */
/* JADX INFO: loaded from: classes5.dex */
public class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f136995g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f136996h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f136997i = "ns";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f136998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f136999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f137000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Element, List<String>> f137002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String[] f137003f;

    /* JADX INFO: compiled from: DOMElementWriter.java */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f137004c = new a(false, false);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f137005d = new a(true, false);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f137006e = new a(true, true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f137007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f137008b;

        public a(boolean z10, boolean z11) {
            this.f137007a = z10;
            this.f137008b = z11;
        }
    }

    static {
        for (int i10 = 9; i10 < 14; i10++) {
            f136996h[i10 - 9] = "&#x" + Integer.toHexString(i10) + ";";
        }
    }

    public y() {
        this.f136998a = true;
        this.f136999b = a.f137004c;
        this.f137000c = new HashMap();
        this.f137001d = 0;
        this.f137002e = new HashMap();
        this.f137003f = new String[]{"gt", "amp", "lt", "apos", "quot"};
    }

    public y(boolean z10) {
        this(z10, a.f137004c);
    }

    public y(boolean z10, a aVar) {
        this.f136998a = true;
        this.f136999b = a.f137004c;
        this.f137000c = new HashMap();
        this.f137001d = 0;
        this.f137002e = new HashMap();
        this.f137003f = new String[]{"gt", "amp", "lt", "apos", "quot"};
        this.f136998a = z10;
        this.f136999b = aVar;
    }

    private void b(Element element, String str) {
        ((List) this.f137002e.computeIfAbsent(element, new Function() { // from class: org.apache.tools.ant.util.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return y.l((Element) obj);
            }
        })).add(str);
    }

    private String e(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (char c10 : str.toCharArray()) {
            if (c10 == '\t' || c10 == '\n' || c10 == '\r') {
                if (z10) {
                    sb2.append(f136996h[c10 - '\t']);
                } else {
                    sb2.append(c10);
                }
            } else if (c10 == '\"') {
                sb2.append("&quot;");
            } else if (c10 == '<') {
                sb2.append("&lt;");
            } else if (c10 == '>') {
                sb2.append("&gt;");
            } else if (c10 == '&') {
                sb2.append("&amp;");
            } else if (c10 == '\'') {
                sb2.append("&apos;");
            } else if (j(c10)) {
                sb2.append(c10);
            }
        }
        return sb2.substring(0);
    }

    private static String i(Node node) {
        String namespaceURI = node.getNamespaceURI();
        return namespaceURI == null ? "" : namespaceURI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List l(Element element) {
        return new ArrayList();
    }

    private void o(Element element) {
        List<String> list = this.f137002e.get(element);
        if (list != null) {
            final Map<String, String> map = this.f137000c;
            Objects.requireNonNull(map);
            list.forEach(new Consumer() { // from class: org.apache.tools.ant.util.x
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    map.remove((String) obj);
                }
            });
            this.f137002e.remove(element);
        }
    }

    public void c(Element element, Writer writer, int i10, String str, boolean z10) throws IOException {
        if (z10) {
            for (int i11 = 0; i11 < i10; i11++) {
                writer.write(str);
            }
        }
        writer.write("</");
        if (this.f136999b.f137007a) {
            String str2 = this.f137000c.get(i(element));
            if (str2 != null && !str2.isEmpty()) {
                writer.write(str2);
                writer.write(":");
            }
            o(element);
        }
        writer.write(element.getTagName());
        writer.write(String.format(">%n", new Object[0]));
        writer.flush();
    }

    public String d(String str) {
        return e(str, false);
    }

    public String f(String str) {
        return e(str, true);
    }

    public String g(String str) {
        StringWriter stringWriter = new StringWriter();
        try {
            h(stringWriter, str);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void h(Writer writer, String str) throws IOException {
        int length = str.length();
        int iIndexOf = str.indexOf("]]>");
        int i10 = 0;
        while (i10 < length) {
            int i11 = iIndexOf < 0 ? length : iIndexOf;
            while (i10 < i11) {
                int i12 = i10;
                while (i12 < i11 && j(str.charAt(i12))) {
                    i12++;
                }
                writer.write(str, i10, i12 - i10);
                i10 = i12 + 1;
            }
            if (iIndexOf >= 0) {
                writer.write("]]]]><![CDATA[>");
                int i13 = iIndexOf + 3;
                i10 = i13;
                iIndexOf = str.indexOf("]]>", i13);
            } else {
                i10 = i11;
            }
        }
    }

    public boolean j(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r') {
            return true;
        }
        if (c10 < ' ') {
            return false;
        }
        if (c10 <= 55295) {
            return true;
        }
        return c10 >= 57344 && c10 <= 65533;
    }

    public boolean k(String str) {
        if (str.charAt(0) == '&' && str.endsWith(";")) {
            if (str.charAt(1) == '#') {
                if (str.charAt(2) == 'x') {
                    try {
                        Integer.parseInt(str.substring(3, str.length() - 1), 16);
                        return true;
                    } catch (NumberFormatException unused) {
                        return false;
                    }
                }
                try {
                    Integer.parseInt(str.substring(2, str.length() - 1));
                    return true;
                } catch (NumberFormatException unused2) {
                    return false;
                }
            }
            String strSubstring = str.substring(1, str.length() - 1);
            for (String str2 : this.f137003f) {
                if (strSubstring.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void m(Element element, Writer writer, int i10, String str) throws IOException {
        n(element, writer, i10, str, true);
    }

    public void n(Element element, Writer writer, int i10, String str, boolean z10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            writer.write(str);
        }
        writer.write("<");
        if (this.f136999b.f137007a) {
            String strI = i(element);
            String string = this.f137000c.get(strI);
            if (string == null) {
                if (this.f137000c.isEmpty()) {
                    string = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f136997i);
                    int i12 = this.f137001d;
                    this.f137001d = i12 + 1;
                    sb2.append(i12);
                    string = sb2.toString();
                }
                this.f137000c.put(strI, string);
                b(element, strI);
            }
            if (!string.isEmpty()) {
                writer.write(string);
                writer.write(":");
            }
        }
        writer.write(element.getTagName());
        NamedNodeMap attributes = element.getAttributes();
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            Attr attr = (Attr) attributes.item(i13);
            writer.write(" ");
            if (this.f136999b.f137008b) {
                String strI2 = i(attr);
                String string2 = this.f137000c.get(strI2);
                if (string2 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(f136997i);
                    int i14 = this.f137001d;
                    this.f137001d = i14 + 1;
                    sb3.append(i14);
                    string2 = sb3.toString();
                    this.f137000c.put(strI2, string2);
                    b(element, strI2);
                }
                writer.write(string2);
                writer.write(":");
            }
            writer.write(attr.getName());
            writer.write("=\"");
            writer.write(f(attr.getValue()));
            writer.write("\"");
        }
        List<String> list = this.f137002e.get(element);
        if (list != null) {
            for (String str2 : list) {
                String str3 = this.f137000c.get(str2);
                writer.write(" xmlns");
                if (!str3.isEmpty()) {
                    writer.write(":");
                    writer.write(str3);
                }
                writer.write("=\"");
                writer.write(str2);
                writer.write("\"");
            }
        }
        if (z10) {
            writer.write(">");
            return;
        }
        o(element);
        writer.write(String.format(" />%n", new Object[0]));
        writer.flush();
    }

    public void p(Element element, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
        r(outputStreamWriter);
        q(element, outputStreamWriter, 0, "  ");
        outputStreamWriter.flush();
    }

    public void q(Element element, Writer writer, int i10, String str) throws IOException {
        NodeList childNodes = element.getChildNodes();
        boolean z10 = childNodes.getLength() > 0;
        n(element, writer, i10, str, z10);
        if (z10) {
            boolean z11 = false;
            for (int i11 = 0; i11 < childNodes.getLength(); i11++) {
                Node nodeItem = childNodes.item(i11);
                short nodeType = nodeItem.getNodeType();
                if (nodeType == 1) {
                    if (i11 == 0) {
                        writer.write(System.lineSeparator());
                    }
                    q((Element) nodeItem, writer, i10 + 1, str);
                    z11 = true;
                } else if (nodeType == 3) {
                    writer.write(d(nodeItem.getNodeValue()));
                } else if (nodeType == 4) {
                    writer.write("<![CDATA[");
                    h(writer, ((Text) nodeItem).getData());
                    writer.write("]]>");
                } else if (nodeType == 5) {
                    writer.write(38);
                    writer.write(nodeItem.getNodeName());
                    writer.write(59);
                } else if (nodeType == 7) {
                    writer.write("<?");
                    writer.write(nodeItem.getNodeName());
                    String nodeValue = nodeItem.getNodeValue();
                    if (nodeValue != null && !nodeValue.isEmpty()) {
                        writer.write(32);
                        writer.write(nodeValue);
                    }
                    writer.write("?>");
                } else if (nodeType == 8) {
                    writer.write("<!--");
                    writer.write(d(nodeItem.getNodeValue()));
                    writer.write("-->");
                }
            }
            c(element, writer, i10, str, z11);
        }
    }

    public void r(Writer writer) throws IOException {
        if (this.f136998a) {
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        }
    }
}
