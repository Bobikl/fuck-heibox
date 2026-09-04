package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f57106k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @o9.d
    static final double f57107l = 0.001d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f57108m = 9;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private transient Object f57109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @o9.d
    transient int[] f57110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @o9.d
    transient Object[] f57111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    @o9.d
    transient Object[] f57112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f57113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int f57114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @CheckForNull
    private transient Set<K> f57115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @CheckForNull
    private transient Set<Map.Entry<K, V>> f57116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    private transient Collection<V> f57117j;

    public class a extends CompactHashMap<K, V>.e<K> {
        a() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        @x1
        K b(int i10) {
            return (K) CompactHashMap.this.M(i10);
        }
    }

    public class b extends CompactHashMap<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(CompactHashMap.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.CompactHashMap.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i10) {
            return new g(i10);
        }
    }

    public class c extends CompactHashMap<K, V>.e<V> {
        c() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        @x1
        V b(int i10) {
            return (V) CompactHashMap.this.h0(i10);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            Map<K, V> mapC = CompactHashMap.this.C();
            if (mapC != null) {
                return mapC.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iJ = CompactHashMap.this.J(entry.getKey());
            return iJ != -1 && com.google.common.base.s.a(CompactHashMap.this.h0(iJ), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.E();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            Map<K, V> mapC = CompactHashMap.this.C();
            if (mapC != null) {
                return mapC.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.P()) {
                return false;
            }
            int iH = CompactHashMap.this.H();
            int iF = p.f(entry.getKey(), entry.getValue(), iH, CompactHashMap.this.X(), CompactHashMap.this.V(), CompactHashMap.this.W(), CompactHashMap.this.Y());
            if (iF == -1) {
                return false;
            }
            CompactHashMap.this.O(iF, iH);
            CompactHashMap.e(CompactHashMap.this);
            CompactHashMap.this.I();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f57124d;

        private e() {
            this.f57122b = CompactHashMap.this.f57113f;
            this.f57123c = CompactHashMap.this.F();
            this.f57124d = -1;
        }

        /* synthetic */ e(CompactHashMap compactHashMap, a aVar) {
            this();
        }

        private void a() {
            if (CompactHashMap.this.f57113f != this.f57122b) {
                throw new ConcurrentModificationException();
            }
        }

        @x1
        abstract T b(int i10);

        void c() {
            this.f57122b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57123c >= 0;
        }

        @Override // java.util.Iterator
        @x1
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f57123c;
            this.f57124d = i10;
            T tB = b(i10);
            this.f57123c = CompactHashMap.this.G(this.f57123c);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            n.e(this.f57124d >= 0);
            c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.M(this.f57124d));
            this.f57123c = CompactHashMap.this.r(this.f57123c, this.f57124d);
            this.f57124d = -1;
        }
    }

    public class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.N();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            Map<K, V> mapC = CompactHashMap.this.C();
            if (mapC != null) {
                return mapC.keySet().remove(obj);
            }
            return CompactHashMap.this.U(obj) != CompactHashMap.f57106k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class g extends com.google.common.collect.b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        private final K f57127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f57128c;

        g(int i10) {
            this.f57127b = (K) CompactHashMap.this.M(i10);
            this.f57128c = i10;
        }

        private void c() {
            int i10 = this.f57128c;
            if (i10 == -1 || i10 >= CompactHashMap.this.size() || !com.google.common.base.s.a(this.f57127b, CompactHashMap.this.M(this.f57128c))) {
                this.f57128c = CompactHashMap.this.J(this.f57127b);
            }
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public K getKey() {
            return this.f57127b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V getValue() {
            Map<K, V> mapC = CompactHashMap.this.C();
            if (mapC != null) {
                return (V) t1.a(mapC.get(this.f57127b));
            }
            c();
            int i10 = this.f57128c;
            return i10 == -1 ? (V) t1.b() : (V) CompactHashMap.this.h0(i10);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V setValue(@x1 V v10) {
            Map<K, V> mapC = CompactHashMap.this.C();
            if (mapC != null) {
                return (V) t1.a(mapC.put(this.f57127b, v10));
            }
            c();
            int i10 = this.f57128c;
            if (i10 == -1) {
                CompactHashMap.this.put(this.f57127b, v10);
                return (V) t1.b();
            }
            V v11 = (V) CompactHashMap.this.h0(i10);
            CompactHashMap.this.f0(this.f57128c, v10);
            return v11;
        }
    }

    public class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.j0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    CompactHashMap() {
        K(3);
    }

    CompactHashMap(int i10) {
        K(i10);
    }

    public static <K, V> CompactHashMap<K, V> B(int i10) {
        return new CompactHashMap<>(i10);
    }

    private int D(int i10) {
        return V()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        return (1 << (this.f57113f & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J(@CheckForNull Object obj) {
        if (P()) {
            return -1;
        }
        int iD = i1.d(obj);
        int iH = H();
        int iH2 = p.h(X(), iD & iH);
        if (iH2 == 0) {
            return -1;
        }
        int iB = p.b(iD, iH);
        do {
            int i10 = iH2 - 1;
            int iD2 = D(i10);
            if (p.b(iD2, iH) == iB && com.google.common.base.s.a(obj, M(i10))) {
                return i10;
            }
            iH2 = p.c(iD2, iH);
        } while (iH2 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K M(int i10) {
        return (K) W()[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void T(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid size: ");
            sb2.append(i10);
            throw new InvalidObjectException(sb2.toString());
        }
        K(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object U(@CheckForNull Object obj) {
        if (P()) {
            return f57106k;
        }
        int iH = H();
        int iF = p.f(obj, null, iH, X(), V(), W(), null);
        if (iF == -1) {
            return f57106k;
        }
        V vH0 = h0(iF);
        O(iF, iH);
        this.f57114g--;
        I();
        return vH0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] V() {
        int[] iArr = this.f57110c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] W() {
        Object[] objArr = this.f57111d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object X() {
        Object obj = this.f57109b;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] Y() {
        Object[] objArr = this.f57112e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void a0(int i10) {
        int iMin;
        int length = V().length;
        if (i10 <= length || (iMin = Math.min(kotlinx.coroutines.internal.z.f130219j, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Z(iMin);
    }

    @s9.a
    private int b0(int i10, int i11, int i12, int i13) {
        Object objA = p.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            p.i(objA, i12 & i14, i13 + 1);
        }
        Object objX = X();
        int[] iArrV = V();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = p.h(objX, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrV[i16];
                int iB = p.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = p.h(objA, i18);
                p.i(objA, i18, iH);
                iArrV[i16] = p.d(iB, iH2, i14);
                iH = p.c(i17, i10);
            }
        }
        this.f57109b = objA;
        d0(i14);
        return i14;
    }

    private void c0(int i10, int i11) {
        V()[i10] = i11;
    }

    private void d0(int i10) {
        this.f57113f = p.d(this.f57113f, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    static /* synthetic */ int e(CompactHashMap compactHashMap) {
        int i10 = compactHashMap.f57114g;
        compactHashMap.f57114g = i10 - 1;
        return i10;
    }

    private void e0(int i10, K k10) {
        W()[i10] = k10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i10, V v10) {
        Y()[i10] = v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V h0(int i10) {
        return (V) Y()[i10];
    }

    private void k0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itE = E();
        while (itE.hasNext()) {
            Map.Entry<K, V> next = itE.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public static <K, V> CompactHashMap<K, V> w() {
        return new CompactHashMap<>();
    }

    Collection<V> A() {
        return new h();
    }

    @CheckForNull
    @o9.d
    Map<K, V> C() {
        Object obj = this.f57109b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> E() {
        Map<K, V> mapC = C();
        return mapC != null ? mapC.entrySet().iterator() : new b();
    }

    int F() {
        return isEmpty() ? -1 : 0;
    }

    int G(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f57114g) {
            return i11;
        }
        return -1;
    }

    void I() {
        this.f57113f += 32;
    }

    void K(int i10) {
        com.google.common.base.w.e(i10 >= 0, "Expected size must be >= 0");
        this.f57113f = Ints.g(i10, 1, kotlinx.coroutines.internal.z.f130219j);
    }

    void L(int i10, @x1 K k10, @x1 V v10, int i11, int i12) {
        c0(i10, p.d(i11, 0, i12));
        e0(i10, k10);
        f0(i10, v10);
    }

    Iterator<K> N() {
        Map<K, V> mapC = C();
        return mapC != null ? mapC.keySet().iterator() : new a();
    }

    void O(int i10, int i11) {
        Object objX = X();
        int[] iArrV = V();
        Object[] objArrW = W();
        Object[] objArrY = Y();
        int size = size() - 1;
        if (i10 >= size) {
            objArrW[i10] = null;
            objArrY[i10] = null;
            iArrV[i10] = 0;
            return;
        }
        Object obj = objArrW[size];
        objArrW[i10] = obj;
        objArrY[i10] = objArrY[size];
        objArrW[size] = null;
        objArrY[size] = null;
        iArrV[i10] = iArrV[size];
        iArrV[size] = 0;
        int iD = i1.d(obj) & i11;
        int iH = p.h(objX, iD);
        int i12 = size + 1;
        if (iH == i12) {
            p.i(objX, iD, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrV[i13];
            int iC = p.c(i14, i11);
            if (iC == i12) {
                iArrV[i13] = p.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC;
        }
    }

    @o9.d
    boolean P() {
        return this.f57109b == null;
    }

    void Z(int i10) {
        this.f57110c = Arrays.copyOf(V(), i10);
        this.f57111d = Arrays.copyOf(W(), i10);
        this.f57112e = Arrays.copyOf(Y(), i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (P()) {
            return;
        }
        I();
        Map<K, V> mapC = C();
        if (mapC != null) {
            this.f57113f = Ints.g(size(), 3, kotlinx.coroutines.internal.z.f130219j);
            mapC.clear();
            this.f57109b = null;
            this.f57114g = 0;
            return;
        }
        Arrays.fill(W(), 0, this.f57114g, (Object) null);
        Arrays.fill(Y(), 0, this.f57114g, (Object) null);
        p.g(X());
        Arrays.fill(V(), 0, this.f57114g, 0);
        this.f57114g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return J(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f57114g; i10++) {
            if (com.google.common.base.s.a(obj, h0(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f57116i;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setX = x();
        this.f57116i = setX;
        return setX;
    }

    public void g0() {
        if (P()) {
            return;
        }
        Map<K, V> mapC = C();
        if (mapC != null) {
            Map<K, V> mapY = y(size());
            mapY.putAll(mapC);
            this.f57109b = mapY;
            return;
        }
        int i10 = this.f57114g;
        if (i10 < V().length) {
            Z(i10);
        }
        int iJ = p.j(i10);
        int iH = H();
        if (iJ < iH) {
            b0(iH, iJ, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iJ = J(obj);
        if (iJ == -1) {
            return null;
        }
        p(iJ);
        return h0(iJ);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    Iterator<V> j0() {
        Map<K, V> mapC = C();
        return mapC != null ? mapC.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f57115h;
        if (set != null) {
            return set;
        }
        Set<K> setZ = z();
        this.f57115h = setZ;
        return setZ;
    }

    void p(int i10) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @s9.a
    @CheckForNull
    public V put(@x1 K k10, @x1 V v10) {
        int iB0;
        int i10;
        if (P()) {
            u();
        }
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.put(k10, v10);
        }
        int[] iArrV = V();
        Object[] objArrW = W();
        Object[] objArrY = Y();
        int i11 = this.f57114g;
        int i12 = i11 + 1;
        int iD = i1.d(k10);
        int iH = H();
        int i13 = iD & iH;
        int iH2 = p.h(X(), i13);
        if (iH2 != 0) {
            int iB = p.b(iD, iH);
            int i14 = 0;
            while (true) {
                int i15 = iH2 - 1;
                int i16 = iArrV[i15];
                if (p.b(i16, iH) == iB && com.google.common.base.s.a(k10, objArrW[i15])) {
                    V v11 = (V) objArrY[i15];
                    objArrY[i15] = v10;
                    p(i15);
                    return v11;
                }
                int iC = p.c(i16, iH);
                i14++;
                if (iC != 0) {
                    iH2 = iC;
                } else {
                    if (i14 >= 9) {
                        return v().put(k10, v10);
                    }
                    if (i12 > iH) {
                        iB0 = b0(iH, p.e(iH), iD, i11);
                        i10 = iB0;
                    } else {
                        iArrV[i15] = p.d(i16, i12, iH);
                        i10 = iH;
                    }
                }
            }
        } else if (i12 > iH) {
            iB0 = b0(iH, p.e(iH), iD, i11);
            i10 = iB0;
        } else {
            p.i(X(), i13, i12);
            i10 = iH;
        }
        a0(i12);
        L(i11, k10, v10, iD, i10);
        this.f57114g = i12;
        I();
        return null;
    }

    int r(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @s9.a
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        V v10 = (V) U(obj);
        if (v10 == f57106k) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapC = C();
        return mapC != null ? mapC.size() : this.f57114g;
    }

    @s9.a
    int u() {
        com.google.common.base.w.h0(P(), "Arrays already allocated");
        int i10 = this.f57113f;
        int iJ = p.j(i10);
        this.f57109b = p.a(iJ);
        d0(iJ - 1);
        this.f57110c = new int[i10];
        this.f57111d = new Object[i10];
        this.f57112e = new Object[i10];
        return i10;
    }

    @s9.a
    @o9.d
    Map<K, V> v() {
        Map<K, V> mapY = y(H() + 1);
        int iF = F();
        while (iF >= 0) {
            mapY.put(M(iF), h0(iF));
            iF = G(iF);
        }
        this.f57109b = mapY;
        this.f57110c = null;
        this.f57111d = null;
        this.f57112e = null;
        I();
        return mapY;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f57117j;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionA = A();
        this.f57117j = collectionA;
        return collectionA;
    }

    Set<Map.Entry<K, V>> x() {
        return new d();
    }

    Map<K, V> y(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set<K> z() {
        return new f();
    }
}
