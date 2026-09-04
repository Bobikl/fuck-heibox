package org.apache.tools.ant.taskdefs.optional.vss;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: MSVSSADD.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends a {
    private String K = null;

    @Override // org.apache.tools.ant.taskdefs.optional.vss.a
    protected o i2() {
        o oVar = new o();
        if (r2() == null) {
            throw new BuildException("localPath attribute must be set!", w1());
        }
        oVar.w(w2());
        oVar.h().O1(g.f135470t2);
        oVar.h().O1(r2());
        oVar.h().O1(l2());
        oVar.h().O1(v2());
        oVar.h().O1(F2());
        oVar.h().O1(s2());
        oVar.h().O1(m2());
        return oVar;
    }

    public void j3(String str) {
        super.J2(str);
    }

    public void k3(String str) {
        super.K2(str);
    }

    public void l3(o0 o0Var) {
        this.K = o0Var.toString();
    }

    public void m3(boolean z10) {
        super.X2(z10);
    }

    public final void n3(boolean z10) {
        super.d3(z10);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.vss.a
    protected String r2() {
        return this.K;
    }
}
