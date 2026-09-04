package org.apache.tools.ant.taskdefs.optional.testing;

import kotlin.text.y;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.condition.d;
import org.apache.tools.ant.taskdefs.condition.e;
import org.apache.tools.ant.taskdefs.d6;
import org.apache.tools.ant.taskdefs.p4;
import org.apache.tools.ant.taskdefs.p7;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.w2;
import org.apache.tools.ant.v2;

/* JADX INFO: compiled from: Funtest.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends u2 {
    public static final String D = "Overriding previous definition of ";
    public static final String E = "Application forcibly shut down";
    public static final String F = "Shutdown interrupted";
    public static final String G = "Condition failed -skipping tests";
    public static final String H = "Application Exception";
    public static final String I = "Teardown Exception";
    private BuildException A;
    private BuildException B;
    private BuildException C;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C1233b f135370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p4 f135371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d6 f135372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d6 f135373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.optional.testing.a f135374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d6 f135375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d6 f135376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private d6 f135377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f135378s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f135382w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BuildException f135385z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f135379t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f135380u = 10000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f135381v = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f135383x = "Tests failed";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f135384y = true;

    /* JADX INFO: renamed from: org.apache.tools.ant.taskdefs.optional.testing.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Funtest.java */
    public static class C1233b extends e implements d {
        private C1233b() {
        }

        @Override // org.apache.tools.ant.taskdefs.condition.d
        public boolean e() {
            if (a2() == 1) {
                return b2().nextElement().e();
            }
            throw new BuildException("A single nested condition is required.");
        }
    }

    private void G2(u2 u2Var, String str) {
        if (u2Var != null && u2Var.b() == null) {
            throw new BuildException("%s task is not bound to the project %s", str, u2Var);
        }
    }

    private void o2(u2 u2Var) {
        u2Var.B1(this);
        u2Var.V1();
    }

    private void v2(String str, Object obj) {
        if (obj != null) {
            x1("Overriding previous definition of <" + str + y.f128597f, 2);
        }
    }

    private p4 w2(long j10) {
        p4 p4Var = new p4();
        o2(p4Var);
        p4Var.u2(true);
        p4Var.y2(j10);
        return p4Var;
    }

    private p4 x2(long j10, u2 u2Var) {
        p4 p4VarW2 = w2(j10);
        p4VarW2.c1(u2Var);
        return p4VarW2;
    }

    public void A2(String str) {
        this.f135383x = str;
    }

    public void B2(String str) {
        this.f135382w = str;
    }

    public void C2(long j10) {
        this.f135380u = j10;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b4 -> B:55:0x00b6). Please report as a decompilation issue!!! */
    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        G2(this.f135372m, "setup");
        G2(this.f135373n, com.google.android.exoplayer2.util.y.f51568e);
        G2(this.f135375p, "tests");
        G2(this.f135376q, "reporting");
        G2(this.f135377r, "teardown");
        C1233b c1233b = this.f135370k;
        if (c1233b != null && !c1233b.e()) {
            log(G);
            return;
        }
        long j10 = this.f135378s * this.f135379t;
        p4 p4VarW2 = w2(j10);
        w2 w2Var = new w2(p4VarW2, null);
        u2 u2Var = this.f135373n;
        if (u2Var != null) {
            p4VarW2.c1(u2Var);
        }
        long jF2 = 0;
        d6 d6Var = new d6();
        o2(d6Var);
        org.apache.tools.ant.taskdefs.optional.testing.a aVar = this.f135374o;
        if (aVar != null) {
            u2 v2Var = new v2(aVar);
            v2Var.B1(this);
            G2(v2Var, "block");
            d6Var.c1(v2Var);
            jF2 = this.f135374o.f2();
        }
        d6 d6Var2 = this.f135375p;
        if (d6Var2 != null) {
            d6Var.c1(d6Var2);
            jF2 += j10;
        }
        d6 d6Var3 = this.f135376q;
        if (d6Var3 != null) {
            d6Var.c1(d6Var3);
            jF2 += j10;
        }
        this.f135371l = x2(jF2, d6Var);
        try {
            try {
                try {
                    u2 u2Var2 = this.f135372m;
                    if (u2Var2 != null) {
                        x2(j10, u2Var2).D1();
                    }
                    w2Var.start();
                    this.f135371l.D1();
                    u2 u2Var3 = this.f135377r;
                    if (u2Var3 != null) {
                        x2(j10, u2Var3).D1();
                    }
                } catch (Throwable th2) {
                    u2 u2Var4 = this.f135377r;
                    if (u2Var4 != null) {
                        try {
                            x2(j10, u2Var4).D1();
                        } catch (BuildException e10) {
                            this.A = e10;
                        }
                    }
                    throw th2;
                }
            } catch (BuildException e11) {
                this.f135385z = e11;
                u2 u2Var5 = this.f135377r;
                if (u2Var5 != null) {
                    x2(j10, u2Var5).D1();
                }
            }
        } catch (BuildException e12) {
            this.A = e12;
        }
        try {
            long j11 = this.f135380u * this.f135381v;
            w2Var.g(j11);
            if (w2Var.isAlive()) {
                x1(E, 1);
                w2Var.interrupt();
                w2Var.g(j11);
            }
        } catch (InterruptedException e13) {
            X1(F, e13, 3);
        }
        this.B = w2Var.b();
        y2();
    }

    public void D2(p7.a aVar) {
        this.f135381v = aVar.h();
    }

    public void E2(long j10) {
        this.f135378s = j10;
    }

    public void F2(p7.a aVar) {
        this.f135379t = aVar.h();
    }

    public void i2(d6 d6Var) {
        v2(com.google.android.exoplayer2.util.y.f51568e, this.f135373n);
        this.f135373n = d6Var;
    }

    public void j2(org.apache.tools.ant.taskdefs.optional.testing.a aVar) {
        v2("block", this.f135374o);
        this.f135374o = aVar;
    }

    public void k2(d6 d6Var) {
        v2("reporting", this.f135376q);
        this.f135376q = d6Var;
    }

    public void l2(d6 d6Var) {
        v2("setup", this.f135372m);
        this.f135372m = d6Var;
    }

    public void m2(d6 d6Var) {
        v2("teardown", this.f135377r);
        this.f135377r = d6Var;
    }

    public void n2(d6 d6Var) {
        v2("tests", this.f135375p);
        this.f135375p = d6Var;
    }

    public e p2() {
        v2("condition", this.f135370k);
        C1233b c1233b = new C1233b();
        this.f135370k = c1233b;
        return c1233b;
    }

    public BuildException q2() {
        return this.B;
    }

    public BuildException r2() {
        return this.C;
    }

    public BuildException s2() {
        return this.A;
    }

    public BuildException t2() {
        return this.f135385z;
    }

    protected void u2(String str, Throwable th2) {
        X1(str + ": " + th2.toString(), th2, 1);
    }

    protected void y2() {
        BuildException buildException = this.f135385z;
        this.C = buildException;
        BuildException buildException2 = this.B;
        if (buildException2 != null) {
            if (buildException == null || (buildException instanceof BuildTimeoutException)) {
                this.C = buildException2;
            } else {
                u2(H, buildException2);
            }
        }
        BuildException buildException3 = this.A;
        if (buildException3 != null) {
            if (this.C == null && this.f135384y) {
                this.C = buildException3;
            } else {
                u2(I, buildException3);
            }
        }
        if (this.f135382w != null && b().u0(this.f135382w) != null) {
            log(this.f135383x);
            if (this.C == null) {
                this.C = new BuildException(this.f135383x);
            }
        }
        BuildException buildException4 = this.C;
        if (buildException4 != null) {
            throw buildException4;
        }
    }

    public void z2(boolean z10) {
        this.f135384y = z10;
    }
}
