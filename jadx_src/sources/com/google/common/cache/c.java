package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
@s9.f("Use CacheBuilder.newBuilder().build()")
public interface c<K, V> {
    @CheckForNull
    V L(@s9.c("K") Object obj);

    void N(Iterable<? extends Object> iterable);

    ImmutableMap<K, V> X(Iterable<? extends Object> iterable);

    @s9.b
    ConcurrentMap<K, V> e();

    @s9.b
    e k0();

    void put(K k10, V v10);

    void putAll(Map<? extends K, ? extends V> map);

    @s9.b
    long size();

    void u0(@s9.c("K") Object obj);

    void w();

    void x();

    V y(K k10, Callable<? extends V> callable) throws ExecutionException;
}
