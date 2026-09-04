package androidx.collection;

/* JADX INFO: compiled from: LongIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/MutableLongIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 LongIntMap.kt\nandroidx/collection/LongIntMap\n+ 5 LongSet.kt\nandroidx/collection/LongSet\n+ 6 LongList.kt\nandroidx/collection/LongList\n+ 7 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1047:1\n1037#1,2:1134\n1041#1,5:1142\n1037#1,2:1173\n1041#1,5:1181\n1037#1,2:1198\n1041#1,5:1206\n1037#1,2:1212\n1041#1,5:1220\n1#2:1048\n1672#3,6:1049\n1826#3:1065\n1688#3:1069\n1826#3:1087\n1688#3:1091\n1826#3:1112\n1688#3:1116\n1672#3,6:1136\n1672#3,6:1147\n1615#3:1156\n1619#3:1157\n1795#3,3:1158\n1809#3,3:1161\n1733#3:1164\n1721#3:1165\n1715#3:1166\n1728#3:1167\n1818#3:1168\n1682#3:1169\n1661#3:1170\n1680#3:1171\n1661#3:1172\n1672#3,6:1175\n1795#3,3:1186\n1826#3:1189\n1715#3:1190\n1685#3:1191\n1661#3:1192\n1615#3:1196\n1619#3:1197\n1672#3,6:1200\n1661#3:1211\n1672#3,6:1214\n1672#3,6:1225\n1672#3,6:1231\n385#4,4:1055\n357#4,6:1059\n367#4,3:1066\n370#4,2:1070\n389#4,2:1072\n373#4,6:1074\n391#4:1080\n357#4,6:1081\n367#4,3:1088\n370#4,9:1092\n262#5,4:1101\n232#5,7:1105\n243#5,3:1113\n246#5,2:1117\n266#5,2:1119\n249#5,6:1121\n268#5:1127\n253#6,6:1128\n849#7,3:1153\n849#7,3:1193\n*S KotlinDebug\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/MutableLongIntMap\n*L\n875#1:1134,2\n875#1:1142,5\n933#1:1173,2\n933#1:1181,5\n1007#1:1198,2\n1007#1:1206,5\n1023#1:1212,2\n1023#1:1220,5\n711#1:1049,6\n789#1:1065\n789#1:1069\n828#1:1087\n828#1:1091\n855#1:1112\n855#1:1116\n875#1:1136,6\n885#1:1147,6\n899#1:1156\n900#1:1157\n907#1:1158,3\n908#1:1161,3\n909#1:1164\n910#1:1165\n910#1:1166\n914#1:1167\n917#1:1168\n926#1:1169\n926#1:1170\n932#1:1171\n932#1:1172\n933#1:1175,6\n948#1:1186,3\n949#1:1189\n951#1:1190\n1002#1:1191\n1002#1:1192\n1005#1:1196\n1007#1:1197\n1007#1:1200,6\n1021#1:1211\n1023#1:1214,6\n1038#1:1225,6\n1044#1:1231,6\n789#1:1055,4\n789#1:1059,6\n789#1:1066,3\n789#1:1070,2\n789#1:1072,2\n789#1:1074,6\n789#1:1080\n828#1:1081,6\n828#1:1088,3\n828#1:1092,9\n855#1:1101,4\n855#1:1105,7\n855#1:1113,3\n855#1:1117,2\n855#1:1119,2\n855#1:1121,6\n855#1:1127\n864#1:1128,6\n898#1:1153,3\n1004#1:1193,3\n*E\n"})
public final class p1 extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3679f;

    public p1() {
        this(0, 1, null);
    }

    public p1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        V(h2.z(i10));
    }

    public /* synthetic */ p1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void O() {
        if (this.f3661d <= 8 || Long.compare(kotlin.r1.h(kotlin.r1.h(this.f3662e) * 32) ^ Long.MIN_VALUE, kotlin.r1.h(kotlin.r1.h(this.f3661d) * 25) ^ Long.MIN_VALUE) > 0) {
            j0(h2.w(this.f3661d));
        } else {
            g0();
        }
    }

    private final int Q(int i10) {
        int i11 = this.f3661d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f3658a;
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

    private final int R(long j10) {
        int iA = k.a(j10) * h2.f3616j;
        int i10 = iA ^ (iA << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f3661d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f3658a;
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
                    if (this.f3659b[iNumberOfTrailingZeros] == j10) {
                        return iNumberOfTrailingZeros;
                    }
                    j14 &= j14 - 1;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iQ = Q(i11);
                if (this.f3679f == 0) {
                    if (!(((this.f3658a[iQ >> 3] >> ((iQ & 7) << 3)) & 255) == 254)) {
                        O();
                        iQ = Q(i11);
                    }
                }
                this.f3662e++;
                int i19 = this.f3679f;
                long[] jArr2 = this.f3658a;
                int i20 = iQ >> 3;
                long j15 = jArr2[i20];
                int i21 = (iQ & 7) << 3;
                this.f3679f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                jArr2[i20] = (j15 & (~(255 << i21))) | (j12 << i21);
                int i22 = this.f3661d;
                int i23 = ((iQ - 7) & i22) + (i22 & 7);
                int i24 = i23 >> 3;
                int i25 = (i23 & 7) << 3;
                jArr2[i24] = ((~(255 << i25)) & jArr2[i24]) | (j12 << i25);
                return ~iQ;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final void T() {
        this.f3679f = h2.o(o()) - this.f3662e;
    }

    private final void U(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = h2.f3611e;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f3658a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        T();
    }

    private final void V(int i10) {
        int iMax = i10 > 0 ? Math.max(7, h2.x(i10)) : 0;
        this.f3661d = iMax;
        U(iMax);
        this.f3659b = new long[iMax];
        this.f3660c = new int[iMax];
    }

    private final void g0() {
        long[] jArr = this.f3658a;
        int i10 = this.f3661d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            if (((jArr[i13] >> i14) & 255) == 254) {
                long[] jArr2 = this.f3658a;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (128 << i14);
                int i15 = this.f3661d;
                int i16 = ((i12 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = (128 << i18) | ((~(255 << i18)) & jArr2[i17]);
                i11++;
            }
        }
        this.f3679f += i11;
    }

    private final void j0(int i10) {
        int i11;
        long[] jArr = this.f3658a;
        long[] jArr2 = this.f3659b;
        int[] iArr = this.f3660c;
        int i12 = this.f3661d;
        V(i10);
        long[] jArr3 = this.f3659b;
        int[] iArr2 = this.f3660c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int iA = k.a(j10) * h2.f3616j;
                int i14 = iA ^ (iA << 16);
                int iQ = Q(i14 >>> 7);
                i11 = i13;
                long j11 = i14 & 127;
                long[] jArr4 = this.f3658a;
                int i15 = iQ >> 3;
                int i16 = (iQ & 7) << 3;
                jArr4[i15] = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                int i17 = this.f3661d;
                int i18 = ((iQ - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr4[i19] = (j11 << i20) | (jArr4[i19] & (~(255 << i20)));
                jArr3[iQ] = j10;
                iArr2[iQ] = iArr[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
            jArr = jArr;
            jArr2 = jArr2;
        }
    }

    private final void m0(int i10, long j10) {
        long[] jArr = this.f3658a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f3661d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public final void P() {
        this.f3662e = 0;
        long[] jArr = this.f3658a;
        if (jArr != h2.f3611e) {
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f3658a;
            int i10 = this.f3661d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        T();
    }

    public final int S(long j10, @dl.d yh.a<Integer> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        int i10 = i(j10);
        if (i10 >= 0) {
            return this.f3660c[i10];
        }
        int iIntValue = defaultValue.invoke().intValue();
        c0(j10, iIntValue);
        return iIntValue;
    }

    public final void W(long j10) {
        e0(j10);
    }

    public final void X(@dl.d o0 keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        long[] jArr = keys.f3674a;
        int i10 = keys.f3675b;
        for (int i11 = 0; i11 < i10; i11++) {
            e0(jArr[i11]);
        }
    }

    public final void Y(@dl.d v0 keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        long[] jArr = keys.f3719b;
        long[] jArr2 = keys.f3718a;
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
                        e0(jArr[(i10 << 3) + i12]);
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

    public final void Z(@dl.d long[] keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        for (long j10 : keys) {
            e0(j10);
        }
    }

    public final void a0(@dl.d m0 from) {
        kotlin.jvm.internal.f0.p(from, "from");
        d0(from);
    }

    public final int b0(long j10, int i10, int i11) {
        int iR = R(j10);
        if (iR < 0) {
            iR = ~iR;
        } else {
            i11 = this.f3660c[iR];
        }
        this.f3659b[iR] = j10;
        this.f3660c[iR] = i10;
        return i11;
    }

    public final void c0(long j10, int i10) {
        k0(j10, i10);
    }

    public final void d0(@dl.d m0 from) {
        kotlin.jvm.internal.f0.p(from, "from");
        long[] jArr = from.f3659b;
        int[] iArr = from.f3660c;
        long[] jArr2 = from.f3658a;
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
                        int i13 = (i10 << 3) + i12;
                        k0(jArr[i13], iArr[i13]);
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

    public final void e0(long j10) {
        int i10 = i(j10);
        if (i10 >= 0) {
            i0(i10);
        }
    }

    public final boolean f0(long j10, int i10) {
        int i11 = i(j10);
        if (i11 < 0 || this.f3660c[i11] != i10) {
            return false;
        }
        i0(i11);
        return true;
    }

    public final void h0(@dl.d yh.p<? super Long, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3658a;
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
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(Long.valueOf(this.f3659b[i13]), Integer.valueOf(this.f3660c[i13])).booleanValue()) {
                            i0(i13);
                        }
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

    @kotlin.r0
    public final void i0(int i10) {
        this.f3662e--;
        long[] jArr = this.f3658a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f3661d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
    }

    public final void k0(long j10, int i10) {
        int iR = R(j10);
        if (iR < 0) {
            iR = ~iR;
        }
        this.f3659b[iR] = j10;
        this.f3660c[iR] = i10;
    }

    public final int l0() {
        int i10 = this.f3661d;
        int iX = h2.x(h2.z(this.f3662e));
        if (iX >= i10) {
            return 0;
        }
        j0(iX);
        return i10 - this.f3661d;
    }
}
