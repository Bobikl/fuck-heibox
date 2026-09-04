package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: MutableClassDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class v extends f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f125808s = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ClassKind f125809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f125810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Modality f125811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.s f125812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private z0 f125813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<y0> f125814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Collection<kotlin.reflect.jvm.internal.impl.types.d0> f125815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.m f125816r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d ClassKind classKind, boolean z10, boolean z11, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d t0 t0Var, @dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        super(mVar, kVar, fVar, t0Var, z11);
        if (kVar == null) {
            v0(0);
        }
        if (classKind == null) {
            v0(1);
        }
        if (fVar == null) {
            v0(2);
        }
        if (t0Var == null) {
            v0(3);
        }
        if (mVar == null) {
            v0(4);
        }
        this.f125815q = new ArrayList();
        this.f125816r = mVar;
        this.f125809k = classKind;
        this.f125810l = z10;
    }

    private static /* synthetic */ void v0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.c D() {
        return null;
    }

    public void L0() {
        this.f125813o = new kotlin.reflect.jvm.internal.impl.types.j(this, this.f125814p, this.f125815q, this.f125816r);
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.c> it = h().iterator();
        while (it.hasNext()) {
            ((e) it.next()).h1(v());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.c> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            v0(13);
        }
        return setEmptySet;
    }

    public void N0(@dl.d Modality modality) {
        if (modality == null) {
            v0(6);
        }
        this.f125811m = modality;
    }

    public void O0(@dl.d List<y0> list) {
        if (list == null) {
            v0(14);
        }
        if (this.f125814p == null) {
            this.f125814p = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void P0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.s sVar) {
        if (sVar == null) {
            v0(9);
        }
        this.f125812n = sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public ClassKind b() {
        ClassKind classKind = this.f125809k;
        if (classKind == null) {
            v0(8);
        }
        return classKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
        if (eVarB == null) {
            v0(5);
        }
        return eVarB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = this.f125812n;
        if (sVar == null) {
            v0(10);
        }
        return sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        Modality modality = this.f125811m;
        if (modality == null) {
            v0(7);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean m() {
        return this.f125810l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.z0<j0> m0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public z0 r() {
        z0 z0Var = this.f125813o;
        if (z0Var == null) {
            v0(11);
        }
        return z0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean r0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> s() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            v0(19);
        }
        return listEmptyList;
    }

    public String toString() {
        return i.u0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    public MemberScope u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        if (fVar == null) {
            v0(16);
        }
        MemberScope.b bVar = MemberScope.b.f127587b;
        if (bVar == null) {
            v0(17);
        }
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @dl.d
    public List<y0> w() {
        List<y0> list = this.f125814p;
        if (list == null) {
            v0(15);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean x() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope x0() {
        MemberScope.b bVar = MemberScope.b.f127587b;
        if (bVar == null) {
            v0(18);
        }
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.d y0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean z() {
        return false;
    }
}
