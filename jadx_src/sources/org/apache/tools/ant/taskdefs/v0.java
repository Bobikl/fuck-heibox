package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: DefBase.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class v0 extends o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ClassLoader f135836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private org.apache.tools.ant.util.i.a f135837n;

    private org.apache.tools.ant.util.i.a q2() {
        if (this.f135837n == null) {
            this.f135837n = org.apache.tools.ant.util.i.g(this);
        }
        return this.f135837n;
    }

    @Override // org.apache.tools.ant.u2
    public void V1() throws BuildException {
        super.V1();
    }

    public org.apache.tools.ant.types.o0 m2() {
        return q2().a();
    }

    protected ClassLoader n2() {
        if (i2() != null && this.f135837n == null) {
            return i2();
        }
        if (this.f135836m == null) {
            ClassLoader classLoaderC = q2().c();
            this.f135836m = classLoaderC;
            ((org.apache.tools.ant.g) classLoaderC).i(org.apache.tools.ant.j1.B);
        }
        return this.f135836m;
    }

    public org.apache.tools.ant.types.o0 o2() {
        return q2().d();
    }

    public String p2() {
        return q2().b();
    }

    public String r2() {
        return q2().b();
    }

    protected boolean s2() {
        return this.f135837n != null;
    }

    public boolean t2() {
        return q2().f();
    }

    public void u2(org.apache.tools.ant.types.o0 o0Var) {
        q2().i(o0Var);
    }

    public void v2(org.apache.tools.ant.types.q1 q1Var) {
        q2().j(q1Var);
    }

    public void w2(org.apache.tools.ant.types.q1 q1Var) {
        q2().k(q1Var);
    }

    @Deprecated
    public void x2(boolean z10) {
        q2().l(z10);
        x1("The reverseloader attribute is DEPRECATED. It will be removed", 1);
    }
}
