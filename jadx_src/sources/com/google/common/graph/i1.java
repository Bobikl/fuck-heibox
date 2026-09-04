package com.google.common.graph;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ValueGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@t
public interface i1<N, V> extends l<N> {
    @CheckForNull
    V C(N n10, N n11, @CheckForNull V v10);

    @Override // com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    /* bridge */ /* synthetic */ Iterable a(Object obj);

    @Override // com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    Set<N> a(N n10);

    @Override // com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    /* bridge */ /* synthetic */ Iterable b(Object obj);

    @Override // com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    Set<N> b(N n10);

    @Override // com.google.common.graph.l
    boolean c();

    @Override // com.google.common.graph.l
    Set<N> d(N n10);

    @Override // com.google.common.graph.l
    Set<N> e();

    boolean equals(@CheckForNull Object obj);

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    int f(N n10);

    @Override // com.google.common.graph.l
    Set<u<N>> g();

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    boolean h(N n10, N n11);

    int hashCode();

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    boolean i(u<N> uVar);

    @Override // com.google.common.graph.l
    int j(N n10);

    @Override // com.google.common.graph.l
    ElementOrder<N> k();

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    int l(N n10);

    @Override // com.google.common.graph.l
    boolean m();

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    Set<u<N>> n(N n10);

    @Override // com.google.common.graph.l
    ElementOrder<N> q();

    a0<N> t();

    @CheckForNull
    V y(u<N> uVar, @CheckForNull V v10);
}
