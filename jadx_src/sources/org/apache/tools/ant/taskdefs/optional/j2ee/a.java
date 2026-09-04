package org.apache.tools.ant.taskdefs.optional.j2ee;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: AbstractHotDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f135147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f135148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f135149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f135150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f135151j;

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.c
    public void b() throws BuildException {
        if (this.f135147f.l2() == null) {
            throw new BuildException("The \"action\" attribute must be set");
        }
        if (!j()) {
            throw new BuildException("Invalid action \"%s\" passed", this.f135147f.l2());
        }
        if (this.f135148g == null) {
            throw new BuildException("The classpath attribute must be set");
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.c
    public void c(e eVar) {
        this.f135147f = eVar;
    }

    public o0 d() {
        if (this.f135148g == null) {
            this.f135148g = new o0(this.f135147f.b());
        }
        return this.f135148g.u2();
    }

    public o0 e() {
        return this.f135148g;
    }

    public String f() {
        return this.f135150i;
    }

    public String g() {
        return this.f135151j;
    }

    protected e h() {
        return this.f135147f;
    }

    public String i() {
        return this.f135149h;
    }

    protected abstract boolean j();

    public void k(o0 o0Var) {
        this.f135148g = o0Var;
    }

    public void l(String str) {
        this.f135150i = str;
    }

    public void m(String str) {
        this.f135151j = str;
    }

    public void n(String str) {
        this.f135149h = str;
    }
}
