package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PDF417Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r5 implements o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s6[] f62301a = new s6[0];

    private static int a(u6 u6Var, u6 u6Var2) {
        if (u6Var == null || u6Var2 == null) {
            return 0;
        }
        return (int) Math.abs(u6Var.b() - u6Var2.b());
    }

    private static int a(u6[] u6VarArr) {
        return Math.max(Math.max(a(u6VarArr[0], u6VarArr[4]), (a(u6VarArr[6], u6VarArr[2]) * 17) / 18), Math.max(a(u6VarArr[1], u6VarArr[5]), (a(u6VarArr[7], u6VarArr[3]) * 17) / 18));
    }

    private static s6[] a(p pVar, Map<l1, ?> map, boolean z10) throws a {
        ArrayList arrayList = new ArrayList();
        o5 o5VarA = f2.a(pVar, map, z10);
        for (u6[] u6VarArr : o5VarA.b()) {
            w1 w1VarA = t5.a(o5VarA.a(), u6VarArr[4], u6VarArr[5], u6VarArr[6], u6VarArr[7], b(u6VarArr), a(u6VarArr), map);
            if (f2.a()) {
                for (int i10 = 0; i10 < u6VarArr.length; i10++) {
                    if (u6VarArr[i10] != null) {
                        u6VarArr[i10] = new u6((pVar.e() - 1) - u6VarArr[i10].b(), (pVar.c() - 1) - u6VarArr[i10].c());
                    }
                }
            }
            if (u6VarArr.length != 8) {
                throw a.a("pdf417 points size incorrect!");
            }
            u6 u6Var = u6VarArr[0];
            if (u6Var == null && u6VarArr[1] == null && u6VarArr[4] == null && u6VarArr[5] == null) {
                u6VarArr[0] = u6VarArr[6];
                u6VarArr[1] = u6VarArr[7];
                u6VarArr[4] = u6VarArr[2];
                u6VarArr[5] = u6VarArr[3];
            } else if (u6VarArr[2] == null && u6VarArr[3] == null && u6VarArr[6] == null && u6VarArr[7] == null) {
                u6VarArr[2] = u6VarArr[4];
                u6VarArr[3] = u6VarArr[5];
                u6VarArr[6] = u6Var;
                u6VarArr[7] = u6VarArr[1];
            }
            arrayList.add(new s6(w1VarA.d(), w1VarA.c(), u6VarArr, BarcodeFormat.PDF_417));
        }
        return (s6[]) arrayList.toArray(f62301a);
    }

    private static int b(u6 u6Var, u6 u6Var2) {
        if (u6Var == null || u6Var2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(u6Var.b() - u6Var2.b());
    }

    private static int b(u6[] u6VarArr) {
        return Math.min(Math.min(b(u6VarArr[0], u6VarArr[4]), (b(u6VarArr[6], u6VarArr[2]) * 17) / 18), Math.min(b(u6VarArr[1], u6VarArr[5]), (b(u6VarArr[7], u6VarArr[3]) * 17) / 18));
    }

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map<l1, ?> map) throws a {
        s6 s6Var;
        s6[] s6VarArrA = a(pVar, map, false);
        if (s6VarArrA.length == 0 || (s6Var = s6VarArrA[0]) == null) {
            throw a.a();
        }
        return s6Var;
    }
}
