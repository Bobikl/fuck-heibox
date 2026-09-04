package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: ClassDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f125704q = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Modality f125705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ClassKind f125706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z0 f125707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MemberScope f125708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Set<kotlin.reflect.jvm.internal.impl.descriptors.c> f125709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.descriptors.c f125710p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Modality modality, @dl.d ClassKind classKind, @dl.d Collection<kotlin.reflect.jvm.internal.impl.types.d0> collection, @dl.d t0 t0Var, boolean z10, @dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        super(mVar, kVar, fVar, t0Var, z10);
        if (kVar == null) {
            v0(0);
        }
        if (fVar == null) {
            v0(1);
        }
        if (modality == null) {
            v0(2);
        }
        if (classKind == null) {
            v0(3);
        }
        if (collection == null) {
            v0(4);
        }
        if (t0Var == null) {
            v0(5);
        }
        if (mVar == null) {
            v0(6);
        }
        this.f125705k = modality;
        this.f125706l = classKind;
        this.f125707m = new kotlin.reflect.jvm.internal.impl.types.j(this, Collections.emptyList(), collection, mVar);
    }

    private static /* synthetic */ void v0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public kotlin.reflect.jvm.internal.impl.descriptors.c D() {
        return this.f125710p;
    }

    public final void L0(@dl.d MemberScope memberScope, @dl.d Set<kotlin.reflect.jvm.internal.impl.descriptors.c> set, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.c cVar) {
        if (memberScope == null) {
            v0(7);
        }
        if (set == null) {
            v0(8);
        }
        this.f125708n = memberScope;
        this.f125709o = set;
        this.f125710p = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public ClassKind b() {
        ClassKind classKind = this.f125706l;
        if (classKind == null) {
            v0(15);
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
            v0(9);
        }
        return eVarB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = kotlin.reflect.jvm.internal.impl.descriptors.r.f125868e;
        if (sVar == null) {
            v0(17);
        }
        return sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.c> set = this.f125709o;
        if (set == null) {
            v0(11);
        }
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        Modality modality = this.f125705k;
        if (modality == null) {
            v0(16);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean m() {
        return false;
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
        z0 z0Var = this.f125707m;
        if (z0Var == null) {
            v0(10);
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
        return "class " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    public MemberScope u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        if (fVar == null) {
            v0(12);
        }
        MemberScope memberScope = this.f125708n;
        if (memberScope == null) {
            v0(13);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @dl.d
    public List<y0> w() {
        List<y0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            v0(18);
        }
        return listEmptyList;
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
            v0(14);
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
