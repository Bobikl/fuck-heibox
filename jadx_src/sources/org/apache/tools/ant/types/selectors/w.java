package org.apache.tools.ant.types.selectors;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.r1;

/* JADX INFO: compiled from: FilenameSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class w extends g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f136630p = "name";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f136631q = "casesensitive";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f136632r = "negate";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f136633s = "regex";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f136634j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f136635k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f136636l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f136637m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r1 f136638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private org.apache.tools.ant.util.regexp.c f136639o;

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.n0
    public void H0(org.apache.tools.ant.types.m0... m0VarArr) {
        super.H0(m0VarArr);
        if (m0VarArr != null) {
            for (org.apache.tools.ant.types.m0 m0Var : m0VarArr) {
                String strA = m0Var.a();
                if ("name".equalsIgnoreCase(strA)) {
                    m2(m0Var.c());
                } else if ("casesensitive".equalsIgnoreCase(strA)) {
                    l2(Project.t1(m0Var.c()));
                } else if (f136632r.equalsIgnoreCase(strA)) {
                    n2(Project.t1(m0Var.c()));
                } else if (f136633s.equalsIgnoreCase(strA)) {
                    o2(m0Var.c());
                } else {
                    g2("Invalid parameter " + strA);
                }
            }
        }
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        i2();
        String str2 = this.f136634j;
        if (str2 != null) {
            return m0.k(str2, str, this.f136636l) == (this.f136637m ^ true);
        }
        if (this.f136638n == null) {
            r1 r1Var = new r1();
            this.f136638n = r1Var;
            r1Var.j2(this.f136635k);
            this.f136639o = this.f136638n.g2(b());
        }
        return this.f136639o.e(str, org.apache.tools.ant.util.regexp.g.b(this.f136636l)) == (this.f136637m ^ true);
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        String str = this.f136634j;
        if (str == null && this.f136635k == null) {
            g2("The name or regex attribute is required");
        } else {
            if (str == null || this.f136635k == null) {
                return;
            }
            g2("Only one of name and regex attribute is allowed");
        }
    }

    public void l2(boolean z10) {
        this.f136636l = z10;
    }

    public void m2(String str) {
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
        if (strReplace.endsWith(File.separator)) {
            strReplace = strReplace + m0.f136554a;
        }
        this.f136634j = strReplace;
    }

    public void n2(boolean z10) {
        this.f136637m = z10;
    }

    public void o2(String str) {
        this.f136635k = str;
        this.f136638n = null;
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{filenameselector name: ");
        String str = this.f136634j;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f136635k;
        if (str2 != null) {
            sb2.append(str2);
            sb2.append(" [as regular expression]");
        }
        sb2.append(" negate: ");
        sb2.append(this.f136637m);
        sb2.append(" casesensitive: ");
        sb2.append(this.f136636l);
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }
}
