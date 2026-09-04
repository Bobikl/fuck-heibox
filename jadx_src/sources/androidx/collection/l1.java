package androidx.collection;

/* JADX INFO: compiled from: IntLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nIntLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntLongMap.kt\nandroidx/collection/MutableIntLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntLongMap.kt\nandroidx/collection/IntLongMap\n+ 5 IntSet.kt\nandroidx/collection/IntSet\n+ 6 IntList.kt\nandroidx/collection/IntList\n+ 7 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,1047:1\n1037#1,2:1134\n1041#1,5:1142\n1037#1,2:1173\n1041#1,5:1181\n1037#1,2:1198\n1041#1,5:1206\n1037#1,2:1212\n1041#1,5:1220\n1#2:1048\n1672#3,6:1049\n1826#3:1065\n1688#3:1069\n1826#3:1087\n1688#3:1091\n1826#3:1112\n1688#3:1116\n1672#3,6:1136\n1672#3,6:1147\n1615#3:1156\n1619#3:1157\n1795#3,3:1158\n1809#3,3:1161\n1733#3:1164\n1721#3:1165\n1715#3:1166\n1728#3:1167\n1818#3:1168\n1682#3:1169\n1661#3:1170\n1680#3:1171\n1661#3:1172\n1672#3,6:1175\n1795#3,3:1186\n1826#3:1189\n1715#3:1190\n1685#3:1191\n1661#3:1192\n1615#3:1196\n1619#3:1197\n1672#3,6:1200\n1661#3:1211\n1672#3,6:1214\n1672#3,6:1225\n1672#3,6:1231\n385#4,4:1055\n357#4,6:1059\n367#4,3:1066\n370#4,2:1070\n389#4,2:1072\n373#4,6:1074\n391#4:1080\n357#4,6:1081\n367#4,3:1088\n370#4,9:1092\n262#5,4:1101\n232#5,7:1105\n243#5,3:1113\n246#5,2:1117\n266#5,2:1119\n249#5,6:1121\n268#5:1127\n253#6,6:1128\n849#7,3:1153\n849#7,3:1193\n*S KotlinDebug\n*F\n+ 1 IntLongMap.kt\nandroidx/collection/MutableIntLongMap\n*L\n875#1:1134,2\n875#1:1142,5\n933#1:1173,2\n933#1:1181,5\n1007#1:1198,2\n1007#1:1206,5\n1023#1:1212,2\n1023#1:1220,5\n711#1:1049,6\n789#1:1065\n789#1:1069\n828#1:1087\n828#1:1091\n855#1:1112\n855#1:1116\n875#1:1136,6\n885#1:1147,6\n899#1:1156\n900#1:1157\n907#1:1158,3\n908#1:1161,3\n909#1:1164\n910#1:1165\n910#1:1166\n914#1:1167\n917#1:1168\n926#1:1169\n926#1:1170\n932#1:1171\n932#1:1172\n933#1:1175,6\n948#1:1186,3\n949#1:1189\n951#1:1190\n1002#1:1191\n1002#1:1192\n1005#1:1196\n1007#1:1197\n1007#1:1200,6\n1021#1:1211\n1023#1:1214,6\n1038#1:1225,6\n1044#1:1231,6\n789#1:1055,4\n789#1:1059,6\n789#1:1066,3\n789#1:1070,2\n789#1:1072,2\n789#1:1074,6\n789#1:1080\n828#1:1081,6\n828#1:1088,3\n828#1:1092,9\n855#1:1101,4\n855#1:1105,7\n855#1:1113,3\n855#1:1117,2\n855#1:1119,2\n855#1:1121,6\n855#1:1127\n864#1:1128,6\n898#1:1153,3\n1004#1:1193,3\n*E\n"})
public final class l1 extends e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3648f;

    public l1() {
        this(0, 1, null);
    }

    public l1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        V(h2.z(i10));
    }

    public /* synthetic */ l1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void O() {
        if (this.f3580d <= 8 || Long.compare(kotlin.r1.h(kotlin.r1.h(this.f3581e) * 32) ^ Long.MIN_VALUE, kotlin.r1.h(kotlin.r1.h(this.f3580d) * 25) ^ Long.MIN_VALUE) > 0) {
            j0(h2.w(this.f3580d));
        } else {
            g0();
        }
    }

    private final int Q(int i10) {
        int i11 = this.f3580d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f3577a;
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

    private final int R(int i10) {
        int i11 = h2.f3616j * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f3580d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f3577a;
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
                    if (this.f3578b[iNumberOfTrailingZeros] == i10) {
                        return iNumberOfTrailingZeros;
                    }
                    j13 &= j13 - 1;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iQ = Q(i13);
                if (this.f3648f == 0) {
                    if (!(((this.f3577a[iQ >> 3] >> ((iQ & 7) << 3)) & 255) == 254)) {
                        O();
                        iQ = Q(i13);
                    }
                }
                this.f3581e++;
                int i21 = this.f3648f;
                long[] jArr2 = this.f3577a;
                int i22 = iQ >> 3;
                long j14 = jArr2[i22];
                int i23 = (iQ & 7) << 3;
                this.f3648f = i21 - (((j14 >> i23) & 255) == 128 ? 1 : 0);
                jArr2[i22] = (j14 & (~(255 << i23))) | (j11 << i23);
                int i24 = this.f3580d;
                int i25 = ((iQ - 7) & i24) + (i24 & 7);
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                jArr2[i26] = ((~(255 << i27)) & jArr2[i26]) | (j11 << i27);
                return ~iQ;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
        }
    }

    private final void T() {
        this.f3648f = h2.o(o()) - this.f3581e;
    }

    private final void U(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = h2.f3611e;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f3577a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        T();
    }

    private final void V(int i10) {
        int iMax = i10 > 0 ? Math.max(7, h2.x(i10)) : 0;
        this.f3580d = iMax;
        U(iMax);
        this.f3578b = new int[iMax];
        this.f3579c = new long[iMax];
    }

    private final void g0() {
        long[] jArr = this.f3577a;
        int i10 = this.f3580d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            if (((jArr[i13] >> i14) & 255) == 254) {
                long[] jArr2 = this.f3577a;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (128 << i14);
                int i15 = this.f3580d;
                int i16 = ((i12 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = (128 << i18) | ((~(255 << i18)) & jArr2[i17]);
                i11++;
            }
        }
        this.f3648f += i11;
    }

    private final void j0(int i10) {
        int i11;
        long[] jArr = this.f3577a;
        int[] iArr = this.f3578b;
        long[] jArr2 = this.f3579c;
        int i12 = this.f3580d;
        V(i10);
        int[] iArr2 = this.f3578b;
        long[] jArr3 = this.f3579c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int i15 = h2.f3616j * i14;
                int i16 = i15 ^ (i15 << 16);
                int iQ = Q(i16 >>> 7);
                long j10 = i16 & 127;
                long[] jArr4 = this.f3577a;
                int i17 = iQ >> 3;
                int i18 = (iQ & 7) << 3;
                i11 = i13;
                jArr4[i17] = (jArr4[i17] & (~(255 << i18))) | (j10 << i18);
                int i19 = this.f3580d;
                int i20 = ((iQ - 7) & i19) + (i19 & 7);
                int i21 = i20 >> 3;
                int i22 = (i20 & 7) << 3;
                jArr4[i21] = (jArr4[i21] & (~(255 << i22))) | (j10 << i22);
                iArr2[iQ] = i14;
                jArr3[iQ] = jArr2[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    private final void m0(int i10, long j10) {
        long[] jArr = this.f3577a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f3580d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public final void P() {
        this.f3581e = 0;
        long[] jArr = this.f3577a;
        if (jArr != h2.f3611e) {
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f3577a;
            int i10 = this.f3580d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        T();
    }

    public final long S(int i10, @dl.d yh.a<Long> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        int i11 = i(i10);
        if (i11 >= 0) {
            return this.f3579c[i11];
        }
        long jLongValue = defaultValue.invoke().longValue();
        c0(i10, jLongValue);
        return jLongValue;
    }

    public final void W(int i10) {
        e0(i10);
    }

    public final void X(@dl.d c0 keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        int[] iArr = keys.f3568a;
        int i10 = keys.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            e0(iArr[i11]);
        }
    }

    public final void Y(@dl.d i0 keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        int[] iArr = keys.f3625b;
        long[] jArr = keys.f3624a;
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
                        e0(iArr[(i10 << 3) + i12]);
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

    public final void Z(@dl.d int[] keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        for (int i10 : keys) {
            e0(i10);
        }
    }

    public final void a0(@dl.d e0 from) {
        kotlin.jvm.internal.f0.p(from, "from");
        d0(from);
    }

    public final long b0(int i10, long j10, long j11) {
        int iR = R(i10);
        if (iR < 0) {
            iR = ~iR;
        } else {
            j11 = this.f3579c[iR];
        }
        this.f3578b[iR] = i10;
        this.f3579c[iR] = j10;
        return j11;
    }

    public final void c0(int i10, long j10) {
        k0(i10, j10);
    }

    public final void d0(@dl.d e0 from) {
        kotlin.jvm.internal.f0.p(from, "from");
        int[] iArr = from.f3578b;
        long[] jArr = from.f3579c;
        long[] jArr2 = from.f3577a;
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
                        k0(iArr[i13], jArr[i13]);
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

    public final void e0(int i10) {
        int i11 = i(i10);
        if (i11 >= 0) {
            i0(i11);
        }
    }

    public final boolean f0(int i10, long j10) {
        int i11 = i(i10);
        if (i11 < 0 || this.f3579c[i11] != j10) {
            return false;
        }
        i0(i11);
        return true;
    }

    public final void h0(@dl.d yh.p<? super Integer, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3577a;
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
                        if (predicate.invoke(Integer.valueOf(this.f3578b[i13]), Long.valueOf(this.f3579c[i13])).booleanValue()) {
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
        this.f3581e--;
        long[] jArr = this.f3577a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f3580d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
    }

    public final void k0(int i10, long j10) {
        int iR = R(i10);
        if (iR < 0) {
            iR = ~iR;
        }
        this.f3578b[iR] = i10;
        this.f3579c[iR] = j10;
    }

    public final int l0() {
        int i10 = this.f3580d;
        int iX = h2.x(h2.z(this.f3581e));
        if (iX >= i10) {
            return 0;
        }
        j0(iX);
        return i10 - this.f3580d;
    }
}
