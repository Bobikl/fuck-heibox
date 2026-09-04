package com.google.common.graph;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: UndirectedNetworkConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class g1<N, E> extends i<N, E> {
    g1(Map<E, N> map) {
        super(map);
    }

    static <N, E> g1<N, E> m() {
        return new g1<>(HashBiMap.h(2));
    }

    static <N, E> g1<N, E> n(Map<E, N> map) {
        return new g1<>(ImmutableBiMap.M(map));
    }

    @Override // com.google.common.graph.u0
    public Set<N> a() {
        return Collections.unmodifiableSet(((com.google.common.collect.l) this.f58390a).values());
    }

    @Override // com.google.common.graph.u0
    public Set<E> l(N n10) {
        return new s(((com.google.common.collect.l) this.f58390a).i0(), n10);
    }
}
