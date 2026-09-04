package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: BitSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f62463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62465c;

    public w(byte[] bArr) {
        this.f62463a = bArr;
    }

    public int a() {
        return ((this.f62463a.length - this.f62464b) * 8) - this.f62465c;
    }

    public int a(int i10) throws Exception {
        if (i10 < 1 || i10 > 32 || i10 > a()) {
            try {
                throw new IllegalArgumentException(String.valueOf(i10));
            } catch (Exception e10) {
                throw e10;
            }
        }
        int i11 = this.f62465c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int i14 = i10 < i13 ? i10 : i13;
            int i15 = i13 - i14;
            int i16 = w7.a(this.f62463a, this.f62464b) ? (((255 >> (8 - i14)) << i15) & this.f62463a[this.f62464b]) >> i15 : 0;
            i10 -= i14;
            int i17 = this.f62465c + i14;
            this.f62465c = i17;
            if (i17 == 8) {
                this.f62465c = 0;
                this.f62464b++;
            }
            i12 = i16;
        }
        if (i10 > 0) {
            while (i10 >= 8) {
                if (w7.a(this.f62463a, this.f62464b)) {
                    i12 = (i12 << 8) | (this.f62463a[this.f62464b] & 255);
                }
                this.f62464b++;
                i10 -= 8;
            }
            if (i10 > 0) {
                int i18 = 8 - i10;
                int i19 = (255 >> i18) << i18;
                if (w7.a(this.f62463a, this.f62464b)) {
                    i12 = ((i19 & this.f62463a[this.f62464b]) >> i18) | (i12 << i10);
                }
                this.f62465c += i10;
            }
        }
        return i12;
    }

    public int b() {
        return this.f62465c;
    }

    public int c() {
        return this.f62464b;
    }
}
