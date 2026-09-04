package org.apache.tools.ant.taskdefs.optional.extension;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.q1;

/* JADX INFO: compiled from: ExtensionAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends org.apache.tools.ant.types.s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f135069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.apache.tools.ant.util.f0 f135070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f135071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f135072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.util.f0 f135074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135075m;

    private k e2() {
        return (k) O1(k.class);
    }

    private void n2() throws BuildException {
        if (Y1()) {
            throw d2();
        }
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (this.f135069g != null || this.f135070h != null || this.f135071i != null || this.f135074l != null || this.f135072j != null || this.f135073k != null || this.f135075m != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void f2(String str) {
        n2();
        this.f135069g = str;
    }

    public void g2(String str) {
        n2();
        this.f135075m = str;
    }

    public void h2(String str) {
        n2();
        this.f135073k = str;
    }

    public void i2(String str) {
        n2();
        this.f135072j = str;
    }

    public void j2(String str) {
        n2();
        this.f135074l = new org.apache.tools.ant.util.f0(str);
    }

    public void k2(String str) {
        n2();
        this.f135071i = str;
    }

    public void l2(String str) {
        n2();
        this.f135070h = new org.apache.tools.ant.util.f0(str);
    }

    j m2() throws BuildException {
        if (Y1()) {
            return e2().m2();
        }
        H1();
        if (this.f135069g == null) {
            throw new BuildException("Extension is missing name.");
        }
        org.apache.tools.ant.util.f0 f0Var = this.f135070h;
        String string = f0Var != null ? f0Var.toString() : null;
        org.apache.tools.ant.util.f0 f0Var2 = this.f135074l;
        return new j(this.f135069g, string, this.f135071i, f0Var2 != null ? f0Var2.toString() : null, this.f135073k, this.f135072j, this.f135075m);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return "{" + m2() + z5.g.f141884d;
    }
}
