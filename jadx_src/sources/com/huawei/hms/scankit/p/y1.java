package com.huawei.hms.scankit.p;

import java.util.Arrays;

/* JADX INFO: compiled from: DefaultPlacement.java */
/* JADX INFO: loaded from: classes7.dex */
public class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f62573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f62576d;

    public y1(CharSequence charSequence, int i10, int i11) {
        this.f62573a = charSequence;
        this.f62575c = i10;
        this.f62574b = i11;
        byte[] bArr = new byte[i10 * i11];
        this.f62576d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i10) {
        a(this.f62574b - 1, 0, i10, 1);
        a(this.f62574b - 1, 1, i10, 2);
        a(this.f62574b - 1, 2, i10, 3);
        a(0, this.f62575c - 2, i10, 4);
        a(0, this.f62575c - 1, i10, 5);
        a(1, this.f62575c - 1, i10, 6);
        a(2, this.f62575c - 1, i10, 7);
        a(3, this.f62575c - 1, i10, 8);
    }

    private void a(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        a(i13, i14, i12, 1);
        int i15 = i11 - 1;
        a(i13, i15, i12, 2);
        int i16 = i10 - 1;
        a(i16, i14, i12, 3);
        a(i16, i15, i12, 4);
        a(i16, i11, i12, 5);
        a(i10, i14, i12, 6);
        a(i10, i15, i12, 7);
        a(i10, i11, i12, 8);
    }

    private void a(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f62574b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        if (i11 < 0) {
            int i15 = this.f62575c;
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        a(i11, i10, (this.f62573a.charAt(i12) & (1 << (8 - i13))) != 0);
    }

    private void a(int i10, int i11, boolean z10) {
        this.f62576d[(i11 * this.f62575c) + i10] = z10 ? (byte) 1 : (byte) 0;
    }

    private void b(int i10) {
        a(this.f62574b - 3, 0, i10, 1);
        a(this.f62574b - 2, 0, i10, 2);
        a(this.f62574b - 1, 0, i10, 3);
        a(0, this.f62575c - 4, i10, 4);
        a(0, this.f62575c - 3, i10, 5);
        a(0, this.f62575c - 2, i10, 6);
        a(0, this.f62575c - 1, i10, 7);
        a(1, this.f62575c - 1, i10, 8);
    }

    private boolean b(int i10, int i11) {
        return this.f62576d[(i11 * this.f62575c) + i10] >= 0;
    }

    private void c(int i10) {
        a(this.f62574b - 3, 0, i10, 1);
        a(this.f62574b - 2, 0, i10, 2);
        a(this.f62574b - 1, 0, i10, 3);
        a(0, this.f62575c - 2, i10, 4);
        a(0, this.f62575c - 1, i10, 5);
        a(1, this.f62575c - 1, i10, 6);
        a(2, this.f62575c - 1, i10, 7);
        a(3, this.f62575c - 1, i10, 8);
    }

    private void d(int i10) {
        a(this.f62574b - 1, 0, i10, 1);
        a(this.f62574b - 1, this.f62575c - 1, i10, 2);
        a(0, this.f62575c - 3, i10, 3);
        a(0, this.f62575c - 2, i10, 4);
        a(0, this.f62575c - 1, i10, 5);
        a(1, this.f62575c - 3, i10, 6);
        a(1, this.f62575c - 2, i10, 7);
        a(1, this.f62575c - 1, i10, 8);
    }

    public final void a() {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 4;
        while (true) {
            if (i14 == this.f62574b && i12 == 0) {
                a(i13);
                i13++;
            }
            if (i14 == this.f62574b - 2 && i12 == 0 && this.f62575c % 4 != 0) {
                b(i13);
                i13++;
            }
            if (i14 == this.f62574b - 2 && i12 == 0 && this.f62575c % 8 == 4) {
                c(i13);
                i13++;
            }
            if (i14 == this.f62574b + 4 && i12 == 2 && this.f62575c % 8 == 0) {
                d(i13);
                i13++;
            }
            do {
                if (i14 < this.f62574b && i12 >= 0 && !b(i12, i14)) {
                    a(i14, i12, i13);
                    i13++;
                }
                i14 -= 2;
                i12 += 2;
                if (i14 < 0) {
                    break;
                }
            } while (i12 < this.f62575c);
            int i15 = i14 + 1;
            int i16 = i12 + 3;
            do {
                if (i15 >= 0 && i16 < this.f62575c && !b(i16, i15)) {
                    a(i15, i16, i13);
                    i13++;
                }
                i15 += 2;
                i16 -= 2;
                i10 = this.f62574b;
                if (i15 >= i10) {
                    break;
                }
            } while (i16 >= 0);
            i14 = i15 + 3;
            i12 = i16 + 1;
            if (i14 >= i10 && i12 >= (i11 = this.f62575c)) {
                break;
            }
        }
        if (b(i11 - 1, i10 - 1)) {
            return;
        }
        a(this.f62575c - 1, this.f62574b - 1, true);
        a(this.f62575c - 2, this.f62574b - 2, true);
    }

    public final boolean a(int i10, int i11) {
        return this.f62576d[(i11 * this.f62575c) + i10] == 1;
    }
}
