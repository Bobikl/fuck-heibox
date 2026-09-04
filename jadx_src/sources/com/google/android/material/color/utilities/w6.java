package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: TonalPalette.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<Integer, Integer> f53935a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f53936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f53937c;

    private w6(double d10, double d11) {
        this.f53936b = d10;
        this.f53937c = d11;
    }

    public static final w6 a(b0 b0Var) {
        return b(b0Var.d(), b0Var.c());
    }

    public static final w6 b(double d10, double d11) {
        return new w6(d10, d11);
    }

    public static final w6 c(int i10) {
        return a(b0.b(i10));
    }

    public double d() {
        return this.f53937c;
    }

    public b0 e(double d10) {
        return b0.a(this.f53936b, this.f53937c, d10);
    }

    public double f() {
        return this.f53936b;
    }

    public int g(int i10) {
        Integer numValueOf = this.f53935a.get(Integer.valueOf(i10));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(b0.a(this.f53936b, this.f53937c, i10).k());
            this.f53935a.put(Integer.valueOf(i10), numValueOf);
        }
        return numValueOf.intValue();
    }
}
