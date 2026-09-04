package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements l<K, V>, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f57226r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f57227s = -2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient K[] f57228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient V[] f57229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f57230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient int f57231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int[] f57232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int[] f57233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int[] f57234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient int[] f57235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f57236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int f57237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient int[] f57238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient int[] f57239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Set<K> f57240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient Set<V> f57241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f57242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @CheckForNull
    @t9.b
    @u9.f
    private transient l<V, K> f57243q;

    public static class Inverse<K, V> extends AbstractMap<V, K> implements l<V, K>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashBiMap<K, V> f57244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private transient Set<Map.Entry<V, K>> f57245c;

        Inverse(HashBiMap<K, V> hashBiMap) {
            this.f57244b = hashBiMap;
        }

        @o9.c("serialization")
        private void a(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.f57244b).f57243q = this;
        }

        @Override // com.google.common.collect.l
        @s9.a
        @CheckForNull
        public K R(@x1 V v10, @x1 K k10) {
            return this.f57244b.E(v10, k10, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f57244b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57244b.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object obj) {
            return this.f57244b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f57245c;
            if (set != null) {
                return set;
            }
            d dVar = new d(this.f57244b);
            this.f57245c = dVar;
            return dVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object obj) {
            return this.f57244b.y(obj);
        }

        @Override // com.google.common.collect.l
        public l<K, V> i0() {
            return this.f57244b;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f57244b.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.l
        @s9.a
        @CheckForNull
        public K put(@x1 V v10, @x1 K k10) {
            return this.f57244b.E(v10, k10, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @s9.a
        @CheckForNull
        public K remove(@CheckForNull Object obj) {
            return this.f57244b.K(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f57244b.f57230d;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.l
        public Set<K> values() {
            return this.f57244b.keySet();
        }
    }

    public final class a extends com.google.common.collect.b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final K f57246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57247c;

        a(int i10) {
            this.f57246b = (K) t1.a(HashBiMap.this.f57228b[i10]);
            this.f57247c = i10;
        }

        void c() {
            int i10 = this.f57247c;
            if (i10 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i10 <= hashBiMap.f57230d && com.google.common.base.s.a(hashBiMap.f57228b[i10], this.f57246b)) {
                    return;
                }
            }
            this.f57247c = HashBiMap.this.u(this.f57246b);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public K getKey() {
            return this.f57246b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V getValue() {
            c();
            int i10 = this.f57247c;
            return i10 == -1 ? (V) t1.b() : (V) t1.a(HashBiMap.this.f57229c[i10]);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V setValue(@x1 V v10) {
            c();
            int i10 = this.f57247c;
            if (i10 == -1) {
                HashBiMap.this.put(this.f57246b, v10);
                return (V) t1.b();
            }
            V v11 = (V) t1.a(HashBiMap.this.f57229c[i10]);
            if (com.google.common.base.s.a(v11, v10)) {
                return v10;
            }
            HashBiMap.this.M(this.f57247c, v10, false);
            return v11;
        }
    }

    public static final class b<K, V> extends com.google.common.collect.b<V, K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final HashBiMap<K, V> f57249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @x1
        final V f57250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f57251d;

        b(HashBiMap<K, V> hashBiMap, int i10) {
            this.f57249b = hashBiMap;
            this.f57250c = (V) t1.a(hashBiMap.f57229c[i10]);
            this.f57251d = i10;
        }

        private void c() {
            int i10 = this.f57251d;
            if (i10 != -1) {
                HashBiMap<K, V> hashBiMap = this.f57249b;
                if (i10 <= hashBiMap.f57230d && com.google.common.base.s.a(this.f57250c, hashBiMap.f57229c[i10])) {
                    return;
                }
            }
            this.f57251d = this.f57249b.w(this.f57250c);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V getKey() {
            return this.f57250c;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public K getValue() {
            c();
            int i10 = this.f57251d;
            return i10 == -1 ? (K) t1.b() : (K) t1.a(this.f57249b.f57228b[i10]);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public K setValue(@x1 K k10) {
            c();
            int i10 = this.f57251d;
            if (i10 == -1) {
                this.f57249b.E(this.f57250c, k10, false);
                return (K) t1.b();
            }
            K k11 = (K) t1.a(this.f57249b.f57228b[i10]);
            if (com.google.common.base.s.a(k11, k10)) {
                return k10;
            }
            this.f57249b.L(this.f57251d, k10, false);
            return k11;
        }
    }

    public final class c extends g<K, V, Map.Entry<K, V>> {
        c() {
            super(HashBiMap.this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(int i10) {
            return new a(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iU = HashBiMap.this.u(key);
            return iU != -1 && com.google.common.base.s.a(value, HashBiMap.this.f57229c[iU]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @s9.a
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = i1.d(key);
            int iV = HashBiMap.this.v(key, iD);
            if (iV == -1 || !com.google.common.base.s.a(value, HashBiMap.this.f57229c[iV])) {
                return false;
            }
            HashBiMap.this.I(iV, iD);
            return true;
        }
    }

    public static class d<K, V> extends g<K, V, Map.Entry<V, K>> {
        d(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> a(int i10) {
            return new b(this.f57255b, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iW = this.f57255b.w(key);
            return iW != -1 && com.google.common.base.s.a(this.f57255b.f57228b[iW], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = i1.d(key);
            int iX = this.f57255b.x(key, iD);
            if (iX == -1 || !com.google.common.base.s.a(this.f57255b.f57228b[iX], value)) {
                return false;
            }
            this.f57255b.J(iX, iD);
            return true;
        }
    }

    public final class e extends g<K, V, K> {
        e() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.g
        @x1
        K a(int i10) {
            return (K) t1.a(HashBiMap.this.f57228b[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iD = i1.d(obj);
            int iV = HashBiMap.this.v(obj, iD);
            if (iV == -1) {
                return false;
            }
            HashBiMap.this.I(iV, iD);
            return true;
        }
    }

    public final class f extends g<K, V, V> {
        f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.g
        @x1
        V a(int i10) {
            return (V) t1.a(HashBiMap.this.f57229c[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iD = i1.d(obj);
            int iX = HashBiMap.this.x(obj, iD);
            if (iX == -1) {
                return false;
            }
            HashBiMap.this.J(iX, iD);
            return true;
        }
    }

    public static abstract class g<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final HashBiMap<K, V> f57255b;

        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f57256b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f57257c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f57258d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f57259e;

            a() {
                this.f57256b = ((HashBiMap) g.this.f57255b).f57236j;
                HashBiMap<K, V> hashBiMap = g.this.f57255b;
                this.f57258d = hashBiMap.f57231e;
                this.f57259e = hashBiMap.f57230d;
            }

            private void a() {
                if (g.this.f57255b.f57231e != this.f57258d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f57256b != -2 && this.f57259e > 0;
            }

            @Override // java.util.Iterator
            @x1
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t10 = (T) g.this.a(this.f57256b);
                this.f57257c = this.f57256b;
                this.f57256b = ((HashBiMap) g.this.f57255b).f57239m[this.f57256b];
                this.f57259e--;
                return t10;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                n.e(this.f57257c != -1);
                g.this.f57255b.G(this.f57257c);
                int i10 = this.f57256b;
                HashBiMap<K, V> hashBiMap = g.this.f57255b;
                if (i10 == hashBiMap.f57230d) {
                    this.f57256b = this.f57257c;
                }
                this.f57257c = -1;
                this.f57258d = hashBiMap.f57231e;
            }
        }

        g(HashBiMap<K, V> hashBiMap) {
            this.f57255b = hashBiMap;
        }

        @x1
        abstract T a(int i10);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f57255b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f57255b.f57230d;
        }
    }

    private HashBiMap(int i10) {
        z(i10);
    }

    private void A(int i10, int i11) {
        com.google.common.base.w.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f57234h;
        int[] iArr2 = this.f57232f;
        iArr[i10] = iArr2[iF];
        iArr2[iF] = i10;
    }

    private void B(int i10, int i11) {
        com.google.common.base.w.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f57235i;
        int[] iArr2 = this.f57233g;
        iArr[i10] = iArr2[iF];
        iArr2[iF] = i10;
    }

    private void C(int i10, int i11) {
        int i12;
        int i13;
        if (i10 == i11) {
            return;
        }
        int i14 = this.f57238l[i10];
        int i15 = this.f57239m[i10];
        N(i14, i11);
        N(i11, i15);
        K[] kArr = this.f57228b;
        K k10 = kArr[i10];
        V[] vArr = this.f57229c;
        V v10 = vArr[i10];
        kArr[i11] = k10;
        vArr[i11] = v10;
        int iF = f(i1.d(k10));
        int[] iArr = this.f57232f;
        int i16 = iArr[iF];
        if (i16 == i10) {
            iArr[iF] = i11;
        } else {
            int i17 = this.f57234h[i16];
            while (true) {
                i12 = i16;
                i16 = i17;
                if (i16 == i10) {
                    break;
                } else {
                    i17 = this.f57234h[i16];
                }
            }
            this.f57234h[i12] = i11;
        }
        int[] iArr2 = this.f57234h;
        iArr2[i11] = iArr2[i10];
        iArr2[i10] = -1;
        int iF2 = f(i1.d(v10));
        int[] iArr3 = this.f57233g;
        int i18 = iArr3[iF2];
        if (i18 == i10) {
            iArr3[iF2] = i11;
        } else {
            int i19 = this.f57235i[i18];
            while (true) {
                i13 = i18;
                i18 = i19;
                if (i18 == i10) {
                    break;
                } else {
                    i19 = this.f57235i[i18];
                }
            }
            this.f57235i[i13] = i11;
        }
        int[] iArr4 = this.f57235i;
        iArr4[i11] = iArr4[i10];
        iArr4[i10] = -1;
    }

    @o9.c
    private void F(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = g2.h(objectInputStream);
        z(16);
        g2.c(this, objectInputStream, iH);
    }

    private void H(int i10, int i11, int i12) {
        com.google.common.base.w.d(i10 != -1);
        k(i10, i11);
        l(i10, i12);
        N(this.f57238l[i10], this.f57239m[i10]);
        C(this.f57230d - 1, i10);
        K[] kArr = this.f57228b;
        int i13 = this.f57230d;
        kArr[i13 - 1] = null;
        this.f57229c[i13 - 1] = null;
        this.f57230d = i13 - 1;
        this.f57231e++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(int i10, @x1 K k10, boolean z10) {
        com.google.common.base.w.d(i10 != -1);
        int iD = i1.d(k10);
        int iV = v(k10, iD);
        int i11 = this.f57237k;
        int i12 = -2;
        if (iV != -1) {
            if (!z10) {
                String strValueOf = String.valueOf(k10);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
                sb2.append("Key already present in map: ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
            i11 = this.f57238l[iV];
            i12 = this.f57239m[iV];
            I(iV, iD);
            if (i10 == this.f57230d) {
                i10 = iV;
            }
        }
        if (i11 == i10) {
            i11 = this.f57238l[i10];
        } else if (i11 == this.f57230d) {
            i11 = iV;
        }
        if (i12 == i10) {
            iV = this.f57239m[i10];
        } else if (i12 != this.f57230d) {
            iV = i12;
        }
        N(this.f57238l[i10], this.f57239m[i10]);
        k(i10, i1.d(this.f57228b[i10]));
        this.f57228b[i10] = k10;
        A(i10, i1.d(k10));
        N(i11, i10);
        N(i10, iV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i10, @x1 V v10, boolean z10) {
        com.google.common.base.w.d(i10 != -1);
        int iD = i1.d(v10);
        int iX = x(v10, iD);
        if (iX != -1) {
            if (!z10) {
                String strValueOf = String.valueOf(v10);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 30);
                sb2.append("Value already present in map: ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
            J(iX, iD);
            if (i10 == this.f57230d) {
                i10 = iX;
            }
        }
        l(i10, i1.d(this.f57229c[i10]));
        this.f57229c[i10] = v10;
        B(i10, iD);
    }

    private void N(int i10, int i11) {
        if (i10 == -2) {
            this.f57236j = i11;
        } else {
            this.f57239m[i10] = i11;
        }
        if (i11 == -2) {
            this.f57237k = i10;
        } else {
            this.f57238l[i11] = i10;
        }
    }

    @o9.c
    private void O(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        g2.i(this, objectOutputStream);
    }

    private int f(int i10) {
        return i10 & (this.f57232f.length - 1);
    }

    public static <K, V> HashBiMap<K, V> g() {
        return h(16);
    }

    public static <K, V> HashBiMap<K, V> h(int i10) {
        return new HashBiMap<>(i10);
    }

    public static <K, V> HashBiMap<K, V> i(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapH = h(map.size());
        hashBiMapH.putAll(map);
        return hashBiMapH;
    }

    private static int[] j(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void k(int i10, int i11) {
        com.google.common.base.w.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f57232f;
        int i12 = iArr[iF];
        if (i12 == i10) {
            int[] iArr2 = this.f57234h;
            iArr[iF] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f57234h[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                String strValueOf = String.valueOf(this.f57228b[i10]);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32);
                sb2.append("Expected to find entry with key ");
                sb2.append(strValueOf);
                throw new AssertionError(sb2.toString());
            }
            if (i12 == i10) {
                int[] iArr3 = this.f57234h;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f57234h[i12];
        }
    }

    private void l(int i10, int i11) {
        com.google.common.base.w.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f57233g;
        int i12 = iArr[iF];
        if (i12 == i10) {
            int[] iArr2 = this.f57235i;
            iArr[iF] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f57235i[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                String strValueOf = String.valueOf(this.f57229c[i10]);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 34);
                sb2.append("Expected to find entry with value ");
                sb2.append(strValueOf);
                throw new AssertionError(sb2.toString());
            }
            if (i12 == i10) {
                int[] iArr3 = this.f57235i;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f57235i[i12];
        }
    }

    private void n(int i10) {
        int[] iArr = this.f57234h;
        if (iArr.length < i10) {
            int iF = ImmutableCollection.b.f(iArr.length, i10);
            this.f57228b = (K[]) Arrays.copyOf(this.f57228b, iF);
            this.f57229c = (V[]) Arrays.copyOf(this.f57229c, iF);
            this.f57234h = p(this.f57234h, iF);
            this.f57235i = p(this.f57235i, iF);
            this.f57238l = p(this.f57238l, iF);
            this.f57239m = p(this.f57239m, iF);
        }
        if (this.f57232f.length < i10) {
            int iA = i1.a(i10, 1.0d);
            this.f57232f = j(iA);
            this.f57233g = j(iA);
            for (int i11 = 0; i11 < this.f57230d; i11++) {
                int iF2 = f(i1.d(this.f57228b[i11]));
                int[] iArr2 = this.f57234h;
                int[] iArr3 = this.f57232f;
                iArr2[i11] = iArr3[iF2];
                iArr3[iF2] = i11;
                int iF3 = f(i1.d(this.f57229c[i11]));
                int[] iArr4 = this.f57235i;
                int[] iArr5 = this.f57233g;
                iArr4[i11] = iArr5[iF3];
                iArr5[iF3] = i11;
            }
        }
    }

    private static int[] p(int[] iArr, int i10) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        Arrays.fill(iArrCopyOf, length, i10, -1);
        return iArrCopyOf;
    }

    @CheckForNull
    V D(@x1 K k10, @x1 V v10, boolean z10) {
        int iD = i1.d(k10);
        int iV = v(k10, iD);
        if (iV != -1) {
            V v11 = this.f57229c[iV];
            if (com.google.common.base.s.a(v11, v10)) {
                return v10;
            }
            M(iV, v10, z10);
            return v11;
        }
        int iD2 = i1.d(v10);
        int iX = x(v10, iD2);
        if (!z10) {
            com.google.common.base.w.u(iX == -1, "Value already present: %s", v10);
        } else if (iX != -1) {
            J(iX, iD2);
        }
        n(this.f57230d + 1);
        K[] kArr = this.f57228b;
        int i10 = this.f57230d;
        kArr[i10] = k10;
        this.f57229c[i10] = v10;
        A(i10, iD);
        B(this.f57230d, iD2);
        N(this.f57237k, this.f57230d);
        N(this.f57230d, -2);
        this.f57230d++;
        this.f57231e++;
        return null;
    }

    @s9.a
    @CheckForNull
    K E(@x1 V v10, @x1 K k10, boolean z10) {
        int iD = i1.d(v10);
        int iX = x(v10, iD);
        if (iX != -1) {
            K k11 = this.f57228b[iX];
            if (com.google.common.base.s.a(k11, k10)) {
                return k10;
            }
            L(iX, k10, z10);
            return k11;
        }
        int i10 = this.f57237k;
        int iD2 = i1.d(k10);
        int iV = v(k10, iD2);
        if (!z10) {
            com.google.common.base.w.u(iV == -1, "Key already present: %s", k10);
        } else if (iV != -1) {
            i10 = this.f57238l[iV];
            I(iV, iD2);
        }
        n(this.f57230d + 1);
        K[] kArr = this.f57228b;
        int i11 = this.f57230d;
        kArr[i11] = k10;
        this.f57229c[i11] = v10;
        A(i11, iD2);
        B(this.f57230d, iD);
        int i12 = i10 == -2 ? this.f57236j : this.f57239m[i10];
        N(i10, this.f57230d);
        N(this.f57230d, i12);
        this.f57230d++;
        this.f57231e++;
        return null;
    }

    void G(int i10) {
        I(i10, i1.d(this.f57228b[i10]));
    }

    void I(int i10, int i11) {
        H(i10, i11, i1.d(this.f57229c[i10]));
    }

    void J(int i10, int i11) {
        H(i10, i1.d(this.f57228b[i10]), i11);
    }

    @CheckForNull
    K K(@CheckForNull Object obj) {
        int iD = i1.d(obj);
        int iX = x(obj, iD);
        if (iX == -1) {
            return null;
        }
        K k10 = this.f57228b[iX];
        J(iX, iD);
        return k10;
    }

    @Override // com.google.common.collect.l
    @s9.a
    @CheckForNull
    public V R(@x1 K k10, @x1 V v10) {
        return D(k10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f57228b, 0, this.f57230d, (Object) null);
        Arrays.fill(this.f57229c, 0, this.f57230d, (Object) null);
        Arrays.fill(this.f57232f, -1);
        Arrays.fill(this.f57233g, -1);
        Arrays.fill(this.f57234h, 0, this.f57230d, -1);
        Arrays.fill(this.f57235i, 0, this.f57230d, -1);
        Arrays.fill(this.f57238l, 0, this.f57230d, -1);
        Arrays.fill(this.f57239m, 0, this.f57230d, -1);
        this.f57230d = 0;
        this.f57236j = -2;
        this.f57237k = -2;
        this.f57231e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return u(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return w(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f57242p;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f57242p = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        int iU = u(obj);
        if (iU == -1) {
            return null;
        }
        return this.f57229c[iU];
    }

    @Override // com.google.common.collect.l
    public l<V, K> i0() {
        l<V, K> lVar = this.f57243q;
        if (lVar != null) {
            return lVar;
        }
        Inverse inverse = new Inverse(this);
        this.f57243q = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f57240n;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.f57240n = eVar;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.l
    @s9.a
    @CheckForNull
    public V put(@x1 K k10, @x1 V v10) {
        return D(k10, v10, false);
    }

    int r(@CheckForNull Object obj, int i10, int[] iArr, int[] iArr2, Object[] objArr) {
        int i11 = iArr[f(i10)];
        while (i11 != -1) {
            if (com.google.common.base.s.a(objArr[i11], obj)) {
                return i11;
            }
            i11 = iArr2[i11];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @s9.a
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        int iD = i1.d(obj);
        int iV = v(obj, iD);
        if (iV == -1) {
            return null;
        }
        V v10 = this.f57229c[iV];
        I(iV, iD);
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f57230d;
    }

    int u(@CheckForNull Object obj) {
        return v(obj, i1.d(obj));
    }

    int v(@CheckForNull Object obj, int i10) {
        return r(obj, i10, this.f57232f, this.f57234h, this.f57228b);
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.l
    public Set<V> values() {
        Set<V> set = this.f57241o;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f57241o = fVar;
        return fVar;
    }

    int w(@CheckForNull Object obj) {
        return x(obj, i1.d(obj));
    }

    int x(@CheckForNull Object obj, int i10) {
        return r(obj, i10, this.f57233g, this.f57235i, this.f57229c);
    }

    @CheckForNull
    K y(@CheckForNull Object obj) {
        int iW = w(obj);
        if (iW == -1) {
            return null;
        }
        return this.f57228b[iW];
    }

    void z(int i10) {
        n.b(i10, "expectedSize");
        int iA = i1.a(i10, 1.0d);
        this.f57230d = 0;
        this.f57228b = (K[]) new Object[i10];
        this.f57229c = (V[]) new Object[i10];
        this.f57232f = j(iA);
        this.f57233g = j(iA);
        this.f57234h = j(i10);
        this.f57235i = j(i10);
        this.f57236j = -2;
        this.f57237k = -2;
        this.f57238l = j(i10);
        this.f57239m = j(i10);
    }
}
