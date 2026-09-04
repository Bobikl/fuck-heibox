package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
@j2
public final class ClassValueReferences<T> extends ClassValue<f1<T>> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ClassValue
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1<T> computeValue(@dl.d Class<?> type) {
        kotlin.jvm.internal.f0.p(type, "type");
        return new f1<>();
    }

    public final T b(@dl.d Class<?> key, @dl.d final yh.a<? extends T> factory) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(factory, "factory");
        T t10 = get(key);
        kotlin.jvm.internal.f0.o(t10, "get(...)");
        f1 f1Var = (f1) t10;
        T t11 = f1Var.f130693a.get();
        return t11 != null ? t11 : (T) f1Var.a(new yh.a<T>() { // from class: kotlinx.serialization.internal.ClassValueReferences$getOrSet$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            public final T invoke() {
                return factory.invoke();
            }
        });
    }
}
