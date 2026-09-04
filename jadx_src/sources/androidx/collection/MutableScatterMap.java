package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1850:1\n1284#1,2:2019\n1288#1,5:2027\n1284#1,2:2058\n1288#1,5:2066\n1284#1,2:2083\n1288#1,5:2091\n1284#1,2:2097\n1288#1,5:2105\n1#2:1851\n1672#3,6:1852\n1826#3:1870\n1688#3:1874\n1605#3,3:1887\n1619#3:1891\n1615#3:1894\n1795#3,3:1899\n1809#3,3:1903\n1733#3:1907\n1721#3:1909\n1715#3:1910\n1728#3:1915\n1818#3:1917\n1605#3,3:1927\n1619#3:1931\n1615#3:1934\n1795#3,3:1939\n1809#3,3:1943\n1733#3:1947\n1721#3:1949\n1715#3:1950\n1728#3:1955\n1818#3:1957\n1826#3:1972\n1688#3:1976\n1826#3:1997\n1688#3:2001\n1672#3,6:2021\n1672#3,6:2032\n1605#3,3:2038\n1615#3:2041\n1619#3:2042\n1795#3,3:2043\n1809#3,3:2046\n1733#3:2049\n1721#3:2050\n1715#3:2051\n1728#3:2052\n1818#3:2053\n1682#3:2054\n1661#3:2055\n1680#3:2056\n1661#3:2057\n1672#3,6:2060\n1795#3,3:2071\n1826#3:2074\n1715#3:2075\n1685#3:2076\n1661#3:2077\n1605#3,3:2078\n1615#3:2081\n1619#3:2082\n1672#3,6:2085\n1661#3:2096\n1672#3,6:2099\n1672#3,6:2110\n1672#3,6:2116\n215#4,2:1858\n391#5,4:1860\n363#5,6:1864\n373#5,3:1871\n376#5,2:1875\n396#5,2:1877\n379#5,6:1879\n398#5:1885\n633#5:1886\n634#5:1890\n636#5,2:1892\n638#5,4:1895\n642#5:1902\n643#5:1906\n644#5:1908\n645#5,4:1911\n651#5:1916\n652#5,8:1918\n633#5:1926\n634#5:1930\n636#5,2:1932\n638#5,4:1935\n642#5:1942\n643#5:1946\n644#5:1948\n645#5,4:1951\n651#5:1956\n652#5,8:1958\n363#5,6:1966\n373#5,3:1973\n376#5,9:1977\n267#6,4:1986\n237#6,7:1990\n248#6,3:1998\n251#6,2:2002\n272#6,2:2004\n254#6,6:2006\n274#6:2012\n305#7,6:2013\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2019,2\n1113#1:2027,5\n1180#1:2058,2\n1180#1:2066,5\n1254#1:2083,2\n1254#1:2091,5\n1270#1:2097,2\n1270#1:2105,5\n848#1:1852,6\n972#1:1870\n972#1:1874\n1021#1:1887,3\n1021#1:1891\n1021#1:1894\n1021#1:1899,3\n1021#1:1903,3\n1021#1:1907\n1021#1:1909\n1021#1:1910\n1021#1:1915\n1021#1:1917\n1033#1:1927,3\n1033#1:1931\n1033#1:1934\n1033#1:1939,3\n1033#1:1943,3\n1033#1:1947\n1033#1:1949\n1033#1:1950\n1033#1:1955\n1033#1:1957\n1047#1:1972\n1047#1:1976\n1093#1:1997\n1093#1:2001\n1113#1:2021,6\n1129#1:2032,6\n1145#1:2038,3\n1146#1:2041\n1147#1:2042\n1154#1:2043,3\n1155#1:2046,3\n1156#1:2049\n1157#1:2050\n1157#1:2051\n1161#1:2052\n1164#1:2053\n1173#1:2054\n1173#1:2055\n1179#1:2056\n1179#1:2057\n1180#1:2060,6\n1195#1:2071,3\n1196#1:2074\n1198#1:2075\n1249#1:2076\n1249#1:2077\n1251#1:2078,3\n1252#1:2081\n1254#1:2082\n1254#1:2085,6\n1268#1:2096\n1270#1:2099,6\n1285#1:2110,6\n1291#1:2116,6\n963#1:1858,2\n972#1:1860,4\n972#1:1864,6\n972#1:1871,3\n972#1:1875,2\n972#1:1877,2\n972#1:1879,6\n972#1:1885\n1021#1:1886\n1021#1:1890\n1021#1:1892,2\n1021#1:1895,4\n1021#1:1902\n1021#1:1906\n1021#1:1908\n1021#1:1911,4\n1021#1:1916\n1021#1:1918,8\n1033#1:1926\n1033#1:1930\n1033#1:1932,2\n1033#1:1935,4\n1033#1:1942\n1033#1:1946\n1033#1:1948\n1033#1:1951,4\n1033#1:1956\n1033#1:1958,8\n1047#1:1966,6\n1047#1:1973,3\n1047#1:1977,9\n1093#1:1986,4\n1093#1:1990,7\n1093#1:1998,3\n1093#1:2002,2\n1093#1:2004,2\n1093#1:2006,6\n1093#1:2012\n1102#1:2013,6\n*E\n"})
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3423f;

    /* JADX INFO: compiled from: ScatterMap.kt */
    @kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1850:1\n215#2,2:1851\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1590#1:1851,2\n*E\n"})
    public final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, zh.g {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @dl.d
        public Set<Map.Entry<K, V>> a() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @dl.d
        public Set<K> b() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            MutableScatterMap.this.K();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @dl.d
        public Collection<V> d() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @dl.e
        public V put(K k10, V v10) {
            return MutableScatterMap.this.e0(k10, v10);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(@dl.d Map<? extends K, ? extends V> from) {
            kotlin.jvm.internal.f0.p(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @dl.e
        public V remove(Object obj) {
            return MutableScatterMap.this.k0(obj);
        }
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }

    public MutableScatterMap(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        R(h2.z(i10));
    }

    public /* synthetic */ MutableScatterMap(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void I() {
        if (this.f3490d <= 8 || Long.compare(kotlin.r1.h(kotlin.r1.h(this.f3491e) * 32) ^ Long.MIN_VALUE, kotlin.r1.h(kotlin.r1.h(this.f3490d) * 25) ^ Long.MIN_VALUE) > 0) {
            p0(h2.w(this.f3490d));
        } else {
            p0(this.f3490d);
        }
    }

    private final int M(int i10) {
        int i11 = this.f3490d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f3487a;
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

    private final void P() {
        this.f3423f = h2.o(q()) - this.f3491e;
    }

    private final void Q(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = h2.f3611e;
        } else {
            jArr = new long[((((i10 + 1) + 7) + 7) & (-8)) >> 3];
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f3487a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        P();
    }

    private final void R(int i10) {
        int iMax = i10 > 0 ? Math.max(7, h2.x(i10)) : 0;
        this.f3490d = iMax;
        Q(iMax);
        this.f3488b = new Object[iMax];
        this.f3489c = new Object[iMax];
    }

    private final void m0() {
        long[] jArr = this.f3487a;
        int i10 = this.f3490d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            if (((jArr[i13] >> i14) & 255) == 254) {
                long[] jArr2 = this.f3487a;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (128 << i14);
                int i15 = this.f3490d;
                int i16 = ((i12 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = (128 << i18) | ((~(255 << i18)) & jArr2[i17]);
                i11++;
            }
        }
        this.f3423f += i11;
    }

    private final void p0(int i10) {
        int i11;
        long[] jArr = this.f3487a;
        Object[] objArr = this.f3488b;
        Object[] objArr2 = this.f3489c;
        int i12 = this.f3490d;
        R(i10);
        Object[] objArr3 = this.f3488b;
        Object[] objArr4 = this.f3489c;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * h2.f3616j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iM = M(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.f3487a;
                int i15 = iM >> 3;
                int i16 = (iM & 7) << 3;
                i11 = i13;
                jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                int i17 = this.f3490d;
                int i18 = ((iM - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr2[i19] = (jArr2[i19] & (~(255 << i20))) | (j10 << i20);
                objArr3[iM] = obj;
                objArr4[iM] = objArr2[i11];
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    private final void s0(int i10, long j10) {
        long[] jArr = this.f3487a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f3490d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    @dl.d
    public final Map<K, V> J() {
        return new MutableMapWrapper();
    }

    public final void K() {
        this.f3491e = 0;
        long[] jArr = this.f3487a;
        if (jArr != h2.f3611e) {
            kotlin.collections.m.v2(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f3487a;
            int i10 = this.f3490d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        kotlin.collections.m.n2(this.f3489c, null, 0, this.f3490d);
        kotlin.collections.m.n2(this.f3488b, null, 0, this.f3490d);
        P();
    }

    public final V L(K k10, @dl.d yh.p<? super K, ? super V, ? extends V> computeBlock) {
        kotlin.jvm.internal.f0.p(computeBlock, "computeBlock");
        int iN = N(k10);
        boolean z10 = iN < 0;
        V vInvoke = computeBlock.invoke(k10, z10 ? null : this.f3489c[iN]);
        if (z10) {
            int i10 = ~iN;
            this.f3488b[i10] = k10;
            this.f3489c[i10] = vInvoke;
        } else {
            this.f3489c[iN] = vInvoke;
        }
        return vInvoke;
    }

    @kotlin.r0
    public final int N(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f3490d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f3487a;
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
                    if (kotlin.jvm.internal.f0.g(this.f3488b[iNumberOfTrailingZeros], k10)) {
                        return iNumberOfTrailingZeros;
                    }
                    j13 &= j13 - 1;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM = M(i11);
                if (this.f3423f == 0) {
                    if (!(((this.f3487a[iM >> 3] >> ((iM & 7) << 3)) & 255) == 254)) {
                        I();
                        iM = M(i11);
                    }
                }
                this.f3491e++;
                int i19 = this.f3423f;
                long[] jArr2 = this.f3487a;
                int i20 = iM >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM & 7) << 3;
                this.f3423f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                jArr2[i20] = (j14 & (~(255 << i21))) | (j11 << i21);
                int i22 = this.f3490d;
                int i23 = ((iM - 7) & i22) + (i22 & 7);
                int i24 = i23 >> 3;
                int i25 = (i23 & 7) << 3;
                jArr2[i24] = ((~(255 << i25)) & jArr2[i24]) | (j11 << i25);
                return ~iM;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final V O(K k10, @dl.d yh.a<? extends V> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        V vP = p(k10);
        if (vP != null) {
            return vP;
        }
        V vInvoke = defaultValue.invoke();
        q0(k10, vInvoke);
        return vInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(@dl.d ObjectList<K> keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        Object[] objArr = keys.f3484a;
        int i10 = keys.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            k0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(@dl.d ScatterSet<K> keys) {
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
                        k0(objArr[(i10 << 3) + i12]);
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

    public final void U(@dl.d Iterable<? extends K> keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            k0(it.next());
        }
    }

    public final void V(K k10) {
        k0(k10);
    }

    public final void W(@dl.d kotlin.sequences.m<? extends K> keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            k0(it.next());
        }
    }

    public final void X(@dl.d K[] keys) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        for (K k10 : keys) {
            k0(k10);
        }
    }

    public final void Y(@dl.d ScatterMap<K, V> from) {
        kotlin.jvm.internal.f0.p(from, "from");
        f0(from);
    }

    public final void Z(@dl.d Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        g0(pairs);
    }

    public final void a0(@dl.d Map<K, ? extends V> from) {
        kotlin.jvm.internal.f0.p(from, "from");
        h0(from);
    }

    public final void b0(@dl.d Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.f0.p(pair, "pair");
        q0(pair.e(), pair.f());
    }

    public final void c0(@dl.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        i0(pairs);
    }

    public final void d0(@dl.d Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        j0(pairs);
    }

    @dl.e
    public final V e0(K k10, V v10) {
        int iN = N(k10);
        if (iN < 0) {
            iN = ~iN;
        }
        Object[] objArr = this.f3489c;
        V v11 = (V) objArr[iN];
        this.f3488b[iN] = k10;
        objArr[iN] = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(@dl.d ScatterMap<K, V> from) {
        kotlin.jvm.internal.f0.p(from, "from");
        Object[] objArr = from.f3488b;
        Object[] objArr2 = from.f3489c;
        long[] jArr = from.f3487a;
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
                        q0(objArr[i13], objArr2[i13]);
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

    public final void g0(@dl.d Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.a(), pair.b());
        }
    }

    public final void h0(@dl.d Map<K, ? extends V> from) {
        kotlin.jvm.internal.f0.p(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            q0(entry.getKey(), entry.getValue());
        }
    }

    public final void i0(@dl.d kotlin.sequences.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.a(), pair.b());
        }
    }

    public final void j0(@dl.d Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            q0(pair.a(), pair.b());
        }
    }

    @dl.e
    public final V k0(K k10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f3490d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3487a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(this.f3488b[iNumberOfTrailingZeros], k10)) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return o0(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final boolean l0(K k10, V v10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * h2.f3616j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f3490d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f3487a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * h2.f3617k) ^ j10;
            long j12 = (~j11) & (j11 - h2.f3617k) & (-9187201950435737472L);
            while (true) {
                if (j12 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                    if (kotlin.jvm.internal.f0.g(this.f3488b[iNumberOfTrailingZeros], k10)) {
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
        if (iNumberOfTrailingZeros < 0 || !kotlin.jvm.internal.f0.g(this.f3489c[iNumberOfTrailingZeros], v10)) {
            return false;
        }
        o0(iNumberOfTrailingZeros);
        return true;
    }

    public final void n0(@dl.d yh.p<? super K, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        long[] jArr = this.f3487a;
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
                        if (predicate.invoke(this.f3488b[i13], this.f3489c[i13]).booleanValue()) {
                            o0(i13);
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
    @dl.e
    public final V o0(int i10) {
        this.f3491e--;
        long[] jArr = this.f3487a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        int i13 = this.f3490d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        this.f3488b[i10] = null;
        Object[] objArr = this.f3489c;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void q0(K k10, V v10) {
        int iN = N(k10);
        if (iN < 0) {
            iN = ~iN;
        }
        this.f3488b[iN] = k10;
        this.f3489c[iN] = v10;
    }

    public final int r0() {
        int i10 = this.f3490d;
        int iX = h2.x(h2.z(this.f3491e));
        if (iX >= i10) {
            return 0;
        }
        p0(iX);
        return i10 - this.f3490d;
    }
}
