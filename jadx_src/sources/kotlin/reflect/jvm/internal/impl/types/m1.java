package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m1 extends d0 {
    public m1() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public List<c1> M0() {
        return S0().M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return S0().N0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public z0 O0() {
        return S0().O0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return S0().P0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public final l1 R0() {
        d0 d0VarS0 = S0();
        while (d0VarS0 instanceof m1) {
            d0VarS0 = ((m1) d0VarS0).S0();
        }
        kotlin.jvm.internal.f0.n(d0VarS0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (l1) d0VarS0;
    }

    @dl.d
    protected abstract d0 S0();

    public boolean T0() {
        return true;
    }

    @dl.d
    public String toString() {
        return T0() ? S0().toString() : "<Not computed yet>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        return S0().u();
    }
}
