package org.apache.tools.ant.taskdefs.optional.clearcase;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.j1;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: ClearCase.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p extends u2 {
    public static final String A = "lsco";
    public static final String B = "mkelem";
    public static final String C = "mkattr";
    public static final String D = "mkdir";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f134717p = "cleartool";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f134718q = "update";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f134719r = "checkout";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f134720s = "checkin";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f134721t = "uncheckout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f134722u = "lock";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f134723v = "unlock";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f134724w = "mkbl";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f134725x = "mklabel";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f134726y = "mklbtype";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f134727z = "rmtype";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134728k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134729l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f134730m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f134731n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f134732o = true;

    protected final String i2() {
        String str = this.f134728k;
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str + "/";
        }
        return str + f134717p;
    }

    public boolean j2() {
        return this.f134732o;
    }

    public String k2() {
        return this.f134730m;
    }

    public String l2() {
        return this.f134729l;
    }

    public String m2() {
        return new File(this.f134729l).getName();
    }

    protected int n2(org.apache.tools.ant.types.o oVar) {
        try {
            Project projectB = b();
            n1 n1Var = new n1(new s3((u2) this, 2, 1));
            n1Var.w(projectB);
            n1Var.E(projectB.Z());
            n1Var.x(oVar.s());
            return n1Var.e();
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    @Deprecated
    protected String o2(org.apache.tools.ant.types.o oVar) {
        return p2(oVar, false);
    }

    protected String p2(org.apache.tools.ant.types.o oVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("opts.cc.runS.output");
        int i10 = this.f134731n;
        this.f134731n = i10 + 1;
        sb2.append(i10);
        String string = sb2.toString();
        j1 j1Var = new j1(this);
        org.apache.tools.ant.types.o.a aVarL2 = j1Var.l2();
        j1Var.G2(oVar.t());
        aVarL2.H1(org.apache.tools.ant.types.o.z(oVar.r()));
        j1Var.Q2(string);
        j1Var.I2(z10);
        j1Var.D1();
        return b().u0(string);
    }

    public final void q2(String str) {
        this.f134728k = j0.s0(str);
    }

    public void r2(boolean z10) {
        this.f134732o = z10;
    }

    public final void s2(String str) {
        this.f134730m = str;
    }

    public final void t2(String str) {
        this.f134729l = str;
    }
}
