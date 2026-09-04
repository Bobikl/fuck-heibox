package com.google.android.exoplayer2.extractor;

/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f44998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45001d;

    public g0(byte[] bArr) {
        this.f44998a = bArr;
        this.f44999b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f45000c;
        com.google.android.exoplayer2.util.a.i(i11 >= 0 && (i11 < (i10 = this.f44999b) || (i11 == i10 && this.f45001d == 0)));
    }

    public int b() {
        return ((this.f44999b - this.f45000c) * 8) - this.f45001d;
    }

    public int c() {
        return (this.f45000c * 8) + this.f45001d;
    }

    public boolean d() {
        boolean z10 = (((this.f44998a[this.f45000c] & 255) >> this.f45001d) & 1) == 1;
        h(1);
        return z10;
    }

    public int e(int i10) {
        int i11 = this.f45000c;
        int iMin = Math.min(i10, 8 - this.f45001d);
        int i12 = i11 + 1;
        int i13 = ((this.f44998a[i11] & 255) >> this.f45001d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f44998a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        h(i10);
        return i14;
    }

    public void f() {
        this.f45000c = 0;
        this.f45001d = 0;
    }

    public void g(int i10) {
        int i11 = i10 / 8;
        this.f45000c = i11;
        this.f45001d = i10 - (i11 * 8);
        a();
    }

    public void h(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f45000c + i11;
        this.f45000c = i12;
        int i13 = this.f45001d + (i10 - (i11 * 8));
        this.f45001d = i13;
        if (i13 > 7) {
            this.f45000c = i12 + 1;
            this.f45001d = i13 - 8;
        }
        a();
    }
}
