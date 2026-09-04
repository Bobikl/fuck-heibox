package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,206:1\n80#2,3:207\n85#2:211\n1#3:210\n1#3:221\n199#4:212\n200#4:217\n201#4:220\n1549#5:213\n1620#5,3:214\n72#6,2:218\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n119#1:207,3\n119#1:211\n119#1:210\n120#1:221\n120#1:212\n120#1:217\n120#1:220\n120#1:213\n120#1:214,3\n120#1:218,2\n*E\n"})
public final class ClassValueParametrizedCache<T> implements o1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.p<kotlin.reflect.d<Object>, List<? extends kotlin.reflect.r>, kotlinx.serialization.g<T>> f130607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ClassValueReferences<n1<T>> f130608b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueParametrizedCache(@dl.d yh.p<? super kotlin.reflect.d<Object>, ? super List<? extends kotlin.reflect.r>, ? extends kotlinx.serialization.g<T>> compute) {
        kotlin.jvm.internal.f0.p(compute, "compute");
        this.f130607a = compute;
        this.f130608b = new ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.o1
    @dl.d
    public Object a(@dl.d kotlin.reflect.d<Object> key, @dl.d List<? extends kotlin.reflect.r> types) {
        Object objB;
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(types, "types");
        n1<T> n1Var = this.f130608b.get(xh.a.e(key));
        kotlin.jvm.internal.f0.o(n1Var, "get(...)");
        f1 f1Var = (f1) n1Var;
        T t10 = f1Var.f130693a.get();
        if (t10 == null) {
            t10 = (T) f1Var.a(new yh.a<T>() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
                @Override // yh.a
                public final T invoke() {
                    return (T) new n1();
                }
            });
        }
        n1 n1Var2 = t10;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new t0((kotlin.reflect.r) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = n1Var2.f130732a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.f124476c;
                objB = Result.b(this.f130607a.invoke(key, types));
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
