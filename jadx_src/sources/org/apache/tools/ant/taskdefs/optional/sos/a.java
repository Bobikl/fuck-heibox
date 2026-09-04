package org.apache.tools.ant.taskdefs.optional.sos;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: SOS.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends u2 implements d {
    private static final int B = 255;
    protected o A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135337k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135338l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135339m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135340n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f135341o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135342p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f135343q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135344r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f135345s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f135346t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f135347u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f135348v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f135349w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f135350x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f135351y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f135352z = false;

    protected String A2() {
        return this.f135341o;
    }

    protected int B2(o oVar) {
        try {
            n1 n1Var = new n1(new s3((u2) this, 2, 1));
            n1Var.w(b());
            n1Var.E(b().Z());
            n1Var.x(oVar.s());
            n1Var.D(false);
            return n1Var.e();
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    protected void C2(String str) {
        this.f135347u = str;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        i2();
        if (B2(this.A) != 255) {
            return;
        }
        throw new BuildException("Failed executing: " + this.A.toString(), w1());
    }

    protected void D2(String str) {
        this.f135348v = str;
    }

    protected void E2(String str) {
        this.f135346t = str;
    }

    protected void F2(boolean z10) {
        this.f135351y = z10;
    }

    protected void G2(String str) {
        this.f135345s = str;
    }

    public final void H2(o0 o0Var) {
        this.f135344r = o0Var.toString();
    }

    public final void I2(boolean z10) {
        this.f135350x = z10;
    }

    public final void J2(boolean z10) {
        this.f135349w = z10;
    }

    public final void K2(String str) {
        this.f135339m = str;
    }

    public final void L2(String str) {
        if (str.startsWith("$")) {
            this.f135340n = str;
            return;
        }
        this.f135340n = "$" + str;
    }

    public final void M2(String str) {
        this.f135337k = j0.s0(str);
    }

    public final void N2(String str) {
        this.f135343q = str;
    }

    public final void O2(String str) {
        this.f135342p = str;
    }

    public final void P2(String str) {
        this.f135338l = str;
    }

    public void Q2(boolean z10) {
        this.f135352z = z10;
    }

    public final void R2(String str) {
        this.f135341o = str;
    }

    abstract o i2();

    protected String j2() {
        return this.f135347u;
    }

    protected String k2() {
        return this.f135348v;
    }

    protected String l2() {
        return this.f135346t;
    }

    protected String m2() {
        if (this.f135344r == null) {
            return b().Z().getAbsolutePath();
        }
        File fileW0 = b().W0(this.f135344r);
        if (!fileW0.exists()) {
            if (!(fileW0.mkdirs() || fileW0.isDirectory())) {
                throw new BuildException("Directory " + this.f135344r + " creation was not successful for an unknown reason", w1());
            }
            b().L0("Created dir: " + fileW0.getAbsolutePath());
        }
        return fileW0.getAbsolutePath();
    }

    protected String n2() {
        return this.f135350x ? d.f135362j2 : "";
    }

    protected String o2() {
        return this.f135349w ? d.f135361i2 : "";
    }

    protected void p2() {
        this.A.h().O1(y2());
        this.A.h().O1(o2());
        if (v2() == null) {
            this.A.h().O1(n2());
        } else {
            this.A.h().O1(d.f135364l2);
            this.A.h().O1(v2());
        }
        if (m2() != null) {
            this.A.h().O1(d.f135357e2);
            this.A.h().O1(m2());
        }
    }

    protected String q2() {
        String str = this.f135339m;
        return str == null ? "" : str;
    }

    protected String r2() {
        return this.f135340n;
    }

    protected String s2() {
        return this.f135351y ? d.f135358f2 : "";
    }

    protected void t2() {
        this.A.w(u2());
        if (w2() == null) {
            throw new BuildException("sosserverpath attribute must be set!", w1());
        }
        this.A.h().O1(d.f135363k2);
        this.A.h().O1(w2());
        if (x2() == null) {
            throw new BuildException("username attribute must be set!", w1());
        }
        this.A.h().O1(d.f135354b2);
        this.A.h().O1(x2());
        this.A.h().O1(d.f135355c2);
        this.A.h().O1(q2());
        if (A2() == null) {
            throw new BuildException("vssserverpath attribute must be set!", w1());
        }
        this.A.h().O1(d.f135353a2);
        this.A.h().O1(A2());
        if (r2() == null) {
            throw new BuildException("projectpath attribute must be set!", w1());
        }
        this.A.h().O1(d.f135365m2);
        this.A.h().O1(r2());
    }

    protected String u2() {
        if (this.f135337k == null) {
            return d.P1;
        }
        return this.f135337k + File.separator + d.P1;
    }

    protected String v2() {
        return this.f135343q;
    }

    protected String w2() {
        return this.f135342p;
    }

    protected String x2() {
        return this.f135338l;
    }

    protected String y2() {
        return this.f135352z ? d.f135367o2 : "";
    }

    protected String z2() {
        return this.f135345s;
    }
}
