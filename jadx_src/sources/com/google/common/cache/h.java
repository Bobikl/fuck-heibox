package com.google.common.cache;

import com.google.common.base.w;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: ForwardingLoadingCache.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.c
public abstract class h<K, V> extends g<K, V> implements i<K, V> {

    /* JADX INFO: compiled from: ForwardingLoadingCache.java */
    public static abstract class a<K, V> extends h<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i<K, V> f57008b;

        protected a(i<K, V> iVar) {
            this.f57008b = (i) w.E(iVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.h, com.google.common.cache.g
        /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final i<K, V> H0() {
            return this.f57008b;
        }
    }

    protected h() {
    }

    @Override // com.google.common.cache.i
    public void C0(K k10) {
        H0().C0(k10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.cache.g
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public abstract i<K, V> H0();

    @Override // com.google.common.cache.i, com.google.common.base.n
    public V apply(K k10) {
        return H0().apply(k10);
    }

    @Override // com.google.common.cache.i
    public V get(K k10) throws ExecutionException {
        return H0().get(k10);
    }

    @Override // com.google.common.cache.i
    public V l0(K k10) {
        return H0().l0(k10);
    }

    @Override // com.google.common.cache.i
    public ImmutableMap<K, V> r0(Iterable<? extends K> iterable) throws ExecutionException {
        return H0().r0(iterable);
    }
}
