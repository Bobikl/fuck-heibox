package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h0;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.h;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import mi.a0;
import mi.c0;
import mi.i;
import mi.j;
import mi.v;
import mi.x;
import mi.y;

/* JADX INFO: compiled from: JavaTypeResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaTypeResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final g f126260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final d f126261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final TypeParameterUpperBoundEraser f126262d;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d g typeParameterResolver) {
        f0.p(c10, "c");
        f0.p(typeParameterResolver, "typeParameterResolver");
        this.f126259a = c10;
        this.f126260b = typeParameterResolver;
        d dVar = new d();
        this.f126261c = dVar;
        this.f126262d = new TypeParameterUpperBoundEraser(dVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(j jVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        Variance varianceN;
        if (!a0.a((x) CollectionsKt___CollectionsKt.q3(jVar.x()))) {
            return false;
        }
        List<y0> parameters = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f125544a.b(dVar).r().getParameters();
        f0.o(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        y0 y0Var = (y0) CollectionsKt___CollectionsKt.q3(parameters);
        return (y0Var == null || (varianceN = y0Var.n()) == null || varianceN == Variance.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    private final List<c1> c(j jVar, a aVar, z0 z0Var) {
        boolean z10;
        if (!jVar.L()) {
            if (jVar.x().isEmpty()) {
                List<y0> parameters = z0Var.getParameters();
                f0.o(parameters, "constructor.parameters");
                z10 = !parameters.isEmpty();
            }
        }
        List<y0> parameters2 = z0Var.getParameters();
        f0.o(parameters2, "constructor.parameters");
        if (z10) {
            return d(jVar, parameters2, z0Var, aVar);
        }
        if (parameters2.size() != jVar.x().size()) {
            ArrayList arrayList = new ArrayList(t.Y(parameters2, 10));
            for (y0 y0Var : parameters2) {
                ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                String strB = y0Var.getName().b();
                f0.o(strB, "p.name.asString()");
                arrayList.add(new e1(h.d(errorTypeKind, strB)));
            }
            return CollectionsKt___CollectionsKt.Q5(arrayList);
        }
        Iterable<h0> iterableC6 = CollectionsKt___CollectionsKt.c6(jVar.x());
        ArrayList arrayList2 = new ArrayList(t.Y(iterableC6, 10));
        for (h0 h0Var : iterableC6) {
            int iA = h0Var.a();
            x xVar = (x) h0Var.b();
            parameters2.size();
            y0 parameter = parameters2.get(iA);
            a aVarB = b.b(TypeUsage.COMMON, false, false, null, 7, null);
            f0.o(parameter, "parameter");
            arrayList2.add(p(xVar, aVarB, parameter));
        }
        return CollectionsKt___CollectionsKt.Q5(arrayList2);
    }

    private final List<c1> d(final j jVar, List<? extends y0> list, final z0 z0Var, final a aVar) {
        ArrayList arrayList = new ArrayList(t.Y(list, 10));
        for (final y0 y0Var : list) {
            arrayList.add(TypeUtilsKt.l(y0Var, null, aVar.c()) ? i1.t(y0Var, aVar) : this.f126261c.a(y0Var, aVar.j(jVar.L()), this.f126262d, new LazyWrappedType(this.f126259a.e(), new yh.a<d0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d0 invoke() {
                    TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.f126263b.f126262d;
                    y0 y0Var2 = y0Var;
                    a aVar2 = aVar;
                    f fVarD = z0Var.d();
                    return typeParameterUpperBoundEraser.c(y0Var2, aVar2.k(fVarD != null ? fVarD.v() : null).j(jVar.L()));
                }
            })));
        }
        return arrayList;
    }

    private final j0 e(j jVar, a aVar, j0 j0Var) {
        w0 w0VarB;
        if (j0Var == null || (w0VarB = j0Var.N0()) == null) {
            w0VarB = x0.b(new LazyJavaAnnotations(this.f126259a, jVar, false, 4, null));
        }
        w0 w0Var = w0VarB;
        z0 z0VarF = f(jVar, aVar);
        if (z0VarF == null) {
            return null;
        }
        boolean zI = i(aVar);
        return (f0.g(j0Var != null ? j0Var.O0() : null, z0VarF) && !jVar.L() && zI) ? j0Var.V0(true) : KotlinTypeFactory.l(w0Var, z0VarF, c(jVar, aVar, z0VarF), zI, null, 16, null);
    }

    private final z0 f(j jVar, a aVar) {
        z0 z0VarR;
        i iVarO = jVar.o();
        if (iVarO == null) {
            return g(jVar);
        }
        if (!(iVarO instanceof mi.g)) {
            if (iVarO instanceof y) {
                y0 y0VarA = this.f126260b.a((y) iVarO);
                if (y0VarA != null) {
                    return y0VarA.r();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + iVarO);
        }
        mi.g gVar = (mi.g) iVarO;
        kotlin.reflect.jvm.internal.impl.name.c cVarE = gVar.e();
        if (cVarE != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarJ = j(jVar, aVar, cVarE);
            if (dVarJ == null) {
                dVarJ = this.f126259a.a().n().a(gVar);
            }
            return (dVarJ == null || (z0VarR = dVarJ.r()) == null) ? g(jVar) : z0VarR;
        }
        throw new AssertionError("Class type should have a FQ name: " + iVarO);
    }

    private final z0 g(j jVar) {
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(jVar.D()));
        f0.o(bVarM, "topLevel(FqName(javaType.classifierQualifiedName))");
        z0 z0VarR = this.f126259a.a().b().d().q().d(bVarM, s.k(0)).r();
        f0.o(z0VarR, "c.components.deserialize…istOf(0)).typeConstructor");
        return z0VarR;
    }

    private final boolean h(Variance variance, y0 y0Var) {
        return (y0Var.n() == Variance.INVARIANT || variance == y0Var.n()) ? false : true;
    }

    private final boolean i(a aVar) {
        return (aVar.g() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == TypeUsage.SUPERTYPE) ? false : true;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d j(j jVar, a aVar, kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (aVar.h() && f0.g(cVar, c.f126284a)) {
            return this.f126259a.a().p().c();
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f125544a;
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarF = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f(dVar, cVar, this.f126259a.d().t(), null, 4, null);
        if (dVarF == null) {
            return null;
        }
        return (dVar.d(dVarF) && (aVar.g() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || aVar.b() == TypeUsage.SUPERTYPE || b(jVar, dVarF))) ? dVar.b(dVarF) : dVarF;
    }

    public static /* synthetic */ d0 l(JavaTypeResolver javaTypeResolver, mi.f fVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return javaTypeResolver.k(fVar, aVar, z10);
    }

    private final d0 m(j jVar, a aVar) {
        j0 j0VarE;
        boolean z10 = (aVar.h() || aVar.b() == TypeUsage.SUPERTYPE) ? false : true;
        boolean zL = jVar.L();
        if (!zL && !z10) {
            j0 j0VarE2 = e(jVar, aVar, null);
            return j0VarE2 != null ? j0VarE2 : n(jVar);
        }
        j0 j0VarE3 = e(jVar, aVar.l(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (j0VarE3 != null && (j0VarE = e(jVar, aVar.l(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), j0VarE3)) != null) {
            return zL ? new RawTypeImpl(j0VarE3, j0VarE) : KotlinTypeFactory.d(j0VarE3, j0VarE);
        }
        return n(jVar);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.error.f n(j jVar) {
        return h.d(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, jVar.B());
    }

    private final c1 p(x xVar, a aVar, y0 y0Var) {
        c1 c1VarT;
        if (!(xVar instanceof c0)) {
            return new e1(Variance.INVARIANT, o(xVar, aVar));
        }
        c0 c0Var = (c0) xVar;
        x xVarW = c0Var.w();
        Variance variance = c0Var.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (xVarW == null || h(variance, y0Var)) {
            c1VarT = i1.t(y0Var, aVar);
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarA = kotlin.reflect.jvm.internal.impl.load.java.x.a(this.f126259a, c0Var);
            d0 d0VarO = o(xVarW, b.b(TypeUsage.COMMON, false, false, null, 7, null));
            if (cVarA != null) {
                d0VarO = TypeUtilsKt.v(d0VarO, e.f125601z1.a(CollectionsKt___CollectionsKt.v4(d0VarO.getAnnotations(), cVarA)));
            }
            c1VarT = TypeUtilsKt.f(d0VarO, variance, y0Var);
        }
        f0.o(c1VarT, "{\n                val bo…          }\n            }");
        return c1VarT;
    }

    @dl.d
    public final d0 k(@dl.d mi.f arrayType, @dl.d a attr, boolean z10) {
        f0.p(arrayType, "arrayType");
        f0.p(attr, "attr");
        x xVarR = arrayType.r();
        v vVar = xVarR instanceof v ? (v) xVarR : null;
        PrimitiveType type = vVar != null ? vVar.getType() : null;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f126259a, arrayType, true);
        if (type != null) {
            j0 j0VarO = this.f126259a.d().t().O(type);
            f0.o(j0VarO, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            TypeUtilsKt.v(j0VarO, e.f125601z1.a(CollectionsKt___CollectionsKt.u4(lazyJavaAnnotations, j0VarO.getAnnotations())));
            return attr.h() ? j0VarO : KotlinTypeFactory.d(j0VarO, j0VarO.V0(true));
        }
        d0 d0VarO = o(xVarR, b.b(TypeUsage.COMMON, attr.h(), false, null, 6, null));
        if (attr.h()) {
            j0 j0VarM = this.f126259a.d().t().m(z10 ? Variance.OUT_VARIANCE : Variance.INVARIANT, d0VarO, lazyJavaAnnotations);
            f0.o(j0VarM, "c.module.builtIns.getArr…mponentType, annotations)");
            return j0VarM;
        }
        j0 j0VarM2 = this.f126259a.d().t().m(Variance.INVARIANT, d0VarO, lazyJavaAnnotations);
        f0.o(j0VarM2, "c.module.builtIns.getArr…mponentType, annotations)");
        return KotlinTypeFactory.d(j0VarM2, this.f126259a.d().t().m(Variance.OUT_VARIANCE, d0VarO, lazyJavaAnnotations).V0(true));
    }

    @dl.d
    public final d0 o(@dl.e x xVar, @dl.d a attr) {
        d0 d0VarO;
        f0.p(attr, "attr");
        if (xVar instanceof v) {
            PrimitiveType type = ((v) xVar).getType();
            j0 j0VarR = type != null ? this.f126259a.d().t().R(type) : this.f126259a.d().t().Z();
            f0.o(j0VarR, "{\n                val pr…ns.unitType\n            }");
            return j0VarR;
        }
        if (xVar instanceof j) {
            return m((j) xVar, attr);
        }
        if (xVar instanceof mi.f) {
            return l(this, (mi.f) xVar, attr, false, 4, null);
        }
        if (xVar instanceof c0) {
            x xVarW = ((c0) xVar).w();
            if (xVarW != null && (d0VarO = o(xVarW, attr)) != null) {
                return d0VarO;
            }
            j0 j0VarY = this.f126259a.d().t().y();
            f0.o(j0VarY, "c.module.builtIns.defaultBound");
            return j0VarY;
        }
        if (xVar == null) {
            j0 j0VarY2 = this.f126259a.d().t().y();
            f0.o(j0VarY2, "c.module.builtIns.defaultBound");
            return j0VarY2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }
}
