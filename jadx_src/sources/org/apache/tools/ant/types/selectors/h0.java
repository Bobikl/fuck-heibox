package org.apache.tools.ant.types.selectors;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.t1;

/* JADX INFO: compiled from: PresentSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class h0 extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f136516i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private org.apache.tools.ant.types.k0 f136517j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.util.g0 f136518k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f136519l = true;

    /* JADX INFO: compiled from: PresentSelector.java */
    public static class a extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"srconly", "both"};
        }
    }

    @Override // org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        String str2;
        i2();
        String[] strArrY0 = this.f136518k.y0(str);
        if (strArrY0 == null) {
            return false;
        }
        if (strArrY0.length == 1 && (str2 = strArrY0[0]) != null) {
            return org.apache.tools.ant.util.j0.O().n0(this.f136516i, str2).exists() == this.f136519l;
        }
        throw new BuildException("Invalid destination file results for " + this.f136516i + " with filename " + str);
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        if (this.f136516i == null) {
            g2("The targetdir attribute is required.");
        }
        if (this.f136518k == null) {
            org.apache.tools.ant.types.k0 k0Var = this.f136517j;
            if (k0Var == null) {
                this.f136518k = new org.apache.tools.ant.util.q0();
                return;
            }
            org.apache.tools.ant.util.g0 g0VarI2 = k0Var.i2();
            this.f136518k = g0VarI2;
            if (g0VarI2 == null) {
                g2("Could not set <mapper> element.");
            }
        }
    }

    public void k2(org.apache.tools.ant.util.g0 g0Var) {
        if (this.f136518k != null || this.f136517j != null) {
            throw new BuildException(t1.f135751x);
        }
        this.f136518k = g0Var;
    }

    public org.apache.tools.ant.types.k0 l2() throws BuildException {
        if (this.f136518k != null || this.f136517j != null) {
            throw new BuildException(t1.f135751x);
        }
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        this.f136517j = k0Var;
        return k0Var;
    }

    public void m2(a aVar) {
        if (aVar.b() == 0) {
            this.f136519l = false;
        }
    }

    public void n2(File file) {
        this.f136516i = file;
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{presentselector targetdir: ");
        File file = this.f136516i;
        if (file == null) {
            sb2.append("NOT YET SET");
        } else {
            sb2.append(file.getName());
        }
        sb2.append(" present: ");
        if (this.f136519l) {
            sb2.append("both");
        } else {
            sb2.append("srconly");
        }
        org.apache.tools.ant.util.g0 g0Var = this.f136518k;
        if (g0Var != null) {
            sb2.append(g0Var.toString());
        } else {
            org.apache.tools.ant.types.k0 k0Var = this.f136517j;
            if (k0Var != null) {
                sb2.append(k0Var.toString());
            }
        }
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }
}
