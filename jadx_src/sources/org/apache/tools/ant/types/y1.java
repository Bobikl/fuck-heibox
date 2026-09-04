package org.apache.tools.ant.types;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: TarFileSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class y1 extends k {
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private String K;
    private String L;
    private int M;
    private int N;

    public y1() {
        this.K = "";
        this.L = "";
    }

    protected y1(b0 b0Var) {
        super(b0Var);
        this.K = "";
        this.L = "";
    }

    protected y1(y1 y1Var) {
        super((k) y1Var);
        this.K = "";
        this.L = "";
    }

    private void F3() {
        if (b() == null || (Y1() && (V1().d(b()) instanceof y1))) {
            B1();
        }
    }

    @Override // org.apache.tools.ant.types.b0, org.apache.tools.ant.types.i
    protected i E2(Project project) {
        K1(project);
        Object objD = V1().d(project);
        if (objD instanceof y1) {
            return (i) objD;
        }
        if (objD instanceof b0) {
            y1 y1Var = new y1((b0) objD);
            f3(y1Var);
            return y1Var;
        }
        throw new BuildException(V1().b() + " doesn't denote a tarfileset or a fileset");
    }

    public int G3() {
        return Y1() ? ((y1) p3()).G3() : this.N;
    }

    public String H3() {
        return Y1() ? ((y1) p3()).H3() : this.L;
    }

    public int I3() {
        return Y1() ? ((y1) p3()).I3() : this.M;
    }

    public String J3() {
        return Y1() ? ((y1) p3()).J3() : this.K;
    }

    public boolean K3() {
        return this.H;
    }

    public boolean L3() {
        return this.J;
    }

    public boolean M3() {
        return this.I;
    }

    public boolean N3() {
        return this.G;
    }

    public void O3(int i10) {
        F3();
        this.J = true;
        this.N = i10;
    }

    public void P3(String str) {
        F3();
        this.H = true;
        this.L = str;
    }

    public void Q3(int i10) {
        F3();
        this.I = true;
        this.M = i10;
    }

    public void R3(String str) {
        F3();
        this.G = true;
        this.K = str;
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (this.G || this.I || this.H || this.J) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.k, org.apache.tools.ant.types.b0, org.apache.tools.ant.types.i, org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        return Y1() ? p3().clone() : super.clone();
    }

    @Override // org.apache.tools.ant.types.k
    protected void f3(k kVar) {
        super.f3(kVar);
        if (kVar instanceof y1) {
            y1 y1Var = (y1) kVar;
            y1Var.R3(this.K);
            y1Var.P3(this.L);
            y1Var.Q3(this.M);
            y1Var.O3(this.N);
        }
    }

    @Override // org.apache.tools.ant.types.k
    protected i p3() {
        return E2(b());
    }

    @Override // org.apache.tools.ant.types.k
    protected l w3() {
        z1 z1Var = new z1();
        z1Var.V0(i3());
        return z1Var;
    }
}
