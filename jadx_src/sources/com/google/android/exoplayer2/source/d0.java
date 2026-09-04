package com.google.android.exoplayer2.source;

/* JADX INFO: compiled from: MediaPeriodId.java */
/* JADX INFO: loaded from: classes7.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47723e;

    protected d0(d0 d0Var) {
        this.f47719a = d0Var.f47719a;
        this.f47720b = d0Var.f47720b;
        this.f47721c = d0Var.f47721c;
        this.f47722d = d0Var.f47722d;
        this.f47723e = d0Var.f47723e;
    }

    public d0(Object obj) {
        this(obj, -1L);
    }

    public d0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private d0(Object obj, int i10, int i11, long j10, int i12) {
        this.f47719a = obj;
        this.f47720b = i10;
        this.f47721c = i11;
        this.f47722d = j10;
        this.f47723e = i12;
    }

    public d0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public d0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public d0 a(Object obj) {
        return this.f47719a.equals(obj) ? this : new d0(obj, this.f47720b, this.f47721c, this.f47722d, this.f47723e);
    }

    public d0 b(long j10) {
        return this.f47722d == j10 ? this : new d0(this.f47719a, this.f47720b, this.f47721c, j10, this.f47723e);
    }

    public boolean c() {
        return this.f47720b != -1;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f47719a.equals(d0Var.f47719a) && this.f47720b == d0Var.f47720b && this.f47721c == d0Var.f47721c && this.f47722d == d0Var.f47722d && this.f47723e == d0Var.f47723e;
    }

    public int hashCode() {
        return ((((((((bb.c.b.f30674h7 + this.f47719a.hashCode()) * 31) + this.f47720b) * 31) + this.f47721c) * 31) + ((int) this.f47722d)) * 31) + this.f47723e;
    }
}
