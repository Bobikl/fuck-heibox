package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;

/* JADX INFO: compiled from: PropertyGetterDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends y implements p0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.types.d0 f125677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final p0 f125678p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(@dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, boolean z10, boolean z11, boolean z12, @dl.d CallableMemberDescriptor.Kind kind, @dl.e p0 p0Var, @dl.d t0 t0Var) {
        p0 p0Var2;
        a0 a0Var;
        super(modality, sVar, o0Var, eVar, kotlin.reflect.jvm.internal.impl.name.f.i("<get-" + o0Var.getName() + ">"), z10, z11, z12, kind, t0Var);
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
        if (p0Var != null) {
            a0Var = this;
            p0Var2 = p0Var;
        } else {
            p0Var2 = this;
            a0Var = p0Var2;
        }
        a0Var.f125678p = p0Var2;
    }

    private static /* synthetic */ void Z(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.y, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public p0 a() {
        p0 p0Var = this.f125678p;
        if (p0Var == null) {
            Z(8);
        }
        return p0Var;
    }

    public void R0(kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        if (d0Var == null) {
            d0Var = n0().getType();
        }
        this.f125677o = d0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.j(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public Collection<? extends p0> f() {
        Collection<n0> collectionM0 = super.M0(true);
        if (collectionM0 == null) {
            Z(6);
        }
        return collectionM0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.j
    public kotlin.reflect.jvm.internal.impl.types.d0 getReturnType() {
        return this.f125677o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<b1> i() {
        List<b1> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            Z(7);
        }
        return listEmptyList;
    }
}
