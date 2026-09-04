package com.huawei.hms.scankit.p;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: OneTagCommon.java */
/* JADX INFO: loaded from: classes7.dex */
public class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f61953a = {new int[]{1, 1, 1, 1, 1, 1, 1, 0}, new int[]{1, 0, 0, 0, 0, 0, 1, 0}, new int[]{1, 0, 1, 1, 1, 0, 1, 0}, new int[]{1, 0, 1, 1, 1, 0, 1, 0}, new int[]{1, 0, 1, 1, 1, 0, 1, 0}, new int[]{1, 0, 0, 0, 0, 0, 1, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f61954b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    private static int a(String str) {
        int length = 0;
        for (String str2 : str.split(";")) {
            length += str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP).length;
        }
        return length;
    }

    public static s a(s sVar, s sVar2, int i10, double[][] dArr) {
        int i11;
        if (i10 == 21) {
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                for (int i14 = 0; i14 < i10; i14++) {
                    if (i14 >= 8 || i13 >= 8) {
                        int i15 = i10 - 8;
                        if (i14 < i15 || i13 >= 8) {
                            if (i14 >= 8 || i13 < i15) {
                                double[] dArrA = a((float) dArr[0][i12], (float) dArr[1][i12]);
                                if (sVar2.b(Math.round((float) dArrA[0]) + 0, Math.round((float) dArrA[1]) + 0)) {
                                    sVar.c(i14, i13);
                                }
                                i12++;
                            } else if (f61953a[i14][(i10 - 1) - i13] == 1) {
                                sVar.c(i14, i13);
                            }
                        } else if (f61953a[i13][(i10 - 1) - i14] == 1) {
                            sVar.c(i14, i13);
                        }
                    } else if (f61953a[i13][i14] == 1) {
                        sVar.c(i14, i13);
                    }
                }
            }
        } else {
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                for (int i18 = 0; i18 < i10; i18++) {
                    if (i18 >= 8 || i17 >= 8) {
                        int i19 = i10 - 8;
                        if (i18 < i19 || i17 >= 8) {
                            if (i18 >= 8 || i17 < i19) {
                                int i20 = i10 - 9;
                                if (i18 < i20 || i18 >= (i11 = i10 - 4) || i17 < i20 || i17 >= i11) {
                                    double[] dArrA2 = a((float) dArr[0][i16], (float) dArr[1][i16]);
                                    if (sVar2.b(Math.round((float) dArrA2[0]) + 0, Math.round((float) dArrA2[1]) + 0)) {
                                        sVar.c(i18, i17);
                                    }
                                    i16++;
                                } else {
                                    int i21 = -i20;
                                    if (f61954b[i21 + i17][i21 + i18] == 1) {
                                        sVar.c(i18, i17);
                                    }
                                }
                            } else if (f61953a[i18][(i10 - 1) - i17] == 1) {
                                sVar.c(i18, i17);
                            }
                        } else if (f61953a[i17][(i10 - 1) - i18] == 1) {
                            sVar.c(i18, i17);
                        }
                    } else if (f61953a[i17][i18] == 1) {
                        sVar.c(i18, i17);
                    }
                }
            }
        }
        return sVar;
    }

    public static StringBuffer a(double[] dArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (double d10 : dArr) {
            stringBuffer.append(d10);
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        stringBuffer.append(";");
        return stringBuffer;
    }

    private static double[] a(float f10, float f11) {
        double[] dArr = {0.0d, 0.0d};
        dArr[0] = f10;
        dArr[1] = f11;
        return dArr;
    }

    private static double[] a(String[] strArr) {
        int length = strArr.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = Double.valueOf(strArr[i10]).doubleValue();
        }
        return dArr;
    }

    public static double[][] a(double d10, double[] dArr, String str) {
        int iA = a(str);
        String[] strArrSplit = str.split(";");
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 2, iA);
        int i10 = 0;
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            double[] dArrA = a(strArrSplit[i11].split(Constants.ACCEPT_TIME_SEPARATOR_SP));
            for (int i12 = 0; i12 < dArrA.length; i12++) {
                int i13 = i11 / 2;
                dArr2[0][i10] = d10 - (dArr[i13] * Math.cos(dArrA[i12]));
                dArr2[1][i10] = d10 - (dArr[i13] * Math.sin(dArrA[i12]));
                i10++;
            }
        }
        return dArr2;
    }
}
