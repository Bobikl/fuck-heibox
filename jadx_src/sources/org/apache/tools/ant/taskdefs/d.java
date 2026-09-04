package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: AbstractJarSignerTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends org.apache.tools.ant.u2 {
    public static final String C = "jar must be set through jar attribute or nested filesets";
    protected static final String D = "jarsigner";
    private String A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected File f134022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f134023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f134024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f134025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f134026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f134027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f134028q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f134030s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private org.apache.tools.ant.types.p1 f134032u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f134035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f134036y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f134037z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f134029r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected Vector<org.apache.tools.ant.types.b0> f134031t = new Vector<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private org.apache.tools.ant.types.z f134033v = new org.apache.tools.ant.types.z();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134034w = null;
    private List<org.apache.tools.ant.types.o.a> B = new ArrayList();

    private org.apache.tools.ant.types.p1 r2() {
        org.apache.tools.ant.types.p1 p1Var = new org.apache.tools.ant.types.p1();
        String str = this.f134025n;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('\n');
            String str2 = this.f134027p;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('\n');
            }
            p1Var.x2(sb2.toString());
            p1Var.z2(false);
            org.apache.tools.ant.filters.l lVar = new org.apache.tools.ant.filters.l();
            org.apache.tools.ant.types.r1 r1Var = new org.apache.tools.ant.types.r1();
            r1Var.j2("^(Enter Passphrase for keystore: |Enter key password for .+: )$");
            lVar.i(r1Var);
            lVar.p(true);
            p1Var.j2().o2(lVar);
        }
        return p1Var;
    }

    public void A2(String str) {
        this.f134035x = str;
    }

    public void B2(File file) {
        this.f134022k = file;
    }

    public void C2(String str) {
        this.f134027p = str;
    }

    public void D2(String str) {
        this.f134024m = str;
    }

    public void E2(String str) {
        this.f134030s = str;
    }

    public void F2(String str) {
        this.A = str;
    }

    public void G2(String str) {
        this.f134037z = str;
    }

    public void H2(String str) {
        this.f134036y = str;
    }

    public void I2(String str) {
        this.f134025n = str;
    }

    public void J2(String str) {
        this.f134026o = str;
    }

    public void K2(boolean z10) {
        this.f134029r = z10;
    }

    public void L2(boolean z10) {
        this.f134028q = z10;
    }

    public void i2(org.apache.tools.ant.types.o.a aVar) {
        this.B.add(aVar);
    }

    protected void j2(j1 j1Var, org.apache.tools.ant.types.o.a aVar) {
        j1Var.l2().B1(aVar);
    }

    public void k2(org.apache.tools.ant.types.b0 b0Var) {
        this.f134031t.addElement(b0Var);
    }

    public void l2(org.apache.tools.ant.types.z.a aVar) {
        this.f134033v.b(aVar);
    }

    protected void m2(j1 j1Var, String str) {
        j1Var.l2().O1(str);
    }

    protected void n2() {
        this.f134032u = r2();
    }

    protected void o2(j1 j1Var) {
        if (this.f134024m != null) {
            m2(j1Var, "-keystore");
            File fileW0 = b().W0(this.f134024m);
            m2(j1Var, fileW0.exists() ? fileW0.getPath() : this.f134024m);
        }
        if (this.f134026o != null) {
            m2(j1Var, "-storetype");
            m2(j1Var, this.f134026o);
        }
        if (this.f134036y != null) {
            m2(j1Var, "-providerName");
            m2(j1Var, this.f134036y);
        }
        if (this.f134037z == null) {
            if (this.A != null) {
                log("Ignoring providerArg as providerClass has not been set");
            }
        } else {
            m2(j1Var, "-providerClass");
            m2(j1Var, this.f134037z);
            if (this.A != null) {
                m2(j1Var, "-providerArg");
                m2(j1Var, this.A);
            }
        }
    }

    protected j1 p2() {
        j1 j1Var = new j1(this);
        String str = this.f134035x;
        if (str == null) {
            j1Var.G2(org.apache.tools.ant.util.s0.h(D));
        } else {
            j1Var.G2(str);
        }
        j1Var.h2(D);
        j1Var.I2(true);
        j1Var.i2(this.f134032u);
        return j1Var;
    }

    public org.apache.tools.ant.types.o0 q2() {
        if (this.f134034w == null) {
            this.f134034w = new org.apache.tools.ant.types.o0(b());
        }
        return this.f134034w.u2();
    }

    protected org.apache.tools.ant.types.o0 s2() {
        org.apache.tools.ant.types.o0 o0Var = this.f134034w;
        org.apache.tools.ant.types.o0 o0Var2 = o0Var == null ? new org.apache.tools.ant.types.o0(b()) : (org.apache.tools.ant.types.o0) o0Var.clone();
        Iterator<org.apache.tools.ant.types.b0> it = t2().iterator();
        while (it.hasNext()) {
            o0Var2.f2(it.next());
        }
        return o0Var2;
    }

    protected Vector<org.apache.tools.ant.types.b0> t2() {
        Vector<org.apache.tools.ant.types.b0> vector = new Vector<>(this.f134031t);
        if (this.f134022k != null) {
            org.apache.tools.ant.types.b0 b0Var = new org.apache.tools.ant.types.b0();
            b0Var.J(b());
            b0Var.V2(this.f134022k);
            vector.add(b0Var);
        }
        return vector;
    }

    protected void u2(j1 j1Var, org.apache.tools.ant.types.z.a aVar) throws BuildException {
        m2(j1Var, "-J-D" + aVar.a());
    }

    protected void v2() {
        this.f134032u = null;
    }

    public org.apache.tools.ant.types.p1 w2() {
        return this.f134032u;
    }

    protected boolean x2() {
        return (this.f134034w == null && this.f134031t.isEmpty()) ? false : true;
    }

    public void y2(String str) {
        this.f134023l = str;
    }

    protected void z2(j1 j1Var) {
        if (this.f134030s != null) {
            m2(j1Var, "-J-Xmx" + this.f134030s);
        }
        if (this.f134028q) {
            m2(j1Var, org.apache.tools.ant.taskdefs.optional.sos.d.f135367o2);
        }
        if (this.f134029r) {
            m2(j1Var, "-strict");
        }
        Iterator<org.apache.tools.ant.types.z.a> it = this.f134033v.d().iterator();
        while (it.hasNext()) {
            u2(j1Var, it.next());
        }
        Iterator<org.apache.tools.ant.types.o.a> it2 = this.B.iterator();
        while (it2.hasNext()) {
            j2(j1Var, it2.next());
        }
    }
}
