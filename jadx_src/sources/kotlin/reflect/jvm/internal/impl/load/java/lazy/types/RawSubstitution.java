package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.h;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.v;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.text.y;
import yh.l;

/* JADX INFO: compiled from: RawSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RawSubstitution extends f1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f126268e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f126269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f126270g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final d f126271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final TypeParameterUpperBoundEraser f126272d;

    /* JADX INFO: compiled from: RawSubstitution.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f126269f = b.b(typeUsage, false, true, null, 5, null).l(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f126270g = b.b(typeUsage, false, true, null, 5, null).l(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RawSubstitution(@e TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        d dVar = new d();
        this.f126271c = dVar;
        this.f126272d = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(dVar, null, 2, null) : typeParameterUpperBoundEraser;
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<j0, Boolean> j(final j0 j0Var, final kotlin.reflect.jvm.internal.impl.descriptors.d dVar, final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        if (j0Var.O0().getParameters().isEmpty()) {
            return c1.a(j0Var, Boolean.FALSE);
        }
        if (g.c0(j0Var)) {
            kotlin.reflect.jvm.internal.impl.types.c1 c1Var = j0Var.M0().get(0);
            Variance varianceC = c1Var.c();
            d0 type = c1Var.getType();
            f0.o(type, "componentTypeProjection.type");
            return c1.a(KotlinTypeFactory.l(j0Var.N0(), j0Var.O0(), s.k(new e1(varianceC, k(type, aVar))), j0Var.P0(), null, 16, null), Boolean.FALSE);
        }
        if (e0.a(j0Var)) {
            return c1.a(h.d(ErrorTypeKind.ERROR_RAW_TYPE, j0Var.O0().toString()), Boolean.FALSE);
        }
        MemberScope memberScopeB0 = dVar.B0(this);
        f0.o(memberScopeB0, "declaration.getMemberScope(this)");
        w0 w0VarN0 = j0Var.N0();
        z0 z0VarR = dVar.r();
        f0.o(z0VarR, "declaration.typeConstructor");
        List<y0> parameters = dVar.r().getParameters();
        f0.o(parameters, "declaration.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(t.Y(parameters, 10));
        for (y0 parameter : parameters) {
            d dVar2 = this.f126271c;
            f0.o(parameter, "parameter");
            arrayList.add(v.b(dVar2, parameter, aVar, this.f126272d, null, 8, null));
        }
        return c1.a(KotlinTypeFactory.n(w0VarN0, z0VarR, arrayList, j0Var.P0(), memberScopeB0, new l<f, j0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke(@dl.d f kotlinTypeRefiner) {
                kotlin.reflect.jvm.internal.impl.name.b bVarK;
                kotlin.reflect.jvm.internal.impl.descriptors.d dVarB;
                f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
                kotlin.reflect.jvm.internal.impl.descriptors.d dVar3 = dVar;
                if (!(dVar3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
                    dVar3 = null;
                }
                if (dVar3 == null || (bVarK = DescriptorUtilsKt.k(dVar3)) == null || (dVarB = kotlinTypeRefiner.b(bVarK)) == null || f0.g(dVarB, dVar)) {
                    return null;
                }
                return (j0) this.j(j0Var, dVarB, aVar).e();
            }
        }), Boolean.TRUE);
    }

    private final d0 k(d0 d0Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (fVarD instanceof y0) {
            return k(this.f126272d.c((y0) fVarD, aVar.j(true)), aVar);
        }
        if (!(fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + fVarD).toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD2 = b0.d(d0Var).O0().d();
        if (fVarD2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            Pair<j0, Boolean> pairJ = j(b0.c(d0Var), (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD, f126269f);
            j0 j0VarA = pairJ.a();
            boolean zBooleanValue = pairJ.b().booleanValue();
            Pair<j0, Boolean> pairJ2 = j(b0.d(d0Var), (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD2, f126270g);
            j0 j0VarA2 = pairJ2.a();
            return (zBooleanValue || pairJ2.b().booleanValue()) ? new RawTypeImpl(j0VarA, j0VarA2) : KotlinTypeFactory.d(j0VarA, j0VarA2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + fVarD2 + "\" while for lower it's \"" + fVarD + y.f128593b).toString());
    }

    static /* synthetic */ d0 l(RawSubstitution rawSubstitution, d0 d0Var, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return rawSubstitution.k(d0Var, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    public boolean f() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f1
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e1 e(@dl.d d0 key) {
        f0.p(key, "key");
        return new e1(l(this, key, null, 2, null));
    }
}
