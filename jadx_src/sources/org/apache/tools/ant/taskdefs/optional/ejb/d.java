package org.apache.tools.ant.taskdefs.optional.ejb;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.j1;
import org.apache.tools.ant.taskdefs.v2;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: BorlandGenerateClient.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends u2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f134900q = "java";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f134901r = "fork";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    o0 f134905n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f134902k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    File f134903l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    File f134904m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    String f134906o = f134901r;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f134907p = 4;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f134903l;
        if (file == null || file.isDirectory()) {
            throw new BuildException("invalid ejb jar file.");
        }
        File file2 = this.f134904m;
        if (file2 == null || file2.isDirectory()) {
            x1("invalid or missing client jar file.", 3);
            String absolutePath = this.f134903l.getAbsolutePath();
            this.f134904m = new File(absolutePath.substring(0, absolutePath.lastIndexOf(".")) + "client.jar");
        }
        if (this.f134906o == null) {
            log("mode is null default mode  is java");
            s2("java");
        }
        int i10 = this.f134907p;
        if (i10 != 5 && i10 != 4) {
            throw new BuildException("version %d is not supported", Integer.valueOf(this.f134907p));
        }
        log("client jar file is " + this.f134904m);
        if (f134901r.equalsIgnoreCase(this.f134906o)) {
            j2();
        } else {
            m2();
        }
    }

    public o0 i2() {
        if (this.f134905n == null) {
            this.f134905n = new o0(b());
        }
        return this.f134905n.u2();
    }

    protected void j2() throws BuildException {
        if (this.f134907p == 4) {
            k2();
        }
        if (this.f134907p == 5) {
            l2();
        }
    }

    protected void k2() throws BuildException {
        try {
            x1("mode : fork 4", 4);
            j1 j1Var = new j1(this);
            j1Var.D2(new File("."));
            j1Var.G2("iastool");
            j1Var.l2().O1("generateclient");
            if (this.f134902k) {
                j1Var.l2().O1("-trace");
            }
            j1Var.l2().O1("-short");
            j1Var.l2().O1("-jarfile");
            j1Var.l2().O1(this.f134903l.getAbsolutePath());
            j1Var.l2().O1("-single");
            j1Var.l2().O1("-clientjarfile");
            j1Var.l2().O1(this.f134904m.getAbsolutePath());
            x1("Calling iastool", 3);
            j1Var.D1();
        } catch (Exception e10) {
            throw new BuildException("Exception while calling generateclient", e10);
        }
    }

    protected void l2() throws BuildException {
        try {
            x1("mode : fork 5", 4);
            j1 j1Var = new j1(this);
            j1Var.D2(new File("."));
            j1Var.G2("iastool");
            if (this.f134902k) {
                j1Var.l2().O1("-debug");
            }
            j1Var.l2().O1("-genclient");
            j1Var.l2().O1("-jars");
            j1Var.l2().O1(this.f134903l.getAbsolutePath());
            j1Var.l2().O1("-target");
            j1Var.l2().O1(this.f134904m.getAbsolutePath());
            j1Var.l2().O1("-cp");
            j1Var.l2().O1(this.f134905n.toString());
            x1("Calling iastool", 3);
            j1Var.D1();
        } catch (Exception e10) {
            throw new BuildException("Exception while calling generateclient", e10);
        }
    }

    protected void m2() throws BuildException {
        try {
            if (this.f134907p == 5) {
                throw new BuildException("java mode is supported only for previous version <= %d", 4);
            }
            log("mode : java");
            v2 v2Var = new v2(this);
            v2Var.O2(new File("."));
            v2Var.K2("com.inprise.server.commandline.EJBUtilities");
            v2Var.L2(this.f134905n.r2());
            v2Var.S2(true);
            v2Var.q2().O1("generateclient");
            if (this.f134902k) {
                v2Var.q2().O1("-trace");
            }
            v2Var.q2().O1("-short");
            v2Var.q2().O1("-jarfile");
            v2Var.q2().O1(this.f134903l.getAbsolutePath());
            v2Var.q2().O1("-single");
            v2Var.q2().O1("-clientjarfile");
            v2Var.q2().O1(this.f134904m.getAbsolutePath());
            x1("Calling EJBUtilities", 3);
            v2Var.D1();
        } catch (Exception e10) {
            throw new BuildException("Exception while calling generateclient", e10);
        }
    }

    public void n2(o0 o0Var) {
        o0 o0Var2 = this.f134905n;
        if (o0Var2 == null) {
            this.f134905n = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void o2(q1 q1Var) {
        i2().c2(q1Var);
    }

    public void p2(File file) {
        this.f134904m = file;
    }

    public void q2(boolean z10) {
        this.f134902k = z10;
    }

    public void r2(File file) {
        this.f134903l = file;
    }

    public void s2(String str) {
        this.f134906o = str;
    }

    public void t2(int i10) {
        this.f134907p = i10;
    }
}
