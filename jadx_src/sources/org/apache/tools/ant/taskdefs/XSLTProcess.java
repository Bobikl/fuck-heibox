package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathVariableResolver;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.CommandlineJava;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: loaded from: classes5.dex */
public class XSLTProcess extends h4 implements w7 {
    public static final String R = "trax";
    private static final org.apache.tools.ant.util.j0 S = org.apache.tools.ant.util.j0.O();
    private XPathFactory N;
    private XPath O;
    private f Q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f133647v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private v7 f133649x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f133637l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f133638m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f133639n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f133640o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f133641p = ".html";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f133642q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f133643r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<d> f133644s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private File f133645t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private File f133646u = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f133648w = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f133650y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f133651z = false;
    private final List<c> A = new Vector();
    private final org.apache.tools.ant.types.c2 B = new org.apache.tools.ant.types.c2();
    private boolean C = true;
    private b D = null;
    private boolean E = true;
    private org.apache.tools.ant.g F = null;
    private org.apache.tools.ant.types.k0 G = null;
    private final org.apache.tools.ant.types.resources.w1 H = new org.apache.tools.ant.types.resources.w1();
    private boolean I = true;
    private boolean J = false;
    private boolean K = true;
    private boolean L = true;
    private boolean M = true;
    private final CommandlineJava.b P = new CommandlineJava.b();

    public enum ParamType {
        STRING,
        BOOLEAN,
        INT,
        LONG,
        DOUBLE,
        XPATH_STRING,
        XPATH_BOOLEAN,
        XPATH_NUMBER,
        XPATH_NODE,
        XPATH_NODESET;

        public static final Map<ParamType, QName> XPATH_TYPES;

