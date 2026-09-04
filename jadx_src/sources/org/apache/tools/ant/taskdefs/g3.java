package org.apache.tools.ant.taskdefs;

import com.taobao.accs.common.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.ak;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Javadoc.java */
/* JADX INFO: loaded from: classes5.dex */
public class g3 extends org.apache.tools.ant.u2 {
    private static final String X = "function loadFrames() {";
    private static final int Y = 23;
    private static final org.apache.tools.ant.util.j0 Z = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final String[] f134163a0 = {"overview", Constants.KEY_PACKAGES, "types", "constructors", "methods", "fields"};
    private String O;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final org.apache.tools.ant.types.o f134164k = new org.apache.tools.ant.types.o();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f134165l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f134166m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134167n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f134168o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<k> f134169p = new Vector();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<i> f134170q = new Vector();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<i> f134171r = new Vector(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<i> f134172s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f134173t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f134174u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b f134175v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134176w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134177x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134178y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134179z = null;
    private String A = null;
    private String B = null;
    private final List<h> C = new Vector();
    private final List<e> D = new Vector();
    private final List<Object> E = new Vector();
    private boolean F = true;
    private f G = null;
    private f H = null;
    private f I = null;
    private f J = null;
    private boolean K = false;
    private String L = null;
    private boolean M = false;
    private boolean N = false;
    private boolean P = false;
    private String Q = null;
    private boolean R = false;
    private String S = null;
    private String T = null;
    private boolean U = true;
    private final j V = new j();
    private final List<org.apache.tools.ant.types.v> W = new Vector();

    /* JADX INFO: compiled from: Javadoc.java */
    public static class a extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"protected", "public", "package", "private"};
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public class b extends d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<c> f134180g = new Vector();

        public b() {
        }

        public c L1() {
            c cVar = g3.this.new c();
            this.f134180g.add(cVar);
            return cVar;
        }

        public Enumeration<c> N1() {
            return Collections.enumeration(this.f134180g);
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f134183b;

        public c() {
        }

        public String a() {
            return this.f134182a;
        }

        public String b() {
            return this.f134183b;
        }

        public void c(String str) {
            this.f134182a = str;
        }

        public void d(String str) {
            this.f134183b = str;
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public static class d extends org.apache.tools.ant.b2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f134185e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private org.apache.tools.ant.types.o0 f134186f;

        public org.apache.tools.ant.types.o0 B1() {
            if (this.f134186f == null) {
                this.f134186f = new org.apache.tools.ant.types.o0(b());
            }
            return this.f134186f.u2();
        }

        public String D1() {
            return this.f134185e;
        }

        public org.apache.tools.ant.types.o0 G1() {
            return this.f134186f;
        }

        public void H1(String str) {
            this.f134185e = str;
        }

        public void I1(org.apache.tools.ant.types.o0 o0Var) {
            org.apache.tools.ant.types.o0 o0Var2 = this.f134186f;
            if (o0Var2 == null) {
                this.f134186f = o0Var;
            } else {
                o0Var2.n2(o0Var);
            }
        }

        public void K1(org.apache.tools.ant.types.q1 q1Var) {
            B1().c2(q1Var);
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f134187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<i> f134188b = new Vector();

        public e() {
        }

        public void a(i iVar) {
            this.f134188b.add(iVar);
        }

        public void b(f fVar) {
            this.f134187a = fVar;
        }

        public String c() {
            return (String) this.f134188b.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.h3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((g3.i) obj).toString();
                }
            }).collect(Collectors.joining(":"));
        }

        public String d() {
            f fVar = this.f134187a;
            if (fVar != null) {
                return fVar.b();
            }
            return null;
        }

