package com.google.common.graph;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractUndirectedNetworkConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class i<N, E> implements u0<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<E, N> f58390a;

    i(Map<E, N> map) {
        this.f58390a = (Map) com.google.common.base.w.E(map);
    }

    @Override // com.google.common.graph.u0
    public Set<N> b() {
        return a();
    }

    @Override // com.google.common.graph.u0
    public Set<N> c() {
        return a();
    }

    @Override // com.google.common.graph.u0
    public N d(E e10) {
        N n10 = this.f58390a.get(e10);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.u0
    public Set<E> e() {
        return k();
    }

    @Override // com.google.common.graph.u0
    public N f(E e10) {
        N nRemove = this.f58390a.remove(e10);
        Objects.requireNonNull(nRemove);
        return nRemove;
    }

    @Override // com.google.common.graph.u0
    public Set<E> g() {
        return k();
    }

    @Override // com.google.common.graph.u0
    @CheckForNull
    public N h(E e10, boolean z10) {
        if (z10) {
            return null;
        }
        return f(e10);
    }

    @Override // com.google.common.graph.u0
    public void i(E e10, N n10) {
        com.google.common.base.w.g0(this.f58390a.put(e10, n10) == null);
    }

    @Override // com.google.common.graph.u0
    public void j(E e10, N n10, boolean z10) {
        if (z10) {
            return;
        }
        i(e10, n10);
    }

    @Override // com.google.common.graph.u0
    public Set<E> k() {
        return Collections.unmodifiableSet(this.f58390a.keySet());
    }
}
