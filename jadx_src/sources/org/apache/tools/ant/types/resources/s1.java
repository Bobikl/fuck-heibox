package org.apache.tools.ant.types.resources;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: URLResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class s1 extends org.apache.tools.ant.types.s1 implements p1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136416t = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f136417u = org.apache.tools.ant.types.s1.j2("null URL".getBytes());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private URL f136418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private URLConnection f136419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private URL f136420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f136421s;

    /* JADX INFO: compiled from: URLResource.java */
    public interface a {
        long a(URLConnection uRLConnection);
    }

    public s1() {
    }

    public s1(File file) {
        G2(file);
    }

    public s1(String str) {
        this(E2(str));
    }

    public s1(URL url) {
        I2(url);
    }

    public s1(p1 p1Var) {
        I2(p1Var.getURL());
    }

    private synchronized boolean B2(boolean z10) {
        if (getURL() == null) {
            return false;
        }
        try {
            z2(3);
            URLConnection uRLConnection = this.f136419q;
            if (uRLConnection instanceof HttpURLConnection) {
                boolean z11 = ((HttpURLConnection) uRLConnection).getResponseCode() < 400;
                if (z10) {
                    close();
                }
                return z11;
            }
            if (this.f136418p.getProtocol().startsWith("ftp")) {
                try {
                    try {
                        org.apache.tools.ant.util.j0.c(this.f136419q.getInputStream());
                        z10 = true;
                    } catch (Throwable th2) {
                        org.apache.tools.ant.util.j0.c(null);
                        throw th2;
                    }
                } catch (IOException unused) {
                    z10 = true;
                    if (z10) {
                        close();
                    }
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                    if (z10) {
                        close();
                    }
                    throw th;
                }
            }
            if (z10) {
                close();
            }
            return true;
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ long C2(URLConnection uRLConnection) {
        return this.f136419q.getLastModified();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ long D2(URLConnection uRLConnection) {
        return this.f136419q.getContentLength();
    }

    private static URL E2(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new BuildException(e10);
        }
    }

    private long J2(a aVar, long j10) {
        try {
            URLConnection uRLConnection = this.f136419q;
            if (uRLConnection != null) {
                return aVar.a(uRLConnection);
            }
            try {
                y2();
                return aVar.a(this.f136419q);
            } finally {
                close();
            }
        } catch (IOException unused) {
            return j10;
        }
    }

    private synchronized void close() {
        try {
            org.apache.tools.ant.util.j0.h(this.f136419q);
            this.f136419q = null;
        } catch (Throwable th2) {
            this.f136419q = null;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: A2, reason: merged with bridge method [inline-methods] */
    public s1 m2() {
        return (s1) O1(s1.class);
    }

    public synchronized void F2(URL url) {
        B1();
        if (this.f136418p != null) {
            throw new BuildException("can't define URL and baseURL attribute");
        }
        this.f136420r = url;
    }

    public synchronized void G2(File file) {
        try {
            I2(f136416t.N(file));
        } catch (MalformedURLException e10) {
            throw new BuildException(e10);
        }
    }

    public synchronized void H2(String str) {
        B1();
        if (this.f136418p != null) {
            throw new BuildException("can't define URL and relativePath attribute");
        }
        this.f136421s = str;
    }

    public synchronized void I2(URL url) {
        B1();
        this.f136418p = url;
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public synchronized void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136418p != null || this.f136420r != null || this.f136421s != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized boolean equals(Object obj) {
        boolean zEquals = true;
        if (this == obj) {
            return true;
        }
        if (Y1()) {
            return m2().equals(obj);
        }
        if (obj != null && obj.getClass() == getClass()) {
            s1 s1Var = (s1) obj;
            if (getURL() != null) {
                zEquals = getURL().equals(s1Var.getURL());
            } else if (s1Var.getURL() != null) {
                zEquals = false;
            }
            return zEquals;
        }
        return false;
    }

    @Override // org.apache.tools.ant.types.resources.p1
    public synchronized URL getURL() {
        if (Y1()) {
            return m2().getURL();
        }
        if (this.f136418p == null && this.f136420r != null) {
            if (this.f136421s == null) {
                throw new BuildException("must provide relativePath attribute when using baseURL.");
            }
            try {
                this.f136418p = new URL(this.f136420r, this.f136421s);
            } catch (MalformedURLException e10) {
                throw new BuildException(e10);
            }
        }
        return this.f136418p;
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized InputStream h2() throws IOException {
        if (Y1()) {
            return m2().h2();
        }
        y2();
        try {
            InputStream inputStream = this.f136419q.getInputStream();
            this.f136419q = null;
            return inputStream;
        } catch (Throwable th2) {
            this.f136419q = null;
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized int hashCode() {
        if (Y1()) {
            return m2().hashCode();
        }
        return org.apache.tools.ant.types.s1.f136492n * (getURL() == null ? f136417u : getURL().hashCode());
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized long i2() {
        if (Y1()) {
            return m2().i2();
        }
        if (!B2(false)) {
            return 0L;
        }
        return J2(new a() { // from class: org.apache.tools.ant.types.resources.q1
            @Override // org.apache.tools.ant.types.resources.s1.a
            public final long a(URLConnection uRLConnection) {
                return this.f136413a.C2(uRLConnection);
            }
        }, 0L);
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized String k2() {
        if (Y1()) {
            return m2().k2();
        }
        String file = getURL().getFile();
        if (!file.isEmpty()) {
            file = file.substring(1);
        }
        return file;
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized OutputStream l2() throws IOException {
        if (Y1()) {
            return m2().l2();
        }
        y2();
        try {
            OutputStream outputStream = this.f136419q.getOutputStream();
            this.f136419q = null;
            return outputStream;
        } catch (Throwable th2) {
            this.f136419q = null;
            throw th2;
        }
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized long n2() {
        if (Y1()) {
            return m2().n2();
        }
        if (!B2(false)) {
            return 0L;
        }
        return J2(new a() { // from class: org.apache.tools.ant.types.resources.r1
            @Override // org.apache.tools.ant.types.resources.s1.a
            public final long a(URLConnection uRLConnection) {
                return this.f136415a.D2(uRLConnection);
            }
        }, -1L);
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized boolean o2() {
        return Y1() ? m2().o2() : k2().endsWith("/");
    }

    @Override // org.apache.tools.ant.types.s1
    public synchronized boolean p2() {
        if (Y1()) {
            return m2().p2();
        }
        return B2(false);
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public synchronized String toString() {
        return Y1() ? m2().toString() : String.valueOf(getURL());
    }

    protected void y2() throws IOException {
        z2(0);
    }

    protected synchronized void z2(int i10) throws IOException {
        URL url = getURL();
        if (url == null) {
            throw new BuildException("URL not set");
        }
        if (this.f136419q == null) {
            try {
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                this.f136419q = uRLConnectionOpenConnection;
                uRLConnectionOpenConnection.connect();
            } catch (IOException e10) {
                x1(e10.toString(), i10);
                this.f136419q = null;
                throw e10;
            }
        }
    }
}
