package com.huawei.hms.scankit.p;

import java.util.List;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes7.dex */
public class v7 {
    public static float a(u6[] u6VarArr, u6[] u6VarArr2) {
        float fB = Float.MAX_VALUE;
        float fB2 = Float.MIN_VALUE;
        float fB3 = Float.MAX_VALUE;
        float fC = Float.MAX_VALUE;
        float fB4 = Float.MIN_VALUE;
        float fC2 = Float.MIN_VALUE;
        for (u6 u6Var : u6VarArr) {
            if (u6Var.b() > fB4) {
                fB4 = u6Var.b();
            }
            if (u6Var.b() < fB3) {
                fB3 = u6Var.b();
            }
            if (u6Var.c() > fC2) {
                fC2 = u6Var.c();
            }
            if (u6Var.c() < fC) {
                fC = u6Var.c();
            }
        }
        float fC3 = Float.MAX_VALUE;
        float fC4 = Float.MIN_VALUE;
        for (u6 u6Var2 : u6VarArr2) {
            if (u6Var2.b() > fB2) {
                fB2 = u6Var2.b();
            }
            if (u6Var2.b() < fB) {
                fB = u6Var2.b();
            }
            if (u6Var2.c() > fC4) {
                fC4 = u6Var2.c();
            }
            if (u6Var2.c() < fC3) {
                fC3 = u6Var2.c();
            }
        }
        float f10 = (fB2 < fB4 ? fB2 : fB4) - (fB > fB3 ? fB : fB3);
        float f11 = (fC4 < fC2 ? fC4 : fC2) - (fC3 > fC ? fC3 : fC);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = f10 * f11;
        return f12 / ((((fB4 - fB3) * (fC2 - fC)) + ((fB2 - fB) * (fC4 - fC3))) - f12);
    }

    public static List<s6> a(List<s6> list) {
        for (int i10 = 0; i10 < list.size() - 1; i10++) {
            for (int size = list.size() - 1; size > i10; size--) {
                s6 s6Var = list.get(i10);
                s6 s6Var2 = list.get(size);
                if (s6Var.k().equals(s6Var2.k()) && a(s6Var.j(), s6Var2.j()) > 0.5d) {
                    list.remove(size);
                }
            }
        }
        return list;
    }
}
