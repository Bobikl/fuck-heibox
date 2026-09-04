package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Retry.java */
/* JADX INFO: loaded from: classes5.dex */
public class s5 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.x2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.u2 f135742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f135743l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f135744m = 0;

    @Override // org.apache.tools.ant.u2
    public void D1() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 <= this.f135743l; i10++) {
            try {
                this.f135742k.b2();
                return;
            } catch (Exception e10) {
                sb2.append(e10.getMessage());
                if (i10 >= this.f135743l) {
                    throw new BuildException(String.format("Task [%s] failed after [%d] attempts; giving up.%nError messages:%n%s", this.f135742k.K1(), Integer.valueOf(this.f135743l), sb2), w1());
                }
                X1(this.f135744m > 0 ? "Attempt [" + i10 + "]: error occurred; retrying after " + this.f135744m + " ms..." : "Attempt [" + i10 + "]: error occurred; retrying...", e10, 2);
                sb2.append(System.lineSeparator());
                int i11 = this.f135744m;
                if (i11 > 0) {
                    try {
                        Thread.sleep(i11);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    @Override // org.apache.tools.ant.x2
    public synchronized void c1(org.apache.tools.ant.u2 u2Var) {
        if (this.f135742k != null) {
            throw new BuildException("The retry task container accepts a single nested task (which may be a sequential task container)");
        }
        this.f135742k = u2Var;
    }

    public void i2(int i10) {
        this.f135743l = i10;
    }

    public void j2(int i10) {
        if (i10 < 0) {
            throw new BuildException("retryDelay must be a non-negative number");
        }
        this.f135744m = i10;
    }
}
