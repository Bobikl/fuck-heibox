package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final j0 f128043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final j0 f128044d;

    public a(@dl.d j0 delegate, @dl.d j0 abbreviation) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(abbreviation, "abbreviation");
        this.f128043c = delegate;
        this.f128044d = abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public j0 U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        return new a(X0().U0(newAttributes), this.f128044d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    protected j0 X0() {
        return this.f128043c;
    }

    @dl.d
    public final j0 a1() {
        return this.f128044d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j0
    @dl.d
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a V0(boolean z10) {
        return new a(X0().V0(z10), this.f128044d.V0(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 d0VarA = kotlinTypeRefiner.a(X0());
        kotlin.jvm.internal.f0.n(d0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 d0VarA2 = kotlinTypeRefiner.a(this.f128044d);
        kotlin.jvm.internal.f0.n(d0VarA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((j0) d0VarA, (j0) d0VarA2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public a Z0(@dl.d j0 delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        return new a(delegate, this.f128044d);
    }

    @dl.d
    public final j0 f0() {
        return X0();
    }
}
