package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n80#2,3:207\n85#2:211\n1#3:210\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n52#1:207,3\n52#1:211\n52#1:210\n*E\n"})
public final class ClassValueCache<T> implements d2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<kotlin.reflect.d<?>, kotlinx.serialization.g<T>> f130603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ClassValueReferences<m<T>> f130604b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueCache(@dl.d yh.l<? super kotlin.reflect.d<?>, ? extends kotlinx.serialization.g<T>> compute) {
        kotlin.jvm.internal.f0.p(compute, "compute");
        this.f130603a = compute;
        this.f130604b = new ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.d2
    @dl.e
    public kotlinx.serialization.g<T> a(@dl.d final kotlin.reflect.d<Object> key) {
        kotlin.jvm.internal.f0.p(key, "key");
        m<T> mVar = this.f130604b.get(xh.a.e(key));
        kotlin.jvm.internal.f0.o(mVar, "get(...)");
        f1 f1Var = (f1) mVar;
        T t10 = f1Var.f130693a.get();
        if (t10 == null) {
            t10 = (T) f1Var.a(new yh.a<T>() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public final T invoke() {
                    return (T) new m(this.f130605b.b().invoke(key));
                }
            });
        }
        return t10.f130725a;
    }

    @dl.d
    public final yh.l<kotlin.reflect.d<?>, kotlinx.serialization.g<T>> b() {
        return this.f130603a;
    }
}
