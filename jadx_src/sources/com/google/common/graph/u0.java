package com.google.common.graph;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: NetworkConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public interface u0<N, E> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    N d(E e10);

    Set<E> e();

    @s9.a
    N f(E e10);

    Set<E> g();

    @s9.a
    @CheckForNull
    N h(E e10, boolean z10);

    void i(E e10, N n10);

    void j(E e10, N n10, boolean z10);

    Set<E> k();

    Set<E> l(N n10);
}
