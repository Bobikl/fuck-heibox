package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ConcurrentHashMap<kotlin.reflect.d<? extends K>, Integer> f128222a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final AtomicInteger f128223b = new AtomicInteger(0);

    public abstract <T extends K> int b(@dl.d ConcurrentHashMap<kotlin.reflect.d<? extends K>, Integer> concurrentHashMap, @dl.d kotlin.reflect.d<T> dVar, @dl.d yh.l<? super kotlin.reflect.d<? extends K>, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final <T extends V, KK extends K> m<K, V, T> c(@dl.d kotlin.reflect.d<KK> kClass) {
        f0.p(kClass, "kClass");
        return new m<>(kClass, d(kClass));
    }

    public final <T extends K> int d(@dl.d kotlin.reflect.d<T> kClass) {
        f0.p(kClass, "kClass");
        return b(this.f128222a, kClass, new yh.l<kotlin.reflect.d<? extends K>, Integer>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.TypeRegistry$getId$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TypeRegistry<K, V> f128224b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f128224b = this;
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d kotlin.reflect.d<? extends K> it) {
                f0.p(it, "it");
                return Integer.valueOf(((TypeRegistry) this.f128224b).f128223b.getAndIncrement());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dl.d
    public final Collection<Integer> e() {
        Collection<Integer> collectionValues = this.f128222a.values();
        f0.o(collectionValues, "idPerType.values");
        return collectionValues;
    }
}
