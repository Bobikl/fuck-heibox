package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: ProjectionDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f51900a = 2037673328;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f51901b = 1836279920;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f51902c = 1918990112;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f51903d = 1684433976;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f51904e = 1835365224;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f51905f = 1886547818;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f51906g = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f51907h = 32000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f51908i = 128000;

    private f() {
    }

    @p0
    public static e a(byte[] bArr, int i10) {
        ArrayList<e.b> arrayListF;
        e0 e0Var = new e0(bArr);
        try {
            arrayListF = c(e0Var) ? f(e0Var) : e(e0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new e(arrayListF.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayListF.get(0), arrayListF.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(e0 e0Var) {
        e0Var.T(4);
        int iO = e0Var.o();
        e0Var.S(0);
        return iO == 1886547818;
    }

    @p0
    private static e.b d(e0 e0Var) {
        int iO = e0Var.o();
        if (iO > 10000) {
            return null;
        }
        float[] fArr = new float[iO];
        for (int i10 = 0; i10 < iO; i10++) {
            fArr[i10] = e0Var.n();
        }
        int iO2 = e0Var.o();
        if (iO2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iO) * 2.0d) / dLog);
        d0 d0Var = new d0(e0Var.d());
        int i11 = 8;
        d0Var.q(e0Var.e() * 8);
        float[] fArr2 = new float[iO2 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < iO2) {
            int i15 = 0;
            while (i15 < i12) {
                int iB = iArr[i15] + b(d0Var.h(iCeil));
                if (iB >= iO || iB < 0) {
                    return null;
                }
                fArr2[i14] = fArr[iB];
                iArr[i15] = iB;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        d0Var.q((d0Var.e() + 7) & (-8));
        int i16 = 32;
        int iH = d0Var.h(32);
        e.c[] cVarArr = new e.c[iH];
        int i17 = 0;
        while (i17 < iH) {
            int iH2 = d0Var.h(i11);
            int iH3 = d0Var.h(i11);
            int iH4 = d0Var.h(i16);
            if (iH4 > f51908i) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iO2) * d10) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int iB2 = 0;
            for (int i18 = 0; i18 < iH4; i18++) {
                iB2 += b(d0Var.h(iCeil2));
                if (iB2 < 0 || iB2 >= iO2) {
                    return null;
                }
                int i19 = i18 * 3;
                int i20 = iB2 * 5;
                fArr3[i19] = fArr2[i20];
                fArr3[i19 + 1] = fArr2[i20 + 1];
                fArr3[i19 + 2] = fArr2[i20 + 2];
                int i21 = i18 * 2;
                fArr4[i21] = fArr2[i20 + 3];
                fArr4[i21 + 1] = fArr2[i20 + 4];
            }
            cVarArr[i17] = new e.c(iH2, fArr3, fArr4, iH3);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.b(cVarArr);
    }

    @p0
    private static ArrayList<e.b> e(e0 e0Var) {
        if (e0Var.G() != 0) {
            return null;
        }
        e0Var.T(7);
        int iO = e0Var.o();
        if (iO == f51903d) {
            e0 e0Var2 = new e0();
            Inflater inflater = new Inflater(true);
            try {
                if (!u0.E0(e0Var, e0Var2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                e0Var = e0Var2;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iO != f51902c) {
            return null;
        }
        return g(e0Var);
    }

    @p0
    private static ArrayList<e.b> f(e0 e0Var) {
        int iO;
        e0Var.T(8);
        int iE = e0Var.e();
        int iF = e0Var.f();
        while (iE < iF && (iO = e0Var.o() + iE) > iE && iO <= iF) {
            int iO2 = e0Var.o();
            if (iO2 == f51900a || iO2 == f51901b) {
                e0Var.R(iO);
                return e(e0Var);
            }
            e0Var.S(iO);
            iE = iO;
        }
        return null;
    }

    @p0
    private static ArrayList<e.b> g(e0 e0Var) {
        ArrayList<e.b> arrayList = new ArrayList<>();
        int iE = e0Var.e();
        int iF = e0Var.f();
        while (iE < iF) {
            int iO = e0Var.o() + iE;
            if (iO <= iE || iO > iF) {
                return null;
            }
            if (e0Var.o() == f51904e) {
                e.b bVarD = d(e0Var);
                if (bVarD == null) {
                    return null;
                }
                arrayList.add(bVarD);
            }
            e0Var.S(iO);
            iE = iO;
        }
        return arrayList;
    }
}
