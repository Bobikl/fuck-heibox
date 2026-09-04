package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: caches.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CachesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final a<KClassImpl<? extends Object>> f125072a = b.a(new yh.l<Class<?>, KClassImpl<? extends Object>>() { // from class: kotlin.reflect.jvm.internal.CachesKt$K_CLASS_CACHE$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KClassImpl<? extends Object> invoke(@dl.d Class<?> it) {
            f0.p(it, "it");
            return new KClassImpl<>(it);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final a<KPackageImpl> f125073b = b.a(new yh.l<Class<?>, KPackageImpl>() { // from class: kotlin.reflect.jvm.internal.CachesKt$K_PACKAGE_CACHE$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KPackageImpl invoke(@dl.d Class<?> it) {
            f0.p(it, "it");
            return new KPackageImpl(it);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final a<kotlin.reflect.r> f125074c = b.a(new yh.l<Class<?>, kotlin.reflect.r>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.r invoke(@dl.d Class<?> it) {
            f0.p(it, "it");
            return kotlin.reflect.full.e.b(CachesKt.d(it), CollectionsKt__CollectionsKt.E(), false, CollectionsKt__CollectionsKt.E());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final a<kotlin.reflect.r> f125075d = b.a(new yh.l<Class<?>, kotlin.reflect.r>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.r invoke(@dl.d Class<?> it) {
            f0.p(it, "it");
            return kotlin.reflect.full.e.b(CachesKt.d(it), CollectionsKt__CollectionsKt.E(), true, CollectionsKt__CollectionsKt.E());
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final a<ConcurrentHashMap<Pair<List<kotlin.reflect.t>, Boolean>, kotlin.reflect.r>> f125076e = b.a(new yh.l<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends kotlin.reflect.t>, ? extends Boolean>, kotlin.reflect.r>>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap<Pair<List<kotlin.reflect.t>, Boolean>, kotlin.reflect.r> invoke(@dl.d Class<?> it) {
            f0.p(it, "it");
            return new ConcurrentHashMap<>();
        }
    });

    public static final void a() {
        f125072a.a();
        f125073b.a();
        f125074c.a();
        f125075d.a();
        f125076e.a();
    }

    @dl.d
    public static final <T> kotlin.reflect.r b(@dl.d Class<T> jClass, @dl.d List<kotlin.reflect.t> arguments, boolean z10) {
        f0.p(jClass, "jClass");
        f0.p(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z10 ? f125075d.b(jClass) : f125074c.b(jClass);
        }
        return c(jClass, arguments, z10);
    }

    private static final <T> kotlin.reflect.r c(Class<T> cls, List<kotlin.reflect.t> list, boolean z10) {
        ConcurrentHashMap<Pair<List<kotlin.reflect.t>, Boolean>, kotlin.reflect.r> concurrentHashMapB = f125076e.b(cls);
        Pair<List<kotlin.reflect.t>, Boolean> pairA = c1.a(list, Boolean.valueOf(z10));
        kotlin.reflect.r rVar = concurrentHashMapB.get(pairA);
        if (rVar == null) {
            kotlin.reflect.r rVarB = kotlin.reflect.full.e.b(d(cls), list, z10, CollectionsKt__CollectionsKt.E());
            kotlin.reflect.r rVarPutIfAbsent = concurrentHashMapB.putIfAbsent(pairA, rVarB);
            rVar = rVarPutIfAbsent == null ? rVarB : rVarPutIfAbsent;
        }
        f0.o(rVar, "cache.getOrPut(arguments…lable, emptyList())\n    }");
        return rVar;
    }

    @dl.d
    public static final <T> KClassImpl<T> d(@dl.d Class<T> jClass) {
        f0.p(jClass, "jClass");
        kotlin.reflect.h hVarB = f125072a.b(jClass);
        f0.n(hVarB, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl) hVarB;
    }

    @dl.d
    public static final <T> kotlin.reflect.h e(@dl.d Class<T> jClass) {
        f0.p(jClass, "jClass");
        return f125073b.b(jClass);
    }
}
