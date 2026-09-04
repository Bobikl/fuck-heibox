package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x0<K, V> implements w0<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<K, V> f124652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.l<K, V> f124653c;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@dl.d Map<K, V> map, @dl.d yh.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.f0.p(map, "map");
        kotlin.jvm.internal.f0.p(lVar, "default");
        this.f124652b = map;
        this.f124653c = lVar;
    }

    @Override // kotlin.collections.n0
    public V S(K k10) {
        Map<K, V> mapQ = q();
        V v10 = mapQ.get(k10);
        return (v10 != null || mapQ.containsKey(k10)) ? v10 : this.f124653c.invoke(k10);
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
        q().clear();
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
    @dl.e
    public V put(K k10, V v10) {
        return q().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(@dl.d Map<? extends K, ? extends V> from) {
        kotlin.jvm.internal.f0.p(from, "from");
        q().putAll(from);
    }

    @Override // kotlin.collections.w0, kotlin.collections.n0
    @dl.d
    public Map<K, V> q() {
        return this.f124652b;
    }

    @Override // java.util.Map
    @dl.e
    public V remove(Object obj) {
        return q().remove(obj);
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
