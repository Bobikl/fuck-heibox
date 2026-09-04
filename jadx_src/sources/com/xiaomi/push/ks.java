package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public final class ks extends kt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107809a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107810b;

    @Override // com.xiaomi.push.kt
    public int a() {
        return this.f107809a;
    }

    @Override // com.xiaomi.push.kt
    public int a(byte[] bArr, int i10, int i11) {
        int iB = b();
        if (i11 > iB) {
            i11 = iB;
        }
        if (i11 > 0) {
            System.arraycopy(this.f931a, this.f107809a, bArr, i10, i11);
            a(i11);
        }
        return i11;
    }

    @Override // com.xiaomi.push.kt
    public void a(int i10) {
        this.f107809a += i10;
    }

    public void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.kt
    /* JADX INFO: renamed from: a */
    public void mo652a(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.kt
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] mo653a() {
        return this.f931a;
    }

    @Override // com.xiaomi.push.kt
    public int b() {
        return this.f107810b - this.f107809a;
    }

    public void b(byte[] bArr, int i10, int i11) {
        this.f931a = bArr;
        this.f107809a = i10;
        this.f107810b = i10 + i11;
    }
}
