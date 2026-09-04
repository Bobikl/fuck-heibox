package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: MakeUrl.java */
/* JADX INFO: loaded from: classes5.dex */
public class v3 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f135885q = "A source file is missing: ";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f135886r = "No property defined";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f135887s = "No files defined";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135890m = " ";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<org.apache.tools.ant.types.b0> f135891n = new LinkedList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<org.apache.tools.ant.types.o0> f135892o = new LinkedList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135893p = true;

    private String k2() {
        if (this.f135891n.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<org.apache.tools.ant.types.b0> it = this.f135891n.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            org.apache.tools.ant.v0 v0VarB2 = it.next().B2(b());
            for (String str : v0VarB2.m()) {
                File file = new File(v0VarB2.f(), str);
                t2(file);
                String strR2 = r2(file);
                sb2.append(strR2);
                x1(strR2, 4);
                sb2.append(this.f135890m);
                i10++;
            }
        }
        return q2(sb2, i10);
    }

    private String l2() {
        if (this.f135892o.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<org.apache.tools.ant.types.o0> it = this.f135892o.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            for (String str : it.next().z2()) {
                File file = new File(str);
                t2(file);
                String strR2 = r2(file);
                sb2.append(strR2);
                x1(strR2, 4);
                sb2.append(this.f135890m);
                i10++;
            }
        }
        return q2(sb2, i10);
    }

    private String q2(StringBuilder sb2, int i10) {
        if (i10 <= 0) {
            return "";
        }
        sb2.delete(sb2.length() - this.f135890m.length(), sb2.length());
        return new String(sb2);
    }

    private String r2(File file) {
        return org.apache.tools.ant.util.j0.O().q0(file.getAbsolutePath());
    }

    private void s2() {
        if (this.f135888k == null) {
            throw new BuildException(f135886r);
        }
        if (this.f135889l == null && this.f135891n.isEmpty() && this.f135892o.isEmpty()) {
            throw new BuildException(f135887s);
        }
    }

    private void t2(File file) {
        if (!this.f135893p || file.exists()) {
            return;
        }
        throw new BuildException(f135885q + file);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        s2();
        if (b().u0(this.f135888k) != null) {
            return;
        }
        String strK2 = k2();
        File file = this.f135889l;
        if (file != null) {
            t2(file);
            String strR2 = r2(this.f135889l);
            if (strK2.isEmpty()) {
                strK2 = strR2;
            } else {
                strK2 = strR2 + this.f135890m + strK2;
            }
        }
        String strL2 = l2();
        if (!strL2.isEmpty()) {
            if (strK2.isEmpty()) {
                strK2 = strL2;
            } else {
                strK2 = strK2 + this.f135890m + strL2;
            }
        }
        x1("Setting " + this.f135888k + " to URL " + strK2, 3);
        b().n1(this.f135888k, strK2);
    }

    public void i2(org.apache.tools.ant.types.b0 b0Var) {
        this.f135891n.add(b0Var);
    }

    public void j2(org.apache.tools.ant.types.o0 o0Var) {
        this.f135892o.add(o0Var);
    }

    public void m2(File file) {
        this.f135889l = file;
    }

    public void n2(String str) {
        this.f135888k = str;
    }

    public void o2(String str) {
        this.f135890m = str;
    }

    public void p2(boolean z10) {
        this.f135893p = z10;
    }
}
