package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MultiFormatReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a5 implements o6 {
    private s6 a(int i10, m4 m4Var, p pVar, p pVar2, Map<l1, ?> map) throws a {
        o6[] o6VarArrA = a(map);
        try {
            if (r3.f62275a) {
                float f10 = (i10 * 1.0f) / 500.0f;
                if (f10 <= 1.0f) {
                    f10 = 1.0f;
                }
                s6 s6VarA = a(m4Var.g(m4Var.g(pVar, f10)), o6VarArrA, map);
                if (s6VarA != null && s6VarA.k() != null) {
                    k2.a(s6VarA.j(), f10, (i2) null);
                    return s6VarA;
                }
            }
            throw a.a();
        } catch (a unused) {
            float f11 = (i10 * 1.0f) / 1080.0f;
            float f12 = f11 > 1.0f ? f11 : 1.0f;
            s6 s6VarA2 = a(m4Var.b(pVar2, f12), o6VarArrA, map);
            if (s6VarA2 != null && s6VarA2.k() != null) {
                k2.a(s6VarA2.j(), f12, (i2) null);
            }
            return s6VarA2;
        }
    }

    private s6 a(int i10, p pVar, m4 m4Var, Map<l1, ?> map, i2 i2Var) throws a {
        float f10 = (i10 * 1.0f) / 250.0f;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        p pVarF = m4Var.f(pVar, f10);
        o6[] o6VarArrA = a(map);
        try {
            try {
                s6 s6VarA = a(m4Var.e(pVarF), o6VarArrA, map);
                if (s6VarA == null || s6VarA.k() == null) {
                    throw a.a();
                }
                k2.a(s6VarA.j(), f10, i2Var);
                return s6VarA;
            } catch (a unused) {
                s6 s6VarA2 = a(new p(new e4(pVar.a().c())), o6VarArrA, map);
                if (s6VarA2 != null && s6VarA2.k() != null) {
                    k2.a(s6VarA2.j(), 1.0f, i2Var);
                }
                return s6VarA2;
            }
        } catch (a unused2) {
            s6 s6VarA3 = a(m4Var.f(pVarF), o6VarArrA, map);
            if (s6VarA3 == null || s6VarA3.k() == null) {
                throw a.a();
            }
            k2.a(s6VarA3.j(), f10, i2Var);
            return s6VarA3;
        }
    }

    private s6 a(p pVar, m4 m4Var, Map<l1, ?> map, i2 i2Var) throws a {
        boolean z10;
        u6[] u6VarArr;
        s6 s6VarA;
        int iE = pVar.e();
        int iC = pVar.c();
        if (iE >= iC) {
            iE = iC;
        }
        float f10 = (iE * 1.0f) / 900.0f;
        p pVarI = m4Var.i(pVar, f10);
        s6 s6Var = null;
        u6VarArr = null;
        u6VarArr = null;
        u6[] u6VarArr2 = null;
        try {
            s6 s6VarA2 = a(pVarI, a(map), map);
            if (s6VarA2 != null) {
                try {
                    if (s6VarA2.k() != null) {
                        k2.a(s6VarA2.j(), f10, i2Var);
                        return s6VarA2;
                    }
                } catch (a unused) {
                    z10 = false;
                    u6VarArr = u6VarArr2;
                    s6Var = s6VarA2;
                    try {
                        pVarI.a(n1.a(pVarI.d(), pVarI.e(), pVarI.c(), false));
                        s6VarA = a(pVarI, a(map), map);
                        if (s6VarA != null || s6VarA.k() == null) {
                            throw a.a();
                        }
                        k2.a(s6VarA.j(), f10, i2Var);
                        return s6VarA;
                    } catch (a unused2) {
                        if (s6Var == null) {
                            throw a.a();
                        }
                        if (z10) {
                            s6Var.a();
                            s6Var.b(u6VarArr);
                            k2.a(s6Var.j(), f10, i2Var);
                        }
                        return s6Var;
                    }
                }
            }
            if (r3.f62277c || s6VarA2 == null || s6VarA2.k() != null || s6VarA2.j().length < 3) {
                z10 = false;
            } else {
                z10 = true;
                try {
                    u6VarArr2 = (u6[]) s6VarA2.j().clone();
                } catch (a unused3) {
                    u6VarArr = u6VarArr2;
                    s6Var = s6VarA2;
                    pVarI.a(n1.a(pVarI.d(), pVarI.e(), pVarI.c(), false));
                    s6VarA = a(pVarI, a(map), map);
                    if (s6VarA != null) {
                    }
                    throw a.a();
                }
            }
            throw a.a();
        } catch (a unused4) {
            z10 = false;
            u6VarArr = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.huawei.hms.scankit.p.m4] */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.huawei.hms.scankit.p.s6] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.huawei.hms.scankit.p.s6] */
    private s6 a(p pVar, m4 m4Var, Map<l1, Object> map, float[] fArr) throws a {
        p pVarA;
        s6 s6VarA;
        float fMin = (Math.min(pVar.c(), pVar.e()) * 1.0f) / 1080.0f;
        if (r3.f62275a) {
            pVarA = m4Var.a(pVar, fMin);
        } else {
            float f10 = fMin > 1.5f ? fMin : 1.0f;
            pVarA = m4Var.a(pVar, f10);
            fMin = f10;
        }
        o6[] o6VarArrA = a(map);
        if (r3.f62276b || !r3.f62275a) {
            s6 s6VarA2 = null;
            int i10 = 0;
            s6VarA = m4Var;
            while (true) {
                if (i10 < 2) {
                    if (i10 == 1) {
                        s6VarA2 = a(s6VarA.c(l4.a(pVarA)), o6VarArrA, (Map<l1, ?>) map);
                        fArr[1] = 2.0f;
                    } else {
                        try {
                            try {
                                s6VarA = a(s6VarA.b(pVarA), o6VarArrA, (Map<l1, ?>) map);
                                break;
                            } catch (a unused) {
                                if (r3.f62290p) {
                                    map.put(l1.PHOTO_MODE_NUM, 1);
                                    s6VarA = a(s6VarA.d(pVarA), o6VarArrA, (Map<l1, ?>) map);
                                    break;
                                }
                                i10++;
                                s6VarA = s6VarA;
                            }
                        } catch (a unused2) {
                            i10++;
                            s6VarA = s6VarA;
                        }
                    }
                }
                s6VarA = s6VarA2;
                i10++;
                s6VarA = s6VarA;
            }
        } else {
            map.put(l1.PHOTO_MODE_NUM, 0);
            s6VarA = a(pVarA, o6VarArrA, (Map<l1, ?>) map);
        }
        if (s6VarA != 0) {
            k2.a(pVarA.b(), s6VarA, fMin, (i2) null);
        }
        fArr[0] = fMin;
        return s6VarA;
    }

    private s6 a(p pVar, m4 m4Var, Map<l1, Object> map, float[] fArr, i2 i2Var) throws a {
        s6 s6VarA;
        float fN = i2Var.n();
        float fE = pVar.e() < pVar.c() ? pVar.e() : pVar.c();
        float f10 = fE / 500.0f;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        p pVarG = m4Var.g(pVar, f10);
        o6[] o6VarArrA = a(map);
        float fB = i2Var.a() > 0.0f ? i2Var.b() / i2Var.a() : 1.0f;
        s6 s6Var = null;
        try {
            s6VarA = a(pVarG, o6VarArrA, (Map<l1, ?>) map);
            try {
                if (a(s6VarA, fN / f10, fB)) {
                    throw a.a();
                }
            } catch (a unused) {
                s6Var = s6VarA;
                if (r3.f62290p) {
                    float f11 = fE / 250.0f;
                    float f12 = f11 >= 1.0f ? f11 : 1.0f;
                    pVarG = m4Var.f(pVar, f12);
                    try {
                        map.put(l1.PHOTO_MODE_NUM, 2);
                        s6VarA = a(m4Var.e(pVarG), o6VarArrA, (Map<l1, ?>) map);
                        if (a(s6VarA, fN / f12, fB)) {
                            throw a.a();
                        }
                    } catch (a unused2) {
                        map.put(l1.PHOTO_MODE_NUM, 1);
                        s6VarA = a(m4Var.f(pVarG), o6VarArrA, (Map<l1, ?>) map);
                        if (a(s6VarA, fN / f12, fB)) {
                            throw a.a();
                        }
                    }
                    f10 = f12;
                } else {
                    s6VarA = s6Var;
                }
            }
        } catch (a unused3) {
        }
        fArr[0] = f10;
        if (s6VarA != null) {
            k2.a(pVarG.b(), s6VarA, f10, i2Var);
        }
        return s6VarA;
    }

    private s6 a(p pVar, o6[] o6VarArr, Map<l1, ?> map) throws a {
        if (o6VarArr != null) {
            for (o6 o6Var : o6VarArr) {
                try {
                    s6 s6VarA = o6Var.a(pVar, map);
                    if (s6VarA != null && s6VarA.j() != null) {
                        int i10 = 0;
                        for (u6 u6Var : s6VarA.j()) {
                            if (u6Var != null) {
                                i10++;
                            }
                        }
                        if (i10 == 0 && s6VarA.c() == BarcodeFormat.PDF_417) {
                            throw a.a();
                        }
                    }
                    return s6VarA;
                } catch (a unused) {
                }
            }
        }
        throw a.a();
    }

    public static boolean a(s6 s6Var, float f10, float f11) {
        double dAbs = Math.abs(s6Var.j()[0].b() - s6Var.j()[1].b()) / f10;
        return (dAbs < 0.55d && ((double) f11) > 1.5d) || dAbs < 0.3d;
    }

    public s6 a(p pVar, p pVar2, m4 m4Var, Map<l1, ?> map) throws a {
        p pVarA;
        int iE = pVar.e();
        int iC = pVar.c();
        int i10 = iE < iC ? iE : iC;
        float f10 = (i10 * 1.0f) / 1080.0f;
        if (f10 <= 1.0f) {
            f10 = 1.0f;
        }
        if (r3.f62275a) {
            pVarA = m4Var.a(pVar, f10);
        } else {
            float f11 = f10 > 1.5f ? f10 : 1.0f;
            float f12 = f11;
            pVarA = m4Var.a(pVar, f11);
            f10 = f12;
        }
        try {
            s6 s6VarA = a(pVarA, a(map), map);
            if (s6VarA != null && s6VarA.k() != null) {
                k2.a(s6VarA.j(), f10, (i2) null);
                return s6VarA;
            }
            if (!r3.f62277c && s6VarA != null && s6VarA.k() == null && s6VarA.j().length >= 3) {
            }
            throw a.a();
        } catch (a unused) {
            s6 s6VarA2 = a(i10, m4Var, pVar, pVar2, map);
            if (s6VarA2 == null) {
                throw a.a();
            }
            if (0 != 0) {
                s6VarA2.a();
                s6VarA2.b((u6[]) null);
            }
            return s6VarA2;
        }
    }

    public s6 a(p pVar, p pVar2, p pVar3, Map<l1, ?> map, m4 m4Var, i2 i2Var) throws a {
        s6 s6VarA = pVar3 != null ? a(pVar3, m4Var, map, i2Var) : null;
        if (s6VarA != null) {
            return s6VarA;
        }
        throw a.a();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c A[SYNTHETIC] */
    public s6 a(p pVar, p pVar2, Map<l1, Object> map, m4 m4Var, i2 i2Var) throws a {
        s6 s6VarA;
        boolean z10;
        u6[] u6VarArrJ;
        boolean zContainsKey = map.containsKey(l1.PHOTO_MODE);
        float[] fArr = {1.0f, 0.0f};
        if (pVar2 != null) {
            s6VarA = a(pVar2, m4Var, map, fArr, i2Var);
        } else {
            if (zContainsKey || !r3.f62275a) {
                s6VarA = a(pVar, m4Var, map, fArr);
                z10 = fArr[1] > 1.0f;
                if (s6VarA != null) {
                    throw a.a();
                }
                if (z10 && (u6VarArrJ = s6VarA.j()) != null) {
                    for (int i10 = 0; i10 < u6VarArrJ.length; i10++) {
                        if (u6VarArrJ[i10] != null) {
                            u6VarArrJ[i10] = new u6(u6VarArrJ[i10].c(), (pVar.c() - 1) - u6VarArrJ[i10].b());
                        }
                    }
                }
                return s6VarA;
            }
            s6VarA = null;
        }
        if (s6VarA != null) {
            throw a.a();
        }
        if (z10) {
            while (i10 < u6VarArrJ.length) {
                if (u6VarArrJ[i10] != null) {
                    u6VarArrJ[i10] = new u6(u6VarArrJ[i10].c(), (pVar.c() - 1) - u6VarArrJ[i10].b());
                }
            }
        }
        return s6VarA;
    }

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map<l1, ?> map) throws a {
        return a(pVar, a(map), map);
    }

    public o6[] a(Map<l1, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(l1.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new z4(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new j6());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new h1());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new h());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new r5());
            }
            if (collection.contains(BarcodeFormat.HARMONY_CODE)) {
                arrayList.add(new z3());
            }
            if (collection.contains(BarcodeFormat.WXCODE)) {
                arrayList.add(new m8());
            }
        }
        return (o6[]) arrayList.toArray(new o6[arrayList.size()]);
    }

    public s6 b(p pVar, m4 m4Var, Map<l1, ?> map, i2 i2Var) throws a {
        int iE = pVar.e();
        int iC = pVar.c();
        int i10 = iE < iC ? iE : iC;
        float f10 = i10 * 1.0f;
        float f11 = f10 / 128.0f;
        if (f11 < 1.0f && r3.f62277c) {
            pVar = m4Var.e(pVar, f11);
        }
        p pVar2 = pVar;
        float f12 = f10 / 500.0f;
        float f13 = f12 >= 1.0f ? f12 : 1.0f;
        try {
            s6 s6VarA = a(m4Var.g(pVar2, f13), a(map), map);
            if (s6VarA != null && s6VarA.k() != null) {
                k2.a(s6VarA.j(), f13, i2Var);
                return s6VarA;
            }
            if (!r3.f62277c && s6VarA != null && s6VarA.k() == null && s6VarA.j().length >= 3) {
            }
            throw a.a();
        } catch (a unused) {
            s6 s6VarA2 = a(i10, pVar2, m4Var, map, i2Var);
            if (s6VarA2 == null) {
                throw a.a();
            }
            if (0 != 0) {
                s6VarA2.a();
                s6VarA2.b((u6[]) null);
                k2.a(s6VarA2.j(), f13, i2Var);
            }
            return s6VarA2;
        }
    }

    public s6 b(p pVar, p pVar2, p pVar3, Map<l1, ?> map, m4 m4Var, i2 i2Var) throws a {
        return pVar3 != null ? b(pVar3, m4Var, map, i2Var) : a(pVar, pVar2, m4Var, map);
    }

    public s6 c(p pVar, m4 m4Var, Map<l1, ?> map, i2 i2Var) throws a {
        s6 s6VarA;
        int iE = pVar.e();
        int iC = pVar.c();
        if (iE >= iC) {
            iE = iC;
        }
        float f10 = (iE * 1.0f) / 500.0f;
        p pVarG = m4Var.g(pVar, f10);
        try {
            s6VarA = a(pVarG, a(map), map);
            if (s6VarA != null) {
                try {
                    if (s6VarA.k() != null) {
                        k2.a(s6VarA.j(), f10, i2Var);
                        return s6VarA;
                    }
                } catch (a unused) {
                    try {
                        pVarG.a(n1.a(pVarG.d(), pVarG.e(), pVarG.c(), true));
                        s6 s6VarA2 = a(pVarG, a(map), map);
                        if (s6VarA2 == null || s6VarA2.k() == null) {
                            throw a.a();
                        }
                        k2.a(s6VarA2.j(), f10, i2Var);
                        return s6VarA2;
                    } catch (a unused2) {
                        if (s6VarA != null) {
                            return s6VarA;
                        }
                        throw a.a();
                    }
                }
            }
            throw a.a();
        } catch (a unused3) {
            s6VarA = null;
        }
    }
}
