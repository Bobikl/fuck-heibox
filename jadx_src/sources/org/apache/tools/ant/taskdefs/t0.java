package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Copyfile.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class t0 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f135748m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135749n = false;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        log("DEPRECATED - The copyfile task is deprecated.  Use copy instead.");
        File file = this.f135746k;
        if (file == null) {
            throw new BuildException("The src attribute must be present.", w1());
        }
        if (!file.exists()) {
            throw new BuildException("src " + this.f135746k.toString() + org.apache.tools.ant.v0.I, w1());
        }
        File file2 = this.f135747l;
        if (file2 == null) {
            throw new BuildException("The dest attribute must be present.", w1());
        }
        if (this.f135746k.equals(file2)) {
            x1("Warning: src == dest", 1);
        }
        if (this.f135749n || this.f135746k.lastModified() > this.f135747l.lastModified()) {
            try {
                b().q(this.f135746k, this.f135747l, this.f135748m, this.f135749n);
            } catch (IOException e10) {
                throw new BuildException("Error copying file: " + this.f135746k.getAbsolutePath() + " due to " + e10.getMessage());
            }
        }
    }

    public void i2(File file) {
        this.f135747l = file;
    }

    public void j2(String str) {
        this.f135748m = Project.t1(str);
    }

    public void k2(boolean z10) {
        this.f135749n = z10;
    }

    public void l2(File file) {
        this.f135746k = file;
    }
}
