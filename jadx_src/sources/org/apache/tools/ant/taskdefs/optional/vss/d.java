package org.apache.tools.ant.taskdefs.optional.vss;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: MSVSSCHECKOUT.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends a {
    @Override // org.apache.tools.ant.taskdefs.optional.vss.a
    protected o i2() {
        o oVar = new o();
        if (E2() == null) {
            throw new BuildException("vsspath attribute must be set!", w1());
        }
        oVar.w(w2());
        oVar.h().O1(g.f135472v2);
        oVar.h().O1(E2());
        oVar.h().O1(r2());
        oVar.h().O1(l2());
        oVar.h().O1(v2());
        oVar.h().O1(C2());
        oVar.h().O1(s2());
        oVar.h().O1(o2());
        oVar.h().O1(G2());
        oVar.h().O1(p2());
        return oVar;
    }

    public void j3(String str) {
        super.J2(str);
    }

    public void k3(String str) {
        super.L2(str);
    }

    public void l3(a.C1235a c1235a) {
        super.O2(c1235a);
    }

    public void m3(boolean z10) {
        super.R2(z10);
    }

    public void n3(String str) {
        super.S2(str);
    }

    public void o3(o0 o0Var) {
        super.T2(o0Var.toString());
    }

    public void p3(boolean z10) {
        super.X2(z10);
    }

    public void q3(String str) {
        super.c3(str);
    }

    public void r3(a.b bVar) {
        super.e3(bVar);
    }
}
