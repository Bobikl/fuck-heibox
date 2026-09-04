package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: FlagSet.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f51500a;

    /* JADX INFO: compiled from: FlagSet.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f51501a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f51502b;

        public b a(int i10) {
            com.google.android.exoplayer2.util.a.i(!this.f51502b);
            this.f51501a.append(i10, true);
            return this;
        }

        public b b(o oVar) {
            for (int i10 = 0; i10 < oVar.d(); i10++) {
                a(oVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public o e() {
            com.google.android.exoplayer2.util.a.i(!this.f51502b);
            this.f51502b = true;
            return new o(this.f51501a);
        }

        public b f(int i10) {
            com.google.android.exoplayer2.util.a.i(!this.f51502b);
            this.f51501a.delete(i10);
            return this;
        }

        public b g(int... iArr) {
            for (int i10 : iArr) {
                f(i10);
            }
            return this;
        }

        public b h(int i10, boolean z10) {
            return z10 ? f(i10) : this;
        }
    }

    private o(SparseBooleanArray sparseBooleanArray) {
        this.f51500a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.f51500a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        com.google.android.exoplayer2.util.a.c(i10, 0, d());
        return this.f51500a.keyAt(i10);
    }

    public int d() {
        return this.f51500a.size();
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (u0.f51536a >= 24) {
            return this.f51500a.equals(oVar.f51500a);
        }
        if (d() != oVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != oVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (u0.f51536a >= 24) {
            return this.f51500a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }
}
