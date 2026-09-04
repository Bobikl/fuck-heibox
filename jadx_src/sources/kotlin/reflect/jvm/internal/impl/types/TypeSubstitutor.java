package kotlin.reflect.jvm.internal.impl.types;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.apache.tools.ant.taskdefs.p7;
import org.apache.tools.ant.types.x1;

/* JADX INFO: loaded from: classes5.dex */
public class TypeSubstitutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TypeSubstitutor f128039b = g(f1.f128131b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f128040c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final f1 f128041a;

    public static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public static final class a implements yh.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // yh.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(kotlin.reflect.jvm.internal.impl.builtins.h.a.Q));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128042a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f128042a = iArr;
            try {
                iArr[VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128042a[VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128042a[VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected TypeSubstitutor(@dl.d f1 f1Var) {
        if (f1Var == null) {
            a(7);
        }
        this.f128041a = f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = p7.a.f135567e;
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = com.umeng.analytics.pro.d.R;
                break;
            case 7:
            default:
                objArr[0] = x1.f136677h;
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = TopicHashtagWrapper.TYPE_CREATE;
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private static void b(int i10, c1 c1Var, f1 f1Var) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(c1Var) + "; substitution: " + o(f1Var));
    }

    @dl.d
    public static Variance c(@dl.d Variance variance, @dl.d c1 c1Var) {
        if (variance == null) {
            a(35);
        }
        if (c1Var == null) {
            a(36);
        }
        if (!c1Var.b()) {
            return d(variance, c1Var.c());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            a(37);
        }
        return variance2;
    }

    @dl.d
    public static Variance d(@dl.d Variance variance, @dl.d Variance variance2) {
        if (variance == null) {
            a(38);
        }
        if (variance2 == null) {
            a(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                a(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                a(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                a(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    private static VarianceConflictType e(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? VarianceConflictType.IN_IN_OUT_POSITION : VarianceConflictType.NO_CONFLICT;
    }

    @dl.d
    public static TypeSubstitutor f(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(6);
        }
        return g(a1.i(d0Var.O0(), d0Var.M0()));
    }

    @dl.d
    public static TypeSubstitutor g(@dl.d f1 f1Var) {
        if (f1Var == null) {
            a(0);
        }
        return new TypeSubstitutor(f1Var);
    }

    @dl.d
    public static TypeSubstitutor h(@dl.d f1 f1Var, @dl.d f1 f1Var2) {
        if (f1Var == null) {
            a(3);
        }
        if (f1Var2 == null) {
            a(4);
        }
        return g(s.i(f1Var, f1Var2));
    }

    @dl.d
    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.e i(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (eVar == null) {
            a(33);
        }
        return !eVar.J1(kotlin.reflect.jvm.internal.impl.builtins.h.a.Q) ? eVar : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.h(eVar, new a());
    }

    @dl.d
    private static c1 l(@dl.d d0 d0Var, @dl.d c1 c1Var, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var, @dl.d c1 c1Var2) {
        if (d0Var == null) {
            a(26);
        }
        if (c1Var == null) {
            a(27);
        }
        if (c1Var2 == null) {
            a(28);
        }
        if (!d0Var.getAnnotations().J1(kotlin.reflect.jvm.internal.impl.builtins.h.a.Q)) {
            if (c1Var == null) {
                a(29);
            }
            return c1Var;
        }
        z0 z0VarO0 = c1Var.getType().O0();
        if (!(z0VarO0 instanceof NewCapturedTypeConstructor)) {
            return c1Var;
        }
        c1 c1VarC = ((NewCapturedTypeConstructor) z0VarO0).c();
        Variance varianceC = c1VarC.c();
        VarianceConflictType varianceConflictTypeE = e(c1Var2.c(), varianceC);
        VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
        if (varianceConflictTypeE == varianceConflictType) {
            return new e1(c1VarC.getType());
        }
        return (y0Var != null && e(y0Var.n(), varianceC) == varianceConflictType) ? new e1(c1VarC.getType()) : c1Var;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (kotlin.reflect.jvm.internal.impl.utils.c.a(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    private c1 r(c1 c1Var, int i10) throws SubstitutionException {
        d0 type = c1Var.getType();
        Variance varianceC = c1Var.c();
        if (type.O0().d() instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) {
            return c1Var;
        }
        j0 j0VarB = n0.b(type);
        d0 d0VarP = j0VarB != null ? m().p(j0VarB, Variance.INVARIANT) : null;
        d0 d0VarB = g1.b(type, s(type.O0().getParameters(), type.M0(), i10), this.f128041a.d(type.getAnnotations()));
        if ((d0VarB instanceof j0) && (d0VarP instanceof j0)) {
            d0VarB = n0.j((j0) d0VarB, (j0) d0VarP);
        }
        return new e1(varianceC, d0VarB);
    }

    private List<c1> s(List<kotlin.reflect.jvm.internal.impl.descriptors.y0> list, List<c1> list2, int i10) throws SubstitutionException {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var = list.get(i11);
            c1 c1Var = list2.get(i11);
            c1 c1VarU = u(c1Var, y0Var, i10 + 1);
            int i12 = b.f128042a[e(y0Var.n(), c1VarU.c()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                c1VarU = i1.s(y0Var);
            } else if (i12 == 3) {
                Variance varianceN = y0Var.n();
                Variance variance = Variance.INVARIANT;
                if (varianceN != variance && !c1VarU.b()) {
                    c1VarU = new e1(variance, c1VarU.getType());
                }
            }
            if (c1VarU != c1Var) {
                z10 = true;
            }
            arrayList.add(c1VarU);
        }
        return !z10 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @dl.d
    private c1 u(@dl.d c1 c1Var, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var, int i10) throws SubstitutionException {
        if (c1Var == null) {
            a(18);
        }
        b(i10, c1Var, this.f128041a);
        if (c1Var.b()) {
            return c1Var;
        }
        d0 type = c1Var.getType();
        if (type instanceof j1) {
            j1 j1Var = (j1) type;
            l1 l1VarZ = j1Var.Z();
            d0 d0VarU0 = j1Var.u0();
            c1 c1VarU = u(new e1(c1Var.c(), l1VarZ), y0Var, i10 + 1);
            return c1VarU.b() ? c1VarU : new e1(c1VarU.c(), k1.d(c1VarU.getType().R0(), p(d0VarU0, c1Var.c())));
        }
        if (!u.a(type) && !(type.R0() instanceof i0)) {
            c1 c1VarE = this.f128041a.e(type);
            c1 c1VarL = c1VarE != null ? l(type, c1VarE, y0Var, c1Var) : null;
            Variance varianceC = c1Var.c();
            if (c1VarL == null && b0.b(type) && !y0.b(type)) {
                y yVarA = b0.a(type);
                int i11 = i10 + 1;
                c1 c1VarU2 = u(new e1(varianceC, yVarA.W0()), y0Var, i11);
                c1 c1VarU3 = u(new e1(varianceC, yVarA.X0()), y0Var, i11);
                return (c1VarU2.getType() == yVarA.W0() && c1VarU3.getType() == yVarA.X0()) ? c1Var : new e1(c1VarU2.c(), KotlinTypeFactory.d(g1.a(c1VarU2.getType()), g1.a(c1VarU3.getType())));
            }
            if (!kotlin.reflect.jvm.internal.impl.builtins.g.m0(type) && !e0.a(type)) {
                if (c1VarL != null) {
                    VarianceConflictType varianceConflictTypeE = e(varianceC, c1VarL.c());
                    if (!CapturedTypeConstructorKt.d(type)) {
                        int i12 = b.f128042a[varianceConflictTypeE.ordinal()];
                        if (i12 == 1) {
                            throw new SubstitutionException("Out-projection in in-position");
                        }
                        if (i12 == 2) {
                            return new e1(Variance.OUT_VARIANCE, type.O0().t().I());
                        }
                    }
                    l lVarA = y0.a(type);
                    if (c1VarL.b()) {
                        return c1VarL;
                    }
                    d0 d0VarV0 = lVarA != null ? lVarA.v0(c1VarL.getType()) : i1.q(c1VarL.getType(), type.P0());
                    if (!type.getAnnotations().isEmpty()) {
                        d0VarV0 = TypeUtilsKt.v(d0VarV0, new CompositeAnnotations(d0VarV0.getAnnotations(), i(this.f128041a.d(type.getAnnotations()))));
                    }
                    if (varianceConflictTypeE == VarianceConflictType.NO_CONFLICT) {
                        varianceC = d(varianceC, c1VarL.c());
                    }
                    return new e1(varianceC, d0VarV0);
                }
                c1Var = r(c1Var, i10);
                if (c1Var == null) {
                    a(25);
                }
            }
        }
        return c1Var;
    }

    @dl.d
    public f1 j() {
        f1 f1Var = this.f128041a;
        if (f1Var == null) {
            a(8);
        }
        return f1Var;
    }

    public boolean k() {
        return this.f128041a.f();
    }

    @dl.d
    public TypeSubstitutor m() {
        f1 f1Var = this.f128041a;
        return ((f1Var instanceof c0) && f1Var.b()) ? new TypeSubstitutor(new c0(((c0) this.f128041a).j(), ((c0) this.f128041a).i(), false)) : this;
    }

    @dl.d
    public d0 n(@dl.d d0 d0Var, @dl.d Variance variance) {
        if (d0Var == null) {
            a(9);
        }
        if (variance == null) {
            a(10);
        }
        if (k()) {
            if (d0Var == null) {
                a(11);
            }
            return d0Var;
        }
        try {
            d0 type = u(new e1(variance, d0Var), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (SubstitutionException e10) {
            kotlin.reflect.jvm.internal.impl.types.error.f fVarD = kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
            if (fVarD == null) {
                a(13);
            }
            return fVarD;
        }
    }

    @dl.e
    public d0 p(@dl.d d0 d0Var, @dl.d Variance variance) {
        if (d0Var == null) {
            a(14);
        }
        if (variance == null) {
            a(15);
        }
        c1 c1VarQ = q(new e1(variance, j().g(d0Var, variance)));
        if (c1VarQ == null) {
            return null;
        }
        return c1VarQ.getType();
    }

    @dl.e
    public c1 q(@dl.d c1 c1Var) {
        if (c1Var == null) {
            a(16);
        }
        c1 c1VarT = t(c1Var);
        return (this.f128041a.a() || this.f128041a.b()) ? CapturedTypeApproximationKt.c(c1VarT, this.f128041a.b()) : c1VarT;
    }

    @dl.e
    public c1 t(@dl.d c1 c1Var) {
        if (c1Var == null) {
            a(17);
        }
        if (k()) {
            return c1Var;
        }
        try {
            return u(c1Var, null, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }
}
