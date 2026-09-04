package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1100:1\n1018#1,2:1285\n1022#1,5:1293\n1018#1,2:1324\n1022#1,5:1332\n1018#1,2:1349\n1022#1,5:1357\n1018#1,2:1363\n1022#1,5:1371\n1#2:1101\n1672#3,6:1102\n1826#3:1125\n1688#3:1129\n1605#3,3:1148\n1619#3:1152\n1615#3:1155\n1795#3,3:1159\n1809#3,3:1163\n1733#3:1167\n1721#3:1169\n1715#3:1170\n1728#3:1175\n1818#3:1177\n1605#3,3:1187\n1619#3:1191\n1615#3:1194\n1795#3,3:1198\n1809#3,3:1202\n1733#3:1206\n1721#3:1208\n1715#3:1209\n1728#3:1214\n1818#3:1216\n1826#3:1242\n1688#3:1246\n1826#3:1271\n1688#3:1275\n1672#3,6:1287\n1672#3,6:1298\n1605#3,3:1304\n1615#3:1307\n1619#3:1308\n1795#3,3:1309\n1809#3,3:1312\n1733#3:1315\n1721#3:1316\n1715#3:1317\n1728#3:1318\n1818#3:1319\n1682#3:1320\n1661#3:1321\n1680#3:1322\n1661#3:1323\n1672#3,6:1326\n1795#3,3:1337\n1826#3:1340\n1715#3:1341\n1685#3:1342\n1661#3:1343\n1605#3,3:1344\n1615#3:1347\n1619#3:1348\n1672#3,6:1351\n1661#3:1362\n1672#3,6:1365\n1672#3,6:1376\n1672#3,6:1382\n13579#4,2:1108\n13579#4,2:1225\n1855#5,2:1110\n1855#5,2:1229\n1295#6,2:1112\n1295#6,2:1227\n267#7,4:1114\n237#7,7:1118\n248#7,3:1126\n251#7,2:1130\n272#7,2:1132\n254#7,6:1134\n274#7:1140\n433#7:1147\n434#7:1151\n436#7,2:1153\n438#7,3:1156\n441#7:1162\n442#7:1166\n443#7:1168\n444#7,4:1171\n450#7:1176\n451#7,8:1178\n433#7:1186\n434#7:1190\n436#7,2:1192\n438#7,3:1195\n441#7:1201\n442#7:1205\n443#7:1207\n444#7,4:1210\n450#7:1215\n451#7,8:1217\n267#7,4:1231\n237#7,7:1235\n248#7,3:1243\n251#7,2:1247\n272#7,2:1249\n254#7,6:1251\n274#7:1257\n237#7,7:1264\n248#7,3:1272\n251#7,9:1276\n305#8,6:1141\n305#8,6:1258\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n857#1:1285,2\n857#1:1293,5\n917#1:1324,2\n917#1:1332,5\n989#1:1349,2\n989#1:1357,5\n1004#1:1363,2\n1004#1:1371,5\n567#1:1102,6\n692#1:1125\n692#1:1129\n714#1:1148,3\n714#1:1152\n714#1:1155\n714#1:1159,3\n714#1:1163,3\n714#1:1167\n714#1:1169\n714#1:1170\n714#1:1175\n714#1:1177\n727#1:1187,3\n727#1:1191\n727#1:1194\n727#1:1198,3\n727#1:1202,3\n727#1:1206\n727#1:1208\n727#1:1209\n727#1:1214\n727#1:1216\n823#1:1242\n823#1:1246\n843#1:1271\n843#1:1275\n857#1:1287,6\n868#1:1298,6\n882#1:1304,3\n883#1:1307\n884#1:1308\n891#1:1309,3\n892#1:1312,3\n893#1:1315\n894#1:1316\n894#1:1317\n898#1:1318\n901#1:1319\n910#1:1320\n910#1:1321\n916#1:1322\n916#1:1323\n917#1:1326,6\n931#1:1337,3\n932#1:1340\n934#1:1341\n984#1:1342\n984#1:1343\n986#1:1344,3\n987#1:1347\n989#1:1348\n989#1:1351,6\n1002#1:1362\n1004#1:1365,6\n1019#1:1376,6\n1025#1:1382,6\n662#1:1108,2\n793#1:1225,2\n672#1:1110,2\n813#1:1229,2\n682#1:1112,2\n803#1:1227,2\n692#1:1114,4\n692#1:1118,7\n692#1:1126,3\n692#1:1130,2\n692#1:1132,2\n692#1:1134,6\n692#1:1140\n714#1:1147\n714#1:1151\n714#1:1153,2\n714#1:1156,3\n714#1:1162\n714#1:1166\n714#1:1168\n714#1:1171,4\n714#1:1176\n714#1:1178,8\n727#1:1186\n727#1:1190\n727#1:1192,2\n727#1:1195,3\n727#1:1201\n727#1:1205\n727#1:1207\n727#1:1210,4\n727#1:1215\n727#1:1217,8\n823#1:1231,4\n823#1:1235,7\n823#1:1243,3\n823#1:1247,2\n823#1:1249,2\n823#1:1251,6\n823#1:1257\n843#1:1264,7\n843#1:1272,3\n843#1:1276,9\n702#1:1141,6\n833#1:1258,6\n*E\n"})
public final class MutableScatterSet<E> extends ScatterSet<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3467e;

    /* JADX INFO: compiled from: ScatterSet.kt */
    @kotlin.jvm.internal.t0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1100:1\n237#2,7:1101\n248#2,3:1109\n251#2,9:1113\n1826#3:1108\n1688#3:1112\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n*L\n1080#1:1101,7\n1080#1:1109,3\n1080#1:1113,9\n1080#1:1108\n1080#1:1112\n*E\n"})
    public final class MutableSetWrapper extends ScatterSet<E>.SetWrapper implements Set<E>, zh.h {
        public MutableSetWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean add(E e10) {
            return MutableScatterSet.this.C(e10);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean addAll(@dl.d Collection<? extends E> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            return MutableScatterSet.this.F(elements);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public void clear() {
            MutableScatterSet.this.K();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
        @dl.d
        public Iterator<E> iterator() {
            return new MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet.this);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return MutableScatterSet.this.c0(obj);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean removeAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            int iQ = MutableScatterSet.this.q();
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                MutableScatterSet.this.T((E) it.next());
            }
            return iQ != MutableScatterSet.this.q();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean retainAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            MutableScatterSet<E> mutableScatterSet = MutableScatterSet.this;
            long[] jArr = mutableScatterSet.f3526a;
            int length = jArr.length - 2;
            boolean z10 = false;
            if (length >= 0) {
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                if (!elements.contains(mutableScatterSet.f3527b[i13])) {
                                    mutableScatterSet.j0(i13);
                                    z11 = true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            return z11;
                        }
                    }
                    if (i10 != length) {
                        i10++;
                    } else {
                        z10 = z11;
                    }
                }
            }
            return z10;
        }
    }

    public MutableScatterSet() {
        this(0, 1, null);
    }

    public MutableScatterSet(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        P(h2.z(i10));
    }

    public /* synthetic */ MutableScatterSet(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void I() {
        if (this.f3528c <= 8 || Long.compare(kotlin.r1.h(kotlin.r1.h(this.f3529d) * 32) ^ Long.MIN_VALUE, kotlin.r1.h(kotlin.r1.h(this.f3528c) * 25) ^ Long.MIN_VALUE) > 0) {
            l0(h2.w(this.f3528c));
        } else {
            i0();
        }
    }

    private final int L(E e10) {
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f3528c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f3526a;
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
                    if (kotlin.jvm.internal.f0.g(this.f3527b[iNumberOfTrailingZeros], e10)) {
                        return iNumberOfTrailingZeros;
                    }
                    j13 &= j13 - 1;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM = M(i11);
                if (this.f3467e == 0) {
                    if (!(((this.f3526a[iM >> 3] >> ((iM & 7) << 3)) & 255) == 254)) {
                        I();
                        iM = M(i11);
                    }
                }
                this.f3529d++;
                int i19 = this.f3467e;
                long[] jArr2 = this.f3526a;
                int i20 = iM >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM & 7) << 3;
                this.f3467e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                jArr2[i20] = (j14 & (~(255 << i21))) | (j11 << i21);
                int i22 = this.f3528c;
                int i23 = ((iM - 7) & i22) + (i22 & 7);
                int i24 = i23 >> 3;
                int i25 = (i23 & 7) << 3;
                jArr2[i24] = ((~(255 << i25)) & jArr2[i24]) | (j11 << i25);
                return iM;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int M(int i10) {
        int i11 = this.f3528c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f3526a;
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
        this.f3467e = h2.o(n()) - this.f3529d;
    }

    private final void O(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = h2.f3611e;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f3526a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        N();
    }

    private final void P(int i10) {
        int iMax = i10 > 0 ? Math.max(7, h2.x(i10)) : 0;
        this.f3528c = iMax;
        O(iMax);
        this.f3527b = new Object[iMax];
    }

    private final void i0() {
        long[] jArr = this.f3526a;
        int i10 = this.f3528c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            if (((jArr[i13] >> i14) & 255) == 254) {
                long[] jArr2 = this.f3526a;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (128 << i14);
                int i15 = this.f3528c;
                int i16 = ((i12 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = (128 << i18) | ((~(255 << i18)) & jArr2[i17]);
                i11++;
            }
        }
        this.f3467e += i11;
    }

    private final void l0(int i10) {
        long[] jArr = this.f3526a;
        Object[] objArr = this.f3527b;
        int i11 = this.f3528c;
        P(i10);
        Object[] objArr2 = this.f3527b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i12];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * h2.f3616j;
                int i13 = iHashCode ^ (iHashCode << 16);
                int iM = M(i13 >>> 7);
                long j10 = i13 & 127;
                long[] jArr2 = this.f3526a;
                int i14 = iM >> 3;
                int i15 = (iM & 7) << 3;
                jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (j10 << i15);
                int i16 = this.f3528c;
                int i17 = ((iM - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (j10 << i19);
                objArr2[iM] = obj;
            }
        }
    }

    private final void n0(int i10, long j10) {
        long[] jArr = this.f3526a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f3528c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public final boolean C(E e10) {
        int iQ = q();
        this.f3527b[L(e10)] = e10;
        return q() != iQ;
    }

    public final boolean D(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        W(elements);
        return iQ != q();
    }

    public final boolean E(@dl.d ScatterSet<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        X(elements);
        return iQ != q();
    }

    public final boolean F(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        Y(elements);
        return iQ != q();
    }

    public final boolean G(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        a0(elements);
        return iQ != q();
    }

    public final boolean H(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        b0(elements);
        return iQ != q();
    }

    @dl.d
    public final Set<E> J() {
        return new MutableSetWrapper();
    }

    public final void K() {
        this.f3529d = 0;
        long[] jArr = this.f3526a;
        if (jArr != h2.f3611e) {
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f3526a;
            int i10 = this.f3528c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        kotlin.collections.m.n2(this.f3527b, null, 0, this.f3528c);
        N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Object[] objArr = elements.f3484a;
        int i10 = elements.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            T(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(@dl.d ScatterSet<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Object[] objArr = elements.f3527b;
        long[] jArr = elements.f3526a;
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
                        T(objArr[(i10 << 3) + i12]);
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

    public final void S(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            T(it.next());
        }
    }

    public final void T(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f3528c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3526a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(this.f3527b[iNumberOfTrailingZeros], e10)) {
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
                i14 += 8;
                i13 = (i13 + i14) & i12;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            j0(iNumberOfTrailingZeros);
        }
    }

    public final void U(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            T(it.next());
        }
    }

    public final void V(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (E e10 : elements) {
            T(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Object[] objArr = elements.f3484a;
        int i10 = elements.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            Z(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(@dl.d ScatterSet<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Object[] objArr = elements.f3527b;
        long[] jArr = elements.f3526a;
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
                        Z(objArr[(i10 << 3) + i12]);
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

    public final void Y(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }

    public final void Z(E e10) {
        this.f3527b[L(e10)] = e10;
    }

    public final void a0(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }

    public final void b0(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (E e10 : elements) {
            Z(e10);
        }
    }

    public final boolean c0(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f3528c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3526a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(this.f3527b[iNumberOfTrailingZeros], e10)) {
                        break loop0;
                    }
                    j12 &= j12 - 1;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            j0(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final boolean d0(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        Q(elements);
        return iQ != q();
    }

    public final boolean e0(@dl.d ScatterSet<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        R(elements);
        return iQ != q();
    }

    public final boolean f0(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        S(elements);
        return iQ != q();
    }

    public final boolean g0(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        U(elements);
        return iQ != q();
    }

    public final boolean h0(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int iQ = q();
        V(elements);
        return iQ != q();
    }

    @kotlin.r0
    public final void j0(int i10) {
        this.f3529d--;
        long[] jArr = this.f3526a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f3528c;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f3527b[i10] = null;
    }

    public final void k0(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3527b;
        long[] jArr = this.f3526a;
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
                        if (predicate.invoke(objArr[i13]).booleanValue()) {
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

    @androidx.annotation.f0(from = 0)
    public final int m0() {
        int i10 = this.f3528c;
        int iX = h2.x(h2.z(this.f3529d));
        if (iX >= i10) {
            return 0;
        }
        l0(iX);
        return i10 - this.f3528c;
    }
}
