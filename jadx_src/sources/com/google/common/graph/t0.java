package com.google.common.graph;

import com.google.common.base.Optional;

/* JADX INFO: compiled from: NetworkBuilder.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@t
public final class t0<N, E> extends g<N> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f58439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ElementOrder<? super E> f58440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Optional<Integer> f58441h;

    private t0(boolean z10) {
        super(z10);
        this.f58439f = false;
        this.f58440g = ElementOrder.d();
        this.f58441h = Optional.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, E1 extends E> t0<N1, E1> d() {
        return this;
    }

    public static t0<Object, Object> e() {
        return new t0<>(true);
    }

    public static <N, E> t0<N, E> i(s0<N, E> s0Var) {
        return new t0(s0Var.c()).a(s0Var.B()).b(s0Var.m()).k(s0Var.k()).f(s0Var.v());
    }

    public static t0<Object, Object> l() {
        return new t0<>(false);
    }

    public t0<N, E> a(boolean z10) {
        this.f58439f = z10;
        return this;
    }

    public t0<N, E> b(boolean z10) {
        this.f58376b = z10;
        return this;
    }

    public <N1 extends N, E1 extends E> p0<N1, E1> c() {
        return new y0(this);
    }

    public <E1 extends E> t0<N, E1> f(ElementOrder<E1> elementOrder) {
        t0<N, E1> t0Var = (t0<N, E1>) d();
        t0Var.f58440g = (ElementOrder) com.google.common.base.w.E(elementOrder);
        return t0Var;
    }

    public t0<N, E> g(int i10) {
        this.f58441h = Optional.f(Integer.valueOf(Graphs.b(i10)));
        return this;
    }

    public t0<N, E> h(int i10) {
        this.f58379e = Optional.f(Integer.valueOf(Graphs.b(i10)));
        return this;
    }

    public <N1 extends N, E1 extends E> h0.a<N1, E1> j() {
        return new h0.a<>(d());
    }

    public <N1 extends N> t0<N1, E> k(ElementOrder<N1> elementOrder) {
        t0<N1, E> t0Var = (t0<N1, E>) d();
        t0Var.f58377c = (ElementOrder) com.google.common.base.w.E(elementOrder);
        return t0Var;
    }
}
