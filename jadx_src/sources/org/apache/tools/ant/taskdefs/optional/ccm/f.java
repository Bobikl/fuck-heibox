package org.apache.tools.ant.taskdefs.optional.ccm;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: CCMReconfigure.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f134701v = "/recurse";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f134702w = "/verbose";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f134703x = "/project";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f134704s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f134705t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f134706u = false;

    public f() {
        m2(g.f134711q);
    }

    private void o2(o oVar) {
        if (q2()) {
            oVar.h().O1(f134701v);
        }
        if (r2()) {
            oVar.h().O1(f134702w);
        }
        if (p2() != null) {
            oVar.h().O1(f134703x);
            oVar.h().O1(p2());
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        o oVar = new o();
        oVar.w(j2());
        oVar.h().O1(i2());
        o2(oVar);
        if (n1.o(k2(oVar))) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public String p2() {
        return this.f134704s;
    }

    public boolean q2() {
        return this.f134705t;
    }

    public boolean r2() {
        return this.f134706u;
    }

    public void s2(String str) {
        this.f134704s = str;
    }

    public void t2(boolean z10) {
        this.f134705t = z10;
    }

    public void u2(boolean z10) {
        this.f134706u = z10;
    }
}
