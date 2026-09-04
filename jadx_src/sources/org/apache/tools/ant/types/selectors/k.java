package org.apache.tools.ant.types.selectors;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.r1;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: ContainsRegexpSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends g implements org.apache.tools.ant.types.resources.selectors.n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f136523p = "expression";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f136524q = "casesensitive";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f136525r = "multiline";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f136526s = "singleline";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f136527j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r1 f136528k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.util.regexp.c f136529l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f136530m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f136531n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f136532o = false;

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.n0
    public void H0(org.apache.tools.ant.types.m0... m0VarArr) {
        super.H0(m0VarArr);
        if (m0VarArr != null) {
            for (org.apache.tools.ant.types.m0 m0Var : m0VarArr) {
                String strA = m0Var.a();
                if ("expression".equalsIgnoreCase(strA)) {
                    m2(m0Var.c());
                } else if ("casesensitive".equalsIgnoreCase(strA)) {
                    l2(Project.t1(m0Var.c()));
                } else if (f136525r.equalsIgnoreCase(strA)) {
                    n2(Project.t1(m0Var.c()));
                } else if (f136526s.equalsIgnoreCase(strA)) {
                    o2(Project.t1(m0Var.c()));
                } else {
                    g2("Invalid parameter " + strA);
                }
            }
        }
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        return a(new org.apache.tools.ant.types.resources.z(file2));
    }

    @Override // org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public boolean a(s1 s1Var) {
        i2();
        if (s1Var.o2()) {
            return true;
        }
        if (this.f136528k == null) {
            r1 r1Var = new r1();
            this.f136528k = r1Var;
            r1Var.j2(this.f136527j);
            this.f136529l = this.f136528k.g2(b());
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s1Var.h2()));
            try {
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        if (this.f136529l.e(line, org.apache.tools.ant.util.regexp.g.c(this.f136530m, this.f136531n, this.f136532o))) {
                            bufferedReader.close();
                            return true;
                        }
                        throw new BuildException("Could not get InputStream from " + s1Var.v2(), e);
                    }
                    bufferedReader.close();
                    return false;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException unused) {
                throw new BuildException("Could not read " + s1Var.v2());
            }
        } catch (IOException e10) {
            throw new BuildException("Could not get InputStream from " + s1Var.v2(), e10);
        }
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        if (this.f136527j == null) {
            g2("The expression attribute is required");
        }
    }

    public void l2(boolean z10) {
        this.f136530m = z10;
    }

    public void m2(String str) {
        this.f136527j = str;
    }

    public void n2(boolean z10) {
        this.f136531n = z10;
    }

    public void o2(boolean z10) {
        this.f136532o = z10;
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return String.format("{containsregexpselector expression: %s}", this.f136527j);
    }
}
