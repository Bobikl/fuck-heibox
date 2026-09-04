package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.util.Enumeration;
import java.util.StringTokenizer;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: MatchingTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h4 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.types.selectors.k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected org.apache.tools.ant.types.b0 f134236k = new org.apache.tools.ant.types.b0();

    @Override // org.apache.tools.ant.b2
    public void J(Project project) {
        super.J(project);
        this.f134236k.J(project);
    }

    public void L0(org.apache.tools.ant.types.selectors.a0 a0Var) {
        this.f134236k.L0(a0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public org.apache.tools.ant.types.selectors.v[] N0(Project project) {
        return this.f134236k.N0(project);
    }

    public void O0(org.apache.tools.ant.types.selectors.b0 b0Var) {
        this.f134236k.O0(b0Var);
    }

    public void Q(org.apache.tools.ant.types.selectors.k kVar) {
        this.f134236k.Q(kVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public boolean S0() {
        return this.f134236k.S0();
    }

    public void T0(org.apache.tools.ant.types.selectors.v vVar) {
        this.f134236k.T0(vVar);
    }

    public void U(org.apache.tools.ant.types.selectors.l lVar) {
        this.f134236k.U(lVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void U0(org.apache.tools.ant.types.selectors.p pVar) {
        this.f134236k.U0(pVar);
    }

    public void V0(org.apache.tools.ant.types.selectors.x xVar) {
        this.f134236k.V0(xVar);
    }

    public void X(org.apache.tools.ant.types.selectors.j0 j0Var) {
        this.f134236k.X(j0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public Enumeration<org.apache.tools.ant.types.selectors.v> Y() {
        return this.f134236k.Y();
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void Z(org.apache.tools.ant.types.selectors.s0 s0Var) {
        this.f134236k.Z(s0Var);
    }

    public void b0(org.apache.tools.ant.types.selectors.o0 o0Var) {
        this.f134236k.b0(o0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void d0(org.apache.tools.ant.types.selectors.v vVar) {
        this.f134236k.d0(vVar);
    }

    public void g(org.apache.tools.ant.types.selectors.h0 h0Var) {
        this.f134236k.g(h0Var);
    }

    public void g1(org.apache.tools.ant.types.selectors.w wVar) {
        this.f134236k.g1(wVar);
    }

    public void i2(String str) {
        x1("The ignore attribute is deprecated.Please use the excludes attribute.", 1);
        if (str == null || str.isEmpty()) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ", false);
        while (stringTokenizer.hasMoreTokens()) {
            k2().e("**/" + stringTokenizer.nextToken().trim() + "/**");
        }
    }

    public void j2(String str) {
        x1("The items attribute is deprecated. Please use the includes attribute.", 1);
        if (str == null || androidx.webkit.b.f28327e.equals(str) || ".".equals(str)) {
            m2().e(org.apache.tools.ant.types.selectors.m0.f136554a);
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ");
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (!strTrim.isEmpty()) {
                m2().e(strTrim + "/**");
            }
        }
    }

    public void k0(org.apache.tools.ant.types.selectors.m mVar) {
        this.f134236k.k0(mVar);
    }

    public org.apache.tools.ant.types.w0.c k2() {
        return this.f134236k.r2();
    }

    public void l(org.apache.tools.ant.types.selectors.o oVar) {
        this.f134236k.l(oVar);
    }

    public org.apache.tools.ant.types.w0.c l2() {
        return this.f134236k.s2();
    }

    public org.apache.tools.ant.types.w0.c m2() {
        return this.f134236k.t2();
    }

    public org.apache.tools.ant.types.w0.c n2() {
        return this.f134236k.u2();
    }

    public org.apache.tools.ant.types.w0 o2() {
        return this.f134236k.v2();
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public int p1() {
        return this.f134236k.p1();
    }

    protected org.apache.tools.ant.v0 p2(File file) {
        this.f134236k.R2(file);
        return this.f134236k.B2(b());
    }

    protected final org.apache.tools.ant.types.b0 q2() {
        return this.f134236k;
    }

    public void r2(boolean z10) {
        this.f134236k.P2(z10);
    }

    public void s1(org.apache.tools.ant.types.selectors.n nVar) {
        this.f134236k.s1(nVar);
    }

    public void s2(boolean z10) {
        this.f134236k.Q2(z10);
    }

    public void t(org.apache.tools.ant.types.selectors.s sVar) {
        this.f134236k.t(sVar);
    }

    public void t2(String str) {
        this.f134236k.T2(str);
    }

    public void u0(org.apache.tools.ant.types.selectors.f fVar) {
        this.f134236k.u0(fVar);
    }

    public void u2(File file) {
        this.f134236k.U2(file);
    }

    public void v0(org.apache.tools.ant.types.selectors.d0 d0Var) {
        this.f134236k.v0(d0Var);
    }

    public void v2(boolean z10) {
        this.f134236k.W2(z10);
    }

    public void w2(String str) {
        this.f134236k.X2(str);
    }

    public void x2(File file) {
        this.f134236k.Y2(file);
    }

    public void y(org.apache.tools.ant.types.selectors.modifiedselector.i iVar) {
        this.f134236k.y(iVar);
    }
}
