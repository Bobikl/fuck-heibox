package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;

/* JADX INFO: loaded from: classes5.dex */
public class JavaMethodDescriptor extends d0 implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.a {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<b1> H = new a();
    public static final kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<Boolean> I = new b();
    static final /* synthetic */ boolean J = false;
    private ParameterNamesStatus F;
    private final boolean G;

    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        ParameterNamesStatus(boolean z10, boolean z11) {
            this.isStable = z10;
            this.isSynthesized = z11;
        }

        @dl.d
        public static ParameterNamesStatus get(boolean z10, boolean z11) {
            ParameterNamesStatus parameterNamesStatus;
            if (z10) {
                parameterNamesStatus = z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                parameterNamesStatus = z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (parameterNamesStatus == null) {
                $$$reportNull$$$0(0);
            }
            return parameterNamesStatus;
        }
    }

    public static final class a implements kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<b1> {
        a() {
        }
    }

    public static final class b implements kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<Boolean> {
        b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected JavaMethodDescriptor(@dl.d k kVar, @dl.e s0 s0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var, boolean z10) {
        super(kVar, s0Var, eVar, fVar, kind, t0Var);
        if (kVar == null) {
            Z(0);
        }
        if (eVar == null) {
            Z(1);
        }
        if (fVar == null) {
            Z(2);
        }
        if (kind == null) {
            Z(3);
        }
        if (t0Var == null) {
            Z(4);
        }
        this.F = null;
        this.G = z10;
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    public static JavaMethodDescriptor q1(@dl.d k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d t0 t0Var, boolean z10) {
        if (kVar == null) {
            Z(5);
        }
        if (eVar == null) {
            Z(6);
        }
        if (fVar == null) {
            Z(7);
        }
        if (t0Var == null) {
            Z(8);
        }
        return new JavaMethodDescriptor(kVar, null, eVar, fVar, CallableMemberDescriptor.Kind.DECLARATION, t0Var, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    public boolean R0() {
        return this.F.isStable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d0
    @dl.d
    public d0 p1(@dl.e r0 r0Var, @dl.e r0 r0Var2, @dl.d List<r0> list, @dl.d List<? extends y0> list2, @dl.d List<b1> list3, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.e Modality modality, @dl.d s sVar, @dl.e Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> map) {
        if (list == null) {
            Z(9);
        }
        if (list2 == null) {
            Z(10);
        }
        if (list3 == null) {
            Z(11);
        }
        if (sVar == null) {
            Z(12);
        }
        d0 d0VarP1 = super.p1(r0Var, r0Var2, list, list2, list3, d0Var, modality, sVar, map);
        g1(OperatorChecks.f128208a.a(d0VarP1).a());
        if (d0VarP1 == null) {
            Z(13);
        }
        return d0VarP1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d0, kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.d
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public JavaMethodDescriptor M0(@dl.d k kVar, @dl.e w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d t0 t0Var) {
        if (kVar == null) {
            Z(14);
        }
        if (kind == null) {
            Z(15);
        }
        if (eVar == null) {
            Z(16);
        }
        if (t0Var == null) {
            Z(17);
        }
        s0 s0Var = (s0) wVar;
        if (fVar == null) {
            fVar = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(kVar, s0Var, eVar, fVar, kind, t0Var, this.G);
        javaMethodDescriptor.t1(R0(), t0());
        return javaMethodDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @dl.d
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public JavaMethodDescriptor q0(@dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.d List<kotlin.reflect.jvm.internal.impl.types.d0> list, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var2, @dl.e Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> pair) {
        if (list == null) {
            Z(19);
        }
        if (d0Var2 == null) {
            Z(20);
        }
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) q().n(g.a(list, i(), this)).h(d0Var2).b(d0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.c.i(this, d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b())).m().g().build();
        if (pair != null) {
            javaMethodDescriptor.V0(pair.e(), pair.f());
        }
        if (javaMethodDescriptor == null) {
            Z(21);
        }
        return javaMethodDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean t0() {
        return this.F.isSynthesized;
    }

    public void t1(boolean z10, boolean z11) {
        this.F = ParameterNamesStatus.get(z10, z11);
    }
}
