package org.apache.tools.ant.taskdefs.optional.sos;

import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: SOSCheckout.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends a {
    public final void S2(String str) {
        super.D2(str);
    }

    public void T2(boolean z10) {
        super.F2(z10);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.sos.a
    protected o i2() {
        this.A = new o();
        if (k2() != null) {
            this.A.h().O1(d.Z1);
            this.A.h().O1(d.S1);
            this.A.h().O1(d.f135366n2);
            this.A.h().O1(k2());
        } else {
            this.A.h().O1(d.Z1);
            this.A.h().O1(d.T1);
            this.A.h().O1(s2());
        }
        t2();
        p2();
        return this.A;
    }
}
