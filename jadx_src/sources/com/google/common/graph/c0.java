package com.google.common.graph;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: GraphConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public interface c0<N, V> {
    Set<N> a();

    Set<N> b();

    Set<N> c();

    void d(N n10, V v10);

    @CheckForNull
    V e(N n10);

    @s9.a
    @CheckForNull
    V f(N n10);

    void g(N n10);

    Iterator<u<N>> h(N n10);

    @s9.a
    @CheckForNull
    V i(N n10, V v10);
}
