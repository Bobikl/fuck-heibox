package com.google.common.graph;

import com.google.common.base.Optional;

/* JADX INFO: compiled from: ValueGraphBuilder.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@t
public final class j1<N, V> extends g<N> {
    private j1(boolean z10) {
        super(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, V1 extends V> j1<N1, V1> c() {
        return this;
    }

    public static j1<Object, Object> e() {
        return new j1<>(true);
    }

    public static <N, V> j1<N, V> g(i1<N, V> i1Var) {
        return new j1(i1Var.c()).a(i1Var.m()).j(i1Var.k()).i(i1Var.q());
    }

    public static j1<Object, Object> k() {
        return new j1<>(false);
    }

    public j1<N, V> a(boolean z10) {
        this.f58376b = z10;
        return this;
    }

    public <N1 extends N, V1 extends V> q0<N1, V1> b() {
        return new z0(this);
    }

    j1<N, V> d() {
        j1<N, V> j1Var = new j1<>(this.f58375a);
        j1Var.f58376b = this.f58376b;
        j1Var.f58377c = this.f58377c;
        j1Var.f58379e = this.f58379e;
        j1Var.f58378d = this.f58378d;
        return j1Var;
    }

    public j1<N, V> f(int i10) {
        this.f58379e = Optional.f(Integer.valueOf(Graphs.b(i10)));
        return this;
    }

    public <N1 extends N, V1 extends V> j0.a<N1, V1> h() {
        return new j0.a<>(c());
    }

    public <N1 extends N> j1<N1, V> i(ElementOrder<N1> elementOrder) {
        com.google.common.base.w.u(elementOrder.h() == ElementOrder.Type.UNORDERED || elementOrder.h() == ElementOrder.Type.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        j1<N1, V> j1Var = (j1<N1, V>) c();
        j1Var.f58378d = (ElementOrder) com.google.common.base.w.E(elementOrder);
        return j1Var;
    }

    public <N1 extends N> j1<N1, V> j(ElementOrder<N1> elementOrder) {
        j1<N1, V> j1Var = (j1<N1, V>) c();
        j1Var.f58377c = (ElementOrder) com.google.common.base.w.E(elementOrder);
        return j1Var;
    }
}
