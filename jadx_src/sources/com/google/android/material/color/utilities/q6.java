package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: SchemeVibrant.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class q6 extends a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double[] f53908l = {0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double[] f53909m = {18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double[] f53910n = {35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public q6(b0 b0Var, boolean z10, double d10) {
        Variant variant = Variant.VIBRANT;
        w6 w6VarB = w6.b(b0Var.d(), 200.0d);
        double[] dArr = f53908l;
        super(b0Var, variant, z10, d10, w6VarB, w6.b(a0.a(b0Var, dArr, f53909m), 24.0d), w6.b(a0.a(b0Var, dArr, f53910n), 32.0d), w6.b(b0Var.d(), 8.0d), w6.b(b0Var.d(), 12.0d));
    }
}
