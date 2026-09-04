package com.google.android.material.transition.platform;

import androidx.annotation.w0;

/* JADX INFO: compiled from: FadeModeResult.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f56001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f56002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f56003c;

    private c(int i10, int i11, boolean z10) {
        this.f56001a = i10;
        this.f56002b = i11;
        this.f56003c = z10;
    }

    static c a(int i10, int i11) {
        return new c(i10, i11, true);
    }

    static c b(int i10, int i11) {
        return new c(i10, i11, false);
    }
}
