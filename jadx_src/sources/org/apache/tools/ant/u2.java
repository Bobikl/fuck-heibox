package org.apache.tools.ant;

import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: Task.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class u2 extends b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    protected t2 f136700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    protected String f136701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    protected String f136702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    protected RuntimeConfigurable f136703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z2 f136705j;

    private z2 H1() {
        if (this.f136705j == null) {
            z2 z2Var = new z2(this.f136702g);
            this.f136705j = z2Var;
            z2Var.J(b());
            this.f136705j.h2(this.f136702g);
            this.f136705j.g2(this.f136701f);
            this.f136705j.A1(w1());
            this.f136705j.e2(this.f136700e);
            this.f136705j.f2(this.f136703h);
            this.f136703h.A(this.f136705j);
            d2(this.f136703h, this.f136705j);
            this.f136700e.t(this, this.f136705j);
            this.f136705j.a2();
        }
        return this.f136705j;
    }

    private void d2(RuntimeConfigurable runtimeConfigurable, z2 z2Var) {
        for (RuntimeConfigurable runtimeConfigurable2 : Collections.list(runtimeConfigurable.i())) {
            z2 z2Var2 = new z2(runtimeConfigurable2.j());
            z2Var.i2(z2Var2);
            z2Var2.J(b());
            z2Var2.f2(runtimeConfigurable2);
            runtimeConfigurable2.A(z2Var2);
            d2(runtimeConfigurable2, z2Var2);
        }
    }

    public final void B1(u2 u2Var) {
        J(u2Var.b());
        e2(u2Var.G1());
        g2(u2Var.K1());
        z1(u2Var.u1());
        A1(u2Var.w1());
        h2(u2Var.L1());
    }

    public void D1() throws BuildException {
    }

    public t2 G1() {
        return this.f136700e;
    }

    public RuntimeConfigurable I1() {
        if (this.f136703h == null) {
            this.f136703h = new RuntimeConfigurable(this, K1());
        }
        return this.f136703h;
    }

    public String K1() {
        return this.f136701f;
    }

    public String L1() {
        return this.f136702g;
    }

    protected RuntimeConfigurable N1() {
        return this.f136703h;
    }

    protected void O1(String str) {
        Q1(str);
    }

    protected void Q1(String str) {
        x1(str, 1);
    }

    protected void R1(String str) {
        U1(str);
    }

    protected int S1(byte[] bArr, int i10, int i11) throws IOException {
        return b().D(bArr, i10, i11);
    }

    protected void U1(String str) {
        x1(str, 2);
    }

    public void V1() throws BuildException {
    }

    protected final boolean W1() {
        return this.f136704i;
    }

    public void X1(String str, Throwable th2, int i10) {
        if (b() == null) {
            super.x1(str, i10);
        } else {
            b().R0(this, str, th2, i10);
        }
    }

    public void Y1(Throwable th2, int i10) {
        if (th2 != null) {
            X1(th2.getMessage(), th2, i10);
        }
    }

    final void Z1() {
        this.f136704i = true;
    }

    public void a2() throws BuildException {
        if (this.f136704i) {
            H1();
            return;
        }
        RuntimeConfigurable runtimeConfigurable = this.f136703h;
        if (runtimeConfigurable != null) {
            runtimeConfigurable.q(b());
        }
    }

    public final void b2() throws Throwable {
        Throwable th2;
        if (this.f136704i) {
            H1().t2().b2();
            return;
        }
        b().Y(this);
        BuildException buildException = null;
        try {
            try {
                try {
                    a2();
                    nj.b.a(this);
                    b().X(this, null);
                } catch (Throwable th3) {
                    th2 = th3;
                    b().X(this, buildException);
                    throw th2;
                }
            } catch (BuildException e10) {
                if (e10.b() == Location.f133036e) {
                    e10.c(w1());
                }
                try {
                    throw e10;
                } catch (Throwable th4) {
                    th2 = th4;
                    buildException = e10;
                    b().X(this, buildException);
                    throw th2;
                }
            }
        } catch (Error e11) {
            throw e11;
        } catch (Exception e12) {
            BuildException buildException2 = new BuildException(e12);
            buildException2.c(w1());
            throw buildException2;
        }
    }

    public void c2() {
        RuntimeConfigurable runtimeConfigurable = this.f136703h;
        if (runtimeConfigurable != null) {
            runtimeConfigurable.s(b());
        }
    }

    public void e2(t2 t2Var) {
        this.f136700e = t2Var;
    }

    public void f2(RuntimeConfigurable runtimeConfigurable) {
        this.f136703h = runtimeConfigurable;
    }

    public void g2(String str) {
        this.f136701f = str;
    }

    public void h2(String str) {
        this.f136702g = str;
    }

    @Override // org.apache.tools.ant.b2
    public void log(String str) {
        x1(str, 2);
    }

    @Override // org.apache.tools.ant.b2
    public void x1(String str, int i10) {
        if (b() == null) {
            super.x1(str, i10);
        } else {
            b().Q0(this, str, i10);
        }
    }
}
