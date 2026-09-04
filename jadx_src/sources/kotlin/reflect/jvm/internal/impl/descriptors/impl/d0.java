package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;

/* JADX INFO: compiled from: SimpleFunctionDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class d0 extends o implements s0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected d0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e s0 s0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var) {
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
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = TopicHashtagWrapper.TYPE_CREATE;
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    public static d0 m1(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var) {
        if (kVar == null) {
            Z(5);
        }
        if (eVar == null) {
            Z(6);
        }
        if (fVar == null) {
            Z(7);
        }
        if (kind == null) {
            Z(8);
        }
        if (t0Var == null) {
            Z(9);
        }
        return new d0(kVar, null, eVar, fVar, kind, t0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.d
    protected o M0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d t0 t0Var) {
        if (kVar == null) {
            Z(25);
        }
        if (kind == null) {
            Z(26);
        }
        if (eVar == null) {
            Z(27);
        }
        if (t0Var == null) {
            Z(28);
        }
        s0 s0Var = (s0) wVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new d0(kVar, s0Var, eVar, fVar, kind, t0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public s0 k0(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.s sVar, CallableMemberDescriptor.Kind kind, boolean z10) {
        s0 s0Var = (s0) super.k0(kVar, modality, sVar, kind, z10);
        if (s0Var == null) {
            Z(29);
        }
        return s0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public s0 a() {
        s0 s0Var = (s0) super.a();
        if (s0Var == null) {
            Z(24);
        }
        return s0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.d
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public d0 S0(@dl.e r0 r0Var, @dl.e r0 r0Var2, @dl.d List<r0> list, @dl.d List<? extends y0> list2, @dl.d List<b1> list3, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.e Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        if (list == null) {
            Z(14);
        }
        if (list2 == null) {
            Z(15);
        }
        if (list3 == null) {
            Z(16);
        }
        if (sVar == null) {
            Z(17);
        }
        d0 d0VarP1 = p1(r0Var, r0Var2, list, list2, list3, d0Var, modality, sVar, null);
        if (d0VarP1 == null) {
            Z(18);
        }
        return d0VarP1;
    }

    @dl.d
    public d0 p1(@dl.e r0 r0Var, @dl.e r0 r0Var2, @dl.d List<r0> list, @dl.d List<? extends y0> list2, @dl.d List<b1> list3, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.e Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, @dl.e Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<?>, ?> map) {
        if (list == null) {
            Z(19);
        }
        if (list2 == null) {
            Z(20);
        }
        if (list3 == null) {
            Z(21);
        }
        if (sVar == null) {
            Z(22);
        }
        super.S0(r0Var, r0Var2, list, list2, list3, d0Var, modality, sVar);
        if (map != null && !map.isEmpty()) {
            this.E = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.s0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.w.a<? extends s0> q() {
        kotlin.reflect.jvm.internal.impl.descriptors.w.a aVarQ = super.q();
        if (aVarQ == null) {
            Z(30);
        }
        return aVarQ;
    }
}
