package kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CacheByClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d<V> extends a<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<Class<?>, V> f125316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ConcurrentHashMap<Class<?>, V> f125317b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.d yh.l<? super Class<?>, ? extends V> compute) {
        f0.p(compute, "compute");
        this.f125316a = compute;
        this.f125317b = new ConcurrentHashMap<>();
    }

    @Override // kotlin.reflect.jvm.internal.a
    public void a() {
        this.f125317b.clear();
    }

    @Override // kotlin.reflect.jvm.internal.a
    public V b(@dl.d Class<?> key) {
        f0.p(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f125317b;
        V v10 = (V) concurrentHashMap.get(key);
        if (v10 != null) {
            return v10;
        }
        V vInvoke = this.f125316a.invoke(key);
        V v11 = (V) concurrentHashMap.putIfAbsent(key, vInvoke);
        return v11 == null ? vInvoke : v11;
    }
}
