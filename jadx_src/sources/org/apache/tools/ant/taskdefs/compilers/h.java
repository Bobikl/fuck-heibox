package org.apache.tools.ant.taskdefs.compilers;

import com.tencent.qcloud.core.util.IOUtils;
import com.uc.crashsdk.export.LogType;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.condition.z;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.taskdefs.y2;
import org.apache.tools.ant.taskdefs.z0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;
import org.apache.tools.ant.util.j2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: DefaultCompilerAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h implements a, b {
    private static final j0 A;

    @Deprecated
    protected static final String B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f133834z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected o0 f133835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected File f133836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f133837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f133838d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f133839e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f133840f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f133841g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f133842h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f133843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f133844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected o0 f133845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected o0 f133846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected o0 f133847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected o0 f133848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected o0 f133849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected o0 f133850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected o0 f133851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Project f133852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected Location f133853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f133854t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f133855u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected String f133856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected String f133857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected File[] f133858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected y2 f133859y;

    static {
        if (z.b(z.f133971m)) {
            f133834z = 1000;
        } else {
            f133834z = 4096;
        }
        A = j0.O();
        B = j2.f136853f;
    }

    private boolean B(String str, String str2) {
        String strY2 = this.f133859y.Y2();
        return str.equals(strY2) || (s0.q(str2) && ("classic".equals(strY2) || "modern".equals(strY2) || "extJavac".equals(strY2)));
    }

    private String G() {
        if (A()) {
            return "9 in JDK 9";
        }
        if (y()) {
            return "1.8 in JDK 1.8";
        }
        if (x()) {
            return "1.7 in JDK 1.7";
        }
        return v() ? "1.5 in JDK 1.5 and 1.6" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(org.apache.tools.ant.types.o oVar, String str) {
        oVar.h().O1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O(String str) {
        return String.format("    %s%n", str);
    }

    private boolean Q(String str) {
        if (!v()) {
            return false;
        }
        if (str.startsWith("1.")) {
            str = str.substring(2);
        }
        return "1".equals(str) || "2".equals(str) || "3".equals(str) || "4".equals(str) || (("5".equals(str) || "6".equals(str)) && x()) || (("7".equals(str) && y()) || (("8".equals(str) && A()) || ("9".equals(str) && h())));
    }

    private void R(org.apache.tools.ant.types.o oVar, String str, String str2) {
        this.f133859y.x1("", 1);
        this.f133859y.x1("          WARNING", 1);
        this.f133859y.x1("", 1);
        this.f133859y.x1("The -source switch defaults to " + G() + ".", 1);
        this.f133859y.x1("If you specify -target " + str + " you now must also specify -source " + str2 + ".", 1);
        y2 y2Var = this.f133859y;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Ant will implicitly add -source ");
        sb2.append(str2);
        sb2.append(" for you.  Please change your build file.");
        y2Var.x1(sb2.toString(), 1);
        oVar.h().O1("-source");
        oVar.h().O1(str2);
    }

    private String g(String str) {
        return ("1.1".equals(str) || "1.2".equals(str)) ? "1.3" : str;
    }

    protected boolean A() {
        return B("javac1.9", "9") || B("javac9", "9") || h();
    }

    protected int C(String[] strArr, int i10) {
        return D(strArr, i10, true);
    }

    protected int D(String[] strArr, int i10, boolean z10) {
        String[] strArr2;
        File fileG = null;
        try {
            if (org.apache.tools.ant.types.o.z(strArr).length() <= f133834z || i10 < 0) {
                strArr2 = strArr;
            } else {
                try {
                    fileG = A.G(L(), "files", "", H().D3(), true, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileG));
                    for (int i11 = i10; i11 < strArr.length; i11++) {
                        try {
                            if (z10 && strArr[i11].contains(" ")) {
                                strArr[i11] = strArr[i11].replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
                                bufferedWriter.write("\"" + strArr[i11] + "\"");
                            } else {
                                bufferedWriter.write(strArr[i11]);
                            }
                            bufferedWriter.newLine();
                        } catch (Throwable th2) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    bufferedWriter.flush();
                    strArr2 = new String[i10 + 1];
                    System.arraycopy(strArr, 0, strArr2, 0, i10);
                    strArr2[i10] = "@" + fileG;
                    bufferedWriter.close();
                } catch (IOException e10) {
                    throw new BuildException("Error creating temporary file", e10, this.f133853s);
                }
            }
            try {
                n1 n1Var = new n1(new s3((u2) this.f133859y, 2, 1));
                if (z.b(z.f133977s)) {
                    n1Var.D(true);
                }
                n1Var.w(this.f133852r);
                n1Var.E(this.f133852r.Z());
                n1Var.x(strArr2);
                n1Var.e();
                int i12 = n1Var.i();
                if (fileG != null) {
                    fileG.delete();
                }
                return i12;
            } catch (IOException e11) {
                throw new BuildException("Error running " + strArr[0] + " compiler", e11, this.f133853s);
            }
        } catch (Throwable th4) {
            if (fileG != null) {
                fileG.delete();
            }
            throw th4;
        }
    }

    protected o0 E() {
        o0 o0Var = new o0(this.f133852r);
        o0 o0Var2 = this.f133845k;
        if (o0Var2 != null) {
            o0Var.n2(o0Var2);
        }
        return o0Var.q2(z0.b.f136024i);
    }

    protected o0 F() {
        o0 o0Var = new o0(this.f133852r);
        if (this.f133836b != null && H().I3()) {
            o0Var.C2(this.f133836b);
        }
        o0 o0Var2 = this.f133847m;
        if (o0Var2 == null) {
            o0Var2 = new o0(this.f133852r);
        }
        if (this.f133854t) {
            o0Var.h2(o0Var2.s2("last"));
        } else {
            o0Var.h2(o0Var2.s2(z0.b.f136024i));
        }
        if (this.f133855u) {
            o0Var.m2();
        }
        return o0Var;
    }

    public y2 H() {
        return this.f133859y;
    }

    protected o0 I() {
        o0 o0Var = new o0(L());
        o0 o0Var2 = this.f133848n;
        if (o0Var2 != null) {
            o0Var.h2(o0Var2);
        }
        return o0Var;
    }

    protected o0 J() {
        o0 o0Var = new o0(L());
        o0 o0Var2 = this.f133851q;
        if (o0Var2 != null) {
            o0Var.e2(o0Var2);
        }
        return o0Var;
    }

    protected String K() {
        if (s()) {
            return "-g:none";
        }
        return null;
    }

    protected Project L() {
        return this.f133852r;
    }

    protected o0 M() {
        o0 o0Var = new o0(L());
        o0 o0Var2 = this.f133849o;
        if (o0Var2 != null) {
            o0Var.h2(o0Var2);
        }
        return o0Var;
    }

    protected void P(final org.apache.tools.ant.types.o oVar) {
        this.f133859y.x1("Compilation " + oVar.k(), 3);
        y2 y2Var = this.f133859y;
        Object[] objArr = new Object[1];
        objArr[0] = this.f133858x.length == 1 ? "File" : "Files";
        y2Var.x1(String.format("%s to be compiled:", objArr), 3);
        this.f133859y.x1((String) Stream.of((Object[]) this.f133858x).map(new e()).peek(new Consumer() { // from class: org.apache.tools.ant.taskdefs.compilers.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                h.N(oVar, (String) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.taskdefs.compilers.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return h.O((String) obj);
            }
        }).collect(Collectors.joining("")), 3);
    }

    protected org.apache.tools.ant.types.o S() {
        return T(false);
    }

    protected org.apache.tools.ant.types.o T(boolean z10) {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        V(oVar, z10);
        P(oVar);
        return oVar;
    }

    protected org.apache.tools.ant.types.o U(org.apache.tools.ant.types.o oVar) {
        return V(oVar, false);
    }

    protected org.apache.tools.ant.types.o V(org.apache.tools.ant.types.o oVar, boolean z10) {
        String strB3;
        o0 o0VarF = F();
        o0 o0Var = this.f133850p;
        if (o0Var == null) {
            o0Var = this.f133835a;
        }
        String str = s() ? "-J-X" : "-J-";
        if (this.f133856v != null) {
            if (this.f133859y.H3()) {
                oVar.h().O1(str + "ms" + this.f133856v);
            } else {
                this.f133859y.x1("Since fork is false, ignoring memoryInitialSize setting.", 1);
            }
        }
        if (this.f133857w != null) {
            if (this.f133859y.H3()) {
                oVar.h().O1(str + "mx" + this.f133857w);
            } else {
                this.f133859y.x1("Since fork is false, ignoring memoryMaximumSize setting.", 1);
            }
        }
        if (this.f133859y.u3()) {
            oVar.h().O1("-nowarn");
        }
        if (this.f133840f) {
            oVar.h().O1("-deprecation");
        }
        if (this.f133836b != null) {
            oVar.h().O1("-d");
            oVar.h().G1(this.f133836b);
        }
        oVar.h().O1("-classpath");
        if (s()) {
            oVar.h().I1(o0VarF);
            if (o0Var.size() > 0) {
                oVar.h().O1("-sourcepath");
                oVar.h().I1(o0Var);
            }
            if (this.f133844j == null || !A()) {
                if (this.f133843i != null) {
                    oVar.h().O1("-target");
                    oVar.h().O1(this.f133843i);
                }
                o0 o0VarE = E();
                if (!o0VarE.isEmpty()) {
                    oVar.h().O1("-bootclasspath");
                    oVar.h().I1(o0VarE);
                }
            }
            o0 o0Var2 = this.f133846l;
            if (o0Var2 != null && !o0Var2.isEmpty()) {
                oVar.h().O1("-extdirs");
                oVar.h().I1(this.f133846l);
            }
        } else {
            final o0 o0Var3 = new o0(this.f133852r);
            Optional.ofNullable(E()).ifPresent(new Consumer() { // from class: org.apache.tools.ant.taskdefs.compilers.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    o0Var3.n2((o0) obj);
                }
            });
            o0 o0Var4 = this.f133846l;
            if (o0Var4 != null) {
                o0Var3.j2(o0Var4);
            }
            o0Var3.n2(o0VarF);
            o0Var3.n2(o0Var);
            oVar.h().I1(o0Var3);
        }
        if (this.f133837c != null) {
            oVar.h().O1("-encoding");
            oVar.h().O1(this.f133837c);
        }
        if (this.f133838d) {
            if (z10 && s() && (strB3 = this.f133859y.b3()) != null) {
                oVar.h().O1("-g:" + strB3);
            } else {
                oVar.h().O1("-g");
            }
        } else if (K() != null) {
            oVar.h().O1(K());
        }
        if (this.f133839e) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.vss.g.f135456e3);
        }
        if (this.f133841g) {
            if (t()) {
                this.f133859y.x1("depend attribute is not supported by the modern compiler", 1);
            } else if (s()) {
                oVar.h().O1("-Xdepend");
            } else {
                oVar.h().O1("-depend");
            }
        }
        if (this.f133842h) {
            oVar.h().O1(org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2);
        }
        e(oVar);
        return oVar;
    }

    protected org.apache.tools.ant.types.o W() {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        X(oVar);
        P(oVar);
        return oVar;
    }

    protected org.apache.tools.ant.types.o X(org.apache.tools.ant.types.o oVar) {
        V(oVar, true);
        if (u()) {
            String strB3 = this.f133859y.B3();
            String strX3 = this.f133859y.x3();
            if (this.f133844j == null || !A()) {
                if (this.f133844j != null) {
                    this.f133859y.log("Support for javac --release has been added in Java9 ignoring it");
                }
                if (strX3 != null) {
                    oVar.h().O1("-source");
                    oVar.h().O1(g(strX3));
                } else if (strB3 != null && Q(strB3)) {
                    R(oVar, strB3, g(strB3));
                }
            } else {
                if (strB3 != null || strX3 != null || E().size() > 0) {
                    this.f133859y.x1("Ignoring source, target and bootclasspath as release has been set", 1);
                }
                oVar.h().O1("--release");
                oVar.h().O1(this.f133844j);
            }
        }
        o0 o0VarJ = J();
        if (!o0VarJ.isEmpty()) {
            oVar.h().O1("--module-source-path");
            oVar.h().I1(o0VarJ);
        }
        o0 o0VarI = I();
        if (!o0VarI.isEmpty()) {
            oVar.h().O1("--module-path");
            oVar.h().I1(o0VarI);
        }
        o0 o0VarM = M();
        if (!o0VarM.isEmpty()) {
            oVar.h().O1("--upgrade-module-path");
            oVar.h().I1(o0VarM);
        }
        if (this.f133859y.t3() != null) {
            if (y()) {
                oVar.h().O1("-h");
                oVar.h().G1(this.f133859y.t3());
            } else {
                this.f133859y.log("Support for javac -h has been added in Java8, ignoring it");
            }
        }
        return oVar;
    }

    @Override // org.apache.tools.ant.taskdefs.compilers.a
    public void a(y2 y2Var) {
        this.f133859y = y2Var;
        this.f133835a = y2Var.z3();
        this.f133836b = y2Var.e3();
        this.f133837c = y2Var.f3();
        this.f133838d = y2Var.a3();
        this.f133839e = y2Var.v3();
        this.f133840f = y2Var.d3();
        this.f133841g = y2Var.c3();
        this.f133842h = y2Var.F3();
        this.f133843i = y2Var.B3();
        this.f133844j = y2Var.w3();
        this.f133845k = y2Var.V2();
        this.f133846l = y2Var.h3();
        this.f133858x = y2Var.j3();
        this.f133847m = y2Var.W2();
        this.f133848n = y2Var.r3();
        this.f133849o = y2Var.E3();
        this.f133850p = y2Var.y3();
        this.f133851q = y2Var.s3();
        this.f133852r = y2Var.b();
        this.f133853s = y2Var.w1();
        this.f133854t = y2Var.l3();
        this.f133855u = y2Var.m3();
        this.f133856v = y2Var.p3();
        this.f133857w = y2Var.q3();
        if (this.f133851q != null && this.f133835a == null && this.f133850p == null) {
            this.f133850p = new o0(L());
        }
    }

    @Override // org.apache.tools.ant.taskdefs.compilers.b
    public String[] b() {
        return new String[]{LogType.JAVA_TYPE};
    }

    protected void e(org.apache.tools.ant.types.o oVar) {
        oVar.c(H().Z2());
    }

    @Deprecated
    protected void f(o0 o0Var) {
        o0Var.j2(this.f133846l);
    }

    protected boolean h() {
        return "javac10+".equals(this.f133859y.Y2()) || (s0.n("10") && ("classic".equals(this.f133859y.Y2()) || "modern".equals(this.f133859y.Y2()) || "extJavac".equals(this.f133859y.Y2())));
    }

    @Deprecated
    protected boolean i() {
        return r() && !s();
    }

    @Deprecated
    protected boolean j() {
        return s() && !t();
    }

    @Deprecated
    protected boolean k() {
        return t() && !u();
    }

    @Deprecated
    protected boolean l() {
        return u() && !v();
    }

    @Deprecated
    protected boolean m() {
        return v() && !w();
    }

    @Deprecated
    protected boolean n() {
        return w() && !x();
    }

    @Deprecated
    protected boolean o() {
        return x() && !y();
    }

    @Deprecated
    protected boolean p() {
        return y() && !A();
    }

    @Deprecated
    protected boolean q() {
        return z();
    }

    protected boolean r() {
        return "javac1.1".equals(this.f133859y.Y2()) || s();
    }

    protected boolean s() {
        return "javac1.2".equals(this.f133859y.Y2()) || t();
    }

    protected boolean t() {
        return "javac1.3".equals(this.f133859y.Y2()) || u();
    }

    protected boolean u() {
        return B("javac1.4", "1.4") || v();
    }

    protected boolean v() {
        return B("javac1.5", s0.f136928s) || w();
    }

    protected boolean w() {
        return B("javac1.6", s0.f136930u) || x();
    }

    protected boolean x() {
        return B("javac1.7", s0.f136932w) || y();
    }

    protected boolean y() {
        return B("javac1.8", s0.f136934y) || A();
    }

    @Deprecated
    protected boolean z() {
        return A() && !h();
    }
}
