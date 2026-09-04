package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1549#2:207\n1620#2,3:208\n72#3,2:211\n1#4:213\n1#4:214\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n*L\n199#1:207\n199#1:208,3\n200#1:211,2\n200#1:214\n*E\n"})
public final class n1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ConcurrentHashMap<List<t0>, Result<kotlinx.serialization.g<T>>> f130732a = new ConcurrentHashMap<>();

    @dl.d
    public final Object b(@dl.d List<? extends kotlin.reflect.r> types, @dl.d yh.a<? extends kotlinx.serialization.g<T>> producer) {
        Object objB;
        kotlin.jvm.internal.f0.p(types, "types");
        kotlin.jvm.internal.f0.p(producer, "producer");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new t0((kotlin.reflect.r) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = this.f130732a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.f124476c;
                objB = Result.b(producer.invoke());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(kotlin.t0.a(th2));
            }
            Result resultA = Result.a(objB);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultA);
            obj = objPutIfAbsent == null ? resultA : objPutIfAbsent;
        }
        kotlin.jvm.internal.f0.o(obj, "getOrPut(...)");
        return ((Result) obj).l();
    }
}
