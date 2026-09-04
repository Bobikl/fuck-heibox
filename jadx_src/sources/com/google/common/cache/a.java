package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: AbstractCache.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public abstract class a<K, V> implements c<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractCache.java */
    public static final class C0445a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f56975a = LongAddables.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j f56976b = LongAddables.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j f56977c = LongAddables.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j f56978d = LongAddables.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final j f56979e = LongAddables.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final j f56980f = LongAddables.a();

        private static long h(long j10) {
            if (j10 >= 0) {
                return j10;
            }
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.cache.a.b
        public void a(int i10) {
            this.f56975a.add(i10);
        }

        @Override // com.google.common.cache.a.b
        public void b() {
            this.f56980f.a();
        }

        @Override // com.google.common.cache.a.b
        public void c(long j10) {
            this.f56977c.a();
            this.f56979e.add(j10);
        }

        @Override // com.google.common.cache.a.b
        public void d(int i10) {
            this.f56976b.add(i10);
        }

        @Override // com.google.common.cache.a.b
        public void e(long j10) {
            this.f56978d.a();
            this.f56979e.add(j10);
        }

        @Override // com.google.common.cache.a.b
        public e f() {
            return new e(h(this.f56975a.sum()), h(this.f56976b.sum()), h(this.f56977c.sum()), h(this.f56978d.sum()), h(this.f56979e.sum()), h(this.f56980f.sum()));
        }

        public void g(b bVar) {
            e eVarF = bVar.f();
            this.f56975a.add(eVarF.c());
            this.f56976b.add(eVarF.j());
            this.f56977c.add(eVarF.h());
            this.f56978d.add(eVarF.f());
            this.f56979e.add(eVarF.n());
            this.f56980f.add(eVarF.b());
        }
    }

    /* JADX INFO: compiled from: AbstractCache.java */
    public interface b {
        void a(int i10);

        void b();

        void c(long j10);

        void d(int i10);

        void e(long j10);

        e f();
    }

    protected a() {
    }

    @Override // com.google.common.cache.c
    public void N(Iterable<? extends Object> iterable) {
        Iterator<? extends Object> it = iterable.iterator();
        while (it.hasNext()) {
            u0(it.next());
        }
    }

    @Override // com.google.common.cache.c
    public ImmutableMap<K, V> X(Iterable<? extends Object> iterable) {
        V vL;
        LinkedHashMap linkedHashMapC0 = Maps.c0();
        for (Object obj : iterable) {
            if (!linkedHashMapC0.containsKey(obj) && (vL = L(obj)) != null) {
                linkedHashMapC0.put(obj, vL);
            }
        }
        return ImmutableMap.g(linkedHashMapC0);
    }

    @Override // com.google.common.cache.c
    public ConcurrentMap<K, V> e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public e k0() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.c
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void u0(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void w() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.c
    public void x() {
    }

    @Override // com.google.common.cache.c
    public V y(K k10, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }
}
