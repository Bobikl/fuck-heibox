package com.airbnb.lottie.parser.moshi;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator<Comparable> f37728j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f37729k = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Comparator<? super K> f37730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    g<K, V>[] f37731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final g<K, V> f37732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f37733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f37734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f37735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinkedHashTreeMap<K, V>.d f37736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinkedHashTreeMap<K, V>.e f37737i;

    public class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g<K, V> f37738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f37739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f37740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f37741d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f37753d = null;
            gVar.f37751b = null;
            gVar.f37752c = null;
            gVar.f37759j = 1;
            int i10 = this.f37739b;
            if (i10 > 0) {
                int i11 = this.f37741d;
                if ((i11 & 1) == 0) {
                    this.f37741d = i11 + 1;
                    this.f37739b = i10 - 1;
                    this.f37740c++;
                }
            }
            gVar.f37751b = this.f37738a;
            this.f37738a = gVar;
            int i12 = this.f37741d + 1;
            this.f37741d = i12;
            int i13 = this.f37739b;
            if (i13 > 0 && (i12 & 1) == 0) {
                this.f37741d = i12 + 1;
                this.f37739b = i13 - 1;
                this.f37740c++;
            }
            int i14 = 4;
            while (true) {
                int i15 = i14 - 1;
                if ((this.f37741d & i15) != i15) {
                    return;
                }
                int i16 = this.f37740c;
                if (i16 == 0) {
                    g<K, V> gVar2 = this.f37738a;
                    g<K, V> gVar3 = gVar2.f37751b;
                    g<K, V> gVar4 = gVar3.f37751b;
                    gVar3.f37751b = gVar4.f37751b;
                    this.f37738a = gVar3;
                    gVar3.f37752c = gVar4;
                    gVar3.f37753d = gVar2;
                    gVar3.f37759j = gVar2.f37759j + 1;
                    gVar4.f37751b = gVar3;
                    gVar2.f37751b = gVar3;
                } else if (i16 == 1) {
                    g<K, V> gVar5 = this.f37738a;
                    g<K, V> gVar6 = gVar5.f37751b;
                    this.f37738a = gVar6;
                    gVar6.f37753d = gVar5;
                    gVar6.f37759j = gVar5.f37759j + 1;
                    gVar5.f37751b = gVar6;
                    this.f37740c = 0;
                } else if (i16 == 2) {
                    this.f37740c = 0;
                }
                i14 *= 2;
            }
        }

        void b(int i10) {
            this.f37739b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f37741d = 0;
            this.f37740c = 0;
            this.f37738a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f37738a;
            if (gVar.f37751b == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g<K, V> f37742a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f37742a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f37751b;
            gVar.f37751b = null;
            g<K, V> gVar3 = gVar.f37753d;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f37742a = gVar4;
                    return gVar;
                }
                gVar2.f37751b = gVar4;
                gVar3 = gVar2.f37752c;
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f37751b = gVar2;
                gVar2 = gVar;
                gVar = gVar.f37752c;
            }
            this.f37742a = gVar2;
        }
    }

    public final class d extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedHashTreeMap<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarE;
            if (!(obj instanceof Map.Entry) || (gVarE = LinkedHashTreeMap.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.h(gVarE, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f37733e;
        }
    }

    public final class e extends AbstractSet<K> {

        public class a extends LinkedHashTreeMap<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f37756g;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedHashTreeMap.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f37733e;
        }
    }

    public abstract class f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f37747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g<K, V> f37748c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f37749d;

        f() {
            this.f37747b = LinkedHashTreeMap.this.f37732d.f37754e;
            this.f37749d = LinkedHashTreeMap.this.f37734f;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f37747b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (gVar == linkedHashTreeMap.f37732d) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.f37734f != this.f37749d) {
                throw new ConcurrentModificationException();
            }
            this.f37747b = gVar.f37754e;
            this.f37748c = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f37747b != LinkedHashTreeMap.this.f37732d;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f37748c;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.h(gVar, true);
            this.f37748c = null;
            this.f37749d = LinkedHashTreeMap.this.f37734f;
        }
    }

    public static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f37751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g<K, V> f37752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        g<K, V> f37753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        g<K, V> f37754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        g<K, V> f37755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final K f37756g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f37757h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        V f37758i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f37759j;

        g() {
            this.f37756g = null;
            this.f37757h = -1;
            this.f37755f = this;
            this.f37754e = this;
        }

        g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f37751b = gVar;
            this.f37756g = k10;
            this.f37757h = i10;
            this.f37759j = 1;
            this.f37754e = gVar2;
            this.f37755f = gVar3;
            gVar3.f37754e = this;
            gVar2.f37755f = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f37752c; gVar2 != null; gVar2 = gVar2.f37752c) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f37753d; gVar2 != null; gVar2 = gVar2.f37753d) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f37756g;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f37758i;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f37756g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f37758i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f37756g;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f37758i;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f37758i;
            this.f37758i = v10;
            return v11;
        }

        public String toString() {
            return this.f37756g + ContainerUtils.KEY_VALUE_DELIMITER + this.f37758i;
        }
    }

    LinkedHashTreeMap() {
        this(null);
    }

    LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.f37733e = 0;
        this.f37734f = 0;
        this.f37730b = comparator == null ? f37728j : comparator;
        this.f37732d = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f37731c = gVarArr;
        this.f37735g = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    private void a() {
        g<K, V>[] gVarArrB = b(this.f37731c);
        this.f37731c = gVarArrB;
        this.f37735g = (gVarArrB.length / 2) + (gVarArrB.length / 4);
    }

    static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f37757h & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f37757h & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void g(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f37752c;
            g<K, V> gVar3 = gVar.f37753d;
            int i10 = gVar2 != null ? gVar2.f37759j : 0;
            int i11 = gVar3 != null ? gVar3.f37759j : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.f37752c;
                g<K, V> gVar5 = gVar3.f37753d;
                int i13 = (gVar4 != null ? gVar4.f37759j : 0) - (gVar5 != null ? gVar5.f37759j : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    k(gVar);
                } else {
                    l(gVar3);
                    k(gVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.f37752c;
                g<K, V> gVar7 = gVar2.f37753d;
                int i14 = (gVar6 != null ? gVar6.f37759j : 0) - (gVar7 != null ? gVar7.f37759j : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    l(gVar);
                } else {
                    k(gVar2);
                    l(gVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f37759j = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f37759j = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f37751b;
        }
    }

    private void j(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f37751b;
        gVar.f37751b = null;
        if (gVar2 != null) {
            gVar2.f37751b = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f37757h;
            g<K, V>[] gVarArr = this.f37731c;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f37752c == gVar) {
            gVar3.f37752c = gVar2;
        } else {
            gVar3.f37753d = gVar2;
        }
    }

    private void k(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f37752c;
        g<K, V> gVar3 = gVar.f37753d;
        g<K, V> gVar4 = gVar3.f37752c;
        g<K, V> gVar5 = gVar3.f37753d;
        gVar.f37753d = gVar4;
        if (gVar4 != null) {
            gVar4.f37751b = gVar;
        }
        j(gVar, gVar3);
        gVar3.f37752c = gVar;
        gVar.f37751b = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f37759j : 0, gVar4 != null ? gVar4.f37759j : 0) + 1;
        gVar.f37759j = iMax;
        gVar3.f37759j = Math.max(iMax, gVar5 != null ? gVar5.f37759j : 0) + 1;
    }

    private void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f37752c;
        g<K, V> gVar3 = gVar.f37753d;
        g<K, V> gVar4 = gVar2.f37752c;
        g<K, V> gVar5 = gVar2.f37753d;
        gVar.f37752c = gVar5;
        if (gVar5 != null) {
            gVar5.f37751b = gVar;
        }
        j(gVar, gVar2);
        gVar2.f37753d = gVar;
        gVar.f37751b = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f37759j : 0, gVar5 != null ? gVar5.f37759j : 0) + 1;
        gVar.f37759j = iMax;
        gVar2.f37759j = Math.max(iMax, gVar4 != null ? gVar4.f37759j : 0) + 1;
    }

    private static int n(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    private Object p() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f37731c, (Object) null);
        this.f37733e = 0;
        this.f37734f++;
        g<K, V> gVar = this.f37732d;
        g<K, V> gVar2 = gVar.f37754e;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f37754e;
            gVar2.f37755f = null;
            gVar2.f37754e = null;
            gVar2 = gVar3;
        }
        gVar.f37755f = gVar;
        gVar.f37754e = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    g<K, V> d(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f37730b;
        g<K, V>[] gVarArr = this.f37731c;
        int iN = n(k10.hashCode());
        int length = (gVarArr.length - 1) & iN;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f37728j ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f37756g) : comparator.compare(k10, gVar2.f37756g);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f37752c : gVar2.f37753d;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        g<K, V> gVar4 = gVar2;
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        g<K, V> gVar5 = this.f37732d;
        if (gVar4 != null) {
            gVar = new g<>(gVar4, k10, iN, gVar5, gVar5.f37755f);
            if (i10 < 0) {
                gVar4.f37752c = gVar;
            } else {
                gVar4.f37753d = gVar;
            }
            g(gVar4, true);
        } else {
            if (comparator == f37728j && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar4, k10, iN, gVar5, gVar5.f37755f);
            gVarArr[length] = gVar;
        }
        int i11 = this.f37733e;
        this.f37733e = i11 + 1;
        if (i11 > this.f37735g) {
            a();
        }
        this.f37734f++;
        return gVar;
    }

    g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> gVarF = f(entry.getKey());
        if (gVarF != null && c(gVarF.f37758i, entry.getValue())) {
            return gVarF;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.f37736h;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.f37736h = dVar2;
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> f(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            return gVarF.f37758i;
        }
        return null;
    }

    void h(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f37755f;
            gVar2.f37754e = gVar.f37754e;
            gVar.f37754e.f37755f = gVar2;
            gVar.f37755f = null;
            gVar.f37754e = null;
        }
        g<K, V> gVar3 = gVar.f37752c;
        g<K, V> gVar4 = gVar.f37753d;
        g<K, V> gVar5 = gVar.f37751b;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                j(gVar, gVar3);
                gVar.f37752c = null;
            } else if (gVar4 != null) {
                j(gVar, gVar4);
                gVar.f37753d = null;
            } else {
                j(gVar, null);
            }
            g(gVar5, false);
            this.f37733e--;
            this.f37734f++;
            return;
        }
        g<K, V> gVarB = gVar3.f37759j > gVar4.f37759j ? gVar3.b() : gVar4.a();
        h(gVarB, false);
        g<K, V> gVar6 = gVar.f37752c;
        if (gVar6 != null) {
            i10 = gVar6.f37759j;
            gVarB.f37752c = gVar6;
            gVar6.f37751b = gVarB;
            gVar.f37752c = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f37753d;
        if (gVar7 != null) {
            i11 = gVar7.f37759j;
            gVarB.f37753d = gVar7;
            gVar7.f37751b = gVarB;
            gVar.f37753d = null;
        }
        gVarB.f37759j = Math.max(i10, i11) + 1;
        j(gVar, gVarB);
    }

    g<K, V> i(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            h(gVarF, true);
        }
        return gVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.e eVar = this.f37737i;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.e eVar2 = new e();
        this.f37737i = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarD = d(k10, true);
        V v11 = gVarD.f37758i;
        gVarD.f37758i = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarI = i(obj);
        if (gVarI != null) {
            return gVarI.f37758i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f37733e;
    }
}
