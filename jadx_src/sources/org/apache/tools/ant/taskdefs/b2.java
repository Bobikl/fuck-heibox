package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Get.java */
/* JADX INFO: loaded from: classes5.dex */
public class b2 extends org.apache.tools.ant.u2 {
    private static final int A = 3;
    private static final int B = 50;
    private static final int C = 102400;
    private static final org.apache.tools.ant.util.j0 D = org.apache.tools.ant.util.j0.O();
    private static final int E = 25;
    private static final int F = 307;
    private static final String G = "http";
    private static final String H = "https";
    private static final String I = "Apache Ant";
    private static final String J = "gzip";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f133736l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final org.apache.tools.ant.types.resources.f1 f133735k = new org.apache.tools.ant.types.resources.f1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f133737m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f133738n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f133739o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f133740p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f133741q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f133742r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f133743s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f133744t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f133745u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f133746v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f133747w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private org.apache.tools.ant.types.k0 f133748x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f133749y = System.getProperty(org.apache.tools.ant.j1.L, "Apache Ant/" + org.apache.tools.ant.v1.r());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Map<String, String> f133750z = new LinkedHashMap();

    /* JADX INFO: compiled from: Get.java */
    public static class a extends org.apache.tools.ant.util.a {
        protected a() {
        }
    }

    /* JADX INFO: compiled from: Get.java */
    public interface b {
        void a();

        void b();

        void c();
    }

    /* JADX INFO: compiled from: Get.java */
    public class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final URL f133751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final File f133752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f133753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f133754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f133755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f133756g;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private URLConnection f133762m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f133764o;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f133757h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private IOException f133758i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private BuildException f133759j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private InputStream f133760k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private OutputStream f133761l = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f133763n = 0;

        c(URL url, File file, boolean z10, long j10, b bVar, int i10, String str) {
            this.f133751b = url;
            this.f133752c = file;
            this.f133753d = z10;
            this.f133754e = j10;
            this.f133755f = bVar;
            this.f133756g = i10;
            this.f133764o = str;
        }

        private boolean b() throws IOException {
            int i10;
            for (int i11 = 0; i11 < b2.this.f133744t; i11++) {
                try {
                    this.f133760k = this.f133762m.getInputStream();
                    break;
                } catch (IOException e10) {
                    b2.this.x1("Error opening connection " + e10, this.f133756g);
                }
            }
            if (this.f133760k == null) {
                b2.this.x1("Can't get " + this.f133751b + " to " + this.f133752c, this.f133756g);
                if (b2.this.f133740p) {
                    return false;
                }
                throw new BuildException("Can't get " + this.f133751b + " to " + this.f133752c, b2.this.w1());
            }
            if (b2.this.f133747w && "gzip".equals(this.f133762m.getContentEncoding())) {
                this.f133760k = new GZIPInputStream(this.f133760k);
            }
            this.f133761l = Files.newOutputStream(this.f133752c.toPath(), new OpenOption[0]);
            this.f133755f.c();
            try {
                byte[] bArr = new byte[b2.C];
                while (!isInterrupted() && (i10 = this.f133760k.read(bArr)) >= 0) {
                    this.f133761l.write(bArr, 0, i10);
                    this.f133755f.b();
                }
                boolean z10 = !isInterrupted();
                org.apache.tools.ant.util.j0.d(this.f133761l);
                org.apache.tools.ant.util.j0.c(this.f133760k);
                if (!z10) {
                    this.f133752c.delete();
                }
                this.f133755f.a();
                return true;
            } catch (Throwable th2) {
                org.apache.tools.ant.util.j0.d(this.f133761l);
                org.apache.tools.ant.util.j0.c(this.f133760k);
                this.f133752c.delete();
                throw th2;
            }
        }

        private boolean c() throws IOException, BuildException {
            URLConnection uRLConnectionE = e(this.f133751b);
            this.f133762m = uRLConnectionE;
            if (uRLConnectionE == null) {
                return false;
            }
            boolean zB = b();
            if (zB && b2.this.f133739o) {
                g();
            }
            return zB;
        }

        private boolean d(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 303 || i10 == 307;
        }

