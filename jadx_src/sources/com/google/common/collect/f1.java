package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingSortedSetMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class f1<K, V> extends b1<K, V> implements t2<K, V> {
    protected f1() {
    }

    @Override // com.google.common.collect.t2
    @CheckForNull
    public Comparator<? super V> I() {
        return X0().I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.b1
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract t2<K, V> H0();

    @Override // com.google.common.collect.b1, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    public SortedSet<V> a(@CheckForNull Object obj) {
        return X0().a(obj);
    }

    @Override // com.google.common.collect.b1, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    public SortedSet<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return X0().b((Object) k10, (Iterable) iterable);
    }

    @Override // com.google.common.collect.b1, com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public SortedSet<V> v(@x1 K k10) {
        return X0().v((Object) k10);
    }
}
