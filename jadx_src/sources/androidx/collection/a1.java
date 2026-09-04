package androidx.collection;

import java.util.Map;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a1<K, V> implements Map.Entry<K, V>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f3555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f3556c;

    public a1(K k10, V v10) {
        this.f3555b = k10;
        this.f3556c = v10;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f3555b;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f3556c;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
