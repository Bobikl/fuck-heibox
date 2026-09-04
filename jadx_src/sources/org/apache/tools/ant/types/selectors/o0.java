package org.apache.tools.ant.types.selectors;

import com.igexin.assist.sdk.AssistPushConsts;
import java.io.File;

/* JADX INFO: compiled from: SizeSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class o0 extends g {
    private static final long A = 1099511627776L;
    private static final int B = 31;
    private static final int C = 36;
    public static final String D = "value";
    public static final String E = "units";
    public static final String F = "when";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f136592n = 1000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f136593o = 1024;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f136594p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f136595q = 1000000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f136596r = 9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f136597s = 1048576;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f136598t = 13;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f136599u = 1000000000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f136600v = 18;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f136601w = 1073741824;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f136602x = 22;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f136603y = 1000000000000L;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f136604z = 27;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f136605j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f136606k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f136607l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.types.q f136608m = org.apache.tools.ant.types.q.f136292d;

    /* JADX INFO: compiled from: SizeSelector.java */
    public static class a extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"K", "k", "kilo", "KILO", "Ki", "KI", "ki", "kibi", "KIBI", "M", "m", "mega", "MEGA", "Mi", "MI", "mi", "mebi", "MEBI", "G", "g", "giga", "GIGA", "Gi", "GI", "gi", "gibi", "GIBI", androidx.exifinterface.media.a.f23244d5, "t", "tera", "TERA", "Ti", AssistPushConsts.MSG_KEY_TASKID, "ti", "tebi", "TEBI"};
        }
    }

    /* JADX INFO: compiled from: SizeSelector.java */
    public static class b extends org.apache.tools.ant.types.q {
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.n0
    public void H0(org.apache.tools.ant.types.m0... m0VarArr) {
        super.H0(m0VarArr);
        if (m0VarArr != null) {
            for (org.apache.tools.ant.types.m0 m0Var : m0VarArr) {
                String strA = m0Var.a();
                if ("value".equalsIgnoreCase(strA)) {
                    try {
                        m2(Long.parseLong(m0Var.c()));
                    } catch (NumberFormatException unused) {
                        g2("Invalid size setting " + m0Var.c());
                    }
                } else if (E.equalsIgnoreCase(strA)) {
                    a aVar = new a();
                    aVar.g(m0Var.c());
                    l2(aVar);
                } else if ("when".equalsIgnoreCase(strA)) {
                    b bVar = new b();
                    bVar.g(m0Var.c());
                    n2(bVar);
                } else {
                    g2("Invalid parameter " + strA);
                }
            }
        }
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        i2();
        if (file2.isDirectory()) {
            return true;
        }
        long length = file2.length() - this.f136607l;
        return this.f136608m.h(length == 0 ? 0 : (int) (length / Math.abs(length)));
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        if (this.f136605j < 0) {
            g2("The value attribute is required, and must be positive");
        } else if (this.f136606k < 1) {
            g2("Invalid Units supplied, must be K,Ki,M,Mi,G,Gi,T,or Ti");
        } else if (this.f136607l < 0) {
            g2("Internal error: Code is not setting sizelimit correctly");
        }
    }

    public void l2(a aVar) {
        int iB = aVar.b();
        this.f136606k = 0L;
        if (iB > -1 && iB < 4) {
            this.f136606k = 1000L;
        } else if (iB < 9) {
            this.f136606k = 1024L;
        } else if (iB < 13) {
            this.f136606k = 1000000L;
        } else if (iB < 18) {
            this.f136606k = 1048576L;
        } else if (iB < 22) {
            this.f136606k = 1000000000L;
        } else if (iB < 27) {
            this.f136606k = 1073741824L;
        } else if (iB < 31) {
            this.f136606k = 1000000000000L;
        } else if (iB < 36) {
            this.f136606k = A;
        }
        long j10 = this.f136606k;
        if (j10 > 0) {
            long j11 = this.f136605j;
            if (j11 > -1) {
                this.f136607l = j11 * j10;
            }
        }
    }

    public void m2(long j10) {
        this.f136605j = j10;
        long j11 = this.f136606k;
        if (j11 == 0 || j10 <= -1) {
            return;
        }
        this.f136607l = j10 * j11;
    }

    public void n2(b bVar) {
        this.f136608m = bVar;
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return String.format("{sizeselector value: %d compare: %s}", Long.valueOf(this.f136607l), this.f136608m.d());
    }
}
