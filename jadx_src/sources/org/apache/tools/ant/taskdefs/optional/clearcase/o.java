package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCUpdate.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends p {
    public static final String K = "-graphical";
    public static final String L = "-log";
    public static final String M = "-overwrite";
    public static final String N = "-noverwrite";
    public static final String O = "-rename";
    public static final String P = "-ctime";
    public static final String Q = "-ptime";
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private String J = null;

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (w2()) {
            oVar.h().O1(K);
        } else {
            if (z2()) {
                oVar.h().O1(M);
            } else if (B2()) {
                oVar.h().O1(O);
            } else {
                oVar.h().O1(N);
            }
            if (v2()) {
                oVar.h().O1(P);
            } else if (A2()) {
                oVar.h().O1("-ptime");
            }
            y2(oVar);
        }
        oVar.h().O1(l2());
    }

    private void y2(org.apache.tools.ant.types.o oVar) {
        if (x2() == null) {
            return;
        }
        oVar.h().O1("-log");
        oVar.h().O1(x2());
    }

    public boolean A2() {
        return this.I;
    }

    public boolean B2() {
        return this.G;
    }

    public void C2(boolean z10) {
        this.H = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1("update");
        u2(oVar);
        b().M0(oVar.toString(), 4);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + m2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public void D2(boolean z10) {
        this.E = z10;
    }

    public void E2(String str) {
        this.J = str;
    }

    public void F2(boolean z10) {
        this.F = z10;
    }

    public void G2(boolean z10) {
        this.I = z10;
    }

    public void H2(boolean z10) {
        this.G = z10;
    }

    public boolean v2() {
        return this.H;
    }

    public boolean w2() {
        return this.E;
    }

    public String x2() {
        return this.J;
    }

    public boolean z2() {
        return this.F;
    }
}
