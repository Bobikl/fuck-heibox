package org.apache.tools.ant.types.selectors;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: ContainsSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class l extends g implements org.apache.tools.ant.types.resources.selectors.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f136533n = "expression";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f136534o = "text";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f136535p = "casesensitive";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f136536q = "ignorewhitespace";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f136537j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f136538k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f136539l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f136540m = null;

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.n0
    public void H0(org.apache.tools.ant.types.m0... m0VarArr) {
        super.H0(m0VarArr);
        if (m0VarArr != null) {
            for (org.apache.tools.ant.types.m0 m0Var : m0VarArr) {
                String strA = m0Var.a();
                if ("text".equalsIgnoreCase(strA)) {
                    o2(m0Var.c());
                } else if ("casesensitive".equalsIgnoreCase(strA)) {
                    l2(Project.t1(m0Var.c()));
                } else if (f136536q.equalsIgnoreCase(strA)) {
                    n2(Project.t1(m0Var.c()));
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
        if (s1Var.o2() || this.f136537j.isEmpty()) {
            return true;
        }
        String strP = this.f136537j;
        if (!this.f136538k) {
            strP = strP.toLowerCase();
        }
        if (this.f136539l) {
            strP = m0.p(strP);
        }
        try {
            InputStream inputStreamH2 = s1Var.h2();
            String str = this.f136540m;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamH2, str == null ? Charset.defaultCharset() : Charset.forName(str)));
            try {
                try {
                    String line = bufferedReader.readLine();
                    while (line != null) {
                        if (!this.f136538k) {
                            line = line.toLowerCase();
                        }
                        if (this.f136539l) {
                            line = m0.p(line);
                        }
                        if (line.contains(strP)) {
                            bufferedReader.close();
                            return true;
                        }
                        line = bufferedReader.readLine();
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
        if (this.f136537j == null) {
            g2("The text attribute is required");
        }
    }

    public void l2(boolean z10) {
        this.f136538k = z10;
    }

    public void m2(String str) {
        this.f136540m = str;
    }

    public void n2(boolean z10) {
        this.f136539l = z10;
    }

    public void o2(String str) {
        this.f136537j = str;
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return String.format("{containsselector text: \"%s\" casesensitive: %s ignorewhitespace: %s}", this.f136537j, Boolean.valueOf(this.f136538k), Boolean.valueOf(this.f136539l));
    }
}
