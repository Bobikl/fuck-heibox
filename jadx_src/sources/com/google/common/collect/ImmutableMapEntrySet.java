package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @o9.c
    public static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMap<K, V> f57308b;

        EntrySetSerializedForm(ImmutableMap<K, V> immutableMap) {
            this.f57308b = immutableMap;
        }

        Object a() {
            return this.f57308b.entrySet();
        }
    }

    public static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final transient ImmutableMap<K, V> f57309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final transient ImmutableList<Map.Entry<K, V>> f57310h;

        RegularEntrySet(ImmutableMap<K, V> immutableMap, ImmutableList<Map.Entry<K, V>> immutableList) {
            this.f57309g = immutableMap;
            this.f57310h = immutableList;
        }

        RegularEntrySet(ImmutableMap<K, V> immutableMap, Map.Entry<K, V>[] entryArr) {
            this(immutableMap, ImmutableList.m(entryArr));
        }

        @Override // com.google.common.collect.ImmutableSet
        ImmutableList<Map.Entry<K, V>> A() {
            return this.f57310h;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        ImmutableMap<K, V> N() {
            return this.f57309g;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @o9.c("not used in GWT")
        int b(Object[] objArr, int i10) {
            return this.f57310h.b(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        /* JADX INFO: renamed from: j */
        public b3<Map.Entry<K, V>> iterator() {
            return this.f57310h.iterator();
        }
    }

    ImmutableMapEntrySet() {
    }

    @Override // com.google.common.collect.ImmutableSet
    @o9.c
    boolean B() {
        return N().n();
    }

    abstract ImmutableMap<K, V> N();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v10 = N().get(entry.getKey());
        return v10 != null && v10.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return N().hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return N().p();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @o9.c
    Object l() {
        return new EntrySetSerializedForm(N());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return N().size();
    }
}
