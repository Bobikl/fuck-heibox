package androidx.collection;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: ArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends j2<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    a<K, V>.C0029a f3542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    a<K, V>.c f3543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    a<K, V>.e f3544g;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArrayMap.java */
    public final class C0029a extends AbstractSet<Map.Entry<K, V>> {
        C0029a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @androidx.annotation.n0
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.size();
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class b extends w<K> {
        b() {
            super(a.this.size());
        }

        @Override // androidx.collection.w
        protected K a(int i10) {
            return a.this.g(i10);
        }

        @Override // androidx.collection.w
        protected void b(int i10) {
            a.this.i(i10);
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@androidx.annotation.n0 Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@androidx.annotation.n0 Collection<?> collection) {
            return a.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return a.n(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = a.this.size() - 1; size >= 0; size--) {
                K kG = a.this.g(size);
                iHashCode += kG == null ? 0 : kG.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @androidx.annotation.n0
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = a.this.e(obj);
            if (iE < 0) {
                return false;
            }
            a.this.i(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@androidx.annotation.n0 Collection<?> collection) {
            return a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@androidx.annotation.n0 Collection<?> collection) {
            return a.this.r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        @androidx.annotation.n0
        public Object[] toArray() {
            int size = a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = a.this.g(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        @androidx.annotation.n0
        public <T> T[] toArray(@androidx.annotation.n0 T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = a.this.g(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3549c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3550d;

        d() {
            this.f3548b = a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3549c++;
            this.f3550d = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f3550d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return i0.a.c(entry.getKey(), a.this.g(this.f3549c)) && i0.a.c(entry.getValue(), a.this.k(this.f3549c));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f3550d) {
                return a.this.g(this.f3549c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f3550d) {
                return a.this.k(this.f3549c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3549c < this.f3548b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f3550d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kG = a.this.g(this.f3549c);
            V vK = a.this.k(this.f3549c);
            return (kG == null ? 0 : kG.hashCode()) ^ (vK != null ? vK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3550d) {
                throw new IllegalStateException();
            }
            a.this.i(this.f3549c);
            this.f3549c--;
            this.f3548b--;
            this.f3550d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f3550d) {
                return a.this.j(this.f3549c, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(@androidx.annotation.n0 Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @androidx.annotation.n0
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            a.this.i(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(@androidx.annotation.n0 Collection<?> collection) {
            int size = a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(a.this.k(i10))) {
                    a.this.i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(@androidx.annotation.n0 Collection<?> collection) {
            int size = a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(a.this.k(i10))) {
                    a.this.i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return a.this.size();
        }

        @Override // java.util.Collection
        @androidx.annotation.n0
        public Object[] toArray() {
            int size = a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = a.this.k(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        @androidx.annotation.n0
        public <T> T[] toArray(@androidx.annotation.n0 T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = a.this.k(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* JADX INFO: compiled from: ArrayMap.java */
    public final class f extends w<V> {
        f() {
            super(a.this.size());
        }

        @Override // androidx.collection.w
        protected V a(int i10) {
            return a.this.k(i10);
        }

        @Override // androidx.collection.w
        protected void b(int i10) {
            a.this.i(i10);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(@androidx.annotation.p0 j2 j2Var) {
        super(j2Var);
    }

    static <T> boolean n(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.j2, java.util.Map
    public boolean containsKey(@androidx.annotation.p0 Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.j2, java.util.Map
    public boolean containsValue(@androidx.annotation.p0 Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @androidx.annotation.n0
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0029a c0029a = this.f3542e;
        if (c0029a != null) {
            return c0029a;
        }
        a<K, V>.C0029a c0029a2 = new C0029a();
        this.f3542e = c0029a2;
        return c0029a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.j2, java.util.Map
    public V get(@androidx.annotation.p0 Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @androidx.annotation.n0
    public Set<K> keySet() {
        a<K, V>.c cVar = this.f3543f;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.f3543f = cVar2;
        return cVar2;
    }

    public boolean l(@androidx.annotation.n0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean p(@androidx.annotation.n0 Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(@androidx.annotation.n0 Map<? extends K, ? extends V> map) {
        b(size() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean r(@androidx.annotation.n0 Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                i(size2);
            }
        }
        return size != size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.j2, java.util.Map
    public V remove(@androidx.annotation.p0 Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    @androidx.annotation.n0
    public Collection<V> values() {
        a<K, V>.e eVar = this.f3544g;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.f3544g = eVar2;
        return eVar2;
    }
}
