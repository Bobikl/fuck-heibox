package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: StubTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q0 extends e implements si.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final z0 f128162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final MemberScope f128163h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.l originalTypeVariable, boolean z10, @dl.d z0 constructor) {
        super(originalTypeVariable, z10);
        kotlin.jvm.internal.f0.p(originalTypeVariable, "originalTypeVariable");
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        this.f128162g = constructor;
        this.f128163h = originalTypeVariable.t().i().u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public z0 O0() {
        return this.f128162g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e
    @dl.d
    public e Y0(boolean z10) {
        return new q0(X0(), z10, O0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j0
    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(X0());
        sb2.append(P0() ? "?" : "");
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e, kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        return this.f128163h;
    }
}
