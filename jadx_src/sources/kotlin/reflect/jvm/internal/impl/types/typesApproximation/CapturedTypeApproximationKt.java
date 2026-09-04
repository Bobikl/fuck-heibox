package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.g1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.z0;
import yh.l;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CapturedTypeApproximationKt {

    /* JADX INFO: compiled from: CapturedTypeApproximation.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128182a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128182a = iArr;
        }
    }

    /* JADX INFO: compiled from: CapturedTypeApproximation.kt */
    public static final class b extends a1 {
        b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.a1
        @e
        public c1 k(@d z0 key) {
            f0.p(key, "key");
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b bVar = key instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b ? (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) key : null;
            if (bVar == null) {
                return null;
            }
            return bVar.c().b() ? new e1(Variance.OUT_VARIANCE, bVar.c().getType()) : bVar.c();
        }
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<d0> a(@d d0 type) {
        Object objE;
        f0.p(type, "type");
        if (b0.b(type)) {
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<d0> aVarA = a(b0.c(type));
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<d0> aVarA2 = a(b0.d(type));
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(k1.b(KotlinTypeFactory.d(b0.c(aVarA.c()), b0.d(aVarA2.c())), type), k1.b(KotlinTypeFactory.d(b0.c(aVarA.d()), b0.d(aVarA2.d())), type));
        }
        z0 z0VarO0 = type.O0();
        if (CapturedTypeConstructorKt.d(type)) {
            f0.n(z0VarO0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            c1 c1VarC = ((kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) z0VarO0).c();
            d0 type2 = c1VarC.getType();
            f0.o(type2, "typeProjection.type");
            d0 d0VarB = b(type2, type);
            int i10 = a.f128182a[c1VarC.c().ordinal()];
            if (i10 == 2) {
                j0 j0VarI = TypeUtilsKt.i(type).I();
                f0.o(j0VarI, "type.builtIns.nullableAnyType");
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(d0VarB, j0VarI);
            }
            if (i10 == 3) {
                j0 j0VarH = TypeUtilsKt.i(type).H();
                f0.o(j0VarH, "type.builtIns.nothingType");
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(b(j0VarH, type), d0VarB);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + c1VarC);
        }
        if (type.M0().isEmpty() || type.M0().size() != z0VarO0.getParameters().size()) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<c1> listM0 = type.M0();
        List<y0> parameters = z0VarO0.getParameters();
        f0.o(parameters, "typeConstructor.parameters");
        for (Pair pair : CollectionsKt___CollectionsKt.d6(listM0, parameters)) {
            c1 c1Var = (c1) pair.a();
            y0 typeParameter = (y0) pair.b();
            f0.o(typeParameter, "typeParameter");
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.b bVarG = g(c1Var, typeParameter);
            if (c1Var.b()) {
                arrayList.add(bVarG);
                arrayList2.add(bVarG);
            } else {
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<kotlin.reflect.jvm.internal.impl.types.typesApproximation.b> aVarD = d(bVarG);
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.b bVarA = aVarD.a();
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.b bVarB = aVarD.b();
                arrayList.add(bVarA);
                arrayList2.add(bVarB);
            }
        }
        boolean z10 = true;
        if (arrayList.isEmpty()) {
            z10 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
        } while (!(!((kotlin.reflect.jvm.internal.impl.types.typesApproximation.b) it.next()).d()));
        if (z10) {
            objE = TypeUtilsKt.i(type).H();
            f0.o(objE, "type.builtIns.nothingType");
        } else {
            objE = e(type, arrayList);
        }
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(objE, e(type, arrayList2));
    }

    private static final d0 b(d0 d0Var, d0 d0Var2) {
        d0 d0VarQ = i1.q(d0Var, d0Var2.P0());
        f0.o(d0VarQ, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return d0VarQ;
    }

    @e
    public static final c1 c(@e c1 c1Var, boolean z10) {
        if (c1Var == null) {
            return null;
        }
        if (c1Var.b()) {
            return c1Var;
        }
        d0 type = c1Var.getType();
        f0.o(type, "typeProjection.type");
        if (!i1.c(type, new l<l1, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(l1 it) {
                f0.o(it, "it");
                return Boolean.valueOf(CapturedTypeConstructorKt.d(it));
            }
        })) {
            return c1Var;
        }
        Variance varianceC = c1Var.c();
        f0.o(varianceC, "typeProjection.projectionKind");
        if (varianceC == Variance.OUT_VARIANCE) {
            return new e1(varianceC, a(type).d());
        }
        return z10 ? new e1(varianceC, a(type).c()) : f(c1Var);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<kotlin.reflect.jvm.internal.impl.types.typesApproximation.b> d(kotlin.reflect.jvm.internal.impl.types.typesApproximation.b bVar) {
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<d0> aVarA = a(bVar.a());
        d0 d0VarA = aVarA.a();
        d0 d0VarB = aVarA.b();
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<d0> aVarA2 = a(bVar.b());
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(new kotlin.reflect.jvm.internal.impl.types.typesApproximation.b(bVar.c(), d0VarB, aVarA2.a()), new kotlin.reflect.jvm.internal.impl.types.typesApproximation.b(bVar.c(), d0VarA, aVarA2.b()));
    }

    private static final d0 e(d0 d0Var, List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.b> list) {
        d0Var.M0().size();
        list.size();
        ArrayList arrayList = new ArrayList(t.Y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((kotlin.reflect.jvm.internal.impl.types.typesApproximation.b) it.next()));
        }
        return g1.e(d0Var, arrayList, null, null, 6, null);
    }

    private static final c1 f(c1 c1Var) {
        TypeSubstitutor typeSubstitutorG = TypeSubstitutor.g(new b());
        f0.o(typeSubstitutorG, "create(object : TypeCons…ojection\n        }\n    })");
        return typeSubstitutorG.t(c1Var);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.b g(c1 c1Var, y0 y0Var) {
        int i10 = a.f128182a[TypeSubstitutor.c(y0Var.n(), c1Var).ordinal()];
        if (i10 == 1) {
            d0 type = c1Var.getType();
            f0.o(type, "type");
            d0 type2 = c1Var.getType();
            f0.o(type2, "type");
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.b(y0Var, type, type2);
        }
        if (i10 == 2) {
            d0 type3 = c1Var.getType();
            f0.o(type3, "type");
            j0 j0VarI = DescriptorUtilsKt.j(y0Var).I();
            f0.o(j0VarI, "typeParameter.builtIns.nullableAnyType");
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.b(y0Var, type3, j0VarI);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        j0 j0VarH = DescriptorUtilsKt.j(y0Var).H();
        f0.o(j0VarH, "typeParameter.builtIns.nothingType");
        d0 type4 = c1Var.getType();
        f0.o(type4, "type");
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.b(y0Var, j0VarH, type4);
    }

    private static final c1 h(kotlin.reflect.jvm.internal.impl.types.typesApproximation.b bVar) {
        bVar.d();
        if (!f0.g(bVar.a(), bVar.b())) {
            Variance varianceN = bVar.c().n();
            Variance variance = Variance.IN_VARIANCE;
            if (varianceN != variance) {
                if ((!g.m0(bVar.a()) || bVar.c().n() == variance) && g.o0(bVar.b())) {
                    return new e1(i(bVar, variance), bVar.a());
                }
                return new e1(i(bVar, Variance.OUT_VARIANCE), bVar.b());
            }
        }
        return new e1(bVar.a());
    }

    private static final Variance i(kotlin.reflect.jvm.internal.impl.types.typesApproximation.b bVar, Variance variance) {
        return variance == bVar.c().n() ? Variance.INVARIANT : variance;
    }
}
