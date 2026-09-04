package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.reflect.jvm.internal.impl.types.z0;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: TypeUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeUtilsKt {
    @d
    public static final c1 a(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return new e1(d0Var);
    }

    public static final boolean b(@d d0 d0Var, @d l<? super l1, Boolean> predicate) {
        f0.p(d0Var, "<this>");
        f0.p(predicate, "predicate");
        return i1.c(d0Var, predicate);
    }

    private static final boolean c(d0 d0Var, z0 z0Var, Set<? extends y0> set) {
        boolean zC;
        if (f0.g(d0Var.O0(), z0Var)) {
            return true;
        }
        f fVarD = d0Var.O0().d();
        g gVar = fVarD instanceof g ? (g) fVarD : null;
        List<y0> listW = gVar != null ? gVar.w() : null;
        Iterable<h0> iterableC6 = CollectionsKt___CollectionsKt.c6(d0Var.M0());
        if (!(iterableC6 instanceof Collection) || !((Collection) iterableC6).isEmpty()) {
            for (h0 h0Var : iterableC6) {
                int iA = h0Var.a();
                c1 c1Var = (c1) h0Var.b();
                y0 y0Var = listW != null ? (y0) CollectionsKt___CollectionsKt.R2(listW, iA) : null;
                if (((y0Var == null || set == null || !set.contains(y0Var)) ? false : true) || c1Var.b()) {
                    zC = false;
                } else {
                    d0 type = c1Var.getType();
                    f0.o(type, "argument.type");
                    zC = c(type, z0Var, set);
                }
                if (zC) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return b(d0Var, new l<l1, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$containsTypeAliasParameters$1
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@d l1 it) {
                f0.p(it, "it");
                f fVarD = it.O0().d();
                return Boolean.valueOf(fVarD != null ? TypeUtilsKt.q(fVarD) : false);
            }
        });
    }

    public static final boolean e(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return i1.c(d0Var, new l<l1, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$containsTypeParameter$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(l1 l1Var) {
                return Boolean.valueOf(i1.m(l1Var));
            }
        });
    }

    @d
    public static final c1 f(@d d0 type, @d Variance projectionKind, @e y0 y0Var) {
        f0.p(type, "type");
        f0.p(projectionKind, "projectionKind");
        if ((y0Var != null ? y0Var.n() : null) == projectionKind) {
            projectionKind = Variance.INVARIANT;
        }
        return new e1(projectionKind, type);
    }

    @d
    public static final Set<y0> g(@d d0 d0Var, @e Set<? extends y0> set) {
        f0.p(d0Var, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h(d0Var, d0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void h(d0 d0Var, d0 d0Var2, Set<y0> set, Set<? extends y0> set2) {
        f fVarD = d0Var.O0().d();
        if (fVarD instanceof y0) {
            if (!f0.g(d0Var.O0(), d0Var2.O0())) {
                set.add(fVarD);
                return;
            }
            for (d0 upperBound : ((y0) fVarD).getUpperBounds()) {
                f0.o(upperBound, "upperBound");
                h(upperBound, d0Var2, set, set2);
            }
            return;
        }
        f fVarD2 = d0Var.O0().d();
        g gVar = fVarD2 instanceof g ? (g) fVarD2 : null;
        List<y0> listW = gVar != null ? gVar.w() : null;
        int i10 = 0;
        for (c1 c1Var : d0Var.M0()) {
            int i11 = i10 + 1;
            y0 y0Var = listW != null ? (y0) CollectionsKt___CollectionsKt.R2(listW, i10) : null;
            if (!((y0Var == null || set2 == null || !set2.contains(y0Var)) ? false : true) && !c1Var.b() && !CollectionsKt___CollectionsKt.R1(set, c1Var.getType().O0().d()) && !f0.g(c1Var.getType().O0(), d0Var2.O0())) {
                d0 type = c1Var.getType();
                f0.o(type, "argument.type");
                h(type, d0Var2, set, set2);
            }
            i10 = i11;
        }
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.builtins.g i(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.builtins.g gVarT = d0Var.O0().t();
        f0.o(gVarT, "constructor.builtIns");
        return gVarT;
    }

    @d
    public static final d0 j(@d y0 y0Var) {
        Object obj;
        f0.p(y0Var, "<this>");
        List<d0> upperBounds = y0Var.getUpperBounds();
        f0.o(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<d0> upperBounds2 = y0Var.getUpperBounds();
        f0.o(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            f fVarD = ((d0) next).O0().d();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
            boolean z10 = false;
            if (dVar != null && dVar.b() != ClassKind.INTERFACE && dVar.b() != ClassKind.ANNOTATION_CLASS) {
                z10 = true;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        d0 d0Var = (d0) obj;
        if (d0Var != null) {
            return d0Var;
        }
        List<d0> upperBounds3 = y0Var.getUpperBounds();
        f0.o(upperBounds3, "upperBounds");
        Object objW2 = CollectionsKt___CollectionsKt.w2(upperBounds3);
        f0.o(objW2, "upperBounds.first()");
        return (d0) objW2;
    }

    @i
    public static final boolean k(@d y0 typeParameter) {
        f0.p(typeParameter, "typeParameter");
        return m(typeParameter, null, null, 6, null);
    }

    @i
    public static final boolean l(@d y0 typeParameter, @e z0 z0Var, @e Set<? extends y0> set) {
        f0.p(typeParameter, "typeParameter");
        List<d0> upperBounds = typeParameter.getUpperBounds();
        f0.o(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (d0 upperBound : upperBounds) {
                f0.o(upperBound, "upperBound");
                if (c(upperBound, typeParameter.v().O0(), set) && (z0Var == null || f0.g(upperBound.O0(), z0Var))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean m(y0 y0Var, z0 z0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return l(y0Var, z0Var, set);
    }

    public static final boolean n(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        if (!(d0Var instanceof kotlin.reflect.jvm.internal.impl.types.e)) {
            if (!((d0Var instanceof n) && (((n) d0Var).a1() instanceof kotlin.reflect.jvm.internal.impl.types.e))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        if (!(d0Var instanceof q0)) {
            if (!((d0Var instanceof n) && (((n) d0Var).a1() instanceof q0))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean p(@d d0 d0Var, @d d0 superType) {
        f0.p(d0Var, "<this>");
        f0.p(superType, "superType");
        return kotlin.reflect.jvm.internal.impl.types.checker.e.f128071a.d(d0Var, superType);
    }

    public static final boolean q(@d f fVar) {
        f0.p(fVar, "<this>");
        return (fVar instanceof y0) && (((y0) fVar).c() instanceof x0);
    }

    public static final boolean r(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return i1.m(d0Var);
    }

    public static final boolean s(@d d0 type) {
        f0.p(type, "type");
        return (type instanceof kotlin.reflect.jvm.internal.impl.types.error.f) && ((kotlin.reflect.jvm.internal.impl.types.error.f) type).Y0().isUnresolved();
    }

    @d
    public static final d0 t(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        d0 d0VarN = i1.n(d0Var);
        f0.o(d0VarN, "makeNotNullable(this)");
        return d0VarN;
    }

    @d
    public static final d0 u(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        d0 d0VarO = i1.o(d0Var);
        f0.o(d0VarO, "makeNullable(this)");
        return d0VarO;
    }

    @d
    public static final d0 v(@d d0 d0Var, @d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e newAnnotations) {
        f0.p(d0Var, "<this>");
        f0.p(newAnnotations, "newAnnotations");
        return (d0Var.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? d0Var : d0Var.R0().U0(kotlin.reflect.jvm.internal.impl.types.x0.a(d0Var.N0(), newAnnotations));
    }

    @d
    public static final d0 w(@d d0 d0Var) {
        j0 j0Var;
        l1 l1VarF;
        f0.p(d0Var, "<this>");
        l1 l1VarR0 = d0Var.R0();
        if (l1VarR0 instanceof y) {
            y yVar = (y) l1VarR0;
            j0 j0VarW0 = yVar.W0();
            if (!j0VarW0.O0().getParameters().isEmpty() && j0VarW0.O0().d() != null) {
                List<y0> parameters = j0VarW0.O0().getParameters();
                f0.o(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(t.Y(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((y0) it.next()));
                }
                j0VarW0 = g1.f(j0VarW0, arrayList, null, 2, null);
            }
            j0 j0VarX0 = yVar.X0();
            if (!j0VarX0.O0().getParameters().isEmpty() && j0VarX0.O0().d() != null) {
                List<y0> parameters2 = j0VarX0.O0().getParameters();
                f0.o(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(t.Y(parameters2, 10));
                Iterator<T> it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((y0) it2.next()));
                }
                j0VarX0 = g1.f(j0VarX0, arrayList2, null, 2, null);
            }
            l1VarF = KotlinTypeFactory.d(j0VarW0, j0VarX0);
        } else {
            if (!(l1VarR0 instanceof j0)) {
                throw new NoWhenBranchMatchedException();
            }
            j0Var = (j0) l1VarR0;
            if (!j0Var.O0().getParameters().isEmpty() && j0Var.O0().d() != null) {
                l1VarF = j0Var;
                l1VarF = j0Var;
                List<y0> parameters3 = j0Var.O0().getParameters();
                f0.o(parameters3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(t.Y(parameters3, 10));
                Iterator<T> it3 = parameters3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl((y0) it3.next()));
                }
                l1VarF = g1.f(j0Var, arrayList3, null, 2, null);
            }
        }
        l1VarF = j0Var;
        l1VarF = j0Var;
        l1VarF = j0Var;
        return k1.b(l1VarF, l1VarR0);
    }

    public static final boolean x(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return b(d0Var, new l<l1, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$requiresTypeAliasExpansion$1
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@d l1 it) {
                f0.p(it, "it");
                f fVarD = it.O0().d();
                boolean z10 = false;
                if (fVarD != null && ((fVarD instanceof x0) || (fVarD instanceof y0))) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
    }

    public static final boolean y(@e d0 d0Var) {
        return d0Var == null || b(d0Var, new l<l1, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt$shouldBeUpdated$1
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@d l1 it) {
                f0.p(it, "it");
                return Boolean.valueOf((it instanceof q0) || (it.O0() instanceof si.t) || e0.a(it));
            }
        });
    }
}
