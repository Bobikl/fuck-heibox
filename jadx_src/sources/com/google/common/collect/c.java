package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class c<K, V> implements r1<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Collection<Map.Entry<K, V>> f58057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Set<K> f58058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient s1<K> f58059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Collection<V> f58060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Map<K, Collection<V>> f58061f;

    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class a extends Multimaps.b<K, V> {
        a() {
        }

        @Override // com.google.common.collect.Multimaps.b
        r1<K, V> a() {
            return c.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return c.this.k();
        }
    }

    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class b extends c<K, V>.a implements Set<Map.Entry<K, V>> {
        b(c cVar) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return Sets.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.k(this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class C0464c extends AbstractCollection<V> {
        C0464c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return c.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return c.this.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c.this.size();
        }
    }

    c() {
    }

    @Override // com.google.common.collect.r1
    @s9.a
    public boolean A(r1<? extends K, ? extends V> r1Var) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : r1Var.i()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    @Override // com.google.common.collect.r1
    public boolean D0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection = e().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public Collection<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        com.google.common.base.w.E(iterable);
        Collection<V> collectionA = a(k10);
        t0(k10, iterable);
        return collectionA;
    }

    abstract Map<K, Collection<V>> c();

    @Override // com.google.common.collect.r1
    public boolean containsValue(@CheckForNull Object obj) {
        Iterator<Collection<V>> it = e().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Collection<Map.Entry<K, V>> d();

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    public Map<K, Collection<V>> e() {
        Map<K, Collection<V>> map = this.f58061f;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapC = c();
        this.f58061f = mapC;
        return mapC;
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    public boolean equals(@CheckForNull Object obj) {
        return Multimaps.g(this, obj);
    }

    abstract Set<K> f();

    abstract s1<K> h();

    @Override // com.google.common.collect.r1
    public int hashCode() {
        return e().hashCode();
    }

    @Override // com.google.common.collect.r1
    public Collection<Map.Entry<K, V>> i() {
        Collection<Map.Entry<K, V>> collection = this.f58057b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionD = d();
        this.f58057b = collectionD;
        return collectionD;
    }

    @Override // com.google.common.collect.r1
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract Collection<V> j();

    abstract Iterator<Map.Entry<K, V>> k();

    @Override // com.google.common.collect.r1
    public Set<K> keySet() {
        Set<K> set = this.f58058c;
        if (set != null) {
            return set;
        }
        Set<K> setF = f();
        this.f58058c = setF;
        return setF;
    }

    Iterator<V> l() {
        return Maps.O0(i().iterator());
    }

    @Override // com.google.common.collect.r1
    public s1<K> n0() {
        s1<K> s1Var = this.f58059d;
        if (s1Var != null) {
            return s1Var;
        }
        s1<K> s1VarH = h();
        this.f58059d = s1VarH;
        return s1VarH;
    }

    @Override // com.google.common.collect.r1
    @s9.a
    public boolean put(@x1 K k10, @x1 V v10) {
        return v(k10).add(v10);
    }

    @Override // com.google.common.collect.r1
    @s9.a
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Collection<V> collection = e().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // com.google.common.collect.r1
    @s9.a
    public boolean t0(@x1 K k10, Iterable<? extends V> iterable) {
        com.google.common.base.w.E(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && v(k10).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && Iterators.a(v(k10), it);
    }

    public String toString() {
        return e().toString();
    }

    @Override // com.google.common.collect.r1
    public Collection<V> values() {
        Collection<V> collection = this.f58060e;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionJ = j();
        this.f58060e = collectionJ;
        return collectionJ;
    }
}
