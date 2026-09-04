package org.apache.tools.ant.taskdefs;

import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Basename.java */
/* JADX INFO: loaded from: classes5.dex */
public class u extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135807m;

    private String i2(String str, String str2) {
        if (str2 == null || !str.endsWith(str2)) {
            return str;
        }
        int length = str.length() - str2.length();
        if (str2.charAt(0) != '.' && length > 0 && str.charAt(length - 1) == '.') {
            length--;
        }
        return str.substring(0, length);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f135806l == null) {
            throw new BuildException("property attribute required", w1());
        }
        if (this.f135805k == null) {
            throw new BuildException("file attribute required", w1());
        }
        b().n1(this.f135806l, i2(this.f135805k.getName(), this.f135807m));
    }

    public void j2(File file) {
        this.f135805k = file;
    }

    public void k2(String str) {
        this.f135806l = str;
    }

    public void l2(String str) {
        this.f135807m = str;
    }
}
