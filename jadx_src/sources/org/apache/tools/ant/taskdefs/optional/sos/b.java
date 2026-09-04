package org.apache.tools.ant.taskdefs.optional.sos;

import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: SOSCheckin.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends a {
    public void S2(String str) {
        super.C2(str);
    }

    public final void T2(String str) {
        super.D2(str);
    }

    public void U2(boolean z10) {
        super.F2(z10);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.sos.a
    protected o i2() {
        this.A = new o();
        if (k2() != null) {
            this.A.h().O1(d.Z1);
            this.A.h().O1(d.U1);
            this.A.h().O1(d.f135366n2);
            this.A.h().O1(k2());
        } else {
            this.A.h().O1(d.Z1);
            this.A.h().O1(d.V1);
            this.A.h().O1(s2());
        }
        t2();
        p2();
        if (j2() != null) {
            this.A.h().O1("-log");
            this.A.h().O1(j2());
        }
        return this.A;
    }
}
