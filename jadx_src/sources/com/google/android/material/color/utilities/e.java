package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: CorePalette.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w6 f53855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w6 f53856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w6 f53857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w6 f53858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w6 f53859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w6 f53860f;

    private e(int i10, boolean z10) {
        b0 b0VarB = b0.b(i10);
        double d10 = b0VarB.d();
        double dC = b0VarB.c();
        if (z10) {
            this.f53855a = w6.b(d10, dC);
            this.f53856b = w6.b(d10, dC / 3.0d);
            this.f53857c = w6.b(60.0d + d10, dC / 2.0d);
            this.f53858d = w6.b(d10, Math.min(dC / 12.0d, 4.0d));
            this.f53859e = w6.b(d10, Math.min(dC / 6.0d, 8.0d));
        } else {
            this.f53855a = w6.b(d10, Math.max(48.0d, dC));
            this.f53856b = w6.b(d10, 16.0d);
            this.f53857c = w6.b(60.0d + d10, 24.0d);
            this.f53858d = w6.b(d10, 4.0d);
            this.f53859e = w6.b(d10, 8.0d);
        }
        this.f53860f = w6.b(25.0d, 84.0d);
    }

    public static e a(int i10) {
        return new e(i10, true);
    }

    public static e b(int i10) {
        return new e(i10, false);
    }
}
