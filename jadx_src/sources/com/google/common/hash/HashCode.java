package com.google.common.hash;

import com.google.common.base.w;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@h
public abstract class HashCode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f58471b = "0123456789abcdef".toCharArray();

    public static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f58472c;

        BytesHashCode(byte[] bArr) {
            this.f58472c = (byte[]) w.E(bArr);
        }

        @Override // com.google.common.hash.HashCode
        public byte[] a() {
            return (byte[]) this.f58472c.clone();
        }

        @Override // com.google.common.hash.HashCode
        public int b() {
            byte[] bArr = this.f58472c;
            w.n0(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f58472c;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // com.google.common.hash.HashCode
        public long c() {
            byte[] bArr = this.f58472c;
            w.n0(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return m();
        }

        @Override // com.google.common.hash.HashCode
        public int d() {
            return this.f58472c.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        boolean f(HashCode hashCode) {
            if (this.f58472c.length != hashCode.l().length) {
                return false;
            }
            boolean z10 = true;
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f58472c;
                if (i10 >= bArr.length) {
                    return z10;
                }
                z10 &= bArr[i10] == hashCode.l()[i10];
                i10++;
            }
        }

        @Override // com.google.common.hash.HashCode
        byte[] l() {
            return this.f58472c;
        }

        @Override // com.google.common.hash.HashCode
        public long m() {
            long j10 = this.f58472c[0] & 255;
            for (int i10 = 1; i10 < Math.min(this.f58472c.length, 8); i10++) {
                j10 |= (((long) this.f58472c[i10]) & 255) << (i10 * 8);
            }
            return j10;
        }

        @Override // com.google.common.hash.HashCode
        void o(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f58472c, 0, bArr, i10, i11);
        }
    }

    public static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f58473c;

        IntHashCode(int i10) {
            this.f58473c = i10;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] a() {
            int i10 = this.f58473c;
            return new byte[]{(byte) i10, (byte) (i10 >> 8), (byte) (i10 >> 16), (byte) (i10 >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        public int b() {
            return this.f58473c;
        }

        @Override // com.google.common.hash.HashCode
        public long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        public int d() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        boolean f(HashCode hashCode) {
            return this.f58473c == hashCode.b();
        }

        @Override // com.google.common.hash.HashCode
        public long m() {
            return UnsignedInts.r(this.f58473c);
        }

        @Override // com.google.common.hash.HashCode
        void o(byte[] bArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i10 + i12] = (byte) (this.f58473c >> (i12 * 8));
            }
        }
    }

    public static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f58474c;

        LongHashCode(long j10) {
            this.f58474c = j10;
        }

        @Override // com.google.common.hash.HashCode
        public byte[] a() {
            long j10 = this.f58474c;
            return new byte[]{(byte) j10, (byte) (j10 >> 8), (byte) (j10 >> 16), (byte) (j10 >> 24), (byte) (j10 >> 32), (byte) (j10 >> 40), (byte) (j10 >> 48), (byte) (j10 >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        public int b() {
            return (int) this.f58474c;
        }

        @Override // com.google.common.hash.HashCode
        public long c() {
            return this.f58474c;
        }

        @Override // com.google.common.hash.HashCode
        public int d() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        boolean f(HashCode hashCode) {
            return this.f58474c == hashCode.c();
        }

        @Override // com.google.common.hash.HashCode
        public long m() {
            return this.f58474c;
        }

        @Override // com.google.common.hash.HashCode
        void o(byte[] bArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i10 + i12] = (byte) (this.f58474c >> (i12 * 8));
            }
        }
    }

    HashCode() {
    }

    private static int e(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return (c10 - 'a') + 10;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Illegal hexadecimal character: ");
        sb2.append(c10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static HashCode g(byte[] bArr) {
        w.e(bArr.length >= 1, "A HashCode must contain at least 1 byte.");
        return h((byte[]) bArr.clone());
    }

    static HashCode h(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode i(int i10) {
        return new IntHashCode(i10);
    }

    public static HashCode j(long j10) {
        return new LongHashCode(j10);
    }

    public static HashCode k(String str) {
        w.u(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        w.u(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < str.length(); i10 += 2) {
            bArr[i10 / 2] = (byte) ((e(str.charAt(i10)) << 4) + e(str.charAt(i10 + 1)));
        }
        return h(bArr);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        return d() == hashCode.d() && f(hashCode);
    }

    abstract boolean f(HashCode hashCode);

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] bArrL = l();
        int i10 = bArrL[0] & 255;
        for (int i11 = 1; i11 < bArrL.length; i11++) {
            i10 |= (bArrL[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    byte[] l() {
        return a();
    }

    public abstract long m();

    @s9.a
    public int n(byte[] bArr, int i10, int i11) {
        int iU = Ints.u(i11, d() / 8);
        w.f0(i10, i10 + iU, bArr.length);
        o(bArr, i10, iU);
        return iU;
    }

    abstract void o(byte[] bArr, int i10, int i11);

    public final String toString() {
        byte[] bArrL = l();
        StringBuilder sb2 = new StringBuilder(bArrL.length * 2);
        for (byte b10 : bArrL) {
            char[] cArr = f58471b;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
