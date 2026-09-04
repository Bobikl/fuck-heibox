package com.tencent.cos.xml.utils;

import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes4.dex */
public class CRC64 implements Checksum {
    private static final int GF2_DIM = 64;
    private static final long POLY = -3932672073523589310L;
    private static final long[] table = new long[256];
    private long value;

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            long j10 = i10;
            for (int i11 = 0; i11 < 8; i11++) {
                j10 = (j10 & 1) == 1 ? (j10 >>> 1) ^ POLY : j10 >>> 1;
            }
            table[i10] = j10;
        }
    }

    public CRC64() {
        this.value = 0L;
    }

    public CRC64(long j10) {
        this.value = j10;
    }

    public CRC64(byte[] bArr, int i10) {
        this.value = 0L;
        update(bArr, i10);
    }

    public static long combine(long j10, long j11, long j12) {
        if (j12 == 0) {
            return j10;
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j13 = 1;
        for (int i10 = 1; i10 < 64; i10++) {
            jArr2[i10] = j13;
            j13 <<= 1;
        }
        gf2MatrixSquare(jArr, jArr2);
        gf2MatrixSquare(jArr2, jArr);
        long jGf2MatrixTimes = j10;
        long j14 = j12;
        do {
            gf2MatrixSquare(jArr, jArr2);
            if ((j14 & 1) == 1) {
                jGf2MatrixTimes = gf2MatrixTimes(jArr, jGf2MatrixTimes);
            }
            long j15 = j14 >>> 1;
            if (j15 == 0) {
                break;
            }
            gf2MatrixSquare(jArr2, jArr);
            if ((j15 & 1) == 1) {
                jGf2MatrixTimes = gf2MatrixTimes(jArr2, jGf2MatrixTimes);
            }
            j14 = j15 >>> 1;
        } while (j14 != 0);
        return jGf2MatrixTimes ^ j11;
    }

    public static CRC64 combine(CRC64 crc64, CRC64 crc65, long j10) {
        if (j10 == 0) {
            return new CRC64(crc64.getValue());
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j11 = 1;
        for (int i10 = 1; i10 < 64; i10++) {
            jArr2[i10] = j11;
            j11 <<= 1;
        }
        gf2MatrixSquare(jArr, jArr2);
        gf2MatrixSquare(jArr2, jArr);
        long value = crc64.getValue();
        long value2 = crc65.getValue();
        do {
            gf2MatrixSquare(jArr, jArr2);
            if ((j10 & 1) == 1) {
                value = gf2MatrixTimes(jArr, value);
            }
            long j12 = j10 >>> 1;
            if (j12 == 0) {
                break;
            }
            gf2MatrixSquare(jArr2, jArr);
            if ((j12 & 1) == 1) {
                value = gf2MatrixTimes(jArr2, value);
            }
            j10 = j12 >>> 1;
        } while (j10 != 0);
        return new CRC64(value2 ^ value);
    }

    public static CRC64 fromBytes(byte[] bArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            j10 = (j10 << 8) ^ (((long) bArr[i10]) & 255);
        }
        return new CRC64(j10);
    }

    private static void gf2MatrixSquare(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < 64; i10++) {
            jArr[i10] = gf2MatrixTimes(jArr2, jArr2[i10]);
        }
    }

    private static long gf2MatrixTimes(long[] jArr, long j10) {
        int i10 = 0;
        long j11 = 0;
        while (j10 != 0) {
            if ((j10 & 1) == 1) {
                j11 ^= jArr[i10];
            }
            j10 >>>= 1;
            i10++;
        }
        return j11;
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[8];
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[7 - i10] = (byte) (this.value >>> (i10 * 8));
        }
        return bArr;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.value;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.value = 0L;
    }

    public void update(byte b10) {
        long j10 = ~this.value;
        this.value = ~((j10 >>> 8) ^ table[((int) (((long) b10) ^ j10)) & 255]);
    }

    @Override // java.util.zip.Checksum
    public void update(int i10) {
        update((byte) (i10 & 255));
    }

    public void update(byte[] bArr, int i10) {
        this.value = ~this.value;
        int i11 = 0;
        while (i10 > 0) {
            long[] jArr = table;
            long j10 = this.value;
            this.value = (j10 >>> 8) ^ jArr[((int) (((long) bArr[i11]) ^ j10)) & 255];
            i11++;
            i10--;
        }
        this.value = ~this.value;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            update(bArr[i10]);
            i11--;
            i10++;
        }
    }
}
