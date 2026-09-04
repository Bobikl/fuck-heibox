package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: compiled from: HeartRating.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e2 extends k3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f44777l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f44778m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f44779n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i.a<e2> f44780o = new i.a() { // from class: com.google.android.exoplayer2.d2
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return e2.g(bundle);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f44781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f44782k;

    public e2() {
        this.f44781j = false;
        this.f44782k = false;
    }

    public e2(boolean z10) {
        this.f44781j = true;
        this.f44782k = z10;
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e2 g(Bundle bundle) {
        com.google.android.exoplayer2.util.a.a(bundle.getInt(e(0), -1) == 0);
        return bundle.getBoolean(e(1), false) ? new e2(bundle.getBoolean(e(2), false)) : new e2();
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(e(0), 0);
        bundle.putBoolean(e(1), this.f44781j);
        bundle.putBoolean(e(2), this.f44782k);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.k3
    public boolean d() {
        return this.f44781j;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f44782k == e2Var.f44782k && this.f44781j == e2Var.f44781j;
    }

    public boolean h() {
        return this.f44782k;
    }

    public int hashCode() {
        return com.google.common.base.s.b(Boolean.valueOf(this.f44781j), Boolean.valueOf(this.f44782k));
    }
}
