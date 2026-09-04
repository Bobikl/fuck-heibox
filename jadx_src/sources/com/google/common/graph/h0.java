package com.google.common.graph;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ImmutableNetwork.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.j(containerOf = {"N", androidx.exifinterface.media.a.S4})
@o9.a
@t
public final class h0<N, E> extends a1<N, E> {

    /* JADX INFO: compiled from: ImmutableNetwork.java */
    public static class a<N, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p0<N, E> f58389a;

        a(t0<N, E> t0Var) {
            this.f58389a = (p0<N, E>) t0Var.c();
        }

        @s9.a
        public a<N, E> a(u<N> uVar, E e10) {
            this.f58389a.D(uVar, e10);
            return this;
        }

        @s9.a
        public a<N, E> b(N n10, N n11, E e10) {
            this.f58389a.M(n10, n11, e10);
            return this;
        }

        @s9.a
        public a<N, E> c(N n10) {
            this.f58389a.p(n10);
            return this;
        }

        public h0<N, E> d() {
            return h0.c0(this.f58389a);
        }
    }

    private h0(s0<N, E> s0Var) {
        super(t0.i(s0Var), e0(s0Var), d0(s0Var));
    }

    private static <N, E> com.google.common.base.n<E, N> Y(final s0<N, E> s0Var, final N n10) {
        return new com.google.common.base.n() { // from class: com.google.common.graph.g0
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return h0.f0(s0Var, n10, obj);
            }
        };
    }

    private static <N, E> u0<N, E> a0(s0<N, E> s0Var, N n10) {
        if (!s0Var.c()) {
            Map mapJ = Maps.j(s0Var.n(n10), Y(s0Var, n10));
            return s0Var.B() ? f1.q(mapJ) : g1.n(mapJ);
        }
        Map mapJ2 = Maps.j(s0Var.w(n10), i0(s0Var));
        Map mapJ3 = Maps.j(s0Var.z(n10), j0(s0Var));
        int size = s0Var.u(n10, n10).size();
        return s0Var.B() ? q.q(mapJ2, mapJ3, size) : r.o(mapJ2, mapJ3, size);
    }

    @Deprecated
    public static <N, E> h0<N, E> b0(h0<N, E> h0Var) {
        return (h0) com.google.common.base.w.E(h0Var);
    }

    public static <N, E> h0<N, E> c0(s0<N, E> s0Var) {
        return s0Var instanceof h0 ? (h0) s0Var : new h0<>(s0Var);
    }

    private static <N, E> Map<E, N> d0(s0<N, E> s0Var) {
        ImmutableMap.b bVarB = ImmutableMap.b();
        for (E e10 : s0Var.g()) {
            bVarB.i(e10, s0Var.I(e10).g());
        }
        return bVarB.d();
    }

    private static <N, E> Map<N, u0<N, E>> e0(s0<N, E> s0Var) {
        ImmutableMap.b bVarB = ImmutableMap.b();
        for (N n10 : s0Var.e()) {
            bVarB.i(n10, a0(s0Var, n10));
        }
        return bVarB.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f0(s0 s0Var, Object obj, Object obj2) {
        return s0Var.I(obj2).a(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g0(s0 s0Var, Object obj) {
        return s0Var.I(obj).m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h0(s0 s0Var, Object obj) {
        return s0Var.I(obj).o();
    }

    private static <N, E> com.google.common.base.n<E, N> i0(final s0<N, E> s0Var) {
        return new com.google.common.base.n() { // from class: com.google.common.graph.e0
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return h0.g0(s0Var, obj);
            }
        };
    }

    private static <N, E> com.google.common.base.n<E, N> j0(final s0<N, E> s0Var) {
        return new com.google.common.base.n() { // from class: com.google.common.graph.f0
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return h0.h0(s0Var, obj);
            }
        };
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ boolean B() {
        return super.B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ u I(Object obj) {
        return super.I(obj);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public d0<N> t() {
        return new d0<>(super.t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.h, com.google.common.graph.s0, com.google.common.graph.c1, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.h, com.google.common.graph.s0, com.google.common.graph.w0, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b(obj);
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set d(Object obj) {
        return super.d(obj);
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set g() {
        return super.g();
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ ElementOrder k() {
        return super.k();
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set n(Object obj) {
        return super.n(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.h, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set u(Object obj, Object obj2) {
        return super.u(obj, obj2);
    }

    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ ElementOrder v() {
        return super.v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set w(Object obj) {
        return super.w(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a1, com.google.common.graph.s0
    public /* bridge */ /* synthetic */ Set z(Object obj) {
        return super.z(obj);
    }
}
