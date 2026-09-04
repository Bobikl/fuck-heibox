package org.apache.tools.ant.taskdefs;

import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Mkdir.java */
/* JADX INFO: loaded from: classes5.dex */
public class i4 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f134268l = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f134269k;

    private boolean j2(File file) {
        if (file.mkdirs()) {
            return true;
        }
        try {
            Thread.sleep(10L);
            return file.mkdirs();
        } catch (InterruptedException unused) {
            return file.mkdirs();
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f134269k;
        if (file == null) {
            throw new BuildException("dir attribute is required", w1());
        }
        if (file.isFile()) {
            throw new BuildException("Unable to create directory as a file already exists with that name: %s", this.f134269k.getAbsolutePath());
        }
        if (this.f134269k.exists()) {
            x1("Skipping " + this.f134269k.getAbsolutePath() + " because it already exists.", 3);
            return;
        }
        if (j2(this.f134269k)) {
            log("Created dir: " + this.f134269k.getAbsolutePath());
            return;
        }
        if (this.f134269k.exists()) {
            x1("A different process or task has already created dir " + this.f134269k.getAbsolutePath(), 3);
            return;
        }
        throw new BuildException("Directory " + this.f134269k.getAbsolutePath() + " creation was not successful for an unknown reason", w1());
    }

    public File i2() {
        return this.f134269k;
    }

    public void k2(File file) {
        this.f134269k = file;
    }
}