        static {
            ParamType paramType = XPATH_STRING;
            ParamType paramType2 = XPATH_BOOLEAN;
            ParamType paramType3 = XPATH_NUMBER;
            ParamType paramType4 = XPATH_NODE;
            ParamType paramType5 = XPATH_NODESET;
            EnumMap enumMap = new EnumMap(ParamType.class);
            enumMap.put(paramType, XPathConstants.STRING);
            enumMap.put(paramType2, XPathConstants.BOOLEAN);
            enumMap.put(paramType3, XPathConstants.NUMBER);
            enumMap.put(paramType4, XPathConstants.NODE);
            enumMap.put(paramType5, XPathConstants.NODESET);
            XPATH_TYPES = Collections.unmodifiableMap(enumMap);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133652a;

        static {
            int[] iArr = new int[ParamType.values().length];
            f133652a = iArr;
            try {
                iArr[ParamType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133652a[ParamType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133652a[ParamType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f133652a[ParamType.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f133652a[ParamType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<a> f133654b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<C1230b> f133655c = new ArrayList();

        public static class a extends org.apache.tools.ant.b2 implements org.apache.tools.ant.y0 {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f133656e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Object f133657f;

            public String B1() {
                return this.f133656e;
            }

            public Object D1() {
                return this.f133657f;
            }

            @Override // org.apache.tools.ant.a1
            public Object J0(String str) throws BuildException {
                return null;
            }

            @Override // org.apache.tools.ant.w0
            public void r0(String str, String str2) throws BuildException {
                if ("name".equalsIgnoreCase(str)) {
                    this.f133656e = str2;
                    return;
                }
                if (!"value".equalsIgnoreCase(str)) {
                    if ("valueref".equalsIgnoreCase(str)) {
                        this.f133657f = b().w0(str2);
                        return;
                    } else {
                        if (!"classloaderforpath".equalsIgnoreCase(str)) {
                            throw new BuildException("Unsupported attribute: %s", str);
                        }
                        this.f133657f = org.apache.tools.ant.util.i.e(b(), new org.apache.tools.ant.types.q1(b(), str2));
                        return;
                    }
                }
                if ("true".equalsIgnoreCase(str2)) {
                    this.f133657f = Boolean.TRUE;
                } else {
                    if ("false".equalsIgnoreCase(str2)) {
                        this.f133657f = Boolean.FALSE;
                        return;
                    }
                    try {
                        this.f133657f = Integer.valueOf(str2);
                    } catch (NumberFormatException unused) {
                        this.f133657f = str2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: org.apache.tools.ant.taskdefs.XSLTProcess$b$b, reason: collision with other inner class name */
        public static class C1230b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f133658a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f133659b;

            public C1230b() {
            }

            public C1230b(String str, boolean z10) {
                this.f133658a = str;
                this.f133659b = z10;
            }

            public String a() {
                return this.f133658a;
            }

            public boolean b() {
                return this.f133659b;
            }

            public void c(String str) {
                this.f133658a = str;
            }

            public void d(boolean z10) {
                this.f133659b = z10;
            }
        }

        public void a(a aVar) {
            this.f133654b.add(aVar);
        }

        public void b(C1230b c1230b) {
            this.f133655c.add(c1230b);
        }

        public Enumeration<a> c() {
            return Collections.enumeration(this.f133654b);
        }

        public Iterable<C1230b> d() {
            return this.f133655c;
        }

        public String e() {
            return this.f133653a;
        }

        public void f(String str) {
            this.f133653a = str;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f133661b;

        public String a() {
            return this.f133660a;
        }

        public String b() {
            return this.f133661b;
        }

        public void c(String str) {
            this.f133660a = str;
        }

        public void d(String str) {
            this.f133661b = str;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133662a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f133663b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f133664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f133665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f133666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Project f133667f;

        public String a() throws BuildException {
            String str = this.f133663b;
            if (str != null) {
                return str;
            }
            throw new BuildException("Expression attribute is missing.");
        }

        public String b() throws BuildException {
            String str = this.f133662a;
            if (str != null) {
                return str;
            }
            throw new BuildException("Name attribute is missing.");
        }

        public String c() {
            return this.f133664c;
        }

        public void d(String str) {
            this.f133663b = str;
        }

        public void e(Object obj) {
            this.f133665d = obj;
        }

        public void f(String str) {
            e(str);
        }

        public void g(String str) {
            this.f133662a = str;
        }

        public void h(Project project) {
            this.f133667f = project;
        }

        public void i(String str) {
            this.f133664c = str;
        }

        public void j(Object obj) {
            this.f133666e = obj;
        }

        public void k(String str) {
            j(str);
        }

        public boolean l() {
            org.apache.tools.ant.p2 p2VarU = org.apache.tools.ant.p2.u(this.f133667f);
            return p2VarU.W(this.f133665d) && p2VarU.X(this.f133666e);
        }
    }

    public class e implements org.apache.tools.ant.util.g0 {
        private e() {
        }

        /* synthetic */ e(XSLTProcess xSLTProcess, a aVar) {
            this();
        }

        @Override // org.apache.tools.ant.util.g0
        public void n0(String str) {
        }

        @Override // org.apache.tools.ant.util.g0
        public void q0(String str) {
        }

        @Override // org.apache.tools.ant.util.g0
        public String[] y0(String str) {
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf > 0) {
                str = str.substring(0, iLastIndexOf);
            }
            return new String[]{str + XSLTProcess.this.f133641p};
        }
    }

    public final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f133669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f133670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f133671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f133672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f133673e;

        public f() {
        }

        public boolean a() {
            return this.f133669a;
        }

        public boolean b() {
            return this.f133670b;
        }

        public boolean c() {
            return this.f133671c;
        }

        public OutputStream d() {
            return new r3(XSLTProcess.this);
        }

        public boolean e() {
            return this.f133672d;
        }

        public boolean f() {
            return this.f133673e;
        }

        public void g(boolean z10) {
            this.f133669a = z10;
        }

        public void h(boolean z10) {
            this.f133670b = z10;
        }

        public void i(boolean z10) {
            this.f133671c = z10;
        }

        public void j(boolean z10) {
            this.f133672d = z10;
        }

        public void k(boolean z10) {
            this.f133673e = z10;
        }
    }

    private void B3() {
        if (this.f133648w == null || this.F != null) {
            return;
        }
        org.apache.tools.ant.g gVarZ = b().z(this.f133648w);
        this.F = gVarZ;
        gVarZ.v0();
    }

    private void H2() {
        if (this.f133637l == null) {
            X2("destdir attributes must be set!");
        }
    }

    private void P2(File file) throws BuildException {
        File parentFile = file.getParentFile();
        if (parentFile.exists() || parentFile.mkdirs() || parentFile.isDirectory()) {
            return;
        }
        X2("Unable to create directory: " + parentFile.getAbsolutePath());
    }

    private Object Q2(d dVar) throws XPathExpressionException {
        ParamType paramTypeValueOf;
        String strC = dVar.c();
        String strA = dVar.a();
        if (strC == null || strC.isEmpty()) {
            paramTypeValueOf = ParamType.STRING;
        } else {
            try {
                paramTypeValueOf = ParamType.valueOf(strC);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid XSLT parameter type: " + strC, e10);
            }
        }
        int i10 = a.f133652a[paramTypeValueOf.ordinal()];
        if (i10 == 1) {
            return strA;
        }
        if (i10 == 2) {
            return Boolean.valueOf(Boolean.parseBoolean(strA));
        }
        if (i10 == 3) {
            return Double.valueOf(Double.parseDouble(strA));
        }
        if (i10 == 4) {
            return Integer.valueOf(Integer.parseInt(strA));
        }
        if (i10 == 5) {
            return Long.valueOf(Long.parseLong(strA));
        }
        QName qName = ParamType.XPATH_TYPES.get(paramTypeValueOf);
        if (qName != null) {
            return this.O.compile(strA).evaluate((Object) null, qName);
        }
        throw new IllegalArgumentException("Invalid XSLT parameter type: " + strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a3(QName qName) {
        return b().u0(qName.toString());
    }

    private Class<?> b3(String str) throws ClassNotFoundException {
        B3();
        org.apache.tools.ant.g gVar = this.F;
        return gVar == null ? Class.forName(str) : Class.forName(str, true, gVar);
    }

    private void c3(File file, File file2, org.apache.tools.ant.types.s1 s1Var) throws BuildException {
        try {
            long jI2 = s1Var.i2();
            x1("In file " + file + " time: " + file.lastModified(), 4);
            x1("Out file " + file2 + " time: " + file2.lastModified(), 4);
            x1("Style file " + this.f133639n + " time: " + jI2, 4);
            if (this.f133651z || file.lastModified() >= file2.lastModified() || jI2 >= file2.lastModified()) {
                P2(file2);
                x1("Processing " + file + " to " + file2, 2);
                J2(s1Var);
                s3(this.f133649x, file);
                this.f133649x.g(file, file2);
            } else {
                x1("Skipping input file " + file + " because it is older than output file " + file2 + " and so is the stylesheet " + s1Var, 4);
            }
        } catch (Exception e10) {
            x1("Failed to process " + file, 2);
            if (file2 != null) {
                file2.delete();
            }
            Z2(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d3(File file, String str, File file2, org.apache.tools.ant.types.s1 s1Var) throws BuildException {
        File file3 = null;
        Object[] objArr = 0;
        try {
            long jI2 = s1Var.i2();
            File file4 = new File(file, str);
            if (file4.isDirectory()) {
                x1("Skipping " + file4 + " it is a directory.", 3);
                return;
            }
            org.apache.tools.ant.types.k0 k0Var = this.G;
            String[] strArrY0 = (k0Var == null ? new e(this, objArr == true ? 1 : 0) : k0Var.i2()).y0(str);
            if (strArrY0 != null && strArrY0.length != 0) {
                if (strArrY0.length > 1) {
                    x1("Skipping " + this.f133645t + " its mapping is ambiguous.", 3);
                    return;
                }
                File file5 = new File(file2, strArrY0[0]);
                try {
                    if (this.f133651z || file4.lastModified() > file5.lastModified() || jI2 > file5.lastModified()) {
                        P2(file5);
                        log("Processing " + file4 + " to " + file5);
                        J2(s1Var);
                        s3(this.f133649x, file4);
                        this.f133649x.g(file4, file5);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e = e10;
                    file3 = file5;
                    x1("Failed to process " + this.f133645t, 2);
                    if (file3 != null) {
                        file3.delete();
                    }
                    Z2(e);
                    return;
                }
            }
            x1("Skipping " + this.f133645t + " it cannot get mapped to output.", 3);
        } catch (Exception e11) {
            e = e11;
        }
    }

    private void e3(org.apache.tools.ant.types.s1 s1Var) {
        org.apache.tools.ant.types.resources.z zVarD;
        for (org.apache.tools.ant.types.s1 s1Var2 : this.H) {
            if (s1Var2.p2()) {
                File fileW2 = this.f133638m;
                String strK2 = s1Var2.k2();
                org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var2.e2(org.apache.tools.ant.types.resources.y.class);
                if (yVar != null && (fileW2 = (zVarD = ResourceUtils.d(yVar)).w2()) == null) {
                    strK2 = zVarD.l0().getAbsolutePath();
                }
                d3(fileW2, strK2, this.f133637l, s1Var);
            }
        }
    }

    private void f3(String str) throws Exception {
        if (R.equals(str)) {
            this.f133649x = new org.apache.tools.ant.taskdefs.optional.g0();
        } else {
            this.f133649x = (v7) b3(str).asSubclass(v7.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
    }

    private void s3(v7 v7Var, File file) throws Exception {
        String str = this.f133642q;
        if (str != null) {
            v7Var.a(str, file.getName());
        }
        if (this.f133643r != null) {
            File file2 = new File(org.apache.tools.ant.util.j0.T(this.f133638m, file));
            v7Var.a(this.f133643r, file2.getParent() != null ? file2.getParent().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX) : ".");
        }
    }

    public void A2(org.apache.tools.ant.types.u1 u1Var) {
        this.H.f2(u1Var);
    }

    public void A3(org.apache.tools.ant.types.s1 s1Var) {
        this.f133640o = s1Var;
    }

    public void B2(org.apache.tools.ant.util.g0 g0Var) throws BuildException {
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        k0Var.e2(g0Var);
        E2(k0Var);
    }

    public void C2(org.apache.tools.ant.types.resources.f1 f1Var) {
        if (f1Var.size() != 1) {
            X2("The style element must be specified with exactly one nested resource.");
        } else {
            A3(f1Var.iterator().next());
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.s1 s1Var;
        File file;
        if ("style".equals(L1())) {
            x1("Warning: the task name <style> is deprecated. Use <xslt> instead.", 1);
        }
        File file2 = this.f133638m;
        org.apache.tools.ant.types.s1 s1Var2 = this.f133640o;
        if (s1Var2 == null && this.f133639n == null) {
            X2("specify the stylesheet either as a filename in style attribute or as a nested resource");
            return;
        }
        if (s1Var2 != null && this.f133639n != null) {
            X2("specify the stylesheet either as a filename in style attribute or as a nested resource but not as both");
            return;
        }
        File file3 = this.f133645t;
        if (file3 != null && !file3.exists()) {
            X2("input file " + this.f133645t + " does not exist");
            return;
        }
        try {
            B3();
            if (this.P.l() > 0) {
                this.P.k();
            }
            if (this.f133638m == null) {
                this.f133638m = b().Z();
            }
            v7 v7VarS2 = S2();
            this.f133649x = v7VarS2;
            if (v7VarS2 instanceof x7) {
                ((x7) v7VarS2).c(this);
            }
            x1("Using " + this.f133649x.getClass().toString(), 3);
            if (this.f133639n != null) {
                File fileW0 = b().W0(this.f133639n);
                if (!fileW0.exists()) {
                    File fileN0 = S.n0(this.f133638m, this.f133639n);
                    if (fileN0.exists()) {
                        log("DEPRECATED - the 'style' attribute should be relative to the project's");
                        log("             basedir, not the tasks's basedir.");
                        fileW0 = fileN0;
                    }
                }
                org.apache.tools.ant.types.resources.z zVar = new org.apache.tools.ant.types.resources.z();
                zVar.J(b());
                zVar.B2(fileW0);
                s1Var = zVar;
            } else {
                s1Var = this.f133640o;
            }
            if (!s1Var.p2()) {
                X2("stylesheet " + s1Var + " doesn't exist.");
                return;
            }
            File file4 = this.f133645t;
            if (file4 != null && (file = this.f133646u) != null) {
                c3(file4, file, s1Var);
                return;
            }
            H2();
            if (this.I) {
                org.apache.tools.ant.v0 v0VarP2 = p2(this.f133638m);
                x1("Transforming into " + this.f133637l, 2);
                String[] strArrM = v0VarP2.m();
                int length = strArrM.length;
                for (int i10 = 0; i10 < length; i10++) {
                    d3(this.f133638m, strArrM[i10], this.f133637l, s1Var);
                }
                if (this.C) {
                    for (String str : v0VarP2.j()) {
                        for (String str2 : new File(this.f133638m, str).list()) {
                            d3(this.f133638m, str + File.separator + str2, this.f133637l, s1Var);
                        }
                    }
                }
            } else if (this.H.isEmpty()) {
                if (this.M) {
                    X2("no resources specified");
                }
                return;
            }
            e3(s1Var);
        } finally {
            org.apache.tools.ant.g gVar = this.F;
            if (gVar != null) {
                gVar.m0();
                this.F.n();
                this.F = null;
            }
            if (this.P.l() > 0) {
                this.P.j();
            }
            this.f133649x = null;
            this.f133650y = false;
            this.f133638m = file2;
        }
    }

    public void D2(org.apache.tools.ant.types.c2 c2Var) {
        this.B.k2(c2Var);
    }

    public void E2(org.apache.tools.ant.types.k0 k0Var) {
        if (this.G != null) {
            X2(t1.f135751x);
        } else {
            this.G = k0Var;
        }
    }

    public void F2(org.apache.tools.ant.types.z.a aVar) {
        this.P.b(aVar);
    }

    public void G2(org.apache.tools.ant.types.j1 j1Var) {
        this.P.h(j1Var);
    }

    @Deprecated
    protected void I2(File file) throws BuildException {
        org.apache.tools.ant.types.resources.z zVar = new org.apache.tools.ant.types.resources.z();
        zVar.J(b());
        zVar.B2(file);
        J2(zVar);
    }

    protected void J2(org.apache.tools.ant.types.s1 s1Var) throws BuildException {
        if (this.f133650y && this.E) {
            return;
        }
        this.f133650y = true;
        try {
            x1("Loading stylesheet " + s1Var, 2);
            v7 v7Var = this.f133649x;
            if (v7Var instanceof s7) {
                ((s7) v7Var).e(this);
            }
            v7 v7Var2 = this.f133649x;
            if (v7Var2 instanceof t7) {
                ((t7) v7Var2).f(s1Var);
            } else {
                org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
                if (yVar == null) {
                    X2(this.f133649x.getClass().toString() + " accepts the stylesheet only as a file");
                    return;
                }
                this.f133649x.b(yVar.l0());
            }
            for (d dVar : this.f133644s) {
                if (dVar.l()) {
                    Object objQ2 = Q2(dVar);
                    v7 v7Var3 = this.f133649x;
                    if (v7Var3 instanceof u7) {
                        ((u7) v7Var3).d(dVar.b(), objQ2);
                    } else if (objQ2 == null || (objQ2 instanceof String)) {
                        v7Var3.a(dVar.b(), (String) objQ2);
                    } else {
                        x1("XSLTLiaison '" + this.f133649x.getClass().getName() + "' supports only String parameters. Converting parameter '" + dVar.b() + "' to its String value '" + objQ2, 1);
                        this.f133649x.a(dVar.b(), String.valueOf(objQ2));
                    }
                }
            }
        } catch (Exception e10) {
            x1("Failed to transform using stylesheet " + s1Var, 2);
            Z2(e10);
        }
    }

    public org.apache.tools.ant.types.o0 K2() {
        if (this.f133648w == null) {
            this.f133648w = new org.apache.tools.ant.types.o0(b());
        }
        return this.f133648w.u2();
    }

    public b L2() throws BuildException {
        if (this.D != null) {
            X2("'factory' element must be unique");
        } else {
            this.D = new b();
        }
        return this.D;
    }

    public c M2() {
        c cVar = new c();
        this.A.add(cVar);
        return cVar;
    }

    public d N2() {
        d dVar = new d();
        this.f133644s.add(dVar);
        return dVar;
    }

    public f O2() {
        if (this.Q != null) {
            throw new BuildException("can't have more than one trace configuration");
        }
        f fVar = new f();
        this.Q = fVar;
        return fVar;
    }

    public b R2() {
        return this.D;
    }

    protected v7 S2() {
        if (this.f133649x == null) {
            String str = this.f133647v;
            if (str != null) {
                try {
                    f3(str);
                } catch (Exception e10) {
                    Y2(e10);
                }
            } else {
                try {
                    f3(R);
                } catch (Throwable th2) {
                    x1(org.apache.tools.ant.util.j2.b(th2), 0);
                    Y2(th2);
                }
            }
        }
        return this.f133649x;
    }

    public Enumeration<c> T2() {
        return Collections.enumeration(this.A);
    }

    public boolean U2() {
        return this.J;
    }

    @Override // org.apache.tools.ant.u2
    public void V1() throws BuildException {
        super.V1();
        this.B.J(b());
        XPathFactory xPathFactoryNewInstance = XPathFactory.newInstance();
        this.N = xPathFactoryNewInstance;
        XPath xPathNewXPath = xPathFactoryNewInstance.newXPath();
        this.O = xPathNewXPath;
        xPathNewXPath.setXPathVariableResolver(new XPathVariableResolver() { // from class: org.apache.tools.ant.taskdefs.y7
            @Override // javax.xml.xpath.XPathVariableResolver
            public final Object resolveVariable(QName qName) {
                return this.f135999a.a3(qName);
            }
        });
    }

    public f V2() {
        return this.Q;
    }

    public org.apache.tools.ant.types.c2 W2() {
        this.B.J(b());
        return this.B;
    }

    protected void X2(String str) {
        if (this.L) {
            throw new BuildException(str, w1());
        }
        x1(str, 1);
    }

    protected void Y2(Throwable th2) {
        if (this.L) {
            throw new BuildException(th2);
        }
        x1("Caught an exception: " + th2, 1);
    }

    protected void Z2(Exception exc) {
        if (this.L && this.K) {
            throw new BuildException(exc);
        }
        x1("Caught an error during transformation: " + exc, 1);
    }

    public void g3(File file) {
        this.f133638m = file;
    }

    public void h3(org.apache.tools.ant.types.o0 o0Var) {
        K2().n2(o0Var);
    }

    public void i3(org.apache.tools.ant.types.q1 q1Var) {
        K2().c2(q1Var);
    }

    public void j3(File file) {
        this.f133637l = file;
    }

    public void k3(String str) {
        this.f133641p = str;
    }

    public void l3(boolean z10) {
        this.L = z10;
    }

    public void m3(boolean z10) {
        this.M = z10;
    }

    public void n3(boolean z10) {
        this.K = z10;
    }

    public void o3(String str) {
        this.f133643r = str;
    }

    public void p3(String str) {
        this.f133642q = str;
    }

    public void q3(boolean z10) {
        this.f133651z = z10;
    }

    public void r3(File file) {
        this.f133645t = file;
    }

    public void t3(File file) {
        this.f133646u = file;
    }

    public void u3(String str) {
        this.f133647v = str;
    }

    public void v3(boolean z10) {
        this.E = !z10;
    }

    public void w3(boolean z10) {
        this.C = z10;
    }

    public void x3(String str) {
        this.f133639n = str;
    }

    public void y3(boolean z10) {
        this.J = z10;
    }

    public void z3(boolean z10) {
        this.I = z10;
    }
}
