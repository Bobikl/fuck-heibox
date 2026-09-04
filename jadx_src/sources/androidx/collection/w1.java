package androidx.collection;

import java.util.Iterator;

/* JADX INFO: compiled from: ObjectIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nObjectIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1074:1\n1064#1,2:1155\n1068#1,5:1163\n1064#1,2:1194\n1068#1,5:1202\n1064#1,2:1219\n1068#1,5:1227\n1064#1,2:1233\n1068#1,5:1241\n1#2:1075\n1672#3,6:1076\n1826#3:1092\n1688#3:1096\n1826#3:1114\n1688#3:1118\n1826#3:1139\n1688#3:1143\n1672#3,6:1157\n1672#3,6:1168\n1605#3,3:1174\n1615#3:1177\n1619#3:1178\n1795#3,3:1179\n1809#3,3:1182\n1733#3:1185\n1721#3:1186\n1715#3:1187\n1728#3:1188\n1818#3:1189\n1682#3:1190\n1661#3:1191\n1680#3:1192\n1661#3:1193\n1672#3,6:1196\n1795#3,3:1207\n1826#3:1210\n1715#3:1211\n1685#3:1212\n1661#3:1213\n1605#3,3:1214\n1615#3:1217\n1619#3:1218\n1672#3,6:1221\n1661#3:1232\n1672#3,6:1235\n1672#3,6:1246\n1672#3,6:1252\n401#4,4:1082\n373#4,6:1086\n383#4,3:1093\n386#4,2:1097\n406#4,2:1099\n389#4,6:1101\n408#4:1107\n373#4,6:1108\n383#4,3:1115\n386#4,9:1119\n267#5,4:1128\n237#5,7:1132\n248#5,3:1140\n251#5,2:1144\n272#5,2:1146\n254#5,6:1148\n274#5:1154\n*S KotlinDebug\n*F\n+ 1 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n*L\n900#1:1155,2\n900#1:1163,5\n960#1:1194,2\n960#1:1202,5\n1034#1:1219,2\n1034#1:1227,5\n1050#1:1233,2\n1050#1:1241,5\n728#1:1076,6\n804#1:1092\n804#1:1096\n843#1:1114\n843#1:1118\n889#1:1139\n889#1:1143\n900#1:1157,6\n911#1:1168,6\n925#1:1174,3\n926#1:1177\n927#1:1178\n934#1:1179,3\n935#1:1182,3\n936#1:1185\n937#1:1186\n937#1:1187\n941#1:1188\n944#1:1189\n953#1:1190\n953#1:1191\n959#1:1192\n959#1:1193\n960#1:1196,6\n975#1:1207,3\n976#1:1210\n978#1:1211\n1029#1:1212\n1029#1:1213\n1031#1:1214,3\n1032#1:1217\n1034#1:1218\n1034#1:1221,6\n1048#1:1232\n1050#1:1235,6\n1065#1:1246,6\n1071#1:1252,6\n804#1:1082,4\n804#1:1086,6\n804#1:1093,3\n804#1:1097,2\n804#1:1099,2\n804#1:1101,6\n804#1:1107\n843#1:1108,6\n843#1:1115,3\n843#1:1119,9\n889#1:1128,4\n889#1:1132,7\n889#1:1140,3\n889#1:1144,2\n889#1:1146,2\n889#1:1148,6\n889#1:1154\n*E\n"})
public final class w1<K> extends b2<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3728f;

    public w1() {
        this(0, 1, null);
    }

    public w1(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        V(h2.z(i10));
    }

    public /* synthetic */ w1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void O() {
        if (this.f3562d <= 8 || Long.compare(kotlin.r1.h(kotlin.r1.h(this.f3563e) * 32) ^ Long.MIN_VALUE, kotlin.r1.h(kotlin.r1.h(this.f3562d) * 25) ^ Long.MIN_VALUE) > 0) {
            k0(h2.w(this.f3562d));
        } else {
            h0();
        }
    }

    private final int Q(int i10) {
        int i11 = this.f3562d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f3559a;
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

    private final int R(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f3562d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f3559a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * h2.f3617k);
            long j13 = (~j12) & (j12 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j13 != 0) {
                    int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                    if (kotlin.jvm.internal.f0.g(this.f3560b[iNumberOfTrailingZeros], k10)) {
                        return iNumberOfTrailingZeros;
                    }
                    j13 &= j13 - 1;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iQ = Q(i11);
                if (this.f3728f == 0) {
                    if (!(((this.f3559a[iQ >> 3] >> ((iQ & 7) << 3)) & 255) == 254)) {
                        O();
                        iQ = Q(i11);
                    }
                }
                this.f3563e++;
                int i19 = this.f3728f;
                long[] jArr2 = this.f3559a;
                int i20 = iQ >> 3;
                long j14 = jArr2[i20];
                int i21 = (iQ & 7) << 3;
                this.f3728f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                jArr2[i20] = (j14 & (~(255 << i21))) | (j11 << i21);
                int i22 = this.f3562d;
                int i23 = ((iQ - 7) & i22) + (i22 & 7);
                int i24 = i23 >> 3;
                int i25 = (i23 & 7) << 3;
                jArr2[i24] = ((~(255 << i25)) & jArr2[i24]) | (j11 << i25);
                return ~iQ;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void T() {
        this.f3728f = h2.o(o()) - this.f3563e;
    }

    private final void U(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = h2.f3611e;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f3559a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        T();
    }

    private final void V(int i10) {
        int iMax = i10 > 0 ? Math.max(7, h2.x(i10)) : 0;
        this.f3562d = iMax;
        U(iMax);
        this.f3560b = new Object[iMax];
        this.f3561c = new int[iMax];
    }

    private final void h0() {
        long[] jArr = this.f3559a;
        int i10 = this.f3562d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            if (((jArr[i13] >> i14) & 255) == 254) {
                long[] jArr2 = this.f3559a;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (128 << i14);
                int i15 = this.f3562d;
                int i16 = ((i12 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = (128 << i18) | ((~(255 << i18)) & jArr2[i17]);
                i11++;
            }
        }
        this.f3728f += i11;
    }

    private final void k0(int i10) {
        int i11;
        long[] jArr = this.f3559a;
        Object[] objArr = this.f3560b;
        int[] iArr = this.f3561c;
        int i12 = this.f3562d;
        V(i10);
        Object[] objArr2 = this.f3560b;
        int[] iArr2 = this.f3561c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * h2.f3616j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iQ = Q(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.f3559a;
                int i15 = iQ >> 3;
                int i16 = (iQ & 7) << 3;
                i11 = i13;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this.f3562d;
                int i18 = ((iQ - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr2[i19] = (jArr2[i19] & (~(255 << i20))) | (j10 << i20);
                objArr2[iQ] = obj;
                iArr2[iQ] = iArr[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    private final void n0(int i10, long j10) {
        long[] jArr = this.f3559a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f3562d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public final void P() {
        this.f3563e = 0;
        long[] jArr = this.f3559a;
        if (jArr != h2.f3611e) {
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f3559a;
            int i10 = this.f3562d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        kotlin.collections.m.n2(this.f3560b, null, 0, this.f3562d);
        T();
    }

    public final int S(K k10, @dl.d yh.a<Integer> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        int i10 = i(k10);
        if (i10 >= 0) {
            return this.f3561c[i10];
        }
        int iIntValue = defaultValue.invoke().intValue();
        l0(k10, iIntValue);
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(@dl.d ScatterSet<K> keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        Object[] objArr = keys.f3527b;
        long[] jArr = keys.f3526a;
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
                        f0(objArr[(i10 << 3) + i12]);
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

    public final void X(@dl.d Iterable<? extends K> keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            f0(it.next());
        }
    }

    public final void Y(K k10) {
        f0(k10);
    }

    public final void Z(@dl.d kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            f0(it.next());
        }
    }

    public final void a0(@dl.d K[] keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        for (K k10 : keys) {
            f0(k10);
        }
    }

    public final void b0(@dl.d b2<K> from) {
        kotlin.jvm.internal.f0.p(from, "from");
        e0(from);
    }

    public final int c0(K k10, int i10, int i11) {
        int iR = R(k10);
        if (iR < 0) {
            iR = ~iR;
        } else {
            i11 = this.f3561c[iR];
        }
        this.f3560b[iR] = k10;
        this.f3561c[iR] = i10;
        return i11;
    }

    public final void d0(K k10, int i10) {
        l0(k10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(@dl.d b2<K> from) {
        kotlin.jvm.internal.f0.p(from, "from");
        Object[] objArr = from.f3560b;
        int[] iArr = from.f3561c;
        long[] jArr = from.f3559a;
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
                        l0(objArr[i13], iArr[i13]);
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

    public final void f0(K k10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            j0(i10);
        }
    }

    public final boolean g0(K k10, int i10) {
        int i11 = i(k10);
        if (i11 < 0 || this.f3561c[i11] != i10) {
            return false;
        }
        j0(i11);
        return true;
    }

    public final void i0(@dl.d yh.p<? super K, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3559a;
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
                        if (predicate.invoke(this.f3560b[i13], Integer.valueOf(this.f3561c[i13])).booleanValue()) {
                            j0(i13);
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
    public final void j0(int i10) {
        this.f3563e--;
        long[] jArr = this.f3559a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f3562d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f3560b[i10] = null;
    }

    public final void l0(K k10, int i10) {
        int iR = R(k10);
        if (iR < 0) {
            iR = ~iR;
        }
        this.f3560b[iR] = k10;
        this.f3561c[iR] = i10;
    }

    public final int m0() {
        int i10 = this.f3562d;
        int iX = h2.x(h2.z(this.f3563e));
        if (iX >= i10) {
            return 0;
        }
        k0(iX);
        return i10 - this.f3562d;
    }
}
