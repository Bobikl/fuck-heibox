package org.apache.tools.ant.taskdefs;

import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Unpack.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class l7 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected File f134462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected File f134463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected org.apache.tools.ant.types.s1 f134464m;

    private void j2(String str) {
        File file = this.f134462k;
        String strM2 = file == null ? m2(this.f134464m) : file.getName();
        int length = strM2.length();
        if (str == null || length <= str.length() || !str.equalsIgnoreCase(strM2.substring(length - str.length()))) {
            this.f134463l = new File(this.f134463l, strM2);
        } else {
            this.f134463l = new File(this.f134463l, strM2.substring(0, length - str.length()));
        }
    }

    private String m2(org.apache.tools.ant.types.s1 s1Var) {
        String strK2 = s1Var.k2();
        int iLastIndexOf = strK2.lastIndexOf(47);
        return iLastIndexOf < 0 ? strK2 : strK2.substring(iLastIndexOf + 1);
    }

    private void t2() throws BuildException {
        if (this.f134464m == null) {
            throw new BuildException("No Src specified", w1());
        }
        if (this.f134463l == null) {
            if (this.f134462k == null) {
                throw new BuildException("dest is required when using a non-filesystem source", w1());
            }
            this.f134463l = new File(this.f134462k.getParent());
        }
        if (this.f134463l.isDirectory()) {
            j2(l2());
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f134463l;
        try {
            t2();
            k2();
        } finally {
            this.f134463l = file;
        }
    }

    public void i2(org.apache.tools.ant.types.u1 u1Var) {
        if (u1Var.size() != 1) {
            throw new BuildException("only single argument resource collections are supported as archives");
        }
        r2(u1Var.iterator().next());
    }

    protected abstract void k2();

    protected abstract String l2();

    public void n2(File file) {
        this.f134463l = file;
    }

    @Deprecated
    public void o2(String str) {
        log("DEPRECATED - The setDest(String) method has been deprecated. Use setDest(File) instead.");
        n2(b().W0(str));
    }

    public void p2(File file) {
        r2(new org.apache.tools.ant.types.resources.z(file));
    }

    @Deprecated
    public void q2(String str) {
        log("DEPRECATED - The setSrc(String) method has been deprecated. Use setSrc(File) instead.");
        p2(b().W0(str));
    }

    public void r2(org.apache.tools.ant.types.s1 s1Var) {
        if (!s1Var.p2()) {
            throw new BuildException("the archive %s doesn't exist", s1Var.k2());
        }
        if (s1Var.o2()) {
            throw new BuildException("the archive %s can't be a directory", s1Var.k2());
        }
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
        if (yVar != null) {
            this.f134462k = yVar.l0();
        } else if (!s2()) {
            throw new BuildException("The source %s is not a FileSystem Only FileSystem resources are supported.", s1Var.k2());
        }
        this.f134464m = s1Var;
    }

    protected boolean s2() {
        return false;
    }
}
