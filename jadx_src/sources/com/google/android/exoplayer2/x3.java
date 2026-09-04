package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: compiled from: ThumbRating.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x3 extends k3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f52043l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f52044m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f52045n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i.a<x3> f52046o = new i.a() { // from class: com.google.android.exoplayer2.w3
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return x3.g(bundle);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f52047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f52048k;

    public x3() {
        this.f52047j = false;
        this.f52048k = false;
    }

    public x3(boolean z10) {
        this.f52047j = true;
        this.f52048k = z10;
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x3 g(Bundle bundle) {
        com.google.android.exoplayer2.util.a.a(bundle.getInt(e(0), -1) == 3);
        return bundle.getBoolean(e(1), false) ? new x3(bundle.getBoolean(e(2), false)) : new x3();
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(e(0), 3);
        bundle.putBoolean(e(1), this.f52047j);
        bundle.putBoolean(e(2), this.f52048k);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.k3
    public boolean d() {
        return this.f52047j;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return this.f52048k == x3Var.f52048k && this.f52047j == x3Var.f52047j;
    }

    public boolean h() {
        return this.f52048k;
    }

    public int hashCode() {
        return com.google.common.base.s.b(Boolean.valueOf(this.f52047j), Boolean.valueOf(this.f52048k));
    }
}
