package org.apache.tools.ant.types.selectors;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.t1;

/* JADX INFO: compiled from: MappingSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y extends h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136641m = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected File f136642i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected org.apache.tools.ant.types.k0 f136643j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected org.apache.tools.ant.util.g0 f136644k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f136645l = (int) f136641m.M();

    @Override // org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        String str2;
        i2();
        String[] strArrY0 = this.f136644k.y0(str);
        if (strArrY0 == null) {
            return false;
        }
        if (strArrY0.length == 1 && (str2 = strArrY0[0]) != null) {
            return m2(file2, f136641m.n0(this.f136642i, str2));
        }
        throw new BuildException("Invalid destination file results for " + this.f136642i.getName() + " with filename " + str);
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        if (this.f136642i == null) {
            g2("The targetdir attribute is required.");
        }
        if (this.f136644k == null) {
            org.apache.tools.ant.types.k0 k0Var = this.f136643j;
            if (k0Var == null) {
                this.f136644k = new org.apache.tools.ant.util.q0();
                return;
            }
            org.apache.tools.ant.util.g0 g0VarI2 = k0Var.i2();
            this.f136644k = g0VarI2;
            if (g0VarI2 == null) {
                g2("Could not set <mapper> element.");
            }
        }
    }

    public void k2(org.apache.tools.ant.util.g0 g0Var) {
        if (this.f136644k != null || this.f136643j != null) {
            throw new BuildException(t1.f135751x);
        }
        this.f136644k = g0Var;
    }

    public org.apache.tools.ant.types.k0 l2() throws BuildException {
        if (this.f136644k != null || this.f136643j != null) {
            throw new BuildException(t1.f135751x);
        }
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        this.f136643j = k0Var;
        return k0Var;
    }

    protected abstract boolean m2(File file, File file2);

    public void n2(int i10) {
        this.f136645l = i10;
    }

    public void o2(File file) {
        this.f136642i = file;
    }
}
