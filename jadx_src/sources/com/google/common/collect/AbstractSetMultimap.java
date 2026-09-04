package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements i2<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    protected AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    <E> Collection<E> E(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> F(@x1 K k10, Collection<V> collection) {
        return new AbstractMapBasedMultimap.n(k10, (Set) collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Set<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Set<V> y() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public Set<V> a(@CheckForNull Object obj) {
        return (Set) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public Set<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return (Set) super.b((Object) k10, (Iterable) iterable);
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
    public Set<V> v(@x1 K k10) {
        return (Set) super.v((Object) k10);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    public Set<Map.Entry<K, V>> i() {
        return (Set) super.i();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public boolean put(@x1 K k10, @x1 V v10) {
        return super.put(k10, v10);
    }
}
