package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCMkelem.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends p {
    public static final String M = "-c";
    public static final String N = "-cfile";
    public static final String O = "-nc";
    public static final String P = "-nwarn";
    public static final String Q = "-ptime";
    public static final String R = "-nco";
    public static final String S = "-ci";
    public static final String T = "-master";
    public static final String U = "-eltype";
    private String E = null;
    private String F = null;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    private String L = null;

    private void B2(org.apache.tools.ant.types.o oVar) {
        if (A2() != null) {
            oVar.h().O1(U);
            oVar.h().O1(A2());
        }
    }

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (w2() != null) {
            x2(oVar);
        } else if (y2() != null) {
            z2(oVar);
        } else {
            oVar.h().O1("-nc");
        }
        if (E2()) {
            oVar.h().O1("-nwarn");
        }
        if (D2() && v2()) {
            throw new BuildException("Should choose either [nocheckout | checkin]");
        }
        if (D2()) {
            oVar.h().O1("-nco");
        }
        if (v2()) {
            oVar.h().O1(S);
            if (F2()) {
                oVar.h().O1("-ptime");
            }
        }
        if (C2()) {
            oVar.h().O1(T);
        }
        if (A2() != null) {
            B2(oVar);
        }
        oVar.h().O1(l2());
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

    public String A2() {
        return this.L;
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
        oVar.h().O1(p.B);
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + m2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public boolean D2() {
        return this.I;
    }

    public boolean E2() {
        return this.G;
    }

    public boolean F2() {
        return this.H;
    }

    public void G2(boolean z10) {
        this.J = z10;
    }

    public void H2(String str) {
        this.E = str;
    }

    public void I2(String str) {
        this.F = str;
    }

    public void J2(String str) {
        this.L = str;
    }

    public void K2(boolean z10) {
        this.K = z10;
    }

    public void L2(boolean z10) {
        this.I = z10;
    }

    public void M2(boolean z10) {
        this.G = z10;
    }

    public void N2(boolean z10) {
        this.H = z10;
    }

    public boolean v2() {
        return this.J;
    }

    public String w2() {
        return this.E;
    }

    public String y2() {
        return this.F;
    }
}
