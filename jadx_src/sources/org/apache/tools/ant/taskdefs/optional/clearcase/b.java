package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCCheckout.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends p {
    public static final String N = "-reserved";
    public static final String O = "-unreserved";
    public static final String P = "-out";
    public static final String Q = "-ndata";
    public static final String R = "-branch";
    public static final String S = "-version";
    public static final String T = "-nwarn";
    public static final String U = "-c";
    public static final String V = "-cfile";
    public static final String W = "-nc";
    private boolean E = true;
    private String F = null;
    private boolean G = false;
    private String H = null;
    private boolean I = false;
    private boolean J = false;
    private String K = null;
    private String L = null;
    private boolean M = true;

    private void A2(org.apache.tools.ant.types.o oVar) {
        if (z2() != null) {
            oVar.h().O1("-cfile");
            oVar.h().O1(z2());
        }
    }

    private void F2(org.apache.tools.ant.types.o oVar) {
        if (E2() != null) {
            oVar.h().O1(P);
            oVar.h().O1(E2());
        }
    }

    private boolean I2() {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        oVar.w(i2());
        oVar.h().O1(p.A);
        oVar.h().O1("-cview");
        oVar.h().O1("-short");
        oVar.h().O1("-d");
        oVar.h().O1(l2());
        String strP2 = p2(oVar, j2());
        return (strP2 == null || strP2.isEmpty()) ? false : true;
    }

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (G2()) {
            oVar.h().O1(N);
        } else {
            oVar.h().O1(O);
        }
        if (E2() != null) {
            F2(oVar);
        } else if (B2()) {
            oVar.h().O1(Q);
        }
        if (v2() != null) {
            w2(oVar);
        } else if (H2()) {
            oVar.h().O1("-version");
        }
        if (C2()) {
            oVar.h().O1("-nwarn");
        }
        if (x2() != null) {
            y2(oVar);
        } else if (z2() != null) {
            A2(oVar);
        } else {
            oVar.h().O1("-nc");
        }
        oVar.h().O1(l2());
    }

    private void w2(org.apache.tools.ant.types.o oVar) {
        if (v2() != null) {
            oVar.h().O1(R);
            oVar.h().O1(v2());
        }
    }

    private void y2(org.apache.tools.ant.types.o oVar) {
        if (x2() != null) {
            oVar.h().O1("-c");
            oVar.h().O1(x2());
        }
    }

    public boolean B2() {
        return this.G;
    }

    public boolean C2() {
        return this.J;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1(p.f134719r);
        u2(oVar);
        if (!D2() && I2()) {
            b().M0("Already checked out in this view: " + m2(), 3);
            return;
        }
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + m2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public boolean D2() {
        return this.M;
    }

    public String E2() {
        return this.F;
    }

    public boolean G2() {
        return this.E;
    }

    public boolean H2() {
        return this.I;
    }

    public void J2(String str) {
        this.H = str;
    }

    public void K2(String str) {
        this.K = str;
    }

    public void L2(String str) {
        this.L = str;
    }

    public void M2(boolean z10) {
        this.G = z10;
    }

    public void N2(boolean z10) {
        this.J = z10;
    }

    public void O2(boolean z10) {
        this.M = z10;
    }

    public void P2(String str) {
        this.F = str;
    }

    public void Q2(boolean z10) {
        this.E = z10;
    }

    public void R2(boolean z10) {
        this.I = z10;
    }

    public String v2() {
        return this.H;
    }

    public String x2() {
        return this.K;
    }

    public String z2() {
        return this.L;
    }
}
