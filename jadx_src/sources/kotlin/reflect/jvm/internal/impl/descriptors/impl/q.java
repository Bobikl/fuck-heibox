package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: LazySubstitutingClassDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class q extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f125794i = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f125795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeSubstitutor f125796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypeSubstitutor f125797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<y0> f125798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<y0> f125799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z0 f125800h;

    /* JADX INFO: compiled from: LazySubstitutingClassDescriptor.java */
    public class a implements yh.l<y0, Boolean> {
        a() {
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(y0 y0Var) {
            return Boolean.valueOf(!y0Var.I());
        }
    }

    /* JADX INFO: compiled from: LazySubstitutingClassDescriptor.java */
    public class b implements yh.l<j0, j0> {
        b() {
        }

        @Override // yh.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 invoke(j0 j0Var) {
            return q.this.N0(j0Var);
        }
    }

    public q(r rVar, TypeSubstitutor typeSubstitutor) {
        this.f125795c = rVar;
        this.f125796d = typeSubstitutor;
    }

    private TypeSubstitutor L0() {
        if (this.f125797e == null) {
            if (this.f125796d.k()) {
                this.f125797e = this.f125796d;
            } else {
                List<y0> parameters = this.f125795c.r().getParameters();
                this.f125798f = new ArrayList(parameters.size());
                this.f125797e = kotlin.reflect.jvm.internal.impl.types.r.b(parameters, this.f125796d.j(), this, this.f125798f);
                this.f125799g = CollectionsKt___CollectionsKt.h2(this.f125798f, new a());
            }
        }
        return this.f125797e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @dl.e
    public j0 N0(@dl.e j0 j0Var) {
        return (j0Var == null || this.f125796d.k()) ? j0Var : (j0) L0().p(j0Var, Variance.INVARIANT);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    private static /* synthetic */ void v0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 == 2) {
            objArr[0] = "typeArguments";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 8) {
            objArr[0] = "typeArguments";
        } else if (i10 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i10 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i10 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean B() {
        return this.f125795c.B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope B0(@dl.d f1 f1Var) {
        if (f1Var == null) {
            v0(10);
        }
        MemberScope memberScopeZ = Z(f1Var, DescriptorUtilsKt.o(kotlin.reflect.jvm.internal.impl.resolve.d.g(this)));
        if (memberScopeZ == null) {
            v0(11);
        }
        return memberScopeZ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.c D() {
        return this.f125795c.D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope L() {
        MemberScope memberScopeL = this.f125795c.L();
        if (memberScopeL == null) {
            v0(28);
        }
        return memberScopeL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope M() {
        MemberScope memberScopeU0 = u0(DescriptorUtilsKt.o(kotlin.reflect.jvm.internal.impl.resolve.d.g(this.f125795c)));
        if (memberScopeU0 == null) {
            v0(12);
        }
        return memberScopeU0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.d
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d d(@dl.d TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            v0(23);
        }
        return typeSubstitutor.k() ? this : new q(this, TypeSubstitutor.h(typeSubstitutor.j(), L0().j()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    public MemberScope Z(@dl.d f1 f1Var, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        if (f1Var == null) {
            v0(5);
        }
        if (fVar == null) {
            v0(6);
        }
        MemberScope memberScopeZ = this.f125795c.Z(f1Var, fVar);
        if (!this.f125796d.k()) {
            return new SubstitutingScope(memberScopeZ, L0());
        }
        if (memberScopeZ == null) {
            v0(7);
        }
        return memberScopeZ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d a() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = this.f125795c.a();
        if (dVarA == null) {
            v0(21);
        }
        return dVarA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public ClassKind b() {
        ClassKind classKindB = this.f125795c.b();
        if (classKindB == null) {
            v0(25);
        }
        return classKindB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public r0 b0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.k c() {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = this.f125795c.c();
        if (kVarC == null) {
            v0(22);
        }
        return kVarC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.a(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean g() {
        return this.f125795c.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = this.f125795c.getAnnotations();
        if (annotations == null) {
            v0(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f name = this.f125795c.getName();
        if (name == null) {
            v0(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s visibility = this.f125795c.getVisibility();
        if (visibility == null) {
            v0(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> collectionH = this.f125795c.h();
        ArrayList arrayList = new ArrayList(collectionH.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.c cVar : collectionH) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.c) cVar.q().i(cVar.a()).q(cVar.l()).p(cVar.getVisibility()).s(cVar.b()).j(false).build()).d(L0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        t0 t0Var = t0.f125942a;
        if (t0Var == null) {
            v0(29);
        }
        return t0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        Modality modalityL = this.f125795c.l();
        if (modalityL == null) {
            v0(26);
        }
        return modalityL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean m() {
        return this.f125795c.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.z0<j0> m0() {
        kotlin.reflect.jvm.internal.impl.descriptors.z0<j0> z0VarM0 = this.f125795c.m0();
        if (z0VarM0 == null) {
            return null;
        }
        return z0VarM0.b(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return this.f125795c.o0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public List<r0> p0() {
        List<r0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            v0(17);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public z0 r() {
        z0 z0VarR = this.f125795c.r();
        if (this.f125796d.k()) {
            if (z0VarR == null) {
                v0(0);
            }
            return z0VarR;
        }
        if (this.f125800h == null) {
            TypeSubstitutor typeSubstitutorL0 = L0();
            Collection<kotlin.reflect.jvm.internal.impl.types.d0> collectionL = z0VarR.l();
            ArrayList arrayList = new ArrayList(collectionL.size());
            Iterator<kotlin.reflect.jvm.internal.impl.types.d0> it = collectionL.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorL0.p(it.next(), Variance.INVARIANT));
            }
            this.f125800h = new kotlin.reflect.jvm.internal.impl.types.j(this, this.f125798f, arrayList, LockBasedStorageManager.f127923e);
        }
        z0 z0Var = this.f125800h;
        if (z0Var == null) {
            v0(1);
        }
        return z0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean r0() {
        return this.f125795c.r0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> s() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> collectionS = this.f125795c.s();
        if (collectionS == null) {
            v0(31);
        }
        return collectionS;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    public MemberScope u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        if (fVar == null) {
            v0(13);
        }
        MemberScope memberScopeU0 = this.f125795c.u0(fVar);
        if (!this.f125796d.k()) {
            return new SubstitutingScope(memberScopeU0, L0());
        }
        if (memberScopeU0 == null) {
            v0(14);
        }
        return memberScopeU0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public j0 v() {
        j0 j0VarM = KotlinTypeFactory.m(kotlin.reflect.jvm.internal.impl.types.m.f128152a.a(getAnnotations(), null, null), r(), i1.g(r().getParameters()), false, M());
        if (j0VarM == null) {
            v0(16);
        }
        return j0VarM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @dl.d
    public List<y0> w() {
        L0();
        List<y0> list = this.f125799g;
        if (list == null) {
            v0(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean w0() {
        return this.f125795c.w0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean x() {
        return this.f125795c.x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope x0() {
        MemberScope memberScopeX0 = this.f125795c.x0();
        if (memberScopeX0 == null) {
            v0(15);
        }
        return memberScopeX0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean y() {
        return this.f125795c.y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d y0() {
        return this.f125795c.y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean z() {
        return this.f125795c.z();
    }
}
