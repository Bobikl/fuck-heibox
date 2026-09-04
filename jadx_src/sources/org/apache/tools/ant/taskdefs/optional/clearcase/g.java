package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCMkdir.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends p {
    public static final String H = "-c";
    public static final String I = "-cfile";
    public static final String J = "-nc";
    public static final String K = "-nco";
    private String E = null;
    private String F = null;
    private boolean G = false;

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (v2() != null) {
            w2(oVar);
        } else if (x2() != null) {
            y2(oVar);
        } else {
            oVar.h().O1("-nc");
        }
        if (z2()) {
            oVar.h().O1("-nco");
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

    public void A2(String str) {
        this.E = str;
    }

    public void B2(String str) {
        this.F = str;
    }

    public void C2(boolean z10) {
        this.G = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1(p.D);
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + m2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public String v2() {
        return this.E;
    }

    public String x2() {
        return this.F;
    }

    public boolean z2() {
        return this.G;
    }
}
