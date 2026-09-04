package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.ExitException;
import org.apache.tools.ant.ExitStatusException;
import org.apache.tools.ant.types.CommandlineJava;

/* JADX INFO: compiled from: Java.java */
/* JADX INFO: loaded from: classes5.dex */
public class v2 extends org.apache.tools.ant.u2 {
    private static final String B = "Timeout: killed the sub-process";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private File f135877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private File f135878t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private File f135879u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected org.apache.tools.ant.types.p1 f135881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f135882x;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CommandlineJava f135869k = new CommandlineJava();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.z f135870l = new org.apache.tools.ant.types.z();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f135871m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135872n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f135873o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135874p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Long f135875q = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected i5 f135880v = new i5((org.apache.tools.ant.u2) this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private org.apache.tools.ant.types.x0 f135883y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f135884z = false;
    private boolean A = false;

    public v2() {
    }

    public v2(org.apache.tools.ant.u2 u2Var) {
        B1(u2Var);
    }

    private int A2(String[] strArr) throws BuildException {
        n1 n1Var = new n1(this.f135880v.f(), x2());
        o3(n1Var, strArr);
        try {
            int iE = n1Var.e();
            this.f135880v.e();
            if (n1Var.p()) {
                throw new BuildException(B);
            }
            return iE;
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D2(CommandlineJava commandlineJava, String str) {
        commandlineJava.g().O1(str);
    }

    private void E2(Throwable th2) {
        x1(org.apache.tools.ant.util.j2.b(th2), 0);
    }

    private void H2(CommandlineJava commandlineJava) throws Throwable {
        try {
            o1 o1Var = new o1();
            o1Var.f(commandlineJava.w());
            o1Var.e(commandlineJava.t());
            o1Var.i(commandlineJava.B());
            o1Var.h(this.f135883y);
            o1Var.j(this.f135875q);
            this.f135880v.g();
            o1Var.b(b());
            this.f135880v.e();
            if (o1Var.d()) {
                throw new BuildException(B);
            }
        } catch (IOException e10) {
            throw new BuildException(e10);
        }
    }

    private void l3(n1 n1Var, String[] strArr) {
        if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133977s)) {
            m3(n1Var, strArr);
        } else {
            n1Var.x(strArr);
        }
    }

    private void m3(n1 n1Var, String[] strArr) {
        o1.k(n1Var, strArr);
    }

    private void n3(n1 n1Var) {
        String[] strArrC = this.f135870l.c();
        if (strArrC != null) {
            for (String str : strArrC) {
                x1("Setting environment variable: " + str, 3);
            }
        }
        n1Var.A(this.f135872n);
        n1Var.y(strArrC);
    }

    private void o3(n1 n1Var, String[] strArr) {
        n1Var.w(b());
        q3(n1Var);
        n3(n1Var);
        l3(n1Var, strArr);
    }

    private void q3(n1 n1Var) {
        File file = this.f135873o;
        if (file == null) {
            this.f135873o = b().Z();
        } else if (!file.isDirectory()) {
            throw new BuildException(this.f135873o.getAbsolutePath() + " is not a valid directory", w1());
        }
        n1Var.E(this.f135873o);
    }

    private void r3(String[] strArr) throws BuildException {
        n1 n1Var = new n1();
        o3(n1Var, strArr);
        try {
            n1Var.F();
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    public CommandlineJava B2() {
        return this.f135869k;
    }

    public CommandlineJava.b C2() {
        return B2().B();
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f135873o;
        org.apache.tools.ant.types.x0 x0Var = this.f135883y;
        try {
            o2();
            int iY2 = y2();
            if (iY2 != 0) {
                if (this.f135874p) {
                    throw new ExitStatusException("Java returned: " + iY2, iY2, w1());
                }
                x1("Java Result: " + iY2, 0);
            }
            F2(iY2);
            this.f135873o = file;
            this.f135883y = x0Var;
        } catch (Throwable th2) {
            this.f135873o = file;
            this.f135883y = x0Var;
            throw th2;
        }
    }

    protected void F2(int i10) {
        String string = Integer.toString(i10);
        if (this.f135882x != null) {
            b().n1(this.f135882x, string);
        }
    }

    protected void G2(String str, Vector<String> vector) throws Throwable {
        final CommandlineJava commandlineJava = new CommandlineJava();
        commandlineJava.R(str);
        vector.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.u2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                v2.D2(commandlineJava, (String) obj);
            }
        });
        H2(commandlineJava);
    }

    public void I2(boolean z10) {
        this.f135880v.t(z10);
        this.A = z10 | this.A;
    }

    public void J2(String str) {
        x1("The args attribute is deprecated. Please use nested arg elements.", 1);
        B2().g().H1(str);
    }

    public void K2(String str) throws BuildException {
        if (B2().v() != null || B2().z() != null) {
            throw new BuildException("Cannot use combination of 'jar', 'classname', sourcefile attributes in same command");
        }
        B2().R(str);
    }

