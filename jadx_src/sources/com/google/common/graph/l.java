package com.google.common.graph;

import java.util.Set;

/* JADX INFO: compiled from: BaseGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public interface l<N> extends c1<N>, w0<N> {
    @Override // com.google.common.graph.c1, com.google.common.graph.a0
    /* bridge */ /* synthetic */ Iterable a(Object obj);

    @Override // com.google.common.graph.c1, com.google.common.graph.a0
    Set<N> a(N n10);

    /* bridge */ /* synthetic */ Iterable b(Object obj);

    Set<N> b(N n10);

    boolean c();

    Set<N> d(N n10);

    Set<N> e();

    int f(N n10);

    Set<u<N>> g();

    boolean h(N n10, N n11);

    boolean i(u<N> uVar);

    int j(N n10);

    ElementOrder<N> k();

    int l(N n10);

    boolean m();

    Set<u<N>> n(N n10);

    ElementOrder<N> q();
}
