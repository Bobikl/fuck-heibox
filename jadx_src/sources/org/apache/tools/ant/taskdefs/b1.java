package org.apache.tools.ant.taskdefs;

import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Deltree.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class b1 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f133734k;

    private void i2(File file) {
        for (String str : file.list()) {
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                i2(file2);
            } else if (!file2.delete()) {
                throw new BuildException("Unable to delete file " + file2.getAbsolutePath());
            }
        }
        if (file.delete()) {
            return;
        }
        throw new BuildException("Unable to delete directory " + file.getAbsolutePath());
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        log("DEPRECATED - The deltree task is deprecated.  Use delete instead.");
        File file = this.f133734k;
        if (file == null) {
            throw new BuildException("dir attribute must be set!", w1());
        }
        if (file.exists()) {
            if (this.f133734k.isDirectory()) {
                log("Deleting: " + this.f133734k.getAbsolutePath());
                i2(this.f133734k);
                return;
            }
            if (this.f133734k.delete()) {
                return;
            }
            throw new BuildException("Unable to delete directory " + this.f133734k.getAbsolutePath(), w1());
        }
    }

    public void j2(File file) {
        this.f133734k = file;
    }
}
