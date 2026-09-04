package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Blend.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {
    private a() {
    }

    public static int a(int i10, int i11, double d10) {
        b bVarB = b.b(i10);
        b bVarB2 = b.b(i11);
        double dN = bVarB.n();
        double dI = bVarB.i();
        double dJ = bVarB.j();
        return b.f(dN + ((bVarB2.n() - dN) * d10), dI + ((bVarB2.i() - dI) * d10), dJ + ((bVarB2.j() - dJ) * d10)).r();
    }

    public static int b(int i10, int i11) {
        b0 b0VarB = b0.b(i10);
        b0 b0VarB2 = b0.b(i11);
        return b0.a(b6.g(b0VarB.d() + (Math.min(b6.c(b0VarB.d(), b0VarB2.d()) * 0.5d, 15.0d) * b6.f(b0VarB.d(), b0VarB2.d()))), b0VarB.c(), b0VarB.e()).k();
    }

    public static int c(int i10, int i11, double d10) {
        return b0.a(b.b(a(i10, i11, d10)).l(), b.b(i10).k(), c.o(i10)).k();
    }
}
