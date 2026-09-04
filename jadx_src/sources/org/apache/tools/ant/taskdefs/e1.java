package org.apache.tools.ant.taskdefs;

import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Dirname.java */
/* JADX INFO: loaded from: classes5.dex */
public class e1 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f134076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134077l;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f134077l == null) {
            throw new BuildException("property attribute required", w1());
        }
        if (this.f134076k == null) {
            throw new BuildException("file attribute required", w1());
        }
        b().n1(this.f134077l, this.f134076k.getParent());
    }

    public void i2(File file) {
        this.f134076k = file;
    }

    public void j2(String str) {
        this.f134077l = str;
    }
}
