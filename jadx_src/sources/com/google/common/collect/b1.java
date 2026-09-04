package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSetMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class b1<K, V> extends u0<K, V> implements i2<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.u0
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public abstract i2<K, V> H0();

    @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public Set<V> a(@CheckForNull Object obj) {
        return H0().a(obj);
    }

    @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public Set<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return H0().b((Object) k10, (Iterable) iterable);
    }

    @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public Set<V> v(@x1 K k10) {
        return H0().v((Object) k10);
    }

    @Override // com.google.common.collect.u0, com.google.common.collect.r1
    public Set<Map.Entry<K, V>> i() {
        return H0().i();
    }
}