        public void e(String str) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                i iVar = new i();
                iVar.b(strNextToken);
                a(iVar);
            }
        }

        public void f(String str) {
            f fVar = new f();
            fVar.a(str);
            b(fVar);
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final StringBuffer f134190a = new StringBuffer();

        public void a(String str) {
            this.f134190a.append(str);
        }

        public String b() {
            return this.f134190a.substring(0);
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public class g extends r3 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f134191i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f134192j;

        g(int i10) {
            super((org.apache.tools.ant.u2) g3.this, i10);
            this.f134191i = null;
            this.f134192j = false;
        }

        @Override // org.apache.tools.ant.taskdefs.r3
        protected void e(String str, int i10) {
            if (str.contains("warning")) {
                this.f134192j = true;
            }
            if (i10 == 2 && str.startsWith("Generating ")) {
                String str2 = this.f134191i;
                if (str2 != null) {
                    super.e(str2, 3);
                }
                this.f134191i = str;
                return;
            }
            if (this.f134191i != null) {
                if (str.startsWith("Building ")) {
                    super.e(this.f134191i, 3);
                } else {
                    super.e(this.f134191i, 2);
                }
                this.f134191i = null;
            }
            super.e(str, i10);
        }

        protected void f() {
            String str = this.f134191i;
            if (str != null) {
                super.e(str, 3);
                this.f134191i = null;
            }
        }

        public boolean g() {
            return this.f134192j;
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134194a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f134196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private URL f134197d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f134195b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f134198e = false;

        public h() {
        }

        public String a() {
            return this.f134194a;
        }

        public File b() {
            return this.f134196c;
        }

        public URL c() {
            return this.f134197d;
        }

        public boolean d() {
            return this.f134195b;
        }

        public void e(String str) {
            this.f134194a = str;
        }

        public void f(boolean z10) {
            this.f134195b = z10;
        }

        public void g(File file) {
            this.f134196c = file;
        }

        public void h(URL url) {
            this.f134197d = url;
        }

        public void i(boolean z10) {
            this.f134198e = z10;
        }

        public boolean j() {
            return this.f134198e;
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f134200a;

        public String a() {
            return this.f134200a;
        }

        public void b(String str) {
            this.f134200a = str.trim();
        }

        public String toString() {
            return a();
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public class j implements Iterable<org.apache.tools.ant.types.u1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<org.apache.tools.ant.types.u1> f134201b = new ArrayList();

        public j() {
        }

        public void a(org.apache.tools.ant.types.u1 u1Var) {
            this.f134201b.add(u1Var);
        }

        @Override // java.lang.Iterable
        public Iterator<org.apache.tools.ant.types.u1> iterator() {
            return this.f134201b.iterator();
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f134203a;

        public k() {
        }

        public k(File file) {
            this.f134203a = file;
        }

        public File a() {
            return this.f134203a;
        }

        public void b(File file) {
            this.f134203a = file;
        }
    }

    /* JADX INFO: compiled from: Javadoc.java */
    public class l extends org.apache.tools.ant.types.b0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f134204r = null;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f134205s = true;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f134206t = ak.av;

        public l() {
        }

        public String d3() throws BuildException {
            String str = this.f134204r;
            if (str == null || str.isEmpty()) {
                throw new BuildException("No name specified for custom tag.");
            }
            if (u1() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f134204r);
                sb2.append(":");
                sb2.append(this.f134205s ? "" : "X");
                sb2.append(this.f134206t);
                sb2.append(":");
                sb2.append(u1());
                return sb2.toString();
            }
            if (this.f134205s && ak.av.equals(this.f134206t)) {
                return this.f134204r;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f134204r);
            sb3.append(":");
            sb3.append(this.f134205s ? "" : "X");
            sb3.append(this.f134206t);
            return sb3.toString();
        }

        public void e3(boolean z10) {
            this.f134205s = z10;
        }

        public void f3(String str) {
            this.f134204r = str;
        }

        public void g3(String str) throws BuildException {
            String[] strArr;
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            int length = g3.f134163a0.length;
            boolean[] zArr = new boolean[length];
            StringTokenizer stringTokenizer = new StringTokenizer(lowerCase, com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
            boolean z10 = false;
            boolean z11 = false;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("all".equals(strTrim)) {
                    if (z11) {
                        b().M0("Repeated tag scope element: all", 3);
                    }
                    z11 = true;
                } else {
                    int i10 = 0;
                    while (true) {
                        strArr = g3.f134163a0;
                        if (i10 >= strArr.length || strArr[i10].equals(strTrim)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 == strArr.length) {
                        throw new BuildException("Unrecognised scope element: %s", strTrim);
                    }
                    if (zArr[i10]) {
                        b().M0("Repeated tag scope element: " + strTrim, 3);
                    }
                    zArr[i10] = true;
                    z10 = true;
                }
            }
            if (z10 && z11) {
                throw new BuildException("Mixture of \"all\" and other scope elements in tag parameter.");
            }
            if (!z10 && !z11) {
                throw new BuildException("No scope elements specified in tag parameter.");
            }
            if (z11) {
                this.f134206t = ak.av;
                return;
            }
            StringBuilder sb2 = new StringBuilder(length);
            for (int i11 = 0; i11 < length; i11++) {
                if (zArr[i11]) {
                    sb2.append(g3.f134163a0[i11].charAt(0));
                }
            }
            this.f134206t = sb2.toString();
        }
    }

    private void A2(List<k> list) {
        Iterable iterable;
        org.apache.tools.ant.types.b0 b0Var;
        for (org.apache.tools.ant.types.u1 u1Var : this.V) {
            if (!u1Var.O()) {
                throw new BuildException("only file system based resources are supported by javadoc");
            }
            if (u1Var instanceof org.apache.tools.ant.types.b0) {
                org.apache.tools.ant.types.b0 b0Var2 = (org.apache.tools.ant.types.b0) u1Var;
                if (!b0Var2.F2() && !b0Var2.S0()) {
                    b0Var = (org.apache.tools.ant.types.b0) b0Var2.clone();
                    b0Var.t2().e("**/*.java");
                    if (this.P) {
                        iterable = u1Var;
                        iterable = u1Var;
                        iterable = u1Var;
                        iterable = b0Var;
                        b0Var.t2().e("**/package.html");
                        iterable = b0Var;
                    }
                }
            }
            iterable = u1Var;
            iterable = u1Var;
            iterable = u1Var;
            iterable = b0Var;
            iterable = u1Var;
            iterable = u1Var;
            iterable = u1Var;
            iterable = u1Var;
            iterable = u1Var;
            iterable = u1Var;
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                list.add(new k(((org.apache.tools.ant.types.resources.y) ((org.apache.tools.ant.types.s1) it.next()).e2(org.apache.tools.ant.types.resources.y.class)).l0()));
            }
        }
    }

    private void C2() {
        if (this.B != null && this.f134167n == null) {
            throw new BuildException("sourcePath attribute must be set when specifying packagelist.");
        }
    }

    private void D2(List<String> list, org.apache.tools.ant.types.o0 o0Var) {
        if (!list.isEmpty() && o0Var.isEmpty()) {
            throw new BuildException("sourcePath attribute must be set when specifying package names.");
        }
    }

    private void E2(List<String> list, List<k> list2) {
        if (this.B == null && list.isEmpty() && list2.isEmpty() && this.f134172s.isEmpty()) {
            throw new BuildException("No source files, no packages and no modules have been specified.");
        }
    }

    private void F2() {
        if ("javadoc2".equals(L1())) {
            x1("Warning: the task name <javadoc2> is deprecated. Use <javadoc> instead.", 1);
        }
    }

    private boolean G2(String str) {
        for (char c10 : str.toCharArray()) {
            if (Character.isWhitespace(c10)) {
                return true;
            }
        }
        return false;
    }

    private void L4(org.apache.tools.ant.types.o oVar) {
        File fileG = null;
        try {
            fileG = Z.G(b(), "javadocOptions", "", null, true, true);
            String[] strArrR = oVar.r();
            oVar.g();
            oVar.h().O1("@" + fileG.getAbsolutePath());
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileG.getAbsolutePath(), true));
            try {
                for (String str : strArrR) {
                    if (str.startsWith("-J-")) {
                        oVar.h().O1(str);
                    } else if (str.startsWith(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                        bufferedWriter.write(str);
                        bufferedWriter.write(" ");
                    } else {
                        bufferedWriter.write(s3(str));
                        bufferedWriter.newLine();
                    }
                }
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            if (fileG != null) {
                fileG.delete();
            }
            throw new BuildException("Error creating or writing temporary file for javadoc options", e10, w1());
        }
    }

    private void S2(org.apache.tools.ant.types.o oVar) {
        org.apache.tools.ant.types.o0 o0Var = new org.apache.tools.ant.types.o0(b());
        org.apache.tools.ant.types.o0 o0Var2 = this.f134177x;
        if (o0Var2 != null) {
            o0Var.n2(o0Var2);
        }
        org.apache.tools.ant.types.o0 o0VarQ2 = o0Var.q2(z0.b.f136024i);
        if (o0VarQ2.size() > 0) {
            oVar.h().O1("-bootclasspath");
            oVar.h().I1(o0VarQ2);
        }
    }

    private void T2(org.apache.tools.ant.types.o oVar) {
        if (this.R) {
            oVar.h().O1("-docfilessubdirs");
            String str = this.S;
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            oVar.h().O1("-excludedocfilessubdir");
            oVar.h().O1(this.S);
        }
    }

    private void U2(org.apache.tools.ant.types.o oVar) {
        b bVar = this.f134175v;
        if (bVar != null) {
            if (bVar.D1() == null) {
                throw new BuildException("The doclet name must be specified.", w1());
            }
            oVar.h().O1("-doclet");
            oVar.h().O1(this.f134175v.D1());
            if (this.f134175v.G1() != null) {
                org.apache.tools.ant.types.o0 o0VarS2 = this.f134175v.G1().s2(z0.b.f136024i);
                if (o0VarS2.size() != 0) {
                    oVar.h().O1("-docletpath");
                    oVar.h().I1(o0VarS2);
                }
            }
            for (c cVar : Collections.list(this.f134175v.N1())) {
                if (cVar.a() == null) {
                    throw new BuildException("Doclet parameters must have a name");
                }
                oVar.h().O1(cVar.a());
                if (cVar.b() != null) {
                    oVar.h().O1(cVar.b());
                }
            }
        }
    }

    private void V2(org.apache.tools.ant.types.o oVar) {
        if (this.A != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(this.A, com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP, false);
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                int iIndexOf = strTrim.indexOf(32);
                if (iIndexOf > 0) {
                    String strSubstring = strTrim.substring(0, iIndexOf);
                    String strSubstring2 = strTrim.substring(iIndexOf + 1);
                    oVar.h().O1("-group");
                    oVar.h().O1(strSubstring);
                    oVar.h().O1(strSubstring2);
                }
            }
        }
    }

    private void W2(org.apache.tools.ant.types.o oVar) {
        for (e eVar : this.D) {
            String strD = eVar.d();
            String strC = eVar.c();
            if (strD == null || strC == null) {
                throw new BuildException("The title and packages must be specified for group elements.");
            }
            oVar.h().O1("-group");
            oVar.h().O1(f3(strD));
            oVar.h().O1(strC);
        }
    }

    private void X2(org.apache.tools.ant.types.o oVar) {
        if (this.M && this.f134175v == null) {
            oVar.h().O1("-linksource");
        }
    }

    private void Y2(org.apache.tools.ant.types.o oVar) {
        for (h hVar : this.C) {
            if (hVar.a() == null || hVar.a().isEmpty()) {
                x1("No href was given for the link - skipping", 3);
            } else {
                String strA = null;
                if (hVar.j()) {
                    File fileW0 = b().W0(hVar.a());
                    if (fileW0.exists()) {
                        try {
                            strA = Z.N(fileW0).toExternalForm();
                        } catch (MalformedURLException unused) {
                            x1("Warning: link location was invalid " + fileW0, 1);
                        }
                    }
                }
                if (strA == null) {
                    try {
                        new URL(new URL("file://."), hVar.a());
                        strA = hVar.a();
                    } catch (MalformedURLException unused2) {
                        x1("Link href \"" + hVar.a() + "\" is not a valid url - skipping link", 1);
                    }
                }
                if (hVar.d()) {
                    File fileB = hVar.b();
                    URL urlC = hVar.c();
                    if (fileB == null && urlC == null) {
                        throw new BuildException("The package list location for link " + hVar.a() + " must be provided because the link is offline");
                    }
                    if (fileB != null) {
                        if (new File(fileB, "package-list").exists()) {
                            try {
                                urlC = Z.N(fileB);
                            } catch (MalformedURLException unused3) {
                                x1("Warning: Package list location was invalid " + fileB, 1);
                            }
                        } else {
                            x1("Warning: No package list was found at " + fileB, 3);
                        }
                    }
                    if (urlC != null) {
                        oVar.h().O1("-linkoffline");
                        oVar.h().O1(strA);
                        oVar.h().O1(urlC.toExternalForm());
                    }
                } else {
                    oVar.h().O1("-link");
                    oVar.h().O1(strA);
                }
            }
        }
    }

    private void Z2(org.apache.tools.ant.types.o oVar) {
        if (!this.f134172s.isEmpty()) {
            oVar.h().O1("--module");
            oVar.h().O1((String) this.f134172s.stream().map(new z2()).collect(Collectors.joining(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP)));
        }
        if (this.f134178y != null) {
            oVar.h().O1("--module-path");
            oVar.h().I1(this.f134178y);
        }
        if (this.f134179z != null) {
            oVar.h().O1("--module-source-path");
            oVar.h().I1(this.f134179z);
        }
    }

    private void a3(org.apache.tools.ant.types.o oVar) {
        if (this.O == null || this.f134175v != null) {
            return;
        }
        oVar.h().O1("-noqualifier");
        oVar.h().O1(this.O);
    }

    private void b3(org.apache.tools.ant.types.o oVar) {
        String strU0 = this.L;
        if (strU0 == null) {
            strU0 = b().u0(org.apache.tools.ant.j1.f133498v);
        }
        if (strU0 != null) {
            oVar.h().O1("-source");
            oVar.h().O1(strU0);
        }
    }

    private void c3(org.apache.tools.ant.types.o oVar, List<String> list, List<k> list2, boolean z10, File file, BufferedWriter bufferedWriter) throws IOException {
        for (String str : list) {
            if (z10) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            } else {
                oVar.h().O1(str);
            }
        }
        Iterator<k> it = list2.iterator();
        while (it.hasNext()) {
            String absolutePath = it.next().a().getAbsolutePath();
            if (z10) {
                if (absolutePath.contains(" ")) {
                    char c10 = File.separatorChar;
                    if (c10 == '\\') {
                        absolutePath = absolutePath.replace(c10, IOUtils.DIR_SEPARATOR_UNIX);
                    }
                    bufferedWriter.write("\"" + absolutePath + "\"");
                } else {
                    bufferedWriter.write(absolutePath);
                }
                bufferedWriter.newLine();
            } else {
                oVar.h().O1(absolutePath);
            }
        }
    }

    private void d3(org.apache.tools.ant.types.o oVar, org.apache.tools.ant.types.o0 o0Var) {
        if (o0Var.isEmpty()) {
            return;
        }
        oVar.h().O1("-sourcepath");
        oVar.h().I1(o0Var);
    }

    private void e3(final org.apache.tools.ant.types.o oVar) {
        for (Object obj : this.E) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                File fileZ2 = lVar.z2(b());
                if (fileZ2 == null) {
                    oVar.h().O1("-tag");
                    oVar.h().O1(lVar.d3());
                } else {
                    for (String str : lVar.B2(b()).m()) {
                        File file = new File(fileZ2, str);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                            try {
                                bufferedReader.lines().forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.f3
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj2) {
                                        g3.i3(oVar, (String) obj2);
                                    }
                                });
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (IOException e10) {
                            throw new BuildException("Couldn't read tag file from " + file.getAbsolutePath(), e10);
                        }
                    }
                }
            } else {
                d dVar = (d) obj;
                oVar.h().O1("-taglet");
                oVar.h().O1(dVar.D1());
                if (dVar.G1() != null) {
                    org.apache.tools.ant.types.o0 o0VarS2 = dVar.G1().s2(z0.b.f136024i);
                    if (!o0VarS2.isEmpty()) {
                        oVar.h().O1("-tagletpath");
                        oVar.h().I1(o0VarS2);
                    }
                }
            }
        }
    }

    private String g3(String str) {
        return str.replace("\r\n", "\n").replace("\n", System.lineSeparator());
    }

    private void h3(org.apache.tools.ant.types.o oVar) {
        if (this.G != null) {
            oVar.h().O1("-doctitle");
            oVar.h().O1(f3(this.G.b()));
        }
        if (this.H != null) {
            oVar.h().O1("-header");
            oVar.h().O1(f3(this.H.b()));
        }
        if (this.I != null) {
            oVar.h().O1("-footer");
            oVar.h().O1(f3(this.I.b()));
        }
        if (this.J != null) {
            oVar.h().O1("-bottom");
            oVar.h().O1(f3(this.J.b()));
        }
        org.apache.tools.ant.types.o0 o0Var = this.f134176w;
        if (o0Var == null) {
            this.f134176w = new org.apache.tools.ant.types.o0(b()).s2("last");
        } else {
            this.f134176w = o0Var.s2(z0.b.f136024i);
        }
        if (this.f134176w.size() > 0) {
            oVar.h().O1("-classpath");
            oVar.h().I1(this.f134176w);
        }
        if (this.f134174u && this.f134175v == null) {
            oVar.h().O1("-version");
        }
        if (this.f134173t && this.f134175v == null) {
            oVar.h().O1("-author");
        }
        if (this.f134175v == null && this.f134168o == null) {
            throw new BuildException("destdir attribute must be set!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i3(org.apache.tools.ant.types.o oVar, String str) {
        oVar.h().O1("-tag");
        oVar.h().O1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j3(String str) {
        return str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX).replaceFirst("\\*$", org.apache.tools.ant.types.selectors.m0.f136554a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k3(org.apache.tools.ant.types.w0 w0Var, String str) {
        w0Var.p2().e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l3(String str) {
        return str.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX).replaceFirst("\\*$", org.apache.tools.ant.types.selectors.m0.f136554a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m3(org.apache.tools.ant.types.w0 w0Var, String str) {
        w0Var.n2().e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean n3(File file, String str) {
        return str.endsWith(".java") || (this.P && str.equals("package.html"));
    }

    private void o2(boolean z10, String str) {
        if (z10) {
            this.f134164k.h().O1(str);
        }
    }

    private void o3(List<String> list, org.apache.tools.ant.types.o0 o0Var) {
        HashSet hashSet = new HashSet();
        ArrayList<org.apache.tools.ant.types.v> arrayList = new ArrayList(this.W);
        if (this.f134167n != null) {
            final org.apache.tools.ant.types.w0 w0Var = new org.apache.tools.ant.types.w0();
            w0Var.J(b());
            if (this.f134170q.isEmpty()) {
                w0Var.p2().e(org.apache.tools.ant.types.selectors.m0.f136554a);
            } else {
                this.f134170q.stream().map(new z2()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.a3
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return g3.j3((String) obj);
                    }
                }).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.b3
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        g3.k3(w0Var, (String) obj);
                    }
                });
            }
            this.f134171r.stream().map(new z2()).map(new Function() { // from class: org.apache.tools.ant.taskdefs.c3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return g3.l3((String) obj);
                }
            }).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.d3
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    g3.m3(w0Var, (String) obj);
                }
            });
            for (String str : this.f134167n.z2()) {
                File file = new File(str);
                if (file.isDirectory()) {
                    org.apache.tools.ant.types.v vVar = new org.apache.tools.ant.types.v();
                    vVar.J(b());
                    vVar.Q2(this.F);
                    vVar.R2(file);
                    vVar.v2().j2(w0Var);
                    arrayList.add(vVar);
                } else {
                    x1("Skipping " + str + " since it is no directory.", 1);
                }
            }
        }
        for (org.apache.tools.ant.types.v vVar2 : arrayList) {
            File fileZ2 = vVar2.z2(b());
            x1("scanning " + fileZ2 + " for packages.", 4);
            String[] strArrJ = vVar2.B2(b()).j();
            int length = strArrJ.length;
            boolean z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                String str2 = strArrJ[i10];
                if (new File(fileZ2, str2).list(new FilenameFilter() { // from class: org.apache.tools.ant.taskdefs.e3
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str3) {
                        return this.f134094a.n3(file2, str3);
                    }
                }).length > 0) {
                    if (str2.isEmpty()) {
                        x1(fileZ2 + " contains source files in the default package, you must specify them as source files not packages.", 1);
                    } else {
                        String strReplace = str2.replace(File.separatorChar, lg.a.f131414g);
                        if (!hashSet.contains(strReplace)) {
                            hashSet.add(strReplace);
                            list.add(strReplace);
                        }
                        z10 = true;
                    }
                }
            }
            if (z10) {
                o0Var.v2().b(fileZ2);
            } else {
                x1(fileZ2 + " doesn't contain any packages, dropping it.", 3);
            }
        }
    }

    private void p2(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            this.f134164k.h().O1(str);
            this.f134164k.h().O1(str2);
            return;
        }
        x1("Warning: Leaving out empty argument '" + str + "'", 1);
    }

    private String p3(String str, String str2) {
        int iIndexOf = str.indexOf(X);
        if (iIndexOf < 0) {
            return str;
        }
        return str.substring(0, iIndexOf) + str2 + str.substring(iIndexOf + Y);
    }

    private int q3(File file, String str) throws IOException {
        String strL = this.T;
        if (strL == null) {
            strL = Z.L();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), strL);
        try {
            String strG3 = g3(org.apache.tools.ant.util.j0.o0(inputStreamReader));
            inputStreamReader.close();
            if (!strG3.contains("function validURL(url) {")) {
                String strP3 = p3(strG3, str);
                if (!strP3.equals(strG3)) {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Files.newOutputStream(file.toPath(), new OpenOption[0]), strL);
                    try {
                        outputStreamWriter.write(strP3);
                        outputStreamWriter.close();
                        outputStreamWriter.close();
                        return 1;
                    } catch (Throwable th2) {
                        try {
                            outputStreamWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            return 0;
        } catch (Throwable th4) {
            try {
                inputStreamReader.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private void r3() throws IOException {
        if (this.U) {
            File file = this.f134168o;
            if (file != null && !file.isDirectory()) {
                x1("No javadoc created, no need to post-process anything", 3);
                return;
            }
            InputStream resourceAsStream = g3.class.getResourceAsStream("javadoc-frame-injections-fix.txt");
            if (resourceAsStream == null) {
                throw new FileNotFoundException("Missing resource 'javadoc-frame-injections-fix.txt' in classpath.");
            }
            try {
                String strTrim = g3(org.apache.tools.ant.util.j0.j0(new InputStreamReader(resourceAsStream, StandardCharsets.US_ASCII))).trim();
                org.apache.tools.ant.util.j0.c(resourceAsStream);
                org.apache.tools.ant.v0 v0Var = new org.apache.tools.ant.v0();
                v0Var.p(this.f134168o);
                v0Var.l(false);
                v0Var.h(new String[]{"**/index.html", "**/index.htm", "**/toc.html", "**/toc.htm"});
                v0Var.r();
                v0Var.e();
                int iQ3 = 0;
                for (String str : v0Var.m()) {
                    iQ3 += q3(new File(this.f134168o, str), strTrim);
                }
                if (iQ3 > 0) {
                    x1("Patched " + iQ3 + " link injection vulnerable javadocs", 2);
                }
            } catch (Throwable th2) {
                org.apache.tools.ant.util.j0.c(resourceAsStream);
                throw th2;
            }
        }
    }

    private String s3(String str) {
        if (G2(str) || str.contains("'") || str.contains("\"")) {
            return !str.contains("'") ? t3(str, '\'') : t3(str, kotlin.text.y.f128593b);
        }
        return str;
    }

    private String t3(String str, char c10) {
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        sb2.append(c10);
        boolean z10 = false;
        for (char c11 : str.toCharArray()) {
            if (c11 == c10) {
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                sb2.append(c11);
            } else if (c11 != '\n') {
                if (c11 == '\r') {
                    sb2.append("\\\r");
                    z10 = true;
                } else if (c11 != '\\') {
                    sb2.append(c11);
                } else {
                    sb2.append("\\\\");
                }
            } else if (z10) {
                sb2.append("\n");
            } else {
                sb2.append("\\\n");
            }
            z10 = false;
        }
        sb2.append(c10);
        return sb2.toString();
    }

    public void A3(boolean z10) {
        this.N = z10;
    }

    public void A4(String str) {
        this.L = str;
    }

    public void B2(d dVar) {
        this.E.add(dVar);
    }

    public void B3(String str) {
        p2("-charset", str);
    }

    public void B4(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            k kVar = new k();
            kVar.b(b().W0(strNextToken.trim()));
            z2(kVar);
        }
    }

    public void C3(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f134176w;
        if (o0Var2 == null) {
            this.f134176w = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void C4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f134167n;
        if (o0Var2 == null) {
            this.f134167n = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01d3 A[Catch: all -> 0x01c7, TRY_ENTER, TryCatch #5 {all -> 0x01c7, blocks: (B:30:0x00e3, B:32:0x00f1, B:74:0x01d3, B:75:0x01d6, B:76:0x01e1), top: B:80:0x00e3 }] */
    @Override // org.apache.tools.ant.u2
    public void D1() throws Throwable {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        File file;
        F2();
        Vector vector = new Vector();
        org.apache.tools.ant.types.o0 o0Var = new org.apache.tools.ant.types.o0(b());
        C2();
        org.apache.tools.ant.types.o0 o0Var2 = this.f134167n;
        if (o0Var2 != null) {
            o0Var.h2(o0Var2);
        }
        o3(vector, o0Var);
        D2(vector, o0Var);
        ArrayList arrayList = new ArrayList(this.f134169p);
        A2(arrayList);
        E2(vector, arrayList);
        x1("Generating Javadoc", 2);
        org.apache.tools.ant.types.o oVar = (org.apache.tools.ant.types.o) this.f134164k.clone();
        String str = this.Q;
        if (str != null) {
            oVar.w(str);
        } else {
            oVar.w(org.apache.tools.ant.util.s0.h("javadoc"));
        }
        h3(oVar);
        d3(oVar, o0Var);
        U2(oVar);
        S2(oVar);
        Y2(oVar);
        V2(oVar);
        W2(oVar);
        T2(oVar);
        Z2(oVar);
        e3(oVar);
        b3(oVar);
        X2(oVar);
        a3(oVar);
        if (this.N) {
            oVar.h().O1("-breakiterator");
        }
        if (this.K) {
            L4(oVar);
        }
        FileWriter fileWriter2 = null;
        File file2 = null;
        try {
            try {
                if (this.K) {
                    File fileG = Z.G(b(), "javadoc", "", null, true, true);
                    try {
                        oVar.h().O1("@" + fileG.getAbsolutePath());
                        FileWriter fileWriter3 = new FileWriter(fileG.getAbsolutePath(), true);
                        try {
                            bufferedWriter = new BufferedWriter(fileWriter3);
                            file = fileG;
                            fileWriter = fileWriter3;
                        } catch (IOException e10) {
                            e = e10;
                            file2 = fileG;
                            fileWriter = fileWriter3;
                            if (file2 != null) {
                                file2.delete();
                            }
                            throw new BuildException("Error creating temporary file", e, w1());
                        } catch (Throwable th2) {
                            th = th2;
                            fileWriter2 = fileWriter3;
                            org.apache.tools.ant.util.j0.f(fileWriter2);
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        fileWriter = null;
                        file2 = fileG;
                    }
                } else {
                    bufferedWriter = null;
                    file = null;
                    fileWriter = null;
                }
                try {
                    try {
                        c3(oVar, vector, arrayList, this.K, file, bufferedWriter);
                        if (this.K) {
                            bufferedWriter.flush();
                        }
                        org.apache.tools.ant.util.j0.f(fileWriter);
                        if (this.B != null) {
                            oVar.h().O1("@" + this.B);
                        }
                        x1(oVar.o(), 3);
                        x1("Javadoc execution", 2);
                        g gVar = new g(2);
                        g gVar2 = new g(1);
                        n1 n1Var = new n1(new d5(gVar, gVar2));
                        n1Var.w(b());
                        n1Var.E(null);
                        try {
                            try {
                                n1Var.x(oVar.s());
                                int iE = n1Var.e();
                                if (iE != 0 && this.f134165l) {
                                    throw new BuildException("Javadoc returned " + iE, w1());
                                }
                                if (gVar.g() && this.f134166m) {
                                    throw new BuildException("Javadoc issued warnings.", w1());
                                }
                                r3();
                                if (file != null) {
                                    file.delete();
                                }
                                gVar.f();
                                gVar2.f();
                                org.apache.tools.ant.util.j0.d(gVar);
                                org.apache.tools.ant.util.j0.d(gVar2);
                            } catch (IOException e12) {
                                throw new BuildException("Javadoc failed: " + e12, e12, w1());
                            }
                        } catch (Throwable th3) {
                            if (file != null) {
                                file.delete();
                            }
                            gVar.f();
                            gVar2.f();
                            org.apache.tools.ant.util.j0.d(gVar);
                            org.apache.tools.ant.util.j0.d(gVar2);
                            throw th3;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        file2 = file;
                        if (file2 != null) {
                            file2.delete();
                        }
                        throw new BuildException("Error creating temporary file", e, w1());
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileWriter2 = fileWriter;
                    org.apache.tools.ant.util.j0.f(fileWriter2);
                    throw th;
                }
            } catch (IOException e14) {
                e = e14;
                fileWriter = null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public void D3(org.apache.tools.ant.types.q1 q1Var) {
        J2().c2(q1Var);
    }

    public void D4(org.apache.tools.ant.types.q1 q1Var) {
        Q2().c2(q1Var);
    }

    public void E3(boolean z10) {
        this.F = z10;
    }

    public void E4(boolean z10) {
        o2(z10, "-splitindex");
    }

    public void F3(File file) {
        this.f134168o = file;
        this.f134164k.h().O1("-d");
        this.f134164k.h().G1(this.f134168o);
    }

    public void F4(File file) {
        this.f134164k.h().O1("-stylesheetfile");
        this.f134164k.h().G1(file);
    }

    public void G3(boolean z10) {
        this.R = z10;
    }

    public void G4(boolean z10) {
        o2(z10, "-use");
    }

    public org.apache.tools.ant.types.o.a H2() {
        return this.f134164k.h();
    }

    public void H3(String str) {
        this.f134164k.h().O1("-docencoding");
        this.f134164k.h().O1(str);
        this.T = str;
    }

    public void H4(boolean z10) {
        this.K = z10;
    }

    public org.apache.tools.ant.types.o0 I2() {
        if (this.f134177x == null) {
            this.f134177x = new org.apache.tools.ant.types.o0(b());
        }
        return this.f134177x.u2();
    }

    public void I3(String str) {
        if (this.f134175v == null) {
            b bVar = new b();
            this.f134175v = bVar;
            bVar.J(b());
        }
        this.f134175v.H1(str);
    }

    public void I4(boolean z10) {
        o2(z10, org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2);
    }

    public org.apache.tools.ant.types.o0 J2() {
        if (this.f134176w == null) {
            this.f134176w = new org.apache.tools.ant.types.o0(b());
        }
        return this.f134176w.u2();
    }

    public void J3(org.apache.tools.ant.types.o0 o0Var) {
        if (this.f134175v == null) {
            b bVar = new b();
            this.f134175v = bVar;
            bVar.J(b());
        }
        this.f134175v.I1(o0Var);
    }

    public void J4(boolean z10) {
        this.f134174u = z10;
    }

    public b K2() {
        if (this.f134175v == null) {
            this.f134175v = new b();
        }
        return this.f134175v;
    }

    public void K3(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f134175v == null) {
            b bVar = new b();
            this.f134175v = bVar;
            bVar.J(b());
        }
        this.f134175v.B1().c2(q1Var);
    }

    public void K4(String str) {
        p2("-windowtitle", str);
    }

    public e L2() {
        e eVar = new e();
        this.D.add(eVar);
        return eVar;
    }

    public void L3(String str) {
        f fVar = new f();
        fVar.a(str);
        r2(fVar);
    }

    public h M2() {
        h hVar = new h();
        this.C.add(hVar);
        return hVar;
    }

    public void M3(String str) {
        this.f134164k.h().O1("-encoding");
        this.f134164k.h().O1(str);
    }

    public org.apache.tools.ant.types.o0 N2() {
        if (this.f134178y == null) {
            this.f134178y = new org.apache.tools.ant.types.o0(b());
        }
        return this.f134178y.u2();
    }

    public void N3(String str) {
        this.S = str;
    }

    public org.apache.tools.ant.types.o0 O2() {
        if (this.f134179z == null) {
            this.f134179z = new org.apache.tools.ant.types.o0(b());
        }
        return this.f134179z.u2();
    }

    public void O3(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            i iVar = new i();
            iVar.b(strNextToken);
            s2(iVar);
        }
    }

    public j P2() {
        return this.V;
    }

    public void P3(String str) {
        this.Q = str;
    }

    public org.apache.tools.ant.types.o0 Q2() {
        if (this.f134167n == null) {
            this.f134167n = new org.apache.tools.ant.types.o0(b());
        }
        return this.f134167n.u2();
    }

    @Deprecated
    public void Q3(String str) {
        this.f134164k.h().O1("-extdirs");
        this.f134164k.h().O1(str);
    }

    public l R2() {
        l lVar = new l();
        this.E.add(lVar);
        return lVar;
    }

    public void R3(org.apache.tools.ant.types.o0 o0Var) {
        this.f134164k.h().O1("-extdirs");
        this.f134164k.h().I1(o0Var);
    }

    public void S3(boolean z10) {
        this.f134165l = z10;
    }

    public void T3(boolean z10) {
        this.f134166m = z10;
    }

    public void U3(String str) {
        f fVar = new f();
        fVar.a(str);
        u2(fVar);
    }

    public void V3(String str) {
        this.A = str;
    }

    public void W3(String str) {
        f fVar = new f();
        fVar.a(str);
        v2(fVar);
    }

    public void X3(File file) {
        this.f134164k.h().O1("-helpfile");
        this.f134164k.h().G1(file);
    }

    public void Y3(boolean z10) {
        this.P = z10;
    }

    public void Z3(String str) {
        M2().e(str);
    }

    public void a4(String str) {
        h hVarM2 = M2();
        hVarM2.f(true);
        if (str.trim().isEmpty()) {
            throw new BuildException("The linkoffline attribute must include a URL and a package-list file location separated by a space");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ", false);
        hVarM2.e(stringTokenizer.nextToken());
        if (!stringTokenizer.hasMoreTokens()) {
            throw new BuildException("The linkoffline attribute must include a URL and a package-list file location separated by a space");
        }
        hVarM2.g(b().W0(stringTokenizer.nextToken()));
    }

    public void b4(boolean z10) {
        this.M = z10;
    }

    public void c4(String str) {
        this.f134164k.i(true).O1(str);
        this.f134164k.i(true).O1("-locale");
    }

    public void d4(String str) {
        this.f134164k.h().O1("-J-Xmx" + str);
    }

    public void e4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f134178y;
        if (o0Var2 == null) {
            this.f134178y = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    protected String f3(String str) {
        return b().V0(str);
    }

    public void f4(org.apache.tools.ant.types.q1 q1Var) {
        N2().c2(q1Var);
    }

    public void g4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f134179z;
        if (o0Var2 == null) {
            this.f134179z = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void h4(org.apache.tools.ant.types.q1 q1Var) {
        O2().c2(q1Var);
    }

    public void i4(String str) {
        for (String str2 : str.split(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            i iVar = new i();
            iVar.b(str2);
            w2(iVar);
        }
    }

    public void j4(boolean z10) {
        o2(z10, "-nodeprecated");
    }

    public void k4(boolean z10) {
        o2(z10, "-nodeprecatedlist");
    }

    public void l4(boolean z10) {
        o2(z10, "-nohelp");
    }

    public void m4(boolean z10) {
        o2(z10, "-noindex");
    }

    public void n4(boolean z10) {
        o2(z10, "-nonavbar");
    }

    public void o4(String str) {
        this.O = str;
    }

    public void p4(boolean z10) {
        o2(z10, "-notree");
    }

    public void q2(f fVar) {
        this.J = fVar;
    }

    public void q4(boolean z10) {
        x1("Javadoc 1.4 doesn't support the -1.1 switch anymore", 1);
    }

    public void r2(f fVar) {
        this.G = fVar;
    }

    public void r4(File file) {
        this.f134164k.h().O1("-overview");
        this.f134164k.h().G1(file);
    }

    public void s2(i iVar) {
        this.f134171r.add(iVar);
    }

    public void s4(boolean z10) {
        o2(z10, "-package");
    }

    public void t2(org.apache.tools.ant.types.b0 b0Var) {
        P2().a(b0Var);
    }

    public void t4(String str) {
        this.B = str;
    }

    public void u2(f fVar) {
        this.I = fVar;
    }

    public void u3(a aVar) {
        this.f134164k.h().O1(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + aVar.d());
    }

    public void u4(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            i iVar = new i();
            iVar.b(strNextToken);
            x2(iVar);
        }
    }

    public void v2(f fVar) {
        this.H = fVar;
    }

    public void v3(String str) {
        this.f134164k.h().H1(str);
    }

    public void v4(boolean z10) {
        this.U = z10;
    }

    public void w2(i iVar) {
        this.f134172s.add(iVar);
    }

    public void w3(boolean z10) {
        this.f134173t = z10;
    }

    public void w4(boolean z10) {
        o2(z10, "-private");
    }

    public void x2(i iVar) {
        this.f134170q.add(iVar);
    }

    public void x3(org.apache.tools.ant.types.q1 q1Var) {
        I2().c2(q1Var);
    }

    public void x4(boolean z10) {
        o2(z10, "-protected");
    }

    public void y2(org.apache.tools.ant.types.v vVar) {
        this.W.add(vVar);
    }

    public void y3(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f134177x;
        if (o0Var2 == null) {
            this.f134177x = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void y4(boolean z10) {
        o2(z10, "-public");
    }

    public void z2(k kVar) {
        this.f134169p.add(kVar);
    }

    public void z3(String str) {
        f fVar = new f();
        fVar.a(str);
        q2(fVar);
    }

    public void z4(boolean z10) {
        o2(z10, "-serialwarn");
    }
}
