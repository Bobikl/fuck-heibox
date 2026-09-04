package org.apache.tools.ant.types.optional;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.filters.z;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.util.x1;
import org.apache.tools.ant.util.z1;

/* JADX INFO: compiled from: ScriptFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends z.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z1 f136253f = new z1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x1 f136254g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f136255h;

    private void I1() throws BuildException {
        if (this.f136254g != null) {
            return;
        }
        this.f136254g = this.f136253f.j();
    }

    @Override // org.apache.tools.ant.filters.z.f
    public String A0(String str) {
        I1();
        U1(str);
        this.f136254g.j("ant_filter");
        return H1();
    }

    public void D1(String str) {
        this.f136253f.b(str);
    }

    public o0 G1() {
        return this.f136253f.c();
    }

    public String H1() {
        return this.f136255h;
    }

    @Override // org.apache.tools.ant.b2
    public void J(Project project) {
        super.J(project);
        this.f136253f.s(this);
    }

    public void K1(o0 o0Var) {
        this.f136253f.m(o0Var);
    }

    public void L1(q1 q1Var) {
        this.f136253f.n(q1Var);
    }

    public void N1(String str) {
        this.f136253f.p(str);
    }

    public void O1(String str) {
        this.f136253f.q(str);
    }

    public void Q1(String str) {
        this.f136253f.r(str);
    }

    public void R1(boolean z10) {
        this.f136253f.t(z10);
    }

    public void S1(File file) {
        this.f136253f.u(file);
    }

    public void U1(String str) {
        this.f136255h = str;
    }
}
