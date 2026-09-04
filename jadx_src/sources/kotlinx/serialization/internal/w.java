package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n72#2,2:207\n72#2,2:216\n1#3:209\n1#3:219\n199#4:210\n200#4:215\n201#4:218\n1549#5:211\n1620#5,3:212\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n*L\n145#1:207,2\n146#1:216,2\n145#1:209\n146#1:219\n146#1:210\n146#1:215\n146#1:218\n146#1:211\n146#1:212,3\n*E\n"})
public final class w<T> implements o1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.p<kotlin.reflect.d<Object>, List<? extends kotlin.reflect.r>, kotlinx.serialization.g<T>> f130776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ConcurrentHashMap<Class<?>, n1<T>> f130777b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@dl.d yh.p<? super kotlin.reflect.d<Object>, ? super List<? extends kotlin.reflect.r>, ? extends kotlinx.serialization.g<T>> compute) {
        kotlin.jvm.internal.f0.p(compute, "compute");
        this.f130776a = compute;
        this.f130777b = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.o1
    @dl.d
    public Object a(@dl.d kotlin.reflect.d<Object> key, @dl.d List<? extends kotlin.reflect.r> types) {
        Object objB;
        n1<T> n1VarPutIfAbsent;
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(types, "types");
        ConcurrentHashMap<Class<?>, n1<T>> concurrentHashMap = this.f130777b;
        Class<?> clsE = xh.a.e(key);
        n1<T> n1Var = concurrentHashMap.get(clsE);
        if (n1Var == null && (n1VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsE, (n1Var = new n1<>()))) != null) {
            n1Var = n1VarPutIfAbsent;
        }
        n1<T> n1Var2 = n1Var;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new t0((kotlin.reflect.r) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = ((n1) n1Var2).f130732a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.f124476c;
                objB = Result.b(this.f130776a.invoke(key, types));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(kotlin.t0.a(th2));
            }
            Result resultA = Result.a(objB);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, resultA);
            obj = objPutIfAbsent == null ? resultA : objPutIfAbsent;
        }
        kotlin.jvm.internal.f0.o(obj, "getOrPut(...)");
        return ((Result) obj).l();
    }
}
