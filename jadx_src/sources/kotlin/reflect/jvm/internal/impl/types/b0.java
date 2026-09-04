package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: flexibleTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 {
    @dl.d
    public static final y a(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        l1 l1VarR0 = d0Var.R0();
        kotlin.jvm.internal.f0.n(l1VarR0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (y) l1VarR0;
    }

    public static final boolean b(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        return d0Var.R0() instanceof y;
    }

    @dl.d
    public static final j0 c(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        l1 l1VarR0 = d0Var.R0();
        if (l1VarR0 instanceof y) {
            return ((y) l1VarR0).W0();
        }
        if (l1VarR0 instanceof j0) {
            return (j0) l1VarR0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.d
    public static final j0 d(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        l1 l1VarR0 = d0Var.R0();
        if (l1VarR0 instanceof y) {
            return ((y) l1VarR0).X0();
        }
        if (l1VarR0 instanceof j0) {
            return (j0) l1VarR0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
