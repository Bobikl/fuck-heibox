package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class EmptyMap implements Map, Serializable, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final EmptyMap f124540b = new EmptyMap();
    private static final long serialVersionUID = 8246714829545688274L;

    private EmptyMap() {
    }

    private final Object i() {
        return f124540b;
    }

    public boolean a(@dl.d Void value) {
        kotlin.jvm.internal.f0.p(value, "value");
        return false;
    }

    @Override // java.util.Map
    @dl.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(@dl.e Object obj) {
        return null;
    }

    @dl.d
    public Set<Map.Entry> c() {
        return EmptySet.f124541b;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@dl.e Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    @dl.d
    public Set<Object> d() {
        return EmptySet.f124541b;
    }

    public int e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(@dl.e Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @dl.d
    public Collection g() {
        return EmptyList.f124539b;
    }

    public Void h(Object obj, Void r10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    @dl.d
    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }
}
