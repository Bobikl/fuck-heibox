package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends y implements j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final y f128045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final d0 f128046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@dl.d y origin, @dl.d d0 enhancement) {
        super(origin.W0(), origin.X0());
        kotlin.jvm.internal.f0.p(origin, "origin");
        kotlin.jvm.internal.f0.p(enhancement, "enhancement");
        this.f128045e = origin;
        this.f128046f = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: S0 */
    public l1 V0(boolean z10) {
        return k1.d(Z().V0(z10), u0().R0().V0(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public l1 U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        return k1.d(Z().U0(newAttributes), u0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public j0 V0() {
        return Z().V0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public String Y0(@dl.d DescriptorRenderer renderer, @dl.d kotlin.reflect.jvm.internal.impl.renderer.b options) {
        kotlin.jvm.internal.f0.p(renderer, "renderer");
        kotlin.jvm.internal.f0.p(options, "options");
        return options.b() ? renderer.y(u0()) : Z().Y0(renderer, options);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j1
    @dl.d
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public y Z() {
        return this.f128045e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public a0 Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 d0VarA = kotlinTypeRefiner.a(Z());
        kotlin.jvm.internal.f0.n(d0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new a0((y) d0VarA, kotlinTypeRefiner.a(u0()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    @dl.d
    public String toString() {
        return "[@EnhancedForWarnings(" + u0() + ")] " + Z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j1
    @dl.d
    public d0 u0() {
        return this.f128046f;
    }
}
