package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.condition.z;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCMkattr.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends p {
    public static final String L = "-replace";
    public static final String M = "-recurse";
    public static final String N = "-version";
    public static final String O = "-c";
    public static final String P = "-cfile";
    public static final String Q = "-nc";
    private boolean E = false;
    private boolean F = false;
    private String G = null;
    private String H = null;
    private String I = null;
    private String J = null;
    private String K = null;

    private void B2(org.apache.tools.ant.types.o oVar) {
        String strC2 = C2();
        if (strC2 != null) {
            oVar.h().O1(strC2);
        }
    }

    private void E2(org.apache.tools.ant.types.o oVar) {
        String str;
        String strD2 = D2();
        if (strD2 != null) {
            if (z.b("windows")) {
                str = "\\\"" + strD2 + "\\\"";
            } else {
                str = "\"" + strD2 + "\"";
            }
            oVar.h().O1(str);
        }
    }

    private void G2(org.apache.tools.ant.types.o oVar) {
        if (F2() != null) {
            oVar.h().O1("-version");
            oVar.h().O1(F2());
        }
    }

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (A2()) {
            oVar.h().O1("-replace");
        }
        if (z2()) {
            oVar.h().O1("-recurse");
        }
        if (F2() != null) {
            G2(oVar);
        }
        if (v2() != null) {
            w2(oVar);
        } else if (x2() != null) {
            y2(oVar);
        } else {
            oVar.h().O1("-nc");
        }
        if (C2() != null) {
            B2(oVar);
        }
        if (D2() != null) {
            E2(oVar);
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
        return this.E;
    }

    public String C2() {
        return this.H;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (C2() == null) {
            throw new BuildException("Required attribute TypeName not specified");
        }
        if (D2() == null) {
            throw new BuildException("Required attribute TypeValue not specified");
        }
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1(p.C);
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + m2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public String D2() {
        return this.I;
    }

    public String F2() {
        return this.G;
    }

    public void H2(String str) {
        this.J = str;
    }

    public void I2(String str) {
        this.K = str;
    }

    public void J2(boolean z10) {
        this.F = z10;
    }

    public void K2(boolean z10) {
        this.E = z10;
    }

    public void L2(String str) {
        this.H = str;
    }

    public void M2(String str) {
        this.I = str;
    }

    public void N2(String str) {
        this.G = str;
    }

    public String v2() {
        return this.J;
    }

    public String x2() {
        return this.K;
    }

    public boolean z2() {
        return this.F;
    }
}
