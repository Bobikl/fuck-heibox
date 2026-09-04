package org.apache.tools.ant.taskdefs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Replace.java */
/* JADX INFO: loaded from: classes5.dex */
public class q5 extends h4 {
    private static final org.apache.tools.ant.util.j0 A = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f135606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f135607u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.w1 f135610x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135598l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f135599m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f135600n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f135601o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f135602p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Properties f135603q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<d> f135604r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private File f135605s = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f135608v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f135609w = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f135611y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f135612z = false;

    /* JADX INFO: compiled from: Replace.java */
    public class a implements AutoCloseable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f135613g = 4096;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InputStream f135615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Reader f135616d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private StringBuffer f135614b = new StringBuffer();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char[] f135617e = new char[4096];

        a(File file) throws IOException {
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            this.f135615c = inputStreamNewInputStream;
            try {
                this.f135616d = new BufferedReader(q5.this.f135609w != null ? new InputStreamReader(inputStreamNewInputStream, q5.this.f135609w) : new InputStreamReader(inputStreamNewInputStream));
            } catch (Throwable th2) {
                if (this.f135616d == null) {
                    this.f135615c.close();
                }
                throw th2;
            }
        }

        StringBuffer a() {
            return this.f135614b;
        }

        boolean b() throws IOException {
            int i10 = this.f135616d.read(this.f135617e);
            if (i10 < 0) {
                return false;
            }
            this.f135614b.append(new String(this.f135617e, 0, i10));
            return true;
        }

