package com.google.common.graph;

import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.b3;
import com.google.common.collect.l1;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractDirectedNetworkConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class e<N, E> implements u0<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<E, N> f58364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<E, N> f58365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58366c;

    /* JADX INFO: compiled from: AbstractDirectedNetworkConnections.java */
    public class a extends AbstractSet<E> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b3<E> iterator() {
            return Iterators.f0((e.this.f58366c == 0 ? l1.f(e.this.f58364a.keySet(), e.this.f58365b.keySet()) : Sets.N(e.this.f58364a.keySet(), e.this.f58365b.keySet())).iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return e.this.f58364a.containsKey(obj) || e.this.f58365b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.f.t(e.this.f58364a.size(), e.this.f58365b.size() - e.this.f58366c);
        }
    }

    e(Map<E, N> map, Map<E, N> map2, int i10) {
        this.f58364a = (Map) com.google.common.base.w.E(map);
        this.f58365b = (Map) com.google.common.base.w.E(map2);
        this.f58366c = Graphs.b(i10);
        com.google.common.base.w.g0(i10 <= map.size() && i10 <= map2.size());
    }

    @Override // com.google.common.graph.u0
    public Set<N> a() {
        return Sets.N(c(), b());
    }

    @Override // com.google.common.graph.u0
    public N d(E e10) {
        N n10 = this.f58365b.get(e10);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.u0
    public Set<E> e() {
        return Collections.unmodifiableSet(this.f58364a.keySet());
    }

    @Override // com.google.common.graph.u0
    public N f(E e10) {
        N nRemove = this.f58365b.remove(e10);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.u0
    public Set<E> g() {
        return Collections.unmodifiableSet(this.f58365b.keySet());
    }

    @Override // com.google.common.graph.u0
    public N h(E e10, boolean z10) {
        if (z10) {
            int i10 = this.f58366c - 1;
            this.f58366c = i10;
            Graphs.b(i10);
        }
        N nRemove = this.f58364a.remove(e10);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.u0
    public void i(E e10, N n10) {
        com.google.common.base.w.E(e10);
        com.google.common.base.w.E(n10);
        com.google.common.base.w.g0(this.f58365b.put(e10, n10) == null);
    }

    @Override // com.google.common.graph.u0
    public void j(E e10, N n10, boolean z10) {
        com.google.common.base.w.E(e10);
        com.google.common.base.w.E(n10);
        if (z10) {
            int i10 = this.f58366c + 1;
            this.f58366c = i10;
            Graphs.d(i10);
        }
        com.google.common.base.w.g0(this.f58364a.put(e10, n10) == null);
    }

    @Override // com.google.common.graph.u0
    public Set<E> k() {
        return new a();
    }
}
