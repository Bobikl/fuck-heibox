package org.apache.tools.ant.taskdefs.optional.clearcase;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: CCUnCheckout.java */
/* JADX INFO: loaded from: classes5.dex */
public class l extends p {
    public static final String F = "-keep";
    public static final String G = "-rm";
    private boolean E = false;

    private void u2(org.apache.tools.ant.types.o oVar) {
        if (v2()) {
            oVar.h().O1("-keep");
        } else {
            oVar.h().O1(G);
        }
        oVar.h().O1(l2());
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        Project projectB = b();
        if (l2() == null) {
            t2(projectB.Z().getPath());
        }
        oVar.w(i2());
        oVar.h().O1(p.f134721t);
        u2(oVar);
        if (!j2()) {
            b().M0("Ignoring any errors that occur for: " + m2(), 3);
        }
        if (n1.o(n2(oVar)) && j2()) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    public boolean v2() {
        return this.E;
    }

    public void w2(boolean z10) {
        this.E = z10;
    }
}
