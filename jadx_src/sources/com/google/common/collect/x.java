package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FilteredEntrySetMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class x<K, V> extends v<K, V> implements e0<K, V> {
    x(i2<K, V> i2Var, com.google.common.base.x<? super Map.Entry<K, V>> xVar) {
        super(i2Var, xVar);
    }

    @Override // com.google.common.collect.v, com.google.common.collect.r1, com.google.common.collect.o1
    public Set<V> a(@CheckForNull Object obj) {
        return (Set) super.a(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public Set<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return (Set) super.b((Object) k10, (Iterable) iterable);
    }

    @Override // com.google.common.collect.v, com.google.common.collect.b0, com.google.common.collect.e0
    public i2<K, V> g() {
        return (i2) this.f58176g;
    }

    @Override // com.google.common.collect.v, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public Set<V> v(@x1 K k10) {
        return (Set) super.v((Object) k10);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public Set<Map.Entry<K, V>> i() {
        return (Set) super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.v, com.google.common.collect.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> d() {
        return Sets.i(g().i(), U());
    }
}
