package com.google.common.graph;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DirectedNetworkConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class r<N, E> extends e<N, E> {
    r(Map<E, N> map, Map<E, N> map2, int i10) {
        super(map, map2, i10);
    }

    static <N, E> r<N, E> n() {
        return new r<>(HashBiMap.h(2), HashBiMap.h(2), 0);
    }

    static <N, E> r<N, E> o(Map<E, N> map, Map<E, N> map2, int i10) {
        return new r<>(ImmutableBiMap.M(map), ImmutableBiMap.M(map2), i10);
    }

    @Override // com.google.common.graph.u0
    public Set<N> b() {
        return Collections.unmodifiableSet(((com.google.common.collect.l) this.f58365b).values());
    }

    @Override // com.google.common.graph.u0
    public Set<N> c() {
        return Collections.unmodifiableSet(((com.google.common.collect.l) this.f58364a).values());
    }

    @Override // com.google.common.graph.u0
    public Set<E> l(N n10) {
        return new s(((com.google.common.collect.l) this.f58365b).i0(), n10);
    }
}
