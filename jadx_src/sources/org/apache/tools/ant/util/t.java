package org.apache.tools.ant.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* JADX INFO: compiled from: ConcatFileInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class t extends InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f136942g = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f136943b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f136944c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File[] f136945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f136946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.apache.tools.ant.b2 f136947f;

    public t(File[] fileArr) throws IOException {
        this.f136945d = fileArr;
    }

    private void a() {
        j0.c(this.f136946e);
        this.f136946e = null;
    }

    private void c(int i10) throws IOException {
        a();
        File[] fileArr = this.f136945d;
        if (fileArr == null || i10 >= fileArr.length) {
            this.f136944c = true;
            return;
        }
        b("Opening " + this.f136945d[i10], 3);
        try {
            this.f136946e = new BufferedInputStream(Files.newInputStream(this.f136945d[i10].toPath(), new OpenOption[0]));
        } catch (IOException e10) {
            b("Failed to open " + this.f136945d[i10], 0);
            throw e10;
        }
    }

    private int d() throws IOException {
        InputStream inputStream;
        if (this.f136944c || (inputStream = this.f136946e) == null) {
            return -1;
        }
        return inputStream.read();
    }

    public void b(String str, int i10) {
        org.apache.tools.ant.b2 b2Var = this.f136947f;
        if (b2Var != null) {
            b2Var.x1(str, i10);
        } else if (i10 > 1) {
            System.out.println(str);
        } else {
            System.err.println(str);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        this.f136944c = true;
    }

    public void e(org.apache.tools.ant.b2 b2Var) {
        this.f136947f = b2Var;
    }

    public void f(org.apache.tools.ant.u2 u2Var) {
        e(u2Var);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int iD = d();
        if (iD != -1 || this.f136944c) {
            return iD;
        }
        int i10 = this.f136943b + 1;
        this.f136943b = i10;
        c(i10);
        return d();
    }
}
