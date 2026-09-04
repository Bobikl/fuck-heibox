package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: DescriptorSubstitutor.java */
/* JADX INFO: loaded from: classes5.dex */
public class r {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    @dl.d
    public static TypeSubstitutor b(@dl.d List<kotlin.reflect.jvm.internal.impl.descriptors.y0> list, @dl.d f1 f1Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d List<kotlin.reflect.jvm.internal.impl.descriptors.y0> list2) {
        if (list == null) {
            a(0);
        }
        if (f1Var == null) {
            a(1);
        }
        if (kVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        TypeSubstitutor typeSubstitutorC = c(list, f1Var, kVar, list2, null);
        if (typeSubstitutorC != null) {
            return typeSubstitutorC;
        }
        throw new AssertionError("Substitution failed");
    }

    @dl.e
    public static TypeSubstitutor c(@dl.d List<kotlin.reflect.jvm.internal.impl.descriptors.y0> list, @dl.d f1 f1Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d List<kotlin.reflect.jvm.internal.impl.descriptors.y0> list2, @dl.e boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (f1Var == null) {
            a(6);
        }
        if (kVar == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i10 = 0;
        for (kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 g0VarQ0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.g0.Q0(kVar, y0Var.getAnnotations(), y0Var.k(), y0Var.n(), y0Var.getName(), i10, kotlin.reflect.jvm.internal.impl.descriptors.t0.f125942a, y0Var.j0());
            map.put(y0Var.r(), new e1(g0VarQ0.v()));
            map2.put(y0Var, g0VarQ0);
            list2.add(g0VarQ0);
            i10++;
        }
        a1 a1VarJ = a1.j(map);
        TypeSubstitutor typeSubstitutorH = TypeSubstitutor.h(f1Var, a1VarJ);
        TypeSubstitutor typeSubstitutorH2 = TypeSubstitutor.h(f1Var.h(), a1VarJ);
        for (kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var2 : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 g0Var = (kotlin.reflect.jvm.internal.impl.descriptors.impl.g0) map2.get(y0Var2);
            for (d0 d0Var : y0Var2.getUpperBounds()) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
                d0 d0VarP = (((fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) && TypeUtilsKt.k((kotlin.reflect.jvm.internal.impl.descriptors.y0) fVarD)) ? typeSubstitutorH : typeSubstitutorH2).p(d0Var, Variance.OUT_VARIANCE);
                if (d0VarP == null) {
                    return null;
                }
                if (d0VarP != d0Var && zArr != null) {
                    zArr[0] = true;
                }
                g0Var.N0(d0VarP);
            }
            g0Var.W0();
        }
        return typeSubstitutorH;
    }
}
