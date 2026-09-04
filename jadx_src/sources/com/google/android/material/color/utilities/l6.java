package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: SchemeExpressive.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class l6 extends a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double[] f53899l = {0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double[] f53900m = {45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double[] f53901n = {120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public l6(b0 b0Var, boolean z10, double d10) {
        Variant variant = Variant.EXPRESSIVE;
        w6 w6VarB = w6.b(b6.g(b0Var.d() + 120.0d), 40.0d);
        double[] dArr = f53899l;
        super(b0Var, variant, z10, d10, w6VarB, w6.b(a0.a(b0Var, dArr, f53900m), 24.0d), w6.b(a0.a(b0Var, dArr, f53901n), 32.0d), w6.b(b0Var.d(), 8.0d), w6.b(b0Var.d(), 12.0d));
    }
}
