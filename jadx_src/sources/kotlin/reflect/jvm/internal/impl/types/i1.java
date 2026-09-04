package kotlin.reflect.jvm.internal.impl.types;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* JADX INFO: compiled from: TypeUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f128136a = kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f128137b = kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final j0 f128138c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f128139d = new a("UNIT_EXPECTED_TYPE");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f128140e = false;

    /* JADX INFO: compiled from: TypeUtils.java */
    public static class a extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f128141c;

        public a(String str) {
            this.f128141c = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        private static /* synthetic */ void a1(int i10) {
            String str = (i10 == 1 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i10 == 2) {
                objArr[0] = "delegate";
            } else if (i10 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i10 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i10 == 1) {
                objArr[1] = "toString";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i10 == 3) {
                    objArr[2] = "refine";
                } else if (i10 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.l1
        @dl.d
        public j0 V0(boolean z10) {
            throw new IllegalStateException(this.f128141c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.l1
        @dl.d
        /* JADX INFO: renamed from: W0 */
        public j0 U0(@dl.d w0 w0Var) {
            if (w0Var == null) {
                a1(0);
            }
            throw new IllegalStateException(this.f128141c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.p
        @dl.d
        protected j0 X0() {
            throw new IllegalStateException(this.f128141c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.p
        @dl.d
        public p Z0(@dl.d j0 j0Var) {
            if (j0Var == null) {
                a1(2);
            }
            throw new IllegalStateException(this.f128141c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.p
        @dl.d
        /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
        public a Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
            if (fVar == null) {
                a1(3);
            }
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.j0
        @dl.d
        public String toString() {
            String str = this.f128141c;
            if (str == null) {
                a1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = ak.av;
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i10 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i10 == 11 || i10 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i10 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i10 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i10 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i10 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i10 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i10 != 53) {
            if (i10 != 6 && i10 != 7) {
                switch (i10) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i10) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(28);
        }
        if (d0Var.P0()) {
            return true;
        }
        return b0.b(d0Var) && b(b0.a(d0Var).X0());
    }

    public static boolean c(@dl.e d0 d0Var, @dl.d yh.l<l1, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(d0Var, lVar, null);
    }

    private static boolean d(@dl.e d0 d0Var, @dl.d yh.l<l1, Boolean> lVar, kotlin.reflect.jvm.internal.impl.utils.e<d0> eVar) {
        if (lVar == null) {
            a(44);
        }
        if (d0Var == null) {
            return false;
        }
        l1 l1VarR0 = d0Var.R0();
        if (w(d0Var)) {
            return lVar.invoke(l1VarR0).booleanValue();
        }
        if (eVar != null && eVar.contains(d0Var)) {
            return false;
        }
        if (lVar.invoke(l1VarR0).booleanValue()) {
            return true;
        }
        if (eVar == null) {
            eVar = kotlin.reflect.jvm.internal.impl.utils.e.a();
        }
        eVar.add(d0Var);
        y yVar = l1VarR0 instanceof y ? (y) l1VarR0 : null;
        if (yVar != null && (d(yVar.W0(), lVar, eVar) || d(yVar.X0(), lVar, eVar))) {
            return true;
        }
        if ((l1VarR0 instanceof n) && d(((n) l1VarR0).a1(), lVar, eVar)) {
            return true;
        }
        z0 z0VarO0 = d0Var.O0();
        if (z0VarO0 instanceof IntersectionTypeConstructor) {
            Iterator<d0> it = ((IntersectionTypeConstructor) z0VarO0).l().iterator();
            while (it.hasNext()) {
                if (d(it.next(), lVar, eVar)) {
                    return true;
                }
            }
            return false;
        }
        for (c1 c1Var : d0Var.M0()) {
            if (!c1Var.b()) {
                if (d(c1Var.getType(), lVar, eVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    @dl.e
    public static d0 e(@dl.d d0 d0Var, @dl.d d0 d0Var2, @dl.d TypeSubstitutor typeSubstitutor) {
        if (d0Var == null) {
            a(20);
        }
        if (d0Var2 == null) {
            a(21);
        }
        if (typeSubstitutor == null) {
            a(22);
        }
        d0 d0VarP = typeSubstitutor.p(d0Var2, Variance.INVARIANT);
        if (d0VarP != null) {
            return q(d0VarP, d0Var.P0());
        }
        return null;
    }

    @dl.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.d f(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(30);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD;
        }
        return null;
    }

    @dl.d
    public static List<c1> g(@dl.d List<kotlin.reflect.jvm.internal.impl.descriptors.y0> list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.y0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new e1(it.next().v()));
        }
        List<c1> listQ5 = CollectionsKt___CollectionsKt.Q5(arrayList);
        if (listQ5 == null) {
            a(17);
        }
        return listQ5;
    }

    @dl.d
    public static List<d0> h(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(18);
        }
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(d0Var);
        Collection<d0> collectionL = d0Var.O0().l();
        ArrayList arrayList = new ArrayList(collectionL.size());
        Iterator<d0> it = collectionL.iterator();
        while (it.hasNext()) {
            d0 d0VarE = e(d0Var, it.next(), typeSubstitutorF);
            if (d0VarE != null) {
                arrayList.add(d0VarE);
            }
        }
        return arrayList;
    }

    @dl.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.y0 i(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(63);
        }
        if (d0Var.O0().d() instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.y0) d0Var.O0().d();
        }
        return null;
    }

    public static boolean j(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(29);
        }
        if (d0Var.O0().d() instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return false;
        }
        Iterator<d0> it = h(d0Var).iterator();
        while (it.hasNext()) {
            if (l(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(@dl.e d0 d0Var) {
        return d0Var != null && d0Var.O0() == f128136a.O0();
    }

    public static boolean l(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(27);
        }
        if (d0Var.P0()) {
            return true;
        }
        if (b0.b(d0Var) && l(b0.a(d0Var).X0())) {
            return true;
        }
        if (n0.c(d0Var)) {
            return false;
        }
        if (m(d0Var)) {
            return j(d0Var);
        }
        if (d0Var instanceof e) {
            kotlin.reflect.jvm.internal.impl.descriptors.y0 y0VarB = ((e) d0Var).X0().b();
            return y0VarB == null || j(y0VarB.v());
        }
        z0 z0VarO0 = d0Var.O0();
        if (z0VarO0 instanceof IntersectionTypeConstructor) {
            Iterator<d0> it = z0VarO0.l().iterator();
            while (it.hasNext()) {
                if (l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(60);
        }
        return i(d0Var) != null || (d0Var.O0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.l);
    }

    @dl.d
    public static d0 n(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(2);
        }
        return p(d0Var, false);
    }

    @dl.d
    public static d0 o(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(1);
        }
        return p(d0Var, true);
    }

    @dl.d
    public static d0 p(@dl.d d0 d0Var, boolean z10) {
        if (d0Var == null) {
            a(3);
        }
        l1 l1VarV0 = d0Var.R0().V0(z10);
        if (l1VarV0 == null) {
            a(4);
        }
        return l1VarV0;
    }

    @dl.d
    public static d0 q(@dl.d d0 d0Var, boolean z10) {
        if (d0Var == null) {
            a(8);
        }
        if (z10) {
            return o(d0Var);
        }
        if (d0Var == null) {
            a(9);
        }
        return d0Var;
    }

    @dl.d
    public static j0 r(@dl.d j0 j0Var, boolean z10) {
        if (j0Var == null) {
            a(5);
        }
        if (!z10) {
            if (j0Var == null) {
                a(7);
            }
            return j0Var;
        }
        j0 j0VarV0 = j0Var.V0(true);
        if (j0VarV0 == null) {
            a(6);
        }
        return j0VarV0;
    }

    @dl.d
    public static c1 s(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var) {
        if (y0Var == null) {
            a(45);
        }
        return new StarProjectionImpl(y0Var);
    }

    @dl.d
    public static c1 t(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var, w wVar) {
        if (y0Var == null) {
            a(46);
        }
        return wVar.b() == TypeUsage.SUPERTYPE ? new e1(p0.b(y0Var)) : new StarProjectionImpl(y0Var);
    }

    @dl.d
    public static j0 u(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, MemberScope memberScope, yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0> lVar) {
        if (!kotlin.reflect.jvm.internal.impl.types.error.h.m(fVar)) {
            return v(fVar.r(), memberScope, lVar);
        }
        kotlin.reflect.jvm.internal.impl.types.error.f fVarD = kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, fVar.toString());
        if (fVarD == null) {
            a(11);
        }
        return fVarD;
    }

    @dl.d
    public static j0 v(@dl.d z0 z0Var, @dl.d MemberScope memberScope, @dl.d yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0> lVar) {
        if (z0Var == null) {
            a(12);
        }
        if (memberScope == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        j0 j0VarN = KotlinTypeFactory.n(w0.f128193c.h(), z0Var, g(z0Var.getParameters()), false, memberScope, lVar);
        if (j0VarN == null) {
            a(15);
        }
        return j0VarN;
    }

    public static boolean w(@dl.d d0 d0Var) {
        if (d0Var == null) {
            a(0);
        }
        return d0Var == f128138c || d0Var == f128139d;
    }
}
