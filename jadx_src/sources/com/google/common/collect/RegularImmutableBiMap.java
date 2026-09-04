package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final RegularImmutableBiMap<Object, Object> f57791l = new RegularImmutableBiMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    private final transient Object f57792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @o9.d
    final transient Object[] f57793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient int f57794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient int f57795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient RegularImmutableBiMap<V, K> f57796k;

    /* JADX WARN: Multi-variable type inference failed */
    private RegularImmutableBiMap() {
        this.f57792g = null;
        this.f57793h = new Object[0];
        this.f57794i = 0;
        this.f57795j = 0;
        this.f57796k = this;
    }

    private RegularImmutableBiMap(@CheckForNull Object obj, Object[] objArr, int i10, RegularImmutableBiMap<V, K> regularImmutableBiMap) {
        this.f57792g = obj;
        this.f57793h = objArr;
        this.f57794i = 1;
        this.f57795j = i10;
        this.f57796k = regularImmutableBiMap;
    }

    RegularImmutableBiMap(Object[] objArr, int i10) {
        this.f57793h = objArr;
        this.f57795j = i10;
        this.f57794i = 0;
        int iT = i10 >= 2 ? ImmutableSet.t(i10) : 0;
        this.f57792g = RegularImmutableMap.M(objArr, i10, iT, 0);
        this.f57796k = new RegularImmutableBiMap<>(RegularImmutableMap.M(objArr, i10, iT, 1), objArr, i10, this);
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public ImmutableBiMap<V, K> i0() {
        return this.f57796k;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v10 = (V) RegularImmutableMap.N(this.f57792g, this.f57793h, this.f57795j, this.f57794i, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet<Map.Entry<K, V>> h() {
        return new RegularImmutableMap.EntrySet(this, this.f57793h, this.f57794i, this.f57795j);
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet<K> i() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.f57793h, this.f57794i, this.f57795j));
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean p() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f57795j;
    }
}
