package com.google.common.graph;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingValueGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class y<N, V> extends j<N, V> {
    y() {
    }

    @CheckForNull
    public V C(N n10, N n11, @CheckForNull V v10) {
        return R().C(n10, n11, v10);
    }

    @Override // com.google.common.graph.a
    protected long N() {
        return R().g().size();
    }

    abstract i1<N, V> R();

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    public Set<N> a(N n10) {
        return R().a((Object) n10);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    public Set<N> b(N n10) {
        return R().b((Object) n10);
    }

    @Override // com.google.common.graph.l
    public boolean c() {
        return R().c();
    }

    @Override // com.google.common.graph.l
    public Set<N> d(N n10) {
        return R().d(n10);
    }

    @Override // com.google.common.graph.l
    public Set<N> e() {
        return R().e();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public int f(N n10) {
        return R().f(n10);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public boolean h(N n10, N n11) {
        return R().h(n10, n11);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public boolean i(u<N> uVar) {
        return R().i(uVar);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l
    public int j(N n10) {
        return R().j(n10);
    }

    @Override // com.google.common.graph.l
    public ElementOrder<N> k() {
        return R().k();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public int l(N n10) {
        return R().l(n10);
    }

    @Override // com.google.common.graph.l
    public boolean m() {
        return R().m();
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l
    public ElementOrder<N> q() {
        return R().q();
    }

    @CheckForNull
    public V y(u<N> uVar, @CheckForNull V v10) {
        return R().y(uVar, v10);
    }
}
