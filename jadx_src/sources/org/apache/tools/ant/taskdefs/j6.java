package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Sleep.java */
/* JADX INFO: loaded from: classes5.dex */
public class j6 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f134343k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f134344l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f134345m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f134346n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f134347o = 0;

    private long j2() {
        return (((((((long) this.f134345m) * 60) + ((long) this.f134346n)) * 60) + ((long) this.f134344l)) * 1000) + ((long) this.f134347o);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        try {
            p2();
            long jJ2 = j2();
            x1("sleeping for " + jJ2 + " milliseconds", 3);
            i2(jJ2);
        } catch (Exception e10) {
            if (this.f134343k) {
                throw new BuildException(e10);
            }
            x1(e10.toString(), 0);
        }
    }

    public void i2(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    public void k2(boolean z10) {
        this.f134343k = z10;
    }

    public void l2(int i10) {
        this.f134345m = i10;
    }

    public void m2(int i10) {
        this.f134347o = i10;
    }

    public void n2(int i10) {
        this.f134346n = i10;
    }

    public void o2(int i10) {
        this.f134344l = i10;
    }

    public void p2() throws BuildException {
        if (j2() < 0) {
            throw new BuildException("Negative sleep periods are not supported");
        }
    }
}
