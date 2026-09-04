package org.apache.tools.ant.taskdefs.optional.jlink;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.types.o0;

/* JADX INFO: compiled from: JlinkTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends h4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135242l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o0 f135243m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f135244n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135245o = false;

    private boolean A2() {
        return B2(this.f135244n);
    }

    private boolean B2(o0 o0Var) {
        return (o0Var == null || o0Var.isEmpty()) ? false : true;
    }

    private boolean C2() {
        return B2(this.f135243m);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f135242l == null) {
            throw new BuildException("outfile attribute is required! Please set.");
        }
        if (!A2() && !C2()) {
            throw new BuildException("addfiles or mergefiles required! Please set.");
        }
        log("linking:     " + this.f135242l.getPath());
        x1("compression: " + this.f135245o, 3);
        d dVar = new d();
        dVar.p(this.f135242l.getPath());
        dVar.o(this.f135245o);
        if (C2()) {
            x1("merge files: " + this.f135243m.toString(), 3);
            dVar.f(this.f135243m.z2());
        }
        if (A2()) {
            x1("add files: " + this.f135244n.toString(), 3);
            dVar.b(this.f135244n.z2());
        }
        try {
            dVar.k();
        } catch (Exception e10) {
            throw new BuildException(e10, w1());
        }
    }

    public void D2(o0 o0Var) {
        o0 o0Var2 = this.f135244n;
        if (o0Var2 == null) {
            this.f135244n = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void E2(boolean z10) {
        this.f135245o = z10;
    }

    public void F2(o0 o0Var) {
        o0 o0Var2 = this.f135243m;
        if (o0Var2 == null) {
            this.f135243m = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void G2(File file) {
        this.f135242l = file;
    }

    public o0 y2() {
        if (this.f135244n == null) {
            this.f135244n = new o0(b());
        }
        return this.f135244n.u2();
    }

    public o0 z2() {
        if (this.f135243m == null) {
            this.f135243m = new o0(b());
        }
        return this.f135243m.u2();
    }
}
