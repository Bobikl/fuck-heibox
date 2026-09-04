package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: HarmonyCodeDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public class z3 implements o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<l1, Object> f62615a = new EnumMap(l1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u1 f62616b = new u1();

    private s6 a(int i10, int i11, g3[] g3VarArr, e2 e2Var, Map<l1, ?> map) throws Exception {
        char c10;
        char c11 = 0;
        int i12 = 0;
        while (i12 <= i10 - 2) {
            int i13 = i12 + 1;
            int i14 = i13;
            while (i14 <= i10 - 1) {
                int i15 = i14 + 1;
                for (int i16 = i15; i16 <= i10; i16++) {
                    int i17 = i10;
                    while (i17 < i11) {
                        g3[] g3VarArr2 = new g3[3];
                        g3VarArr2[c11] = g3VarArr[i12];
                        g3VarArr2[1] = g3VarArr[i14];
                        g3VarArr2[2] = g3VarArr[i16];
                        u6.a(g3VarArr2);
                        g3 g3Var = g3VarArr[i17];
                        try {
                            float fB = (g3VarArr2[2].b() - g3VarArr2[1].b()) + g3VarArr2[c11].b();
                            float fC = (g3VarArr2[2].c() - g3VarArr2[1].c()) + g3VarArr2[c11].c();
                            try {
                                float fMax = Math.max(Math.abs(g3VarArr2[1].b() - g3VarArr2[c11].b()), Math.abs(g3VarArr2[1].b() - g3VarArr2[2].b()));
                                c10 = 0;
                                try {
                                    float fMax2 = Math.max(Math.abs(g3VarArr2[1].c() - g3VarArr2[0].c()), Math.abs(g3VarArr2[1].c() - g3VarArr2[2].c()));
                                    if (Math.abs(fB - g3Var.b()) < fMax / 2.0f && Math.abs(fC - g3Var.c()) < fMax2 / 2.0f) {
                                        try {
                                            s6 s6VarA = a(e2Var.a(g3VarArr2, g3Var), e2Var, map);
                                            if (s6VarA != null) {
                                                return s6VarA;
                                            }
                                        } catch (a unused) {
                                            continue;
                                        }
                                    }
                                } catch (a unused2) {
                                }
                            } catch (a unused3) {
                                c10 = 0;
                            }
                        } catch (a unused4) {
                            c10 = c11;
                        }
                        i17++;
                        c11 = c10;
                    }
                }
                i14 = i15;
            }
            i12 = i13;
        }
        throw a.a();
    }

    private s6 a(int i10, e2 e2Var, Map<l1, ?> map) throws Exception {
        int i11 = 1;
        int iMax = Math.max(1, i10 - 2);
        int iMin = Math.min(6, i10 + 2);
        int iMax2 = Math.max(Math.abs(i10 - iMax), Math.abs(i10 - iMin));
        int i12 = 0;
        j2 j2VarA = null;
        while (i12 <= iMax2 * 2) {
            i10 += i12 * i11;
            if (i10 >= iMax && i10 <= iMin) {
                try {
                    j2VarA = e2Var.a(i10);
                    w1 w1VarA = this.f62616b.a(j2VarA.a(), map);
                    if (w1VarA.d() != null) {
                        return new s6(w1VarA.d(), w1VarA.c(), j2VarA.d(), BarcodeFormat.HARMONY_CODE);
                    }
                    continue;
                } catch (a unused) {
                    continue;
                }
            }
            i12++;
            i11 *= -1;
        }
        if (j2VarA == null || j2VarA.d().length <= 3) {
            return null;
        }
        return new s6(null, null, j2VarA.d(), BarcodeFormat.HARMONY_CODE);
    }

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map<l1, ?> map) throws Exception {
        e2 e2Var = new e2(pVar.b());
        g3[] g3VarArrA = e2Var.a(map);
        int length = g3VarArrA.length;
        if (length == 3) {
            u6.a(g3VarArrA);
            s6 s6VarA = a(e2Var.a(g3VarArrA, null), e2Var, map);
            if (s6VarA != null) {
                return s6VarA;
            }
        } else {
            if (length != 4) {
                float fE = ((g3VarArrA[0].e() + g3VarArrA[1].e()) + g3VarArrA[2].e()) / 3.0f;
                float fE2 = g3VarArrA[length - 1].e();
                int i10 = length - 2;
                while (i10 > 2 && Math.abs(g3VarArrA[i10].e() - fE) >= Math.abs(g3VarArrA[i10].e() - fE2)) {
                    int i11 = length - i10;
                    fE2 = (((i11 - 1) * fE2) + g3VarArrA[i10].e()) / i11;
                    i10--;
                }
                return a(i10, length, g3VarArrA, e2Var, map);
            }
            g3[] g3VarArr = new g3[3];
            for (int i12 = 0; i12 < 3; i12++) {
                g3VarArr[i12] = g3VarArrA[i12];
            }
            u6.a(g3VarArr);
            s6 s6VarA2 = a(e2Var.a(g3VarArr, g3VarArrA[3]), e2Var, map);
            if (s6VarA2 != null) {
                return s6VarA2;
            }
        }
        throw a.a();
    }
}
