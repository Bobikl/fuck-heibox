package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z0 f128146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<c1> f128147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f128148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final MemberScope f128149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0> f128150g;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@dl.d z0 constructor, @dl.d List<? extends c1> arguments, boolean z10, @dl.d MemberScope memberScope, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.types.checker.f, ? extends j0> refinedTypeFactory) {
        kotlin.jvm.internal.f0.p(constructor, "constructor");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        kotlin.jvm.internal.f0.p(memberScope, "memberScope");
        kotlin.jvm.internal.f0.p(refinedTypeFactory, "refinedTypeFactory");
        this.f128146c = constructor;
        this.f128147d = arguments;
        this.f128148e = z10;
        this.f128149f = memberScope;
        this.f128150g = refinedTypeFactory;
        if (!(u() instanceof kotlin.reflect.jvm.internal.impl.types.error.e) || (u() instanceof kotlin.reflect.jvm.internal.impl.types.error.i)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + u() + '\n' + O0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public List<c1> M0() {
        return this.f128147d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return w0.f128193c.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public z0 O0() {
        return this.f128146c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return this.f128148e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public j0 V0(boolean z10) {
        if (z10 == P0()) {
            return this;
        }
        return z10 ? new h0(this) : new f0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: W0 */
    public j0 U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new l0(this, newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public j0 Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        j0 j0VarInvoke = this.f128150g.invoke(kotlinTypeRefiner);
        return j0VarInvoke == null ? this : j0VarInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        return this.f128149f;
    }
}
