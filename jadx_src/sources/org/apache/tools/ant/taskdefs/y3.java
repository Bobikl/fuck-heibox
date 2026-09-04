package org.apache.tools.ant.taskdefs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Manifest.java */
/* JADX INFO: loaded from: classes5.dex */
public class y3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f135964d = "Manifest-Version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f135965e = "Signature-Version";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f135966f = "Name";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f135967g = "From";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f135968h = "Class-Path";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f135969i = "1.0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f135970j = 72;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f135971k = 70;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f135972l = "\r\n";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f135973m = "Manifest attributes should not start with \"From\" in \"";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Charset f135974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final String f135975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f135976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f135977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f135978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f135979s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f135980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f135981b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, b> f135982c = new LinkedHashMap();

    /* JADX INFO: compiled from: Manifest.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f135983d = 68;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f135984e = 70;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Vector<String> f135986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f135987c;

        public a() {
            this.f135985a = null;
            this.f135986b = new Vector<>();
            this.f135987c = 0;
        }

        public a(String str) throws ManifestException {
            this.f135985a = null;
            this.f135986b = new Vector<>();
            this.f135987c = 0;
            g(str);
        }

        public a(String str, String str2) {
            this.f135985a = null;
            this.f135986b = new Vector<>();
            this.f135987c = 0;
            this.f135985a = str;
            i(str2);
        }

        private void l(PrintWriter printWriter, String str) throws IOException {
            String string;
            int length = this.f135985a.getBytes(y3.f135974n).length;
            if (length <= 68) {
                string = this.f135985a + ": " + str;
            } else {
                if (length > 70) {
                    throw new IOException("Unable to write manifest line " + this.f135985a + ": " + str);
                }
                printWriter.print(this.f135985a + ": \r\n");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" ");
                sb2.append(str);
                string = sb2.toString();
            }
            while (string.getBytes(y3.f135974n).length > 70) {
                int length2 = 70 >= string.length() ? string.length() - 1 : 70;
                String strSubstring = string.substring(0, length2);
                while (strSubstring.getBytes(y3.f135974n).length > 70 && length2 > 0) {
                    length2--;
                    strSubstring = string.substring(0, length2);
                }
                if (length2 == 0) {
                    throw new IOException("Unable to write manifest line " + this.f135985a + ": " + str);
                }
                printWriter.print(strSubstring + "\r\n");
                string = " " + string.substring(length2);
            }
            printWriter.print(string + "\r\n");
        }

        public void a(String str) {
            i(this.f135986b.elementAt(this.f135987c) + str.substring(1));
        }

        public void b(String str) {
            this.f135987c++;
            i(str);
        }

        public String c() {
            String str = this.f135985a;
            if (str == null) {
                return null;
            }
            return str.toLowerCase(Locale.ENGLISH);
        }

        public String d() {
            return this.f135985a;
        }

        public String e() {
            if (this.f135986b.isEmpty()) {
                return null;
            }
            return com.max.xiaoheihe.module.bbs.post_edit.o.a(" ", this.f135986b);
        }

        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            String strC = c();
            String strC2 = aVar.c();
            if (strC != null || strC2 == null) {
                return (strC == null || strC.equals(strC2)) && this.f135986b.equals(aVar.f135986b);
            }
            return false;
        }

        public Enumeration<String> f() {
            return this.f135986b.elements();
        }

        public void g(String str) throws ManifestException {
            int iIndexOf = str.indexOf(": ");
            if (iIndexOf != -1) {
                this.f135985a = str.substring(0, iIndexOf);
                i(str.substring(iIndexOf + 2));
            } else {
                throw new ManifestException("Manifest line \"" + str + "\" is not valid as it does not contain a name and a value separated by ': '");
            }
        }

        public void h(String str) {
            this.f135985a = str;
        }

        public int hashCode() {
            return Objects.hash(c(), this.f135986b);
        }

        public void i(String str) {
            if (this.f135987c < this.f135986b.size()) {
                this.f135986b.setElementAt(str, this.f135987c);
            } else {
                this.f135986b.addElement(str);
                this.f135987c = this.f135986b.size() - 1;
            }
        }

        public void j(PrintWriter printWriter) throws IOException {
            k(printWriter, false);
        }

        public void k(PrintWriter printWriter, boolean z10) throws IOException {
            if (z10) {
                l(printWriter, e());
                return;
            }
            Iterator<String> it = this.f135986b.iterator();
            while (it.hasNext()) {
                l(printWriter, it.next());
            }
        }
    }

    /* JADX INFO: compiled from: Manifest.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f135988a = new Vector();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f135989b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, a> f135990c = new LinkedHashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ a k(String str) {
            return new a(f(str).d(), f(str).e());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(a aVar) {
            if (aVar == null) {
                return;
            }
            this.f135990c.put(aVar.c(), aVar);
        }

        public Object clone() {
            final b bVar = new b();
            bVar.p(this.f135989b);
            org.apache.tools.ant.util.h2.a(g()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.z3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f136027a.k((String) obj);
                }
            }).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.a4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f133717b.q((y3.a) obj);
                }
            });
            return bVar;
        }

        public String d(a aVar) throws ManifestException {
            if (aVar.d() == null || aVar.e() == null) {
                throw new BuildException("Attributes must have name and value");
            }
            String strC = aVar.c();
            if (strC.equals(y3.f135977q)) {
                this.f135988a.add("\"Name\" attributes should not occur in the main section and must be the first element in all other sections: \"" + aVar.d() + ": " + aVar.e() + "\"");
                return aVar.e();
            }
            if (strC.startsWith(y3.f135978r)) {
                this.f135988a.add(y3.f135973m + aVar.d() + ": " + aVar.e() + "\"");
                return null;
            }
            if (strC.equals(y3.f135979s)) {
                a aVar2 = this.f135990c.get(strC);
                if (aVar2 == null) {
                    q(aVar);
                    return null;
                }
                this.f135988a.add("Multiple Class-Path attributes are supported but violate the Jar specification and may not be correctly processed in all environments");
                Collections.list(aVar.f()).forEach(new b4(aVar2));
                return null;
            }
            if (!this.f135990c.containsKey(strC)) {
                q(aVar);
                return null;
            }
            throw new ManifestException("The attribute \"" + aVar.d() + "\" may not occur more than once in the same section");
        }

        public void e(a aVar) throws ManifestException {
            if (d(aVar) != null) {
                throw new BuildException("Specify the section name using the \"name\" attribute of the <section> element rather than using a \"Name\" manifest attribute");
            }
        }

        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            return this.f135990c.equals(((b) obj).f135990c);
        }

        public a f(String str) {
            return this.f135990c.get(str.toLowerCase(Locale.ENGLISH));
        }

        public Enumeration<String> g() {
            return Collections.enumeration(this.f135990c.keySet());
        }

        public String h(String str) {
            a aVarF = f(str.toLowerCase(Locale.ENGLISH));
            if (aVarF == null) {
                return null;
            }
            return aVarF.e();
        }

        public int hashCode() {
            return this.f135990c.hashCode();
        }

        public String i() {
            return this.f135989b;
        }

        public Enumeration<String> j() {
            return Collections.enumeration(this.f135988a);
        }

        public void l(b bVar) throws ManifestException {
            m(bVar, false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            if (r0.toLowerCase(r1).equals(r6.i().toLowerCase(r1)) != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m(org.apache.tools.ant.taskdefs.y3.b r6, boolean r7) throws org.apache.tools.ant.taskdefs.ManifestException {
            /*
                r5 = this;
                java.lang.String r0 = r5.f135989b
                if (r0 != 0) goto La
                java.lang.String r0 = r6.i()
                if (r0 != 0) goto L2b
            La:
                java.lang.String r0 = r5.f135989b
                if (r0 == 0) goto L33
                java.lang.String r0 = r6.i()
                if (r0 == 0) goto L33
                java.lang.String r0 = r5.f135989b
                java.util.Locale r1 = java.util.Locale.ENGLISH
                java.lang.String r0 = r0.toLowerCase(r1)
                java.lang.String r2 = r6.i()
                java.lang.String r1 = r2.toLowerCase(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L2b
                goto L33
            L2b:
                org.apache.tools.ant.taskdefs.ManifestException r6 = new org.apache.tools.ant.taskdefs.ManifestException
                java.lang.String r7 = "Unable to merge sections with different names"
                r6.<init>(r7)
                throw r6
            L33:
                r0 = 0
                java.util.Enumeration r1 = r6.g()
                java.util.ArrayList r1 = java.util.Collections.list(r1)
                java.util.Iterator r1 = r1.iterator()
            L40:
                boolean r2 = r1.hasNext()
                java.lang.String r3 = "Class-Path"
                if (r2 == 0) goto L77
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                org.apache.tools.ant.taskdefs.y3$a r4 = r6.f(r2)
                boolean r2 = r3.equalsIgnoreCase(r2)
                if (r2 == 0) goto L73
                if (r0 != 0) goto L62
                org.apache.tools.ant.taskdefs.y3$a r0 = new org.apache.tools.ant.taskdefs.y3$a
                r0.<init>()
                r0.h(r3)
            L62:
                java.util.Enumeration r2 = r4.f()
                java.util.ArrayList r2 = java.util.Collections.list(r2)
                org.apache.tools.ant.taskdefs.b4 r3 = new org.apache.tools.ant.taskdefs.b4
                r3.<init>(r0)
                org.apache.tools.ant.taskdefs.c2.a(r2, r3)
                goto L40
            L73:
                r5.q(r4)
                goto L40
            L77:
                if (r0 == 0) goto L94
                if (r7 == 0) goto L91
                org.apache.tools.ant.taskdefs.y3$a r7 = r5.f(r3)
                if (r7 == 0) goto L91
                java.util.Enumeration r7 = r7.f()
                java.util.ArrayList r7 = java.util.Collections.list(r7)
                org.apache.tools.ant.taskdefs.b4 r1 = new org.apache.tools.ant.taskdefs.b4
                r1.<init>(r0)
                org.apache.tools.ant.taskdefs.c2.a(r7, r1)
            L91:
                r5.q(r0)
            L94:
                java.util.List<java.lang.String> r7 = r5.f135988a
                java.util.List<java.lang.String> r6 = r6.f135988a
                r7.addAll(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.tools.ant.taskdefs.y3.b.m(org.apache.tools.ant.taskdefs.y3$b, boolean):void");
        }

        public String n(BufferedReader bufferedReader) throws IOException, ManifestException {
            a aVarF = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null || line.isEmpty()) {
                    break;
                }
                if (line.charAt(0) != ' ') {
                    a aVar = new a(line);
                    String strD = d(aVar);
                    aVarF = f(aVar.c());
                    if (strD != null) {
                        return strD;
                    }
                } else if (aVarF != null) {
                    aVarF.a(line);
                } else {
                    if (this.f135989b == null) {
                        throw new ManifestException("Can't start an attribute with a continuation line " + line);
                    }
                    this.f135989b += line.substring(1);
                }
            }
            return null;
        }

        public void o(String str) {
            this.f135990c.remove(str.toLowerCase(Locale.ENGLISH));
        }

        public void p(String str) {
            this.f135989b = str;
        }

        public void r(PrintWriter printWriter) throws IOException {
            s(printWriter, false);
        }

        public void s(PrintWriter printWriter, boolean z10) throws IOException {
            String str = this.f135989b;
            if (str != null) {
                new a(y3.f135966f, str).j(printWriter);
            }
            Iterator it = Collections.list(g()).iterator();
            while (it.hasNext()) {
                f((String) it.next()).k(printWriter, z10);
            }
            printWriter.print("\r\n");
        }
    }

    static {
        Charset charset = StandardCharsets.UTF_8;
        f135974n = charset;
        f135975o = charset.name();
        Locale locale = Locale.ENGLISH;
        f135976p = f135964d.toLowerCase(locale);
        f135977q = f135966f.toLowerCase(locale);
        f135978r = "From".toLowerCase(locale);
        f135979s = f135968h.toLowerCase(locale);
    }

    public y3() {
        this.f135980a = "1.0";
        this.f135980a = null;
    }

    public y3(Reader reader) throws IOException, ManifestException {
        this.f135980a = "1.0";
        BufferedReader bufferedReader = new BufferedReader(reader);
        String strN = this.f135981b.n(bufferedReader);
        String strH = this.f135981b.h(f135964d);
        if (strH != null) {
            this.f135980a = strH;
            this.f135981b.o(f135964d);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            if (!line.isEmpty()) {
                b bVar = new b();
                if (strN == null) {
                    a aVar = new a(line);
                    if (!f135966f.equalsIgnoreCase(aVar.d())) {
                        throw new ManifestException("Manifest sections should start with a \"Name\" attribute and not \"" + aVar.d() + "\"");
                    }
                    strN = aVar.e();
                } else {
                    bVar.d(new a(line));
                }
                bVar.p(strN);
                strN = bVar.n(bufferedReader);
                f(bVar);
            }
        }
    }

    public static y3 g() throws BuildException {
        try {
            InputStream resourceAsStream = y3.class.getResourceAsStream("/org/apache/tools/ant/defaultManifest.mf");
            try {
                if (resourceAsStream == null) {
                    throw new BuildException("Could not find default manifest: %s", "/org/apache/tools/ant/defaultManifest.mf");
                }
                y3 y3Var = new y3(new InputStreamReader(resourceAsStream, f135974n));
                String property = System.getProperty("java.runtime.version");
                if (property == null) {
                    property = System.getProperty("java.vm.version");
                }
                y3Var.h().q(new a("Created-By", property + " (" + System.getProperty("java.vm.vendor") + ")"));
                resourceAsStream.close();
                return y3Var;
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Unable to read default manifest", e10);
        } catch (ManifestException e11) {
            throw new BuildException("Default manifest is invalid !!", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ArrayList m(b bVar) {
        return Collections.list(bVar.j());
    }

    public void e(a aVar) throws ManifestException {
        if (aVar.c() == null || aVar.e() == null) {
            throw new BuildException("Attributes must have name and value");
        }
        if (f135976p.equals(aVar.c())) {
            this.f135980a = aVar.e();
        } else {
            this.f135981b.e(aVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        y3 y3Var = (y3) obj;
        String str = this.f135980a;
        if (str == null) {
            if (y3Var.f135980a != null) {
                return false;
            }
        } else if (!str.equals(y3Var.f135980a)) {
            return false;
        }
        return this.f135981b.equals(y3Var.f135981b) && this.f135982c.equals(y3Var.f135982c);
    }

    public void f(b bVar) throws ManifestException {
        String strI = bVar.i();
        if (strI == null) {
            throw new BuildException("Sections must have a name");
        }
        this.f135982c.put(strI, bVar);
    }

    public b h() {
        return this.f135981b;
    }

    public int hashCode() {
        String str = this.f135980a;
        return (str != null ? 0 + str.hashCode() : 0) + this.f135981b.hashCode() + this.f135982c.hashCode();
    }

    public String i() {
        return this.f135980a;
    }

    public b j(String str) {
        return this.f135982c.get(str);
    }

    public Enumeration<String> k() {
        return Collections.enumeration(this.f135982c.keySet());
    }

    public Enumeration<String> l() {
        final ArrayList list = Collections.list(this.f135981b.j());
        Stream map = this.f135982c.values().stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.w3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return y3.m((y3.b) obj);
            }
        });
        Objects.requireNonNull(list);
        map.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.x3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                list.addAll((ArrayList) obj);
            }
        });
        return Collections.enumeration(list);
    }

    public void n(y3 y3Var) throws ManifestException {
        o(y3Var, false);
    }

    public void o(y3 y3Var, boolean z10) throws ManifestException {
        p(y3Var, z10, false);
    }

    public void p(y3 y3Var, boolean z10, boolean z11) throws ManifestException {
        if (y3Var != null) {
            if (z10) {
                this.f135981b = (b) y3Var.f135981b.clone();
            } else {
                this.f135981b.m(y3Var.f135981b, z11);
            }
            String str = y3Var.f135980a;
            if (str != null) {
                this.f135980a = str;
            }
            for (String str2 : Collections.list(y3Var.k())) {
                b bVar = this.f135982c.get(str2);
                b bVar2 = y3Var.f135982c.get(str2);
                if (bVar != null) {
                    bVar.m(bVar2, z11);
                } else if (bVar2 != null) {
                    f((b) bVar2.clone());
                }
            }
        }
    }

    public void q(PrintWriter printWriter) throws IOException {
        r(printWriter, false);
    }

    public void r(PrintWriter printWriter, boolean z10) throws IOException {
        printWriter.print("Manifest-Version: " + this.f135980a + "\r\n");
        String strH = this.f135981b.h(f135965e);
        if (strH != null) {
            printWriter.print("Signature-Version: " + strH + "\r\n");
            this.f135981b.o(f135965e);
        }
        this.f135981b.s(printWriter, z10);
        if (strH != null) {
            try {
                this.f135981b.e(new a(f135965e, strH));
            } catch (ManifestException unused) {
            }
        }
        Iterator<String> it = this.f135982c.keySet().iterator();
        while (it.hasNext()) {
            j(it.next()).s(printWriter, z10);
        }
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            q(new PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }
}
