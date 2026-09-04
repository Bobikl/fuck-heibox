package com.google.common.graph;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: StandardMutableValueGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class z0<N, V> extends b1<N, V> implements q0<N, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ElementOrder<N> f58450f;

    z0(g<? super N> gVar) {
        super(gVar);
        this.f58450f = (ElementOrder<N>) gVar.f58378d.a();
    }

    @s9.a
    private c0<N, V> V(N n10) {
        c0<N, V> c0VarW = W();
        com.google.common.base.w.g0(this.f58356d.i(n10, c0VarW) == null);
        return c0VarW;
    }

    private c0<N, V> W() {
        return c() ? p.x(this.f58450f) : e1.l(this.f58450f);
    }

    @Override // com.google.common.graph.q0
    @s9.a
    @CheckForNull
    public V F(u<N> uVar, V v10) {
        P(uVar);
        return x(uVar.g(), uVar.h(), v10);
    }

    @Override // com.google.common.graph.q0
    @s9.a
    public boolean o(N n10) {
        com.google.common.base.w.F(n10, "node");
        c0<N, V> c0VarF = this.f58356d.f(n10);
        if (c0VarF == null) {
            return false;
        }
        if (m() && c0VarF.f(n10) != null) {
            c0VarF.g(n10);
            this.f58357e--;
        }
        Iterator<N> it = c0VarF.b().iterator();
        while (it.hasNext()) {
            c0<N, V> c0VarH = this.f58356d.h(it.next());
            Objects.requireNonNull(c0VarH);
            c0VarH.g(n10);
            this.f58357e--;
        }
        if (c()) {
            Iterator<N> it2 = c0VarF.c().iterator();
            while (it2.hasNext()) {
                c0<N, V> c0VarH2 = this.f58356d.h(it2.next());
                Objects.requireNonNull(c0VarH2);
                com.google.common.base.w.g0(c0VarH2.f(n10) != null);
                this.f58357e--;
            }
        }
        this.f58356d.j(n10);
        Graphs.c(this.f58357e);
        return true;
    }

    @Override // com.google.common.graph.q0
    @s9.a
    public boolean p(N n10) {
        com.google.common.base.w.F(n10, "node");
        if (S(n10)) {
            return false;
        }
        V(n10);
        return true;
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l
    public ElementOrder<N> q() {
        return this.f58450f;
    }

    @Override // com.google.common.graph.q0
    @s9.a
    @CheckForNull
    public V r(N n10, N n11) {
        com.google.common.base.w.F(n10, "nodeU");
        com.google.common.base.w.F(n11, "nodeV");
        c0<N, V> c0VarF = this.f58356d.f(n10);
        c0<N, V> c0VarF2 = this.f58356d.f(n11);
        if (c0VarF == null || c0VarF2 == null) {
            return null;
        }
        V vF = c0VarF.f(n11);
        if (vF != null) {
            c0VarF2.g(n10);
            long j10 = this.f58357e - 1;
            this.f58357e = j10;
            Graphs.c(j10);
        }
        return vF;
    }

    @Override // com.google.common.graph.q0
    @s9.a
    @CheckForNull
    public V s(u<N> uVar) {
        P(uVar);
        return r(uVar.g(), uVar.h());
    }

    @Override // com.google.common.graph.q0
    @s9.a
    @CheckForNull
    public V x(N n10, N n11, V v10) {
        com.google.common.base.w.F(n10, "nodeU");
        com.google.common.base.w.F(n11, "nodeV");
        com.google.common.base.w.F(v10, "value");
        if (!m()) {
            com.google.common.base.w.u(!n10.equals(n11), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n10);
        }
        c0<N, V> c0VarF = this.f58356d.f(n10);
        if (c0VarF == null) {
            c0VarF = V(n10);
        }
        V vI = c0VarF.i(n11, v10);
        c0<N, V> c0VarF2 = this.f58356d.f(n11);
        if (c0VarF2 == null) {
            c0VarF2 = V(n11);
        }
        c0VarF2.d(n10, v10);
        if (vI == null) {
            long j10 = this.f58357e + 1;
            this.f58357e = j10;
            Graphs.e(j10);
        }
        return vI;
    }
}
