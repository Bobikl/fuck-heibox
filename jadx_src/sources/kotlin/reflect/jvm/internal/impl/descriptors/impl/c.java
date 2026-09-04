package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: AbstractReceiverParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends i implements r0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        super(eVar, kotlin.reflect.jvm.internal.impl.name.h.f127217i);
        if (eVar == null) {
            Z(0);
        }
    }

    private static /* synthetic */ void Z(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
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
            Z(2);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public <V> V S(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.g(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.e
    public r0 d(@dl.d TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            Z(1);
        }
        if (typeSubstitutor.k()) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.types.d0 d0VarP = c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? typeSubstitutor.p(getType(), Variance.OUT_VARIANCE) : typeSubstitutor.p(getType(), Variance.INVARIANT);
        if (d0VarP == null) {
            return null;
        }
        return d0VarP == getType() ? this : new c0(c(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.k(d0VarP), getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> f() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            Z(6);
        }
        return setEmptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.j
    @dl.e
    public kotlin.reflect.jvm.internal.impl.types.d0 getReturnType() {
        return getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.d0 getType() {
        kotlin.reflect.jvm.internal.impl.types.d0 type = getValue().getType();
        if (type == null) {
            Z(4);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<y0> getTypeParameters() {
        List<y0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            Z(3);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = kotlin.reflect.jvm.internal.impl.descriptors.r.f125869f;
        if (sVar == null) {
            Z(7);
        }
        return sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<b1> i() {
        List<b1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            Z(5);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 i0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        t0 t0Var = t0.f125942a;
        if (t0Var == null) {
            Z(9);
        }
        return t0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 l0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean t0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public l0 a() {
        return this;
    }
}
