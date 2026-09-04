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

/* JADX INFO: compiled from: DirectedMultiNetworkConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class q<N, E> extends e<N, E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Reference<s1<N>> f58433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient Reference<s1<N>> f58434e;

    /* JADX INFO: compiled from: DirectedMultiNetworkConnections.java */
    public class a extends n0<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f58435d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.f58435d = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q.this.s().E1(this.f58435d);
        }
    }

    private q(Map<E, N> map, Map<E, N> map2, int i10) {
        super(map, map2, i10);
    }

    @CheckForNull
    private static <T> T o(@CheckForNull Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    static <N, E> q<N, E> p() {
        return new q<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    static <N, E> q<N, E> q(Map<E, N> map, Map<E, N> map2, int i10) {
        return new q<>(ImmutableMap.g(map), ImmutableMap.g(map2), i10);
    }

    private s1<N> r() {
        s1<N> s1Var = (s1) o(this.f58433d);
        if (s1Var != null) {
            return s1Var;
        }
        HashMultiset hashMultisetS = HashMultiset.s(this.f58364a.values());
        this.f58433d = new SoftReference(hashMultisetS);
        return hashMultisetS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s1<N> s() {
        s1<N> s1Var = (s1) o(this.f58434e);
        if (s1Var != null) {
            return s1Var;
        }
        HashMultiset hashMultisetS = HashMultiset.s(this.f58365b.values());
        this.f58434e = new SoftReference(hashMultisetS);
        return hashMultisetS;
    }

    @Override // com.google.common.graph.u0
    public Set<N> b() {
        return Collections.unmodifiableSet(s().c());
    }

    @Override // com.google.common.graph.u0
    public Set<N> c() {
        return Collections.unmodifiableSet(r().c());
    }

    @Override // com.google.common.graph.e, com.google.common.graph.u0
    public N f(E e10) {
        N n10 = (N) super.f(e10);
        s1 s1Var = (s1) o(this.f58434e);
        if (s1Var != null) {
            com.google.common.base.w.g0(s1Var.remove(n10));
        }
        return n10;
    }

    @Override // com.google.common.graph.e, com.google.common.graph.u0
    public N h(E e10, boolean z10) {
        N n10 = (N) super.h(e10, z10);
        s1 s1Var = (s1) o(this.f58433d);
        if (s1Var != null) {
            com.google.common.base.w.g0(s1Var.remove(n10));
        }
        return n10;
    }

    @Override // com.google.common.graph.e, com.google.common.graph.u0
    public void i(E e10, N n10) {
        super.i(e10, n10);
        s1 s1Var = (s1) o(this.f58434e);
        if (s1Var != null) {
            com.google.common.base.w.g0(s1Var.add(n10));
        }
    }

    @Override // com.google.common.graph.e, com.google.common.graph.u0
    public void j(E e10, N n10, boolean z10) {
        super.j(e10, n10, z10);
        s1 s1Var = (s1) o(this.f58433d);
        if (s1Var != null) {
            com.google.common.base.w.g0(s1Var.add(n10));
        }
    }

    @Override // com.google.common.graph.u0
    public Set<E> l(N n10) {
        return new a(this.f58365b, n10, n10);
    }
}
