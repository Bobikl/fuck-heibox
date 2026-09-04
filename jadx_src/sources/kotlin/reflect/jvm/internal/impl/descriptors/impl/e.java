package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: ClassConstructorDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends o implements kotlin.reflect.jvm.internal.impl.descriptors.c {
    static final /* synthetic */ boolean G = false;
    protected final boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.j jVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, @dl.d CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var) {
        super(dVar, jVar, eVar, kotlin.reflect.jvm.internal.impl.name.h.f127218j, kind, t0Var);
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
        this.F = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private static /* synthetic */ void Z(int i10) {
        String str;
        int i11;
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
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
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = TopicHashtagWrapper.TYPE_CREATE;
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @dl.d
    private List<r0> l1() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarC = c();
        if (dVarC.p0().isEmpty()) {
            List<r0> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                Z(16);
            }
            return listEmptyList;
        }
        List<r0> listP0 = dVarC.p0();
        if (listP0 == null) {
            Z(15);
        }
        return listP0;
    }

    @dl.d
    public static e o1(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, boolean z10, @dl.d t0 t0Var) {
        if (dVar == null) {
            Z(4);
        }
        if (eVar == null) {
            Z(5);
        }
        if (t0Var == null) {
            Z(6);
        }
        return new e(dVar, null, eVar, z10, CallableMemberDescriptor.Kind.DECLARATION, t0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d O() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarC = c();
        if (dVarC == null) {
            Z(18);
        }
        return dVarC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void X(@dl.d Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            Z(22);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.c a() {
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.c) super.a();
        if (cVar == null) {
            Z(19);
        }
        return cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.f(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.c d(@dl.d TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            Z(20);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.c) super.d(typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> f() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            Z(21);
        }
        return setEmptySet;
    }

    @dl.e
    public r0 m1() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarC = c();
        if (!dVarC.m()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = dVarC.c();
        if (kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC).b0();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.c k0(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.s sVar, CallableMemberDescriptor.Kind kind, boolean z10) {
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.c) super.k0(kVar, modality, sVar, kind, z10);
        if (cVar == null) {
            Z(27);
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o
    @dl.d
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public e M0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.w wVar, @dl.d CallableMemberDescriptor.Kind kind, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d t0 t0Var) {
        if (kVar == null) {
            Z(23);
        }
        if (kind == null) {
            Z(24);
        }
        if (eVar == null) {
            Z(25);
        }
        if (t0Var == null) {
            Z(26);
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            return new e((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar, this, eVar, this.F, kind2, t0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d c() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) super.c();
        if (dVar == null) {
            Z(17);
        }
        return dVar;
    }

    public e r1(@dl.d List<b1> list, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        if (list == null) {
            Z(13);
        }
        if (sVar == null) {
            Z(14);
        }
        s1(list, sVar, c().w());
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j
    public boolean s0() {
        return this.F;
    }

    public e s1(@dl.d List<b1> list, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, @dl.d List<y0> list2) {
        if (list == null) {
            Z(10);
        }
        if (sVar == null) {
            Z(11);
        }
        if (list2 == null) {
            Z(12);
        }
        super.S0(null, m1(), l1(), list2, list, null, Modality.FINAL, sVar);
        return this;
    }
}
