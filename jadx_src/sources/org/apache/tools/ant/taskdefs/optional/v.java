package org.apache.tools.ant.taskdefs.optional;

import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.taskdefs.k4;
import org.apache.tools.ant.types.k0;

/* JADX INFO: compiled from: RenameExtensions.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class v extends h4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135431l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135432m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135433n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f135434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k0.a f135435p;

    public v() {
        k0.a aVar = new k0.a();
        this.f135435p = aVar;
        aVar.g("glob");
    }

    public void A2(File file) {
        this.f135434o = file;
    }

    public void B2(String str) {
        this.f135432m = str;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f135431l == null || this.f135432m == null || this.f135434o == null) {
            throw new BuildException("srcDir, fromExtension and toExtension attributes must be set!");
        }
        x1("DEPRECATED - The renameext task is deprecated.  Use move instead.", 1);
        x1("Replace this with:", 2);
        x1("<move todir=\"" + this.f135434o + "\" overwrite=\"" + this.f135433n + "\">", 2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("  <fileset dir=\"");
        sb2.append(this.f135434o);
        sb2.append("\" />");
        x1(sb2.toString(), 2);
        x1("  <mapper type=\"glob\"", 2);
        x1("          from=\"*" + this.f135431l + "\"", 2);
        x1("          to=\"*" + this.f135432m + "\" />", 2);
        x1("</move>", 2);
        x1("using the same patterns on <fileset> as you've used here", 2);
        k4 k4Var = new k4();
        k4Var.B1(this);
        k4Var.e2(G1());
        k4Var.g2(K1());
        k4Var.A1(w1());
        k4Var.c3(this.f135434o);
        k4Var.Y2(this.f135433n);
        this.f134236k.R2(this.f135434o);
        k4Var.o2(this.f134236k);
        k0 k0VarU2 = k4Var.u2();
        k0VarU2.o2(this.f135435p);
        k0VarU2.n0(androidx.webkit.b.f28327e + this.f135431l);
        k0VarU2.q0(androidx.webkit.b.f28327e + this.f135432m);
        k4Var.D1();
    }

    public void y2(String str) {
        this.f135431l = str;
    }

    public void z2(boolean z10) {
        this.f135433n = z10;
    }
}
