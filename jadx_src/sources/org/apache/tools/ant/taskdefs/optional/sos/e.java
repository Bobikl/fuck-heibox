package org.apache.tools.ant.taskdefs.optional.sos;

import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: SOSGet.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends a {
    public final void S2(String str) {
        super.D2(str);
    }

    public void T2(String str) {
        super.E2(str);
    }

    public void U2(boolean z10) {
        super.F2(z10);
    }

    public void V2(String str) {
        super.G2(str);
    }

    @Override // org.apache.tools.ant.taskdefs.optional.sos.a
    protected o i2() {
        this.A = new o();
        if (k2() != null) {
            this.A.h().O1(d.Z1);
            this.A.h().O1(d.Q1);
            this.A.h().O1(d.f135366n2);
            this.A.h().O1(k2());
            if (z2() != null) {
                this.A.h().O1(d.f135359g2);
                this.A.h().O1(z2());
            }
        } else {
            this.A.h().O1(d.Z1);
            this.A.h().O1(d.R1);
            this.A.h().O1(s2());
            if (l2() != null) {
                this.A.h().O1(d.f135360h2);
                this.A.h().O1(l2());
            }
        }
        t2();
        p2();
        return this.A;
    }
}
