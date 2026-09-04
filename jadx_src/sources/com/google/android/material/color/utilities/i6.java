package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: QuantizerWsmeans.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f53866a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f53867b = 3.0d;

    /* JADX INFO: compiled from: QuantizerWsmeans.java */
    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f53868b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f53869c = -1.0d;

        a() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Double.valueOf(this.f53869c).compareTo(Double.valueOf(aVar.f53869c));
        }
    }

    private i6() {
    }

    public static Map<Integer, Integer> a(int[] iArr, int[] iArr2, int i10) {
        int[] iArr3;
        int i11;
        int i12;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length][];
        int[] iArr4 = new int[iArr.length];
        d6 d6Var = new d6();
        int i13 = 0;
        for (int i14 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i14));
            if (num == null) {
                dArr[i13] = d6Var.c(i14);
                iArr4[i13] = i14;
                i13++;
                linkedHashMap.put(Integer.valueOf(i14), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i14), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr5 = new int[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            iArr5[i15] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr4[i15]))).intValue();
        }
        int iMin = Math.min(i10, i13);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr2 = new double[iMin][];
        int i16 = 0;
        for (int i17 = 0; i17 < iArr2.length; i17++) {
            dArr2[i17] = d6Var.c(iArr2[i17]);
            i16++;
        }
        int i18 = iMin - i16;
        if (i18 > 0) {
            for (int i19 = 0; i19 < i18; i19++) {
            }
        }
        int[] iArr6 = new int[i13];
        for (int i20 = 0; i20 < i13; i20++) {
            iArr6[i20] = random.nextInt(iMin);
        }
        int[][] iArr7 = new int[iMin][];
        for (int i21 = 0; i21 < iMin; i21++) {
            iArr7[i21] = new int[iMin];
        }
        a[][] aVarArr = new a[iMin][];
        for (int i22 = 0; i22 < iMin; i22++) {
            aVarArr[i22] = new a[iMin];
            for (int i23 = 0; i23 < iMin; i23++) {
                aVarArr[i22][i23] = new a();
            }
        }
        int[] iArr8 = new int[iMin];
        int i24 = 0;
        while (true) {
            if (i24 >= 10) {
                iArr3 = iArr8;
                i11 = 0;
                break;
            }
            int i25 = 0;
            while (i25 < iMin) {
                int i26 = i25 + 1;
                int i27 = i26;
                while (i27 < iMin) {
                    int[] iArr9 = iArr8;
                    double dB = d6Var.b(dArr2[i25], dArr2[i27]);
                    a aVar = aVarArr[i27][i25];
                    aVar.f53869c = dB;
                    aVar.f53868b = i25;
                    a aVar2 = aVarArr[i25][i27];
                    aVar2.f53869c = dB;
                    aVar2.f53868b = i27;
                    i27++;
                    iArr8 = iArr9;
                }
                int[] iArr10 = iArr8;
                Arrays.sort(aVarArr[i25]);
                for (int i28 = 0; i28 < iMin; i28++) {
                    iArr7[i25][i28] = aVarArr[i25][i28].f53868b;
                }
                iArr8 = iArr10;
                i25 = i26;
            }
            int[] iArr11 = iArr8;
            int i29 = 0;
            int i30 = 0;
            while (i29 < i13) {
                double[] dArr3 = dArr[i29];
                int i31 = iArr6[i29];
                double dB2 = d6Var.b(dArr3, dArr2[i31]);
                int[][] iArr12 = iArr7;
                int[] iArr13 = iArr5;
                double d10 = dB2;
                int i32 = -1;
                int i33 = 0;
                while (i33 < iMin) {
                    a[][] aVarArr2 = aVarArr;
                    int i34 = i13;
                    if (aVarArr[i31][i33].f53869c < 4.0d * dB2) {
                        double dB3 = d6Var.b(dArr3, dArr2[i33]);
                        if (dB3 < d10) {
                            i32 = i33;
                            d10 = dB3;
                        }
                    }
                    i33++;
                    i13 = i34;
                    aVarArr = aVarArr2;
                }
                a[][] aVarArr3 = aVarArr;
                int i35 = i13;
                if (i32 != -1 && Math.abs(Math.sqrt(d10) - Math.sqrt(dB2)) > 3.0d) {
                    i30++;
                    iArr6[i29] = i32;
                }
                i29++;
                iArr7 = iArr12;
                iArr5 = iArr13;
                i13 = i35;
                aVarArr = aVarArr3;
            }
            int[] iArr14 = iArr5;
            int[][] iArr15 = iArr7;
            a[][] aVarArr4 = aVarArr;
            int i36 = i13;
            if (i30 == 0 && i24 != 0) {
                i11 = 0;
                iArr3 = iArr11;
                break;
            }
            double[] dArr4 = new double[iMin];
            double[] dArr5 = new double[iMin];
            double[] dArr6 = new double[iMin];
            char c10 = 0;
            Arrays.fill(iArr11, 0);
            int i37 = 0;
            while (true) {
                i12 = i36;
                if (i37 >= i12) {
                    break;
                }
                int i38 = iArr6[i37];
                double[] dArr7 = dArr[i37];
                int i39 = iArr14[i37];
                iArr11[i38] = iArr11[i38] + i39;
                double d11 = i39;
                dArr4[i38] = dArr4[i38] + (dArr7[c10] * d11);
                dArr5[i38] = dArr5[i38] + (dArr7[1] * d11);
                dArr6[i38] = dArr6[i38] + (dArr7[2] * d11);
                i37++;
                i24 = i24;
                i36 = i12;
                c10 = 0;
            }
            int i40 = i24;
            for (int i41 = 0; i41 < iMin; i41++) {
                int i42 = iArr11[i41];
                if (i42 == 0) {
                    dArr2[i41] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d12 = i42;
                    double d13 = dArr4[i41] / d12;
                    double d14 = dArr5[i41] / d12;
                    double d15 = dArr6[i41] / d12;
                    double[] dArr8 = dArr2[i41];
                    dArr8[0] = d13;
                    dArr8[1] = d14;
                    dArr8[2] = d15;
                }
            }
            iArr7 = iArr15;
            i24 = i40 + 1;
            iArr8 = iArr11;
            i13 = i12;
            iArr5 = iArr14;
            aVarArr = aVarArr4;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i43 = i11; i43 < iMin; i43++) {
            int i44 = iArr3[i43];
            if (i44 != 0) {
                int iA = d6Var.a(dArr2[i43]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(iA))) {
                    linkedHashMap2.put(Integer.valueOf(iA), Integer.valueOf(i44));
                }
            }
        }
        return linkedHashMap2;
    }
}
