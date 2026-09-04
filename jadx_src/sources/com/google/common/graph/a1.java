package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: StandardNetwork.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public class a1<N, E> extends h<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f58345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f58347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ElementOrder<N> f58348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ElementOrder<E> f58349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final l0<N, u0<N, E>> f58350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final l0<E, N> f58351g;

    a1(t0<? super N, ? super E> t0Var) {
        this(t0Var, t0Var.f58377c.c(t0Var.f58379e.i(10).intValue()), t0Var.f58440g.c(t0Var.f58441h.i(20).intValue()));
    }

    a1(t0<? super N, ? super E> t0Var, Map<N, u0<N, E>> map, Map<E, N> map2) {
        this.f58345a = t0Var.f58375a;
        this.f58346b = t0Var.f58439f;
        this.f58347c = t0Var.f58376b;
        this.f58348d = (ElementOrder<N>) t0Var.f58377c.a();
        this.f58349e = (ElementOrder<E>) t0Var.f58440g.a();
        this.f58350f = map instanceof TreeMap ? new m0<>(map) : new l0<>(map);
        this.f58351g = new l0<>(map2);
    }

    @Override // com.google.common.graph.s0
    public boolean B() {
        return this.f58346b;
    }

    @Override // com.google.common.graph.s0
    public u<N> I(E e10) {
        N nS = S(e10);
        u0<N, E> u0VarF = this.f58350f.f(nS);
        Objects.requireNonNull(u0VarF);
        return u.j(this, nS, u0VarF.d(e10));
    }

    final u0<N, E> R(N n10) {
        u0<N, E> u0VarF = this.f58350f.f(n10);
        if (u0VarF != null) {
            return u0VarF;
        }
        com.google.common.base.w.E(n10);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", n10));
    }

    final N S(E e10) {
        N nF = this.f58351g.f(e10);
        if (nF != null) {
            return nF;
        }
        com.google.common.base.w.E(e10);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", e10));
    }

    final boolean T(E e10) {
        return this.f58351g.e(e10);
    }

    final boolean U(N n10) {
        return this.f58350f.e(n10);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0, com.google.common.graph.c1, com.google.common.graph.a0
    public Set<N> a(N n10) {
        return R(n10).b();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0, com.google.common.graph.w0, com.google.common.graph.a0
    public Set<N> b(N n10) {
        return R(n10).c();
    }

    @Override // com.google.common.graph.s0
    public boolean c() {
        return this.f58345a;
    }

    @Override // com.google.common.graph.s0
    public Set<N> d(N n10) {
        return R(n10).a();
    }

    @Override // com.google.common.graph.s0
    public Set<N> e() {
        return this.f58350f.k();
    }

    @Override // com.google.common.graph.s0
    public Set<E> g() {
        return this.f58351g.k();
    }

    @Override // com.google.common.graph.s0
    public ElementOrder<N> k() {
        return this.f58348d;
    }

    @Override // com.google.common.graph.s0
    public boolean m() {
        return this.f58347c;
    }

    @Override // com.google.common.graph.s0
    public Set<E> n(N n10) {
        return R(n10).k();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public Set<E> u(N n10, N n11) {
        u0<N, E> u0VarR = R(n10);
        if (!this.f58347c && n10 == n11) {
            return ImmutableSet.D();
        }
        com.google.common.base.w.u(U(n11), "Node %s is not an element of this graph.", n11);
        return u0VarR.l(n11);
    }

    @Override // com.google.common.graph.s0
    public ElementOrder<E> v() {
        return this.f58349e;
    }

    @Override // com.google.common.graph.s0
    public Set<E> w(N n10) {
        return R(n10).e();
    }

    @Override // com.google.common.graph.s0
    public Set<E> z(N n10) {
        return R(n10).g();
    }
}