        private URLConnection e(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (this.f133753d) {
                uRLConnectionOpenConnection.setIfModifiedSince(this.f133754e);
            }
            uRLConnectionOpenConnection.addRequestProperty("User-Agent", this.f133764o);
            if (b2.this.f133741q != null || b2.this.f133742r != null) {
                String strB = new a().b((b2.this.f133741q + ":" + b2.this.f133742r).getBytes());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Basic ");
                sb2.append(strB);
                uRLConnectionOpenConnection.setRequestProperty("Authorization", sb2.toString());
            }
            if (b2.this.f133747w) {
                uRLConnectionOpenConnection.setRequestProperty("Accept-Encoding", "gzip");
            }
            for (Map.Entry entry : b2.this.f133750z.entrySet()) {
                b2.this.log(String.format("Adding header '%s' ", entry.getKey()));
                uRLConnectionOpenConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            boolean z10 = uRLConnectionOpenConnection instanceof HttpURLConnection;
            if (z10) {
                ((HttpURLConnection) uRLConnectionOpenConnection).setInstanceFollowRedirects(false);
                uRLConnectionOpenConnection.setUseCaches(b2.this.f133746v);
            }
            try {
                uRLConnectionOpenConnection.connect();
                if (z10) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    int responseCode = httpURLConnection.getResponseCode();
                    if (d(responseCode)) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(url);
                        sb3.append(responseCode == 301 ? " permanently" : "");
                        sb3.append(" moved to ");
                        sb3.append(headerField);
                        b2.this.x1(sb3.toString(), this.f133756g);
                        URL url2 = new URL(url, headerField);
                        if (f(url, url2)) {
                            return e(url2);
                        }
                        return null;
                    }
                    long lastModified = httpURLConnection.getLastModified();
                    if (responseCode == 304 || (lastModified != 0 && this.f133753d && this.f133754e >= lastModified)) {
                        b2.this.x1("Not modified - so not downloaded", this.f133756g);
                        return null;
                    }
                    if (responseCode == 401) {
                        if (!b2.this.f133740p) {
                            throw new BuildException("HTTP Authorization failure");
                        }
                        b2.this.x1("HTTP Authorization failure", this.f133756g);
                        return null;
                    }
                }
                return uRLConnectionOpenConnection;
            } catch (NullPointerException e10) {
                throw new BuildException("Failed to parse " + this.f133751b.toString(), e10);
            }
        }

        private boolean f(URL url, URL url2) {
            if (url.getProtocol().equals(url2.getProtocol()) || ("http".equals(url.getProtocol()) && "https".equals(url2.getProtocol()))) {
                int i10 = this.f133763n + 1;
                this.f133763n = i10;
                if (i10 <= 25) {
                    return true;
                }
                if (!b2.this.f133740p) {
                    throw new BuildException("More than 25 times redirected, giving up");
                }
                b2.this.x1("More than 25 times redirected, giving up", this.f133756g);
                return false;
            }
            String str = "Redirection detected from " + url.getProtocol() + " to " + url2.getProtocol() + ". Protocol switch unsafe, not allowed.";
            if (!b2.this.f133740p) {
                throw new BuildException(str);
            }
            b2.this.x1(str, this.f133756g);
            return false;
        }

        private void g() {
            long lastModified = this.f133762m.getLastModified();
            if (b2.this.f133737m) {
                Date date = new Date(lastModified);
                b2 b2Var = b2.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("last modified = ");
                sb2.append(date.toString());
                sb2.append(lastModified == 0 ? " - using current time instead" : "");
                b2Var.x1(sb2.toString(), this.f133756g);
            }
            if (lastModified != 0) {
                b2.D.p0(this.f133752c, lastModified);
            }
        }

        void a() {
            interrupt();
            org.apache.tools.ant.util.j0.d(this.f133761l);
            org.apache.tools.ant.util.j0.c(this.f133760k);
            if (this.f133757h || !this.f133752c.exists()) {
                return;
            }
            this.f133752c.delete();
        }

        boolean h() throws IOException, BuildException {
            IOException iOException = this.f133758i;
            if (iOException != null) {
                throw iOException;
            }
            BuildException buildException = this.f133759j;
            if (buildException == null) {
                return this.f133757h;
            }
            throw buildException;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f133757h = c();
            } catch (IOException e10) {
                this.f133758i = e10;
            } catch (BuildException e11) {
                this.f133759j = e11;
            }
        }
    }

    /* JADX INFO: compiled from: Get.java */
    public static class d implements b {
        @Override // org.apache.tools.ant.taskdefs.b2.b
        public void a() {
        }

        @Override // org.apache.tools.ant.taskdefs.b2.b
        public void b() {
        }

        @Override // org.apache.tools.ant.taskdefs.b2.b
        public void c() {
        }
    }

    /* JADX INFO: compiled from: Get.java */
    public static class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f133766a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        PrintStream f133767b;

        public e(PrintStream printStream) {
            this.f133767b = printStream;
        }

        @Override // org.apache.tools.ant.taskdefs.b2.b
        public void a() {
            this.f133767b.println();
            this.f133767b.flush();
        }

        @Override // org.apache.tools.ant.taskdefs.b2.b
        public void b() {
            this.f133767b.print(".");
            int i10 = this.f133766a;
            this.f133766a = i10 + 1;
            if (i10 > 50) {
                this.f133767b.flush();
                this.f133766a = 0;
            }
        }

        @Override // org.apache.tools.ant.taskdefs.b2.b
        public void c() {
            this.f133766a = 0;
        }
    }

    private void v2() {
        String str = this.f133749y;
        if (str == null || str.trim().isEmpty()) {
            throw new BuildException("userAgent may not be null or empty");
        }
        if (this.f133735k.size() == 0) {
            throw new BuildException("at least one source is required", w1());
        }
        Iterator<org.apache.tools.ant.types.s1> it = this.f133735k.iterator();
        while (it.hasNext()) {
            if (((org.apache.tools.ant.types.resources.p1) it.next().e2(org.apache.tools.ant.types.resources.p1.class)) == null) {
                throw new BuildException("Only URLProvider resources are supported", w1());
            }
        }
        File file = this.f133736l;
        if (file == null) {
            throw new BuildException("dest attribute is required", w1());
        }
        if (file.exists() && this.f133735k.size() > 1 && !this.f133736l.isDirectory()) {
            throw new BuildException("The specified destination is not a directory", w1());
        }
        if (this.f133736l.exists() && !this.f133736l.canWrite()) {
            throw new BuildException("Can't write to " + this.f133736l.getAbsolutePath(), w1());
        }
        if (this.f133735k.size() <= 1 || this.f133736l.exists()) {
            return;
        }
        this.f133736l.mkdirs();
    }

    public void A2(boolean z10) {
        this.f133746v = z10;
    }

    public void B2(boolean z10) {
        this.f133740p = z10;
    }

    public void C2(long j10) {
        this.f133743s = j10;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        v2();
        for (org.apache.tools.ant.types.s1 s1Var : this.f133735k) {
            URL url = ((org.apache.tools.ant.types.resources.p1) s1Var.e2(org.apache.tools.ant.types.resources.p1.class)).getURL();
            File file = this.f133736l;
            try {
                if (file.isDirectory()) {
                    org.apache.tools.ant.types.k0 k0Var = this.f133748x;
                    if (k0Var == null) {
                        String path = url.getPath();
                        if (path.endsWith("/")) {
                            path = path.substring(0, path.length() - 1);
                        }
                        int iLastIndexOf = path.lastIndexOf(47);
                        if (iLastIndexOf > -1) {
                            path = path.substring(iLastIndexOf + 1);
                        }
                        file = new File(this.f133736l, path);
                    } else {
                        String[] strArrY0 = k0Var.i2().y0(url.toString());
                        if (strArrY0 == null) {
                            x1("skipping " + s1Var + " - mapper can't handle it", 1);
                        } else if (strArrY0.length == 0) {
                            x1("skipping " + s1Var + " - mapper returns no file name", 1);
                        } else if (strArrY0.length > 1) {
                            x1("skipping " + s1Var + " - mapper returns multiple file names", 1);
                        } else {
                            file = new File(this.f133736l, strArrY0[0]);
                        }
                    }
                }
                y2(url, file, 2, this.f133737m ? new e(System.out) : null);
            } catch (IOException e10) {
                log("Error getting " + url + " to " + file);
                if (!this.f133740p) {
                    throw new BuildException(e10, w1());
                }
            }
        }
    }

    public void D2(String str) {
        this.f133742r = str;
    }

    public void E2(boolean z10) {
        this.f133738n = z10;
    }

    public void F2(int i10) {
        if (i10 <= 0) {
            x1("Setting retries to " + i10 + " will make the task not even try to reach the URI at all", 1);
        }
        this.f133744t = i10;
    }

    public void G2(boolean z10) {
        this.f133745u = z10;
    }

    public void H2(URL url) {
        s2(new org.apache.tools.ant.types.resources.s1(url));
    }

    public void I2(boolean z10) {
        this.f133747w = z10;
    }

    public void J2(boolean z10) {
        this.f133739o = z10;
    }

    public void K2(String str) {
        this.f133749y = str;
    }

    public void L2(String str) {
        this.f133741q = str;
    }

    public void M2(boolean z10) {
        this.f133737m = z10;
    }

    public void s2(org.apache.tools.ant.types.u1 u1Var) {
        this.f133735k.g2(u1Var);
    }

    public void t2(org.apache.tools.ant.util.g0 g0Var) {
        w2().e2(g0Var);
    }

    public void u2(org.apache.tools.ant.taskdefs.email.c cVar) {
        if (cVar != null) {
            String strM = org.apache.tools.ant.util.j2.m(cVar.a());
            String strM2 = org.apache.tools.ant.util.j2.m(cVar.b());
            if (strM == null || strM2 == null) {
                return;
            }
            this.f133750z.put(strM, strM2);
        }
    }

    public org.apache.tools.ant.types.k0 w2() throws BuildException {
        if (this.f133748x != null) {
            throw new BuildException(t1.f135751x, w1());
        }
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        this.f133748x = k0Var;
        return k0Var;
    }

    @Override // org.apache.tools.ant.u2, org.apache.tools.ant.b2
    public void x1(String str, int i10) {
        if (!this.f133738n || i10 <= 0) {
            super.x1(str, i10);
        }
    }

    @Deprecated
    public boolean x2(int i10, b bVar) throws IOException {
        v2();
        return y2(((org.apache.tools.ant.types.resources.p1) this.f133735k.iterator().next().e2(org.apache.tools.ant.types.resources.p1.class)).getURL(), this.f133736l, i10, bVar);
    }

    public boolean y2(URL url, File file, int i10, b bVar) throws IOException {
        long j10;
        boolean z10;
        if (file.exists() && this.f133745u) {
            x1("Destination already exists (skipping): " + file.getAbsolutePath(), i10);
            return true;
        }
        b dVar = bVar == null ? new d() : bVar;
        x1("Getting: " + url, i10);
        x1("To: " + file.getAbsolutePath(), i10);
        if (this.f133739o && file.exists()) {
            long jLastModified = file.lastModified();
            if (this.f133737m) {
                x1("local file date : " + new Date(jLastModified).toString(), i10);
            }
            j10 = jLastModified;
            z10 = true;
        } else {
            j10 = 0;
            z10 = false;
        }
        c cVar = new c(url, file, z10, j10, dVar, i10, this.f133749y);
        cVar.setDaemon(true);
        b().T0(cVar, this);
        cVar.start();
        try {
            cVar.join(this.f133743s * 1000);
        } catch (InterruptedException unused) {
            x1("interrupted waiting for GET to finish", 3);
        }
        if (!cVar.isAlive()) {
            return cVar.h();
        }
        String str = "The GET operation took longer than " + this.f133743s + " seconds, stopping it.";
        if (this.f133740p) {
            log(str);
        }
        cVar.a();
        if (this.f133740p) {
            return false;
        }
        throw new BuildException(str);
    }

    public void z2(File file) {
        this.f133736l = file;
    }
}
