package org.apache.tools.ant.taskdefs.optional.ejb;

import androidx.compose.material3.TextFieldImplKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.tools.ant.taskdefs.y1;
import org.apache.tools.ant.util.j2;
import org.xml.sax.AttributeList;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes5.dex */
public class IPlanetEjbc {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f134843m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f134844n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f134845o = 15;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f134846p = 9;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f134847q = "entity";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f134848r = "stateless";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f134849s = "stateful";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f134850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f134851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f134852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f134853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f134854e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private File f134857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SAXParser f134858i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134861l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f134855f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f134856g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f134859j = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Hashtable<String, File> f134860k = new Hashtable<>();

    public class EjbcException extends Exception {
        private static final long serialVersionUID = 1;

        public EjbcException(String str) {
            super(str);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f134864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f134865c;

        public a(String str) {
            if (str == null) {
                return;
            }
            this.f134863a = str;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                this.f134865c = str;
                this.f134864b = "";
            } else {
                this.f134864b = str.substring(0, iLastIndexOf);
                this.f134865c = str.substring(iLastIndexOf + 1);
            }
        }

        public File a(File file) {
            return new File(file, this.f134863a.replace(lg.a.f131414g, File.separatorChar) + ".class");
        }

        public String b() {
            return this.f134865c;
        }

        public String c() {
            return this.f134864b;
        }

        public String d() {
            return this.f134863a;
        }

        public String e() {
            return this.f134863a.replace(lg.a.f131414g, '_');
        }

