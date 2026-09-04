package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 extends p implements j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final j0 f128153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final d0 f128154d;

    public m0(@dl.d j0 delegate, @dl.d d0 enhancement) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(enhancement, "enhancement");
        this.f128153c = delegate;
        this.f128154d = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public j0 V0(boolean z10) {
        l1 l1VarD = k1.d(Z().V0(z10), u0().R0().V0(z10));
        kotlin.jvm.internal.f0.n(l1VarD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (j0) l1VarD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: W0 */
    public j0 U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        l1 l1VarD = k1.d(Z().U0(newAttributes), u0());
        kotlin.jvm.internal.f0.n(l1VarD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (j0) l1VarD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    protected j0 X0() {
        return this.f128153c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j1
    @dl.d
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public j0 Z() {
        return X0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public m0 Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 d0VarA = kotlinTypeRefiner.a(X0());
        kotlin.jvm.internal.f0.n(d0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new m0((j0) d0VarA, kotlinTypeRefiner.a(u0()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public m0 Z0(@dl.d j0 delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        return new m0(delegate, u0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j0
    @dl.d
    public String toString() {
        return "[@EnhancedForWarnings(" + u0() + ")] " + Z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j1
    @dl.d
    public d0 u0() {
        return this.f128154d;
    }
}
