package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: compiled from: LongArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f51554c = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f51556b;

    public v() {
        this(32);
    }

    public v(int i10) {
        this.f51556b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f51555a;
        long[] jArr = this.f51556b;
        if (i10 == jArr.length) {
            this.f51556b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f51556b;
        int i11 = this.f51555a;
        this.f51555a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f51555a) {
            return this.f51556b[i10];
        }
        int i11 = this.f51555a;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Invalid index ");
        sb2.append(i10);
        sb2.append(", size is ");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public int c() {
        return this.f51555a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f51556b, this.f51555a);
    }
}
