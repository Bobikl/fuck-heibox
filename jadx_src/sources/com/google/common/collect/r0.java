package com.google.common.collect;

import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingListMultimap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class r0<K, V> extends u0<K, V> implements o1<K, V> {
    protected r0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.u0
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public abstract o1<K, V> H0();

    @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public List<V> a(@CheckForNull Object obj) {
        return H0().a(obj);
    }

    @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public List<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return H0().b((Object) k10, (Iterable) iterable);
    }

    @Override // com.google.common.collect.u0, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public List<V> v(@x1 K k10) {
        return H0().v((Object) k10);
    }
}
