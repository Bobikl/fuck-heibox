package org.apache.tools.ant.taskdefs.optional.j2ee;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: GenericHotDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f135152m = {c.f135156b};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v2 f135153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135154l;

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.c
    public void a() throws BuildException {
        this.f135153k.K2(this.f135154l);
        this.f135153k.L2(e());
        this.f135153k.S2(true);
        this.f135153k.R2(true);
        this.f135153k.D1();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.a, org.apache.tools.ant.taskdefs.optional.j2ee.c
    public void b() throws BuildException {
        super.b();
        if (this.f135154l == null) {
            throw new BuildException("The classname attribute must be set");
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.a, org.apache.tools.ant.taskdefs.optional.j2ee.c
    public void c(e eVar) {
        super.c(eVar);
        this.f135153k = new v2(eVar);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.a
    protected boolean j() {
        return h().l2().equals(f135152m[0]);
    }

    public o.a o() {
        return this.f135153k.q2();
    }

    public o.a p() {
        return this.f135153k.t2();
    }

    public String q() {
        return this.f135154l;
    }

    public v2 r() {
        return this.f135153k;
    }

    public void s(String str) {
        this.f135154l = str;
    }
}
