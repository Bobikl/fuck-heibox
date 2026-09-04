package org.apache.tools.ant.types.resources;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: StringResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class l1 extends org.apache.tools.ant.types.s1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f136383q = org.apache.tools.ant.types.s1.j2("StringResource".getBytes());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f136384r = "UTF-8";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f136385p;

    /* JADX INFO: compiled from: StringResource.java */
    public class a extends FilterOutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteArrayOutputStream f136386b;

        public a() {
            super(new ByteArrayOutputStream());
            this.f136386b = (ByteArrayOutputStream) ((FilterOutputStream) this).out;
        }

        private void a(String str) {
            if (l1.this.b() != null) {
                str = l1.this.b().V0(str);
            }
            l1.this.D2(str);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            a(l1.this.f136385p == null ? this.f136386b.toString() : this.f136386b.toString(l1.this.f136385p));
        }
    }

    public l1() {
        this.f136385p = "UTF-8";
    }

    public l1(String str) {
        this(null, str);
    }

    public l1(Project project, String str) {
        this.f136385p = "UTF-8";
        J(project);
        D2(project != null ? project.V0(str) : str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: A2, reason: merged with bridge method [inline-methods] */
    public l1 m2() {
        return (l1) O1(l1.class);
    }

    public synchronized String B2() {
        return k2();
    }

    public synchronized void C2(String str) {
        B1();
        this.f136385p = str;
    }

    public synchronized void D2(String str) {
        t2(str);
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136385p != "UTF-8") {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized InputStream h2() throws IOException {
        if (Y1()) {
            return m2().h2();
        }
        String strY2 = y2();
        if (strY2 == null) {
            throw new IllegalStateException("unset string value");
        }
        String str = this.f136385p;
        return new ByteArrayInputStream(str == null ? strY2.getBytes() : strY2.getBytes(str));
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized int hashCode() {
        if (Y1()) {
            return m2().hashCode();
        }
        return super.hashCode() * f136383q;
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized String k2() {
        return super.k2();
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized OutputStream l2() throws IOException {
        if (Y1()) {
            return m2().l2();
        }
        if (B2() != null) {
            throw new ImmutableResourceException();
        }
        return new a();
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized long n2() {
        return Y1() ? m2().n2() : y2().length();
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean p2() {
        return B2() != null;
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized void t2(String str) {
        if (k2() != null) {
            throw new BuildException(new ImmutableResourceException());
        }
        super.t2(str);
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public String toString() {
        return String.valueOf(y2());
    }

    public void x2(String str) {
        D1();
        D2(b().V0(str));
    }

    protected synchronized String y2() {
        return B2();
    }

    public synchronized String z2() {
        return this.f136385p;
    }
}
