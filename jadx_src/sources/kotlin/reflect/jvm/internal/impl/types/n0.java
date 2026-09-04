package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n0 {
    @dl.e
    public static final a a(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        l1 l1VarR0 = d0Var.R0();
        if (l1VarR0 instanceof a) {
            return (a) l1VarR0;
        }
        return null;
    }

    @dl.e
    public static final j0 b(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        a aVarA = a(d0Var);
        if (aVarA != null) {
            return aVarA.a1();
        }
        return null;
    }

    public static final boolean c(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        return d0Var.R0() instanceof n;
    }

    private static final IntersectionTypeConstructor d(IntersectionTypeConstructor intersectionTypeConstructor) {
        d0 d0Var;
        Collection<d0> collectionL = intersectionTypeConstructor.l();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(collectionL, 10));
        Iterator<T> it = collectionL.iterator();
        boolean z10 = false;
        while (true) {
            d0Var = null;
            if (!it.hasNext()) {
                break;
            }
            d0 d0VarF = (d0) it.next();
            if (i1.l(d0VarF)) {
                d0VarF = f(d0VarF.R0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(d0VarF);
        }
        if (!z10) {
            return null;
        }
        d0 d0VarH = intersectionTypeConstructor.h();
        if (d0VarH != null) {
            if (i1.l(d0VarH)) {
                d0VarH = f(d0VarH.R0(), false, 1, null);
            }
            d0Var = d0VarH;
        }
        return new IntersectionTypeConstructor(arrayList).m(d0Var);
    }

    @dl.d
    public static final l1 e(@dl.d l1 l1Var, boolean z10) {
        kotlin.jvm.internal.f0.p(l1Var, "<this>");
        n nVarB = n.f128155e.b(l1Var, z10);
        if (nVarB != null) {
            return nVarB;
        }
        j0 j0VarG = g(l1Var);
        return j0VarG != null ? j0VarG : l1Var.V0(false);
    }

    public static /* synthetic */ l1 f(l1 l1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(l1Var, z10);
    }

    private static final j0 g(d0 d0Var) {
        IntersectionTypeConstructor intersectionTypeConstructorD;
        z0 z0VarO0 = d0Var.O0();
        IntersectionTypeConstructor intersectionTypeConstructor = z0VarO0 instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) z0VarO0 : null;
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorD = d(intersectionTypeConstructor)) == null) {
            return null;
        }
        return intersectionTypeConstructorD.g();
    }

    @dl.d
    public static final j0 h(@dl.d j0 j0Var, boolean z10) {
        kotlin.jvm.internal.f0.p(j0Var, "<this>");
        n nVarB = n.f128155e.b(j0Var, z10);
        if (nVarB != null) {
            return nVarB;
        }
        j0 j0VarG = g(j0Var);
        return j0VarG == null ? j0Var.V0(false) : j0VarG;
    }

    public static /* synthetic */ j0 i(j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(j0Var, z10);
    }

    @dl.d
    public static final j0 j(@dl.d j0 j0Var, @dl.d j0 abbreviatedType) {
        kotlin.jvm.internal.f0.p(j0Var, "<this>");
        kotlin.jvm.internal.f0.p(abbreviatedType, "abbreviatedType");
        return e0.a(j0Var) ? j0Var : new a(j0Var, abbreviatedType);
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.types.checker.h k(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        kotlin.jvm.internal.f0.p(hVar, "<this>");
        return new kotlin.reflect.jvm.internal.impl.types.checker.h(hVar.X0(), hVar.O0(), hVar.Z0(), hVar.N0(), hVar.P0(), true);
    }
}
