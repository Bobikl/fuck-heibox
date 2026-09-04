package org.apache.tools.ant.taskdefs.optional.sos;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: SOSLabel.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends a {
    public void S2(String str) {
        super.C2(str);
    }

    public void T2(String str) {
        super.E2(str);
    }

    public void U2(String str) {
        super.G2(str);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.sos.a
    protected o i2() {
        o oVar = new o();
        this.A = oVar;
        oVar.h().O1(d.Z1);
        this.A.h().O1(d.X1);
        t2();
        if (l2() == null) {
            throw new BuildException("label attribute must be set!", w1());
        }
        this.A.h().O1(d.f135360h2);
        this.A.h().O1(l2());
        this.A.h().O1(y2());
        if (j2() != null) {
            this.A.h().O1("-log");
            this.A.h().O1(j2());
        }
        return this.A;
    }
}
