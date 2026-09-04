package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ExecTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class j1 extends org.apache.tools.ant.u2 {
    private static final org.apache.tools.ant.util.j0 G = org.apache.tools.ant.util.j0.O();
    private File A;
    private File B;
    private File C;
    protected org.apache.tools.ant.types.p1 E;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f134305m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f134311s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f134313u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f134318z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f134306n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f134307o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Long f134308p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private org.apache.tools.ant.types.z f134309q = new org.apache.tools.ant.types.z();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected org.apache.tools.ant.types.o f134310r = new org.apache.tools.ant.types.o();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f134312t = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f134314v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f134315w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f134316x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f134317y = false;
    protected i5 D = new i5((org.apache.tools.ant.u2) this);
    private boolean F = true;

    public j1() {
    }

    public j1(org.apache.tools.ant.u2 u2Var) {
        B1(u2Var);
    }

    private String q2(String str) {
        return str.substring(5);
    }

    private String r2(Map<String, String> map) {
        String str = map.get("PATH");
        return str != null ? str : map.get("Path");
    }

    private boolean t2(String str) {
        return str.startsWith("PATH=") || str.startsWith("Path=");
    }

    protected final void A2(n1 n1Var) throws IOException {
        if (this.f134316x) {
            n1Var.F();
            return;
        }
        int iE = n1Var.e();
        if (n1Var.p()) {
            if (this.f134306n) {
                throw new BuildException("Timeout: killed the sub-process");
            }
            x1("Timeout: killed the sub-process", 1);
        }
        w2(iE);
        this.D.e();
        if (n1.o(iE)) {
            if (this.f134306n) {
                throw new BuildException(L1() + " returned: " + iE, w1());
            }
            x1("Result: " + iE, 0);
        }
    }

    public void B2(boolean z10) {
        this.D.t(z10);
        this.f134317y = z10 | this.f134317y;
    }

    public void C2(org.apache.tools.ant.types.o oVar) {
        x1("The command attribute is deprecated.\nPlease use the executable attribute and nested arg elements.", 1);
        this.f134310r = oVar;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (u2()) {
            File file = this.f134305m;
            this.f134310r.w(y2(this.f134313u, this.f134315w));
            k2();
            try {
                z2(x2());
            } finally {
                this.f134305m = file;
            }
        }
    }

    public void D2(File file) {
        this.f134305m = file;
    }

    public void E2(File file) {
        this.C = file;
        this.f134317y = true;
    }

    public void F2(String str) {
        this.D.B(str);
        this.f134317y = true;
    }

    public void G2(String str) {
        this.f134313u = str;
        this.f134310r.w(str);
    }

    public void H2(boolean z10) {
        this.f134312t = z10;
        this.f134317y = z10 | this.f134317y;
    }

    public void I2(boolean z10) {
        this.f134306n = z10;
        this.f134317y = z10 | this.f134317y;
    }

    public void J2(File file) {
        if (this.f134318z != null) {
            throw new BuildException("The \"input\" and \"inputstring\" attributes cannot both be specified");
        }
        this.A = file;
        this.f134317y = true;
    }

    public void K2(String str) {
        if (this.A != null) {
            throw new BuildException("The \"input\" and \"inputstring\" attributes cannot both be specified");
        }
        this.f134318z = str;
        this.f134317y = true;
    }

    public void L2(boolean z10) {
        this.D.I(z10);
        this.f134317y = z10 | this.f134317y;
    }

    public void M2(boolean z10) {
        this.f134307o = z10;
    }

    public void N2(String str) {
        this.f134303k = str;
    }

    public void O2(String str) {
        this.f134304l = str.toLowerCase(Locale.ENGLISH);
    }

    public void P2(File file) {
        this.B = file;
        this.f134317y = true;
    }

    public void Q2(String str) {
        this.D.O(str);
        this.f134317y = true;
    }

    public void R2(boolean z10) {
        this.f134314v = z10;
    }

    public void S2(String str) {
        this.f134311s = str;
        this.f134317y = true;
    }

    public void T2(boolean z10) {
        this.f134315w = z10;
    }

    public void U2(boolean z10) {
        this.f134316x = z10;
    }

    public void V2(Integer num) {
        W2(num == null ? null : Long.valueOf(num.intValue()));
    }

    public void W2(Long l10) {
        this.f134308p = l10;
        this.f134317y = (l10 != null) | this.f134317y;
    }

    public void X2(boolean z10) {
        this.F = z10;
    }

    protected void Y2() {
        this.D.C(this.A);
        this.D.H(this.f134318z);
        this.D.K(this.B);
        this.D.x(this.C);
    }

    public void i2(org.apache.tools.ant.types.p1 p1Var) {
        if (this.E != null) {
            throw new BuildException("cannot have > 1 nested <redirector>s");
        }
        this.E = p1Var;
        this.f134317y = true;
    }

    public void j2(org.apache.tools.ant.types.z.a aVar) {
        this.f134309q.b(aVar);
    }

    protected void k2() throws BuildException {
        if (this.f134310r.t() == null) {
            throw new BuildException("no executable specified", w1());
        }
        File file = this.f134305m;
        if (file != null && !file.exists()) {
            throw new BuildException("The directory " + this.f134305m + " does not exist");
        }
        File file2 = this.f134305m;
        if (file2 != null && !file2.isDirectory()) {
            throw new BuildException(this.f134305m + " is not a directory");
        }
        if (!this.f134316x || !this.f134317y) {
            Y2();
            return;
        }
        b().M0("spawn does not allow attributes related to input, output, error, result", 0);
        b().M0("spawn also does not allow timeout", 0);
        b().M0("finally, spawn is not compatible with a nested I/O <redirector>", 0);
        throw new BuildException("You have used an attribute or nested element which is not compatible with spawn");
    }

    public org.apache.tools.ant.types.o.a l2() {
        return this.f134310r.h();
    }

    protected q1 m2() throws BuildException {
        return this.D.f();
    }

    protected r1 n2() throws BuildException {
        Long l10 = this.f134308p;
        if (l10 == null) {
            return null;
        }
        return new r1(l10.longValue());
    }

    public final String o2() {
        return this.f134303k;
    }

    public final String p2() {
        return this.f134304l;
    }

    public boolean s2() {
        return this.f134314v;
    }

    protected boolean u2() {
        String str = this.f134304l;
        if (str != null && !org.apache.tools.ant.taskdefs.condition.z.b(str)) {
            return false;
        }
        String property = System.getProperty("os.name");
        x1("Current OS is " + property, 3);
        String str2 = this.f134303k;
        if (str2 == null || str2.contains(property)) {
            return true;
        }
        x1("This OS, " + property + " was not found in the specified list of valid OSes: " + this.f134303k, 3);
        return false;
    }

    protected void v2() {
    }

    protected void w2(int i10) {
        if (this.f134311s != null) {
            b().n1(this.f134311s, Integer.toString(i10));
        }
    }

    protected n1 x2() throws BuildException {
        if (this.f134305m == null) {
            this.f134305m = b().Z();
        }
        org.apache.tools.ant.types.p1 p1Var = this.E;
        if (p1Var != null) {
            p1Var.h2(this.D);
        }
        n1 n1Var = new n1(m2(), n2());
        n1Var.w(b());
        n1Var.E(this.f134305m);
        n1Var.D(this.F);
        String[] strArrC = this.f134309q.c();
        if (strArrC != null) {
            for (String str : strArrC) {
                x1("Setting environment variable: " + str, 3);
            }
        }
        n1Var.A(this.f134307o);
        n1Var.y(strArrC);
        return n1Var;
    }

    protected String y2(String str, boolean z10) {
        String strR2;
        if (!this.f134314v) {
            return str;
        }
        File fileW0 = b().W0(str);
        if (fileW0.exists()) {
            return fileW0.getAbsolutePath();
        }
        File file = this.f134305m;
        if (file != null) {
            File fileN0 = G.n0(file, str);
            if (fileN0.exists()) {
                return fileN0.getAbsolutePath();
            }
        }
        if (z10) {
            org.apache.tools.ant.types.o0 o0Var = null;
            String[] strArrC = this.f134309q.c();
            if (strArrC != null) {
                for (String str2 : strArrC) {
                    if (t2(str2)) {
                        o0Var = new org.apache.tools.ant.types.o0(b(), q2(str2));
                        break;
                    }
                }
            }
            if (o0Var == null && (strR2 = r2(n1.h())) != null) {
                o0Var = new org.apache.tools.ant.types.o0(b(), strR2);
            }
            if (o0Var != null) {
                for (String str3 : o0Var.z2()) {
                    File fileN1 = G.n0(new File(str3), str);
                    if (fileN1.exists()) {
                        return fileN1.getAbsolutePath();
                    }
                }
            }
        }
        return str;
    }

    protected void z2(n1 n1Var) throws BuildException {
        x1(this.f134310r.o(), 3);
        n1Var.x(this.f134310r.s());
        try {
            try {
                A2(n1Var);
            } catch (IOException e10) {
                if (this.f134312t) {
                    throw new BuildException("Execute failed: " + e10.toString(), e10, w1());
                }
                x1("Execute failed: " + e10.toString(), 0);
            }
            v2();
        } catch (Throwable th2) {
            v2();
            throw th2;
        }
    }
}
