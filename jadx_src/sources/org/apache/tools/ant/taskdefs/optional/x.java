package org.apache.tools.ant.taskdefs.optional;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Map;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.d5;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.q1;
import org.apache.tools.ant.taskdefs.r3;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: Rpm.java */
/* JADX INFO: loaded from: classes5.dex */
public class x extends u2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f135490v = "PATH";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f135491w = "Path";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f135492x = "path";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135494l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private File f135500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private File f135501s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135495m = "-bb";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135496n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135497o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135498p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f135499q = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f135502t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f135503u = false;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        OutputStream printStream;
        OutputStream printStream2;
        d5 d5Var;
        OutputStream outputStream;
        org.apache.tools.ant.types.o oVar = new org.apache.tools.ant.types.o();
        String strJ2 = this.f135496n;
        if (strJ2 == null) {
            strJ2 = j2();
        }
        oVar.w(strJ2);
        if (this.f135494l != null) {
            oVar.h().O1("--define");
            oVar.h().O1("_topdir " + this.f135494l);
        }
        oVar.h().H1(this.f135495m);
        if (this.f135497o) {
            oVar.h().O1("--clean");
        }
        if (this.f135498p) {
            oVar.h().O1("--rmspec");
        }
        if (this.f135499q) {
            oVar.h().O1("--rmsource");
        }
        oVar.h().O1("SPECS/" + this.f135493k);
        OutputStream outputStreamNewOutputStream = null;
        if (this.f135501s == null && this.f135500r == null) {
            d5Var = !this.f135503u ? new s3((u2) this, 2, 1) : new s3((u2) this, 4, 4);
            outputStream = null;
        } else {
            File file = this.f135500r;
            if (file != null) {
                try {
                    OutputStream outputStreamNewOutputStream2 = Files.newOutputStream(file.toPath(), new OpenOption[0]);
                    try {
                        printStream = new PrintStream(new BufferedOutputStream(outputStreamNewOutputStream2));
                    } catch (IOException e10) {
                        e = e10;
                        outputStreamNewOutputStream = outputStreamNewOutputStream2;
                        j0.d(outputStreamNewOutputStream);
                        throw new BuildException(e, w1());
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            } else {
                printStream = !this.f135503u ? new r3((u2) this, 2) : new r3((u2) this, 4);
            }
            File file2 = this.f135501s;
            if (file2 != null) {
                try {
                    outputStreamNewOutputStream = Files.newOutputStream(file2.toPath(), new OpenOption[0]);
                    printStream2 = new PrintStream(new BufferedOutputStream(outputStreamNewOutputStream));
                } catch (IOException e12) {
                    j0.d(outputStreamNewOutputStream);
                    throw new BuildException(e12, w1());
                }
            } else {
                printStream2 = !this.f135503u ? new r3((u2) this, 1) : new r3((u2) this, 4);
            }
            d5Var = new d5(printStream, printStream2);
            outputStream = printStream2;
            outputStreamNewOutputStream = printStream;
        }
        n1 n1VarI2 = i2(oVar, d5Var);
        try {
            try {
                log("Building the RPM based on the " + this.f135493k + " file");
                int iE = n1VarI2.e();
                if (n1.o(iE)) {
                    String str = "'" + oVar.t() + "' failed with exit code " + iE;
                    if (this.f135502t) {
                        throw new BuildException(str);
                    }
                    x1(str, 0);
                }
                j0.d(outputStreamNewOutputStream);
                j0.d(outputStream);
            } catch (IOException e13) {
                throw new BuildException(e13, w1());
            }
        } catch (Throwable th2) {
            j0.d(outputStreamNewOutputStream);
            j0.d(outputStream);
            throw th2;
        }
    }

    protected n1 i2(org.apache.tools.ant.types.o oVar, q1 q1Var) {
        n1 n1Var = new n1(q1Var, null);
        n1Var.w(b());
        if (this.f135494l == null) {
            this.f135494l = b().Z();
        }
        n1Var.E(this.f135494l);
        n1Var.x(oVar.s());
        return n1Var;
    }

    protected String j2() {
        Map<String, String> mapH = n1.h();
        String str = mapH.get(f135490v);
        if (str == null && (str = mapH.get(f135491w)) == null) {
            str = mapH.get("path");
        }
        if (str == null) {
            return "rpm";
        }
        for (String str2 : new o0(b(), str).z2()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rpmbuild");
            sb2.append(org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133973o) ? ".exe" : "");
            File file = new File(str2, sb2.toString());
            if (file.canRead()) {
                return file.getAbsolutePath();
            }
        }
        return "rpm";
    }

    public void k2(boolean z10) {
        this.f135497o = z10;
    }

    public void l2(String str) {
        this.f135495m = str;
    }

    public void m2(File file) {
        this.f135501s = file;
    }

    public void n2(boolean z10) {
        this.f135502t = z10;
    }

    public void o2(File file) {
        this.f135500r = file;
    }

    public void p2(boolean z10) {
        this.f135503u = z10;
    }

    public void q2(boolean z10) {
        this.f135499q = z10;
    }

    public void r2(boolean z10) {
        this.f135498p = z10;
    }

    public void s2(String str) {
        this.f135496n = str;
    }

    public void t2(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new BuildException("You must specify a spec file", w1());
        }
        this.f135493k = str;
    }

    public void u2(File file) {
        this.f135494l = file;
    }
}
