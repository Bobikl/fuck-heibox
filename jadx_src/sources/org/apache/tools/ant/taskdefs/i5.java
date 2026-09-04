package org.apache.tools.ant.taskdefs;

import com.umeng.analytics.pro.ak;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Redirector.java */
/* JADX INFO: loaded from: classes5.dex */
public class i5 {
    private static final int I = 1000;
    private static final String J = System.getProperty("file.encoding");
    private String A;
    private boolean B;
    private final ThreadGroup C;
    private boolean D;
    private final Object E;
    private final Object F;
    private final Object G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File[] f134270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File[] f134271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File[] f134272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f134273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f134274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f134275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f134276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f134277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f134278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f134279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f134280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f134281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f134282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f134283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f134284o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final org.apache.tools.ant.b2 f134285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private OutputStream f134286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OutputStream f134287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InputStream f134288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PrintStream f134289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PrintStream f134290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Vector<org.apache.tools.ant.types.c0> f134291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Vector<org.apache.tools.ant.types.c0> f134292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Vector<org.apache.tools.ant.types.c0> f134293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f134294y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f134295z;

    /* JADX INFO: compiled from: Redirector.java */
    public class a extends ByteArrayOutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f134296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f134297c = false;

        a(String str) {
            this.f134296b = str;
        }

        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (i5.this.F) {
                if (!this.f134297c && (!i5.this.f134279j || !i5.this.B)) {
                    i5.this.Q(this, this.f134296b);
                    this.f134297c = true;
                }
            }
        }
    }

    public i5(org.apache.tools.ant.b2 b2Var) {
        this.f134273d = false;
        this.f134274e = null;
        this.f134275f = null;
        this.f134279j = false;
        this.f134280k = false;
        this.f134281l = false;
        this.f134282m = false;
        this.f134283n = true;
        this.f134284o = true;
        this.f134286q = null;
        this.f134287r = null;
        this.f134288s = null;
        this.f134289t = null;
        this.f134290u = null;
        String str = J;
        this.f134294y = str;
        this.f134295z = str;
        this.A = str;
        this.B = true;
        this.C = new ThreadGroup("redirector");
        this.D = true;
        this.E = new Object();
        this.F = new Object();
        this.G = new Object();
        this.H = false;
        this.f134285p = b2Var;
    }

    public i5(org.apache.tools.ant.u2 u2Var) {
        this((org.apache.tools.ant.b2) u2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(ByteArrayOutputStream byteArrayOutputStream, String str) {
        this.f134285p.b().n1(str, (String) new BufferedReader(new StringReader(n1.G(byteArrayOutputStream))).lines().collect(Collectors.joining(System.lineSeparator())));
    }

    private void h() {
        OutputStream outputStream;
        File[] fileArr = this.f134272c;
        if (fileArr != null && fileArr.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error ");
            sb2.append(this.f134280k ? "appended" : "redirected");
            sb2.append(" to ");
            this.f134287r = i(this.f134272c, sb2.toString(), 3, this.f134280k, this.f134284o);
        } else if (!this.f134273d && (outputStream = this.f134286q) != null && this.f134277h == null) {
            org.apache.tools.ant.util.d1 d1Var = new org.apache.tools.ant.util.d1(outputStream, 0L);
            try {
                this.f134286q = d1Var.g();
                this.f134287r = d1Var.g();
                if (!this.H) {
                    this.f134286q = new org.apache.tools.ant.util.y0(this.f134286q);
                    this.f134287r = new org.apache.tools.ant.util.y0(this.f134287r);
                }
            } catch (IOException e10) {
                throw new BuildException("error splitting output/error streams", e10);
            }
        }
        if (this.f134277h == null) {
            this.f134275f = null;
            return;
        }
        if (this.f134275f == null) {
            this.f134275f = new a(this.f134277h);
            this.f134285p.x1("Error redirected to property: " + this.f134277h, 3);
        }
        OutputStream u0Var = new org.apache.tools.ant.util.u0(this.f134275f);
        File[] fileArr2 = this.f134272c;
        if (fileArr2 != null && fileArr2.length != 0) {
            u0Var = new org.apache.tools.ant.util.n2(this.f134287r, u0Var);
        }
        this.f134287r = u0Var;
    }

    private OutputStream i(File[] fileArr, String str, int i10, boolean z10, boolean z11) {
        org.apache.tools.ant.util.v0 v0Var = new org.apache.tools.ant.util.v0(fileArr[0], z10, z11);
        this.f134285p.x1(str + fileArr[0], i10);
        char[] cArr = new char[str.length()];
        Arrays.fill(cArr, ' ');
        String str2 = new String(cArr);
        for (int i11 = 1; i11 < fileArr.length; i11++) {
            this.f134286q = new org.apache.tools.ant.util.n2(this.f134286q, new org.apache.tools.ant.util.v0(fileArr[i11], z10, z11));
            this.f134285p.x1(str2 + fileArr[i11], i10);
        }
        return v0Var;
    }

    private void r() {
        File[] fileArr = this.f134271b;
        if (fileArr != null && fileArr.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Output ");
            sb2.append(this.f134279j ? "appended" : "redirected");
            sb2.append(" to ");
            this.f134286q = i(this.f134271b, sb2.toString(), 3, this.f134279j, this.f134283n);
        }
        if (this.f134276g == null) {
            this.f134274e = null;
            return;
        }
        if (this.f134274e == null) {
            this.f134274e = new a(this.f134276g);
            this.f134285p.x1("Output redirected to property: " + this.f134276g, 3);
        }
        OutputStream u0Var = new org.apache.tools.ant.util.u0(this.f134274e);
        if (this.f134286q != null) {
            u0Var = new org.apache.tools.ant.util.n2(this.f134286q, u0Var);
        }
        this.f134286q = u0Var;
    }

    public void A(Vector<org.apache.tools.ant.types.c0> vector) {
        synchronized (this.G) {
            this.f134292w = vector;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d A[Catch: all -> 0x0014, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x0012, B:7:0x000d), top: B:13:0x0005 }] */
    public void B(String str) {
        synchronized (this.G) {
            if (str == null) {
                this.f134277h = str;
                this.f134275f = null;
            } else if (!str.equals(this.f134277h)) {
                this.f134277h = str;
                this.f134275f = null;
            }
            throw th;
        }
    }

    public void C(File file) {
        D(file == null ? null : new File[]{file});
    }

    public void D(File[] fileArr) {
        synchronized (this.E) {
            try {
                if (fileArr == null) {
                    this.f134270a = null;
                } else {
                    this.f134270a = (File[]) fileArr.clone();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(String str) {
        if (str == null) {
            throw new IllegalArgumentException("inputEncoding must not be null");
        }
        synchronized (this.E) {
            this.A = str;
        }
    }

    public void F(Vector<org.apache.tools.ant.types.c0> vector) {
        synchronized (this.E) {
            this.f134293x = vector;
        }
    }

    void G(InputStream inputStream) {
        synchronized (this.E) {
            this.f134288s = inputStream;
        }
    }

    public void H(String str) {
        synchronized (this.E) {
            this.f134278i = str;
        }
    }

    public void I(boolean z10) {
        synchronized (this.G) {
            this.f134273d = z10;
        }
    }

    public void J(boolean z10) {
        this.D = z10;
    }

    public void K(File file) {
        L(file == null ? null : new File[]{file});
    }

    public void L(File[] fileArr) {
        synchronized (this.F) {
            try {
                if (fileArr == null) {
                    this.f134271b = null;
                } else {
                    this.f134271b = (File[]) fileArr.clone();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void M(String str) {
        if (str == null) {
            throw new IllegalArgumentException("outputEncoding must not be null");
        }
        synchronized (this.F) {
            this.f134294y = str;
        }
    }

    public void N(Vector<org.apache.tools.ant.types.c0> vector) {
        synchronized (this.F) {
            this.f134291v = vector;
        }
    }

    public void O(String str) {
        if (str == null || !str.equals(this.f134276g)) {
            synchronized (this.F) {
                this.f134276g = str;
                this.f134274e = null;
            }
        }
    }

    public void P() {
        synchronized (this.F) {
            org.apache.tools.ant.util.j0.d(this.f134274e);
        }
        synchronized (this.G) {
            org.apache.tools.ant.util.j0.d(this.f134275f);
        }
    }

    public void e() throws IOException {
        System.out.flush();
        System.err.flush();
        synchronized (this.E) {
            InputStream inputStream = this.f134288s;
            if (inputStream != null) {
                inputStream.close();
            }
        }
        synchronized (this.F) {
            this.f134286q.flush();
            this.f134286q.close();
        }
        synchronized (this.G) {
            this.f134287r.flush();
            this.f134287r.close();
        }
        synchronized (this) {
            while (this.C.activeCount() > 0) {
                try {
                    this.f134285p.x1("waiting for " + this.C.activeCount() + " Threads:", 4);
                    int iActiveCount = this.C.activeCount();
                    Thread[] threadArr = new Thread[iActiveCount];
                    this.C.enumerate(threadArr);
                    for (int i10 = 0; i10 < iActiveCount; i10++) {
                        Thread thread = threadArr[i10];
                        if (thread == null) {
                            break;
                        }
                        try {
                            this.f134285p.x1(thread.toString(), 4);
                        } catch (NullPointerException unused) {
                        }
                    }
                    wait(1000L);
                } catch (InterruptedException unused2) {
                    int iActiveCount2 = this.C.activeCount();
                    Thread[] threadArr2 = new Thread[iActiveCount2];
                    this.C.enumerate(threadArr2);
                    for (int i11 = 0; i11 < iActiveCount2; i11++) {
                        Thread thread2 = threadArr2[i11];
                        if (thread2 == null) {
                            break;
                        }
                        thread2.interrupt();
                    }
                }
            }
        }
        P();
        synchronized (this.E) {
            this.f134288s = null;
        }
        synchronized (this.F) {
            this.f134286q = null;
            this.f134289t = null;
        }
        synchronized (this.G) {
            this.f134287r = null;
            this.f134290u = null;
        }
    }

    public q1 f() throws BuildException {
        g();
        return new d5(l(), j(), k(), this.f134270a == null && this.f134278i == null);
    }

    public void g() {
        Vector<org.apache.tools.ant.types.c0> vector;
        synchronized (this.F) {
            r();
            if (this.f134281l || this.f134286q == null) {
                OutputStream r3Var = new r3(this.f134285p, 2);
                if (this.f134286q != null) {
                    r3Var = new org.apache.tools.ant.util.n2(r3Var, this.f134286q);
                }
                this.f134286q = r3Var;
            }
            Vector<org.apache.tools.ant.types.c0> vector2 = this.f134291v;
            if ((vector2 != null && vector2.size() > 0) || !this.f134294y.equalsIgnoreCase(this.A)) {
                try {
                    org.apache.tools.ant.util.w0 w0Var = new org.apache.tools.ant.util.w0();
                    w0Var.c(this.f134285p);
                    Reader inputStreamReader = new InputStreamReader(w0Var, this.A);
                    Vector<org.apache.tools.ant.types.c0> vector3 = this.f134291v;
                    if (vector3 != null && vector3.size() > 0) {
                        org.apache.tools.ant.filters.util.i iVar = new org.apache.tools.ant.filters.util.i();
                        iVar.n(this.f134285p.b());
                        iVar.m(inputStreamReader);
                        iVar.l(this.f134291v);
                        inputStreamReader = iVar.f();
                    }
                    Thread thread = new Thread(this.C, new k6(new org.apache.tools.ant.util.i1(inputStreamReader, this.f134294y), this.f134286q, true), "output pumper");
                    thread.setPriority(10);
                    this.f134286q = new PipedOutputStream(w0Var);
                    thread.start();
                } catch (IOException e10) {
                    throw new BuildException("error setting up output stream", e10);
                }
            }
        }
        synchronized (this.G) {
            h();
            if (this.f134282m || this.f134287r == null) {
                OutputStream r3Var2 = new r3(this.f134285p, 1);
                if (this.f134287r != null) {
                    r3Var2 = new org.apache.tools.ant.util.n2(r3Var2, this.f134287r);
                }
                this.f134287r = r3Var2;
            }
            Vector<org.apache.tools.ant.types.c0> vector4 = this.f134292w;
            if ((vector4 != null && vector4.size() > 0) || !this.f134295z.equalsIgnoreCase(this.A)) {
                try {
                    org.apache.tools.ant.util.w0 w0Var2 = new org.apache.tools.ant.util.w0();
                    w0Var2.c(this.f134285p);
                    Reader inputStreamReader2 = new InputStreamReader(w0Var2, this.A);
                    Vector<org.apache.tools.ant.types.c0> vector5 = this.f134292w;
                    if (vector5 != null && vector5.size() > 0) {
                        org.apache.tools.ant.filters.util.i iVar2 = new org.apache.tools.ant.filters.util.i();
                        iVar2.n(this.f134285p.b());
                        iVar2.m(inputStreamReader2);
                        iVar2.l(this.f134292w);
                        inputStreamReader2 = iVar2.f();
                    }
                    Thread thread2 = new Thread(this.C, new k6(new org.apache.tools.ant.util.i1(inputStreamReader2, this.f134295z), this.f134287r, true), "error pumper");
                    thread2.setPriority(10);
                    this.f134287r = new PipedOutputStream(w0Var2);
                    thread2.start();
                } catch (IOException e11) {
                    throw new BuildException("error setting up error stream", e11);
                }
            }
        }
        synchronized (this.E) {
            File[] fileArr = this.f134270a;
            if (fileArr != null && fileArr.length > 0) {
                org.apache.tools.ant.b2 b2Var = this.f134285p;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Redirecting input from file");
                sb2.append(this.f134270a.length == 1 ? "" : ak.aB);
                b2Var.x1(sb2.toString(), 3);
                try {
                    org.apache.tools.ant.util.t tVar = new org.apache.tools.ant.util.t(this.f134270a);
                    this.f134288s = tVar;
                    tVar.e(this.f134285p);
                } catch (IOException e12) {
                    throw new BuildException(e12);
                }
            } else if (this.f134278i != null) {
                StringBuffer stringBuffer = new StringBuffer("Using input ");
                if (this.D) {
                    stringBuffer.append(kotlin.text.y.f128593b);
                    stringBuffer.append(this.f134278i);
                    stringBuffer.append(kotlin.text.y.f128593b);
                } else {
                    stringBuffer.append(androidx.constraintlayout.core.motion.utils.w.b.f17895e);
                }
                this.f134285p.x1(stringBuffer.toString(), 3);
                this.f134288s = new ByteArrayInputStream(this.f134278i.getBytes());
            }
            if (this.f134288s != null && (vector = this.f134293x) != null && vector.size() > 0) {
                org.apache.tools.ant.filters.util.i iVar3 = new org.apache.tools.ant.filters.util.i();
                iVar3.n(this.f134285p.b());
                try {
                    iVar3.m(new InputStreamReader(this.f134288s, this.A));
                    iVar3.l(this.f134293x);
                    this.f134288s = new org.apache.tools.ant.util.i1(iVar3.f(), this.A);
                } catch (IOException e13) {
                    throw new BuildException("error setting up input stream", e13);
                }
            }
        }
    }

    public OutputStream j() {
        OutputStream outputStream;
        synchronized (this.G) {
            outputStream = this.f134287r;
        }
        return outputStream;
    }

    public InputStream k() {
        InputStream inputStream;
        synchronized (this.E) {
            inputStream = this.f134288s;
        }
        return inputStream;
    }

    public OutputStream l() {
        OutputStream outputStream;
        synchronized (this.F) {
            outputStream = this.f134286q;
        }
        return outputStream;
    }

    protected void m(String str) {
        synchronized (this.G) {
            if (this.f134290u == null) {
                this.f134290u = new PrintStream(this.f134287r);
            }
            this.f134290u.print(str);
            this.f134290u.flush();
        }
    }

    protected void n(String str) {
        synchronized (this.G) {
            if (this.f134290u == null) {
                this.f134290u = new PrintStream(this.f134287r);
            }
            this.f134290u.print(str);
        }
    }

    protected void o(String str) {
        synchronized (this.F) {
            if (this.f134289t == null) {
                this.f134289t = new PrintStream(this.f134286q);
            }
            this.f134289t.print(str);
            this.f134289t.flush();
        }
    }

    protected int p(byte[] bArr, int i10, int i11) throws IOException {
        synchronized (this.E) {
            InputStream inputStream = this.f134288s;
            if (inputStream == null) {
                return this.f134285p.b().D(bArr, i10, i11);
            }
            return inputStream.read(bArr, i10, i11);
        }
    }

    protected void q(String str) {
        synchronized (this.F) {
            if (this.f134289t == null) {
                this.f134289t = new PrintStream(this.f134286q);
            }
            this.f134289t.print(str);
        }
    }

    public void s(boolean z10) {
        synchronized (this.F) {
            this.f134281l = z10;
        }
        synchronized (this.G) {
            this.f134282m = z10;
        }
    }

    public void t(boolean z10) {
        synchronized (this.F) {
            this.f134279j = z10;
        }
        synchronized (this.G) {
            this.f134280k = z10;
        }
    }

    public void u(boolean z10) {
        synchronized (this.F) {
            this.B = z10;
        }
    }

    public void v(boolean z10) {
        this.H = z10;
    }

    public void w(boolean z10) {
        synchronized (this.F) {
            this.f134283n = z10;
        }
        synchronized (this.F) {
            this.f134284o = z10;
        }
    }

    public void x(File file) {
        y(file == null ? null : new File[]{file});
    }

    public void y(File[] fileArr) {
        synchronized (this.G) {
            try {
                if (fileArr == null) {
                    this.f134272c = null;
                } else {
                    this.f134272c = (File[]) fileArr.clone();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(String str) {
        if (str == null) {
            throw new IllegalArgumentException("errorEncoding must not be null");
        }
        synchronized (this.G) {
            this.f134295z = str;
        }
    }
}
