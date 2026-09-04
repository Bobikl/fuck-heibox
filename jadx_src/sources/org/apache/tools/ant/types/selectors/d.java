package org.apache.tools.ant.types.selectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: AbstractSelectorContainer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends org.apache.tools.ant.types.s implements Cloneable, k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<v> f136503g = Collections.synchronizedList(new ArrayList());

    private d m2() {
        return (d) O1(d.class);
    }

    private d n2(Project project) {
        return (d) R1(d.class, U1(), project);
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            for (Object obj : this.f136503g) {
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
        if (Y1()) {
            return n2(project).N0(project);
        }
        K1(project);
        List<v> list = this.f136503g;
        return (v[]) list.toArray(new v[list.size()]);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void O0(b0 b0Var) {
        d0(b0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void Q(k kVar) {
        d0(kVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public boolean S0() {
        if (Y1()) {
            return m2().S0();
        }
        H1();
        return !this.f136503g.isEmpty();
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
        if (Y1()) {
            return m2().Y();
        }
        H1();
        return Collections.enumeration(this.f136503g);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void Z(s0 s0Var) {
        d0(s0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void b0(o0 o0Var) {
        d0(o0Var);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public synchronized Object clone() {
        if (Y1()) {
            return m2().clone();
        }
        try {
            d dVar = (d) super.clone();
            dVar.f136503g = new Vector(this.f136503g);
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    public void d0(v vVar) {
        if (Y1()) {
            throw Z1();
        }
        this.f136503g.add(vVar);
        b2(false);
    }

    public void f2(q qVar) {
        d0(qVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void g(h0 h0Var) {
        d0(h0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void g1(w wVar) {
        d0(wVar);
    }

    public void g2(e0 e0Var) {
        d0(e0Var);
    }

    public void h2(f0 f0Var) {
        d0(f0Var);
    }

    public void i2(g0 g0Var) {
        d0(g0Var);
    }

    public void j2(i0 i0Var) {
        d0(i0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void k0(m mVar) {
        d0(mVar);
    }

    public void k2(p0 p0Var) {
        d0(p0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void l(o oVar) {
        d0(oVar);
    }

    public void l2(t0 t0Var) {
        d0(t0Var);
    }

    public void o2() {
        if (Y1()) {
            m2().o2();
        }
        H1();
        this.f136503g.stream().filter(new org.apache.tools.ant.types.d(h.class)).map(new a(h.class)).forEach(new b());
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public int p1() {
        if (Y1()) {
            return m2().p1();
        }
        H1();
        return this.f136503g.size();
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
        return (String) this.f136503g.stream().map(new Function() { // from class: org.apache.tools.ant.types.selectors.c
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
