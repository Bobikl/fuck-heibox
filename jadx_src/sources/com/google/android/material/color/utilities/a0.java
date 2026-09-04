package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: DynamicScheme.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f53786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Variant f53787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f53788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f53789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w6 f53790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w6 f53791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w6 f53792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w6 f53793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w6 f53794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w6 f53795k = w6.b(25.0d, 84.0d);

    public a0(b0 b0Var, Variant variant, boolean z10, double d10, w6 w6Var, w6 w6Var2, w6 w6Var3, w6 w6Var4, w6 w6Var5) {
        this.f53785a = b0Var.k();
        this.f53786b = b0Var;
        this.f53787c = variant;
        this.f53788d = z10;
        this.f53789e = d10;
        this.f53790f = w6Var;
        this.f53791g = w6Var2;
        this.f53792h = w6Var3;
        this.f53793i = w6Var4;
        this.f53794j = w6Var5;
    }

    public static double a(b0 b0Var, double[] dArr, double[] dArr2) {
        double d10 = b0Var.d();
        int i10 = 0;
        if (dArr2.length == 1) {
            return b6.g(d10 + dArr2[0]);
        }
        int length = dArr.length;
        while (i10 <= length - 2) {
            double d11 = dArr[i10];
            int i11 = i10 + 1;
            double d12 = dArr[i11];
            if (d11 < d10 && d10 < d12) {
                return b6.g(d10 + dArr2[i10]);
            }
            i10 = i11;
        }
        return d10;
    }
}
