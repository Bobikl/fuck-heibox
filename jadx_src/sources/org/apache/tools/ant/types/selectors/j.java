package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: BaseSelectorContainer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j extends h implements k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<v> f136520i = Collections.synchronizedList(new ArrayList());

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            for (Object obj : this.f136520i) {
                if (obj instanceof org.apache.tools.ant.types.s) {
                    org.apache.tools.ant.types.s.a2((org.apache.tools.ant.types.s) obj, stack, project);
                }
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void L0(a0 a0Var) {
        d0(a0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public v[] N0(Project project) {
        H1();
        List<v> list = this.f136520i;
        return (v[]) list.toArray(new v[list.size()]);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void O0(b0 b0Var) {
        d0(b0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public abstract boolean P0(File file, String str, File file2);

    @Override // org.apache.tools.ant.types.selectors.k0
    public void Q(k kVar) {
        d0(kVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public boolean S0() {
        H1();
        return !this.f136520i.isEmpty();
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void T0(v vVar) {
        d0(vVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void U(l lVar) {
        d0(lVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void U0(p pVar) {
        d0(pVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void V0(x xVar) {
        d0(xVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void X(j0 j0Var) {
        d0(j0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public Enumeration<v> Y() {
        H1();
        return Collections.enumeration(this.f136520i);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void Z(s0 s0Var) {
        d0(s0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void b0(o0 o0Var) {
        d0(o0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void d0(v vVar) {
        this.f136520i.add(vVar);
        b2(false);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void g(h0 h0Var) {
        d0(h0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void g1(w wVar) {
        d0(wVar);
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void i2() {
        j2();
        H1();
        String strE2 = e2();
        if (strE2 != null) {
            throw new BuildException(strE2);
        }
        this.f136520i.stream().filter(new org.apache.tools.ant.types.d(h.class)).map(new a(h.class)).forEach(new b());
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void k0(m mVar) {
        d0(mVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void l(o oVar) {
        d0(oVar);
    }

    public void l2(q qVar) {
        d0(qVar);
    }

    public void m2(e0 e0Var) {
        d0(e0Var);
    }

    public void n2(f0 f0Var) {
        d0(f0Var);
    }

    public void o2(g0 g0Var) {
        d0(g0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public int p1() {
        H1();
        return this.f136520i.size();
    }

    public void p2(i0 i0Var) {
        d0(i0Var);
    }

    public void q2(p0 p0Var) {
        d0(p0Var);
    }

    public void r2(t0 t0Var) {
        d0(t0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void s1(n nVar) {
        d0(nVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void t(s sVar) {
        d0(sVar);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        H1();
        return (String) this.f136520i.stream().map(new Function() { // from class: org.apache.tools.ant.types.selectors.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((v) obj).toString();
            }
        }).collect(Collectors.joining(", "));
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void u0(f fVar) {
        d0(fVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void v0(d0 d0Var) {
        d0(d0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void y(org.apache.tools.ant.types.selectors.modifiedselector.i iVar) {
        d0(iVar);
    }
}