        @Override // java.lang.AutoCloseable
        public void close() throws IOException {
            this.f135615c.close();
        }
    }

    /* JADX INFO: compiled from: Replace.java */
    public class b implements AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private StringBuffer f135619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final OutputStream f135620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Writer f135621d;

        b(File file) throws IOException {
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(file.toPath(), new OpenOption[0]);
            this.f135620c = outputStreamNewOutputStream;
            try {
                this.f135621d = new BufferedWriter(q5.this.f135609w != null ? new OutputStreamWriter(outputStreamNewOutputStream, q5.this.f135609w) : new OutputStreamWriter(outputStreamNewOutputStream));
            } catch (Throwable th2) {
                if (this.f135621d == null) {
                    this.f135620c.close();
                }
                throw th2;
            }
        }

        boolean a() throws IOException {
            this.f135621d.write(this.f135619b.toString());
            StringBuffer stringBuffer = this.f135619b;
            stringBuffer.delete(0, stringBuffer.length());
            return false;
        }

        void b(StringBuffer stringBuffer) {
            this.f135619b = stringBuffer;
        }

        @Override // java.lang.AutoCloseable
        public void close() throws IOException {
            this.f135620c.close();
        }

        void flush() throws IOException {
            a();
            this.f135621d.flush();
        }
    }

    /* JADX INFO: compiled from: Replace.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f135623a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private StringBuffer f135624b = new StringBuffer();

        public c() {
        }

        public void a(String str) {
            this.f135624b.append(str);
        }

        public String b() {
            String string = this.f135624b.toString();
            return this.f135623a ? q5.this.b().V0(string) : string;
        }

        public void c(boolean z10) {
            this.f135623a = z10;
        }
    }

    /* JADX INFO: compiled from: Replace.java */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f135626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f135627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f135628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f135629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private StringBuffer f135630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private StringBuffer f135631f = new StringBuffer();

        public d() {
        }

        private int j() {
            String strG = g();
            int iIndexOf = this.f135630e.indexOf(strG);
            int length = strG.length();
            int length2 = this.f135628c.length();
            int i10 = -1;
            while (iIndexOf >= 0) {
                this.f135630e.replace(iIndexOf, iIndexOf + length, this.f135628c);
                i10 = iIndexOf + length2;
                iIndexOf = this.f135630e.indexOf(strG, i10);
                q5.D2(q5.this);
            }
            return i10;
        }

        public c a() {
            if (this.f135626a == null) {
                this.f135626a = q5.this.new c();
            }
            return this.f135626a;
        }

        public c b() {
            if (this.f135627b == null) {
                this.f135627b = q5.this.new c();
            }
            return this.f135627b;
        }

        void c() {
            j();
            this.f135631f.append(this.f135630e);
            StringBuffer stringBuffer = this.f135630e;
            stringBuffer.delete(0, stringBuffer.length());
        }

        StringBuffer d() {
            return this.f135631f;
        }

        public String e() {
            return this.f135629d;
        }

        public String f() {
            if (this.f135629d != null) {
                return q5.this.f135603q.getProperty(this.f135629d);
            }
            c cVar = this.f135627b;
            if (cVar != null) {
                return cVar.b();
            }
            return q5.this.f135600n != null ? q5.this.f135600n.b() : "";
        }

        public String g() {
            return this.f135626a.b();
        }

        public String h() {
            return this.f135627b.b();
        }

        boolean i() {
            String strG = g();
            if (this.f135630e.length() <= strG.length()) {
                return false;
            }
            int iMax = Math.max(this.f135630e.length() - strG.length(), j());
            this.f135631f.append(this.f135630e.substring(0, iMax));
            this.f135630e.delete(0, iMax);
            return true;
        }

        void k(StringBuffer stringBuffer) {
            this.f135630e = stringBuffer;
        }

        public void l(String str) {
            this.f135629d = str;
        }

        public void m(String str) {
            a().a(str);
        }

        public void n(String str) {
            b().a(str);
        }

        public void o() throws BuildException {
            c cVar = this.f135626a;
            if (cVar == null) {
                throw new BuildException("token is a mandatory for replacefilter.");
            }
            if (cVar.b().isEmpty()) {
                throw new BuildException("The token must not be an empty string.");
            }
            if (this.f135627b != null && this.f135629d != null) {
                throw new BuildException("Either value or property can be specified, but a replacefilter element cannot have both.");
            }
            if (this.f135629d != null) {
                if (q5.this.f135601o == null) {
                    throw new BuildException("The replacefilter's property attribute can only be used with the replacetask's propertyFile/Resource attribute.");
                }
                if (q5.this.f135603q == null || q5.this.f135603q.getProperty(this.f135629d) == null) {
                    throw new BuildException("property \"%s\" was not found in %s", this.f135629d, q5.this.f135601o.k2());
                }
            }
            this.f135628c = f();
        }
    }

    static /* synthetic */ int D2(q5 q5Var) {
        int i10 = q5Var.f135607u + 1;
        q5Var.f135607u = i10;
        return i10;
    }

    private StringBuffer G2(StringBuffer stringBuffer) {
        for (d dVar : this.f135604r) {
            dVar.k(stringBuffer);
            stringBuffer = dVar.d();
        }
        return stringBuffer;
    }

    private d H2() {
        d dVar = new d();
        this.f135604r.add(0, dVar);
        return dVar;
    }

    private void L2() {
        this.f135604r.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.k5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((q5.d) obj).c();
            }
        });
    }

    private Iterator<String> M2(Properties properties) {
        ArrayList arrayList = new ArrayList(properties.stringPropertyNames());
        arrayList.sort(Comparator.comparingInt(new ToIntFunction() { // from class: org.apache.tools.ant.taskdefs.l5
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((String) obj).length();
            }
        }).reversed());
        return arrayList.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P2(Properties properties, String str) {
        d dVarK2 = K2();
        dVarK2.m(str);
        dVarK2.n(properties.getProperty(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q2(String str, d dVar) {
        x1("Replacing in " + str + ": " + dVar.g() + " --> " + dVar.f(), 3);
    }

    private void R2(final String str) {
        this.f135604r.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.n5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f134612b.Q2(str, (q5.d) obj);
            }
        });
    }

    private void S2(File file) throws BuildException {
        if (!file.exists()) {
            throw new BuildException("Replace: source file " + file.getPath() + " doesn't exist", w1());
        }
        int i10 = this.f135607u;
        R2(file.getPath());
        try {
            File fileG = A.G(b(), "rep", ".tmp", file.getParentFile(), false, true);
            try {
                a aVar = new a(file);
                try {
                    b bVar = new b(fileG);
                    try {
                        bVar.b(G2(aVar.a()));
                        while (aVar.b()) {
                            if (T2()) {
                                bVar.a();
                            }
                        }
                        L2();
                        bVar.flush();
                        bVar.close();
                        aVar.close();
                        if (this.f135607u != i10) {
                            this.f135606t++;
                            long jLastModified = file.lastModified();
                            org.apache.tools.ant.util.j0 j0Var = A;
                            j0Var.m0(fileG, file);
                            if (this.f135611y) {
                                j0Var.p0(file, jLastModified);
                            }
                        }
                        if (!fileG.isFile() || fileG.delete()) {
                            return;
                        }
                        fileG.deleteOnExit();
                    } catch (Throwable th2) {
                        try {
                            bVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        aVar.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                if (fileG.isFile() && !fileG.delete()) {
                    fileG.deleteOnExit();
                }
                throw th6;
            }
        } catch (IOException e10) {
            throw new BuildException("IOException in " + file + " - " + e10.getClass().getName() + ":" + e10.getMessage(), e10, w1());
        }
    }

    private boolean T2() {
        return this.f135604r.stream().allMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.m5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((q5.d) obj).i();
            }
        });
    }

    private void g3(StringBuilder sb2, String str, String str2) {
        int iIndexOf = sb2.indexOf(str);
        int length = str.length();
        int length2 = str2.length();
        while (iIndexOf >= 0) {
            sb2.replace(iIndexOf, iIndexOf + length, str2);
            iIndexOf = sb2.indexOf(str, iIndexOf + length2);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        ArrayList arrayList = new ArrayList(this.f135604r);
        Properties properties = this.f135603q;
        Properties properties2 = properties == null ? null : (Properties) properties.clone();
        if (this.f135599m != null) {
            StringBuilder sb2 = new StringBuilder(this.f135600n.b());
            g3(sb2, "\r\n", "\n");
            g3(sb2, "\n", System.lineSeparator());
            StringBuilder sb3 = new StringBuilder(this.f135599m.b());
            g3(sb3, "\r\n", "\n");
            g3(sb3, "\n", System.lineSeparator());
            d dVarH2 = H2();
            dVarH2.m(sb3.toString());
            dVarH2.n(sb2.toString());
        }
        try {
            org.apache.tools.ant.types.s1 s1Var = this.f135602p;
            if (s1Var != null) {
                final Properties propertiesO2 = O2(s1Var);
                org.apache.tools.ant.util.h2.b(M2(propertiesO2)).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.p5
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f135537b.P2(propertiesO2, (String) obj);
                    }
                });
            }
            h3();
            org.apache.tools.ant.types.s1 s1Var2 = this.f135601o;
            if (s1Var2 != null) {
                this.f135603q = O2(s1Var2);
            }
            i3();
            this.f135606t = 0;
            this.f135607u = 0;
            File file = this.f135598l;
            if (file != null) {
                S2(file);
            }
            File file2 = this.f135605s;
            if (file2 != null) {
                for (String str : super.p2(file2).m()) {
                    S2(new File(this.f135605s, str));
                }
            }
            org.apache.tools.ant.types.resources.w1 w1Var = this.f135610x;
            if (w1Var != null) {
                Iterator<org.apache.tools.ant.types.s1> it = w1Var.iterator();
                while (it.hasNext()) {
                    S2(((org.apache.tools.ant.types.resources.y) it.next().e2(org.apache.tools.ant.types.resources.y.class)).l0());
                }
            }
            if (this.f135608v) {
                x1("Replaced " + this.f135607u + " occurrences in " + this.f135606t + " files.", 2);
            }
            if (this.f135612z && this.f135607u == 0) {
                throw new BuildException("didn't replace anything");
            }
            this.f135604r = arrayList;
            this.f135603q = properties2;
        } catch (Throwable th2) {
            this.f135604r = arrayList;
            this.f135603q = properties2;
            throw th2;
        }
    }

    public void F2(org.apache.tools.ant.types.u1 u1Var) {
        if (!u1Var.O()) {
            throw new BuildException("only filesystem resources are supported");
        }
        if (this.f135610x == null) {
            this.f135610x = new org.apache.tools.ant.types.resources.w1();
        }
        this.f135610x.f2(u1Var);
    }

    public c I2() {
        if (this.f135599m == null) {
            this.f135599m = new c();
        }
        return this.f135599m;
    }

    public c J2() {
        return this.f135600n;
    }

    public d K2() {
        d dVar = new d();
        this.f135604r.add(dVar);
        return dVar;
    }

    public Properties N2(File file) throws BuildException {
        return O2(new org.apache.tools.ant.types.resources.z(b(), file));
    }

    public Properties O2(org.apache.tools.ant.types.s1 s1Var) throws BuildException {
        Properties properties = new Properties();
        try {
            InputStream inputStreamH2 = s1Var.h2();
            try {
                properties.load(inputStreamH2);
                if (inputStreamH2 != null) {
                    inputStreamH2.close();
                }
                return properties;
            } catch (Throwable th2) {
                if (inputStreamH2 != null) {
                    try {
                        inputStreamH2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException unused) {
            throw new BuildException("Property resource (%s) cannot be loaded.", s1Var.k2());
        }
    }

    public void U2(File file) {
        this.f135605s = file;
    }

    public void V2(String str) {
        this.f135609w = str;
    }

    public void W2(boolean z10) {
        this.f135612z = z10;
    }

    public void X2(File file) {
        this.f135598l = file;
    }

    public void Y2(boolean z10) {
        this.f135611y = z10;
    }

    public void Z2(File file) {
        a3(new org.apache.tools.ant.types.resources.z(file));
    }

    public void a3(org.apache.tools.ant.types.s1 s1Var) {
        this.f135601o = s1Var;
    }

    public void b3(File file) {
        c3(new org.apache.tools.ant.types.resources.z(b(), file));
    }

    public void c3(org.apache.tools.ant.types.s1 s1Var) {
        this.f135602p = s1Var;
    }

    public void d3(boolean z10) {
        this.f135608v = z10;
    }

    public void e3(String str) {
        I2().a(str);
    }

    public void f3(String str) {
        J2().a(str);
    }

    public void h3() throws BuildException {
        if (this.f135598l == null && this.f135605s == null && this.f135610x == null) {
            throw new BuildException("Either the file or the dir attribute or nested resources must be specified", w1());
        }
        org.apache.tools.ant.types.s1 s1Var = this.f135601o;
        if (s1Var != null && !s1Var.p2()) {
            throw new BuildException("Property file " + this.f135601o.k2() + org.apache.tools.ant.v0.I, w1());
        }
        if (this.f135599m == null && this.f135604r.isEmpty()) {
            throw new BuildException("Either token or a nested replacefilter must be specified", w1());
        }
        c cVar = this.f135599m;
        if (cVar != null && cVar.b().isEmpty()) {
            throw new BuildException("The token attribute must not be an empty string.", w1());
        }
    }

    public void i3() throws BuildException {
        this.f135604r.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.o5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((q5.d) obj).o();
            }
        });
    }
}
