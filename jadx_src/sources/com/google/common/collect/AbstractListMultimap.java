package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements o1<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    protected AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    <E> Collection<E> E(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> F(@x1 K k10, Collection<V> collection) {
        return G(k10, (List) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract List<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public List<V> y() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public List<V> a(@CheckForNull Object obj) {
        return (List) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public List<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return (List) super.b((Object) k10, (Iterable) iterable);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public Map<K, Collection<V>> e() {
        return super.e();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public List<V> v(@x1 K k10) {
        return (List) super.v((Object) k10);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public boolean put(@x1 K k10, @x1 V v10) {
        return super.put(k10, v10);
    }
}
