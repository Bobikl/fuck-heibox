package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.util.List;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: UpToDate.java */
/* JADX INFO: loaded from: classes5.dex */
public class n7 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.taskdefs.condition.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f134617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f134618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<org.apache.tools.ant.types.b0> f134619o = new Vector();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.w1 f134620p = new org.apache.tools.ant.types.resources.w1();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected org.apache.tools.ant.types.k0 f134621q = null;

    private org.apache.tools.ant.util.g0 m2() {
        org.apache.tools.ant.types.k0 k0Var = this.f134621q;
        if (k0Var != null) {
            return k0Var.i2();
        }
        org.apache.tools.ant.util.b1 b1Var = new org.apache.tools.ant.util.b1();
        b1Var.q0(this.f134618n.getAbsolutePath());
        return b1Var;
    }

    private String n2() {
        String str = this.f134616l;
        return str != null ? str : "true";
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f134615k == null) {
            throw new BuildException("property attribute is required.", w1());
        }
        if (e()) {
            b().n1(this.f134615k, n2());
            if (this.f134621q != null) {
                x1("All target files are up-to-date.", 3);
                return;
            }
            x1("File \"" + this.f134618n.getAbsolutePath() + "\" is up-to-date.", 3);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() {
        boolean z10;
        if (this.f134619o.isEmpty() && this.f134620p.isEmpty() && this.f134617m == null) {
            throw new BuildException("At least one srcfile or a nested <srcfiles> or <srcresources> element must be set.");
        }
        if ((!this.f134619o.isEmpty() || !this.f134620p.isEmpty()) && this.f134617m != null) {
            throw new BuildException("Cannot specify both the srcfile attribute and a nested <srcfiles> or <srcresources> element.");
        }
        File file = this.f134618n;
        if (file == null && this.f134621q == null) {
            throw new BuildException("The targetfile attribute or a nested mapper element must be set.");
        }
        if (file != null && !file.exists()) {
            x1("The targetfile \"" + this.f134618n.getAbsolutePath() + "\" does not exist.", 3);
            return false;
        }
        File file2 = this.f134617m;
        if (file2 != null && !file2.exists()) {
            throw new BuildException("%s not found.", this.f134617m.getAbsolutePath());
        }
        if (this.f134617m != null) {
            z10 = this.f134621q != null ? new org.apache.tools.ant.util.f2(this).k(new String[]{this.f134617m.getAbsolutePath()}, null, null, this.f134621q.i2()).length == 0 : this.f134618n.lastModified() >= this.f134617m.lastModified();
            if (!z10) {
                x1(this.f134617m.getAbsolutePath() + " is newer than (one of) its target(s).", 3);
            }
        } else {
            z10 = true;
        }
        for (org.apache.tools.ant.types.b0 b0Var : this.f134619o) {
            if (!o2(b0Var.z2(b()), b0Var.B2(b()).m())) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        org.apache.tools.ant.types.s1[] s1VarArrY2 = this.f134620p.y2();
        if (s1VarArrY2.length > 0) {
            return ResourceUtils.z(this, s1VarArrY2, m2(), b()).length == 0;
        }
        return z10;
    }

    public void i2(org.apache.tools.ant.util.g0 g0Var) {
        k2().e2(g0Var);
    }

    public void j2(org.apache.tools.ant.types.b0 b0Var) {
        this.f134619o.add(b0Var);
    }

    public org.apache.tools.ant.types.k0 k2() throws BuildException {
        if (this.f134621q != null) {
            throw new BuildException(t1.f135751x, w1());
        }
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        this.f134621q = k0Var;
        return k0Var;
    }

    public org.apache.tools.ant.types.resources.w1 l2() {
        return this.f134620p;
    }

    protected boolean o2(File file, String[] strArr) {
        return new org.apache.tools.ant.util.f2(this).k(strArr, file, this.f134621q == null ? null : file, m2()).length == 0;
    }

    public void p2(String str) {
        this.f134615k = str;
    }

    public void q2(File file) {
        this.f134617m = file;
    }

    public void r2(File file) {
        this.f134618n = file;
    }

    public void s2(String str) {
        this.f134616l = str;
    }
}
