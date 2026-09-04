package org.apache.tools.ant.taskdefs.optional;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.y2;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: SchemaValidate.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends h0 {
    public static final String E = "SAX1 parsers are not supported";
    public static final String F = "Parser does not support Xerces or JAXP schema features";
    public static final String G = "Only one of defaultSchemaFile and defaultSchemaURL allowed";
    public static final String H = "Could not create parser";
    public static final String I = "Adding schema ";
    public static final String J = "Duplicate declaration of schema ";
    private Map<String, a> A = new HashMap();
    private boolean B = true;
    private boolean C = false;
    private a D;

    /* JADX INFO: compiled from: SchemaValidate.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f134675d = "No namespace URI";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f134676e = "Both URL and File were given for schema ";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f134677f = "File not found: ";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f134678g = "Cannot make a URL of ";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f134679h = "No file or URL supplied for the schema ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f134681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f134682c;

        private boolean f(String str) {
            return (str == null || str.isEmpty()) ? false : true;
        }

        public File a() {
            return this.f134681b;
        }

        public String b() {
            return this.f134680a;
        }

        public String c() {
            boolean z10 = this.f134681b != null;
            boolean zF = f(this.f134682c);
            if (!z10 && !zF) {
                throw new BuildException(f134679h + this.f134680a);
            }
            if (z10 && zF) {
                throw new BuildException(f134676e + this.f134680a);
            }
            String str = this.f134682c;
            if (!z10) {
                return str;
            }
            if (!this.f134681b.exists()) {
                throw new BuildException(f134677f + this.f134681b);
            }
            try {
                return j0.O().N(this.f134681b).toString();
            } catch (MalformedURLException e10) {
                throw new BuildException(f134678g + this.f134681b, e10);
            }
        }

        public String d() throws BuildException {
            j();
            return this.f134680a + ' ' + c();
        }

        public String e() {
            return this.f134682c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            File file = this.f134681b;
            if (file != null ? file.equals(aVar.f134681b) : aVar.f134681b == null) {
                String str = this.f134680a;
                if (str != null ? str.equals(aVar.f134680a) : aVar.f134680a == null) {
                    String str2 = this.f134682c;
                    String str3 = aVar.f134682c;
                    if (str2 == null) {
                        if (str3 == null) {
                            return true;
                        }
                    } else if (str2.equals(str3)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void g(File file) {
            this.f134681b = file;
        }

        public void h(String str) {
            this.f134680a = str;
        }

        public int hashCode() {
            String str = this.f134680a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 29;
            File file = this.f134681b;
            int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 29;
            String str2 = this.f134682c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public void i(String str) {
            this.f134682c = str;
        }

        public void j() {
            if (!f(b())) {
                throw new BuildException(f134675d);
            }
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            String str2 = this.f134680a;
            if (str2 == null) {
                str2 = "(anonymous)";
            }
            sb2.append(str2);
            String str3 = "";
            if (this.f134682c == null) {
                str = "";
            } else {
                str = " " + this.f134682c;
            }
            sb2.append(str);
            if (this.f134681b != null) {
                str3 = " " + this.f134681b.getAbsolutePath();
            }
            sb2.append(str3);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P2(String str) {
        x1(I + str, 3);
    }

    private void U2(String str) {
        String strO2 = O2();
        if (strO2 != null) {
            G2(str, strO2);
        }
    }

    public void J2(a aVar) {
        x1("adding schema " + aVar, 4);
        aVar.j();
        a aVar2 = this.A.get(aVar.b());
        if (aVar2 == null || aVar2.equals(aVar)) {
            this.A.put(aVar.b(), aVar);
            return;
        }
        throw new BuildException(J + aVar);
    }

    protected void K2() {
        if (this.A.isEmpty()) {
            return;
        }
        G2(y2.f137023a, (String) this.A.values().stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((a0.a) obj).d();
            }
        }).peek(new Consumer() { // from class: org.apache.tools.ant.taskdefs.optional.z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f135504b.P2((String) obj);
            }
        }).collect(Collectors.joining(" ")));
    }

    protected void L2() {
        if (this.D == null) {
            this.D = new a();
        }
        this.D.h("(no namespace)");
    }

    public boolean M2() {
        try {
            G2(y2.f137029g, y2.f137031i);
            U2(y2.f137030h);
            return true;
        } catch (BuildException e10) {
            x1(e10.toString(), 3);
            return false;
        }
    }

    public boolean N2() {
        try {
            D2(y2.f137026d, true);
            U2(y2.f137024b);
            return true;
        } catch (BuildException e10) {
            x1(e10.toString(), 3);
            return false;
        }
    }

    protected String O2() {
        a aVar = this.D;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    public void Q2(boolean z10) {
        this.C = z10;
    }

    protected void R2(String str, boolean z10) {
        try {
            v2().setFeature(str, z10);
        } catch (SAXNotRecognizedException unused) {
            x1("Not recognized: " + str, 3);
        } catch (SAXNotSupportedException unused2) {
            x1("Not supported: " + str, 3);
        }
    }

    public void S2(boolean z10) {
        this.B = z10;
    }

    public void T2(File file) {
        L2();
        this.D.g(file);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.h0, org.apache.tools.ant.u2
    public void V1() throws BuildException {
        super.V1();
        F2(false);
    }

    public void V2(String str) {
        L2();
        this.D.i(str);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.h0
    protected XMLReader p2() {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setValidating(true);
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        try {
            return sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
        } catch (ParserConfigurationException | SAXException e10) {
            throw new BuildException(H, e10);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.h0
    protected void w2() {
        super.w2();
        if (x2()) {
            throw new BuildException(E);
        }
        D2(y2.f137028f, true);
        if (!N2() && !M2()) {
            throw new BuildException(F);
        }
        D2(y2.f137025c, this.B);
        R2(y2.f137033k, this.C);
        K2();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.h0
    protected void y2(int i10) {
        x1(i10 + h0.f135123z, 3);
    }
}
