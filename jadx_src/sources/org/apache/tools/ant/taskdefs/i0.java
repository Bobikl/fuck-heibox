package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: CommandLauncherTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class i0 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f134245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.launcher.c f134246l;

    @Override // org.apache.tools.ant.u2
    public void D1() {
        if (this.f134246l != null) {
            if (this.f134245k) {
                org.apache.tools.ant.taskdefs.launcher.c.l(b(), this.f134246l);
            } else {
                org.apache.tools.ant.taskdefs.launcher.c.k(b(), this.f134246l);
            }
        }
    }

    public synchronized void i2(org.apache.tools.ant.taskdefs.launcher.c cVar) {
        if (this.f134246l != null) {
            throw new BuildException("Only one CommandLauncher can be installed");
        }
        this.f134246l = cVar;
    }

    public void j2(boolean z10) {
        this.f134245k = z10;
    }
}
