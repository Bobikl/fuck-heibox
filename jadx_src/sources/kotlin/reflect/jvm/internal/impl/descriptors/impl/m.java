package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: EnumEntrySyntheticClassDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f125725o = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final z0 f125726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final MemberScope f125727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.h<Set<kotlin.reflect.jvm.internal.impl.name.f>> f125728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e f125729n;

    /* JADX INFO: compiled from: EnumEntrySyntheticClassDescriptor.java */
    public class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f125730f = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends s0>> f125731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends o0>> f125732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.storage.h<Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> f125733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f125734e;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: EnumEntrySyntheticClassDescriptor.java */
        public class C1146a implements yh.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends s0>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f125735b;

            C1146a(m mVar) {
                this.f125735b = mVar;
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends s0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* JADX INFO: compiled from: EnumEntrySyntheticClassDescriptor.java */
        public class b implements yh.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends o0>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f125737b;

            b(m mVar) {
                this.f125737b = mVar;
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends o0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return a.this.o(fVar);
            }
        }

        /* JADX INFO: compiled from: EnumEntrySyntheticClassDescriptor.java */
        public class c implements yh.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.k>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f125739b;

            c(m mVar) {
                this.f125739b = mVar;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> invoke() {
                return a.this.m();
            }
        }

        /* JADX INFO: compiled from: EnumEntrySyntheticClassDescriptor.java */
        public class d extends kotlin.reflect.jvm.internal.impl.resolve.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f125741a;

            d(Set set) {
                this.f125741a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.h
            public void a(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    f(0);
                }
                OverridingUtil.K(callableMemberDescriptor, null);
                this.f125741a.add(callableMemberDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.g
            protected void e(@dl.d CallableMemberDescriptor callableMemberDescriptor, @dl.d CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    f(1);
                }
                if (callableMemberDescriptor2 == null) {
                    f(2);
                }
            }
        }

        public a(@dl.d m mVar, kotlin.reflect.jvm.internal.impl.storage.m mVar2) {
            if (mVar2 == null) {
                i(0);
            }
            this.f125734e = mVar;
            this.f125731b = mVar2.a(new C1146a(mVar));
            this.f125732c = mVar2.a(new b(mVar));
            this.f125733d = mVar2.c(new c(mVar));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        private static /* synthetic */ void i(int i10) {
            String str;
            int i11;
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i10 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i10 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i10 != 12) {
                switch (i10) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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

        /* JADX INFO: Access modifiers changed from: private */
        @dl.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> m() {
            HashSet hashSet = new HashSet();
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : (Set) this.f125734e.f125728m.invoke()) {
                NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(a(fVar, noLookupLocation));
                hashSet.addAll(c(fVar, noLookupLocation));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @dl.d
        public Collection<? extends s0> n(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                i(8);
            }
            return q(fVar, p().a(fVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @dl.d
        public Collection<? extends o0> o(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (fVar == null) {
                i(4);
            }
            return q(fVar, p().c(fVar, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        @dl.d
        private MemberScope p() {
            MemberScope memberScopeU = this.f125734e.r().l().iterator().next().u();
            if (memberScopeU == null) {
                i(9);
            }
            return memberScopeU;
        }

        @dl.d
        private <D extends CallableMemberDescriptor> Collection<? extends D> q(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Collection<? extends D> collection) {
            if (fVar == null) {
                i(10);
            }
            if (collection == null) {
                i(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.f127488f.v(fVar, collection, Collections.emptySet(), this.f125734e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @dl.d
        public Collection<? extends s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar) {
            if (fVar == null) {
                i(5);
            }
            if (bVar == null) {
                i(6);
            }
            Collection<? extends s0> collectionInvoke = this.f125731b.invoke(fVar);
            if (collectionInvoke == null) {
                i(7);
            }
            return collectionInvoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> set = (Set) this.f125734e.f125728m.invoke();
            if (set == null) {
                i(17);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @dl.d
        public Collection<? extends o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar) {
            if (fVar == null) {
                i(1);
            }
            if (bVar == null) {
                i(2);
            }
            Collection<? extends o0> collectionInvoke = this.f125732c.invoke(fVar);
            if (collectionInvoke == null) {
                i(3);
            }
            return collectionInvoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> set = (Set) this.f125734e.f125728m.invoke();
            if (set == null) {
                i(19);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @dl.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setEmptySet = Collections.emptySet();
            if (setEmptySet == null) {
                i(18);
            }
            return setEmptySet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @dl.d
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            if (dVar == null) {
                i(13);
            }
            if (lVar == null) {
                i(14);
            }
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> collectionInvoke = this.f125733d.invoke();
            if (collectionInvoke == null) {
                i(15);
            }
            return collectionInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private m(@dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.storage.h<Set<kotlin.reflect.jvm.internal.impl.name.f>> hVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d t0 t0Var) {
        super(mVar, dVar, fVar, t0Var, false);
        if (mVar == null) {
            v0(6);
        }
        if (dVar == null) {
            v0(7);
        }
        if (d0Var == null) {
            v0(8);
        }
        if (fVar == null) {
            v0(9);
        }
        if (hVar == null) {
            v0(10);
        }
        if (eVar == null) {
            v0(11);
        }
        if (t0Var == null) {
            v0(12);
        }
        this.f125729n = eVar;
        this.f125726k = new kotlin.reflect.jvm.internal.impl.types.j(this, Collections.emptyList(), Collections.singleton(d0Var), mVar);
        this.f125727l = new a(this, mVar);
        this.f125728m = hVar;
    }

    @dl.d
    public static m M0(@dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.storage.h<Set<kotlin.reflect.jvm.internal.impl.name.f>> hVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d t0 t0Var) {
        if (mVar == null) {
            v0(0);
        }
        if (dVar == null) {
            v0(1);
        }
        if (fVar == null) {
            v0(2);
        }
        if (hVar == null) {
            v0(3);
        }
        if (eVar == null) {
            v0(4);
        }
        if (t0Var == null) {
            v0(5);
        }
        return new m(mVar, dVar, dVar.v(), fVar, hVar, eVar, t0Var);
    }

    private static /* synthetic */ void v0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = TopicHashtagWrapper.TYPE_CREATE;
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.c D() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public ClassKind b() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            v0(18);
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
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar = this.f125729n;
        if (eVar == null) {
            v0(21);
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = kotlin.reflect.jvm.internal.impl.descriptors.r.f125868e;
        if (sVar == null) {
            v0(20);
        }
        return sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            v0(16);
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        Modality modality = Modality.FINAL;
        if (modality == null) {
            v0(19);
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
        z0 z0Var = this.f125726k;
        if (z0Var == null) {
            v0(17);
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
            v0(23);
        }
        return listEmptyList;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    public MemberScope u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
        if (fVar == null) {
            v0(13);
        }
        MemberScope memberScope = this.f125727l;
        if (memberScope == null) {
            v0(14);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @dl.d
    public List<y0> w() {
        List<y0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            v0(22);
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
            v0(15);
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
