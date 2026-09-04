package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements t2<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    protected AbstractSortedSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> F(@x1 K k10, Collection<V> collection) {
        return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.m(k10, (NavigableSet) collection, null) : new AbstractMapBasedMultimap.o(k10, (SortedSet) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: K */
    public abstract SortedSet<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public SortedSet<V> y() {
        return (SortedSet<V>) E(u());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public <E> SortedSet<E> E(Collection<E> collection) {
        return collection instanceof NavigableSet ? Sets.O((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public SortedSet<V> a(@CheckForNull Object obj) {
        return (SortedSet) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public SortedSet<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return (SortedSet) super.b((Object) k10, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public Map<K, Collection<V>> e() {
        return super.e();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public SortedSet<V> v(@x1 K k10) {
        return (SortedSet) super.v((Object) k10);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    public Collection<V> values() {
        return super.values();
    }
}
