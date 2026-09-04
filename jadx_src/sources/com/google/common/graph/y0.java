package com.google.common.graph;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.b3;
import java.util.Objects;

/* JADX INFO: compiled from: StandardMutableNetwork.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class y0<N, E> extends a1<N, E> implements p0<N, E> {
    y0(t0<? super N, ? super E> t0Var) {
        super(t0Var);
    }

    @s9.a
    private u0<N, E> V(N n10) {
        u0<N, E> u0VarW = W();
        com.google.common.base.w.g0(this.f58350f.i(n10, u0VarW) == null);
        return u0VarW;
    }

    private u0<N, E> W() {
        if (c()) {
            return B() ? q.p() : r.n();
        }
        return B() ? f1.p() : g1.m();
    }

    @Override // com.google.common.graph.p0
    @s9.a
    public boolean D(u<N> uVar, E e10) {
        Q(uVar);
        return M(uVar.g(), uVar.h(), e10);
    }

    @Override // com.google.common.graph.p0
    @s9.a
    public boolean L(E e10) {
        com.google.common.base.w.F(e10, "edge");
        N nF = this.f58351g.f(e10);
        boolean z10 = false;
        if (nF == null) {
            return false;
        }
        u0<N, E> u0VarF = this.f58350f.f(nF);
        Objects.requireNonNull(u0VarF);
        u0<N, E> u0Var = u0VarF;
        N nD = u0Var.d(e10);
        u0<N, E> u0VarF2 = this.f58350f.f(nD);
        Objects.requireNonNull(u0VarF2);
        u0<N, E> u0Var2 = u0VarF2;
        u0Var.f(e10);
        if (m() && nF.equals(nD)) {
            z10 = true;
        }
        u0Var2.h(e10, z10);
        this.f58351g.j(e10);
        return true;
    }

    @Override // com.google.common.graph.p0
    @s9.a
    public boolean M(N n10, N n11, E e10) {
        com.google.common.base.w.F(n10, "nodeU");
        com.google.common.base.w.F(n11, "nodeV");
        com.google.common.base.w.F(e10, "edge");
        if (T(e10)) {
            u<N> uVarI = I(e10);
            u uVarJ = u.j(this, n10, n11);
            com.google.common.base.w.z(uVarI.equals(uVarJ), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e10, uVarI, uVarJ);
            return false;
        }
        u0<N, E> u0VarF = this.f58350f.f(n10);
        if (!B()) {
            com.google.common.base.w.y(u0VarF == null || !u0VarF.b().contains(n11), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n10, n11);
        }
        boolean zEquals = n10.equals(n11);
        if (!m()) {
            com.google.common.base.w.u(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n10);
        }
        if (u0VarF == null) {
            u0VarF = V(n10);
        }
        u0VarF.i(e10, n11);
        u0<N, E> u0VarF2 = this.f58350f.f(n11);
        if (u0VarF2 == null) {
            u0VarF2 = V(n11);
        }
        u0VarF2.j(e10, n10, zEquals);
        this.f58351g.i(e10, n10);
        return true;
    }

    @Override // com.google.common.graph.p0
    @s9.a
    public boolean o(N n10) {
        com.google.common.base.w.F(n10, "node");
        u0<N, E> u0VarF = this.f58350f.f(n10);
        if (u0VarF == null) {
            return false;
        }
        b3<E> it = ImmutableList.v(u0VarF.k()).iterator();
        while (it.hasNext()) {
            L(it.next());
        }
        this.f58350f.j(n10);
        return true;
    }

    @Override // com.google.common.graph.p0
    @s9.a
    public boolean p(N n10) {
        com.google.common.base.w.F(n10, "node");
        if (U(n10)) {
            return false;
        }
        V(n10);
        return true;
    }
}
