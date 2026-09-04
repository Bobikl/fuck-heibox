package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    AbstractSortedKeySortedSetMultimap(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> e() {
        return (SortedMap) super.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public SortedMap<K, Collection<V>> t() {
        return (SortedMap) super.t();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public SortedSet<K> keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
    Set<K> f() {
        return x();
    }
}