        public String toString() {
            return d();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f134867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f134868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a f134869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a f134870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f134871f = IPlanetEjbc.f134847q;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f134872g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f134873h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f134874i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<String> f134875j = new ArrayList();

        public b(String str) {
            this.f134866a = str;
        }

        private long F(File file) {
            File fileA;
            File fileA2 = this.f134868c.a(file);
            long jLastModified = fileA2.lastModified();
            if (jLastModified == -1) {
                System.out.println("The class " + this.f134868c.d() + " couldn't be found on the classpath");
                return -1L;
            }
            File fileA3 = this.f134867b.a(file);
            long jLastModified2 = fileA3.lastModified();
            if (jLastModified2 == -1) {
                System.out.println("The class " + this.f134867b.d() + " couldn't be found on the classpath");
                return -1L;
            }
            long jMax = Math.max(jLastModified, jLastModified2);
            a aVar = this.f134870e;
            if (aVar != null) {
                fileA = aVar.a(file);
                long jLastModified3 = fileA.lastModified();
                if (jLastModified3 == -1) {
                    System.out.println("The class " + this.f134870e.d() + "couldn't be found on the classpath");
                    return -1L;
                }
                jMax = Math.max(jMax, jLastModified3);
            } else {
                fileA = null;
            }
            File fileA4 = this.f134869d.a(file);
            if (fileA4.lastModified() == -1) {
                System.out.println("The class " + this.f134869d.d() + " couldn't be found on the classpath");
                return -1L;
            }
            IPlanetEjbc.this.f134860k.put(this.f134868c.d().replace(lg.a.f131414g, File.separatorChar) + ".class", fileA2);
            IPlanetEjbc.this.f134860k.put(this.f134867b.d().replace(lg.a.f131414g, File.separatorChar) + ".class", fileA3);
            IPlanetEjbc.this.f134860k.put(this.f134869d.d().replace(lg.a.f131414g, File.separatorChar) + ".class", fileA4);
            if (fileA != null) {
                IPlanetEjbc.this.f134860k.put(this.f134870e.d().replace(lg.a.f131414g, File.separatorChar) + ".class", fileA);
            }
            return jMax;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(File file) throws EjbcException {
            if (this.f134867b == null) {
                throw IPlanetEjbc.this.new EjbcException("A home interface was not found for the " + this.f134866a + " EJB.");
            }
            if (this.f134868c == null) {
                throw IPlanetEjbc.this.new EjbcException("A remote interface was not found for the " + this.f134866a + " EJB.");
            }
            if (this.f134869d == null) {
                throw IPlanetEjbc.this.new EjbcException("An EJB implementation class was not found for the " + this.f134866a + " EJB.");
            }
            if (!this.f134871f.equals(IPlanetEjbc.f134847q) && !this.f134871f.equals("stateless") && !this.f134871f.equals(IPlanetEjbc.f134849s)) {
                throw IPlanetEjbc.this.new EjbcException("The beantype found (" + this.f134871f + ") isn't valid in the " + this.f134866a + " EJB.");
            }
            if (this.f134872g && !this.f134871f.equals(IPlanetEjbc.f134847q)) {
                System.out.println("CMP stubs and skeletons may not be generated for a Session Bean -- the \"cmp\" attribute will be ignoredfor the " + this.f134866a + " EJB.");
            }
            if (this.f134874i && !this.f134871f.equals(IPlanetEjbc.f134849s)) {
                System.out.println("Highly available stubs and skeletons may only be generated for a Stateful Session Bean-- the \"hasession\" attribute will be ignored for the " + this.f134866a + " EJB.");
            }
            if (!this.f134868c.a(file).exists()) {
                throw IPlanetEjbc.this.new EjbcException("The remote interface " + this.f134868c.d() + " could not be found.");
            }
            if (!this.f134867b.a(file).exists()) {
                throw IPlanetEjbc.this.new EjbcException("The home interface " + this.f134867b.d() + " could not be found.");
            }
            if (this.f134869d.a(file).exists()) {
                return;
            }
            throw IPlanetEjbc.this.new EjbcException("The EJB implementation class " + this.f134869d.d() + " could not be found.");
        }

        private String[] d() {
            String[] strArr = this.f134873h ? new String[15] : new String[9];
            String str = this.f134868c.c() + ".";
            String strB = this.f134868c.b();
            String str2 = this.f134867b.c() + ".";
            String strB2 = this.f134867b.b();
            String str3 = this.f134869d.c() + ".";
            String strE = this.f134869d.e();
            strArr[0] = str3 + "ejb_fac_" + strE;
            strArr[1] = str3 + "ejb_home_" + strE;
            strArr[2] = str3 + "ejb_skel_" + strE;
            strArr[3] = str + "ejb_kcp_skel_" + strB;
            strArr[4] = str2 + "ejb_kcp_skel_" + strB2;
            strArr[5] = str + "ejb_kcp_stub_" + strB;
            strArr[6] = str2 + "ejb_kcp_stub_" + strB2;
            strArr[7] = str + "ejb_stub_" + strB;
            strArr[8] = str2 + "ejb_stub_" + strB2;
            if (!this.f134873h) {
                return strArr;
            }
            strArr[9] = "org.omg.stub." + str + lg.a.f131412e + strB + org.apache.tools.ant.taskdefs.rmic.b.f135692d;
            strArr[10] = "org.omg.stub." + str2 + lg.a.f131412e + strB2 + org.apache.tools.ant.taskdefs.rmic.b.f135692d;
            strArr[11] = "org.omg.stub." + str + "_ejb_RmiCorbaBridge_" + strB + org.apache.tools.ant.taskdefs.rmic.b.f135694f;
            strArr[12] = "org.omg.stub." + str2 + "_ejb_RmiCorbaBridge_" + strB2 + org.apache.tools.ant.taskdefs.rmic.b.f135694f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("ejb_RmiCorbaBridge_");
            sb2.append(strB);
            strArr[13] = sb2.toString();
            strArr[14] = str2 + "ejb_RmiCorbaBridge_" + strB2;
            return strArr;
        }

        private long e(File file) {
            String[] strArrD = d();
            long epochMilli = Instant.now().toEpochMilli();
            boolean z10 = true;
            for (String str : strArrD) {
                String str2 = str.replace(lg.a.f131414g, File.separatorChar) + ".class";
                File file2 = new File(file, str2);
                IPlanetEjbc.this.f134860k.put(str2, file2);
                z10 = z10 && file2.exists();
                if (z10) {
                    epochMilli = Math.min(epochMilli, file2.lastModified());
                }
            }
            if (z10) {
                return epochMilli;
            }
            return -1L;
        }

        public void A(a aVar) {
            this.f134869d = aVar;
        }

        public void B(String str) {
            C(new a(str));
        }

        public void C(a aVar) {
            this.f134870e = aVar;
        }

        public void D(String str) {
            E(new a(str));
        }

        public void E(a aVar) {
            this.f134868c = aVar;
        }

        public void b(String str) {
            this.f134875j.add(str);
        }

        public String f() {
            return this.f134871f;
        }

        public boolean g() {
            return this.f134872g;
        }

        public List<String> h() {
            return this.f134875j;
        }

        public boolean i() {
            return this.f134874i;
        }

        public a j() {
            return this.f134867b;
        }

        public boolean k() {
            return this.f134873h;
        }

        public a l() {
            return this.f134869d;
        }

        public String m() {
            String str = this.f134866a;
            if (str != null) {
                return str;
            }
            a aVar = this.f134869d;
            return aVar == null ? "[unnamed]" : aVar.b();
        }

        public a n() {
            return this.f134870e;
        }

        public a o() {
            return this.f134868c;
        }

        public boolean p(File file) {
            return e(file) < F(file);
        }

        public void q(String str) {
            this.f134871f = str.toLowerCase();
        }

        public void r(String str) {
            s(TextFieldImplKt.f11420g.equals(str));
        }

        public void s(boolean z10) {
            this.f134872g = z10;
        }

        public void t(String str) {
            u(Boolean.parseBoolean(str));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("EJB name: " + this.f134866a + "\n\r              home:      " + this.f134867b + "\n\r              remote:    " + this.f134868c + "\n\r              impl:      " + this.f134869d + "\n\r              primaryKey: " + this.f134870e + "\n\r              beantype:  " + this.f134871f + "\n\r              cmp:       " + this.f134872g + "\n\r              iiop:      " + this.f134873h + "\n\r              hasession: " + this.f134874i);
            for (String str : this.f134875j) {
                sb2.append("\n\r              CMP Descriptor: ");
                sb2.append(str);
            }
            return sb2.toString();
        }

        public void u(boolean z10) {
            this.f134874i = z10;
        }

        public void v(String str) {
            w(new a(str));
        }

        public void w(a aVar) {
            this.f134867b = aVar;
        }

        public void x(String str) {
            y(Boolean.parseBoolean(str));
        }

        public void y(boolean z10) {
            this.f134873h = z10;
        }

        public void z(String str) {
            A(new a(str));
        }
    }

    public class c extends HandlerBase {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f134877k = "-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f134878l = "-//Sun Microsystems, Inc.//DTD iAS Enterprise JavaBeans 1.0//EN";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f134879m = "ejb-jar_1_1.dtd";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f134880n = "IASEjb_jar_1_0.dtd";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b f134884e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f134887h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f134888i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f134881b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f134882c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<String, b> f134883d = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f134885f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f134886g = "";

        public c() {
            h("-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN", f134879m);
            h(f134878l, f134880n);
        }

        private void e(String str) {
            String str2 = "\\ias-ejb-jar\\enterprise-beans\\" + this.f134888i;
            if ((str2 + "\\ejb-name").equals(this.f134886g)) {
                this.f134884e = (b) this.f134883d.computeIfAbsent(str, new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.m
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f134993a.f((String) obj);
                    }
                });
                return;
            }
            if ((str2 + "\\iiop").equals(this.f134886g)) {
                this.f134884e.x(str);
                return;
            }
            if ((str2 + "\\failover-required").equals(this.f134886g)) {
                this.f134884e.t(str);
                return;
            }
            if ((str2 + "\\persistence-manager\\properties-file-location").equals(this.f134886g)) {
                this.f134884e.b(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ b f(String str) {
            return IPlanetEjbc.this.new b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ b g(String str) {
            return IPlanetEjbc.this.new b(str);
        }

        private void i(String str) {
            if ("\\ejb-jar\\display-name".equals(this.f134886g)) {
                IPlanetEjbc.this.f134861l = str;
                return;
            }
            String str2 = "\\ejb-jar\\enterprise-beans\\" + this.f134888i;
            if ((str2 + "\\ejb-name").equals(this.f134886g)) {
                this.f134884e = (b) this.f134883d.computeIfAbsent(str, new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.n
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f134999a.g((String) obj);
                    }
                });
                return;
            }
            if ((str2 + "\\home").equals(this.f134886g)) {
                this.f134884e.v(str);
                return;
            }
            if ((str2 + "\\remote").equals(this.f134886g)) {
                this.f134884e.D(str);
                return;
            }
            if ((str2 + "\\ejb-class").equals(this.f134886g)) {
                this.f134884e.z(str);
                return;
            }
            if ((str2 + "\\prim-key-class").equals(this.f134886g)) {
                this.f134884e.B(str);
                return;
            }
            if ((str2 + "\\session-type").equals(this.f134886g)) {
                this.f134884e.q(str);
                return;
            }
            if ((str2 + "\\persistence-type").equals(this.f134886g)) {
                this.f134884e.r(str);
            }
        }

        public String c() {
            return IPlanetEjbc.this.f134861l;
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void characters(char[] cArr, int i10, int i11) throws SAXException {
            this.f134887h += new String(cArr).substring(i10, i11 + i10);
        }

        public b[] d() {
            return (b[]) this.f134883d.values().toArray(new b[this.f134883d.size()]);
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void endElement(String str) throws SAXException {
            if (this.f134885f) {
                e(this.f134887h);
            } else {
                i(this.f134887h);
            }
            int length = str.length() + 1;
            this.f134886g = this.f134886g.substring(0, this.f134886g.length() - length);
        }

        public void h(String str, String str2) {
            IPlanetEjbc.this.o("Registering: " + str2);
            if (str == null || str2 == null) {
                return;
            }
            if (ClassLoader.getSystemResource(str2) != null) {
                IPlanetEjbc.this.o("Found resource: " + str2);
                this.f134881b.put(str, str2);
                return;
            }
            File file = new File(str2);
            if (file.exists() && file.isFile()) {
                IPlanetEjbc.this.o("Found file: " + str2);
                this.f134882c.put(str, str2);
            }
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) throws SAXException {
            InputStream inputStreamNewInputStream = null;
            try {
                String str3 = this.f134881b.get(str);
                if (str3 != null) {
                    inputStreamNewInputStream = ClassLoader.getSystemResource(str3).openStream();
                } else {
                    String str4 = this.f134882c.get(str);
                    if (str4 != null) {
                        inputStreamNewInputStream = Files.newInputStream(Paths.get(str4, new String[0]), new OpenOption[0]);
                    }
                }
            } catch (IOException unused) {
            }
            return inputStreamNewInputStream == null ? super.resolveEntity(str, str2) : new InputSource(inputStreamNewInputStream);
        }

        @Override // org.xml.sax.HandlerBase, org.xml.sax.DocumentHandler
        public void startElement(String str, AttributeList attributeList) throws SAXException {
            String str2 = this.f134886g + "\\" + str;
            this.f134886g = str2;
            this.f134887h = "";
            if ("\\ejb-jar".equals(str2)) {
                this.f134885f = false;
            } else if ("\\ias-ejb-jar".equals(this.f134886g)) {
                this.f134885f = true;
            }
            if (com.umeng.analytics.pro.d.aw.equals(str) || IPlanetEjbc.f134847q.equals(str)) {
                this.f134888i = str;
            }
        }
    }

    public static class d extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InputStream f134890b;

        public d(InputStream inputStream) {
            this.f134890b = inputStream;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f134890b));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            return;
                        }
                        System.out.println(line);
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    e.printStackTrace();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public IPlanetEjbc(File file, File file2, File file3, String str, SAXParser sAXParser) {
        this.f134850a = file;
        this.f134851b = file2;
        this.f134852c = file3;
        this.f134853d = str;
        this.f134858i = sAXParser;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, File.pathSeparator);
            this.f134854e = (String[]) Collections.list(stringTokenizer).toArray(new String[stringTokenizer.countTokens()]);
        }
    }

