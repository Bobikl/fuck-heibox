package com.tencent.open.utils;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f101201a;

    public n(long j10) {
        this.f101201a = j10;
    }

    public byte[] a() {
        long j10 = this.f101201a;
        return new byte[]{(byte) (255 & j10), (byte) ((65280 & j10) >> 8), (byte) ((16711680 & j10) >> 16), (byte) ((j10 & 4278190080L) >> 24)};
    }

    public long b() {
        return this.f101201a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof n) && this.f101201a == ((n) obj).b();
    }

    public int hashCode() {
        return (int) this.f101201a;
    }
}
