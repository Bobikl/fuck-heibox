package com.google.android.material.transition;

/* JADX INFO: compiled from: FadeModeResult.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f55889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f55890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f55891c;

    private c(int i10, int i11, boolean z10) {
        this.f55889a = i10;
        this.f55890b = i11;
        this.f55891c = z10;
    }

    static c a(int i10, int i11) {
        return new c(i10, i11, true);
    }

    static c b(int i10, int i11) {
        return new c(i10, i11, false);
    }
}