    private String[] f(b bVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f134856g) {
            arrayList.add("-debug");
        }
        if (bVar.f().equals("stateless")) {
            arrayList.add("-sl");
        } else if (bVar.f().equals(f134849s)) {
            arrayList.add("-sf");
        }
        if (bVar.k()) {
            arrayList.add("-iiop");
        }
        if (bVar.g()) {
            arrayList.add("-cmp");
        }
        if (this.f134855f) {
            arrayList.add("-gs");
        }
        if (bVar.i()) {
            arrayList.add("-fo");
        }
        arrayList.add("-classpath");
        arrayList.add(this.f134853d);
        arrayList.add("-d");
        arrayList.add(this.f134852c.toString());
        arrayList.add(bVar.j().d());
        arrayList.add(bVar.o().d());
        arrayList.add(bVar.l().d());
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void g(String[] strArr) {
        String string;
        if (this.f134857h == null) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f134857h.toString());
            String str = File.separator;
            sb2.append(str);
            sb2.append("bin");
            sb2.append(str);
            string = sb2.toString();
        }
        String str2 = string + "ejbc ";
        String strA = y1.a(" ", strArr);
        o(str2 + strA);
        try {
            Process processExec = Runtime.getRuntime().exec(str2 + strA);
            d dVar = new d(processExec.getInputStream());
            d dVar2 = new d(processExec.getErrorStream());
            dVar.start();
            dVar2.start();
            processExec.waitFor();
            processExec.destroy();
        } catch (IOException e10) {
            o("An IOException has occurred while trying to execute ejbc.");
            o(j2.b(e10));
        } catch (InterruptedException unused) {
        }
    }

    private b[] m() throws SAXException, IOException {
        this.f134858i.parse(this.f134850a, this.f134859j);
        this.f134858i.parse(this.f134851b, this.f134859j);
        return this.f134859j.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] n(int i10) {
        return new String[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        if (this.f134856g) {
            System.out.println(str);
        }
    }

    public static void p(String[] strArr) {
        if (strArr.length < 2 || strArr.length > 8) {
            u();
            return;
        }
        File file = new File(strArr[strArr.length - 2]);
        File file2 = new File(strArr[strArr.length - 1]);
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        File file3 = null;
        while (i10 < strArr.length - 2) {
            if ("-classpath".equals(strArr[i10])) {
                i10++;
                str = strArr[i10];
            } else if ("-d".equals(strArr[i10])) {
                i10++;
                file3 = new File(strArr[i10]);
            } else if ("-debug".equals(strArr[i10])) {
                z10 = true;
            } else {
                if (!"-keepsource".equals(strArr[i10])) {
                    u();
                    return;
                }
                z11 = true;
            }
            i10++;
        }
        String property = str == null ? System.getProperties().getProperty("java.class.path") : str;
        File file4 = file3 == null ? new File(System.getProperties().getProperty("user.dir")) : file3;
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setValidating(true);
        try {
            IPlanetEjbc iPlanetEjbc = new IPlanetEjbc(file, file2, file4, property, sAXParserFactoryNewInstance.newSAXParser());
            iPlanetEjbc.r(z10);
            iPlanetEjbc.t(z11);
            try {
                iPlanetEjbc.i();
            } catch (IOException e10) {
                System.out.println("An IOException has occurred while reading the XML descriptors (" + e10.getMessage() + ").");
            } catch (EjbcException e11) {
                System.out.println("An error has occurred while executing the ejbc utility (" + e11.getMessage() + ").");
            } catch (SAXException e12) {
                System.out.println("A SAXException has occurred while reading the XML descriptors (" + e12.getMessage() + ").");
            }
        } catch (Exception e13) {
            System.out.println("An exception was generated while trying to ");
            System.out.println("create a new SAXParser.");
            e13.printStackTrace();
        }
    }

    private static void u() {
        System.out.println("java org.apache.tools.ant.taskdefs.optional.ejb.IPlanetEjbc \\");
        System.out.println("  [OPTIONS] [EJB 1.1 descriptor] [iAS EJB descriptor]");
        System.out.println();
        System.out.println("Where OPTIONS are:");
        System.out.println("  -debug -- for additional debugging output");
        System.out.println("  -keepsource -- to retain Java source files generated");
        System.out.println("  -classpath [classpath] -- classpath used for compilation");
        System.out.println("  -d [destination directory] -- directory for compiled classes");
        System.out.println();
        System.out.println("If a classpath is not specified, the system classpath");
        System.out.println("will be used.  If a destination directory is not specified,");
        System.out.println("the current working directory will be used (classes will");
        System.out.println("still be placed in subfolders which correspond to their");
        System.out.println("package name).");
        System.out.println();
        System.out.println("The EJB home interface, remote interface, and implementation");
        System.out.println("class must be found in the destination directory.  In");
        System.out.println("addition, the destination will look for the stubs and skeletons");
        System.out.println("in the destination directory to ensure they are up to date.");
    }

    protected void h() throws EjbcException {
        StringBuilder sb2 = new StringBuilder();
        if (this.f134850a == null) {
            sb2.append("A standard XML descriptor file must be specified.  ");
        }
        if (this.f134851b == null) {
            sb2.append("An iAS-specific XML descriptor file must be specified.  ");
        }
        if (this.f134853d == null) {
            sb2.append("A classpath must be specified.    ");
        }
        if (this.f134858i == null) {
            sb2.append("An XML parser must be specified.    ");
        }
        File file = this.f134852c;
        if (file == null) {
            sb2.append("A destination directory must be specified.  ");
        } else if (!file.exists()) {
            sb2.append("The destination directory specified does not exist.  ");
        } else if (!this.f134852c.isDirectory()) {
            sb2.append("The destination specified is not a directory.  ");
        }
        if (sb2.length() > 0) {
            throw new EjbcException(sb2.toString());
        }
    }

    public void i() throws EjbcException, SAXException, IOException {
        h();
        b[] bVarArrM = m();
        for (b bVar : bVarArrM) {
            o("EJBInfo...");
            o(bVar.toString());
        }
        for (b bVar2 : bVarArrM) {
            bVar2.c(this.f134852c);
            if (bVar2.p(this.f134852c)) {
                o(bVar2.m() + " must be recompiled using ejbc.");
                g(f(bVar2));
            } else {
                o(bVar2.m() + " is up to date.");
            }
        }
    }

    public String[] j() {
        return (String[]) Stream.of((Object[]) this.f134859j.d()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((IPlanetEjbc.b) obj).h();
            }
        }).flatMap(new Function() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((List) obj).stream();
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.optional.ejb.l
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return IPlanetEjbc.n(i10);
            }
        });
    }

    public String k() {
        return this.f134861l;
    }

    public Hashtable<String, File> l() {
        return this.f134860k;
    }

    public void q(String str, String str2) {
        this.f134859j.h(str, str2);
    }

    public void r(boolean z10) {
        this.f134856g = z10;
    }

    public void s(File file) {
        this.f134857h = file;
    }

    public void t(boolean z10) {
        this.f134855f = z10;
    }
}
