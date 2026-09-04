package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractTable.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class i<R, C, V> implements u2<R, C, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Set<u2.a<R, C, V>> f58083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Collection<V> f58084c;

    /* JADX INFO: compiled from: AbstractTable.java */
    public class a extends w2<u2.a<R, C, V>, V> {
        a(i iVar, Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.w2
        @x1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(u2.a<R, C, V> aVar) {
            return aVar.getValue();
        }
    }

    /* JADX INFO: compiled from: AbstractTable.java */
    public class b extends AbstractSet<u2.a<R, C, V>> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof u2.a)) {
                return false;
            }
            u2.a aVar = (u2.a) obj;
            Map map = (Map) Maps.p0(i.this.h(), aVar.b());
            return map != null && o.j(map.entrySet(), Maps.O(aVar.a(), aVar.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<u2.a<R, C, V>> iterator() {
            return i.this.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof u2.a)) {
                return false;
            }
            u2.a aVar = (u2.a) obj;
            Map map = (Map) Maps.p0(i.this.h(), aVar.b());
            return map != null && o.k(map.entrySet(), Maps.O(aVar.a(), aVar.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.size();
        }
    }

    /* JADX INFO: compiled from: AbstractTable.java */
    public class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return i.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return i.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return i.this.size();
        }
    }

    i() {
    }

    @Override // com.google.common.collect.u2
    public boolean A0(@CheckForNull Object obj) {
        return Maps.o0(h(), obj);
    }

    @Override // com.google.common.collect.u2
    @CheckForNull
    public V Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) Maps.p0(h(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.p0(map, obj2);
    }

    @Override // com.google.common.collect.u2
    public boolean Z(@CheckForNull Object obj) {
        return Maps.o0(a0(), obj);
    }

    abstract Iterator<u2.a<R, C, V>> a();

    Set<u2.a<R, C, V>> b() {
        return new b();
    }

    Collection<V> c() {
        return new c();
    }

    @Override // com.google.common.collect.u2
    public void clear() {
        Iterators.h(v0().iterator());
    }

    @Override // com.google.common.collect.u2
    public boolean containsValue(@CheckForNull Object obj) {
        Iterator<Map<C, V>> it = h().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    Iterator<V> d() {
        return new a(this, v0().iterator());
    }

    @Override // com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public V d0(@x1 R r10, @x1 C c10, @x1 V v10) {
        return E0(r10).put(c10, v10);
    }

    @Override // com.google.common.collect.u2
    public boolean equals(@CheckForNull Object obj) {
        return Tables.b(this, obj);
    }

    @Override // com.google.common.collect.u2
    public boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) Maps.p0(h(), obj);
        return map != null && Maps.o0(map, obj2);
    }

    @Override // com.google.common.collect.u2
    public int hashCode() {
        return v0().hashCode();
    }

    @Override // com.google.common.collect.u2
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.u2
    public Set<R> j() {
        return h().keySet();
    }

    @Override // com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) Maps.p0(h(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.q0(map, obj2);
    }

    @Override // com.google.common.collect.u2
    public void s0(u2<? extends R, ? extends C, ? extends V> u2Var) {
        for (u2.a<? extends R, ? extends C, ? extends V> aVar : u2Var.v0()) {
            d0(aVar.b(), aVar.a(), aVar.getValue());
        }
    }

    public String toString() {
        return h().toString();
    }

    @Override // com.google.common.collect.u2
    public Set<u2.a<R, C, V>> v0() {
        Set<u2.a<R, C, V>> set = this.f58083b;
        if (set != null) {
            return set;
        }
        Set<u2.a<R, C, V>> setB = b();
        this.f58083b = setB;
        return setB;
    }

    @Override // com.google.common.collect.u2
    public Collection<V> values() {
        Collection<V> collection = this.f58084c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionC = c();
        this.f58084c = collectionC;
        return collectionC;
    }

    @Override // com.google.common.collect.u2
    public Set<C> y0() {
        return a0().keySet();
    }
}
