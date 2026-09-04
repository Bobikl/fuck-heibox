package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Nice.java */
/* JADX INFO: loaded from: classes5.dex */
public class l4 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f134459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134460l;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        Thread threadCurrentThread = Thread.currentThread();
        int priority = threadCurrentThread.getPriority();
        if (this.f134460l != null) {
            b().n1(this.f134460l, Integer.toString(priority));
        }
        Integer num = this.f134459k;
        if (num == null || priority == num.intValue()) {
            return;
        }
        try {
            threadCurrentThread.setPriority(this.f134459k.intValue());
        } catch (IllegalArgumentException e10) {
            throw new BuildException("Priority out of range", e10);
        } catch (SecurityException unused) {
            x1("Unable to set new priority -a security manager is in the way", 1);
        }
    }

    public void i2(String str) {
        this.f134460l = str;
    }

    public void j2(int i10) {
        if (i10 < 1 || i10 > 10) {
            throw new BuildException("The thread priority is out of the range 1-10");
        }
        this.f134459k = Integer.valueOf(i10);
    }
}
