package com.google.common.graph;

/* JADX INFO: compiled from: StandardMutableGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class x0<N> extends w<N> implements o0<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0<N, GraphConstants.Presence> f58449a;

    x0(g<? super N> gVar) {
        this.f58449a = new z0(gVar);
    }

    @Override // com.google.common.graph.o0
    public boolean E(u<N> uVar) {
        P(uVar);
        return J(uVar.g(), uVar.h());
    }

    @Override // com.google.common.graph.o0
    public boolean J(N n10, N n11) {
        return this.f58449a.x(n10, n11, GraphConstants.Presence.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.w
    l<N> Q() {
        return this.f58449a;
    }

    @Override // com.google.common.graph.o0
    public boolean o(N n10) {
        return this.f58449a.o(n10);
    }

    @Override // com.google.common.graph.o0
    public boolean p(N n10) {
        return this.f58449a.p(n10);
    }

    @Override // com.google.common.graph.o0
    public boolean r(N n10, N n11) {
        return this.f58449a.r(n10, n11) != null;
    }

    @Override // com.google.common.graph.o0
    public boolean s(u<N> uVar) {
        P(uVar);
        return r(uVar.g(), uVar.h());
    }
}
