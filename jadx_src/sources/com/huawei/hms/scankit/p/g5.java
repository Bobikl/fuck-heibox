package com.huawei.hms.scankit.p;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: OneDReader.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g5 implements o6 {
    protected static float a(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = iArr2[i13] * f12;
            float f16 = i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    /* JADX WARN: Code duplicated, block: B:23:0x0035  */
    /* JADX WARN: Code duplicated, block: B:40:0x0048 A[SYNTHETIC] */
    private s6 a(p pVar, r rVar, Map<l1, ?> map, int i10, int i11) throws a {
        int i12;
        s6 s6VarA;
        int i13 = 0;
        while (true) {
            int i14 = 3;
            if (i13 >= 3) {
                return null;
            }
            if (i13 == 0) {
                try {
                    rVar = pVar.a(i10, rVar);
                    if (a(rVar.d())) {
                        if (r3.f62277c) {
                            i12 = i14;
                        } else {
                            i12 = 1;
                        }
                        s6VarA = a(rVar, i12, map, i10, i11);
                        if (s6VarA != null && s6VarA.k() != null) {
                            return s6VarA;
                        }
                    } else {
                        continue;
                    }
                } catch (a unused) {
                    continue;
                }
            } else {
                if (i13 == 1) {
                    rVar = pVar.b().a(i10, rVar);
                    i14 = 1;
                } else if (i13 == 2) {
                    if (r3.f62294t) {
                        rVar = pVar.a(i10, 1);
                    } else {
                        continue;
                    }
                }
                if (a(rVar.d())) {
                    if (r3.f62277c) {
                        i12 = 1;
                    } else {
                        i12 = i14;
                    }
                    s6VarA = a(rVar, i12, map, i10, i11);
                    if (s6VarA != null) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i13++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    private s6 a(r rVar, int i10, Map<l1, ?> map, int i11, int i12) {
        u6[] u6VarArrJ;
        Map<l1, ?> map2 = map;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i13 == 0) {
                rVar.c();
            }
            if (i13 == 1) {
                rVar.i();
            }
            if (i13 == 2) {
                rVar.g();
                rVar.j();
            }
            int i14 = 0;
            for (int i15 = 2; i14 < i15; i15 = 2) {
                if (i14 == 1) {
                    rVar.h();
                    if (map2 != null) {
                        l1 l1Var = l1.NEED_RESULT_POINT_CALLBACK;
                        if (map2.containsKey(l1Var)) {
                            EnumMap enumMap = new EnumMap(l1.class);
                            enumMap.putAll(map2);
                            enumMap.remove(l1Var);
                            map2 = enumMap;
                        }
                    }
                }
                try {
                    s6 s6VarA = a(i11, rVar, map2);
                    if (i14 == 1 && (u6VarArrJ = s6VarA.j()) != null) {
                        float f10 = i12;
                        u6VarArrJ[0] = new u6((f10 - u6VarArrJ[0].b()) - 1.0f, u6VarArrJ[0].c());
                        u6VarArrJ[1] = new u6((f10 - u6VarArrJ[1].b()) - 1.0f, u6VarArrJ[1].c());
                    }
                    if (a(s6VarA, i12)) {
                        return s6VarA;
                    }
                    i14++;
                } catch (a unused) {
                    if (i14 == 1) {
                        rVar.h();
                    }
                }
            }
        }
        return null;
    }

    protected static void a(r rVar, int i10, int[] iArr) throws a {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iE = rVar.e();
        if (i10 >= iE) {
            throw a.a();
        }
        boolean z10 = !rVar.b(i10);
        while (i10 < iE) {
            if (rVar.b(i10) == z10) {
                i11++;
                if (i11 == length) {
                    break;
                }
                if (i11 < 0 || i11 >= iArr.length) {
                    throw a.a();
                }
                iArr[i11] = 1;
                z10 = !z10;
            } else {
                if (i11 < 0 || i11 >= iArr.length) {
                    throw a.a();
                }
                iArr[i11] = iArr[i11] + 1;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != iE) {
                throw a.a();
            }
        }
    }

    private static boolean a(s6 s6Var, int i10) {
        u6[] u6VarArrJ = s6Var.j();
        return Math.abs(((double) u6VarArrJ[1].b()) - ((double) u6VarArrJ[0].b())) / ((double) i10) > 0.4d;
    }

    private static boolean a(int[] iArr) {
        int iBitCount = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length && iBitCount < 20; i11++) {
            int i12 = iArr[i11];
            iBitCount += Integer.bitCount((i10 | (i12 << 1)) ^ i12);
            i10 = (iArr[i11] >> 31) & 1;
        }
        return iBitCount >= 20;
    }

    private s6 b(p pVar, Map<l1, ?> map) throws a {
        int iE = pVar.e();
        int iC = pVar.c();
        r rVar = new r(iE);
        int iMax = Math.max(1, iC >> 5);
        int iIntValue = iC / 2;
        if (map != null) {
            l1 l1Var = l1.PHOTO_MODE_NUM;
            if (map.containsKey(l1Var)) {
                iIntValue += (((Integer) map.get(l1Var)).intValue() * iMax) / 3;
            }
        }
        int i10 = iIntValue;
        int i11 = 0;
        while (i11 < 15) {
            int i12 = i11 + 1;
            int i13 = i12 / 2;
            if (!((i11 & 1) == 0)) {
                i13 = -i13;
            }
            int i14 = i10 + (i13 * iMax);
            if (i14 < 0 || i14 >= iC) {
                break;
            }
            s6 s6VarA = a(pVar, rVar, map, i14, iE);
            if (s6VarA != null && s6VarA.k() != null) {
                return s6VarA;
            }
            i11 = i12;
        }
        throw a.a();
    }

    public abstract s6 a(int i10, r rVar, Map<l1, ?> map) throws a;

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map<l1, ?> map) throws a {
        return b(pVar, map);
    }
}
