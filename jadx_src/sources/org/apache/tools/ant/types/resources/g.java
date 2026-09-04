package org.apache.tools.ant.types.resources;

import java.io.File;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ArchiveResource.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g extends org.apache.tools.ant.types.s1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f136366t = org.apache.tools.ant.types.s1.j2("null archive".getBytes());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f136367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f136368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f136369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f136370s;

    protected g() {
        this.f136368q = false;
        this.f136369r = false;
        this.f136370s = 0;
    }

    protected g(File file) {
        this(file, false);
    }

    protected g(File file, boolean z10) {
        this.f136368q = false;
        this.f136369r = false;
        this.f136370s = 0;
        C2(file);
        this.f136368q = z10;
    }

    protected g(org.apache.tools.ant.types.s1 s1Var, boolean z10) {
        this.f136368q = false;
        this.f136369r = false;
        this.f136370s = 0;
        w2(s1Var);
        this.f136368q = z10;
    }

    public int A2() {
        if (Y1()) {
            return m2().A2();
        }
        x2();
        return this.f136370s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: B2, reason: merged with bridge method [inline-methods] */
    public g m2() {
        return (g) O1(g.class);
    }

    public void C2(File file) {
        B1();
        this.f136367p = new z(file);
    }

    public void D2(int i10) {
        B1();
        this.f136370s = i10;
        this.f136369r = true;
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            org.apache.tools.ant.types.s1 s1Var = this.f136367p;
            if (s1Var != null) {
                org.apache.tools.ant.types.s.a2(s1Var, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136367p != null || this.f136369r) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Y1()) {
            return m2().equals(obj);
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        g gVar = (g) obj;
        return z2().equals(gVar.z2()) && k2().equals(gVar.k2());
    }

    @Override // org.apache.tools.ant.types.s1, java.lang.Comparable
    /* JADX INFO: renamed from: g2 */
    public int compareTo(org.apache.tools.ant.types.s1 s1Var) {
        if (equals(s1Var)) {
            return 0;
        }
        return super.compareTo(s1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public int hashCode() {
        return super.hashCode() * (z2() == null ? f136366t : z2().hashCode());
    }

    @Override // org.apache.tools.ant.types.s1
    public long i2() {
        if (Y1()) {
            return m2().i2();
        }
        x2();
        return super.i2();
    }

    @Override // org.apache.tools.ant.types.s1
    public long n2() {
        if (Y1()) {
            return m2().n2();
        }
        x2();
        return super.n2();
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean o2() {
        if (Y1()) {
            return m2().o2();
        }
        x2();
        return super.o2();
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean p2() {
        if (Y1()) {
            return m2().p2();
        }
        x2();
        return super.p2();
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public String toString() {
        if (Y1()) {
            return m2().toString();
        }
        return z2().toString() + ':' + k2();
    }

    public void w2(org.apache.tools.ant.types.u1 u1Var) {
        D1();
        if (this.f136367p != null) {
            throw new BuildException("you must not specify more than one archive");
        }
        if (u1Var.size() != 1) {
            throw new BuildException("only single argument resource collections are supported as archives");
        }
        this.f136367p = u1Var.iterator().next();
    }

    protected final synchronized void x2() throws BuildException {
        H1();
        if (this.f136368q) {
            return;
        }
        if (k2() == null) {
            throw new BuildException("entry name not set");
        }
        org.apache.tools.ant.types.s1 s1VarZ2 = z2();
        if (s1VarZ2 == null) {
            throw new BuildException("archive attribute not set");
        }
        if (!s1VarZ2.p2()) {
            throw new BuildException("%s does not exist.", s1VarZ2);
        }
        if (s1VarZ2.o2()) {
            throw new BuildException("%s denotes a directory.", s1VarZ2);
        }
        y2();
        this.f136368q = true;
    }

    protected abstract void y2();

    public org.apache.tools.ant.types.s1 z2() {
        return Y1() ? m2().z2() : this.f136367p;
    }
}
