package org.apache.tools.ant.types.optional;

import java.io.File;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.b2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.util.x1;
import org.apache.tools.ant.util.z1;

/* JADX INFO: compiled from: AbstractScriptComponent.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z1 f136250e = new z1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x1 f136251f = null;

    public void B1(String str) {
        this.f136250e.b(str);
    }

    public o0 D1() {
        return this.f136250e.c();
    }

    protected void G1(String str) {
        H1().j(str);
    }

    public x1 H1() {
        I1();
        return this.f136251f;
    }

    protected void I1() {
        if (this.f136251f != null) {
            return;
        }
        this.f136250e.s(this);
        this.f136251f = this.f136250e.j();
    }

    @Override // org.apache.tools.ant.b2
    public void J(Project project) {
        super.J(project);
        this.f136250e.s(this);
    }

    public void K1(o0 o0Var) {
        this.f136250e.m(o0Var);
    }

    public void L1(q1 q1Var) {
        this.f136250e.n(q1Var);
    }

    public void N1(String str) {
        this.f136250e.p(str);
    }

    public void O1(String str) {
        this.f136250e.q(str);
    }

    public void Q1(String str) {
        this.f136250e.r(str);
    }

    public void R1(boolean z10) {
        this.f136250e.t(z10);
    }

    public void S1(File file) {
        this.f136250e.u(file);
    }
}
