package com.google.common.graph;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: StandardValueGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public class b1<N, V> extends j<N, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f58353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ElementOrder<N> f58355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l0<N, c0<N, V>> f58356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f58357e;

    /* JADX INFO: compiled from: StandardValueGraph.java */
    public class a extends k0<N> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f58358d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b1 b1Var, l lVar, Object obj, c0 c0Var) {
            super(lVar, obj);
            this.f58358d = c0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<u<N>> iterator() {
            return this.f58358d.h(this.f58396b);
        }
    }

    b1(g<? super N> gVar) {
        this(gVar, gVar.f58377c.c(gVar.f58379e.i(10).intValue()), 0L);
    }

    b1(g<? super N> gVar, Map<N, c0<N, V>> map, long j10) {
        this.f58353a = gVar.f58375a;
        this.f58354b = gVar.f58376b;
        this.f58355c = (ElementOrder<N>) gVar.f58377c.a();
        this.f58356d = map instanceof TreeMap ? new m0<>(map) : new l0<>(map);
        this.f58357e = Graphs.c(j10);
    }

    private final c0<N, V> R(N n10) {
        c0<N, V> c0VarF = this.f58356d.f(n10);
        if (c0VarF != null) {
            return c0VarF;
        }
        com.google.common.base.w.E(n10);
        String strValueOf = String.valueOf(n10);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
        sb2.append("Node ");
        sb2.append(strValueOf);
        sb2.append(" is not an element of this graph.");
        throw new IllegalArgumentException(sb2.toString());
    }

    @CheckForNull
    private final V T(N n10, N n11, @CheckForNull V v10) {
        c0<N, V> c0VarF = this.f58356d.f(n10);
        V vE = c0VarF == null ? null : c0VarF.e(n11);
        return vE == null ? v10 : vE;
    }

    private final boolean U(N n10, N n11) {
        c0<N, V> c0VarF = this.f58356d.f(n10);
        return c0VarF != null && c0VarF.b().contains(n11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.i1
    @CheckForNull
    public V C(N n10, N n11, @CheckForNull V v10) {
        return (V) T(com.google.common.base.w.E(n10), com.google.common.base.w.E(n11), v10);
    }

    @Override // com.google.common.graph.a
    protected long N() {
        return this.f58357e;
    }

    final boolean S(@CheckForNull N n10) {
        return this.f58356d.e(n10);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    public Set<N> a(N n10) {
        return R(n10).b();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    public Set<N> b(N n10) {
        return R(n10).c();
    }

    @Override // com.google.common.graph.l
    public boolean c() {
        return this.f58353a;
    }

    @Override // com.google.common.graph.l
    public Set<N> d(N n10) {
        return R(n10).a();
    }

    @Override // com.google.common.graph.l
    public Set<N> e() {
        return this.f58356d.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public boolean h(N n10, N n11) {
        return U(com.google.common.base.w.E(n10), com.google.common.base.w.E(n11));
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public boolean i(u<N> uVar) {
        com.google.common.base.w.E(uVar);
        return O(uVar) && U(uVar.g(), uVar.h());
    }

    @Override // com.google.common.graph.l
    public ElementOrder<N> k() {
        return this.f58355c;
    }

    @Override // com.google.common.graph.l
    public boolean m() {
        return this.f58354b;
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public Set<u<N>> n(N n10) {
        return new a(this, this, n10, R(n10));
    }

    @Override // com.google.common.graph.i1
    @CheckForNull
    public V y(u<N> uVar, @CheckForNull V v10) {
        P(uVar);
        return T(uVar.g(), uVar.h(), v10);
    }
}
