package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCMklbtype.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends p {
    public static final String N = "-replace";
    public static final String O = "-global";
    public static final String P = "-ordinary";
    public static final String Q = "-pbranch";
    public static final String R = "-shared";
    public static final String S = "-c";
    public static final String T = "-cfile";
    public static final String U = "-nc";
    private String E = null;
    private String F = null;
    private String G = null;
    private String H = null;
    private boolean I = false;
    private boolean J = false;
    private boolean K = true;
    private boolean L = false;
    private boolean M = false;

    private String F2() {
        String strE2 = E2();
        if (G2() == null) {
            return strE2;
        }
        return strE2 + "@" + G2();
    }

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (C2()) {
            oVar.h().O1("-replace");
        }
        if (A2()) {
            oVar.h().O1(P);
        } else if (z2()) {
            oVar.h().O1(O);
        }
        if (B2()) {
            oVar.h().O1(Q);
        }
        if (D2()) {
            oVar.h().O1(R);
        }
        if (v2() != null) {
            w2(oVar);
        } else if (x2() != null) {
            y2(oVar);
        } else {
            oVar.h().O1("-nc");
        }
        oVar.h().O1(F2());
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
        return this.K;
    }

    public boolean B2() {
        return this.L;
    }

    public boolean C2() {
        return this.I;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        if (E2() == null) {
            throw new BuildException("Required attribute TypeName not specified");
        }
        oVar.w(i2());
        oVar.h().O1(p.f134726y);
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + F2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public boolean D2() {
        return this.M;
    }

    public String E2() {
        return this.E;
    }

    public String G2() {
        return this.F;
    }

    public void H2(String str) {
        this.G = str;
    }

    public void I2(String str) {
        this.H = str;
    }

    public void J2(boolean z10) {
        this.J = z10;
    }

    public void K2(boolean z10) {
        this.K = z10;
    }

    public void L2(boolean z10) {
        this.L = z10;
    }

    public void M2(boolean z10) {
        this.I = z10;
    }

    public void N2(boolean z10) {
        this.M = z10;
    }

    public void O2(String str) {
        this.E = str;
    }

    public void P2(String str) {
        this.F = str;
    }

    public String v2() {
        return this.G;
    }

    public String x2() {
        return this.H;
    }

    public boolean z2() {
        return this.J;
    }
}
