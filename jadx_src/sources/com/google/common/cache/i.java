package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: LoadingCache.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public interface i<K, V> extends c<K, V>, com.google.common.base.n<K, V> {
    void C0(K k10);

    @Override // com.google.common.base.n
    @Deprecated
    V apply(K k10);

    @Override // com.google.common.cache.c
    ConcurrentMap<K, V> e();

    V get(K k10) throws ExecutionException;

    V l0(K k10);

    ImmutableMap<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException;
}
