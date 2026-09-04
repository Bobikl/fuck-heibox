package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCRmtype.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends p {
    public static final String L = "-ignore";
    public static final String M = "-rmall";
    public static final String N = "-force";
    public static final String O = "-c";
    public static final String P = "-cfile";
    public static final String Q = "-nc";
    private String E = null;
    private String F = null;
    private String G = null;
    private String H = null;
    private String I = null;
    private boolean J = false;
    private boolean K = false;

    private String D2() {
        String str = B2() + ":" + C2();
        if (E2() == null) {
            return str;
        }
        return str + "@" + E2();
    }

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (z2()) {
            oVar.h().O1(L);
        }
        if (A2()) {
            oVar.h().O1(M);
            oVar.h().O1(N);
        }
        if (v2() != null) {
            w2(oVar);
        } else if (x2() != null) {
            y2(oVar);
        } else {
            oVar.h().O1("-nc");
        }
        oVar.h().O1(D2());
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
        return this.J;
    }

    public String B2() {
        return this.E;
    }

    public String C2() {
        return this.F;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        if (B2() == null) {
            throw new BuildException("Required attribute TypeKind not specified");
        }
        if (C2() == null) {
            throw new BuildException("Required attribute TypeName not specified");
        }
        oVar.w(i2());
        oVar.h().O1(p.f134727z);
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + D2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public String E2() {
        return this.G;
    }

    public void F2(String str) {
        this.H = str;
    }

    public void G2(String str) {
        this.I = str;
    }

    public void H2(boolean z10) {
        this.K = z10;
    }

    public void I2(boolean z10) {
        this.J = z10;
    }

    public void J2(String str) {
        this.E = str;
    }

    public void K2(String str) {
        this.F = str;
    }

    public void L2(String str) {
        this.G = str;
    }

    public String v2() {
        return this.H;
    }

    public String x2() {
        return this.I;
    }

    public boolean z2() {
        return this.K;
    }
}
