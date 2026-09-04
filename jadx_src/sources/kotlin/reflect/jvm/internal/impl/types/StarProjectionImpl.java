package kotlin.reflect.jvm.internal.impl.types;

import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StarProjectionImpl extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.y0 f128012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.z f128013b;

    public StarProjectionImpl(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 typeParameter) {
        kotlin.jvm.internal.f0.p(typeParameter, "typeParameter");
        this.f128012a = typeParameter;
        this.f128013b = kotlin.b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<d0>() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl$_type$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d0 invoke() {
                return p0.b(this.f128014b.f128012a);
            }
        });
    }

    private final d0 e() {
        return (d0) this.f128013b.getValue();
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
        return e();
    }
}
