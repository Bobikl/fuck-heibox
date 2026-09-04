package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o0 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d0 f128159a;

    public o0(@dl.d kotlin.reflect.jvm.internal.impl.builtins.g kotlinBuiltIns) {
        kotlin.jvm.internal.f0.p(kotlinBuiltIns, "kotlinBuiltIns");
        j0 j0VarI = kotlinBuiltIns.I();
        kotlin.jvm.internal.f0.o(j0VarI, "kotlinBuiltIns.nullableAnyType");
        this.f128159a = j0VarI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    @dl.d
    public c1 a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    public boolean b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    @dl.d
    public Variance c() {
        return Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c1
    @dl.d
    public d0 getType() {
        return this.f128159a;
    }
}
