package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: VariableDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h0 extends j implements d1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f125716g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected kotlin.reflect.jvm.internal.impl.types.d0 f125717f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.d t0 t0Var) {
        super(kVar, eVar, fVar, t0Var);
        if (kVar == null) {
            Z(0);
        }
        if (eVar == null) {
            Z(1);
        }
        if (fVar == null) {
            Z(2);
        }
        if (t0Var == null) {
            Z(3);
        }
        this.f125717f = d0Var;
    }

    private static /* synthetic */ void Z(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<r0> G0() {
        List<r0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            Z(9);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public d1 a() {
        d1 d1Var = (d1) super.a();
        if (d1Var == null) {
            Z(5);
        }
        return d1Var;
    }

    public void L0(kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        this.f125717f = d0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public <V> V S(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a) {
        return null;
    }

    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l d(TypeSubstitutor typeSubstitutor) {
        return d(typeSubstitutor);
    }

    @dl.d
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> f() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            Z(7);
        }
        return setEmptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.j
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.d0 getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.d0 type = getType();
        if (type == null) {
            Z(10);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.d0 getType() {
        kotlin.reflect.jvm.internal.impl.types.d0 d0Var = this.f125717f;
        if (d0Var == null) {
            Z(4);
        }
        return d0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<y0> getTypeParameters() {
        List<y0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            Z(8);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<b1> i() {
        List<b1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            Z(6);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public r0 i0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d1
    public boolean isConst() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public r0 l0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean t0() {
        return false;
    }
}
