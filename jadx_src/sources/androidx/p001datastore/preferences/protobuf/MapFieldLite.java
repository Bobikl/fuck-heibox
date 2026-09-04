package androidx.p001datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final MapFieldLite f22315c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22316b;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f22315c = mapFieldLite;
        mapFieldLite.k();
    }

    private MapFieldLite() {
        this.f22316b = true;
    }

    private MapFieldLite(Map<K, V> map) {
        super(map);
        this.f22316b = true;
    }

    static <K, V> int a(Map<K, V> map) {
        int iB = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return i1.m((byte[]) obj);
        }
        if (obj instanceof i1.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            i1.d(obj);
            i1.d(map.get(obj));
        }
    }

    private static Object d(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> Map<K, V> e(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), d(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> MapFieldLite<K, V> f() {
        return f22315c;
    }

    private void g() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean h(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean i(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean j() {
        return this.f22316b;
    }

    public void k() {
        this.f22316b = false;
    }

    public void l(MapFieldLite<K, V> mapFieldLite) {
        g();
        if (mapFieldLite.isEmpty()) {
            return;
        }
        putAll(mapFieldLite);
    }

    public MapFieldLite<K, V> n() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    public V p(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        g();
        i1.d(k10);
        i1.d(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        g();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        return (V) super.remove(obj);
    }
}
