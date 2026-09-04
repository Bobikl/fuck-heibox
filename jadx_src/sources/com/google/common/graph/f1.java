package com.google.common.graph;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.s1;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: UndirectedMultiNetworkConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class f1<N, E> extends i<N, E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Reference<s1<N>> f58372b;

    /* JADX INFO: compiled from: UndirectedMultiNetworkConnections.java */
    public class a extends n0<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f58373d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.f58373d = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f1.this.n().E1(this.f58373d);
        }
    }

    private f1(Map<E, N> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s1<N> n() {
        s1<N> s1Var = (s1) o(this.f58372b);
        if (s1Var != null) {
            return s1Var;
        }
        HashMultiset hashMultisetS = HashMultiset.s(this.f58390a.values());
        this.f58372b = new SoftReference(hashMultisetS);
        return hashMultisetS;
    }

    @CheckForNull
    private static <T> T o(@CheckForNull Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    static <N, E> f1<N, E> p() {
        return new f1<>(new HashMap(2, 1.0f));
    }

    static <N, E> f1<N, E> q(Map<E, N> map) {
        return new f1<>(ImmutableMap.g(map));
    }

    @Override // com.google.common.graph.u0
    public Set<N> a() {
        return Collections.unmodifiableSet(n().c());
    }

    @Override // com.google.common.graph.i, com.google.common.graph.u0
    public N f(E e10) {
        N n10 = (N) super.f(e10);
        s1 s1Var = (s1) o(this.f58372b);
        if (s1Var != null) {
            com.google.common.base.w.g0(s1Var.remove(n10));
        }
        return n10;
    }

    @Override // com.google.common.graph.i, com.google.common.graph.u0
    @CheckForNull
    public N h(E e10, boolean z10) {
        if (z10) {
            return null;
        }
        return f(e10);
    }

    @Override // com.google.common.graph.i, com.google.common.graph.u0
    public void i(E e10, N n10) {
        super.i(e10, n10);
        s1 s1Var = (s1) o(this.f58372b);
        if (s1Var != null) {
            com.google.common.base.w.g0(s1Var.add(n10));
        }
    }

    @Override // com.google.common.graph.i, com.google.common.graph.u0
    public void j(E e10, N n10, boolean z10) {
        if (z10) {
            return;
        }
        i(e10, n10);
    }

    @Override // com.google.common.graph.u0
    public Set<E> l(N n10) {
        return new a(this.f58390a, n10, n10);
    }
}
