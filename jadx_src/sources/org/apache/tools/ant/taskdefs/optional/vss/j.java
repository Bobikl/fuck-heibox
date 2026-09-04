package org.apache.tools.ant.taskdefs.optional.vss;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: MSVSSLABEL.java */
/* JADX INFO: loaded from: classes5.dex */
public class j extends a {
    @Override // org.apache.tools.ant.taskdefs.optional.vss.a
    o i2() {
        o oVar = new o();
        if (E2() == null) {
            throw new BuildException("vsspath attribute must be set!", w1());
        }
        String strQ2 = q2();
        if (strQ2.isEmpty()) {
            throw new BuildException("label attribute must be set!", w1());
        }
        oVar.w(w2());
        oVar.h().O1("Label");
        oVar.h().O1(E2());
        oVar.h().O1(m2());
        oVar.h().O1(l2());
        oVar.h().O1(strQ2);
        oVar.h().O1(A2());
        oVar.h().O1(s2());
        return oVar;
    }

    public void j3(String str) {
        super.J2(str);
    }

    public void k3(String str) {
        super.K2(str);
    }

    public void l3(String str) {
        super.S2(str);
    }

    public void m3(String str) {
        super.c3(str);
    }
}
