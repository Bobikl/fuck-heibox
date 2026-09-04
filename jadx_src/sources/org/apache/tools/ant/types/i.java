package org.apache.tools.ant.types;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: AbstractFileSet.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i extends s implements Cloneable, org.apache.tools.ant.types.selectors.k0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w0 f136166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<w0> f136167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<org.apache.tools.ant.types.selectors.v> f136168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private File f136169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f136170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f136171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f136172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f136173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f136174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f136175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private org.apache.tools.ant.v0 f136176q;

    public i() {
        this.f136166g = new w0();
        this.f136167h = new ArrayList();
        this.f136168i = new ArrayList();
        this.f136171l = true;
        this.f136172m = true;
        this.f136173n = true;
        this.f136174o = true;
        this.f136175p = 5;
        this.f136176q = null;
    }

    protected i(i iVar) {
        this.f136166g = new w0();
        this.f136167h = new ArrayList();
        this.f136168i = new ArrayList();
        this.f136171l = true;
        this.f136172m = true;
        this.f136173n = true;
        this.f136174o = true;
        this.f136175p = 5;
        this.f136176q = null;
        this.f136169j = iVar.f136169j;
        this.f136166g = iVar.f136166g;
        this.f136167h = iVar.f136167h;
        this.f136168i = iVar.f136168i;
        this.f136171l = iVar.f136171l;
        this.f136172m = iVar.f136172m;
        this.f136173n = iVar.f136173n;
        this.f136174o = iVar.f136174o;
        this.f136175p = iVar.f136175p;
        J(iVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean K2(w0 w0Var) {
        return w0Var.u2(b());
    }

    private BuildException w2() {
        return new BuildException("you can only specify one of the dir and file attributes");
    }

    public org.apache.tools.ant.v0 A2() {
        return B2(b());
    }

    public org.apache.tools.ant.v0 B2(Project project) {
        org.apache.tools.ant.v0 v0Var;
        if (Y1()) {
            return E2(project).B2(project);
        }
        H1();
        synchronized (this) {
            if (this.f136176q == null || project != b()) {
                File file = this.f136169j;
                if (file == null) {
                    throw new BuildException("No directory specified for %s.", U1());
                }
                if (!file.exists() && this.f136174o) {
                    throw new BuildException(this.f136169j.getAbsolutePath() + org.apache.tools.ant.v0.I);
                }
                if (!this.f136169j.isDirectory() && this.f136169j.exists()) {
                    throw new BuildException("%s is not a directory.", this.f136169j.getAbsolutePath());
                }
                org.apache.tools.ant.v0 v0Var2 = new org.apache.tools.ant.v0();
                b3(v0Var2, project);
                v0Var2.L0(this.f136173n);
                v0Var2.K0(this.f136174o);
                v0Var2.M0(this.f136175p);
                this.f136176q = project == b() ? v0Var2 : this.f136176q;
                v0Var = v0Var2;
            } else {
                v0Var = this.f136176q;
            }
        }
        v0Var.e();
        return v0Var;
    }

    public boolean C2() {
        return this.f136174o;
    }

    public int D2() {
        return this.f136175p;
    }

    protected i E2(Project project) {
        return (i) R1(i.class, U1(), project);
    }

    public synchronized boolean F2() {
        if (Y1() && b() != null) {
            return E2(b()).F2();
        }
        H1();
        return this.f136166g.u2(b()) || this.f136167h.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.types.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f136164a.K2((w0) obj);
            }
        });
    }

    public synchronized boolean G2() {
        if (Y1()) {
            return E2(b()).G2();
        }
        H1();
        return this.f136172m;
    }

    public synchronized boolean H2() {
        if (Y1()) {
            return E2(b()).G2();
        }
        H1();
        return this.f136173n;
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(final Stack<Object> stack, final Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            final Class<s> cls = s.class;
            this.f136168i.stream().filter(new d(s.class)).map(new Function() { // from class: org.apache.tools.ant.types.e
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (s) cls.cast((org.apache.tools.ant.types.selectors.v) obj);
                }
            }).forEach(new Consumer() { // from class: org.apache.tools.ant.types.f
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    s.a2((s) obj, stack, project);
                }
            });
            this.f136167h.forEach(new Consumer() { // from class: org.apache.tools.ant.types.g
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    s.a2((w0) obj, stack, project);
                }
            });
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void L0(org.apache.tools.ant.types.selectors.a0 a0Var) {
        d0(a0Var);
    }

    public String[] M2(Project project) {
        return O2(project).r2(project);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public synchronized org.apache.tools.ant.types.selectors.v[] N0(Project project) {
        if (Y1()) {
            return E2(b()).N0(project);
        }
        K1(project);
        List<org.apache.tools.ant.types.selectors.v> list = this.f136168i;
        return (org.apache.tools.ant.types.selectors.v[]) list.toArray(new org.apache.tools.ant.types.selectors.v[list.size()]);
    }

    public String[] N2(Project project) {
        return O2(project).s2(project);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void O0(org.apache.tools.ant.types.selectors.b0 b0Var) {
        d0(b0Var);
    }

    public synchronized w0 O2(final Project project) {
        if (Y1()) {
            return E2(project).O2(project);
        }
        H1();
        final w0 w0Var = (w0) this.f136166g.clone();
        this.f136167h.forEach(new Consumer() { // from class: org.apache.tools.ant.types.c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                w0Var.m2((w0) obj, project);
            }
        });
        return w0Var;
    }

    public synchronized void P2(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136172m = z10;
        this.f136176q = null;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void Q(org.apache.tools.ant.types.selectors.k kVar) {
        d0(kVar);
    }

    public synchronized void Q2(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136171l = z10;
        this.f136176q = null;
    }

    public synchronized void R2(File file) throws BuildException {
        if (Y1()) {
            throw d2();
        }
        if (this.f136170k && !y2().equals(file)) {
            throw w2();
        }
        this.f136169j = file;
        this.f136176q = null;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public synchronized boolean S0() {
        if (Y1()) {
            return E2(b()).S0();
        }
        H1();
        return !this.f136168i.isEmpty();
    }

    public void S2(boolean z10) {
        this.f136174o = z10;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void T0(org.apache.tools.ant.types.selectors.v vVar) {
        d0(vVar);
    }

    public synchronized void T2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136166g.C2(str);
        this.f136176q = null;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void U(org.apache.tools.ant.types.selectors.l lVar) {
        d0(lVar);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void U0(org.apache.tools.ant.types.selectors.p pVar) {
        d0(pVar);
    }

    public synchronized void U2(File file) throws BuildException {
        if (Y1()) {
            throw d2();
        }
        this.f136166g.D2(file);
        this.f136176q = null;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void V0(org.apache.tools.ant.types.selectors.x xVar) {
        d0(xVar);
    }

    public synchronized void V2(File file) {
        if (Y1()) {
            throw d2();
        }
        if (this.f136170k) {
            if (y2().equals(file.getParentFile())) {
                String[] strArrS2 = this.f136166g.s2(b());
                if (strArrS2.length == 1 && strArrS2[0].equals(file.getName())) {
                    return;
                }
            }
            throw new BuildException("setFile cannot be called twice with different arguments");
        }
        if (y2() != null) {
            throw w2();
        }
        R2(file.getParentFile());
        this.f136170k = true;
        t2().e(file.getName());
    }

    public synchronized void W2(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136173n = z10;
        this.f136176q = null;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void X(org.apache.tools.ant.types.selectors.j0 j0Var) {
        d0(j0Var);
    }

    public synchronized void X2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136166g.E2(str);
        this.f136176q = null;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public synchronized Enumeration<org.apache.tools.ant.types.selectors.v> Y() {
        if (Y1()) {
            return E2(b()).Y();
        }
        H1();
        return Collections.enumeration(this.f136168i);
    }

    public synchronized void Y2(File file) throws BuildException {
        if (Y1()) {
            throw d2();
        }
        this.f136166g.F2(file);
        this.f136176q = null;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void Z(org.apache.tools.ant.types.selectors.s0 s0Var) {
        d0(s0Var);
    }

    public void Z2(int i10) {
        this.f136175p = i10;
    }

    public void a3(org.apache.tools.ant.h1 h1Var) {
        b3(h1Var, b());
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void b0(org.apache.tools.ant.types.selectors.o0 o0Var) {
        d0(o0Var);
    }

    public synchronized void b3(org.apache.tools.ant.h1 h1Var, Project project) {
        if (Y1()) {
            E2(project).b3(h1Var, project);
            return;
        }
        K1(project);
        if (h1Var == null) {
            throw new IllegalArgumentException("ds cannot be null");
        }
        h1Var.p(this.f136169j);
        w0 w0VarO2 = O2(project);
        project.M0(U1() + ": Setup scanner in dir " + this.f136169j + " with " + w0VarO2, 4);
        h1Var.h(w0VarO2.s2(project));
        h1Var.k(w0VarO2.r2(project));
        if (h1Var instanceof org.apache.tools.ant.types.selectors.l0) {
            ((org.apache.tools.ant.types.selectors.l0) h1Var).d(N0(project));
        }
        if (this.f136171l) {
            h1Var.r();
        }
        h1Var.l(this.f136172m);
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (this.f136169j != null || this.f136166g.u2(b())) {
            throw d2();
        }
        if (!this.f136167h.isEmpty()) {
            throw Z1();
        }
        if (!this.f136168i.isEmpty()) {
            throw Z1();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public synchronized Object clone() {
        if (Y1()) {
            return E2(b()).clone();
        }
        try {
            i iVar = (i) super.clone();
            iVar.f136166g = (w0) this.f136166g.clone();
            final Class<w0> cls = w0.class;
            iVar.f136167h = (List) this.f136167h.stream().map(new Function() { // from class: org.apache.tools.ant.types.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((w0) obj).clone();
                }
            }).map(new Function() { // from class: org.apache.tools.ant.types.b
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (w0) cls.cast(obj);
                }
            }).collect(Collectors.toList());
            iVar.f136168i = new ArrayList(this.f136168i);
            return iVar;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public synchronized void d0(org.apache.tools.ant.types.selectors.v vVar) {
        if (Y1()) {
            throw Z1();
        }
        this.f136168i.add(vVar);
        this.f136176q = null;
        b2(false);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void g(org.apache.tools.ant.types.selectors.h0 h0Var) {
        d0(h0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void g1(org.apache.tools.ant.types.selectors.w wVar) {
        d0(wVar);
    }

    public void i2(org.apache.tools.ant.types.selectors.q qVar) {
        d0(qVar);
    }

    public void j2(org.apache.tools.ant.types.selectors.e0 e0Var) {
        d0(e0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void k0(org.apache.tools.ant.types.selectors.m mVar) {
        d0(mVar);
    }

    public void k2(org.apache.tools.ant.types.selectors.f0 f0Var) {
        d0(f0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void l(org.apache.tools.ant.types.selectors.o oVar) {
        d0(oVar);
    }

    public void l2(org.apache.tools.ant.types.selectors.g0 g0Var) {
        d0(g0Var);
    }

    public void m2(org.apache.tools.ant.types.selectors.i0 i0Var) {
        d0(i0Var);
    }

    public void n2(org.apache.tools.ant.types.selectors.p0 p0Var) {
        d0(p0Var);
    }

    public void o2(org.apache.tools.ant.types.selectors.t0 t0Var) {
        d0(t0Var);
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public synchronized int p1() {
        if (Y1()) {
            return E2(b()).p1();
        }
        H1();
        return this.f136168i.size();
    }

    public synchronized void p2(String[] strArr) {
        if (Y1()) {
            throw d2();
        }
        if (strArr != null) {
            for (String str : strArr) {
                this.f136166g.n2().e(str);
            }
            this.f136176q = null;
        }
    }

    public synchronized void q2(String[] strArr) {
        if (Y1()) {
            throw d2();
        }
        if (strArr != null) {
            for (String str : strArr) {
                this.f136166g.p2().e(str);
            }
            this.f136176q = null;
        }
    }

    public synchronized w0.c r2() {
        if (Y1()) {
            throw Z1();
        }
        this.f136176q = null;
        return this.f136166g.n2();
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void s1(org.apache.tools.ant.types.selectors.n nVar) {
        d0(nVar);
    }

    public synchronized w0.c s2() {
        if (Y1()) {
            throw Z1();
        }
        this.f136176q = null;
        return this.f136166g.o2();
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void t(org.apache.tools.ant.types.selectors.s sVar) {
        d0(sVar);
    }

    public synchronized w0.c t2() {
        if (Y1()) {
            throw Z1();
        }
        this.f136176q = null;
        return this.f136166g.p2();
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        if (Y1()) {
            return E2(b()).toString();
        }
        H1();
        return org.apache.tools.ant.taskdefs.y1.a(";", A2().m());
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void u0(org.apache.tools.ant.types.selectors.f fVar) {
        d0(fVar);
    }

    public synchronized w0.c u2() {
        if (Y1()) {
            throw Z1();
        }
        this.f136176q = null;
        return this.f136166g.q2();
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void v0(org.apache.tools.ant.types.selectors.d0 d0Var) {
        d0(d0Var);
    }

    public synchronized w0 v2() {
        w0 w0Var;
        if (Y1()) {
            throw Z1();
        }
        w0Var = new w0();
        this.f136167h.add(w0Var);
        this.f136176q = null;
        return w0Var;
    }

    public synchronized boolean x2() {
        if (Y1()) {
            return E2(b()).x2();
        }
        H1();
        return this.f136171l;
    }

    @Override // org.apache.tools.ant.types.selectors.k0
    public void y(org.apache.tools.ant.types.selectors.modifiedselector.i iVar) {
        d0(iVar);
    }

    public File y2() {
        return z2(b());
    }

    public synchronized File z2(Project project) {
        if (Y1()) {
            return E2(project).z2(project);
        }
        H1();
        return this.f136169j;
    }
}
