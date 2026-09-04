package org.apache.tools.ant.types.resources;

import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Files.java */
/* JADX INFO: loaded from: classes5.dex */
public class d0 extends org.apache.tools.ant.types.selectors.d implements org.apache.tools.ant.types.u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.apache.tools.ant.types.w0 f136343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Vector<org.apache.tools.ant.types.w0> f136344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f136346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f136347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.v0 f136348m;

    public d0() {
        this.f136343h = new org.apache.tools.ant.types.w0();
        this.f136344i = new Vector<>();
        this.f136345j = true;
        this.f136346k = true;
        this.f136347l = true;
        this.f136348m = null;
    }

    protected d0(d0 d0Var) {
        this.f136343h = new org.apache.tools.ant.types.w0();
        this.f136344i = new Vector<>();
        this.f136345j = true;
        this.f136346k = true;
        this.f136347l = true;
        this.f136348m = null;
        this.f136343h = d0Var.f136343h;
        this.f136344i = d0Var.f136344i;
        this.f136345j = d0Var.f136345j;
        this.f136346k = d0Var.f136346k;
        this.f136347l = d0Var.f136347l;
        this.f136348m = d0Var.f136348m;
        J(d0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C2(org.apache.tools.ant.types.w0 w0Var) {
        String[] strArrS2 = w0Var.s2(b());
        String[] strArrR2 = w0Var.r2(b());
        return (strArrS2 != null && strArrS2.length > 0) || (strArrR2 != null && strArrR2.length > 0);
    }

    private synchronized void y2() {
        H1();
        if (this.f136348m == null) {
            this.f136348m = new org.apache.tools.ant.v0();
            org.apache.tools.ant.types.w0 w0VarI2 = I2(b());
            this.f136348m.h(w0VarI2.s2(b()));
            this.f136348m.k(w0VarI2.r2(b()));
            this.f136348m.d(N0(b()));
            if (this.f136345j) {
                this.f136348m.r();
            }
            this.f136348m.l(this.f136346k);
            this.f136348m.L0(this.f136347l);
        }
    }

    protected d0 A2() {
        return (d0) O1(d0.class);
    }

    public synchronized boolean B2() {
        if (Y1()) {
            return A2().B2();
        }
        H1();
        return C2(this.f136343h) || this.f136344i.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.types.resources.c0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f136334a.C2((org.apache.tools.ant.types.w0) obj);
            }
        });
    }

    public synchronized boolean D2() {
        return Y1() ? A2().D2() : this.f136346k;
    }

    public synchronized boolean E2() {
        return Y1() ? A2().E2() : this.f136347l;
    }

    public String[] G2(Project project) {
        return I2(project).r2(project);
    }

    public String[] H2(Project project) {
        return I2(project).s2(project);
    }

    public synchronized org.apache.tools.ant.types.w0 I2(final Project project) {
        if (Y1()) {
            return A2().I2(project);
        }
        H1();
        final org.apache.tools.ant.types.w0 w0Var = new org.apache.tools.ant.types.w0();
        w0Var.m2(this.f136343h, project);
        this.f136344i.forEach(new Consumer() { // from class: org.apache.tools.ant.types.resources.b0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                w0Var.m2((org.apache.tools.ant.types.w0) obj, project);
            }
        });
        return w0Var;
    }

    public synchronized void J2(boolean z10) {
        B1();
        this.f136346k = z10;
        this.f136348m = null;
    }

    public synchronized void K2(boolean z10) {
        B1();
        this.f136345j = z10;
        this.f136348m = null;
    }

    public synchronized void L2(String str) {
        B1();
        this.f136343h.C2(str);
        this.f136348m = null;
    }

    public synchronized void M2(File file) throws BuildException {
        B1();
        this.f136343h.D2(file);
        this.f136348m = null;
    }

    public synchronized void N2(boolean z10) {
        B1();
        this.f136347l = z10;
        this.f136348m = null;
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        return true;
    }

    public synchronized void O2(String str) {
        B1();
        this.f136343h.E2(str);
        this.f136348m = null;
    }

    public synchronized void P2(File file) throws BuildException {
        B1();
        this.f136343h.F2(file);
        this.f136348m = null;
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) throws BuildException {
        if (C2(this.f136343h)) {
            throw d2();
        }
        if (!this.f136344i.isEmpty()) {
            throw Z1();
        }
        if (S0()) {
            throw Z1();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.selectors.d, org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public synchronized Object clone() {
        if (Y1()) {
            return A2().clone();
        }
        d0 d0Var = (d0) super.clone();
        d0Var.f136343h = (org.apache.tools.ant.types.w0) this.f136343h.clone();
        d0Var.f136344i = new Vector<>(this.f136344i.size());
        Iterator<org.apache.tools.ant.types.w0> it = this.f136344i.iterator();
        while (it.hasNext()) {
            d0Var.f136344i.add((org.apache.tools.ant.types.w0) it.next().clone());
        }
        return d0Var;
    }

    @Override // org.apache.tools.ant.types.selectors.d, org.apache.tools.ant.types.selectors.k0
    public synchronized void d0(org.apache.tools.ant.types.selectors.v vVar) {
        if (Y1()) {
            throw Z1();
        }
        super.d0(vVar);
        this.f136348m = null;
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return org.apache.tools.ant.types.t1.a(this);
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<org.apache.tools.ant.types.s1> iterator() {
        if (Y1()) {
            return A2().iterator();
        }
        y2();
        this.f136348m.e();
        int iX = this.f136348m.X();
        int iW = this.f136348m.W();
        if (iX + iW == 0) {
            return Collections.emptyIterator();
        }
        a0 a0Var = new a0(b());
        if (iX > 0) {
            a0Var.a(this.f136348m.m());
        }
        if (iW > 0) {
            a0Var.a(this.f136348m.j());
        }
        return a0Var;
    }

    public synchronized void r2(String[] strArr) {
        B1();
        if (strArr != null) {
            for (String str : strArr) {
                this.f136343h.n2().e(str);
            }
            this.f136348m = null;
        }
    }

    public synchronized void s2(String[] strArr) {
        B1();
        if (strArr != null) {
            for (String str : strArr) {
                this.f136343h.p2().e(str);
            }
            this.f136348m = null;
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized int size() {
        if (Y1()) {
            return A2().size();
        }
        y2();
        this.f136348m.e();
        return this.f136348m.X() + this.f136348m.W();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }

    public synchronized org.apache.tools.ant.types.w0.c t2() {
        if (Y1()) {
            throw Z1();
        }
        this.f136348m = null;
        return this.f136343h.n2();
    }

    @Override // org.apache.tools.ant.types.selectors.d, org.apache.tools.ant.types.s
    public String toString() {
        if (Y1()) {
            return A2().toString();
        }
        return isEmpty() ? "" : (String) stream().map(new b()).collect(Collectors.joining(File.pathSeparator));
    }

    public synchronized org.apache.tools.ant.types.w0.c u2() {
        if (Y1()) {
            throw Z1();
        }
        this.f136348m = null;
        return this.f136343h.o2();
    }

    public synchronized org.apache.tools.ant.types.w0.c v2() {
        if (Y1()) {
            throw Z1();
        }
        this.f136348m = null;
        return this.f136343h.p2();
    }

    public synchronized org.apache.tools.ant.types.w0.c w2() {
        if (Y1()) {
            throw Z1();
        }
        this.f136348m = null;
        return this.f136343h.q2();
    }

    public synchronized org.apache.tools.ant.types.w0 x2() {
        org.apache.tools.ant.types.w0 w0Var;
        if (Y1()) {
            throw Z1();
        }
        w0Var = new org.apache.tools.ant.types.w0();
        this.f136344i.addElement(w0Var);
        this.f136348m = null;
        b2(false);
        return w0Var;
    }

    public synchronized boolean z2() {
        return Y1() ? A2().z2() : this.f136345j;
    }
}
