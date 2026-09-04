package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.w0;

/* JADX INFO: compiled from: DescriptorFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: compiled from: DescriptorFactory.java */
    public static class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d t0 t0Var, boolean z10) {
            super(dVar, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), true, CallableMemberDescriptor.Kind.DECLARATION, t0Var);
            if (dVar == null) {
                Z(0);
            }
            if (t0Var == null) {
                Z(1);
            }
            r1(Collections.emptyList(), d.k(dVar, z10));
        }

        private static /* synthetic */ void Z(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e;
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.e
    public static r0 b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.e d0 d0Var, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (aVar == null) {
            a(32);
        }
        if (eVar == null) {
            a(33);
        }
        if (d0Var == null) {
            return null;
        }
        return new c0(aVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c(aVar, d0Var, fVar, null), eVar);
    }

    @dl.e
    public static r0 c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.e d0 d0Var, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (dVar == null) {
            a(34);
        }
        if (eVar == null) {
            a(35);
        }
        if (d0Var == null) {
            return null;
        }
        return new c0(dVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b(dVar, d0Var, fVar, null), eVar);
    }

    @dl.d
    public static a0 d(@dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (o0Var == null) {
            a(13);
        }
        if (eVar == null) {
            a(14);
        }
        return j(o0Var, eVar, true, false, false);
    }

    @dl.d
    public static b0 e(@dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar2) {
        if (o0Var == null) {
            a(0);
        }
        if (eVar == null) {
            a(1);
        }
        if (eVar2 == null) {
            a(2);
        }
        return n(o0Var, eVar, eVar2, true, false, false, o0Var.j());
    }

    @dl.e
    public static o0 f(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(26);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = FindClassInModuleKt.a(d.g(dVar), kotlin.reflect.jvm.internal.impl.name.i.f127227a.i());
        if (dVarA == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarB = aVar.b();
        Modality modality = Modality.FINAL;
        s sVar = r.f125868e;
        kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.h.f125396e;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        z zVarQ0 = z.Q0(dVar, eVarB, modality, sVar, false, fVar, kind, dVar.j(), false, false, false, false, false, false);
        a0 a0Var = new a0(zVarQ0, aVar.b(), modality, sVar, false, false, false, kind, null, dVar.j());
        zVarQ0.W0(a0Var, null);
        zVarQ0.d1(KotlinTypeFactory.i(w0.f128193c.h(), dVarA.r(), Collections.singletonList(new e1(dVar.v())), false), Collections.emptyList(), null, null, Collections.emptyList());
        a0Var.R0(zVarQ0.getReturnType());
        return zVarQ0;
    }

    @dl.d
    public static s0 g(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(24);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0VarM1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.d0.m1(dVar, aVar.b(), kotlin.reflect.jvm.internal.impl.builtins.h.f125397f, CallableMemberDescriptor.Kind.SYNTHESIZED, dVar.j());
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0VarO1 = d0VarM1.S0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new ValueParameterDescriptorImpl(d0VarM1, null, 0, aVar.b(), kotlin.reflect.jvm.internal.impl.name.f.f("value"), DescriptorUtilsKt.j(dVar).W(), false, false, false, null, dVar.j())), dVar.v(), Modality.FINAL, r.f125868e);
        if (d0VarO1 == null) {
            a(25);
        }
        return d0VarO1;
    }

    @dl.d
    public static s0 h(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(22);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0VarO1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.d0.m1(dVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), kotlin.reflect.jvm.internal.impl.builtins.h.f125395d, CallableMemberDescriptor.Kind.SYNTHESIZED, dVar.j()).S0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), DescriptorUtilsKt.j(dVar).l(Variance.INVARIANT, dVar.v()), Modality.FINAL, r.f125868e);
        if (d0VarO1 == null) {
            a(23);
        }
        return d0VarO1;
    }

    @dl.e
    public static r0 i(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @dl.e d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (aVar == null) {
            a(30);
        }
        if (eVar == null) {
            a(31);
        }
        if (d0Var == null) {
            return null;
        }
        return new c0(aVar, new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d(aVar, d0Var, null), eVar);
    }

    @dl.d
    public static a0 j(@dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, boolean z11, boolean z12) {
        if (o0Var == null) {
            a(15);
        }
        if (eVar == null) {
            a(16);
        }
        return k(o0Var, eVar, z10, z11, z12, o0Var.j());
    }

    @dl.d
    public static a0 k(@dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, boolean z11, boolean z12, @dl.d t0 t0Var) {
        if (o0Var == null) {
            a(17);
        }
        if (eVar == null) {
            a(18);
        }
        if (t0Var == null) {
            a(19);
        }
        return new a0(o0Var, eVar, o0Var.l(), o0Var.getVisibility(), z10, z11, z12, CallableMemberDescriptor.Kind.DECLARATION, null, t0Var);
    }

    @dl.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.e l(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d t0 t0Var) {
        if (dVar == null) {
            a(20);
        }
        if (t0Var == null) {
            a(21);
        }
        return new a(dVar, t0Var, false);
    }

    @dl.d
    public static b0 m(@dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar2, boolean z10, boolean z11, boolean z12, @dl.d s sVar, @dl.d t0 t0Var) {
        if (o0Var == null) {
            a(7);
        }
        if (eVar == null) {
            a(8);
        }
        if (eVar2 == null) {
            a(9);
        }
        if (sVar == null) {
            a(10);
        }
        if (t0Var == null) {
            a(11);
        }
        b0 b0Var = new b0(o0Var, eVar, o0Var.l(), sVar, z10, z11, z12, CallableMemberDescriptor.Kind.DECLARATION, null, t0Var);
        b0Var.S0(b0.Q0(b0Var, o0Var.getType(), eVar2));
        return b0Var;
    }

    @dl.d
    public static b0 n(@dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar2, boolean z10, boolean z11, boolean z12, @dl.d t0 t0Var) {
        if (o0Var == null) {
            a(3);
        }
        if (eVar == null) {
            a(4);
        }
        if (eVar2 == null) {
            a(5);
        }
        if (t0Var == null) {
            a(6);
        }
        return m(o0Var, eVar, eVar2, z10, z11, z12, o0Var.getVisibility(), t0Var);
    }

    private static boolean o(@dl.d w wVar) {
        if (wVar == null) {
            a(29);
        }
        return wVar.b() == CallableMemberDescriptor.Kind.SYNTHESIZED && d.A(wVar.c());
    }

    public static boolean p(@dl.d w wVar) {
        if (wVar == null) {
            a(28);
        }
        return wVar.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.h.f125397f) && o(wVar);
    }

    public static boolean q(@dl.d w wVar) {
        if (wVar == null) {
            a(27);
        }
        return wVar.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.h.f125395d) && o(wVar);
    }
}
