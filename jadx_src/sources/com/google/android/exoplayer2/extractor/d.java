package com.google.android.exoplayer2.extractor;

/* JADX INFO: compiled from: CeaUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44857a = "CeaUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44858b = 1195456820;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44859c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f44860d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f44861e = 181;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f44862f = 49;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f44863g = 47;

    private d() {
    }

    public static void a(long j10, com.google.android.exoplayer2.util.e0 e0Var, e0[] e0VarArr) {
        while (true) {
            if (e0Var.a() <= 1) {
                return;
            }
            int iC = c(e0Var);
            int iC2 = c(e0Var);
            int iE = e0Var.e() + iC2;
            if (iC2 == -1 || iC2 > e0Var.a()) {
                com.google.android.exoplayer2.util.u.m(f44857a, "Skipping remainder of malformed SEI NAL unit.");
                iE = e0Var.f();
            } else if (iC == 4 && iC2 >= 8) {
                int iG = e0Var.G();
                int iM = e0Var.M();
                int iO = iM == 49 ? e0Var.o() : 0;
                int iG2 = e0Var.G();
                if (iM == 47) {
                    e0Var.T(1);
                }
                boolean z10 = iG == 181 && (iM == 49 || iM == 47) && iG2 == 3;
                if (iM == 49) {
                    z10 &= iO == 1195456820;
                }
                if (z10) {
                    b(j10, e0Var, e0VarArr);
                }
            }
            e0Var.S(iE);
        }
    }

    public static void b(long j10, com.google.android.exoplayer2.util.e0 e0Var, e0[] e0VarArr) {
        int iG = e0Var.G();
        if ((iG & 64) != 0) {
            e0Var.T(1);
            int i10 = (iG & 31) * 3;
            int iE = e0Var.e();
            for (e0 e0Var2 : e0VarArr) {
                e0Var.S(iE);
                e0Var2.c(e0Var, i10);
                if (j10 != com.google.android.exoplayer2.j.f46377b) {
                    e0Var2.e(j10, 1, i10, 0, null);
                }
            }
        }
    }

    private static int c(com.google.android.exoplayer2.util.e0 e0Var) {
        int i10 = 0;
        while (e0Var.a() != 0) {
            int iG = e0Var.G();
            i10 += iG;
            if (iG != 255) {
                return i10;
            }
        }
        return -1;
    }
}
