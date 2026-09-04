package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public class ImmutableEntry<K, V> extends b<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @x1
    final K f57272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @x1
    final V f57273c;

    ImmutableEntry(@x1 K k10, @x1 V v10) {
        this.f57272b = k10;
        this.f57273c = v10;
    }

    @Override // com.google.common.collect.b, java.util.Map.Entry
    @x1
    public final K getKey() {
        return this.f57272b;
    }

    @Override // com.google.common.collect.b, java.util.Map.Entry
    @x1
    public final V getValue() {
        return this.f57273c;
    }

    @Override // com.google.common.collect.b, java.util.Map.Entry
    @x1
    public final V setValue(@x1 V v10) {
        throw new UnsupportedOperationException();
    }
}
