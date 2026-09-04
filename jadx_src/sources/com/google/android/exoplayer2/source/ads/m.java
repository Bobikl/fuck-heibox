package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.source.d0;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.z3;

/* JADX INFO: compiled from: ServerSideInsertedAdsUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m {
    private m() {
    }

    @androidx.annotation.j
    public static c a(c cVar, long j10, long j11, long j12) {
        long jE = e(j10, -1, cVar);
        int i10 = cVar.f47519f;
        while (i10 < cVar.f47516c && cVar.e(i10).f47529b != Long.MIN_VALUE && cVar.e(i10).f47529b <= jE) {
            i10++;
        }
        long j13 = j11 - j10;
        c cVarS = cVar.u(i10, jE).t(i10, true).k(i10, 1).l(i10, j13).s(i10, j12);
        long j14 = (-j13) + j12;
        for (int i11 = i10 + 1; i11 < cVarS.f47516c; i11++) {
            long j15 = cVarS.e(i11).f47529b;
            if (j15 != Long.MIN_VALUE) {
                cVarS = cVarS.n(i11, j15 + j14);
            }
        }
        return cVarS;
    }

    public static int b(c cVar, int i10) {
        int i11 = cVar.e(i10).f47530c;
        if (i11 == -1) {
            return 0;
        }
        return i11;
    }

    public static long c(long j10, d0 d0Var, c cVar) {
        return d0Var.c() ? d(j10, d0Var.f47720b, d0Var.f47721c, cVar) : e(j10, d0Var.f47723e, cVar);
    }

    public static long d(long j10, int i10, int i11, c cVar) {
        int i12;
        c.a aVarE = cVar.e(i10);
        long j11 = j10 - aVarE.f47529b;
        int i13 = cVar.f47519f;
        while (true) {
            i12 = 0;
            if (i13 >= i10) {
                break;
            }
            c.a aVarE2 = cVar.e(i13);
            while (i12 < b(cVar, i13)) {
                j11 -= aVarE2.f47533f[i12];
                i12++;
            }
            j11 += aVarE2.f47534g;
            i13++;
        }
        if (i11 < b(cVar, i10)) {
            while (i12 < i11) {
                j11 -= aVarE.f47533f[i12];
                i12++;
            }
        }
        return j11;
    }

    public static long e(long j10, int i10, c cVar) {
        if (i10 == -1) {
            i10 = cVar.f47516c;
        }
        long j11 = 0;
        for (int i11 = cVar.f47519f; i11 < i10; i11++) {
            c.a aVarE = cVar.e(i11);
            long j12 = aVarE.f47529b;
            if (j12 == Long.MIN_VALUE || j12 > j10 - j11) {
                break;
            }
            for (int i12 = 0; i12 < b(cVar, i11); i12++) {
                j11 += aVarE.f47533f[i12];
            }
            long j13 = aVarE.f47534g;
            j11 -= j13;
            long j14 = aVarE.f47529b;
            long j15 = j10 - j11;
            if (j13 + j14 > j15) {
                return Math.max(j14, j15);
            }
        }
        return j10 - j11;
    }

    public static long f(c3 c3Var, c cVar) {
        z3 z3VarW1 = c3Var.w1();
        if (z3VarW1.x()) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        long j10 = z3VarW1.k(c3Var.x0(), new z3.b()).f52096e;
        return j10 == com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.j.f46377b : j(j10, -1, cVar);
    }

    public static long g(long j10, d0 d0Var, c cVar) {
        return d0Var.c() ? i(j10, d0Var.f47720b, d0Var.f47721c, cVar) : j(j10, d0Var.f47723e, cVar);
    }

    public static long h(c3 c3Var, c cVar) {
        z3 z3VarW1 = c3Var.w1();
        if (z3VarW1.x()) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        z3.b bVarK = z3VarW1.k(c3Var.x0(), new z3.b());
        if (!u0.c(bVarK.l(), cVar.f47515b)) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        if (!c3Var.O()) {
            return j(u0.U0(c3Var.getCurrentPosition()) - bVarK.s(), -1, cVar);
        }
        return i(u0.U0(c3Var.getCurrentPosition()), c3Var.f0(), c3Var.A0(), cVar);
    }

    public static long i(long j10, int i10, int i11, c cVar) {
        int i12;
        c.a aVarE = cVar.e(i10);
        long j11 = j10 + aVarE.f47529b;
        int i13 = cVar.f47519f;
        while (true) {
            i12 = 0;
            if (i13 >= i10) {
                break;
            }
            c.a aVarE2 = cVar.e(i13);
            while (i12 < b(cVar, i13)) {
                j11 += aVarE2.f47533f[i12];
                i12++;
            }
            j11 -= aVarE2.f47534g;
            i13++;
        }
        if (i11 < b(cVar, i10)) {
            while (i12 < i11) {
                j11 += aVarE.f47533f[i12];
                i12++;
            }
        }
        return j11;
    }

    public static long j(long j10, int i10, c cVar) {
        if (i10 == -1) {
            i10 = cVar.f47516c;
        }
        long j11 = 0;
        for (int i11 = cVar.f47519f; i11 < i10; i11++) {
            c.a aVarE = cVar.e(i11);
            long j12 = aVarE.f47529b;
            if (j12 == Long.MIN_VALUE || j12 > j10) {
                break;
            }
            long j13 = j12 + j11;
            for (int i12 = 0; i12 < b(cVar, i11); i12++) {
                j11 += aVarE.f47533f[i12];
            }
            long j14 = aVarE.f47534g;
            j11 -= j14;
            if (aVarE.f47529b + j14 > j10) {
                return Math.max(j13, j10 + j11);
            }
        }
        return j10 + j11;
    }
}
