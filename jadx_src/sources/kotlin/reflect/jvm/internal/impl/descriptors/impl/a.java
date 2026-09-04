package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: AbstractClassDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f125668g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.name.f f125669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final kotlin.reflect.jvm.internal.impl.storage.h<j0> f125670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.h<MemberScope> f125671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.h<r0> f125672f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractClassDescriptor.java */
    public class C1144a implements yh.a<j0> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractClassDescriptor.java */
        public class C1145a implements yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0> {
            C1145a() {
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public j0 invoke(kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarF = fVar.f(a.this);
                if (fVarF == null) {
                    return a.this.f125670d.invoke();
                }
                if (fVarF instanceof x0) {
                    return KotlinTypeFactory.b((x0) fVarF, i1.g(fVarF.r().getParameters()));
                }
                return fVarF instanceof r ? i1.v(fVarF.r().a(fVar), ((r) fVarF).u0(fVar), this) : fVarF.v();
            }
        }

        C1144a() {
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 invoke() {
            a aVar = a.this;
            return i1.u(aVar, aVar.M(), new C1145a());
        }
    }

    /* JADX INFO: compiled from: AbstractClassDescriptor.java */
    public class b implements yh.a<MemberScope> {
        b() {
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MemberScope invoke() {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.e(a.this.M());
        }
    }

    /* JADX INFO: compiled from: AbstractClassDescriptor.java */
    public class c implements yh.a<r0> {
        c() {
        }

        @Override // yh.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r0 invoke() {
            return new p(a.this);
        }
    }

    public a(@dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (mVar == null) {
            v0(0);
        }
        if (fVar == null) {
            v0(1);
        }
        this.f125669c = fVar;
        this.f125670d = mVar.c(new C1144a());
        this.f125671e = mVar.c(new b());
        this.f125672f = mVar.c(new c());
    }

    private static /* synthetic */ void v0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope B0(@dl.d f1 f1Var) {
        if (f1Var == null) {
            v0(15);
        }
        MemberScope memberScopeZ = Z(f1Var, DescriptorUtilsKt.o(kotlin.reflect.jvm.internal.impl.resolve.d.g(this)));
        if (memberScopeZ == null) {
            v0(16);
        }
        return memberScopeZ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    @dl.d
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d d(@dl.d TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            v0(18);
        }
        return typeSubstitutor.k() ? this : new q(this, typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope L() {
        MemberScope memberScopeInvoke = this.f125671e.invoke();
        if (memberScopeInvoke == null) {
            v0(4);
        }
        return memberScopeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope M() {
        MemberScope memberScopeU0 = u0(DescriptorUtilsKt.o(kotlin.reflect.jvm.internal.impl.resolve.d.g(this)));
        if (memberScopeU0 == null) {
            v0(17);
        }
        return memberScopeU0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    public MemberScope Z(@dl.d f1 f1Var, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        if (f1Var == null) {
            v0(10);
        }
        if (fVar == null) {
            v0(11);
        }
        if (!f1Var.f()) {
            return new SubstitutingScope(u0(fVar), TypeSubstitutor.g(f1Var));
        }
        MemberScope memberScopeU0 = u0(fVar);
        if (memberScopeU0 == null) {
            v0(12);
        }
        return memberScopeU0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public r0 b0() {
        r0 r0VarInvoke = this.f125672f.invoke();
        if (r0VarInvoke == null) {
            v0(5);
        }
        return r0VarInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return mVar.a(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVar = this.f125669c;
        if (fVar == null) {
            v0(2);
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public List<r0> p0() {
        List<r0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            v0(6);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public j0 v() {
        j0 j0VarInvoke = this.f125670d.invoke();
        if (j0VarInvoke == null) {
            v0(20);
        }
        return j0VarInvoke;
    }
}
