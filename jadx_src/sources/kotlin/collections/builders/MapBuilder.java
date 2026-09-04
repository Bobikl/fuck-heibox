package kotlin.collections.builders;

import fi.l;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.k0;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import zh.g;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final a f124583n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    private static final int f124584o = -1640531527;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    private static final int f124585p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    private static final int f124586q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    private static final int f124587r = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private K[] f124588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private V[] f124589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private int[] f124590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private int[] f124591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f124592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f124593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f124594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f124595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private nh.d<K> f124596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private nh.e<V> f124597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private nh.c<K, V> f124598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f124599m;

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(fi.u.u(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, zh.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d MapBuilder<K, V> map) {
            super(map);
            f0.p(map, "map");
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            if (a() >= ((MapBuilder) c()).f124593g) {
                throw new NoSuchElementException();
            }
            int iA = a();
            e(iA + 1);
            g(iA);
            c<K, V> cVar = new c<>(c(), b());
            d();
            return cVar;
        }

        public final void i(@dl.d StringBuilder sb2) {
            f0.p(sb2, "sb");
            if (a() >= ((MapBuilder) c()).f124593g) {
                throw new NoSuchElementException();
            }
            int iA = a();
            e(iA + 1);
            g(iA);
            Object obj = ((MapBuilder) c()).f124588b[b()];
            if (f0.g(obj, c())) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append(n5.a.f132013h);
            Object[] objArr = ((MapBuilder) c()).f124589c;
            f0.m(objArr);
            Object obj2 = objArr[b()];
            if (f0.g(obj2, c())) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            d();
        }

        public final int j() {
            if (a() >= ((MapBuilder) c()).f124593g) {
                throw new NoSuchElementException();
            }
            int iA = a();
            e(iA + 1);
            g(iA);
            Object obj = ((MapBuilder) c()).f124588b[b()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) c()).f124589c;
            f0.m(objArr);
            Object obj2 = objArr[b()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            d();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V>, g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final MapBuilder<K, V> f124600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f124601c;

        public c(@dl.d MapBuilder<K, V> map, int i10) {
            f0.p(map, "map");
            this.f124600b = map;
            this.f124601c = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@dl.e Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (f0.g(entry.getKey(), getKey()) && f0.g(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((MapBuilder) this.f124600b).f124588b[this.f124601c];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((MapBuilder) this.f124600b).f124589c;
            f0.m(objArr);
            return (V) objArr[this.f124601c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            this.f124600b.l();
            Object[] objArrI = this.f124600b.i();
            int i10 = this.f124601c;
            V v11 = (V) objArrI[i10];
            objArrI[i10] = v10;
            return v11;
        }

        @dl.d
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append(n5.a.f132013h);
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static class d<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final MapBuilder<K, V> f124602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f124603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f124604d;

        public d(@dl.d MapBuilder<K, V> map) {
            f0.p(map, "map");
            this.f124602b = map;
            this.f124604d = -1;
            d();
        }

        public final int a() {
            return this.f124603c;
        }

        public final int b() {
            return this.f124604d;
        }

        @dl.d
        public final MapBuilder<K, V> c() {
            return this.f124602b;
        }

        public final void d() {
            while (this.f124603c < ((MapBuilder) this.f124602b).f124593g) {
                int[] iArr = ((MapBuilder) this.f124602b).f124590d;
                int i10 = this.f124603c;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f124603c = i10 + 1;
                }
            }
        }

        public final void e(int i10) {
            this.f124603c = i10;
        }

        public final void g(int i10) {
            this.f124604d = i10;
        }

        public final boolean hasNext() {
            return this.f124603c < ((MapBuilder) this.f124602b).f124593g;
        }

        public final void remove() {
            if (!(this.f124604d != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f124602b.l();
            this.f124602b.T(this.f124604d);
            this.f124604d = -1;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, zh.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@dl.d MapBuilder<K, V> map) {
            super(map);
            f0.p(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (a() >= ((MapBuilder) c()).f124593g) {
                throw new NoSuchElementException();
            }
            int iA = a();
            e(iA + 1);
            g(iA);
            K k10 = (K) ((MapBuilder) c()).f124588b[b()];
            d();
            return k10;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, zh.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@dl.d MapBuilder<K, V> map) {
            super(map);
            f0.p(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (a() >= ((MapBuilder) c()).f124593g) {
                throw new NoSuchElementException();
            }
            int iA = a();
            e(iA + 1);
            g(iA);
            Object[] objArr = ((MapBuilder) c()).f124589c;
            f0.m(objArr);
            V v10 = (V) objArr[b()];
            d();
            return v10;
        }
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        this(nh.b.d(i10), null, new int[i10], new int[f124583n.c(i10)], 2, 0);
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f124588b = kArr;
        this.f124589c = vArr;
        this.f124590d = iArr;
        this.f124591e = iArr2;
        this.f124592f = i10;
        this.f124593g = i11;
        this.f124594h = f124583n.d(C());
    }

    private final int A() {
        return this.f124588b.length;
    }

    private final int C() {
        return this.f124591e.length;
    }

    private final int G(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * f124584o) >>> this.f124594h;
    }

    private final boolean J(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        w(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (K(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean K(Map.Entry<? extends K, ? extends V> entry) {
        int iH = h(entry.getKey());
        V[] vArrI = i();
        if (iH >= 0) {
            vArrI[iH] = entry.getValue();
            return true;
        }
        int i10 = (-iH) - 1;
        if (f0.g(entry.getValue(), vArrI[i10])) {
            return false;
        }
        vArrI[i10] = entry.getValue();
        return true;
    }

    private final boolean L(int i10) {
        int iG = G(this.f124588b[i10]);
        int i11 = this.f124592f;
        while (true) {
            int[] iArr = this.f124591e;
            if (iArr[iG] == 0) {
                iArr[iG] = i10 + 1;
                this.f124590d[i10] = iG;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iG = iG == 0 ? C() - 1 : iG - 1;
        }
    }

    private final void M(int i10) {
        if (this.f124593g > size()) {
            n();
        }
        int i11 = 0;
        if (i10 != C()) {
            this.f124591e = new int[i10];
            this.f124594h = f124583n.d(i10);
        } else {
            m.l2(this.f124591e, 0, 0, C());
        }
        while (i11 < this.f124593g) {
            int i12 = i11 + 1;
            if (!L(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    private final void O(int i10) {
        int iB = fi.u.B(this.f124592f * 2, C() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? C() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f124592f) {
                this.f124591e[i12] = 0;
                return;
            }
            int[] iArr = this.f124591e;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((G(this.f124588b[i14]) - i10) & (C() - 1)) >= i11) {
                    this.f124591e[i12] = i13;
                    this.f124590d[i14] = i12;
                }
                iB--;
            }
            i12 = i10;
            i11 = 0;
            iB--;
        } while (iB >= 0);
        this.f124591e[i12] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(int i10) {
        nh.b.f(this.f124588b, i10);
        O(this.f124590d[i10]);
        this.f124590d[i10] = -1;
        this.f124595i = size() - 1;
    }

    private final Object W() throws NotSerializableException {
        if (this.f124599m) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] i() {
        V[] vArr = this.f124589c;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) nh.b.d(A());
        this.f124589c = vArr2;
        return vArr2;
    }

    private final void n() {
        int i10;
        V[] vArr = this.f124589c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f124593g;
            if (i11 >= i10) {
                break;
            }
            if (this.f124590d[i11] >= 0) {
                K[] kArr = this.f124588b;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        nh.b.g(this.f124588b, i12, i10);
        if (vArr != null) {
            nh.b.g(vArr, i12, this.f124593g);
        }
        this.f124593g = i12;
    }

    private final boolean u(Map<?, ?> map) {
        return size() == map.size() && p(map.entrySet());
    }

    private final void v(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 <= A()) {
            if ((this.f124593g + i10) - size() > A()) {
                M(C());
                return;
            }
            return;
        }
        int iA = (A() * 3) / 2;
        if (i10 <= iA) {
            i10 = iA;
        }
        this.f124588b = (K[]) nh.b.e(this.f124588b, i10);
        V[] vArr = this.f124589c;
        this.f124589c = vArr != null ? (V[]) nh.b.e(vArr, i10) : null;
        int[] iArrCopyOf = Arrays.copyOf(this.f124590d, i10);
        f0.o(iArrCopyOf, "copyOf(this, newSize)");
        this.f124590d = iArrCopyOf;
        int iC = f124583n.c(i10);
        if (iC > C()) {
            M(iC);
        }
    }

    private final void w(int i10) {
        v(this.f124593g + i10);
    }

    private final int y(K k10) {
        int iG = G(k10);
        int i10 = this.f124592f;
        while (true) {
            int i11 = this.f124591e[iG];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (f0.g(this.f124588b[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iG = iG == 0 ? C() - 1 : iG - 1;
        }
    }

    private final int z(V v10) {
        int i10 = this.f124593g;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f124590d[i10] >= 0) {
                V[] vArr = this.f124589c;
                f0.m(vArr);
                if (f0.g(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    @dl.d
    public Set<Map.Entry<K, V>> B() {
        nh.c<K, V> cVar = this.f124598l;
        if (cVar != null) {
            return cVar;
        }
        nh.c<K, V> cVar2 = new nh.c<>(this);
        this.f124598l = cVar2;
        return cVar2;
    }

    @dl.d
    public Set<K> D() {
        nh.d<K> dVar = this.f124596j;
        if (dVar != null) {
            return dVar;
        }
        nh.d<K> dVar2 = new nh.d<>(this);
        this.f124596j = dVar2;
        return dVar2;
    }

    public int E() {
        return this.f124595i;
    }

    @dl.d
    public Collection<V> F() {
        nh.e<V> eVar = this.f124597k;
        if (eVar != null) {
            return eVar;
        }
        nh.e<V> eVar2 = new nh.e<>(this);
        this.f124597k = eVar2;
        return eVar2;
    }

    public final boolean H() {
        return this.f124599m;
    }

    @dl.d
    public final e<K, V> I() {
        return new e<>(this);
    }

    public final boolean N(@dl.d Map.Entry<? extends K, ? extends V> entry) {
        f0.p(entry, "entry");
        l();
        int iY = y(entry.getKey());
        if (iY < 0) {
            return false;
        }
        V[] vArr = this.f124589c;
        f0.m(vArr);
        if (!f0.g(vArr[iY], entry.getValue())) {
            return false;
        }
        T(iY);
        return true;
    }

    public final int P(K k10) {
        l();
        int iY = y(k10);
        if (iY < 0) {
            return -1;
        }
        T(iY);
        return iY;
    }

    public final boolean U(V v10) {
        l();
        int iZ = z(v10);
        if (iZ < 0) {
            return false;
        }
        T(iZ);
        return true;
    }

    @dl.d
    public final f<K, V> V() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        l();
        k0 it = new l(0, this.f124593g - 1).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            int[] iArr = this.f124590d;
            int i10 = iArr[iNextInt];
            if (i10 >= 0) {
                this.f124591e[i10] = 0;
                iArr[iNextInt] = -1;
            }
        }
        nh.b.g(this.f124588b, 0, this.f124593g);
        V[] vArr = this.f124589c;
        if (vArr != null) {
            nh.b.g(vArr, 0, this.f124593g);
        }
        this.f124595i = 0;
        this.f124593g = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return y(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return z(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return B();
    }

    @Override // java.util.Map
    public boolean equals(@dl.e Object obj) {
        return obj == this || ((obj instanceof Map) && u((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @dl.e
    public V get(Object obj) {
        int iY = y(obj);
        if (iY < 0) {
            return null;
        }
        V[] vArr = this.f124589c;
        f0.m(vArr);
        return vArr[iY];
    }

    public final int h(K k10) {
        l();
        while (true) {
            int iG = G(k10);
            int iB = fi.u.B(this.f124592f * 2, C() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f124591e[iG];
                if (i11 <= 0) {
                    if (this.f124593g >= A()) {
                        w(1);
                        break;
                    }
                    int i12 = this.f124593g;
                    int i13 = i12 + 1;
                    this.f124593g = i13;
                    this.f124588b[i12] = k10;
                    this.f124590d[i12] = iG;
                    this.f124591e[iG] = i13;
                    this.f124595i = size() + 1;
                    if (i10 > this.f124592f) {
                        this.f124592f = i10;
                    }
                    return i12;
                }
                if (f0.g(this.f124588b[i11 - 1], k10)) {
                    return -i11;
                }
                i10++;
                if (i10 > iB) {
                    M(C() * 2);
                    break;
                }
                iG = iG == 0 ? C() - 1 : iG - 1;
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarX = x();
        int iJ = 0;
        while (bVarX.hasNext()) {
            iJ += bVarX.j();
        }
        return iJ;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @dl.d
    public final Map<K, V> j() {
        l();
        this.f124599m = true;
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return D();
    }

    public final void l() {
        if (this.f124599m) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean p(@dl.d Collection<?> m10) {
        f0.p(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!r((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    @dl.e
    public V put(K k10, V v10) {
        l();
        int iH = h(k10);
        V[] vArrI = i();
        if (iH >= 0) {
            vArrI[iH] = v10;
            return null;
        }
        int i10 = (-iH) - 1;
        V v11 = vArrI[i10];
        vArrI[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(@dl.d Map<? extends K, ? extends V> from) {
        f0.p(from, "from");
        l();
        J(from.entrySet());
    }

    public final boolean r(@dl.d Map.Entry<? extends K, ? extends V> entry) {
        f0.p(entry, "entry");
        int iY = y(entry.getKey());
        if (iY < 0) {
            return false;
        }
        V[] vArr = this.f124589c;
        f0.m(vArr);
        return f0.g(vArr[iY], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @dl.e
    public V remove(Object obj) {
        int iP = P(obj);
        if (iP < 0) {
            return null;
        }
        V[] vArr = this.f124589c;
        f0.m(vArr);
        V v10 = vArr[iP];
        nh.b.f(vArr, iP);
        return v10;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return E();
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> bVarX = x();
        int i10 = 0;
        while (bVarX.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarX.i(sb2);
            i10++;
        }
        sb2.append(z5.g.f141884d);
        String string = sb2.toString();
        f0.o(string, "sb.toString()");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return F();
    }

    @dl.d
    public final b<K, V> x() {
        return new b<>(this);
    }
}
