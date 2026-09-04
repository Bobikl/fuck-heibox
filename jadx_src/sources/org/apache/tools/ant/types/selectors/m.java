package org.apache.tools.ant.types.selectors;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.a2;

/* JADX INFO: compiled from: DateSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f136541p = "millis";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f136542q = "datetime";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f136543r = "checkdirs";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f136544s = "granularity";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f136545t = "when";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f136546u = "pattern";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136547v = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f136552n;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f136548j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f136549k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f136550l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f136551m = f136547v.M();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a2 f136553o = a2.f136103g;

    /* JADX INFO: compiled from: DateSelector.java */
    public static class a extends a2 {
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.n0
    public void H0(org.apache.tools.ant.types.m0... m0VarArr) {
        super.H0(m0VarArr);
        if (m0VarArr != null) {
            for (org.apache.tools.ant.types.m0 m0Var : m0VarArr) {
                String strA = m0Var.a();
                if (f136541p.equalsIgnoreCase(strA)) {
                    try {
                        p2(Long.parseLong(m0Var.c()));
                    } catch (NumberFormatException unused) {
                        g2("Invalid millisecond setting " + m0Var.c());
                    }
                } else if (f136542q.equalsIgnoreCase(strA)) {
                    n2(m0Var.c());
                } else if (f136543r.equalsIgnoreCase(strA)) {
                    m2(Project.t1(m0Var.c()));
                } else if (f136544s.equalsIgnoreCase(strA)) {
                    try {
                        o2(Integer.parseInt(m0Var.c()));
                    } catch (NumberFormatException unused2) {
                        g2("Invalid granularity setting " + m0Var.c());
                    }
                } else if ("when".equalsIgnoreCase(strA)) {
                    r2(new a2(m0Var.c()));
                } else if (f136546u.equalsIgnoreCase(strA)) {
                    q2(m0Var.c());
                } else {
                    g2("Invalid parameter " + strA);
                }
            }
        }
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        i2();
        return (file2.isDirectory() && !this.f136550l) || this.f136553o.k(file2.lastModified(), this.f136548j, this.f136551m);
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        String str = this.f136549k;
        if (str == null && this.f136548j < 0) {
            g2("You must provide a datetime or the number of milliseconds.");
            return;
        }
        if (this.f136548j >= 0 || str == null) {
            return;
        }
        String str2 = this.f136552n;
        String str3 = str2 == null ? "MM/dd/yyyy hh:mm a" : str2;
        try {
            p2((str2 == null ? new SimpleDateFormat(str3, Locale.US) : new SimpleDateFormat(str3)).parse(this.f136549k).getTime());
            if (this.f136548j < 0) {
                g2("Date of " + this.f136549k + " results in negative milliseconds value relative to epoch (January 1, 1970, 00:00:00 GMT).");
            }
        } catch (ParseException e10) {
            h2("Date of " + this.f136549k + " Cannot be parsed correctly. It should be in '" + str3 + "' format.", e10);
        }
    }

    public long l2() {
        if (this.f136549k != null) {
            i2();
        }
        return this.f136548j;
    }

    public void m2(boolean z10) {
        this.f136550l = z10;
    }

    public void n2(String str) {
        this.f136549k = str;
        this.f136548j = -1L;
    }

    public void o2(int i10) {
        this.f136551m = i10;
    }

    public void p2(long j10) {
        this.f136548j = j10;
    }

    public void q2(String str) {
        this.f136552n = str;
    }

    public void r2(a2 a2Var) {
        this.f136553o = a2Var;
    }

    public void s2(a aVar) {
        r2(aVar);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{dateselector date: ");
        sb2.append(this.f136549k);
        sb2.append(" compare: ");
        sb2.append(this.f136553o.d());
        sb2.append(" granularity: ");
        sb2.append(this.f136551m);
        if (this.f136552n != null) {
            sb2.append(" pattern: ");
            sb2.append(this.f136552n);
        }
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }
}
