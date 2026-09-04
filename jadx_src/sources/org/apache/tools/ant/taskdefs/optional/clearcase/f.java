package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCMkbl.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends p {
    public static final String L = "-c";
    public static final String M = "-cfile";
    public static final String N = "-nc";
    public static final String O = "-identical";
    public static final String P = "-incremental";
    public static final String Q = "-full";
    public static final String R = "-nlabel";
    private String E = null;
    private String F = null;
    private String G = null;
    private boolean H = false;
    private boolean I = true;
    private boolean J = false;
    private boolean K = false;

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (w2() != null) {
            x2(oVar);
        } else if (y2() != null) {
            z2(oVar);
        } else {
            oVar.h().O1("-nc");
        }
        if (B2()) {
            oVar.h().O1("-identical");
        }
        if (A2()) {
            oVar.h().O1(Q);
        } else {
            oVar.h().O1(P);
        }
        if (C2()) {
            oVar.h().O1(R);
        }
        oVar.h().O1(v2());
    }

    private void x2(org.apache.tools.ant.types.o oVar) {
        if (w2() != null) {
            oVar.h().O1("-c");
            oVar.h().O1(w2());
        }
    }

    private void z2(org.apache.tools.ant.types.o oVar) {
        if (y2() != null) {
            oVar.h().O1("-cfile");
            oVar.h().O1(y2());
        }
    }

    public boolean A2() {
        return this.J;
    }

    public boolean B2() {
        return this.I;
    }

    public boolean C2() {
        return this.K;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1(p.f134724w);
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + v2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public boolean D2() {
        return this.H;
    }

    public void E2(String str) {
        this.G = str;
    }

    public void F2(String str) {
        this.E = str;
    }

    public void G2(String str) {
        this.F = str;
    }

    public void H2(boolean z10) {
        this.J = z10;
    }

    public void I2(boolean z10) {
        this.I = z10;
    }

    public void J2(boolean z10) {
        this.K = z10;
    }

    public void K2(boolean z10) {
        this.H = z10;
    }

    public String v2() {
        return this.G;
    }

    public String w2() {
        return this.E;
    }

    public String y2() {
        return this.F;
    }
}
