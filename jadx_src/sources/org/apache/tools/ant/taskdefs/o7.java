package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: VerifyJar.java */
/* JADX INFO: loaded from: classes5.dex */
public class o7 extends d {
    public static final String H = "Not found :";
    public static final String I = "Failed to verify ";
    private static final String J = "jar verified.";
    private boolean E = false;
    private b F = new b();
    private String G = null;

    /* JADX INFO: compiled from: VerifyJar.java */
    public static class b implements org.apache.tools.ant.filters.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f134640b;

        private b() {
        }

        public void a() {
            c cVar = this.f134640b;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // org.apache.tools.ant.filters.c
        public Reader t0(Reader reader) {
            c cVar = new c(reader);
            this.f134640b = cVar;
            return cVar;
        }

        public String toString() {
            return this.f134640b.toString();
        }
    }

    /* JADX INFO: compiled from: VerifyJar.java */
    public static class c extends Reader {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Reader f134641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private StringBuffer f134642c = new StringBuffer();

        public c(Reader reader) {
            this.f134641b = reader;
        }

        public void a() {
            this.f134642c = new StringBuffer();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f134641b.close();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            int i12 = this.f134641b.read(cArr, i10, i11);
            this.f134642c.append(cArr, i10, i11);
            return i12;
        }

        public String toString() {
            return this.f134642c.toString();
        }
    }

    private void N2(File file) {
        if (!file.exists()) {
            throw new BuildException(H + file);
        }
        j1 j1VarP2 = p2();
        z2(j1VarP2);
        o2(j1VarP2);
        if (this.G != null) {
            m2(j1VarP2, "-storepass");
            m2(j1VarP2, this.G);
        }
        m2(j1VarP2, "-verify");
        if (this.E) {
            m2(j1VarP2, "-certs");
        }
        m2(j1VarP2, file.getPath());
        String str = this.f134023l;
        if (str != null) {
            m2(j1VarP2, str);
        }
        log("Verifying JAR: " + file.getAbsolutePath());
        this.F.a();
        BuildException e10 = null;
        try {
            j1VarP2.D1();
        } catch (BuildException e11) {
            e10 = e11;
        }
        String string = this.F.toString();
        if (e10 != null) {
            if (!string.contains("zip file closed")) {
                throw e10;
            }
            x1("You are running jarsigner against a JVM with a known bug that manifests as an IllegalStateException.", 1);
        }
        if (string.contains(J)) {
            return;
        }
        throw new BuildException(I + file);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (!(this.f134022k != null) && !x2()) {
            throw new BuildException(d.C);
        }
        n2();
        org.apache.tools.ant.types.p1 p1VarW2 = w2();
        p1VarW2.o2(true);
        p1VarW2.m2().e2(this.F);
        try {
            Iterator<org.apache.tools.ant.types.s1> it = s2().iterator();
            while (it.hasNext()) {
                N2(((org.apache.tools.ant.types.resources.y) it.next().e2(org.apache.tools.ant.types.resources.y.class)).l0());
            }
            v2();
        } catch (Throwable th2) {
            v2();
            throw th2;
        }
    }

    public void M2(boolean z10) {
        this.E = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.d
    protected void n2() {
        String str = this.f134025n;
        if (str != null) {
            this.G = str;
            I2(null);
        }
        super.n2();
    }

    @Override // org.apache.tools.ant.taskdefs.d
    protected void v2() {
        String str = this.G;
        if (str != null) {
            I2(str);
            this.G = null;
        }
        super.v2();
    }
}
