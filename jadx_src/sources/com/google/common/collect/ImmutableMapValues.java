package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImmutableMap<K, V> f57313c;

    @o9.c
    public static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMap<?, V> f57315b;

        SerializedForm(ImmutableMap<?, V> immutableMap) {
            this.f57315b = immutableMap;
        }

        Object a() {
            return this.f57315b.values();
        }
    }

    public class a extends b3<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b3<Map.Entry<K, V>> f57316b;

        a() {
            this.f57316b = ImmutableMapValues.this.f57313c.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57316b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f57316b.next().getValue();
        }
    }

    ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.f57313c = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> a() {
        final ImmutableList<Map.Entry<K, V>> immutableListA = this.f57313c.entrySet().a();
        return new ImmutableList<V>(this) { // from class: com.google.common.collect.ImmutableMapValues.2
            @Override // java.util.List
            public V get(int i10) {
                return (V) ((Map.Entry) immutableListA.get(i10)).getValue();
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return immutableListA.size();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return obj != null && Iterators.q(iterator(), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<V> iterator() {
        return new a();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @o9.c
    Object l() {
        return new SerializedForm(this.f57313c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f57313c.size();
    }
}
