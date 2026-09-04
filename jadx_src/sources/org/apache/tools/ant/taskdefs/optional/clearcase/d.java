package org.apache.tools.ant.taskdefs.optional.clearcase;

import java.util.Optional;
import java.util.function.Supplier;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCLock.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends p {
    public static final String K = "-replace";
    public static final String L = "-nusers";
    public static final String M = "-obsolete";
    public static final String N = "-comment";
    public static final String O = "-pname";
    private boolean E = false;
    private boolean F = false;
    private String G = null;
    private String H = null;
    private String I = null;
    private String J = null;

    private String B2() {
        return (String) Optional.ofNullable(C2()).orElseGet(new Supplier() { // from class: org.apache.tools.ant.taskdefs.optional.clearcase.c
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f134715a.z2();
            }
        });
    }

    private void D2(org.apache.tools.ant.types.o oVar) {
        if (C2() == null) {
            return;
        }
        oVar.h().O1("-pname");
        oVar.h().O1(C2());
    }

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (E2()) {
            oVar.h().O1("-replace");
        }
        if (A2()) {
            oVar.h().O1(M);
        } else {
            y2(oVar);
        }
        w2(oVar);
        if (z2() == null && C2() == null) {
            throw new BuildException("Should select either an element (pname) or an object (objselect)");
        }
        D2(oVar);
        if (z2() != null) {
            oVar.h().O1(z2());
        }
    }

    private void w2(org.apache.tools.ant.types.o oVar) {
        if (v2() == null) {
            return;
        }
        oVar.h().O1("-comment");
        oVar.h().O1(v2());
    }

    private void y2(org.apache.tools.ant.types.o oVar) {
        if (x2() == null) {
            return;
        }
        oVar.h().O1(L);
        oVar.h().O1(x2());
    }

    public boolean A2() {
        return this.F;
    }

    public String C2() {
        return this.I;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1("lock");
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + B2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public boolean E2() {
        return this.E;
    }

    public void F2(String str) {
        this.G = str;
    }

    public void G2(String str) {
        this.H = str;
    }

    public void H2(String str) {
        this.J = str;
    }

    public void I2(String str) {
        this.J = str;
    }

    public void J2(boolean z10) {
        this.F = z10;
    }

    public void K2(String str) {
        this.I = str;
    }

    public void L2(boolean z10) {
        this.E = z10;
    }

    public String v2() {
        return this.G;
    }

    public String x2() {
        return this.H;
    }

    public String z2() {
        return this.J;
    }
}
