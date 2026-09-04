package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: AbstractLoadingCache.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.c
public abstract class b<K, V> extends a<K, V> implements i<K, V> {
    protected b() {
    }

    @Override // com.google.common.cache.i
    public void C0(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.i, com.google.common.base.n
    public final V apply(K k10) {
        return l0(k10);
    }

    @Override // com.google.common.cache.i
    public V l0(K k10) {
        try {
            return get(k10);
        } catch (ExecutionException e10) {
            throw new UncheckedExecutionException(e10.getCause());
        }
    }

    @Override // com.google.common.cache.i
    public ImmutableMap<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapC0 = Maps.c0();
        for (K k10 : iterable) {
            if (!linkedHashMapC0.containsKey(k10)) {
                linkedHashMapC0.put(k10, get(k10));
            }
        }
        return ImmutableMap.g(linkedHashMapC0);
    }
}
