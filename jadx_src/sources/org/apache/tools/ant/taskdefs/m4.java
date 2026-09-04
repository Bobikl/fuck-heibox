package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Pack.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m4 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f134506n = 8192;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected File f134507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected File f134508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f134509m;

    private void q2() throws BuildException {
        File file = this.f134507k;
        if (file == null) {
            throw new BuildException("zipfile attribute is required", w1());
        }
        if (file.isDirectory()) {
            throw new BuildException("zipfile attribute must not represent a directory!", w1());
        }
        if (j2() == null) {
            throw new BuildException("src attribute or nested resource is required", w1());
        }
    }

    private void s2(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        do {
            outputStream.write(bArr, 0, i10);
            i10 = inputStream.read(bArr, 0, 8192);
        } while (i10 != -1);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        q2();
        org.apache.tools.ant.types.s1 s1VarJ2 = j2();
        if (!s1VarJ2.p2()) {
            log("Nothing to do: " + s1VarJ2.toString() + " doesn't exist.");
            return;
        }
        if (this.f134507k.lastModified() < s1VarJ2.i2()) {
            log("Building: " + this.f134507k.getAbsolutePath());
            k2();
            return;
        }
        log("Nothing to do: " + this.f134507k.getAbsolutePath() + " is up to date.");
    }

    public void i2(org.apache.tools.ant.types.u1 u1Var) {
        if (u1Var.size() == 0) {
            throw new BuildException("No resource selected, %s needs exactly one resource.", K1());
        }
        if (u1Var.size() != 1) {
            throw new BuildException("%s cannot handle multiple resources at once. (%d resources were selected.)", K1(), Integer.valueOf(u1Var.size()));
        }
        n2(u1Var.iterator().next());
    }

    public org.apache.tools.ant.types.s1 j2() {
        return this.f134509m;
    }

    protected abstract void k2();

    public void l2(File file) {
        o2(file);
    }

    public void m2(File file) {
        n2(new org.apache.tools.ant.types.resources.z(file));
    }

    public void n2(org.apache.tools.ant.types.s1 s1Var) {
        if (s1Var.o2()) {
            throw new BuildException("the source can't be a directory");
        }
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
        if (yVar != null) {
            this.f134508l = yVar.l0();
        } else if (!p2()) {
            throw new BuildException("Only FileSystem resources are supported.");
        }
        this.f134509m = s1Var;
    }

    public void o2(File file) {
        this.f134507k = file;
    }

    protected boolean p2() {
        return false;
    }

    protected void r2(File file, OutputStream outputStream) throws IOException {
        t2(new org.apache.tools.ant.types.resources.z(file), outputStream);
    }

    protected void t2(org.apache.tools.ant.types.s1 s1Var, OutputStream outputStream) throws IOException {
        InputStream inputStreamH2 = s1Var.h2();
        try {
            s2(inputStreamH2, outputStream);
            if (inputStreamH2 != null) {
                inputStreamH2.close();
            }
        } catch (Throwable th2) {
            if (inputStreamH2 != null) {
                try {
                    inputStreamH2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
