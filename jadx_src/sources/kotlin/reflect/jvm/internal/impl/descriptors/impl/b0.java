package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: PropertySetterDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends y implements q0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f125679q = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b1 f125680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final q0 f125681p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(@dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, boolean z10, boolean z11, boolean z12, @dl.d CallableMemberDescriptor.Kind kind, @dl.e q0 q0Var, @dl.d t0 t0Var) {
        q0 q0Var2;
        b0 b0Var;
        super(modality, sVar, o0Var, eVar, kotlin.reflect.jvm.internal.impl.name.f.i("<set-" + o0Var.getName() + ">"), z10, z11, z12, kind, t0Var);
        if (o0Var == null) {
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
        if (kind == null) {
            Z(4);
        }
        if (t0Var == null) {
            Z(5);
        }
        if (q0Var != null) {
            b0Var = this;
            q0Var2 = q0Var;
        } else {
            q0Var2 = this;
            b0Var = q0Var2;
        }
        b0Var.f125681p = q0Var2;
    }

    public static ValueParameterDescriptorImpl Q0(@dl.d q0 q0Var, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (q0Var == null) {
            Z(7);
        }
        if (d0Var == null) {
            Z(8);
        }
        if (eVar == null) {
            Z(9);
        }
        return new ValueParameterDescriptorImpl(q0Var, null, 0, eVar, kotlin.reflect.jvm.internal.impl.name.h.f127223o, d0Var, false, false, false, null, t0.f125942a);
    }

    private static /* synthetic */ void Z(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.y, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public q0 a() {
        q0 q0Var = this.f125681p;
        if (q0Var == null) {
            Z(13);
        }
        return q0Var;
    }

    public void S0(@dl.d b1 b1Var) {
        if (b1Var == null) {
            Z(6);
        }
        this.f125680o = b1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.d(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public Collection<? extends q0> f() {
        Collection<n0> collectionM0 = super.M0(false);
        if (collectionM0 == null) {
            Z(10);
        }
        return collectionM0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.j
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.d0 getReturnType() {
        j0 j0VarZ = DescriptorUtilsKt.j(this).Z();
        if (j0VarZ == null) {
            Z(12);
        }
        return j0VarZ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<b1> i() {
        b1 b1Var = this.f125680o;
        if (b1Var == null) {
            throw new IllegalStateException();
        }
        List<b1> listSingletonList = Collections.singletonList(b1Var);
        if (listSingletonList == null) {
            Z(11);
        }
        return listSingletonList;
    }
}
