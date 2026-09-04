package com.google.common.collect;

import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: FilteredKeyListMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class y<K, V> extends z<K, V> implements o1<K, V> {
    y(o1<K, V> o1Var, com.google.common.base.x<? super K> xVar) {
        super(o1Var, xVar);
    }

    @Override // com.google.common.collect.z, com.google.common.collect.r1, com.google.common.collect.o1
    public List<V> a(@CheckForNull Object obj) {
        return (List) super.a(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public List<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return (List) super.b((Object) k10, (Iterable) iterable);
    }

    @Override // com.google.common.collect.z, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public List<V> v(@x1 K k10) {
        return (List) super.v((Object) k10);
    }

    @Override // com.google.common.collect.z, com.google.common.collect.b0, com.google.common.collect.e0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public o1<K, V> g() {
        return (o1) super.g();
    }
}
