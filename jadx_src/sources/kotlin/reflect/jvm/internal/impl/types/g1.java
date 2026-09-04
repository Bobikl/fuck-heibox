package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g1 {
    @dl.d
    public static final j0 a(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        l1 l1VarR0 = d0Var.R0();
        j0 j0Var = l1VarR0 instanceof j0 ? (j0) l1VarR0 : null;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + d0Var).toString());
    }

    @dl.d
    @xh.i
    public static final d0 b(@dl.d d0 d0Var, @dl.d List<? extends c1> newArguments, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e newAnnotations) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(newArguments, "newArguments");
        kotlin.jvm.internal.f0.p(newAnnotations, "newAnnotations");
        return e(d0Var, newArguments, newAnnotations, null, 4, null);
    }

    @dl.d
    @xh.i
    public static final d0 c(@dl.d d0 d0Var, @dl.d List<? extends c1> newArguments, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e newAnnotations, @dl.d List<? extends c1> newArgumentsForUpperBound) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(newArguments, "newArguments");
        kotlin.jvm.internal.f0.p(newAnnotations, "newAnnotations");
        kotlin.jvm.internal.f0.p(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == d0Var.M0()) && newAnnotations == d0Var.getAnnotations()) {
            return d0Var;
        }
        w0 w0VarN0 = d0Var.N0();
        if ((newAnnotations instanceof kotlin.reflect.jvm.internal.impl.descriptors.annotations.h) && newAnnotations.isEmpty()) {
            newAnnotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
        }
        w0 w0VarA = x0.a(w0VarN0, newAnnotations);
        l1 l1VarR0 = d0Var.R0();
        if (l1VarR0 instanceof y) {
            y yVar = (y) l1VarR0;
            return KotlinTypeFactory.d(d(yVar.W0(), newArguments, w0VarA), d(yVar.X0(), newArgumentsForUpperBound, w0VarA));
        }
        if (l1VarR0 instanceof j0) {
            return d((j0) l1VarR0, newArguments, w0VarA);
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.d
    @xh.i
    public static final j0 d(@dl.d j0 j0Var, @dl.d List<? extends c1> newArguments, @dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(j0Var, "<this>");
        kotlin.jvm.internal.f0.p(newArguments, "newArguments");
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == j0Var.N0()) {
            return j0Var;
        }
        return newArguments.isEmpty() ? j0Var.U0(newAttributes) : KotlinTypeFactory.l(newAttributes, j0Var.O0(), newArguments, j0Var.P0(), null, 16, null);
    }

    public static /* synthetic */ d0 e(d0 d0Var, List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = d0Var.M0();
        }
        if ((i10 & 2) != 0) {
            eVar = d0Var.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(d0Var, list, eVar, list2);
    }

    public static /* synthetic */ j0 f(j0 j0Var, List list, w0 w0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = j0Var.M0();
        }
        if ((i10 & 2) != 0) {
            w0Var = j0Var.N0();
        }
        return d(j0Var, list, w0Var);
    }
}