    public void L2(org.apache.tools.ant.types.o0 o0Var) {
        s2().n2(o0Var);
    }

    public void M2(org.apache.tools.ant.types.q1 q1Var) {
        s2().c2(q1Var);
    }

    public void N2(boolean z10) {
        B2().S(z10);
    }

    @Override // org.apache.tools.ant.u2
    protected void O1(String str) {
        if (this.f135880v.j() != null) {
            this.f135880v.m(str);
        } else {
            super.O1(str);
        }
    }

    public void O2(File file) {
        this.f135873o = file;
    }

    public void P2(File file) {
        this.f135879u = file;
        this.A = true;
    }

    @Override // org.apache.tools.ant.u2
    protected void Q1(String str) {
        if (this.f135880v.j() != null) {
            this.f135880v.n(str);
        } else {
            super.Q1(str);
        }
    }

    public void Q2(String str) {
        this.f135880v.B(str);
        this.A = true;
    }

    @Override // org.apache.tools.ant.u2
    protected void R1(String str) {
        if (this.f135880v.l() != null) {
            this.f135880v.o(str);
        } else {
            super.R1(str);
        }
    }

    public void R2(boolean z10) {
        this.f135874p = z10;
        this.A = z10 | this.A;
    }

    @Override // org.apache.tools.ant.u2
    public int S1(byte[] bArr, int i10, int i11) throws IOException {
        return this.f135880v.p(bArr, i10, i11);
    }

    public void S2(boolean z10) {
        this.f135871m = z10;
    }

    public void T2(File file) {
        if (this.f135876r != null) {
            throw new BuildException("The \"input\" and \"inputstring\" attributes cannot both be specified");
        }
        this.f135877s = file;
        this.A = true;
    }

    @Override // org.apache.tools.ant.u2
    protected void U1(String str) {
        if (this.f135880v.l() != null) {
            this.f135880v.q(str);
        } else {
            super.U1(str);
        }
    }

    public void U2(String str) {
        if (this.f135877s != null) {
            throw new BuildException("The \"input\" and \"inputstring\" attributes cannot both be specified");
        }
        this.f135876r = str;
        this.A = true;
    }

    public void V2(String str) {
        B2().b0(str);
    }

    public void W2(File file) throws BuildException {
        if (B2().s() != null || B2().x() != null || B2().z() != null) {
            throw new BuildException("Cannot use combination of 'jar', 'sourcefile', 'classname', 'module' attributes in same command");
        }
        B2().T(file.getAbsolutePath());
    }

    public void X2(String str) {
        B2().Z(str);
    }

    public void Y2(String str) {
        x1("The jvmargs attribute is deprecated. Please use nested jvmarg elements.", 1);
        B2().m().H1(str);
    }

    public void Z2(boolean z10) {
        this.f135880v.I(z10);
        this.A = z10 | this.A;
    }

    public void a3(String str) {
        B2().U(str);
    }

    public void b3(String str) throws BuildException {
        if (B2().v() != null || B2().z() != null) {
            throw new BuildException("Cannot use combination of 'jar', 'module', sourcefile attributes in same command");
        }
        B2().V(str);
    }

    public void c3(org.apache.tools.ant.types.o0 o0Var) {
        u2().n2(o0Var);
    }

    public void d3(org.apache.tools.ant.types.q1 q1Var) {
        u2().c2(q1Var);
    }

    public void e3(boolean z10) {
        this.f135872n = z10;
    }

    public void f3(File file) {
        this.f135878t = file;
        this.A = true;
    }

    public void g3(String str) {
        this.f135880v.O(str);
        this.A = true;
    }

    public void h3(String str) {
        this.f135882x = str;
        this.A = true;
    }

    public void i3(String str) throws BuildException {
        String strV = B2().v();
        String strS = B2().s();
        String strX = B2().x();
        if (strV != null || strS != null || strX != null) {
            throw new BuildException("Cannot use 'sourcefile' in combination with 'jar' or 'module' or 'classname'");
        }
        B2().X(str);
    }

    public void j2(org.apache.tools.ant.types.m mVar) {
        if (B2().q() != null) {
            throw new BuildException("Only one assertion declaration is allowed");
        }
        B2().Q(mVar);
    }

    public void j3(boolean z10) {
        this.f135884z = z10;
    }

    public void k2(org.apache.tools.ant.types.p1 p1Var) {
        if (this.f135881w != null) {
            throw new BuildException("cannot have > 1 nested redirectors");
        }
        this.f135881w = p1Var;
        this.A = true;
    }

    public void k3(Long l10) {
        this.f135875q = l10;
        this.A = (l10 != null) | this.A;
    }

    public void l2(org.apache.tools.ant.types.z.a aVar) {
        this.f135870l.b(aVar);
    }

    public void m2(org.apache.tools.ant.types.z.a aVar) {
        B2().c(aVar);
    }

    public void n2(org.apache.tools.ant.types.j1 j1Var) {
        B2().d(j1Var);
    }

