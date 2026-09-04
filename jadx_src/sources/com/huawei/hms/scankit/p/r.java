package com.huawei.hms.scankit.p;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: BitArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f62269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f62270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62271c;

    public r() {
        this.f62271c = 0;
        this.f62269a = new int[1];
    }

    public r(int i10) {
        this.f62271c = i10;
        this.f62269a = f(i10);
    }

    r(int[] iArr, int i10) {
        this.f62269a = iArr;
        this.f62271c = i10;
    }

    private void a(int i10) {
        if (i10 > this.f62269a.length * 32) {
            int[] iArrF = f(i10);
            int[] iArr = this.f62269a;
            System.arraycopy(iArr, 0, iArrF, 0, iArr.length);
            this.f62269a = iArrF;
        }
    }

    private int e(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 &= i10 - 1;
            i11++;
        }
        return i11;
    }

    private static int[] f(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a() {
        int length = this.f62269a.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f62269a[i10] = 0;
        }
    }

    public void a(int i10, int i11) throws Exception {
        if (i11 < 0 || i11 > 32) {
            try {
                throw new IllegalArgumentException("Num bits must be between 0 and 32");
            } catch (Exception e10) {
                throw e10;
            }
        }
        a(this.f62271c + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public void a(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (b(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void a(r rVar) {
        int i10 = rVar.f62271c;
        a(this.f62271c + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(rVar.b(i11));
        }
    }

    public void a(boolean z10) {
        a(this.f62271c + 1);
        if (z10) {
            int[] iArr = this.f62269a;
            int i10 = this.f62271c;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f62271c++;
    }

    public boolean a(int i10, int i11, boolean z10, boolean z11) throws Exception {
        if (i11 < i10 || i10 < 0 || i11 > this.f62271c) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        int iE = 0;
        while (i15 <= i14) {
            int i16 = (2 << (i15 < i14 ? 31 : i12 & 31)) - (1 << (i15 > i13 ? 0 : i10 & 31));
            if (!z11 && (iE = iE + e(this.f62269a[i15] & i16)) > (i12 - i10) / 10) {
                return false;
            }
            if (z11) {
                int i17 = this.f62269a[i15] & i16;
                if (!z10) {
                    i16 = 0;
                }
                if (i17 != i16) {
                    return false;
                }
            }
            i15++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r clone() {
        return new r((int[]) this.f62269a.clone(), this.f62271c);
    }

    public void b(int i10, int i11) {
        this.f62269a[i10 / 32] = i11;
    }

    public void b(r rVar) throws Exception {
        if (this.f62271c != rVar.f62271c) {
            try {
                throw new IllegalArgumentException("Sizes don't match");
            } catch (Exception e10) {
                throw e10;
            }
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f62269a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ rVar.f62269a[i10];
            i10++;
        }
    }

    public boolean b(int i10) {
        return ((1 << (i10 & 31)) & this.f62269a[i10 / 32]) != 0;
    }

    public int c(int i10) {
        int i11 = this.f62271c;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        if (!w7.a(this.f62269a, i12)) {
            return -1;
        }
        int i13 = (-(1 << (i10 & 31))) & this.f62269a[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f62269a;
            if (i12 == iArr.length) {
                return this.f62271c;
            }
            if (w7.a(iArr, i12)) {
                i13 = this.f62269a[i12];
            }
        }
        int iNumberOfTrailingZeros = (i12 * 32) + Integer.numberOfTrailingZeros(i13);
        int i14 = this.f62271c;
        return iNumberOfTrailingZeros > i14 ? i14 : iNumberOfTrailingZeros;
    }

    public void c() {
        this.f62270b = this.f62269a;
    }

    public void c(int i10, int i11) {
        if (i11 < i10 || i10 < 0 || i11 > this.f62271c) {
            try {
                throw new IllegalArgumentException();
            } catch (Exception e10) {
                throw e10;
            }
        }
        if (i11 == i10) {
            return;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = 31;
            int i17 = i15 > i13 ? 0 : i10 & 31;
            if (i15 >= i14) {
                i16 = 31 & i12;
            }
            int i18 = (2 << i16) - (1 << i17);
            int[] iArr = this.f62269a;
            iArr[i15] = i18 | iArr[i15];
            i15++;
        }
    }

    public int d(int i10) {
        int i11 = this.f62271c;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        if (!w7.a(this.f62269a, i12)) {
            return -1;
        }
        int i13 = (-(1 << (i10 & 31))) & (~this.f62269a[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f62269a;
            if (i12 == iArr.length) {
                return this.f62271c;
            }
            if (w7.a(iArr, i12)) {
                i13 = ~this.f62269a[i12];
            }
        }
        int iNumberOfTrailingZeros = (i12 * 32) + Integer.numberOfTrailingZeros(i13);
        int i14 = this.f62271c;
        return iNumberOfTrailingZeros > i14 ? i14 : iNumberOfTrailingZeros;
    }

    public int[] d() {
        return this.f62269a;
    }

    public int e() {
        return this.f62271c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f62271c == rVar.f62271c && Arrays.equals(this.f62269a, rVar.f62269a);
    }

    public int f() {
        return (this.f62271c + 7) / 8;
    }

    public void g() {
        this.f62269a = this.f62270b;
    }

    public void g(int i10) {
        int[] iArr = this.f62269a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void h() {
        int[] iArr = new int[this.f62269a.length];
        int i10 = (this.f62271c - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = this.f62269a[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j14 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i13 = this.f62271c;
        int i14 = i11 * 32;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f62269a = iArr;
    }

    public void h(int i10) {
        int[] iArr = this.f62269a;
        int i11 = i10 / 32;
        iArr[i11] = iArr[i11] - (1 << (i10 & 31));
    }

    public int hashCode() {
        return (this.f62271c * 31) + Arrays.hashCode(this.f62269a);
    }

    public void i() {
        for (int i10 = 0; i10 < this.f62271c - 1; i10++) {
            if (!b(i10) && b(i10 + 1)) {
                g(i10);
            }
        }
    }

    public void j() {
        for (int i10 = 0; i10 < this.f62271c - 1; i10++) {
            if (b(i10) && !b(i10 + 1)) {
                h(i10);
            }
        }
    }

    public String toString() {
        int i10 = this.f62271c;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f62271c; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(b(i11) ? 'X' : lg.a.f131414g);
        }
        return sb2.toString();
    }
}
