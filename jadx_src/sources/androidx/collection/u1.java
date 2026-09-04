package androidx.collection;

import java.util.Map;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u1<K, V> implements Map.Entry<K, V>, zh.g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Object[] f3713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Object[] f3714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3715d;

    public u1(@dl.d Object[] keys, @dl.d Object[] values, int i10) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        kotlin.jvm.internal.f0.p(values, "values");
        this.f3713b = keys;
        this.f3714c = values;
        this.f3715d = i10;
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public final int a() {
        return this.f3715d;
    }

    @dl.d
    public final Object[] c() {
        return this.f3713b;
    }

    @dl.d
    public final Object[] e() {
        return this.f3714c;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.f3713b[this.f3715d];
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.f3714c[this.f3715d];
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        Object[] objArr = this.f3714c;
        int i10 = this.f3715d;
        V v11 = (V) objArr[i10];
        objArr[i10] = v10;
        return v11;
    }
}
