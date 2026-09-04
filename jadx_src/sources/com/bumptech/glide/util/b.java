package com.bumptech.glide.util;

import androidx.collection.j2;

/* JADX INFO: compiled from: CachedHashCodeArrayMap.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41982h;

    @Override // androidx.collection.j2, java.util.Map
    public void clear() {
        this.f41982h = 0;
        super.clear();
    }

    @Override // androidx.collection.j2
    public void h(j2<? extends K, ? extends V> j2Var) {
        this.f41982h = 0;
        super.h(j2Var);
    }

    @Override // androidx.collection.j2, java.util.Map
    public int hashCode() {
        if (this.f41982h == 0) {
            this.f41982h = super.hashCode();
        }
        return this.f41982h;
    }

    @Override // androidx.collection.j2
    public V i(int i10) {
        this.f41982h = 0;
        return (V) super.i(i10);
    }

    @Override // androidx.collection.j2
    public V j(int i10, V v10) {
        this.f41982h = 0;
        return (V) super.j(i10, v10);
    }

    @Override // androidx.collection.j2, java.util.Map
    public V put(K k10, V v10) {
        this.f41982h = 0;
        return (V) super.put(k10, v10);
    }
}
