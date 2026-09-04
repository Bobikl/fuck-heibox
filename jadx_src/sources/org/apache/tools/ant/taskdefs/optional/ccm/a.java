package org.apache.tools.ant.taskdefs.optional.ccm;

import java.io.File;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.types.b0;
import org.apache.tools.ant.types.o;

/* JADX INFO: compiled from: CCMCheck.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f134686w = "/comment";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f134687x = "/task";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private File f134688s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f134689t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f134690u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Vector<b0> f134691v = new Vector<>();

    private void p2(o oVar) {
        if (r2() != null) {
            oVar.h().O1(f134686w);
            oVar.h().O1(r2());
        }
        if (s2() != null) {
            oVar.h().O1("/task");
            oVar.h().O1(s2());
        }
        if (l0() != null) {
            oVar.h().O1(this.f134688s.getAbsolutePath());
        }
    }

    private void q2() {
        o oVar = new o();
        oVar.w(j2());
        oVar.h().O1(i2());
        p2(oVar);
        if (n1.o(k2(oVar))) {
            throw new BuildException("Failed executing: " + oVar, w1());
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f134688s == null && this.f134691v.isEmpty()) {
            throw new BuildException("Specify at least one source - a file or a fileset.");
        }
        File file = this.f134688s;
        if (file != null && file.exists() && this.f134688s.isDirectory()) {
            throw new BuildException("CCMCheck cannot be generated for directories");
        }
        if (this.f134688s != null && !this.f134691v.isEmpty()) {
            throw new BuildException("Choose between file and fileset !");
        }
        if (l0() != null) {
            q2();
            return;
        }
        for (b0 b0Var : this.f134691v) {
            File fileZ2 = b0Var.z2(b());
            for (String str : b0Var.B2(b()).m()) {
                u2(new File(fileZ2, str));
                q2();
            }
        }
    }

    public File l0() {
        return this.f134688s;
    }

    public void o2(b0 b0Var) {
        this.f134691v.addElement(b0Var);
    }

    public String r2() {
        return this.f134689t;
    }

    public String s2() {
        return this.f134690u;
    }

    public void t2(String str) {
        this.f134689t = str;
    }

    public void u2(File file) {
        x1("working file " + file, 3);
        this.f134688s = file;
    }

    public void v2(String str) {
        this.f134690u = str;
    }
}