    protected void o2() throws BuildException {
        String strS = B2().s();
        String strX = B2().x();
        String strZ = B2().z();
        if (strS == null && B2().v() == null && strX == null && strZ == null) {
            throw new BuildException("Classname must not be null.");
        }
        if (!this.f135871m && B2().v() != null) {
            throw new BuildException("Cannot execute a jar in non-forked mode. Please set fork='true'. ");
        }
        if (!this.f135871m && B2().x() != null) {
            throw new BuildException("Cannot execute a module in non-forked mode. Please set fork='true'. ");
        }
        boolean z10 = this.f135871m;
        if (!z10 && strZ != null) {
            throw new BuildException("Cannot execute sourcefile in non-forked mode. Please set fork='true'");
        }
        if (this.f135884z && !z10) {
            throw new BuildException("Cannot spawn a java process in non-forked mode. Please set fork='true'. ");
        }
        if (B2().t() != null && B2().v() != null) {
            x1("When using 'jar' attribute classpath-settings are ignored. See the manual for more information.", 3);
        }
        if (this.f135884z && this.A) {
            b().M0("spawn does not allow attributes related to input, output, error, result", 0);
            b().M0("spawn also does not allow timeout", 0);
            b().M0("finally, spawn is not compatible with a nested I/O <redirector>", 0);
            throw new BuildException("You have used an attribute or nested element which is not compatible with spawn");
        }
        if (B2().q() != null && !this.f135871m) {
            log("Assertion statements are currently ignored in non-forked mode");
        }
        if (this.f135871m) {
            if (this.f135883y != null) {
                x1("Permissions can not be set this way in forked mode.", 1);
            }
            x1(B2().n(), 3);
        } else {
            if (B2().D().y() > 1) {
                x1("JVM args ignored when same JVM is used.", 1);
            }
            if (this.f135873o != null) {
                x1("Working directory ignored when same JVM is used.", 1);
            }
            if (this.f135872n || this.f135870l.c() != null) {
                x1("Changes to environment variables are ignored when same JVM is used.", 1);
            }
            if (B2().r() != null) {
                x1("bootclasspath ignored when same JVM is used.", 1);
            }
            if (this.f135883y == null) {
                this.f135883y = new org.apache.tools.ant.types.x0(true);
                x1("running " + B2().s() + " with default permissions (exit forbidden)", 3);
            }
            x1("Running in same VM " + B2().o(), 3);
        }
        p3();
    }

    public void p2() {
        B2().f();
    }

    protected void p3() {
        this.f135880v.C(this.f135877s);
        this.f135880v.H(this.f135876r);
        this.f135880v.K(this.f135878t);
        this.f135880v.x(this.f135879u);
        org.apache.tools.ant.types.p1 p1Var = this.f135881w;
        if (p1Var != null) {
            p1Var.h2(this.f135880v);
        }
        if (!this.f135884z && this.f135877s == null && this.f135876r == null) {
            this.f135880v.G(new org.apache.tools.ant.util.t0(b().h0()));
        }
    }

    public org.apache.tools.ant.types.o.a q2() {
        return B2().g();
    }

    public org.apache.tools.ant.types.o0 r2() {
        return B2().h(b()).u2();
    }

    public org.apache.tools.ant.types.o0 s2() {
        return B2().i(b()).u2();
    }

    public org.apache.tools.ant.types.o.a t2() {
        return B2().m();
    }

    public org.apache.tools.ant.types.o0 u2() {
        return B2().k(b()).u2();
    }

    public org.apache.tools.ant.types.x0 v2() {
        org.apache.tools.ant.types.x0 x0Var = this.f135883y;
        if (x0Var == null) {
            x0Var = new org.apache.tools.ant.types.x0();
        }
        this.f135883y = x0Var;
        return x0Var;
    }

    public org.apache.tools.ant.types.o0 w2() {
        return B2().l(b()).u2();
    }

    protected r1 x2() throws BuildException {
        Long l10 = this.f135875q;
        if (l10 == null) {
            return null;
        }
        return new r1(l10.longValue());
    }

    public int y2() throws BuildException {
        return z2(B2());
    }

    protected int z2(CommandlineJava commandlineJava) {
        try {
            if (this.f135871m) {
                if (!this.f135884z) {
                    return A2(commandlineJava.u());
                }
                r3(commandlineJava.u());
                return 0;
            }
            try {
                H2(commandlineJava);
                return 0;
            } catch (ExitException e10) {
                return e10.a();
            }
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (BuildException e12) {
            if (e12.b() == null && w1() != null) {
                e12.c(w1());
            }
            if (this.f135874p) {
                throw e12;
            }
            if (B.equals(e12.getMessage())) {
                log(B);
            } else {
                E2(e12);
            }
            return -1;
        } catch (Throwable th2) {
            if (this.f135874p) {
                throw new BuildException(th2, w1());
            }
            E2(th2);
            return -1;
        }
    }
}
