package com.google.common.graph;

import java.util.Set;

/* JADX INFO: compiled from: ForwardingGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class w<N> extends f<N> {
    w() {
    }

    @Override // com.google.common.graph.a
    protected long N() {
        return Q().g().size();
    }

    abstract l<N> Q();

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    public Set<N> a(N n10) {
        return Q().a((Object) n10);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    public Set<N> b(N n10) {
        return Q().b((Object) n10);
    }

    @Override // com.google.common.graph.l
    public boolean c() {
        return Q().c();
    }

    @Override // com.google.common.graph.l
    public Set<N> d(N n10) {
        return Q().d(n10);
    }

    @Override // com.google.common.graph.l
    public Set<N> e() {
        return Q().e();
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public int f(N n10) {
        return Q().f(n10);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public boolean h(N n10, N n11) {
        return Q().h(n10, n11);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public boolean i(u<N> uVar) {
        return Q().i(uVar);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
    public int j(N n10) {
        return Q().j(n10);
    }

    @Override // com.google.common.graph.l
    public ElementOrder<N> k() {
        return Q().k();
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public int l(N n10) {
        return Q().l(n10);
    }

    @Override // com.google.common.graph.l
    public boolean m() {
        return Q().m();
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public Set<u<N>> n(N n10) {
        return Q().n(n10);
    }

    @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
    public ElementOrder<N> q() {
        return Q().q();
    }
}
