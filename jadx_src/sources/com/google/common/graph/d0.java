package com.google.common.graph;

import com.google.common.base.Functions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Set;

/* JADX INFO: compiled from: ImmutableGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.j(containerOf = {"N"})
@o9.a
@t
public class d0<N> extends w<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l<N> f58361a;

    /* JADX INFO: compiled from: ImmutableGraph.java */
    public static class a<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0<N> f58362a;

        a(b0<N> b0Var) {
            this.f58362a = b0Var.d().i(ElementOrder.g()).b();
        }

        @s9.a
        public a<N> a(N n10) {
            this.f58362a.p(n10);
            return this;
        }

        public d0<N> b() {
            return d0.S(this.f58362a);
        }

        @s9.a
        public a<N> c(u<N> uVar) {
            this.f58362a.E(uVar);
            return this;
        }

        @s9.a
        public a<N> d(N n10, N n11) {
            this.f58362a.J(n10, n11);
            return this;
        }
    }

    d0(l<N> lVar) {
        this.f58361a = lVar;
    }

    private static <N> c0<N, GraphConstants.Presence> R(a0<N> a0Var, N n10) {
        com.google.common.base.n nVarB = Functions.b(GraphConstants.Presence.EDGE_EXISTS);
        return a0Var.c() ? p.y(n10, a0Var.n(n10), nVarB) : e1.m(Maps.j(a0Var.d(n10), nVarB));
    }

    public static <N> d0<N> S(a0<N> a0Var) {
        return a0Var instanceof d0 ? (d0) a0Var : new d0<>(new b1(b0.g(a0Var), U(a0Var), a0Var.g().size()));
    }

    @Deprecated
    public static <N> d0<N> T(d0<N> d0Var) {
        return (d0) com.google.common.base.w.E(d0Var);
    }

    private static <N> ImmutableMap<N, c0<N, GraphConstants.Presence>> U(a0<N> a0Var) {
        ImmutableMap.b bVarB = ImmutableMap.b();
        for (N n10 : a0Var.e()) {
            bVarB.i(n10, R(a0Var, n10));
        }
        return bVarB.d();
    }

    @Override // com.google.common.graph.w
    l<N> Q() {
        return this.f58361a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.l
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.l
    public /* bridge */ /* synthetic */ Set d(Object obj) {
        return super.d(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.l
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return super.f(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ boolean h(Object obj, Object obj2) {
        return super.h(obj, obj2);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ boolean i(u uVar) {
        return super.i(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return super.j(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.l
    public /* bridge */ /* synthetic */ ElementOrder k() {
        return super.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ int l(Object obj) {
        return super.l(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.l
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set n(Object obj) {
        return super.n(obj);
    }

    @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
    public ElementOrder<N> q() {
        return ElementOrder.g();
    }
}
