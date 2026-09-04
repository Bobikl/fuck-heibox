package com.google.common.graph;

import com.google.common.collect.b3;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MapIteratorCache.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public class l0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, V> f58398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private volatile transient Map.Entry<K, V> f58399b;

    /* JADX INFO: compiled from: MapIteratorCache.java */
    public class a extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.google.common.graph.l0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MapIteratorCache.java */
        public class C0477a extends b3<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f58401b;

            C0477a(Iterator it) {
                this.f58401b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f58401b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.f58401b.next();
                l0.this.f58399b = entry;
                return (K) entry.getKey();
            }
        }

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b3<K> iterator() {
            return new C0477a(l0.this.f58398a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return l0.this.e(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l0.this.f58398a.size();
        }
    }

    l0(Map<K, V> map) {
        this.f58398a = (Map) com.google.common.base.w.E(map);
    }

    final void c() {
        d();
        this.f58398a.clear();
    }

    void d() {
        this.f58399b = null;
    }

    final boolean e(@CheckForNull Object obj) {
        return g(obj) != null || this.f58398a.containsKey(obj);
    }

    @CheckForNull
    V f(Object obj) {
        com.google.common.base.w.E(obj);
        V vG = g(obj);
        return vG == null ? h(obj) : vG;
    }

    @CheckForNull
    V g(@CheckForNull Object obj) {
        Map.Entry<K, V> entry = this.f58399b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    @CheckForNull
    final V h(Object obj) {
        com.google.common.base.w.E(obj);
        return this.f58398a.get(obj);
    }

    @s9.a
    @CheckForNull
    final V i(K k10, V v10) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v10);
        d();
        return this.f58398a.put(k10, v10);
    }

    @s9.a
    @CheckForNull
    final V j(Object obj) {
        com.google.common.base.w.E(obj);
        d();
        return this.f58398a.remove(obj);
    }

    final Set<K> k() {
        return new a();
    }
}
