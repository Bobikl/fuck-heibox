package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyWrappedType extends m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.m f128007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.a<d0> f128008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h<d0> f128009e;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d yh.a<? extends d0> computation) {
        kotlin.jvm.internal.f0.p(storageManager, "storageManager");
        kotlin.jvm.internal.f0.p(computation, "computation");
        this.f128007c = storageManager;
        this.f128008d = computation;
        this.f128009e = storageManager.c(computation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m1
    @dl.d
    protected d0 S0() {
        return this.f128009e.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m1
    public boolean T0() {
        return this.f128009e.v0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public LazyWrappedType Y0(@dl.d final kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f128007c, new yh.a<d0>() { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$refine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d0 invoke() {
                return kotlinTypeRefiner.a((si.g) this.f128008d.invoke());
            }
        });
    }
}
