package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImmutableMap<K, V> f57311g;

    @o9.c
    public static class KeySetSerializedForm<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMap<K, ?> f57312b;

        KeySetSerializedForm(ImmutableMap<K, ?> immutableMap) {
            this.f57312b = immutableMap;
        }

        Object a() {
            return this.f57312b.keySet();
        }
    }

    ImmutableMapKeySet(ImmutableMap<K, V> immutableMap) {
        this.f57311g = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f57311g.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    K get(int i10) {
        return this.f57311g.entrySet().a().get(i10).getKey();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean i() {
        return true;
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<K> iterator() {
        return this.f57311g.r();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @o9.c
    Object l() {
        return new KeySetSerializedForm(this.f57311g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f57311g.size();
    }
}
