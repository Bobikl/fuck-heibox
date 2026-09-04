package com.google.common.graph;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Graph.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@s9.f("Use GraphBuilder to create a real instance")
@t
public interface a0<N> extends l<N> {
    /* bridge */ /* synthetic */ Iterable a(Object obj);

    @Override // com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    Set<N> a(N n10);

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

    int f(N n10);

    @Override // com.google.common.graph.l
    Set<u<N>> g();

    boolean h(N n10, N n11);

    int hashCode();

    boolean i(u<N> uVar);

    @Override // com.google.common.graph.l
    int j(N n10);

    @Override // com.google.common.graph.l
    ElementOrder<N> k();

    int l(N n10);

    @Override // com.google.common.graph.l
    boolean m();

    Set<u<N>> n(N n10);

    @Override // com.google.common.graph.l
    ElementOrder<N> q();
}
