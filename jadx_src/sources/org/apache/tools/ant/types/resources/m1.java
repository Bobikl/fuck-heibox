package org.apache.tools.ant.types.resources;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: TarResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class m1 extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f136389u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f136390v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f136391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f136392x;

    public m1() {
        this.f136389u = "";
        this.f136390v = "";
    }

    public m1(File file, org.apache.tools.tar.d dVar) {
        super(file, true);
        this.f136389u = "";
        this.f136390v = "";
        L2(dVar);
    }

    public m1(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.tar.d dVar) {
        super(s1Var, true);
        this.f136389u = "";
        this.f136390v = "";
        L2(dVar);
    }

    private void L2(org.apache.tools.tar.d dVar) {
        if (dVar == null) {
            r2(false);
            return;
        }
        t2(dVar.n());
        r2(true);
        s2(dVar.l().getTime());
        q2(dVar.v());
        u2(dVar.p());
        D2(dVar.m());
        this.f136389u = dVar.r();
        this.f136390v = dVar.h();
        this.f136391w = dVar.k();
        this.f136392x = dVar.j();
    }

    @Deprecated
    public int E2() {
        return (int) G2();
    }

    public String F2() {
        if (Y1()) {
            return m2().F2();
        }
        x2();
        return this.f136390v;
    }

    public long G2() {
        if (Y1()) {
            return m2().G2();
        }
        x2();
        return this.f136392x;
    }

    public long H2() {
        if (Y1()) {
            return m2().H2();
        }
        x2();
        return this.f136391w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.resources.g, org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: I2, reason: merged with bridge method [inline-methods] */
    public m1 m2() {
        return (m1) O1(m1.class);
    }

    @Deprecated
    public int J2() {
        return (int) H2();
    }

    public String K2() {
        if (Y1()) {
            return m2().K2();
        }
        x2();
        return this.f136389u;
    }

    @Override // org.apache.tools.ant.types.s1
    public InputStream h2() throws IOException {
        org.apache.tools.tar.d dVarF;
        if (Y1()) {
            return m2().h2();
        }
        org.apache.tools.tar.f fVar = new org.apache.tools.tar.f(z2().h2());
        do {
            dVarF = fVar.f();
            if (dVarF == null) {
                org.apache.tools.ant.util.j0.c(fVar);
                throw new BuildException("no entry " + k2() + " in " + z2());
            }
        } while (!dVarF.n().equals(k2()));
        return fVar;
    }

    @Override // org.apache.tools.ant.types.s1
    public OutputStream l2() throws IOException {
        if (Y1()) {
            return m2().l2();
        }
        throw new UnsupportedOperationException("Use the tar task for tar output.");
    }

    @Override // org.apache.tools.ant.types.resources.g
    protected void y2() {
        org.apache.tools.tar.d dVarF;
        try {
            org.apache.tools.tar.f fVar = new org.apache.tools.tar.f(z2().h2());
            do {
                try {
                    dVarF = fVar.f();
                    if (dVarF == null) {
                        fVar.close();
                        L2(null);
                        return;
                    }
                } catch (Throwable th2) {
                    try {
                        fVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                x1(e.getMessage(), 4);
                throw new BuildException(e);
            } while (!dVarF.n().equals(k2()));
            L2(dVarF);
            fVar.close();
        } catch (IOException e10) {
            x1(e10.getMessage(), 4);
            throw new BuildException(e10);
        }
    }
}
