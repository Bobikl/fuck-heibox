package com.tencent.open.utils;

import androidx.core.view.q0;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f101202a;

    public o(int i10) {
        this.f101202a = i10;
    }

    public o(byte[] bArr) {
        this(bArr, 0);
    }

    public o(byte[] bArr, int i10) {
        this.f101202a = ((bArr[i10 + 1] << 8) & q0.f21790f) + (bArr[i10] & 255);
    }

    public byte[] a() {
        int i10 = this.f101202a;
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 & q0.f21790f) >> 8)};
    }

    public int b() {
        return this.f101202a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof o) && this.f101202a == ((o) obj).b();
    }

    public int hashCode() {
        return this.f101202a;
    }
}
