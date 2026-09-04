package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PDF417ScanningDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a3 f62380a = new a3();

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    private static int a(s sVar, int i10, int i11, boolean z10, int i12, int i13) {
        int i14 = z10 ? -1 : 1;
        int i15 = i12;
        for (int i16 = 0; i16 < 2; i16++) {
            while (true) {
                if (!z10) {
                    if (i15 >= i11) {
                        break;
                    }
                    if (z10 == sVar.b(i15, i13)) {
                        break;
                        break;
                    }
                    if (Math.abs(i12 - i15) > 2) {
                        return i12;
                    }
                    i15 += i14;
                } else {
                    if (i15 < i10) {
                        break;
                    }
                    if (z10 == sVar.b(i15, i13)) {
                        break;
                    }
                    if (Math.abs(i12 - i15) > 2) {
                        return i12;
                    }
                    i15 += i14;
                }
            }
            i14 = -i14;
            z10 = !z10;
        }
        return i15;
    }

    private static int a(z1 z1Var, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        x0 x0VarA = a(z1Var, i13) ? z1Var.a(i13).a(i11) : null;
        if (x0VarA != null) {
            return z10 ? x0VarA.b() : x0VarA.d();
        }
        x0 x0VarB = z1Var.a(i10).b(i11);
        if (x0VarB != null) {
            return z10 ? x0VarB.d() : x0VarB.b();
        }
        if (a(z1Var, i13)) {
            x0VarB = z1Var.a(i13).b(i11);
        }
        if (x0VarB != null) {
            return z10 ? x0VarB.b() : x0VarB.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (!a(z1Var, i10)) {
                return z10 ? z1Var.i().e() : z1Var.i().c();
            }
            for (x0 x0Var : z1Var.a(i10).b()) {
                if (x0Var != null) {
                    return (z10 ? x0Var.b() : x0Var.d()) + (i12 * i14 * (x0Var.b() - x0Var.d()));
                }
            }
            i14++;
        }
    }

    private static int a(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int a(int[] iArr, int[] iArr2, int i10) throws a {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f62380a.a(iArr, i10, iArr2);
        }
        throw a.a();
    }

    private static a0 a(b2 b2Var) throws a {
        int[] iArrD;
        if (b2Var == null || (iArrD = b2Var.d()) == null) {
            return null;
        }
        int iB = b(iArrD);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArrD) {
            i11 += iB - i12;
            if (i12 > 0) {
                break;
            }
        }
        x0[] x0VarArrB = b2Var.b();
        for (int i13 = 0; i11 > 0 && x0VarArrB[i13] == null; i13++) {
            i11--;
        }
        for (int length = iArrD.length - 1; length >= 0; length--) {
            int i14 = iArrD[length];
            i10 += iB - i14;
            if (i14 > 0) {
                break;
            }
        }
        for (int length2 = x0VarArrB.length - 1; i10 > 0 && x0VarArrB[length2] == null; length2--) {
            i10--;
        }
        return b2Var.a().a(i11, i10, b2Var.e());
    }

    private static b2 a(s sVar, a0 a0Var, u6 u6Var, boolean z10, int i10, int i11) {
        b2 b2Var = new b2(a0Var, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int iB = (int) u6Var.b();
            for (int iC = (int) u6Var.c(); iC <= a0Var.d() && iC >= a0Var.f(); iC += i13) {
                x0 x0VarA = a(sVar, 0, sVar.e(), z10, iB, iC, i10, i11);
                if (x0VarA != null) {
                    b2Var.a(iC, x0VarA);
                    iB = z10 ? x0VarA.d() : x0VarA.b();
                }
            }
            i12++;
        }
        return b2Var;
    }

    private static k a(b2 b2Var, b2 b2Var2) throws a {
        k kVarC;
        k kVarC2;
        if (b2Var == null || (kVarC = b2Var.c()) == null) {
            if (b2Var2 == null) {
                return null;
            }
            return b2Var2.c();
        }
        if (b2Var2 == null || (kVarC2 = b2Var2.c()) == null || kVarC.a() == kVarC2.a() || kVarC.b() == kVarC2.b() || kVarC.c() == kVarC2.c()) {
            return kVarC;
        }
        return null;
    }

    private static w1 a(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4, Map<l1, ?> map) throws a {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw a.a();
            }
            for (int i13 = 0; i13 < length; i13++) {
                iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
            }
            try {
                return a(iArr, i10, iArr2, map);
            } catch (a unused) {
                if (length == 0) {
                    throw a.a();
                }
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = iArr5[i14];
                    if (i15 < iArr4[i14].length - 1) {
                        iArr5[i14] = i15 + 1;
                        break;
                    }
                    iArr5[i14] = 0;
                    if (i14 == length - 1) {
                        throw a.a();
                    }
                }
                i11 = i12;
            }
        }
    }

    public static w1 a(s sVar, u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4, int i10, int i11, Map<l1, ?> map) throws a {
        a0 a0Var = new a0(sVar, u6Var, u6Var2, u6Var3, u6Var4);
        b2 b2VarA = null;
        boolean z10 = true;
        b2 b2VarA2 = null;
        while (true) {
            a0 a0Var2 = a0Var;
            if (u6Var != null) {
                b2VarA = a(sVar, a0Var2, u6Var, true, i10, i11);
            }
            if (u6Var3 != null) {
                b2VarA2 = a(sVar, a0Var2, u6Var3, false, i10, i11);
            }
            z1 z1VarB = b(b2VarA, b2VarA2);
            if (z1VarB == null) {
                throw a.a();
            }
            a0Var = z1VarB.i();
            if (!z10 || a0Var == null || (a0Var.f() >= a0Var2.f() && a0Var.d() <= a0Var2.d())) {
                z1VarB.a(a0Var2);
                int iF = z1VarB.f() + 1;
                z1VarB.a(0, b2VarA);
                z1VarB.a(iF, b2VarA2);
                a(z1VarB, b2VarA, a0Var2, iF, sVar, i10, i11);
                return a(z1VarB, map);
            }
            z10 = false;
        }
    }

    private static w1 a(z1 z1Var, Map<l1, ?> map) throws a {
        m[][] mVarArrA = a(z1Var);
        a(z1Var, mVarArrA);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[z1Var.h() * z1Var.f()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < z1Var.h(); i10++) {
            int i11 = 0;
            while (i11 < z1Var.f()) {
                int i12 = i11 + 1;
                int[] iArrA = mVarArrA[i10][i12].a();
                int iF = (z1Var.f() * i10) + i11;
                if (iArrA.length == 0) {
                    arrayList.add(Integer.valueOf(iF));
                } else if (iArrA.length == 1) {
                    iArr[iF] = iArrA[0];
                } else {
                    arrayList3.add(Integer.valueOf(iF));
                    arrayList2.add(iArrA);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return a(z1Var.g(), iArr, n5.a(arrayList), n5.a(arrayList3), iArr2, map);
    }

    private static w1 a(int[] iArr, int i10, int[] iArr2, Map<l1, ?> map) throws a {
        if (iArr.length == 0) {
            throw a.a();
        }
        int i11 = 1 << (i10 + 1);
        int iA = a(iArr, iArr2, i11);
        a(iArr, i11);
        w1 w1VarA = q1.a(iArr, String.valueOf(i10), map);
        w1VarA.b(Integer.valueOf(iA));
        w1VarA.a(Integer.valueOf(iArr2.length));
        return w1VarA;
    }

    private static x0 a(s sVar, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int iD;
        int iA;
        int iA2 = a(sVar, i10, i11, z10, i12, i13);
        int[] iArrB = b(sVar, i10, i11, z10, iA2, i13);
        if (iArrB == null) {
            return null;
        }
        int iA3 = s4.a(iArrB);
        if (z10) {
            i16 = iA2 + iA3;
        } else {
            for (int i17 = 0; i17 < iArrB.length / 2; i17++) {
                int i18 = iArrB[i17];
                iArrB[i17] = iArrB[(iArrB.length - 1) - i17];
                iArrB[(iArrB.length - 1) - i17] = i18;
            }
            iA2 -= iA3;
            i16 = iA2;
        }
        if (a(iA3, i14, i15) && (iA = n5.a((iD = m5.d(iArrB)))) != -1) {
            return new x0(iA2, i16, b(iD), iA);
        }
        return null;
    }

    private static void a(z1 z1Var, b2 b2Var, a0 a0Var, int i10, s sVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        a2 a2Var;
        boolean z10 = b2Var != null;
        int i17 = i11;
        int i18 = i12;
        for (int i19 = 1; i19 <= i10; i19++) {
            int i20 = z10 ? i19 : i10 - i19;
            if (z1Var.a(i20) == null) {
                a2 b2Var2 = (i20 == 0 || i20 == i10) ? new b2(a0Var, i20 == 0) : new a2(a0Var);
                z1Var.a(i20, b2Var2);
                int i21 = -1;
                int i22 = i17;
                int iMax = i18;
                int iF = a0Var.f();
                int i23 = -1;
                while (iF <= a0Var.d()) {
                    int iA = a(z1Var, i20, iF, z10);
                    if (iA < 0 || iA > a0Var.c()) {
                        if (i23 == i21) {
                            i14 = iF;
                            i15 = i22;
                            i16 = i21;
                            a2Var = b2Var2;
                        } else {
                            i13 = i23;
                        }
                        i22 = i15;
                        i13 = i23;
                        iF = i14 + 1;
                        b2Var2 = a2Var;
                        i23 = i13;
                        i21 = i16;
                    } else {
                        i13 = iA;
                    }
                    int i24 = iF;
                    int i25 = iMax;
                    int i26 = i22;
                    i16 = i21;
                    a2Var = b2Var2;
                    x0 x0VarA = a(sVar, a0Var.e(), a0Var.c(), z10, i13, i24, i26, i25);
                    i14 = i24;
                    if (x0VarA != null) {
                        a2Var.a(i14, x0VarA);
                        int iMin = Math.min(i26, x0VarA.f());
                        iMax = Math.max(i25, x0VarA.f());
                        i22 = iMin;
                    } else {
                        iMax = i25;
                        i15 = i26;
                        i22 = i15;
                        i13 = i23;
                    }
                    iF = i14 + 1;
                    b2Var2 = a2Var;
                    i23 = i13;
                    i21 = i16;
                }
                i17 = i22;
                i18 = iMax;
            }
        }
    }

    private static void a(z1 z1Var, m[][] mVarArr) throws a {
        m mVar = mVarArr[0][1];
        int[] iArrA = mVar.a();
        int iF = (z1Var.f() * z1Var.h()) - c(z1Var.g());
        if (iArrA.length != 0) {
            if (iArrA[0] != iF) {
                mVar.a(iF);
            }
        } else {
            if (iF < 1 || iF > 928) {
                throw a.a();
            }
            mVar.a(iF);
        }
    }

    private static void a(int[] iArr, int i10) throws a {
        if (iArr.length < 4) {
            throw a.a();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw a.a();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw a.a();
            }
            iArr[0] = iArr.length - i10;
        }
    }

    private static boolean a(int i10, int i11, int i12) {
        return i11 + (-2) <= i10 && i10 <= i12 + 2;
    }

    private static boolean a(z1 z1Var, int i10) {
        return i10 >= 0 && i10 <= z1Var.f() + 1;
    }

    private static int[] a(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    private static m[][] a(z1 z1Var) throws a {
        int iC;
        m[][] mVarArr = (m[][]) Array.newInstance((Class<?>) m.class, z1Var.h(), z1Var.f() + 2);
        for (m[] mVarArr2 : mVarArr) {
            int i10 = 0;
            while (true) {
                if (i10 < mVarArr2.length) {
                    mVarArr2[i10] = new m();
                    i10++;
                }
            }
        }
        int i11 = 0;
        for (a2 a2Var : z1Var.j()) {
            if (a2Var != null) {
                for (x0 x0Var : a2Var.b()) {
                    if (x0Var != null && (iC = x0Var.c()) >= 0 && iC < mVarArr.length) {
                        mVarArr[iC][i11].a(x0Var.e());
                    }
                }
            }
            i11++;
        }
        return mVarArr;
    }

    private static int b(int i10) {
        return a(a(i10));
    }

    private static int b(int[] iArr) {
        int iMax = -1;
        for (int i10 : iArr) {
            iMax = Math.max(iMax, i10);
        }
        return iMax;
    }

    private static z1 b(b2 b2Var, b2 b2Var2) throws a {
        k kVarA;
        if ((b2Var == null && b2Var2 == null) || (kVarA = a(b2Var, b2Var2)) == null) {
            return null;
        }
        return new z1(kVarA, a0.a(a(b2Var), a(b2Var2)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX WARN: Code duplicated, block: B:28:0x0027 A[EDGE_INSN: B:28:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:7:0x000c->B:31:0x000c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x001b A[SYNTHETIC] */
    private static int[] b(s sVar, int i10, int i11, boolean z10, int i12, int i13) {
        int[] iArr = new int[8];
        int i14 = z10 ? 1 : -1;
        int i15 = 0;
        boolean z11 = z10;
        while (true) {
            if (!z10) {
                if (i12 < i10) {
                    break;
                }
                if (i15 < 8) {
                    break;
                    break;
                }
                if (sVar.b(i12, i13) == z11) {
                    iArr[i15] = iArr[i15] + 1;
                    i12 += i14;
                } else {
                    i15++;
                    z11 = !z11;
                }
            } else {
                if (i12 >= i11) {
                    break;
                }
                if (i15 < 8) {
                    break;
                }
                if (sVar.b(i12, i13) == z11) {
                    iArr[i15] = iArr[i15] + 1;
                    i12 += i14;
                } else {
                    i15++;
                    z11 = !z11;
                }
            }
        }
        if (i15 != 8) {
            if (z10) {
                i10 = i11;
            }
            if (i12 != i10 || i15 != 7) {
                return null;
            }
        }
        return iArr;
    }

    private static int c(int i10) {
        return 2 << i10;
    }
}
