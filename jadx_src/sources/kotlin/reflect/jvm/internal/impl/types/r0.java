package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: TypeAliasExpander.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f128164c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final r0 f128165d = new r0(t0.a.f128177a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final t0 f128166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f128167b;

    /* JADX INFO: compiled from: TypeAliasExpander.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i10, kotlin.reflect.jvm.internal.impl.descriptors.x0 x0Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + x0Var.getName());
        }
    }

    public r0(@dl.d t0 reportStrategy, boolean z10) {
        kotlin.jvm.internal.f0.p(reportStrategy, "reportStrategy");
        this.f128166a = reportStrategy;
        this.f128167b = z10;
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar2) {
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = eVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().e());
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : eVar2) {
            if (hashSet.contains(cVar.e())) {
                this.f128166a.c(cVar);
            }
        }
    }

    private final void b(d0 d0Var, d0 d0Var2) {
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(d0Var2);
        kotlin.jvm.internal.f0.o(typeSubstitutorF, "create(substitutedType)");
        int i10 = 0;
        for (Object obj : d0Var2.M0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            c1 c1Var = (c1) obj;
            if (!c1Var.b()) {
                d0 type = c1Var.getType();
                kotlin.jvm.internal.f0.o(type, "substitutedArgument.type");
                if (!TypeUtilsKt.d(type)) {
                    c1 c1Var2 = d0Var.M0().get(i10);
                    kotlin.reflect.jvm.internal.impl.descriptors.y0 typeParameter = d0Var.O0().getParameters().get(i10);
                    if (this.f128167b) {
                        t0 t0Var = this.f128166a;
                        d0 type2 = c1Var2.getType();
                        kotlin.jvm.internal.f0.o(type2, "unsubstitutedArgument.type");
                        d0 type3 = c1Var.getType();
                        kotlin.jvm.internal.f0.o(type3, "substitutedArgument.type");
                        kotlin.jvm.internal.f0.o(typeParameter, "typeParameter");
                        t0Var.a(typeSubstitutorF, type2, type3, typeParameter);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final t c(t tVar, w0 w0Var) {
        return tVar.U0(h(tVar, w0Var));
    }

    private final j0 d(j0 j0Var, w0 w0Var) {
        return e0.a(j0Var) ? j0Var : g1.f(j0Var, null, h(j0Var, w0Var), 1, null);
    }

    private final j0 e(j0 j0Var, d0 d0Var) {
        j0 j0VarR = i1.r(j0Var, d0Var.P0());
        kotlin.jvm.internal.f0.o(j0VarR, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return j0VarR;
    }

    private final j0 f(j0 j0Var, d0 d0Var) {
        return d(e(j0Var, d0Var), d0Var.N0());
    }

    private final j0 g(s0 s0Var, w0 w0Var, boolean z10) {
        z0 z0VarR = s0Var.b().r();
        kotlin.jvm.internal.f0.o(z0VarR, "descriptor.typeConstructor");
        return KotlinTypeFactory.m(w0Var, z0VarR, s0Var.a(), z10, MemberScope.b.f127587b);
    }

    private final w0 h(d0 d0Var, w0 w0Var) {
        return e0.a(d0Var) ? d0Var.N0() : w0Var.h(d0Var.N0());
    }

    private final c1 j(c1 c1Var, s0 s0Var, int i10) {
        l1 l1VarR0 = c1Var.getType().R0();
        if (u.a(l1VarR0)) {
            return c1Var;
        }
        j0 j0VarA = g1.a(l1VarR0);
        if (e0.a(j0VarA) || !TypeUtilsKt.x(j0VarA)) {
            return c1Var;
        }
        z0 z0VarO0 = j0VarA.O0();
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = z0VarO0.d();
        z0VarO0.getParameters().size();
        j0VarA.M0().size();
        if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) {
            return c1Var;
        }
        if (!(fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.x0)) {
            j0 j0VarM = m(j0VarA, s0Var, i10);
            b(j0VarA, j0VarM);
            return new e1(c1Var.c(), j0VarM);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.x0 x0Var = (kotlin.reflect.jvm.internal.impl.descriptors.x0) fVarD;
        int i11 = 0;
        if (s0Var.d(x0Var)) {
            this.f128166a.b(x0Var);
            Variance variance = Variance.INVARIANT;
            ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
            String string = x0Var.getName().toString();
            kotlin.jvm.internal.f0.o(string, "typeDescriptor.name.toString()");
            return new e1(variance, kotlin.reflect.jvm.internal.impl.types.error.h.d(errorTypeKind, string));
        }
        List<c1> listM0 = j0VarA.M0();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listM0, 10));
        for (Object obj : listM0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            arrayList.add(l((c1) obj, s0Var, z0VarO0.getParameters().get(i11), i10 + 1));
            i11 = i12;
        }
        j0 j0VarK = k(s0.f128171e.a(s0Var, x0Var, arrayList), j0VarA.N0(), j0VarA.P0(), i10 + 1, false);
        j0 j0VarM2 = m(j0VarA, s0Var, i10);
        if (!u.a(j0VarK)) {
            j0VarK = n0.j(j0VarK, j0VarM2);
        }
        return new e1(c1Var.c(), j0VarK);
    }

    private final j0 k(s0 s0Var, w0 w0Var, boolean z10, int i10, boolean z11) {
        c1 c1VarL = l(new e1(Variance.INVARIANT, s0Var.b().E0()), s0Var, null, i10);
        d0 type = c1VarL.getType();
        kotlin.jvm.internal.f0.o(type, "expandedProjection.type");
        j0 j0VarA = g1.a(type);
        if (e0.a(j0VarA)) {
            return j0VarA;
        }
        c1VarL.c();
        a(j0VarA.getAnnotations(), i.a(w0Var));
        j0 j0VarR = i1.r(d(j0VarA, w0Var), z10);
        kotlin.jvm.internal.f0.o(j0VarR, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        return z11 ? n0.j(j0VarR, g(s0Var, w0Var, z10)) : j0VarR;
    }

    private final c1 l(c1 c1Var, s0 s0Var, kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var, int i10) {
        Variance varianceN;
        Variance variance;
        Variance variance2;
        f128164c.b(i10, s0Var.b());
        if (c1Var.b()) {
            kotlin.jvm.internal.f0.m(y0Var);
            c1 c1VarS = i1.s(y0Var);
            kotlin.jvm.internal.f0.o(c1VarS, "makeStarProjection(typeParameterDescriptor!!)");
            return c1VarS;
        }
        d0 type = c1Var.getType();
        kotlin.jvm.internal.f0.o(type, "underlyingProjection.type");
        c1 c1VarC = s0Var.c(type.O0());
        if (c1VarC == null) {
            return j(c1Var, s0Var, i10);
        }
        if (c1VarC.b()) {
            kotlin.jvm.internal.f0.m(y0Var);
            c1 c1VarS2 = i1.s(y0Var);
            kotlin.jvm.internal.f0.o(c1VarS2, "makeStarProjection(typeParameterDescriptor!!)");
            return c1VarS2;
        }
        l1 l1VarR0 = c1VarC.getType().R0();
        Variance varianceC = c1VarC.c();
        kotlin.jvm.internal.f0.o(varianceC, "argument.projectionKind");
        Variance varianceC2 = c1Var.c();
        kotlin.jvm.internal.f0.o(varianceC2, "underlyingProjection.projectionKind");
        if (varianceC2 != varianceC && varianceC2 != (variance2 = Variance.INVARIANT)) {
            if (varianceC == variance2) {
                varianceC = varianceC2;
            } else {
                this.f128166a.d(s0Var.b(), y0Var, l1VarR0);
            }
        }
        if (y0Var == null || (varianceN = y0Var.n()) == null) {
            varianceN = Variance.INVARIANT;
        }
        kotlin.jvm.internal.f0.o(varianceN, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (varianceN != varianceC && varianceN != (variance = Variance.INVARIANT)) {
            if (varianceC == variance) {
                varianceC = variance;
            } else {
                this.f128166a.d(s0Var.b(), y0Var, l1VarR0);
            }
        }
        a(type.getAnnotations(), l1VarR0.getAnnotations());
        return new e1(varianceC, l1VarR0 instanceof t ? c((t) l1VarR0, type.N0()) : f(g1.a(l1VarR0), type));
    }

    private final j0 m(j0 j0Var, s0 s0Var, int i10) {
        z0 z0VarO0 = j0Var.O0();
        List<c1> listM0 = j0Var.M0();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listM0, 10));
        int i11 = 0;
        for (Object obj : listM0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            c1 c1Var = (c1) obj;
            c1 c1VarL = l(c1Var, s0Var, z0VarO0.getParameters().get(i11), i10 + 1);
            if (!c1VarL.b()) {
                c1VarL = new e1(c1VarL.c(), i1.q(c1VarL.getType(), c1Var.getType().P0()));
            }
            arrayList.add(c1VarL);
            i11 = i12;
        }
        return g1.f(j0Var, arrayList, null, 2, null);
    }

    @dl.d
    public final j0 i(@dl.d s0 typeAliasExpansion, @dl.d w0 attributes) {
        kotlin.jvm.internal.f0.p(typeAliasExpansion, "typeAliasExpansion");
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        return k(typeAliasExpansion, attributes, false, 0, true);
    }
}
