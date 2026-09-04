package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: JavaClassConstructorDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.e implements a {
    static final /* synthetic */ boolean J = false;
    private Boolean H;
    private Boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.e b bVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var) {
        super(dVar, bVar, eVar, z10, kind, t0Var);
        if (dVar == null) {
            Z(0);
        }
        if (eVar == null) {
            Z(1);
        }
        if (kind == null) {
            Z(2);
        }
        if (t0Var == null) {
            Z(3);
        }
        this.H = null;
        this.I = null;
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    public static b u1(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, @dl.d t0 t0Var) {
        if (dVar == null) {
            Z(4);
        }
        if (eVar == null) {
            Z(5);
        }
        if (t0Var == null) {
            Z(6);
        }
        return new b(dVar, null, eVar, z10, CallableMemberDescriptor.Kind.DECLARATION, t0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    public boolean R0() {
        return this.H.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    public void Z0(boolean z10) {
        this.H = Boolean.valueOf(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    public void a1(boolean z10) {
        this.I = Boolean.valueOf(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean t0() {
        return this.I.booleanValue();
    }

    @dl.d
    protected b t1(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.e b bVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (dVar == null) {
            Z(12);
        }
        if (kind == null) {
            Z(13);
        }
        if (t0Var == null) {
            Z(14);
        }
        if (eVar == null) {
            Z(15);
        }
        return new b(dVar, bVar, eVar, this.F, kind, t0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @dl.d
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b M0(@dl.d k kVar, @dl.e w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d t0 t0Var) {
        if (kVar == null) {
            Z(7);
        }
        if (kind == null) {
            Z(8);
        }
        if (eVar == null) {
            Z(9);
        }
        if (t0Var == null) {
            Z(10);
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            b bVarT1 = t1((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar, (b) wVar, kind, t0Var, eVar);
            bVarT1.Z0(R0());
            bVarT1.a1(t0());
            return bVarT1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @dl.d
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public b q0(@dl.e d0 d0Var, @dl.d List<d0> list, @dl.d d0 d0Var2, @dl.e Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> pair) {
        if (list == null) {
            Z(16);
        }
        if (d0Var2 == null) {
            Z(17);
        }
        b bVarM0 = M0(c(), null, b(), null, getAnnotations(), j());
        bVarM0.S0(d0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.c.i(bVarM0, d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b()), i0(), CollectionsKt__CollectionsKt.E(), getTypeParameters(), g.a(list, i(), bVarM0), d0Var2, l(), getVisibility());
        if (pair != null) {
            bVarM0.V0(pair.e(), pair.f());
        }
        return bVarM0;
    }
}
