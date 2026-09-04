package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: FlacFrameReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: compiled from: FlacFrameReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f45684a;
    }

    private r() {
    }

    private static boolean a(com.google.android.exoplayer2.util.e0 e0Var, u uVar, int i10) {
        int iJ = j(e0Var, i10);
        return iJ != -1 && iJ <= uVar.f46194b;
    }

    private static boolean b(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        return e0Var.G() == u0.w(e0Var.d(), i10, e0Var.e() - 1, 0);
    }

    private static boolean c(com.google.android.exoplayer2.util.e0 e0Var, u uVar, boolean z10, a aVar) {
        try {
            long jN = e0Var.N();
            if (!z10) {
                jN *= (long) uVar.f46194b;
            }
            aVar.f45684a = jN;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(com.google.android.exoplayer2.util.e0 e0Var, u uVar, int i10, a aVar) {
        int iE = e0Var.e();
        long jI = e0Var.I();
        long j10 = jI >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jI >> 4) & 15), uVar) && f((int) ((jI >> 1) & 7), uVar) && !(((jI & 1) > 1L ? 1 : ((jI & 1) == 1L ? 0 : -1)) == 0) && c(e0Var, uVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(e0Var, uVar, (int) ((jI >> 12) & 15)) && e(e0Var, uVar, (int) ((jI >> 8) & 15)) && b(e0Var, iE);
    }

    private static boolean e(com.google.android.exoplayer2.util.e0 e0Var, u uVar, int i10) {
        int i11 = uVar.f46197e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == uVar.f46198f;
        }
        if (i10 == 12) {
            return e0Var.G() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int iM = e0Var.M();
        if (i10 == 14) {
            iM *= 10;
        }
        return iM == i11;
    }

    private static boolean f(int i10, u uVar) {
        return i10 == 0 || i10 == uVar.f46201i;
    }

    private static boolean g(int i10, u uVar) {
        if (i10 <= 7) {
            return i10 == uVar.f46199g - 1;
        }
        return i10 <= 10 && uVar.f46199g == 2;
    }

    public static boolean h(l lVar, u uVar, int i10, a aVar) throws IOException {
        long jQ = lVar.q();
        byte[] bArr = new byte[2];
        lVar.l(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            lVar.o();
            lVar.s((int) (jQ - lVar.getPosition()));
            return false;
        }
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(16);
        System.arraycopy(bArr, 0, e0Var.d(), 0, 2);
        e0Var.R(n.c(lVar, e0Var.d(), 2, 14));
        lVar.o();
        lVar.s((int) (jQ - lVar.getPosition()));
        return d(e0Var, uVar, i10, aVar);
    }

    public static long i(l lVar, u uVar) throws IOException {
        lVar.o();
        lVar.s(1);
        byte[] bArr = new byte[1];
        lVar.l(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        lVar.s(2);
        int i10 = z10 ? 7 : 6;
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(i10);
        e0Var.R(n.c(lVar, e0Var.d(), 0, i10));
        lVar.o();
        a aVar = new a();
        if (c(e0Var, uVar, z10, aVar)) {
            return aVar.f45684a;
        }
        throw ParserException.a(null, null);
    }

    public static int j(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return bb.c.b.f30606e8 << (i10 - 2);
            case 6:
                return e0Var.G() + 1;
            case 7:
                return e0Var.M() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
