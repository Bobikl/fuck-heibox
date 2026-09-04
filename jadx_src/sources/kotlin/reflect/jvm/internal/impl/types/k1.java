package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k1 {
    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public static final d0 a(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        if (d0Var instanceof j1) {
            return ((j1) d0Var).u0();
        }
        return null;
    }

    @dl.d
    public static final l1 b(@dl.d l1 l1Var, @dl.d d0 origin) {
        kotlin.jvm.internal.f0.p(l1Var, "<this>");
        kotlin.jvm.internal.f0.p(origin, "origin");
        return d(l1Var, a(origin));
    }

    @dl.d
    public static final l1 c(@dl.d l1 l1Var, @dl.d d0 origin, @dl.d yh.l<? super d0, ? extends d0> transform) {
        kotlin.jvm.internal.f0.p(l1Var, "<this>");
        kotlin.jvm.internal.f0.p(origin, "origin");
        kotlin.jvm.internal.f0.p(transform, "transform");
        d0 d0VarA = a(origin);
        return d(l1Var, d0VarA != null ? transform.invoke(d0VarA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final l1 d(@dl.d l1 l1Var, @dl.e d0 d0Var) {
        kotlin.jvm.internal.f0.p(l1Var, "<this>");
        if (l1Var instanceof j1) {
            return d(((j1) l1Var).Z(), d0Var);
        }
        if (d0Var == null || kotlin.jvm.internal.f0.g(d0Var, l1Var)) {
            return l1Var;
        }
        if (l1Var instanceof j0) {
            return new m0((j0) l1Var, d0Var);
        }
        if (l1Var instanceof y) {
            return new a0((y) l1Var, d0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
