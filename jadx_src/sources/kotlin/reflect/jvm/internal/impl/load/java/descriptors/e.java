package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: JavaPropertyDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends z implements a {
    private final boolean F;

    @dl.e
    private final Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> G;
    private d0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(@dl.d k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d Modality modality, @dl.d s sVar, boolean z10, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d t0 t0Var, @dl.e o0 o0Var, @dl.d CallableMemberDescriptor.Kind kind, boolean z11, @dl.e Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> pair) {
        super(kVar, o0Var, eVar, modality, sVar, z10, fVar, kind, t0Var, false, false, false, false, false, false);
        if (kVar == null) {
            Z(0);
        }
        if (eVar == null) {
            Z(1);
        }
        if (modality == null) {
            Z(2);
        }
        if (sVar == null) {
            Z(3);
        }
        if (fVar == null) {
            Z(4);
        }
        if (t0Var == null) {
            Z(5);
        }
        if (kind == null) {
            Z(6);
        }
        this.H = null;
        this.F = z11;
        this.G = pair;
    }

    private static /* synthetic */ void Z(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = TopicHashtagWrapper.TYPE_CREATE;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @dl.d
    public static e h1(@dl.d k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d Modality modality, @dl.d s sVar, boolean z10, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d t0 t0Var, boolean z11) {
        if (kVar == null) {
            Z(7);
        }
        if (eVar == null) {
            Z(8);
        }
        if (modality == null) {
            Z(9);
        }
        if (sVar == null) {
            Z(10);
        }
        if (fVar == null) {
            Z(11);
        }
        if (t0Var == null) {
            Z(12);
        }
        return new e(kVar, eVar, modality, sVar, z10, fVar, t0Var, null, CallableMemberDescriptor.Kind.DECLARATION, z11, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @dl.d
    protected z R0(@dl.d k kVar, @dl.d Modality modality, @dl.d s sVar, @dl.e o0 o0Var, @dl.d CallableMemberDescriptor.Kind kind, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d t0 t0Var) {
        if (kVar == null) {
            Z(13);
        }
        if (modality == null) {
            Z(14);
        }
        if (sVar == null) {
            Z(15);
        }
        if (kind == null) {
            Z(16);
        }
        if (fVar == null) {
            Z(17);
        }
        if (t0Var == null) {
            Z(18);
        }
        return new e(kVar, getAnnotations(), modality, sVar, G(), fVar, t0Var, o0Var, kind, this.F, this.G);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public <V> V S(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a) {
        Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> pair = this.G;
        if (pair == null || !pair.e().equals(interfaceC1142a)) {
            return null;
        }
        return (V) this.G.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    public void b1(@dl.d d0 d0Var) {
        if (d0Var == null) {
            Z(22);
        }
        this.H = d0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean isConst() {
        d0 type = getType();
        return this.F && h.a(type) && (!l.i(type) || kotlin.reflect.jvm.internal.impl.builtins.g.u0(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @dl.d
    public a q0(@dl.e d0 d0Var, @dl.d List<d0> list, @dl.d d0 d0Var2, @dl.e Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> pair) {
        a0 a0Var;
        b0 b0Var;
        if (list == null) {
            Z(19);
        }
        if (d0Var2 == null) {
            Z(20);
        }
        o0 o0VarA = a() == this ? null : a();
        e eVar = new e(c(), getAnnotations(), l(), getVisibility(), G(), getName(), j(), o0VarA, b(), this.F, pair);
        a0 getter = getGetter();
        if (getter != null) {
            a0Var = a0Var;
            a0 a0Var2 = new a0(eVar, getter.getAnnotations(), getter.l(), getter.getVisibility(), getter.e0(), getter.B(), getter.g(), b(), o0VarA == null ? null : o0VarA.getGetter(), getter.j());
            a0Var.O0(getter.D0());
            a0Var.R0(d0Var2);
        } else {
            a0Var = null;
        }
        q0 setter = getSetter();
        if (setter != null) {
            b0 b0Var2 = new b0(eVar, setter.getAnnotations(), setter.l(), setter.getVisibility(), setter.e0(), setter.B(), setter.g(), b(), o0VarA == null ? null : o0VarA.getSetter(), setter.j());
            b0Var2.O0(b0Var2.D0());
            b0Var2.S0(setter.i().get(0));
            b0Var = b0Var2;
        } else {
            b0Var = null;
        }
        eVar.X0(a0Var, b0Var, T(), H());
        eVar.c1(Y0());
        yh.a<i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar = this.f125722j;
        if (aVar != null) {
            eVar.M0(this.f125721i, aVar);
        }
        eVar.X(f());
        eVar.d1(d0Var2, getTypeParameters(), i0(), d0Var == null ? null : kotlin.reflect.jvm.internal.impl.resolve.c.i(this, d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b()), CollectionsKt__CollectionsKt.E());
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean t0() {
        return false;
    }
}
