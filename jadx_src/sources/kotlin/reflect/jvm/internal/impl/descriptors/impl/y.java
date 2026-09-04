package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: PropertyAccessorDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y extends j implements n0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ boolean f125823n = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f125824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f125825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Modality f125826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o0 f125827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f125828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CallableMemberDescriptor.Kind f125829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.s f125830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private kotlin.reflect.jvm.internal.impl.descriptors.w f125831m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@dl.d Modality modality, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar, @dl.d o0 o0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, @dl.d t0 t0Var) {
        super(o0Var.c(), eVar, fVar, t0Var);
        if (modality == null) {
            Z(0);
        }
        if (sVar == null) {
            Z(1);
        }
        if (o0Var == null) {
            Z(2);
        }
        if (eVar == null) {
            Z(3);
        }
        if (fVar == null) {
            Z(4);
        }
        if (t0Var == null) {
            Z(5);
        }
        this.f125831m = null;
        this.f125826h = modality;
        this.f125830l = sVar;
        this.f125827i = o0Var;
        this.f125824f = z10;
        this.f125825g = z11;
        this.f125828j = z12;
        this.f125829k = kind;
    }

    private static /* synthetic */ void Z(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        return this.f125825g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean C() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.w D0() {
        return this.f125831m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<r0> G0() {
        List<r0> listG0 = n0().G0();
        if (listG0 == null) {
            Z(14);
        }
        return listG0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean K() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public n0 k0(kotlin.reflect.jvm.internal.impl.descriptors.k kVar, Modality modality, kotlin.reflect.jvm.internal.impl.descriptors.s sVar, CallableMemberDescriptor.Kind kind, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @dl.d
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract n0 a();

    @dl.d
    protected Collection<n0> M0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (o0 o0Var : n0().f()) {
            kotlin.reflect.jvm.internal.impl.descriptors.l getter = z10 ? o0Var.getGetter() : o0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    public void N0(boolean z10) {
        this.f125824f = z10;
    }

    public void O0(@dl.e kotlin.reflect.jvm.internal.impl.descriptors.w wVar) {
        this.f125831m = wVar;
    }

    public void P0(kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        this.f125830l = sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public <V> V S(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC1142a<V> interfaceC1142a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean U() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void X(@dl.d Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            Z(16);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean Y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @dl.d
    public CallableMemberDescriptor.Kind b() {
        CallableMemberDescriptor.Kind kind = this.f125829k;
        if (kind == null) {
            Z(6);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.w d(@dl.d TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            Z(7);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n0
    public boolean e0() {
        return this.f125824f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean g() {
        return this.f125828j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.d
    public List<y0> getTypeParameters() {
        List<y0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            Z(9);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = this.f125830l;
        if (sVar == null) {
            Z(11);
        }
        return sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 i0() {
        return n0().i0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        Modality modality = this.f125826h;
        if (modality == null) {
            Z(10);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @dl.e
    public r0 l0() {
        return n0().l0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n0
    @dl.d
    public o0 n0() {
        o0 o0Var = this.f125827i;
        if (o0Var == null) {
            Z(13);
        }
        return o0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.w, kotlin.reflect.jvm.internal.impl.descriptors.s0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.w.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> q() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean t0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        return false;
    }
}
