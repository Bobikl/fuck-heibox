package org.apache.tools.ant.types.resources;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ZipResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class x1 extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f136477u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private org.apache.tools.zip.u[] f136478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f136479w;

    /* JADX INFO: compiled from: ZipResource.java */
    public class a extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.apache.tools.zip.x f136480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputStream inputStream, org.apache.tools.zip.x xVar) {
            super(inputStream);
            this.f136480b = xVar;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            org.apache.tools.ant.util.j0.c(((FilterInputStream) this).in);
            this.f136480b.close();
        }

        protected void finalize() throws Throwable {
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public x1() {
    }

    public x1(File file, String str, org.apache.tools.zip.t tVar) {
        super(file, true);
        K2(str);
        L2(tVar);
    }

    public static InputStream I2(org.apache.tools.zip.x xVar, String str) throws IOException {
        org.apache.tools.zip.t tVarN = xVar.n(str);
        if (tVarN != null) {
            return new a(xVar.o(tVarN), xVar);
        }
        xVar.close();
        throw new BuildException("no entry " + str + " in " + xVar.p());
    }

    private void L2(org.apache.tools.zip.t tVar) {
        if (tVar == null) {
            r2(false);
            return;
        }
        t2(tVar.getName());
        r2(true);
        s2(tVar.getTime());
        q2(tVar.isDirectory());
        u2(tVar.getSize());
        D2(tVar.u());
        this.f136478v = tVar.k(true);
        this.f136479w = tVar.getMethod();
    }

    public String E2() {
        return Y1() ? m2().E2() : this.f136477u;
    }

    public org.apache.tools.zip.u[] F2() {
        if (Y1()) {
            return m2().F2();
        }
        x2();
        org.apache.tools.zip.u[] uVarArr = this.f136478v;
        return uVarArr == null ? new org.apache.tools.zip.u[0] : uVarArr;
    }

    public int G2() {
        return this.f136479w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.resources.g, org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: H2, reason: merged with bridge method [inline-methods] */
    public x1 m2() {
        return (x1) O1(x1.class);
    }

    public File J2() {
        return ((y) z2().e2(y.class)).l0();
    }

    public void K2(String str) {
        B1();
        this.f136477u = str;
    }

    public void M2(File file) {
        C2(file);
    }

    @Override // org.apache.tools.ant.types.resources.g, org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136477u != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public InputStream h2() throws IOException {
        return Y1() ? m2().h2() : I2(new org.apache.tools.zip.x(J2(), E2()), k2());
    }

    @Override // org.apache.tools.ant.types.s1
    public OutputStream l2() throws IOException {
        if (Y1()) {
            return m2().l2();
        }
        throw new UnsupportedOperationException("Use the zip task for zip output.");
    }

    @Override // org.apache.tools.ant.types.resources.g
    public void w2(org.apache.tools.ant.types.u1 u1Var) {
        super.w2(u1Var);
        if (!u1Var.O()) {
            throw new BuildException("only filesystem resources are supported");
        }
    }

    @Override // org.apache.tools.ant.types.resources.g
    protected void y2() throws Throwable {
        Throwable th2;
        IOException e10;
        try {
            try {
                org.apache.tools.zip.x xVar = new org.apache.tools.zip.x(J2(), E2());
                try {
                    L2(xVar.n(k2()));
                    org.apache.tools.zip.x.e(xVar);
                } catch (IOException e11) {
                    e10 = e11;
                    x1(e10.getMessage(), 4);
                    throw new BuildException(e10);
                }
            } catch (Throwable th3) {
                th2 = th3;
                org.apache.tools.zip.x.e(null);
                throw th2;
            }
        } catch (IOException e12) {
            e10 = e12;
        } catch (Throwable th4) {
            th2 = th4;
            org.apache.tools.zip.x.e(null);
            throw th2;
        }
    }
}
