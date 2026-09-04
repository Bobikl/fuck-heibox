package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: compiled from: StarRating.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u3 extends k3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f50373l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f50374m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f50375n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f50376o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i.a<u3> f50377p = new i.a() { // from class: com.google.android.exoplayer2.t3
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return u3.g(bundle);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.f0(from = 1)
    private final int f50378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f50379k;

    public u3(@androidx.annotation.f0(from = 1) int i10) {
        com.google.android.exoplayer2.util.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f50378j = i10;
        this.f50379k = -1.0f;
    }

    public u3(@androidx.annotation.f0(from = 1) int i10, @androidx.annotation.x(from = 0.0d) float f10) {
        com.google.android.exoplayer2.util.a.b(i10 > 0, "maxStars must be a positive integer");
        com.google.android.exoplayer2.util.a.b(f10 >= 0.0f && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f50378j = i10;
        this.f50379k = f10;
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u3 g(Bundle bundle) {
        com.google.android.exoplayer2.util.a.a(bundle.getInt(e(0), -1) == 2);
        int i10 = bundle.getInt(e(1), 5);
        float f10 = bundle.getFloat(e(2), -1.0f);
        return f10 == -1.0f ? new u3(i10) : new u3(i10, f10);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(e(0), 2);
        bundle.putInt(e(1), this.f50378j);
        bundle.putFloat(e(2), this.f50379k);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.k3
    public boolean d() {
        return this.f50379k != -1.0f;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return this.f50378j == u3Var.f50378j && this.f50379k == u3Var.f50379k;
    }

    @androidx.annotation.f0(from = 1)
    public int h() {
        return this.f50378j;
    }

    public int hashCode() {
        return com.google.common.base.s.b(Integer.valueOf(this.f50378j), Float.valueOf(this.f50379k));
    }

    public float i() {
        return this.f50379k;
    }
}
