package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o0<K, V> implements n0<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<K, V> f124636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.l<K, V> f124637c;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(@dl.d Map<K, ? extends V> map, @dl.d yh.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.f0.p(map, "map");
        kotlin.jvm.internal.f0.p(lVar, "default");
        this.f124636b = map;
        this.f124637c = lVar;
    }

    @Override // kotlin.collections.n0
    public V S(K k10) {
        Map<K, V> mapQ = q();
        V v10 = mapQ.get(k10);
        return (v10 != null || mapQ.containsKey(k10)) ? v10 : this.f124637c.invoke(k10);
    }

    @dl.d
    public Set<Map.Entry<K, V>> a() {
        return q().entrySet();
    }

    @dl.d
    public Set<K> b() {
        return q().keySet();
    }

    public int c() {
        return q().size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return q().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return q().containsValue(obj);
    }

    @dl.d
    public Collection<V> d() {
        return q().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(@dl.e Object obj) {
        return q().equals(obj);
    }

    @Override // java.util.Map
    @dl.e
    public V get(Object obj) {
        return q().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return q().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return q().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.collections.n0
    @dl.d
    public Map<K, V> q() {
        return this.f124636b;
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @dl.d
    public String toString() {
        return q().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
