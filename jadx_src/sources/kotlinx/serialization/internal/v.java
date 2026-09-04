package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n72#2,2:207\n1#3:209\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n*L\n133#1:207,2\n133#1:209\n*E\n"})
public final class v<T> implements d2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<kotlin.reflect.d<?>, kotlinx.serialization.g<T>> f130771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ConcurrentHashMap<Class<?>, m<T>> f130772b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@dl.d yh.l<? super kotlin.reflect.d<?>, ? extends kotlinx.serialization.g<T>> compute) {
        kotlin.jvm.internal.f0.p(compute, "compute");
        this.f130771a = compute;
        this.f130772b = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.d2
    @dl.e
    public kotlinx.serialization.g<T> a(@dl.d kotlin.reflect.d<Object> key) {
        m<T> mVarPutIfAbsent;
        kotlin.jvm.internal.f0.p(key, "key");
        ConcurrentHashMap<Class<?>, m<T>> concurrentHashMap = this.f130772b;
        Class<?> clsE = xh.a.e(key);
        m<T> mVar = concurrentHashMap.get(clsE);
        if (mVar == null && (mVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsE, (mVar = new m<>(this.f130771a.invoke(key))))) != null) {
            mVar = mVarPutIfAbsent;
        }
        return mVar.f130725a;
    }
}
