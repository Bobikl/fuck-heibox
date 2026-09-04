package com.google.android.exoplayer2.util;

/* JADX INFO: compiled from: ParsableNalUnitBitArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f51393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51396d;

    public f0(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    private void a() {
        int i10;
        int i11 = this.f51395c;
        a.i(i11 >= 0 && (i11 < (i10 = this.f51394b) || (i11 == i10 && this.f51396d == 0)));
    }

    private int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    private boolean j(int i10) {
        if (2 <= i10 && i10 < this.f51394b) {
            byte[] bArr = this.f51393a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean b(int i10) {
        int i11 = this.f51395c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f51396d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f51394b) {
                break;
            }
            if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f51394b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f51395c;
        int i11 = this.f51396d;
        int i12 = 0;
        while (this.f51395c < this.f51394b && !d()) {
            i12++;
        }
        boolean z10 = this.f51395c == this.f51394b;
        this.f51395c = i10;
        this.f51396d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f51393a[this.f51395c] & (128 >> this.f51396d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        this.f51396d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f51396d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f51396d = i14;
            byte[] bArr = this.f51393a;
            int i15 = this.f51395c;
            i12 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i13 = 1;
            }
            this.f51395c = i15 + i13;
        }
        byte[] bArr2 = this.f51393a;
        int i16 = this.f51395c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f51396d = 0;
            this.f51395c = i16 + (j(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public int g() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f51393a = bArr;
        this.f51395c = i10;
        this.f51394b = i11;
        this.f51396d = 0;
        a();
    }

    public void k() {
        int i10 = this.f51396d + 1;
        this.f51396d = i10;
        if (i10 == 8) {
            this.f51396d = 0;
            int i11 = this.f51395c;
            this.f51395c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f51395c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f51395c = i13;
        int i14 = this.f51396d + (i10 - (i12 * 8));
        this.f51396d = i14;
        if (i14 > 7) {
            this.f51395c = i13 + 1;
            this.f51396d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f51395c) {
                a();
                return;
            } else if (j(i11)) {
                this.f51395c++;
                i11 += 2;
            }
        }
    }
}
