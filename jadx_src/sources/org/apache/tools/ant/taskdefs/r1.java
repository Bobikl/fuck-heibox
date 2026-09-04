package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ExecuteWatchdog.java */
/* JADX INFO: loaded from: classes5.dex */
public class r1 implements org.apache.tools.ant.util.o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Process f135658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f135659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Exception f135660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f135661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.apache.tools.ant.util.u2 f135662f;

    @Deprecated
    public r1(int i10) {
        this(i10);
    }

    public r1(long j10) {
        this.f135659c = false;
        this.f135660d = null;
        this.f135661e = false;
        org.apache.tools.ant.util.u2 u2Var = new org.apache.tools.ant.util.u2(j10);
        this.f135662f = u2Var;
        u2Var.b(this);
    }

    @Override // org.apache.tools.ant.util.o2
    public synchronized void a(org.apache.tools.ant.util.u2 u2Var) {
        try {
            try {
                try {
                    this.f135658b.exitValue();
                } catch (IllegalThreadStateException unused) {
                    if (this.f135659c) {
                        this.f135661e = true;
                        this.f135658b.destroy();
                    }
                }
            } catch (Exception e10) {
                this.f135660d = e10;
            }
            c();
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public synchronized void b() throws BuildException {
        if (this.f135660d != null) {
            throw new BuildException("Exception in ExecuteWatchdog.run: " + this.f135660d.getMessage(), this.f135660d);
        }
    }

    protected synchronized void c() {
        this.f135659c = false;
        this.f135658b = null;
    }

    public boolean d() {
        return this.f135659c;
    }

    public boolean e() {
        return this.f135661e;
    }

    public synchronized void f(Process process) {
        try {
            if (process == null) {
                throw new NullPointerException("process is null.");
            }
            if (this.f135658b != null) {
                throw new IllegalStateException("Already running.");
            }
            this.f135660d = null;
            this.f135661e = false;
            this.f135659c = true;
            this.f135658b = process;
            this.f135662f.f();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void g() {
        this.f135662f.g();
        c();
    }
}
