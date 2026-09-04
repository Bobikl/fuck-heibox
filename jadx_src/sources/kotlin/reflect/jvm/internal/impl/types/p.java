package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p extends j0 {
    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public List<c1> M0() {
        return X0().M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return X0().N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public z0 O0() {
        return X0().O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return X0().P0();
    }

    @dl.d
    protected abstract j0 X0();

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public j0 Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 d0VarA = kotlinTypeRefiner.a(X0());
        kotlin.jvm.internal.f0.n(d0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Z0((j0) d0VarA);
    }

    @dl.d
    public abstract p Z0(@dl.d j0 j0Var);

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        return X0().u();
    }
}
