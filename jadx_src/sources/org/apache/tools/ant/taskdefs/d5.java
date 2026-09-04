package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PumpStreamHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class d5 implements q1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f134043i = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f134044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f134045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Thread f134046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OutputStream f134047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OutputStream f134048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f134049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f134050h;

    /* JADX INFO: compiled from: PumpStreamHandler.java */
    public static class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k6 f134051b;

        public a(k6 k6Var) {
            super(k6Var);
            this.f134051b = k6Var;
        }

        protected k6 a() {
            return this.f134051b;
        }
    }

    public d5() {
        this(System.out, System.err);
    }

    public d5(OutputStream outputStream) {
        this(outputStream, outputStream);
    }

    public d5(OutputStream outputStream, OutputStream outputStream2) {
        this(outputStream, outputStream2, null);
    }

    public d5(OutputStream outputStream, OutputStream outputStream2, InputStream inputStream) {
        this(outputStream, outputStream2, inputStream, false);
    }

    public d5(OutputStream outputStream, OutputStream outputStream2, InputStream inputStream, boolean z10) {
        if (outputStream == null) {
            throw new NullPointerException("out must not be null");
        }
        if (outputStream2 == null) {
            throw new NullPointerException("err must not be null");
        }
        this.f134047e = outputStream;
        this.f134048f = outputStream2;
        this.f134049g = inputStream;
        this.f134050h = z10;
    }

    private void i(Thread thread) {
        if (thread != null) {
            thread.start();
        }
    }

    protected void a(InputStream inputStream, OutputStream outputStream) {
        this.f134045c = c(inputStream, outputStream);
    }

    protected void b(InputStream inputStream, OutputStream outputStream) {
        this.f134044b = c(inputStream, outputStream);
    }

    protected Thread c(InputStream inputStream, OutputStream outputStream) {
        return d(inputStream, outputStream, false);
    }

    protected Thread d(InputStream inputStream, OutputStream outputStream, boolean z10) {
        return e(inputStream, outputStream, z10, true);
    }

    protected Thread e(InputStream inputStream, OutputStream outputStream, boolean z10, boolean z11) {
        k6 k6Var = new k6(inputStream, outputStream, z10, z11);
        k6Var.e(true);
        a aVar = new a(k6Var);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void e1(InputStream inputStream) {
        a(inputStream, this.f134048f);
    }

    protected final void f(Thread thread) {
        if (thread == null) {
            return;
        }
        try {
            k6.a aVarG = null;
            k6 k6VarA = thread instanceof a ? ((a) thread).a() : null;
            if ((k6VarA != null && k6VarA.d()) || !thread.isAlive()) {
                return;
            }
            if (k6VarA != null && !k6VarA.d()) {
                aVarG = k6VarA.g();
            }
            if (aVarG != null && aVarG.d()) {
                aVarG.c(2L, TimeUnit.SECONDS);
            }
            while (true) {
                if ((k6VarA != null && k6VarA.d()) || !thread.isAlive()) {
                    return;
                }
                thread.interrupt();
                thread.join(f134043i);
            }
        } catch (InterruptedException unused) {
        }
    }

    protected OutputStream g() {
        return this.f134048f;
    }

    protected OutputStream h() {
        return this.f134047e;
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void o1(OutputStream outputStream) {
        InputStream inputStream = this.f134049g;
        if (inputStream != null) {
            this.f134046d = e(inputStream, outputStream, true, this.f134050h);
        } else {
            org.apache.tools.ant.util.j0.d(outputStream);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void q1(InputStream inputStream) {
        b(inputStream, this.f134047e);
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void start() {
        i(this.f134044b);
        i(this.f134045c);
        i(this.f134046d);
    }

    @Override // org.apache.tools.ant.taskdefs.q1
    public void stop() {
        f(this.f134046d);
        try {
            this.f134048f.flush();
        } catch (IOException unused) {
        }
        try {
            this.f134047e.flush();
        } catch (IOException unused2) {
        }
        f(this.f134044b);
        f(this.f134045c);
    }
}
