package com.bumptech.glide.util;

import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: FixedPreloadSizeProvider.java */
/* JADX INFO: loaded from: classes6.dex */
public class g<T> implements com.bumptech.glide.f.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f41995a;

    public g(int i10, int i11) {
        this.f41995a = new int[]{i10, i11};
    }

    @Override // com.bumptech.glide.f.b
    @p0
    public int[] a(@n0 T t10, int i10, int i11) {
        return this.f41995a;
    }
}
