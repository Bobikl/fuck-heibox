package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCCheckin.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends p {
    public static final String K = "-c";
    public static final String L = "-cfile";
    public static final String M = "-nc";
    public static final String N = "-nwarn";
    public static final String O = "-ptime";
    public static final String P = "-keep";
    public static final String Q = "-identical";
    private String E = null;
    private String F = null;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private boolean J = true;

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (v2() != null) {
            w2(oVar);
        } else if (x2() != null) {
            y2(oVar);
        } else {
            oVar.h().O1("-nc");
        }
        if (B2()) {
            oVar.h().O1("-nwarn");
        }
        if (C2()) {
            oVar.h().O1("-ptime");
        }
        if (A2()) {
            oVar.h().O1("-keep");
        }
        if (z2()) {
            oVar.h().O1("-identical");
        }
        oVar.h().O1(l2());
    }

    private void w2(org.apache.tools.ant.types.o oVar) {
        if (v2() != null) {
            oVar.h().O1("-c");
            oVar.h().O1(v2());
        }
    }

    private void y2(org.apache.tools.ant.types.o oVar) {
        if (x2() != null) {
            oVar.h().O1("-cfile");
            oVar.h().O1(x2());
        }
    }

    public boolean A2() {
        return this.I;
    }

    public boolean B2() {
        return this.G;
    }

    public boolean C2() {
        return this.H;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1(p.f134720s);
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + m2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public void D2(String str) {
        this.E = str;
    }

    public void E2(String str) {
        this.F = str;
    }

    public void F2(boolean z10) {
        this.J = z10;
    }

    public void G2(boolean z10) {
        this.I = z10;
    }

    public void H2(boolean z10) {
        this.G = z10;
    }

    public void I2(boolean z10) {
        this.H = z10;
    }

    public String v2() {
        return this.E;
    }

    public String x2() {
        return this.F;
    }

    public boolean z2() {
        return this.J;
    }
}
