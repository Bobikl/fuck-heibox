package androidx.collection;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 IntSet.kt\nandroidx/collection/IntSet\n+ 6 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,853:1\n832#1,2:997\n836#1,5:1005\n832#1,2:1036\n836#1,5:1044\n832#1,2:1061\n836#1,5:1069\n832#1,2:1075\n836#1,5:1083\n1#2:854\n1672#3,6:855\n1826#3:874\n1688#3:878\n1619#3:895\n1615#3:898\n1795#3,3:902\n1809#3,3:906\n1733#3:910\n1721#3:912\n1715#3:913\n1728#3:918\n1818#3:920\n1619#3:934\n1615#3:937\n1795#3,3:941\n1809#3,3:945\n1733#3:949\n1721#3:951\n1715#3:952\n1728#3:957\n1818#3:959\n1826#3:981\n1688#3:985\n1672#3,6:999\n1672#3,6:1010\n1615#3:1019\n1619#3:1020\n1795#3,3:1021\n1809#3,3:1024\n1733#3:1027\n1721#3:1028\n1715#3:1029\n1728#3:1030\n1818#3:1031\n1682#3:1032\n1661#3:1033\n1680#3:1034\n1661#3:1035\n1672#3,6:1038\n1795#3,3:1049\n1826#3:1052\n1715#3:1053\n1685#3:1054\n1661#3:1055\n1615#3:1059\n1619#3:1060\n1672#3,6:1063\n1661#3:1074\n1672#3,6:1077\n1672#3,6:1088\n1672#3,6:1094\n13600#4,2:861\n13600#4,2:968\n262#5,4:863\n232#5,7:867\n243#5,3:875\n246#5,2:879\n266#5,2:881\n249#5,6:883\n268#5:889\n442#5:890\n443#5:894\n445#5,2:896\n447#5,3:899\n450#5:905\n451#5:909\n452#5:911\n453#5,4:914\n459#5:919\n460#5,8:921\n442#5:929\n443#5:933\n445#5,2:935\n447#5,3:938\n450#5:944\n451#5:948\n452#5:950\n453#5,4:953\n459#5:958\n460#5,8:960\n262#5,4:970\n232#5,7:974\n243#5,3:982\n246#5,2:986\n266#5,2:988\n249#5,6:990\n268#5:996\n849#6,3:891\n849#6,3:930\n849#6,3:1016\n849#6,3:1056\n*S KotlinDebug\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n*L\n673#1:997,2\n673#1:1005,5\n731#1:1036,2\n731#1:1044,5\n803#1:1061,2\n803#1:1069,5\n818#1:1075,2\n818#1:1083,5\n526#1:855,6\n595#1:874\n595#1:878\n607#1:895\n607#1:898\n607#1:902,3\n607#1:906,3\n607#1:910\n607#1:912\n607#1:913\n607#1:918\n607#1:920\n620#1:934\n620#1:937\n620#1:941,3\n620#1:945,3\n620#1:949\n620#1:951\n620#1:952\n620#1:957\n620#1:959\n663#1:981\n663#1:985\n673#1:999,6\n683#1:1010,6\n697#1:1019\n698#1:1020\n705#1:1021,3\n706#1:1024,3\n707#1:1027\n708#1:1028\n708#1:1029\n712#1:1030\n715#1:1031\n724#1:1032\n724#1:1033\n730#1:1034\n730#1:1035\n731#1:1038,6\n745#1:1049,3\n746#1:1052\n748#1:1053\n798#1:1054\n798#1:1055\n801#1:1059\n803#1:1060\n803#1:1063,6\n816#1:1074\n818#1:1077,6\n833#1:1088,6\n839#1:1094,6\n573#1:861,2\n642#1:968,2\n595#1:863,4\n595#1:867,7\n595#1:875,3\n595#1:879,2\n595#1:881,2\n595#1:883,6\n595#1:889\n607#1:890\n607#1:894\n607#1:896,2\n607#1:899,3\n607#1:905\n607#1:909\n607#1:911\n607#1:914,4\n607#1:919\n607#1:921,8\n620#1:929\n620#1:933\n620#1:935,2\n620#1:938,3\n620#1:944\n620#1:948\n620#1:950\n620#1:953,4\n620#1:958\n620#1:960,8\n663#1:970,4\n663#1:974,7\n663#1:982,3\n663#1:986,2\n663#1:988,2\n663#1:990,6\n663#1:996\n607#1:891,3\n620#1:930,3\n696#1:1016,3\n800#1:1056,3\n*E\n"})
public final class n1 extends i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3667e;

    public n1() {
        this(0, 1, null);
    }

    public n1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        P(h2.z(i10));
    }

    public /* synthetic */ n1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void J() {
        if (this.f3626c <= 8 || Long.compare(kotlin.r1.h(kotlin.r1.h(this.f3627d) * 32) ^ Long.MIN_VALUE, kotlin.r1.h(kotlin.r1.h(this.f3626c) * 25) ^ Long.MIN_VALUE) > 0) {
            b0(h2.w(this.f3626c));
        } else {
            Z();
        }
    }

    private final int L(int i10) {
        int i11 = h2.f3616j * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f3626c;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f3624a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j11 = i14;
            int i20 = i17;
            long j12 = j10 ^ (j11 * h2.f3617k);
            long j13 = (~j12) & (j12 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j13 != 0) {
                    int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j13) >> 3)) & i15;
                    if (this.f3625b[iNumberOfTrailingZeros] == i10) {
                        return iNumberOfTrailingZeros;
                    }
                    j13 &= j13 - 1;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM = M(i13);
                if (this.f3667e == 0) {
                    if (!(((this.f3624a[iM >> 3] >> ((iM & 7) << 3)) & 255) == 254)) {
                        J();
                        iM = M(i13);
                    }
                }
                this.f3627d++;
                int i21 = this.f3667e;
                long[] jArr2 = this.f3624a;
                int i22 = iM >> 3;
                long j14 = jArr2[i22];
                int i23 = (iM & 7) << 3;
                this.f3667e = i21 - (((j14 >> i23) & 255) == 128 ? 1 : 0);
                jArr2[i22] = (j14 & (~(255 << i23))) | (j11 << i23);
                int i24 = this.f3626c;
                int i25 = ((iM - 7) & i24) + (i24 & 7);
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                jArr2[i26] = ((~(255 << i27)) & jArr2[i26]) | (j11 << i27);
                return iM;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
        }
    }

    private final int M(int i10) {
        int i11 = this.f3626c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f3624a;
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
        this.f3667e = h2.o(l()) - this.f3627d;
    }

    private final void O(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = h2.f3611e;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f3624a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        N();
    }

    private final void P(int i10) {
        int iMax = i10 > 0 ? Math.max(7, h2.x(i10)) : 0;
        this.f3626c = iMax;
        O(iMax);
        this.f3625b = new int[iMax];
    }

    private final void Z() {
        long[] jArr = this.f3624a;
        int i10 = this.f3626c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            if (((jArr[i13] >> i14) & 255) == 254) {
                long[] jArr2 = this.f3624a;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (128 << i14);
                int i15 = this.f3626c;
                int i16 = ((i12 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = (128 << i18) | ((~(255 << i18)) & jArr2[i17]);
                i11++;
            }
        }
        this.f3667e += i11;
    }

    private final void a0(int i10) {
        this.f3627d--;
        long[] jArr = this.f3624a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f3626c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
    }

    private final void b0(int i10) {
        long[] jArr = this.f3624a;
        int[] iArr = this.f3625b;
        int i11 = this.f3626c;
        P(i10);
        int[] iArr2 = this.f3625b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int i14 = h2.f3616j * i13;
                int i15 = i14 ^ (i14 << 16);
                int iM = M(i15 >>> 7);
                long j10 = i15 & 127;
                long[] jArr2 = this.f3624a;
                int i16 = iM >> 3;
                int i17 = (iM & 7) << 3;
                jArr2[i16] = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                int i18 = this.f3626c;
                int i19 = ((iM - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (j10 << i21);
                iArr2[iM] = i13;
            }
        }
    }

    private final void d0(int i10, long j10) {
        long[] jArr = this.f3624a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f3626c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public final boolean G(int i10) {
        int i11 = this.f3627d;
        this.f3625b[L(i10)] = i10;
        return this.f3627d != i11;
    }

    public final boolean H(@dl.d i0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3627d;
        U(elements);
        return i10 != this.f3627d;
    }

    public final boolean I(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3627d;
        V(elements);
        return i10 != this.f3627d;
    }

    public final void K() {
        this.f3627d = 0;
        long[] jArr = this.f3624a;
        if (jArr != h2.f3611e) {
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f3624a;
            int i10 = this.f3626c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        N();
    }

    public final void Q(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = h2.f3616j * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f3626c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f3624a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                    if (this.f3625b[iNumberOfTrailingZeros] == i10) {
                        break loop0;
                    } else {
                        j12 &= j12 - 1;
                    }
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i16 += 8;
                i15 = (i15 + i16) & i14;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            a0(iNumberOfTrailingZeros);
        }
    }

    public final void R(@dl.d i0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int[] iArr = elements.f3625b;
        long[] jArr = elements.f3624a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Q(iArr[(i10 << 3) + i12]);
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

    public final void S(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (int i10 : elements) {
            Q(i10);
        }
    }

    public final void T(int i10) {
        this.f3625b[L(i10)] = i10;
    }

    public final void U(@dl.d i0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int[] iArr = elements.f3625b;
        long[] jArr = elements.f3624a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        T(iArr[(i10 << 3) + i12]);
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

    public final void V(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (int i10 : elements) {
            T(i10);
        }
    }

    public final boolean W(int i10) {
        int iNumberOfTrailingZeros;
        int i11 = h2.f3616j * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f3626c;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f3624a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                    if (this.f3625b[iNumberOfTrailingZeros] == i10) {
                        break loop0;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            a0(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final boolean X(@dl.d i0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3627d;
        R(elements);
        return i10 != this.f3627d;
    }

    public final boolean Y(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3627d;
        S(elements);
        return i10 != this.f3627d;
    }

    @androidx.annotation.f0(from = 0)
    public final int c0() {
        int i10 = this.f3626c;
        int iX = h2.x(h2.z(this.f3627d));
        if (iX >= i10) {
            return 0;
        }
        b0(iX);
        return i10 - this.f3626c;
    }
}
