package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: CallTarget.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Ant f133730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f133731l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f133732m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f133733n = false;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f133730k == null) {
            V1();
        }
        if (!this.f133733n) {
            throw new BuildException("Attribute target or at least one nested target is required.", w1());
        }
        this.f133730k.C2(b().u0(org.apache.tools.ant.j1.f133490n));
        this.f133730k.E2(this.f133731l);
        this.f133730k.F2(this.f133732m);
        this.f133730k.D1();
    }

    @Override // org.apache.tools.ant.u2
    public void O1(String str) {
        Ant ant = this.f133730k;
        if (ant != null) {
            ant.O1(str);
        } else {
            super.O1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void Q1(String str) {
        Ant ant = this.f133730k;
        if (ant != null) {
            ant.Q1(str);
        } else {
            super.Q1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void R1(String str) {
        Ant ant = this.f133730k;
        if (ant != null) {
            ant.R1(str);
        } else {
            super.R1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public int S1(byte[] bArr, int i10, int i11) throws IOException {
        Ant ant = this.f133730k;
        return ant != null ? ant.S1(bArr, i10, i11) : super.S1(bArr, i10, i11);
    }

    @Override // org.apache.tools.ant.u2
    public void U1(String str) {
        Ant ant = this.f133730k;
        if (ant != null) {
            ant.U1(str);
        } else {
            super.U1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void V1() {
        Ant ant = new Ant(this);
        this.f133730k = ant;
        ant.V1();
    }

    public void i2(Ant.c cVar) {
        if (this.f133730k == null) {
            V1();
        }
        this.f133730k.n2(cVar);
        this.f133733n = true;
    }

    public void j2(org.apache.tools.ant.types.j1 j1Var) {
        if (this.f133730k == null) {
            V1();
        }
        this.f133730k.o2(j1Var);
    }

    public void k2(Ant.b bVar) {
        if (this.f133730k == null) {
            V1();
        }
        this.f133730k.p2(bVar);
    }

    public b5 l2() {
        if (this.f133730k == null) {
            V1();
        }
        return this.f133730k.s2();
    }

    public void m2(boolean z10) {
        this.f133731l = z10;
    }

    public void n2(boolean z10) {
        this.f133732m = z10;
    }

    public void o2(String str) {
        if (this.f133730k == null) {
            V1();
        }
        this.f133730k.H2(str);
        this.f133733n = true;
    }
}
