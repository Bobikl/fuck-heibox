package org.apache.tools.ant.taskdefs.optional;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.z1;

/* JADX INFO: compiled from: Script.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private z1 f134683k = new z1();

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        this.f134683k.j().j("ANT");
    }

    @Override // org.apache.tools.ant.b2
    public void J(Project project) {
        super.J(project);
        this.f134683k.s(this);
    }

    public void i2(String str) {
        this.f134683k.b(str);
    }

    public o0 j2() {
        return this.f134683k.c();
    }

    public void k2(o0 o0Var) {
        this.f134683k.m(o0Var);
    }

    public void l2(q1 q1Var) {
        this.f134683k.n(q1Var);
    }

    public void m2(String str) {
        this.f134683k.p(str);
    }

    public void n2(String str) {
        this.f134683k.q(str);
    }

    public void o2(String str) {
        this.f134683k.r(str);
    }

    public void p2(boolean z10) {
        this.f134683k.t(z10);
    }

    public void q2(String str) {
        this.f134683k.u(new File(str));
    }
}
