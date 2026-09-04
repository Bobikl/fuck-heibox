package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Code128Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f62272a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    private static int a(r rVar, int[] iArr, int i10) throws a {
        g5.a(rVar, i10, iArr);
        float f10 = 0.25f;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[][] iArr2 = f62272a;
            if (i12 >= iArr2.length) {
                break;
            }
            float fB = i12 == iArr2.length + (-1) ? b(rVar, iArr, i10) : g5.a(iArr, iArr2[i12], 0.7f);
            if (fB < f10) {
                i11 = i12;
                f10 = fB;
            }
            i12++;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw a.a();
    }

    private void a(StringBuilder sb2, int[] iArr, int[] iArr2, int i10, r rVar, List<Byte> list) throws a {
        boolean z10 = false;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int[] iArr3 = new int[6];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z11 = false;
        int i18 = 0;
        int i19 = 1;
        int i20 = iArr2[6];
        int i21 = i12;
        int i22 = i11;
        int i23 = i10;
        while (i13 == 0) {
            int iA = a(rVar, iArr3, i21);
            list.add(Byte.valueOf((byte) iA));
            if (iA != 106) {
                i15++;
                i23 += i15 * iA;
                i19 = 1;
            }
            int i24 = i21;
            for (int i25 = 0; i25 < 6; i25++) {
                i24 += iArr3[i25];
            }
            if (iA == 105) {
                throw a.a();
            }
            int[] iArrC = {iA, i16, i17, i19, i20, 0, i13};
            if (i20 == 101) {
                iArrC = a(sb2, iArrC);
            } else if (i20 == 100) {
                iArrC = b(sb2, iArrC);
            } else if (i20 == 99) {
                iArrC = c(sb2, iArrC);
            }
            int i26 = iArrC[0];
            i16 = iArrC[1] == 1 ? 1 : 0;
            i17 = iArrC[2] == 1 ? 1 : 0;
            int i27 = iArrC[3] == 1 ? 1 : 0;
            boolean z12 = iArrC[5] == 1;
            int i28 = iArrC[6] == 1 ? 1 : 0;
            i20 = z11 ? iArrC[4] == 101 ? 100 : 101 : iArrC[4];
            z11 = z12;
            i14 = i18;
            z10 = false;
            i13 = i28;
            i18 = i26;
            i19 = i27;
            i22 = i21;
            i21 = i24;
        }
        iArr2[z10 ? 1 : 0] = i22;
        iArr2[1] = i21;
        iArr2[2] = i14;
        iArr2[3] = i23;
        iArr2[4] = i15;
        iArr2[5] = i19;
        iArr2[6] = i20;
    }

    private static boolean a(r rVar, int i10, int i11) {
        return rVar.a(i10, i11, false, false);
    }

    private static int[] a(r rVar) throws a {
        int iE = rVar.e();
        int iC = rVar.c(0);
        int[] iArr = new int[6];
        boolean z10 = false;
        int i10 = 0;
        int i11 = iC;
        while (iC < iE) {
            if (rVar.b(iC) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == 5) {
                    float f10 = 0.25f;
                    int i12 = -1;
                    for (int i13 = 103; i13 <= 105; i13++) {
                        float fA = g5.a(iArr, f62272a[i13], 0.7f);
                        if (fA < f10) {
                            i12 = i13;
                            f10 = fA;
                        }
                    }
                    if (i12 >= 0) {
                        return new int[]{i11, iC, i12};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i14 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i14);
                    iArr[i14] = 0;
                    iArr[i10] = 0;
                    i10--;
                } else {
                    i10++;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            iC++;
        }
        throw a.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int[] a(StringBuilder sb2, int[] iArr) throws a {
        int i10 = iArr[0];
        int i11 = iArr[1] == 1 ? 1 : 0;
        int i12 = iArr[2] == 1 ? 1 : 0;
        int i13 = iArr[3] == 1 ? 1 : 0;
        int i14 = iArr[4];
        int i15 = iArr[5] == 1 ? 1 : 0;
        int i16 = iArr[6] == 1 ? 1 : 0;
        if (i10 >= 64) {
            if (i10 >= 96) {
                if (i10 != 106) {
                    i13 = 0;
                }
                if (i10 != 106) {
                    switch (i10) {
                        case 96:
                        case 97:
                        case 102:
                            break;
                        case 98:
                            i15 = 1;
                            i14 = 100;
                            break;
                        case 99:
                            i14 = 99;
                            break;
                        case 100:
                            i14 = 100;
                            break;
                        case 101:
                            if (i12 == 0 && i11 != 0) {
                                i11 = 0;
                                i12 = 1;
                            } else if (i12 == 0 || i11 == 0) {
                                i11 = 1;
                            } else {
                                i11 = 0;
                                i12 = 0;
                            }
                            break;
                        default:
                            throw a.a();
                    }
                } else {
                    i16 = 1;
                }
            } else if (i11 == i12) {
                sb2.append((char) (i10 - 64));
            } else {
                sb2.append((char) (i10 + 64));
            }
            return new int[]{i10, i11, i12, i13, i14, i15, i16};
        }
        if (i11 == i12) {
            sb2.append((char) (i10 + 32));
        } else {
            sb2.append((char) (i10 + 32 + 128));
        }
        i11 = 0;
        return new int[]{i10, i11, i12, i13, i14, i15, i16};
    }

    private static float b(r rVar, int[] iArr, int i10) {
        int[] iArr2 = new int[7];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        for (int i11 : iArr) {
            i10 += i11;
        }
        boolean z10 = true;
        int i12 = 0;
        while (z10 && i10 < rVar.e()) {
            if (rVar.b(i10)) {
                i12++;
                i10++;
            } else {
                iArr2[6] = i12;
                z10 = false;
            }
        }
        int[][] iArr3 = f62272a;
        return g5.a(iArr2, iArr3[iArr3.length - 1], 0.7f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int[] b(StringBuilder sb2, int[] iArr) throws a {
        int i10 = iArr[0];
        int i11 = iArr[1] == 1 ? 1 : 0;
        int i12 = iArr[2] == 1 ? 1 : 0;
        int i13 = iArr[3] == 1 ? 1 : 0;
        int i14 = iArr[4];
        int i15 = iArr[5] == 1 ? 1 : 0;
        int i16 = iArr[6] == 1 ? 1 : 0;
        if (i10 < 96) {
            if (i11 == i12) {
                sb2.append((char) (i10 + 32));
            } else {
                sb2.append((char) (i10 + 32 + 128));
            }
            i11 = 0;
        } else {
            if (i10 != 106) {
                i13 = 0;
            }
            if (i10 != 106) {
                switch (i10) {
                    case 96:
                    case 97:
                    case 102:
                        break;
                    case 98:
                        i15 = 1;
                        i14 = 101;
                        break;
                    case 99:
                        i14 = 99;
                        break;
                    case 100:
                        if (i12 == 0 && i11 != 0) {
                            i11 = 0;
                            i12 = 1;
                        } else if (i12 == 0 || i11 == 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        break;
                    case 101:
                        i14 = 101;
                        break;
                    default:
                        throw a.a();
                }
            } else {
                i16 = 1;
            }
        }
        return new int[]{i10, i11, i12, i13, i14, i15, i16};
    }

    private int[] c(StringBuilder sb2, int[] iArr) throws a {
        int i10 = iArr[0];
        int i11 = iArr[1] == 1 ? 1 : 0;
        int i12 = iArr[2] == 1 ? 1 : 0;
        int i13 = iArr[3] == 1 ? 1 : 0;
        int i14 = iArr[4];
        int i15 = iArr[5] == 1 ? 1 : 0;
        int i16 = iArr[6] == 1 ? 1 : 0;
        if (i10 < 100) {
            if (i10 < 10) {
                sb2.append('0');
            }
            sb2.append(i10);
        } else {
            if (i10 != 106) {
                i13 = 0;
            }
            if (i10 != 106) {
                switch (i10) {
                    case 100:
                        i14 = 100;
                        break;
                    case 101:
                        i14 = 101;
                        break;
                    case 102:
                        break;
                    default:
                        throw a.a();
                }
            } else {
                i16 = 1;
            }
        }
        return new int[]{i10, i11, i12, i13, i14, i15, i16};
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i10, r rVar, Map<l1, ?> map) throws a {
        int i11;
        int[] iArrA = a(rVar);
        int i12 = iArrA[0];
        int i13 = i12 - (((iArrA[1] - i12) / 11) * 10);
        if (i13 > 0 && i13 < i12) {
            if (!a(rVar, i13, i12)) {
                throw a.a();
            }
        }
        int i14 = iArrA[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i14));
        if (i14 == 103) {
            i11 = 101;
        } else if (i14 == 104) {
            i11 = 100;
        } else {
            i11 = i14 == 105 ? 99 : 0;
        }
        if (i11 == 0) {
            throw a.a();
        }
        StringBuilder sb2 = new StringBuilder(20);
        int[] iArr = new int[7];
        iArr[6] = i11;
        a(sb2, iArrA, iArr, i14, rVar, arrayList);
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        int i19 = iArr[4];
        boolean z10 = iArr[5] == 1;
        int i20 = iArr[6];
        int i21 = i16 - i15;
        if ((i18 - (i19 * i17)) % 103 != i17) {
            throw a.a();
        }
        int length = sb2.length();
        if (length == 0) {
            throw a.a();
        }
        if (length > 0 && z10) {
            if (i20 == 99) {
                sb2.delete(length - 2, length);
            } else {
                sb2.delete(length - 1, length);
            }
        }
        float f10 = iArrA[0];
        float f11 = i15 + ((i21 * 13) / 11);
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i22 = 0; i22 < size; i22++) {
            bArr[i22] = arrayList.get(i22).byteValue();
        }
        float f12 = i10;
        return new s6(sb2.toString(), bArr, new u6[]{new u6(f10, f12), new u6(f11, f12)}, BarcodeFormat.CODE_128);
    }
}
