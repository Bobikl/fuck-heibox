package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: compiled from: PercentageRating.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x2 extends k3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f52039k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f52040l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i.a<x2> f52041m = new i.a() { // from class: com.google.android.exoplayer2.w2
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return x2.g(bundle);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f52042j;

    public x2() {
        this.f52042j = -1.0f;
    }

    public x2(@androidx.annotation.x(from = 0.0d, to = 100.0d) float f10) {
        com.google.android.exoplayer2.util.a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f52042j = f10;
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x2 g(Bundle bundle) {
        com.google.android.exoplayer2.util.a.a(bundle.getInt(e(0), -1) == 1);
        float f10 = bundle.getFloat(e(1), -1.0f);
        return f10 == -1.0f ? new x2() : new x2(f10);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(e(0), 1);
        bundle.putFloat(e(1), this.f52042j);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.k3
    public boolean d() {
        return this.f52042j != -1.0f;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        return (obj instanceof x2) && this.f52042j == ((x2) obj).f52042j;
    }

    public float h() {
        return this.f52042j;
    }

    public int hashCode() {
        return com.google.common.base.s.b(Float.valueOf(this.f52042j));
    }
}
