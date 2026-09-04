package org.apache.tools.ant.taskdefs.optional.vss;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: MSVSSGET.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends a {
    @Override // org.apache.tools.ant.taskdefs.optional.vss.a
    o i2() {
        o oVar = new o();
        oVar.w(w2());
        oVar.h().O1(g.f135471u2);
        if (E2() == null) {
            throw new BuildException("vsspath attribute must be set!", w1());
        }
        oVar.h().O1(E2());
        oVar.h().O1(r2());
        oVar.h().O1(l2());
        oVar.h().O1(u2());
        oVar.h().O1(v2());
        oVar.h().O1(C2());
        oVar.h().O1(F2());
        oVar.h().O1(s2());
        oVar.h().O1(o2());
        oVar.h().O1(G2());
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

    public void m3(String str) {
        super.S2(str);
    }

    public void n3(o0 o0Var) {
        super.T2(o0Var.toString());
    }

    public final void o3(boolean z10) {
        super.W2(z10);
    }

    public final void p3(boolean z10) {
        super.X2(z10);
    }

    public void q3(String str) {
        super.c3(str);
    }

    public final void r3(boolean z10) {
        super.d3(z10);
    }

    public void s3(a.b bVar) {
        super.e3(bVar);
    }
}
