package com.google.common.graph;

import com.google.common.base.Optional;

/* JADX INFO: compiled from: GraphBuilder.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@s9.f
@t
public final class b0<N> extends g<N> {
    private b0(boolean z10) {
        super(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N> b0<N1> c() {
        return this;
    }

    public static b0<Object> e() {
        return new b0<>(true);
    }

    public static <N> b0<N> g(a0<N> a0Var) {
        return new b0(a0Var.c()).a(a0Var.m()).j(a0Var.k()).i(a0Var.q());
    }

    public static b0<Object> k() {
        return new b0<>(false);
    }

    public b0<N> a(boolean z10) {
        this.f58376b = z10;
        return this;
    }

    public <N1 extends N> o0<N1> b() {
        return new x0(this);
    }

    b0<N> d() {
        b0<N> b0Var = new b0<>(this.f58375a);
        b0Var.f58376b = this.f58376b;
        b0Var.f58377c = this.f58377c;
        b0Var.f58379e = this.f58379e;
        b0Var.f58378d = this.f58378d;
        return b0Var;
    }

    public b0<N> f(int i10) {
        this.f58379e = Optional.f(Integer.valueOf(Graphs.b(i10)));
        return this;
    }

    public <N1 extends N> d0.a<N1> h() {
        return new d0.a<>(c());
    }

    public <N1 extends N> b0<N1> i(ElementOrder<N1> elementOrder) {
        com.google.common.base.w.u(elementOrder.h() == ElementOrder.Type.UNORDERED || elementOrder.h() == ElementOrder.Type.STABLE, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", elementOrder);
        b0<N1> b0VarC = c();
        b0VarC.f58378d = (ElementOrder) com.google.common.base.w.E(elementOrder);
        return b0VarC;
    }

    public <N1 extends N> b0<N1> j(ElementOrder<N1> elementOrder) {
        b0<N1> b0VarC = c();
        b0VarC.f58377c = (ElementOrder) com.google.common.base.w.E(elementOrder);
        return b0VarC;
    }
}
