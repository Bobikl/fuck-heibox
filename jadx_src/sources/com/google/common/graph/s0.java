package com.google.common.graph;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Network.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@s9.f("Use NetworkBuilder to create a real instance")
@t
public interface s0<N, E> extends c1<N>, w0<N> {
    Set<E> A(E e10);

    boolean B();

    Set<E> G(u<N> uVar);

    @CheckForNull
    E H(N n10, N n11);

    u<N> I(E e10);

    @CheckForNull
    E K(u<N> uVar);

    @Override // com.google.common.graph.c1, com.google.common.graph.a0
    /* bridge */ /* synthetic */ Iterable a(Object obj);

    @Override // com.google.common.graph.c1, com.google.common.graph.a0
    Set<N> a(N n10);

    /* bridge */ /* synthetic */ Iterable b(Object obj);

    @Override // com.google.common.graph.w0, com.google.common.graph.a0
    Set<N> b(N n10);

    boolean c();

    Set<N> d(N n10);

    Set<N> e();

    boolean equals(@CheckForNull Object obj);

    int f(N n10);

    Set<E> g();

    boolean h(N n10, N n11);

    int hashCode();

    boolean i(u<N> uVar);

    int j(N n10);

    ElementOrder<N> k();

    int l(N n10);

    boolean m();

    Set<E> n(N n10);

    a0<N> t();

    Set<E> u(N n10, N n11);

    ElementOrder<E> v();

    Set<E> w(N n10);

    Set<E> z(N n10);
}
