package org.apache.tools.ant.util;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: WorkerAnt.java */
/* JADX INFO: loaded from: classes5.dex */
public class w2 extends Thread {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f136971g = "No task defined";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.apache.tools.ant.u2 f136972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f136973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f136974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile BuildException f136975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Throwable f136976f;

    public w2(org.apache.tools.ant.u2 u2Var) {
        this(u2Var, null);
    }

    public w2(org.apache.tools.ant.u2 u2Var, Object obj) {
        this.f136974d = false;
        this.f136972b = u2Var;
        this.f136973c = obj == null ? this : obj;
    }

    private synchronized void a(Throwable th2) {
        this.f136976f = th2;
        this.f136975e = th2 instanceof BuildException ? (BuildException) th2 : new BuildException(th2);
    }

    public synchronized BuildException b() {
        return this.f136975e;
    }

    public synchronized Throwable c() {
        return this.f136976f;
    }

    public org.apache.tools.ant.u2 d() {
        return this.f136972b;
    }

    public synchronized boolean e() {
        return this.f136974d;
    }

    public void f() {
        BuildException buildExceptionB = b();
        if (buildExceptionB != null) {
            throw buildExceptionB;
        }
    }

    public void g(long j10) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis() + j10;
        synchronized (this.f136973c) {
            for (long jCurrentTimeMillis2 = System.currentTimeMillis(); !this.f136974d && jCurrentTimeMillis2 < jCurrentTimeMillis; jCurrentTimeMillis2 = System.currentTimeMillis()) {
                this.f136973c.wait(jCurrentTimeMillis - jCurrentTimeMillis2);
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            org.apache.tools.ant.u2 u2Var = this.f136972b;
            if (u2Var != null) {
                u2Var.D1();
            }
            synchronized (this.f136973c) {
                this.f136974d = true;
                this.f136973c.notifyAll();
            }
        } catch (Throwable th2) {
            try {
                a(th2);
            } finally {
                synchronized (this.f136973c) {
                    this.f136974d = true;
                    this.f136973c.notifyAll();
                }
            }
        }
    }
}
