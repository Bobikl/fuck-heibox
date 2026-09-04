package org.apache.tools.ant.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: compiled from: ConcatResourceInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class u extends InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f136949g = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<org.apache.tools.ant.types.s1> f136951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f136952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.apache.tools.ant.b2 f136953e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f136950b = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f136954f = false;

    public u(org.apache.tools.ant.types.u1 u1Var) {
        this.f136951c = u1Var.iterator();
    }

    private void a() {
        j0.c(this.f136952d);
        this.f136952d = null;
    }

    private void d() throws IOException {
        a();
        while (this.f136951c.hasNext()) {
            org.apache.tools.ant.types.s1 next = this.f136951c.next();
            if (next.p2()) {
                c("Concatenating " + next.v2(), 3);
                try {
                    this.f136952d = new BufferedInputStream(next.h2());
                    return;
                } catch (IOException e10) {
                    if (!this.f136954f) {
                        c("Failed to get input stream for " + next, 0);
                        throw e10;
                    }
                }
            }
        }
        this.f136950b = true;
    }

    private int e() throws IOException {
        InputStream inputStream;
        if (this.f136950b || (inputStream = this.f136952d) == null) {
            return -1;
        }
        return inputStream.read();
    }

    public boolean b() {
        return this.f136954f;
    }

    public void c(String str, int i10) {
        org.apache.tools.ant.b2 b2Var = this.f136953e;
        if (b2Var != null) {
            b2Var.x1(str, i10);
        } else {
            (i10 > 1 ? System.out : System.err).println(str);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        this.f136950b = true;
    }

    public void f(boolean z10) {
        this.f136954f = z10;
    }

    public void g(org.apache.tools.ant.b2 b2Var) {
        this.f136953e = b2Var;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f136950b) {
            return -1;
        }
        int iE = e();
        if (iE != -1) {
            return iE;
        }
        d();
        return e();
    }
}
