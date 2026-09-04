package org.apache.tools.ant.taskdefs.optional.vss;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: MSVSSCP.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends a {
    @Override // org.apache.tools.ant.taskdefs.optional.vss.a
    protected o i2() {
        o oVar = new o();
        if (E2() == null) {
            throw new BuildException("vsspath attribute must be set!", w1());
        }
        oVar.w(w2());
        oVar.h().O1(g.f135469s2);
        oVar.h().O1(E2());
        oVar.h().O1(l2());
        oVar.h().O1(s2());
        return oVar;
    }

    public void j3(String str) {
        super.J2(str);
    }
}
