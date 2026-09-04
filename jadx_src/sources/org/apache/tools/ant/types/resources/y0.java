package org.apache.tools.ant.types.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ResourceDecorator.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y0 extends org.apache.tools.ant.types.s1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f136481p;

    protected y0() {
    }

    protected y0(org.apache.tools.ant.types.u1 u1Var) {
        w2(u1Var);
    }

    @Override // org.apache.tools.ant.types.s
    protected void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            org.apache.tools.ant.types.s.a2(this.f136481p, stack, project);
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.u1
    public boolean O() {
        return e2(y.class) != null;
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136481p != null) {
            throw Z1();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public <T> T e2(Class<T> cls) {
        return (T) x2().e2(cls);
    }

    @Override // org.apache.tools.ant.types.s1, java.lang.Comparable
    /* JADX INFO: renamed from: g2 */
    public int compareTo(org.apache.tools.ant.types.s1 s1Var) {
        if (s1Var == this) {
            return 0;
        }
        return s1Var instanceof y0 ? x2().compareTo(((y0) s1Var).x2()) : x2().compareTo(s1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public InputStream h2() throws IOException {
        return x2().h2();
    }

    @Override // org.apache.tools.ant.types.s1
    public int hashCode() {
        return (getClass().hashCode() << 4) | x2().hashCode();
    }

    @Override // org.apache.tools.ant.types.s1
    public long i2() {
        return x2().i2();
    }

    @Override // org.apache.tools.ant.types.s1
    public String k2() {
        return x2().k2();
    }

    @Override // org.apache.tools.ant.types.s1
    public OutputStream l2() throws IOException {
        return x2().l2();
    }

    @Override // org.apache.tools.ant.types.s1
    public long n2() {
        return x2().n2();
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean o2() {
        return x2().o2();
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean p2() {
        return x2().p2();
    }

    @Override // org.apache.tools.ant.types.s1
    public void q2(boolean z10) throws BuildException {
        throw new BuildException("you can't change the directory state of a " + U1());
    }

    @Override // org.apache.tools.ant.types.s1
    public void r2(boolean z10) {
        throw new BuildException("you can't change the exists state of a " + U1());
    }

    @Override // org.apache.tools.ant.types.s1
    public void s2(long j10) throws BuildException {
        throw new BuildException("you can't change the timestamp of a " + U1());
    }

    @Override // org.apache.tools.ant.types.s1
    public void t2(String str) throws BuildException {
        throw new BuildException("you can't change the name of a " + U1());
    }

    @Override // org.apache.tools.ant.types.s1
    public void u2(long j10) throws BuildException {
        throw new BuildException("you can't change the size of a " + U1());
    }

    public final void w2(org.apache.tools.ant.types.u1 u1Var) {
        D1();
        if (this.f136481p != null) {
            throw new BuildException("you must not specify more than one resource");
        }
        if (u1Var.size() != 1) {
            throw new BuildException("only single argument resource collections are supported");
        }
        b2(false);
        this.f136481p = u1Var.iterator().next();
    }

    protected final org.apache.tools.ant.types.s1 x2() {
        if (Y1()) {
            return (org.apache.tools.ant.types.s1) O1(org.apache.tools.ant.types.s1.class);
        }
        if (this.f136481p == null) {
            throw new BuildException("no resource specified");
        }
        H1();
        return this.f136481p;
    }
}
