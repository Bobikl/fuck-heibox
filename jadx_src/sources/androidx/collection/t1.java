package androidx.collection;

/* JADX INFO: compiled from: LongSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 LongSet.kt\nandroidx/collection/LongSet\n+ 6 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,853:1\n832#1,2:997\n836#1,5:1005\n832#1,2:1036\n836#1,5:1044\n832#1,2:1061\n836#1,5:1069\n832#1,2:1075\n836#1,5:1083\n1#2:854\n1672#3,6:855\n1826#3:874\n1688#3:878\n1619#3:895\n1615#3:898\n1795#3,3:902\n1809#3,3:906\n1733#3:910\n1721#3:912\n1715#3:913\n1728#3:918\n1818#3:920\n1619#3:934\n1615#3:937\n1795#3,3:941\n1809#3,3:945\n1733#3:949\n1721#3:951\n1715#3:952\n1728#3:957\n1818#3:959\n1826#3:981\n1688#3:985\n1672#3,6:999\n1672#3,6:1010\n1615#3:1019\n1619#3:1020\n1795#3,3:1021\n1809#3,3:1024\n1733#3:1027\n1721#3:1028\n1715#3:1029\n1728#3:1030\n1818#3:1031\n1682#3:1032\n1661#3:1033\n1680#3:1034\n1661#3:1035\n1672#3,6:1038\n1795#3,3:1049\n1826#3:1052\n1715#3:1053\n1685#3:1054\n1661#3:1055\n1615#3:1059\n1619#3:1060\n1672#3,6:1063\n1661#3:1074\n1672#3,6:1077\n1672#3,6:1088\n1672#3,6:1094\n13607#4,2:861\n13607#4,2:968\n262#5,4:863\n232#5,7:867\n243#5,3:875\n246#5,2:879\n266#5,2:881\n249#5,6:883\n268#5:889\n442#5:890\n443#5:894\n445#5,2:896\n447#5,3:899\n450#5:905\n451#5:909\n452#5:911\n453#5,4:914\n459#5:919\n460#5,8:921\n442#5:929\n443#5:933\n445#5,2:935\n447#5,3:938\n450#5:944\n451#5:948\n452#5:950\n453#5,4:953\n459#5:958\n460#5,8:960\n262#5,4:970\n232#5,7:974\n243#5,3:982\n246#5,2:986\n266#5,2:988\n249#5,6:990\n268#5:996\n849#6,3:891\n849#6,3:930\n849#6,3:1016\n849#6,3:1056\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n*L\n673#1:997,2\n673#1:1005,5\n731#1:1036,2\n731#1:1044,5\n803#1:1061,2\n803#1:1069,5\n818#1:1075,2\n818#1:1083,5\n526#1:855,6\n595#1:874\n595#1:878\n607#1:895\n607#1:898\n607#1:902,3\n607#1:906,3\n607#1:910\n607#1:912\n607#1:913\n607#1:918\n607#1:920\n620#1:934\n620#1:937\n620#1:941,3\n620#1:945,3\n620#1:949\n620#1:951\n620#1:952\n620#1:957\n620#1:959\n663#1:981\n663#1:985\n673#1:999,6\n683#1:1010,6\n697#1:1019\n698#1:1020\n705#1:1021,3\n706#1:1024,3\n707#1:1027\n708#1:1028\n708#1:1029\n712#1:1030\n715#1:1031\n724#1:1032\n724#1:1033\n730#1:1034\n730#1:1035\n731#1:1038,6\n745#1:1049,3\n746#1:1052\n748#1:1053\n798#1:1054\n798#1:1055\n801#1:1059\n803#1:1060\n803#1:1063,6\n816#1:1074\n818#1:1077,6\n833#1:1088,6\n839#1:1094,6\n573#1:861,2\n642#1:968,2\n595#1:863,4\n595#1:867,7\n595#1:875,3\n595#1:879,2\n595#1:881,2\n595#1:883,6\n595#1:889\n607#1:890\n607#1:894\n607#1:896,2\n607#1:899,3\n607#1:905\n607#1:909\n607#1:911\n607#1:914,4\n607#1:919\n607#1:921,8\n620#1:929\n620#1:933\n620#1:935,2\n620#1:938,3\n620#1:944\n620#1:948\n620#1:950\n620#1:953,4\n620#1:958\n620#1:960,8\n663#1:970,4\n663#1:974,7\n663#1:982,3\n663#1:986,2\n663#1:988,2\n663#1:990,6\n663#1:996\n607#1:891,3\n620#1:930,3\n696#1:1016,3\n800#1:1056,3\n*E\n"})
public final class t1 extends v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3707e;

    public t1() {
        this(0, 1, null);
    }

    public t1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        P(h2.z(i10));
    }

    public /* synthetic */ t1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void J() {
        if (this.f3720c <= 8 || Long.compare(kotlin.r1.h(kotlin.r1.h(this.f3721d) * 32) ^ Long.MIN_VALUE, kotlin.r1.h(kotlin.r1.h(this.f3720c) * 25) ^ Long.MIN_VALUE) > 0) {
            b0(h2.w(this.f3720c));
        } else {
            Z();
        }
    }

    private final int L(long j10) {
        int iA = k.a(j10) * h2.f3616j;
        int i10 = iA ^ (iA << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f3720c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f3718a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * h2.f3617k);
            long j14 = (~j13) & (j13 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j14 != 0) {
                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                    if (this.f3719b[iNumberOfTrailingZeros] == j10) {
                        return iNumberOfTrailingZeros;
                    }
                    j14 &= j14 - 1;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM = M(i11);
                if (this.f3707e == 0) {
                    if (!(((this.f3718a[iM >> 3] >> ((iM & 7) << 3)) & 255) == 254)) {
                        J();
                        iM = M(i11);
                    }
                }
                this.f3721d++;
                int i19 = this.f3707e;
                long[] jArr2 = this.f3718a;
                int i20 = iM >> 3;
                long j15 = jArr2[i20];
                int i21 = (iM & 7) << 3;
                this.f3707e = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                jArr2[i20] = (j15 & (~(255 << i21))) | (j12 << i21);
                int i22 = this.f3720c;
                int i23 = ((iM - 7) & i22) + (i22 & 7);
                int i24 = i23 >> 3;
                int i25 = (i23 & 7) << 3;
                jArr2[i24] = ((~(255 << i25)) & jArr2[i24]) | (j12 << i25);
                return iM;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int M(int i10) {
        int i11 = this.f3720c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f3718a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void N() {
        this.f3707e = h2.o(l()) - this.f3721d;
    }

    private final void O(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = h2.f3611e;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f3718a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        N();
    }

    private final void P(int i10) {
        int iMax = i10 > 0 ? Math.max(7, h2.x(i10)) : 0;
        this.f3720c = iMax;
        O(iMax);
        this.f3719b = new long[iMax];
    }

    private final void Z() {
        long[] jArr = this.f3718a;
        int i10 = this.f3720c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            if (((jArr[i13] >> i14) & 255) == 254) {
                long[] jArr2 = this.f3718a;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (128 << i14);
                int i15 = this.f3720c;
                int i16 = ((i12 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = (128 << i18) | ((~(255 << i18)) & jArr2[i17]);
                i11++;
            }
        }
        this.f3707e += i11;
    }

    private final void a0(int i10) {
        this.f3721d--;
        long[] jArr = this.f3718a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f3720c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
    }

    private final void b0(int i10) {
        long[] jArr = this.f3718a;
        long[] jArr2 = this.f3719b;
        int i11 = this.f3720c;
        P(i10);
        long[] jArr3 = this.f3719b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i12];
                int iA = k.a(j10) * h2.f3616j;
                int i13 = iA ^ (iA << 16);
                int iM = M(i13 >>> 7);
                long j11 = i13 & 127;
                long[] jArr4 = this.f3718a;
                int i14 = iM >> 3;
                int i15 = (iM & 7) << 3;
                jArr4[i14] = (jArr4[i14] & (~(255 << i15))) | (j11 << i15);
                int i16 = this.f3720c;
                int i17 = ((iM - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr4[i18] = ((~(255 << i19)) & jArr4[i18]) | (j11 << i19);
                jArr3[iM] = j10;
            }
        }
    }

    private final void d0(int i10, long j10) {
        long[] jArr = this.f3718a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f3720c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public final boolean G(long j10) {
        int i10 = this.f3721d;
        this.f3719b[L(j10)] = j10;
        return this.f3721d != i10;
    }

    public final boolean H(@dl.d v0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3721d;
        U(elements);
        return i10 != this.f3721d;
    }

    public final boolean I(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3721d;
        V(elements);
        return i10 != this.f3721d;
    }

    public final void K() {
        this.f3721d = 0;
        long[] jArr = this.f3718a;
        if (jArr != h2.f3611e) {
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f3718a;
            int i10 = this.f3720c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        N();
    }

    public final void Q(long j10) {
        int iNumberOfTrailingZeros;
        int iA = k.a(j10) * h2.f3616j;
        int i10 = iA ^ (iA << 16);
        int i11 = i10 & 127;
        int i12 = this.f3720c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3718a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * h2.f3617k) ^ j11;
            long j13 = (~j12) & (j12 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j13 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                    if (this.f3719b[iNumberOfTrailingZeros] == j10) {
                        break loop0;
                    } else {
                        j13 &= j13 - 1;
                    }
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i14 += 8;
                i13 = (i13 + i14) & i12;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            a0(iNumberOfTrailingZeros);
        }
    }

    public final void R(@dl.d v0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        long[] jArr = elements.f3719b;
        long[] jArr2 = elements.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Q(jArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void S(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (long j10 : elements) {
            Q(j10);
        }
    }

    public final void T(long j10) {
        this.f3719b[L(j10)] = j10;
    }

    public final void U(@dl.d v0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        long[] jArr = elements.f3719b;
        long[] jArr2 = elements.f3718a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        T(jArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void V(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (long j10 : elements) {
            T(j10);
        }
    }

    public final boolean W(long j10) {
        int iNumberOfTrailingZeros;
        int iA = k.a(j10) * h2.f3616j;
        int i10 = iA ^ (iA << 16);
        int i11 = i10 & 127;
        int i12 = this.f3720c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3718a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * h2.f3617k) ^ j11;
            long j13 = (~j12) & (j12 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j13 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                    if (this.f3719b[iNumberOfTrailingZeros] == j10) {
                        break loop0;
                    }
                    j13 &= j13 - 1;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            a0(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final boolean X(@dl.d v0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3721d;
        R(elements);
        return i10 != this.f3721d;
    }

    public final boolean Y(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3721d;
        S(elements);
        return i10 != this.f3721d;
    }

    @androidx.annotation.f0(from = 0)
    public final int c0() {
        int i10 = this.f3720c;
        int iX = h2.x(h2.z(this.f3721d));
        if (iX >= i10) {
            return 0;
        }
        b0(iX);
        return i10 - this.f3720c;
    }
}
