package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Patch.java */
/* JADX INFO: loaded from: classes5.dex */
public class q4 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f135592p = "patch";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f135593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f135595m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private org.apache.tools.ant.types.o f135596n = new org.apache.tools.ant.types.o();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135597o = false;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (!this.f135595m) {
            throw new BuildException("patchfile argument is required", w1());
        }
        org.apache.tools.ant.types.o oVar = (org.apache.tools.ant.types.o) this.f135596n.clone();
        oVar.w(f135592p);
        if (this.f135593k != null) {
            oVar.h().G1(this.f135593k);
        }
        n1 n1Var = new n1(new s3((org.apache.tools.ant.u2) this, 2, 1), null);
        n1Var.x(oVar.s());
        File file = this.f135594l;
        if (file == null) {
            n1Var.E(b().Z());
        } else {
            if (!file.isDirectory()) {
                throw new BuildException(this.f135594l + " is not a directory.", w1());
            }
            n1Var.E(this.f135594l);
        }
        x1(oVar.o(), 3);
        try {
            int iE = n1Var.e();
            if (n1.o(iE)) {
                String str = "'patch' failed with exit code " + iE;
                if (this.f135597o) {
                    throw new BuildException(str);
                }
                x1(str, 0);
            }
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    public void i2(boolean z10) {
        if (z10) {
            this.f135596n.h().O1("-b");
        }
    }

    public void j2(File file) {
        if (file != null) {
            this.f135596n.h().O1("-o");
            this.f135596n.h().G1(file);
        }
    }

    public void k2(File file) {
        this.f135594l = file;
    }

    public void l2(boolean z10) {
        this.f135597o = z10;
    }

    public void m2(boolean z10) {
        if (z10) {
            this.f135596n.h().O1("-l");
        }
    }

    public void n2(File file) {
        this.f135593k = file;
    }

    public void o2(File file) {
        if (file.exists()) {
            this.f135596n.h().O1("-i");
            this.f135596n.h().G1(file);
            this.f135595m = true;
        } else {
            throw new BuildException("patchfile " + file + " doesn't exist", w1());
        }
    }

    public void p2(boolean z10) {
        if (z10) {
            this.f135596n.h().O1("-s");
        }
    }

    public void q2(boolean z10) {
        if (z10) {
            this.f135596n.h().O1(org.apache.tools.ant.taskdefs.optional.vss.g.S2);
        }
    }

    public void r2(int i10) throws BuildException {
        if (i10 < 0) {
            throw new BuildException("strip has to be >= 0", w1());
        }
        this.f135596n.h().O1("-p" + i10);
    }
}
