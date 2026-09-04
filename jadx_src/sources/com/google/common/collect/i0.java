package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingConcurrentMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class i0<K, V> extends s0<K, V> implements ConcurrentMap<K, V> {
    protected i0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> H0();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @s9.a
    @CheckForNull
    public V putIfAbsent(K k10, V v10) {
        return H0().putIfAbsent(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @s9.a
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return H0().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @s9.a
    @CheckForNull
    public V replace(K k10, V v10) {
        return H0().replace(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @s9.a
    public boolean replace(K k10, V v10, V v11) {
        return H0().replace(k10, v10, v11);
    }
}
