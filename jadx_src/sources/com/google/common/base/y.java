package com.google.common.base;

import java.util.BitSet;

/* JADX INFO: compiled from: SmallCharMatcher.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@g
public final class y extends b.v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f56761g = 1023;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f56762h = -862048943;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f56763i = 461845907;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final double f56764j = 0.5d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f56765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f56766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f56767f;

    private y(char[] cArr, long j10, boolean z10, String str) {
        super(str);
        this.f56765d = cArr;
        this.f56767f = j10;
        this.f56766e = z10;
    }

    private boolean Y(int i10) {
        return 1 == ((this.f56767f >> i10) & 1);
    }

    @o9.d
    static int Z(int i10) {
        if (i10 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
        while (((double) iHighestOneBit) * f56764j < i10) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    static b a0(BitSet bitSet, String str) {
        int i10;
        int iCardinality = bitSet.cardinality();
        boolean z10 = bitSet.get(0);
        int iZ = Z(iCardinality);
        char[] cArr = new char[iZ];
        int i11 = iZ - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j10 = 0;
        while (iNextSetBit != -1) {
            long j11 = (1 << iNextSetBit) | j10;
            int iB0 = b0(iNextSetBit);
            while (true) {
                i10 = iB0 & i11;
                if (cArr[i10] == 0) {
                    break;
                }
                iB0 = i10 + 1;
            }
            cArr[i10] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j10 = j11;
        }
        return new y(cArr, j10, z10, str);
    }

    static int b0(int i10) {
        return Integer.rotateLeft(i10 * (-862048943), 15) * f56763i;
    }

    @Override // com.google.common.base.b
    public boolean B(char c10) {
        if (c10 == 0) {
            return this.f56766e;
        }
        if (!Y(c10)) {
            return false;
        }
        int length = this.f56765d.length - 1;
        int iB0 = b0(c10) & length;
        int i10 = iB0;
        do {
            char c11 = this.f56765d[i10];
            if (c11 == 0) {
                return false;
            }
            if (c11 == c10) {
                return true;
            }
            i10 = (i10 + 1) & length;
        } while (i10 != iB0);
        return false;
    }

    @Override // com.google.common.base.b
    void Q(BitSet bitSet) {
        if (this.f56766e) {
            bitSet.set(0);
        }
        for (char c10 : this.f56765d) {
            if (c10 != 0) {
                bitSet.set(c10);
            }
        }
    }
}
