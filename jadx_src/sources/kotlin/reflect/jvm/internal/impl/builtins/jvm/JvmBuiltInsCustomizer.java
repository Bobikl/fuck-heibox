package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.t;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.w;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.load.kotlin.s;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.n;
import yh.l;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JvmBuiltInsCustomizer implements gi.a, gi.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f125501h = {n0.u(new PropertyReference1Impl(n0.d(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), n0.u(new PropertyReference1Impl(n0.d(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), n0.u(new PropertyReference1Impl(n0.d(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d0 f125502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final d f125503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f125504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.types.d0 f125505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f125506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.d> f125507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f125508g;

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125509a;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            try {
                iArr[JDKMemberStatus.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JDKMemberStatus.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JDKMemberStatus.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f125509a = iArr;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class b extends w {
        b(d0 d0Var, kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(d0Var, cVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
        @dl.d
        /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
        public MemberScope.b u() {
            return MemberScope.b.f127587b;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class c extends kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b<kotlin.reflect.jvm.internal.impl.descriptors.d, JDKMemberStatus> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f125510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<JDKMemberStatus> f125511b;

        c(String str, Ref.ObjectRef<JDKMemberStatus> objectRef) {
            this.f125510a = str;
            this.f125511b = objectRef;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d javaClassDescriptor) {
            f0.p(javaClassDescriptor, "javaClassDescriptor");
            String strA = s.a(SignatureBuildingComponents.f126464a, javaClassDescriptor, this.f125510a);
            h hVar = h.f125548a;
            if (hVar.e().contains(strA)) {
                this.f125511b.f124891b = JDKMemberStatus.HIDDEN;
            } else if (hVar.h().contains(strA)) {
                this.f125511b.f124891b = JDKMemberStatus.VISIBLE;
            } else if (hVar.c().contains(strA)) {
                this.f125511b.f124891b = JDKMemberStatus.DROP;
            }
            return this.f125511b.f124891b == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @dl.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JDKMemberStatus result() {
            JDKMemberStatus jDKMemberStatus = this.f125511b.f124891b;
            return jDKMemberStatus == null ? JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
        }
    }

    public JvmBuiltInsCustomizer(@dl.d d0 moduleDescriptor, @dl.d final m storageManager, @dl.d yh.a<JvmBuiltIns.a> settingsComputation) {
        f0.p(moduleDescriptor, "moduleDescriptor");
        f0.p(storageManager, "storageManager");
        f0.p(settingsComputation, "settingsComputation");
        this.f125502a = moduleDescriptor;
        this.f125503b = d.f125544a;
        this.f125504c = storageManager.c(settingsComputation);
        this.f125505d = l(storageManager);
        this.f125506e = storageManager.c(new yh.a<j0>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$cloneableType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke() {
                return FindClassInModuleKt.c(this.f125512b.u().a(), JvmBuiltInClassDescriptorFactory.f125478d.a(), new NotFoundClasses(storageManager, this.f125512b.u().a())).v();
            }
        });
        this.f125507f = storageManager.e();
        this.f125508g = storageManager.c(new yh.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.e>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$notConsideredDeprecation$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e invoke() {
                return kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.a(kotlin.collections.s.k(AnnotationUtilKt.b(this.f125519b.f125502a.t(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null)));
            }
        });
    }

    private final s0 k(DeserializedClassDescriptor deserializedClassDescriptor, s0 s0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.w.a<? extends s0> aVarQ = s0Var.q();
        aVarQ.r(deserializedClassDescriptor);
        aVarQ.p(r.f125868e);
        aVarQ.h(deserializedClassDescriptor.v());
        aVarQ.a(deserializedClassDescriptor.b0());
        kotlin.reflect.jvm.internal.impl.descriptors.w wVarBuild = aVarQ.build();
        f0.m(wVarBuild);
        return (s0) wVarBuild;
    }

    private final kotlin.reflect.jvm.internal.impl.types.d0 l(m mVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.g gVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.g(new b(this.f125502a, new kotlin.reflect.jvm.internal.impl.name.c("java.io")), kotlin.reflect.jvm.internal.impl.name.f.f("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, kotlin.collections.s.k(new LazyWrappedType(mVar, new yh.a<kotlin.reflect.jvm.internal.impl.types.d0>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.types.d0 invoke() {
                j0 j0VarI = this.f125514b.f125502a.t().i();
                f0.o(j0VarI, "moduleDescriptor.builtIns.anyType");
                return j0VarI;
            }
        })), t0.f125942a, false, mVar);
        gVar.L0(MemberScope.b.f127587b, d1.k(), null);
        j0 j0VarV = gVar.v();
        f0.o(j0VarV, "mockSerializableClass.defaultType");
        return j0VarV;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    private final Collection<s0> m(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, l<? super MemberScope, ? extends Collection<? extends s0>> lVar) {
        boolean z10;
        boolean z11;
        final LazyJavaClassDescriptor lazyJavaClassDescriptorQ = q(dVar);
        if (lazyJavaClassDescriptorQ == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> collectionG = this.f125503b.g(DescriptorUtilsKt.l(lazyJavaClassDescriptorQ), kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f125522i.a());
        final kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) CollectionsKt___CollectionsKt.o3(collectionG);
        if (dVar2 == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        kotlin.reflect.jvm.internal.impl.utils.e.b bVar = kotlin.reflect.jvm.internal.impl.utils.e.f128306d;
        ArrayList arrayList = new ArrayList(t.Y(collectionG, 10));
        Iterator<T> it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(DescriptorUtilsKt.l((kotlin.reflect.jvm.internal.impl.descriptors.d) it.next()));
        }
        kotlin.reflect.jvm.internal.impl.utils.e eVarB = bVar.b(arrayList);
        boolean zC = this.f125503b.c(dVar);
        MemberScope memberScopeM = this.f125507f.a(DescriptorUtilsKt.l(lazyJavaClassDescriptorQ), new yh.a<kotlin.reflect.jvm.internal.impl.descriptors.d>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.d invoke() {
                LazyJavaClassDescriptor lazyJavaClassDescriptor = lazyJavaClassDescriptorQ;
                kotlin.reflect.jvm.internal.impl.load.java.components.d EMPTY = kotlin.reflect.jvm.internal.impl.load.java.components.d.f126044a;
                f0.o(EMPTY, "EMPTY");
                return lazyJavaClassDescriptor.O0(EMPTY, dVar2);
            }
        }).M();
        f0.o(memberScopeM, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        Collection<? extends s0> collectionInvoke = lVar.invoke(memberScopeM);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionInvoke) {
            s0 s0Var = (s0) obj;
            if (s0Var.b() == CallableMemberDescriptor.Kind.DECLARATION && s0Var.getVisibility().d() && !kotlin.reflect.jvm.internal.impl.builtins.g.j0(s0Var)) {
                Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> collectionF = s0Var.f();
                f0.o(collectionF, "analogueMember.overriddenDescriptors");
                if (!(collectionF instanceof Collection) || !collectionF.isEmpty()) {
                    Iterator<T> it2 = collectionF.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z10 = false;
                            break;
                        }
                        k kVarC = ((kotlin.reflect.jvm.internal.impl.descriptors.w) it2.next()).c();
                        f0.o(kVarC, "it.containingDeclaration");
                        if (eVarB.contains(DescriptorUtilsKt.l(kVarC))) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                z11 = (z10 || v(s0Var, zC)) ? false : true;
            }
            if (z11) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final j0 n() {
        return (j0) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f125506e, this, f125501h[1]);
    }

    private static final boolean o(j jVar, TypeSubstitutor typeSubstitutor, j jVar2) {
        return OverridingUtil.x(jVar, jVar2.d(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
    }

    private final LazyJavaClassDescriptor q(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        kotlin.reflect.jvm.internal.impl.name.b bVarN;
        kotlin.reflect.jvm.internal.impl.name.c cVarB;
        if (kotlin.reflect.jvm.internal.impl.builtins.g.a0(dVar) || !kotlin.reflect.jvm.internal.impl.builtins.g.A0(dVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.d dVarM = DescriptorUtilsKt.m(dVar);
        if (!dVarM.f() || (bVarN = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a.n(dVarM)) == null || (cVarB = bVarN.b()) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarC = q.c(u().a(), cVarB, NoLookupLocation.FROM_BUILTINS);
        if (dVarC instanceof LazyJavaClassDescriptor) {
            return (LazyJavaClassDescriptor) dVarC;
        }
        return null;
    }

    private final JDKMemberStatus r(kotlin.reflect.jvm.internal.impl.descriptors.w wVar) {
        k kVarC = wVar.c();
        f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objB = kotlin.reflect.jvm.internal.impl.utils.b.b(kotlin.collections.s.k((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC), new f(this), new c(kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(wVar, false, false, 3, null), new Ref.ObjectRef()));
        f0.o(objB, "jvmDescriptor = computeJ…CONSIDERED\n            })");
        return (JDKMemberStatus) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable s(JvmBuiltInsCustomizer this$0, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        f0.p(this$0, "this$0");
        Collection<kotlin.reflect.jvm.internal.impl.types.d0> collectionL = dVar.r().l();
        f0.o(collectionL, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionL.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((kotlin.reflect.jvm.internal.impl.types.d0) it.next()).O0().d();
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarA = fVarD != null ? fVarD.a() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = fVarA instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarA : null;
            LazyJavaClassDescriptor lazyJavaClassDescriptorQ = dVar2 != null ? this$0.q(dVar2) : null;
            if (lazyJavaClassDescriptorQ != null) {
                arrayList.add(lazyJavaClassDescriptorQ);
            }
        }
        return arrayList;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e t() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.e) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f125508g, this, f125501h[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JvmBuiltIns.a u() {
        return (JvmBuiltIns.a) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f125504c, this, f125501h[0]);
    }

    private final boolean v(s0 s0Var, boolean z10) {
        k kVarC = s0Var.c();
        f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(s0Var, false, false, 3, null);
        if (z10 ^ h.f125548a.f().contains(s.a(SignatureBuildingComponents.f126464a, (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC, strC))) {
            return true;
        }
        Boolean boolE = kotlin.reflect.jvm.internal.impl.utils.b.e(kotlin.collections.s.k(s0Var), e.f125545a, new l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0021  */
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                boolean z11;
                if (callableMemberDescriptor.b() == CallableMemberDescriptor.Kind.DECLARATION) {
                    d dVar = this.f125518b.f125503b;
                    k kVarC2 = callableMemberDescriptor.c();
                    f0.n(kVarC2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (dVar.c((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC2)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        f0.o(boolE, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable w(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.a().f();
    }

    private final boolean x(j jVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (jVar.i().size() == 1) {
            List<b1> valueParameters = jVar.i();
            f0.o(valueParameters, "valueParameters");
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((b1) CollectionsKt___CollectionsKt.c5(valueParameters)).getType().O0().d();
            if (f0.g(fVarD != null ? DescriptorUtilsKt.m(fVarD) : null, DescriptorUtilsKt.m(dVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // gi.c
    public boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor, @dl.d s0 functionDescriptor) {
        f0.p(classDescriptor, "classDescriptor");
        f0.p(functionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorQ = q(classDescriptor);
        if (lazyJavaClassDescriptorQ == null || !functionDescriptor.getAnnotations().J1(gi.d.a())) {
            return true;
        }
        if (!u().b()) {
            return false;
        }
        String strC = kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(functionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope lazyJavaClassMemberScopeM = lazyJavaClassDescriptorQ.M();
        kotlin.reflect.jvm.internal.impl.name.f name = functionDescriptor.getName();
        f0.o(name, "functionDescriptor.name");
        Collection<s0> collectionA = lazyJavaClassMemberScopeM.a(name, NoLookupLocation.FROM_BUILTINS);
        if (!(collectionA instanceof Collection) || !collectionA.isEmpty()) {
            Iterator<T> it = collectionA.iterator();
            while (it.hasNext()) {
                if (f0.g(kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((s0) it.next(), false, false, 3, null), strC)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gi.a
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarF;
        boolean z10;
        f0.p(classDescriptor, "classDescriptor");
        if (classDescriptor.b() != ClassKind.CLASS || !u().b()) {
            return CollectionsKt__CollectionsKt.E();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorQ = q(classDescriptor);
        if (lazyJavaClassDescriptorQ != null && (dVarF = d.f(this.f125503b, DescriptorUtilsKt.l(lazyJavaClassDescriptorQ), kotlin.reflect.jvm.internal.impl.builtins.jvm.b.f125522i.a(), null, 4, null)) != null) {
            TypeSubstitutor typeSubstitutorC = i.a(dVarF, lazyJavaClassDescriptorQ).c();
            List<kotlin.reflect.jvm.internal.impl.descriptors.c> listH = lazyJavaClassDescriptorQ.h();
            ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.c> arrayList = new ArrayList();
            Iterator<T> it = listH.iterator();
            while (true) {
                boolean z11 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                kotlin.reflect.jvm.internal.impl.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.c) next;
                if (cVar.getVisibility().d()) {
                    Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> collectionH = dVarF.h();
                    f0.o(collectionH, "defaultKotlinVersion.constructors");
                    if (!(collectionH instanceof Collection) || !collectionH.isEmpty()) {
                        Iterator<T> it2 = collectionH.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z10 = true;
                                break;
                            }
                            kotlin.reflect.jvm.internal.impl.descriptors.c it3 = (kotlin.reflect.jvm.internal.impl.descriptors.c) it2.next();
                            f0.o(it3, "it");
                            if (o(it3, typeSubstitutorC, cVar)) {
                                z10 = false;
                                break;
                            }
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                    if (z10 && !x(cVar, classDescriptor) && !kotlin.reflect.jvm.internal.impl.builtins.g.j0(cVar) && !h.f125548a.d().contains(s.a(SignatureBuildingComponents.f126464a, lazyJavaClassDescriptorQ, kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(cVar, false, false, 3, null)))) {
                        z11 = true;
                    }
                }
                if (z11) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(t.Y(arrayList, 10));
            for (kotlin.reflect.jvm.internal.impl.descriptors.c cVar2 : arrayList) {
                kotlin.reflect.jvm.internal.impl.descriptors.w.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.w> aVarQ = cVar2.q();
                aVarQ.r(classDescriptor);
                aVarQ.h(classDescriptor.v());
                aVarQ.g();
                aVarQ.c(typeSubstitutorC.j());
                if (!h.f125548a.g().contains(s.a(SignatureBuildingComponents.f126464a, lazyJavaClassDescriptorQ, kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(cVar2, false, false, 3, null)))) {
                    aVarQ.l(t());
                }
                kotlin.reflect.jvm.internal.impl.descriptors.w wVarBuild = aVarQ.build();
                f0.n(wVarBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((kotlin.reflect.jvm.internal.impl.descriptors.c) wVarBuild);
            }
            return arrayList2;
        }
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // gi.a
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.types.d0> c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
        f0.p(classDescriptor, "classDescriptor");
        kotlin.reflect.jvm.internal.impl.name.d dVarM = DescriptorUtilsKt.m(classDescriptor);
        h hVar = h.f125548a;
        if (!hVar.i(dVarM)) {
            return hVar.j(dVarM) ? kotlin.collections.s.k(this.f125505d) : CollectionsKt__CollectionsKt.E();
        }
        j0 cloneableType = n();
        f0.o(cloneableType, "cloneableType");
        return CollectionsKt__CollectionsKt.L(cloneableType, this.f125505d);
    }

    @Override // gi.a
    @dl.d
    public Collection<s0> d(@dl.d final kotlin.reflect.jvm.internal.impl.name.f name, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
        f0.p(name, "name");
        f0.p(classDescriptor, "classDescriptor");
        boolean z10 = true;
        if (f0.g(name, kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f125520e.a()) && (classDescriptor instanceof DeserializedClassDescriptor) && kotlin.reflect.jvm.internal.impl.builtins.g.d0(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> listI0 = deserializedClassDescriptor.c1().I0();
            f0.o(listI0, "classDescriptor.classProto.functionList");
            if ((listI0 instanceof Collection) && listI0.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = listI0.iterator();
                while (it.hasNext()) {
                    if (f0.g(kotlin.reflect.jvm.internal.impl.serialization.deserialization.r.b(deserializedClassDescriptor.b1().g(), ((ProtoBuf.Function) it.next()).e0()), kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f125520e.a())) {
                    }
                }
                z10 = false;
            }
            return z10 ? CollectionsKt__CollectionsKt.E() : kotlin.collections.s.k(k(deserializedClassDescriptor, (s0) CollectionsKt___CollectionsKt.a5(n().u().a(name, NoLookupLocation.FROM_BUILTINS))));
        }
        if (!u().b()) {
            return CollectionsKt__CollectionsKt.E();
        }
        Collection<s0> collectionM = m(classDescriptor, new l<MemberScope, Collection<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<s0> invoke(@dl.d MemberScope it2) {
                f0.p(it2, "it");
                return it2.a(name, NoLookupLocation.FROM_BUILTINS);
            }
        });
        ArrayList arrayList = new ArrayList();
        for (s0 s0Var : collectionM) {
            k kVarC = s0Var.c();
            f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            kotlin.reflect.jvm.internal.impl.descriptors.w wVarD = s0Var.d(i.a((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC, classDescriptor).c());
            f0.n(wVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            kotlin.reflect.jvm.internal.impl.descriptors.w.a<? extends s0> aVarQ = ((s0) wVarD).q();
            aVarQ.r(classDescriptor);
            aVarQ.a(classDescriptor.b0());
            aVarQ.g();
            int i10 = a.f125509a[r(s0Var).ordinal()];
            s0 s0Var2 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    aVarQ.l(t());
                } else if (i10 != 3) {
                }
                kotlin.reflect.jvm.internal.impl.descriptors.w wVarBuild = aVarQ.build();
                f0.m(wVarBuild);
                s0Var2 = (s0) wVarBuild;
            } else if (!b0.a(classDescriptor)) {
                aVarQ.o();
                kotlin.reflect.jvm.internal.impl.descriptors.w wVarBuild2 = aVarQ.build();
                f0.m(wVarBuild2);
                s0Var2 = (s0) wVarBuild2;
            }
            if (s0Var2 != null) {
                arrayList.add(s0Var2);
            }
        }
        return arrayList;
    }

    @Override // gi.a
    @dl.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.name.f> e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d classDescriptor) {
        LazyJavaClassMemberScope lazyJavaClassMemberScopeM;
        Set<kotlin.reflect.jvm.internal.impl.name.f> setB;
        f0.p(classDescriptor, "classDescriptor");
        if (!u().b()) {
            return d1.k();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorQ = q(classDescriptor);
        return (lazyJavaClassDescriptorQ == null || (lazyJavaClassMemberScopeM = lazyJavaClassDescriptorQ.M()) == null || (setB = lazyJavaClassMemberScopeM.b()) == null) ? d1.k() : setB;
    }
}
