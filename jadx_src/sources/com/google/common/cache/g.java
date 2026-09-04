package com.google.common.cache;

import com.google.common.base.w;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.y0;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingCache.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.c
public abstract class g<K, V> extends y0 implements c<K, V> {

    /* JADX INFO: compiled from: ForwardingCache.java */
    public static abstract class a<K, V> extends g<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c<K, V> f57007b;

        protected a(c<K, V> cVar) {
            this.f57007b = (c) w.E(cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.g, com.google.common.collect.y0
        public final c<K, V> X0() {
            return this.f57007b;
        }
    }

    protected g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y0
    public abstract c<K, V> X0();

    @Override // com.google.common.cache.c
    @CheckForNull
    public V L(Object obj) {
        return H0().L(obj);
    }

    @Override // com.google.common.cache.c
    public void N(Iterable<? extends Object> iterable) {
        H0().N(iterable);
    }

    @Override // com.google.common.cache.c
    public ImmutableMap<K, V> X(Iterable<? extends Object> iterable) {
        return H0().X(iterable);
    }

    @Override // com.google.common.cache.c
    public ConcurrentMap<K, V> e() {
        return H0().e();
    }

    @Override // com.google.common.cache.c
    public e k0() {
        return H0().k0();
    }

    @Override // com.google.common.cache.c
    public void put(K k10, V v10) {
        H0().put(k10, v10);
    }

    @Override // com.google.common.cache.c
    public void putAll(Map<? extends K, ? extends V> map) {
        H0().putAll(map);
    }

    @Override // com.google.common.cache.c
    public long size() {
        return H0().size();
    }

    @Override // com.google.common.cache.c
    public void u0(Object obj) {
        H0().u0(obj);
    }

    @Override // com.google.common.cache.c
    public void w() {
        H0().w();
    }

    @Override // com.google.common.cache.c
    public void x() {
        H0().x();
    }

    @Override // com.google.common.cache.c
    public V y(K k10, Callable<? extends V> callable) throws ExecutionException {
        return H0().y(k10, callable);
    }
}
