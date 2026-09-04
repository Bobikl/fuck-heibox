package com.google.common.cache;

import com.google.common.base.c0;
import com.google.common.base.w;
import com.google.common.util.concurrent.j0;
import com.google.common.util.concurrent.p0;
import com.google.common.util.concurrent.q0;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b(emulated = true)
public abstract class CacheLoader<K, V> {

    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.base.n<K, V> f56816b;

        public FunctionToCacheLoader(com.google.common.base.n<K, V> nVar) {
            this.f56816b = (com.google.common.base.n) w.E(nVar);
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(K k10) {
            return this.f56816b.apply((K) w.E(k10));
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0<V> f56817b;

        public SupplierToCacheLoader(c0<V> c0Var) {
            this.f56817b = (c0) w.E(c0Var);
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(Object obj) {
            w.E(obj);
            return this.f56817b.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    public class a extends CacheLoader<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f56819c;

        /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$a$a, reason: collision with other inner class name */
        public class CallableC0444a implements Callable<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f56820b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f56821c;

            CallableC0444a(Object obj, Object obj2) {
                this.f56820b = obj;
                this.f56821c = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public V call() throws Exception {
                return CacheLoader.this.f(this.f56820b, this.f56821c).get();
            }
        }

        a(Executor executor) {
            this.f56819c = executor;
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(K k10) throws Exception {
            return (V) CacheLoader.this.d(k10);
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> e(Iterable<? extends K> iterable) throws Exception {
            return CacheLoader.this.e(iterable);
        }

        @Override // com.google.common.cache.CacheLoader
        public p0<V> f(K k10, V v10) throws Exception {
            q0 q0VarB = q0.b(new CallableC0444a(k10, v10));
            this.f56819c.execute(q0VarB);
            return q0VarB;
        }
    }

    protected CacheLoader() {
    }

    @s9.b
    @o9.c
    public static <K, V> CacheLoader<K, V> a(CacheLoader<K, V> cacheLoader, Executor executor) {
        w.E(cacheLoader);
        w.E(executor);
        return cacheLoader.new a(executor);
    }

    @s9.b
    public static <K, V> CacheLoader<K, V> b(com.google.common.base.n<K, V> nVar) {
        return new FunctionToCacheLoader(nVar);
    }

    @s9.b
    public static <V> CacheLoader<Object, V> c(c0<V> c0Var) {
        return new SupplierToCacheLoader(c0Var);
    }

    public abstract V d(K k10) throws Exception;

    public Map<K, V> e(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    @o9.c
    public p0<V> f(K k10, V v10) throws Exception {
        w.E(k10);
        w.E(v10);
        return j0.m(d(k10));
    }
}
