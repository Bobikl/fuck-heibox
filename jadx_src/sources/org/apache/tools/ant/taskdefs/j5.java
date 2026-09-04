package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Rename.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class j5 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f134339n = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f134340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f134341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f134342m = true;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        log("DEPRECATED - The rename task is deprecated.  Use move instead.");
        File file = this.f134341l;
        if (file == null) {
            throw new BuildException("dest attribute is required", w1());
        }
        if (this.f134340k == null) {
            throw new BuildException("src attribute is required", w1());
        }
        if (!this.f134342m && file.exists()) {
            throw new BuildException(this.f134341l + " already exists.");
        }
        try {
            f134339n.m0(this.f134340k, this.f134341l);
        } catch (IOException e10) {
            throw new BuildException("Unable to rename " + this.f134340k + " to " + this.f134341l, e10, w1());
        }
    }

    public void i2(File file) {
        this.f134341l = file;
    }

    public void j2(String str) {
        this.f134342m = Project.t1(str);
    }

    public void k2(File file) {
        this.f134340k = file;
    }
}
