package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FilteredKeyMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public class z<K, V> extends com.google.common.collect.c<K, V> implements b0<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final r1<K, V> f58221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.google.common.base.x<? super K> f58222h;

    /* JADX INFO: compiled from: FilteredKeyMultimap.java */
    public static class a<K, V> extends p0<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final K f58223b;

        a(@x1 K k10) {
            this.f58223b = k10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.p0, com.google.common.collect.h0
        /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
        public List<V> H0() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.p0, java.util.List
        public void add(int i10, @x1 V v10) {
            com.google.common.base.w.d0(i10, 0);
            String strValueOf = String.valueOf(this.f58223b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32);
            sb2.append("Key does not satisfy predicate: ");
            sb2.append(strValueOf);
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Queue
        public boolean add(@x1 V v10) {
            add(0, v10);
            return true;
        }

        @Override // com.google.common.collect.p0, java.util.List
        @s9.a
        public boolean addAll(int i10, Collection<? extends V> collection) {
            com.google.common.base.w.E(collection);
            com.google.common.base.w.d0(i10, 0);
            String strValueOf = String.valueOf(this.f58223b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32);
            sb2.append("Key does not satisfy predicate: ");
            sb2.append(strValueOf);
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.common.collect.h0, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }
    }

    /* JADX INFO: compiled from: FilteredKeyMultimap.java */
    public static class b<K, V> extends a1<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final K f58224b;

        b(@x1 K k10) {
            this.f58224b = k10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a1, com.google.common.collect.h0
        /* JADX INFO: renamed from: X0 */
        public Set<V> H0() {
            return Collections.emptySet();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Queue
        public boolean add(@x1 V v10) {
            String strValueOf = String.valueOf(this.f58224b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32);
            sb2.append("Key does not satisfy predicate: ");
            sb2.append(strValueOf);
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.common.collect.h0, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            com.google.common.base.w.E(collection);
            String strValueOf = String.valueOf(this.f58224b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32);
            sb2.append("Key does not satisfy predicate: ");
            sb2.append(strValueOf);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: FilteredKeyMultimap.java */
    public class c extends h0<Map.Entry<K, V>> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.h0, com.google.common.collect.y0
        public Collection<Map.Entry<K, V>> H0() {
            return o.d(z.this.f58221g.i(), z.this.U());
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (z.this.f58221g.containsKey(entry.getKey()) && z.this.f58222h.apply((Object) entry.getKey())) {
                return z.this.f58221g.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }
    }

    z(r1<K, V> r1Var, com.google.common.base.x<? super K> xVar) {
        this.f58221g = (r1) com.google.common.base.w.E(r1Var);
        this.f58222h = (com.google.common.base.x) com.google.common.base.w.E(xVar);
    }

    @Override // com.google.common.collect.b0
    public com.google.common.base.x<? super Map.Entry<K, V>> U() {
        return Maps.U(this.f58222h);
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    public Collection<V> a(@CheckForNull Object obj) {
        return containsKey(obj) ? this.f58221g.a(obj) : m();
    }

    @Override // com.google.common.collect.c
    Map<K, Collection<V>> c() {
        return Maps.G(this.f58221g.e(), this.f58222h);
    }

    @Override // com.google.common.collect.r1
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.r1
    public boolean containsKey(@CheckForNull Object obj) {
        if (this.f58221g.containsKey(obj)) {
            return this.f58222h.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.c
    Collection<Map.Entry<K, V>> d() {
        return new c();
    }

    @Override // com.google.common.collect.c
    Set<K> f() {
        return Sets.i(this.f58221g.keySet(), this.f58222h);
    }

    public r1<K, V> g() {
        return this.f58221g;
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public Collection<V> v(@x1 K k10) {
        if (this.f58222h.apply(k10)) {
            return this.f58221g.v(k10);
        }
        return this.f58221g instanceof i2 ? new b(k10) : new a(k10);
    }

    @Override // com.google.common.collect.c
    s1<K> h() {
        return Multisets.j(this.f58221g.n0(), this.f58222h);
    }

    @Override // com.google.common.collect.c
    Collection<V> j() {
        return new c0(this);
    }

    @Override // com.google.common.collect.c
    Iterator<Map.Entry<K, V>> k() {
        throw new AssertionError("should never be called");
    }

    Collection<V> m() {
        return this.f58221g instanceof i2 ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // com.google.common.collect.r1
    public int size() {
        Iterator<Collection<V>> it = e().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }
}
