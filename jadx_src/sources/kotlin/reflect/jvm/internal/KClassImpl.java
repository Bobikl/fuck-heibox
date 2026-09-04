package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w0;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;
import kotlin.text.y;

/* JADX INFO: compiled from: KClassImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements kotlin.reflect.d<T>, i, l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Class<T> f125105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final n.b<KClassImpl<T>.Data> f125106f;

    /* JADX INFO: compiled from: KClassImpl.kt */
    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.n<Object>[] f125107w = {n0.u(new PropertyReference1Impl(n0.d(Data.class), org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134964e, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), n0.u(new PropertyReference1Impl(n0.d(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final n.a f125108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final n.a f125109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final n.a f125110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final n.a f125111g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.d
        private final n.a f125112h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @dl.d
        private final n.a f125113i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @dl.d
        private final n.b f125114j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @dl.d
        private final n.a f125115k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @dl.d
        private final n.a f125116l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @dl.d
        private final n.a f125117m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @dl.d
        private final n.a f125118n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @dl.d
        private final n.a f125119o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @dl.d
        private final n.a f125120p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @dl.d
        private final n.a f125121q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @dl.d
        private final n.a f125122r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @dl.d
        private final n.a f125123s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.d
        private final n.a f125124t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @dl.d
        private final n.a f125125u;

        public Data() {
            super();
            this.f125108d = n.d(new yh.a<kotlin.reflect.jvm.internal.impl.descriptors.d>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$descriptor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlin.reflect.jvm.internal.impl.descriptors.d invoke() {
                    kotlin.reflect.jvm.internal.impl.name.b bVarD0 = kClassImpl.d0();
                    ii.k kVarA = ((KClassImpl.Data) kClassImpl.f0().invoke()).a();
                    kotlin.reflect.jvm.internal.impl.descriptors.d dVarB = bVarD0.k() ? kVarA.a().b(bVarD0) : FindClassInModuleKt.a(kVarA.b(), bVarD0);
                    if (dVarB != null) {
                        return dVarB;
                    }
                    kClassImpl.j0();
                    throw null;
                }
            });
            this.f125109e = n.d(new yh.a<List<? extends Annotation>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$annotations$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125130b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125130b = this;
                }

                @Override // yh.a
                public final List<? extends Annotation> invoke() {
                    return s.e(this.f125130b.o());
                }
            });
            this.f125110f = n.d(new yh.a<String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$simpleName$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    if (kClassImpl.i().isAnonymousClass()) {
                        return null;
                    }
                    kotlin.reflect.jvm.internal.impl.name.b bVarD0 = kClassImpl.d0();
                    if (bVarD0.k()) {
                        return this.f(kClassImpl.i());
                    }
                    String strB = bVarD0.j().b();
                    f0.o(strB, "classId.shortClassName.asString()");
                    return strB;
                }
            });
            this.f125111g = n.d(new yh.a<String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$qualifiedName$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    if (kClassImpl.i().isAnonymousClass()) {
                        return null;
                    }
                    kotlin.reflect.jvm.internal.impl.name.b bVarD0 = kClassImpl.d0();
                    if (bVarD0.k()) {
                        return null;
                    }
                    return bVarD0.b().b();
                }
            });
            this.f125112h = n.d(new yh.a<List<? extends kotlin.reflect.i<? extends T>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$constructors$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public final List<kotlin.reflect.i<T>> invoke() {
                    Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> collectionN = kClassImpl.N();
                    KClassImpl<T> kClassImpl = kClassImpl;
                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(collectionN, 10));
                    Iterator<T> it = collectionN.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new KFunctionImpl(kClassImpl, (kotlin.reflect.jvm.internal.impl.descriptors.j) it.next()));
                    }
                    return arrayList;
                }
            });
            this.f125113i = n.d(new yh.a<List<? extends KClassImpl<? extends Object>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$nestedClasses$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125138b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125138b = this;
                }

                @Override // yh.a
                public final List<? extends KClassImpl<? extends Object>> invoke() {
                    MemberScope memberScopeL = this.f125138b.o().L();
                    f0.o(memberScopeL, "descriptor.unsubstitutedInnerClassesScope");
                    Collection collectionA = kotlin.reflect.jvm.internal.impl.resolve.scopes.h.a.a(memberScopeL, null, null, 3, null);
                    ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.k> arrayList = new ArrayList();
                    for (Object obj : collectionA) {
                        if (!kotlin.reflect.jvm.internal.impl.resolve.d.B((kotlin.reflect.jvm.internal.impl.descriptors.k) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (kotlin.reflect.jvm.internal.impl.descriptors.k kVar : arrayList) {
                        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVar : null;
                        Class<?> clsP = dVar != null ? s.p(dVar) : null;
                        KClassImpl kClassImpl = clsP != null ? new KClassImpl(clsP) : null;
                        if (kClassImpl != null) {
                            arrayList2.add(kClassImpl);
                        }
                    }
                    return arrayList2;
                }
            });
            this.f125114j = n.b(new yh.a<T>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$objectInstance$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125139b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125139b = this;
                }

                @Override // yh.a
                @dl.e
                public final T invoke() {
                    kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = this.f125139b.o();
                    if (dVarO.b() != ClassKind.OBJECT) {
                        return null;
                    }
                    T t10 = (T) ((!dVarO.r0() || kotlin.reflect.jvm.internal.impl.builtins.c.a(kotlin.reflect.jvm.internal.impl.builtins.b.f125355a, dVarO)) ? kClassImpl.i().getDeclaredField("INSTANCE") : kClassImpl.i().getEnclosingClass().getDeclaredField(dVarO.getName().b())).get(null);
                    f0.n(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                    return t10;
                }
            });
            this.f125115k = n.d(new yh.a<List<? extends KTypeParameterImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$typeParameters$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125151b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125151b = this;
                }

                @Override // yh.a
                public final List<? extends KTypeParameterImpl> invoke() {
                    List<y0> listW = this.f125151b.o().w();
                    f0.o(listW, "descriptor.declaredTypeParameters");
                    l lVar = kClassImpl;
                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listW, 10));
                    for (y0 descriptor : listW) {
                        f0.o(descriptor, "descriptor");
                        arrayList.add(new KTypeParameterImpl(lVar, descriptor));
                    }
                    return arrayList;
                }
            });
            this.f125116l = n.d(new yh.a<List<? extends KTypeImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125145b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125145b = this;
                }

                @Override // yh.a
                public final List<? extends KTypeImpl> invoke() {
                    ClassKind classKindB;
                    Collection<d0> collectionL = this.f125145b.o().r().l();
                    f0.o(collectionL, "descriptor.typeConstructor.supertypes");
                    ArrayList arrayList = new ArrayList(collectionL.size());
                    final KClassImpl<T>.Data data = this.f125145b;
                    final KClassImpl<T> kClassImpl = kClassImpl;
                    for (final d0 kotlinType : collectionL) {
                        f0.o(kotlinType, "kotlinType");
                        arrayList.add(new KTypeImpl(kotlinType, new yh.a<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Type invoke() {
                                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = kotlinType.O0().d();
                                if (!(fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
                                    throw new KotlinReflectionInternalError("Supertype not a class: " + fVarD);
                                }
                                Class<?> clsP = s.p((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD);
                                if (clsP == null) {
                                    throw new KotlinReflectionInternalError("Unsupported superclass of " + data + ": " + fVarD);
                                }
                                if (f0.g(kClassImpl.i().getSuperclass(), clsP)) {
                                    Type genericSuperclass = kClassImpl.i().getGenericSuperclass();
                                    f0.o(genericSuperclass, "{\n                      …ass\n                    }");
                                    return genericSuperclass;
                                }
                                Class<?>[] interfaces = kClassImpl.i().getInterfaces();
                                f0.o(interfaces, "jClass.interfaces");
                                int iJg = ArraysKt___ArraysKt.jg(interfaces, clsP);
                                if (iJg >= 0) {
                                    Type type = kClassImpl.i().getGenericInterfaces()[iJg];
                                    f0.o(type, "{\n                      …ex]\n                    }");
                                    return type;
                                }
                                throw new KotlinReflectionInternalError("No superclass of " + data + " in Java reflection for " + fVarD);
                            }
                        }));
                    }
                    if (!kotlin.reflect.jvm.internal.impl.builtins.g.t0(this.f125145b.o())) {
                        boolean z10 = false;
                        if (arrayList.isEmpty()) {
                            z10 = true;
                            break;
                        }
                        Iterator it = arrayList.iterator();
                        do {
                            if (!it.hasNext()) {
                                z10 = true;
                                break;
                            }
                            classKindB = kotlin.reflect.jvm.internal.impl.resolve.d.e(((KTypeImpl) it.next()).j()).b();
                            f0.o(classKindB, "getClassDescriptorForType(it.type).kind");
                        } while (classKindB == ClassKind.INTERFACE || classKindB == ClassKind.ANNOTATION_CLASS);
                        if (z10) {
                            j0 j0VarI = DescriptorUtilsKt.j(this.f125145b.o()).i();
                            f0.o(j0VarI, "descriptor.builtIns.anyType");
                            arrayList.add(new KTypeImpl(j0VarI, new yh.a<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.3
                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Type invoke() {
                                    return Object.class;
                                }
                            }));
                        }
                    }
                    return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
                }
            });
            this.f125117m = n.d(new yh.a<List<? extends KClassImpl<? extends T>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$sealedSubclasses$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125142b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125142b = this;
                }

                @Override // yh.a
                public final List<KClassImpl<? extends T>> invoke() {
                    Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> collectionS = this.f125142b.o().s();
                    f0.o(collectionS, "descriptor.sealedSubclasses");
                    ArrayList arrayList = new ArrayList();
                    for (kotlin.reflect.jvm.internal.impl.descriptors.d dVar : collectionS) {
                        f0.n(dVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class<?> clsP = s.p(dVar);
                        KClassImpl kClassImpl = clsP != null ? new KClassImpl(clsP) : null;
                        if (kClassImpl != null) {
                            arrayList.add(kClassImpl);
                        }
                    }
                    return arrayList;
                }
            });
            this.f125118n = n.d(new yh.a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredNonStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<KCallableImpl<?>> invoke() {
                    KClassImpl<T> kClassImpl = kClassImpl;
                    return kClassImpl.Q(kClassImpl.h0(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.f125119o = n.d(new yh.a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<KCallableImpl<?>> invoke() {
                    KClassImpl<T> kClassImpl = kClassImpl;
                    return kClassImpl.Q(kClassImpl.i0(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                }
            });
            this.f125120p = n.d(new yh.a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedNonStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<KCallableImpl<?>> invoke() {
                    KClassImpl<T> kClassImpl = kClassImpl;
                    return kClassImpl.Q(kClassImpl.h0(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.f125121q = n.d(new yh.a<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedStaticMembers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Collection<KCallableImpl<?>> invoke() {
                    KClassImpl<T> kClassImpl = kClassImpl;
                    return kClassImpl.Q(kClassImpl.i0(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                }
            });
            this.f125122r = n.d(new yh.a<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allNonStaticMembers$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125128b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125128b = this;
                }

                @Override // yh.a
                public final List<? extends KCallableImpl<?>> invoke() {
                    return CollectionsKt___CollectionsKt.y4(this.f125128b.m(), this.f125128b.p());
                }
            });
            this.f125123s = n.d(new yh.a<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allStaticMembers$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125129b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125129b = this;
                }

                @Override // yh.a
                public final List<? extends KCallableImpl<?>> invoke() {
                    return CollectionsKt___CollectionsKt.y4(this.f125129b.n(), this.f125129b.q());
                }
            });
            this.f125124t = n.d(new yh.a<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredMembers$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125132b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125132b = this;
                }

                @Override // yh.a
                public final List<? extends KCallableImpl<?>> invoke() {
                    return CollectionsKt___CollectionsKt.y4(this.f125132b.m(), this.f125132b.n());
                }
            });
            this.f125125u = n.d(new yh.a<List<? extends KCallableImpl<?>>>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allMembers$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.Data f125127b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f125127b = this;
                }

                @Override // yh.a
                public final List<? extends KCallableImpl<?>> invoke() {
                    return CollectionsKt___CollectionsKt.y4(this.f125127b.h(), this.f125127b.i());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(Class<?> cls) {
            String name = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                f0.o(name, "name");
                return StringsKt__StringsKt.q5(name, enclosingMethod.getName() + y.f128594c, null, 2, null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                f0.o(name, "name");
                return StringsKt__StringsKt.p5(name, y.f128594c, null, 2, null);
            }
            f0.o(name, "name");
            return StringsKt__StringsKt.q5(name, enclosingConstructor.getName() + y.f128594c, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> n() {
            T tB = this.f125119o.b(this, f125107w[11]);
            f0.o(tB, "<get-declaredStaticMembers>(...)");
            return (Collection) tB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> p() {
            T tB = this.f125120p.b(this, f125107w[12]);
            f0.o(tB, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) tB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> q() {
            T tB = this.f125121q.b(this, f125107w[13]);
            f0.o(tB, "<get-inheritedStaticMembers>(...)");
            return (Collection) tB;
        }

        @dl.d
        public final Collection<KCallableImpl<?>> g() {
            T tB = this.f125125u.b(this, f125107w[17]);
            f0.o(tB, "<get-allMembers>(...)");
            return (Collection) tB;
        }

        @dl.d
        public final Collection<KCallableImpl<?>> h() {
            T tB = this.f125122r.b(this, f125107w[14]);
            f0.o(tB, "<get-allNonStaticMembers>(...)");
            return (Collection) tB;
        }

        @dl.d
        public final Collection<KCallableImpl<?>> i() {
            T tB = this.f125123s.b(this, f125107w[15]);
            f0.o(tB, "<get-allStaticMembers>(...)");
            return (Collection) tB;
        }

        @dl.d
        public final List<Annotation> j() {
            T tB = this.f125109e.b(this, f125107w[1]);
            f0.o(tB, "<get-annotations>(...)");
            return (List) tB;
        }

        @dl.d
        public final Collection<kotlin.reflect.i<T>> k() {
            T tB = this.f125112h.b(this, f125107w[4]);
            f0.o(tB, "<get-constructors>(...)");
            return (Collection) tB;
        }

        @dl.d
        public final Collection<KCallableImpl<?>> l() {
            T tB = this.f125124t.b(this, f125107w[16]);
            f0.o(tB, "<get-declaredMembers>(...)");
            return (Collection) tB;
        }

        @dl.d
        public final Collection<KCallableImpl<?>> m() {
            T tB = this.f125118n.b(this, f125107w[10]);
            f0.o(tB, "<get-declaredNonStaticMembers>(...)");
            return (Collection) tB;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.d o() {
            T tB = this.f125108d.b(this, f125107w[0]);
            f0.o(tB, "<get-descriptor>(...)");
            return (kotlin.reflect.jvm.internal.impl.descriptors.d) tB;
        }

        @dl.d
        public final Collection<kotlin.reflect.d<?>> r() {
            T tB = this.f125113i.b(this, f125107w[5]);
            f0.o(tB, "<get-nestedClasses>(...)");
            return (Collection) tB;
        }

        @dl.e
        public final T s() {
            return this.f125114j.b(this, f125107w[6]);
        }

        @dl.e
        public final String t() {
            return (String) this.f125111g.b(this, f125107w[3]);
        }

        @dl.d
        public final List<kotlin.reflect.d<? extends T>> u() {
            T tB = this.f125117m.b(this, f125107w[9]);
            f0.o(tB, "<get-sealedSubclasses>(...)");
            return (List) tB;
        }

        @dl.e
        public final String v() {
            return (String) this.f125110f.b(this, f125107w[2]);
        }

        @dl.d
        public final List<kotlin.reflect.r> w() {
            T tB = this.f125116l.b(this, f125107w[8]);
            f0.o(tB, "<get-supertypes>(...)");
            return (List) tB;
        }

        @dl.d
        public final List<kotlin.reflect.s> x() {
            T tB = this.f125115k.b(this, f125107w[7]);
            f0.o(tB, "<get-typeParameters>(...)");
            return (List) tB;
        }
    }

    /* JADX INFO: compiled from: KClassImpl.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125153a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f125153a = iArr;
        }
    }

    public KClassImpl(@dl.d Class<T> jClass) {
        f0.p(jClass, "jClass");
        this.f125105e = jClass;
        n.b<KClassImpl<T>.Data> bVarB = n.b(new yh.a<KClassImpl<T>.Data>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$data$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f125154b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f125154b = this;
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KClassImpl<T>.Data invoke() {
                return this.f125154b.new Data();
            }
        });
        f0.o(bVarB, "lazy { Data() }");
        this.f125106f = bVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.name.b d0() {
        return p.f128319a.c(i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Void j0() {
        KotlinClassHeader kotlinClassHeaderH;
        ii.f fVarA = ii.f.f119377c.a(i());
        KotlinClassHeader.Kind kindC = (fVarA == null || (kotlinClassHeaderH = fVarA.h()) == null) ? null : kotlinClassHeaderH.c();
        switch (kindC == null ? -1 : a.f125153a[kindC.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + i());
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + i());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + i());
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + i() + " (kind = " + kindC + ')');
        }
    }

    @Override // kotlin.reflect.d
    @dl.e
    public String A() {
        return this.f125106f.invoke().t();
    }

    @Override // kotlin.reflect.d
    @dl.d
    public Collection<kotlin.reflect.d<?>> C() {
        return this.f125106f.invoke().r();
    }

    @Override // kotlin.reflect.d
    @dl.e
    public T D() {
        return this.f125106f.invoke().s();
    }

    @Override // kotlin.reflect.d
    public boolean E() {
        return a().r0();
    }

    @Override // kotlin.reflect.d
    @dl.e
    public String F() {
        return this.f125106f.invoke().v();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> N() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = a();
        if (dVarA.b() == ClassKind.INTERFACE || dVarA.b() == ClassKind.OBJECT) {
            return CollectionsKt__CollectionsKt.E();
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> collectionH = dVarA.h();
        f0.o(collectionH, "descriptor.constructors");
        return collectionH;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<w> O(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        MemberScope memberScopeH0 = h0();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.y4(memberScopeH0.a(name, noLookupLocation), i0().a(name, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.e
    public o0 P(int i10) {
        Class<?> declaringClass;
        if (f0.g(i().getSimpleName(), "DefaultImpls") && (declaringClass = i().getDeclaringClass()) != null && declaringClass.isInterface()) {
            kotlin.reflect.d dVarI = xh.a.i(declaringClass);
            f0.n(dVarI, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) dVarI).P(i10);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = a();
        DeserializedClassDescriptor deserializedClassDescriptor = dVarA instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) dVarA : null;
        if (deserializedClassDescriptor == null) {
            return null;
        }
        ProtoBuf.Class classC1 = deserializedClassDescriptor.c1();
        GeneratedMessageLite.f<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable = JvmProtoBuf.f127079j;
        f0.o(classLocalVariable, "classLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.b(classC1, classLocalVariable, i10);
        if (property != null) {
            return (o0) s.h(i(), property, deserializedClassDescriptor.b1().g(), deserializedClassDescriptor.b1().j(), deserializedClassDescriptor.e1(), KClassImpl$getLocalProperty$2$1$1.f125155d);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<o0> S(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        MemberScope memberScopeH0 = h0();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.y4(memberScopeH0.c(name, noLookupLocation), i0().c(name, noLookupLocation));
    }

    @Override // kotlin.reflect.d
    public boolean equals(@dl.e Object obj) {
        return (obj instanceof KClassImpl) && f0.g(xh.a.g(this), xh.a.g((kotlin.reflect.d) obj));
    }

    @dl.d
    public final n.b<KClassImpl<T>.Data> f0() {
        return this.f125106f;
    }

    @Override // kotlin.reflect.jvm.internal.i
    @dl.d
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d a() {
        return this.f125106f.invoke().o();
    }

    @Override // kotlin.reflect.b
    @dl.d
    public List<Annotation> getAnnotations() {
        return this.f125106f.invoke().j();
    }

    @Override // kotlin.reflect.d
    @dl.d
    public List<kotlin.reflect.s> getTypeParameters() {
        return this.f125106f.invoke().x();
    }

    @Override // kotlin.reflect.d
    @dl.e
    public KVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.s visibility = a().getVisibility();
        f0.o(visibility, "descriptor.visibility");
        return s.q(visibility);
    }

    @Override // kotlin.reflect.d
    @dl.d
    public Collection<kotlin.reflect.i<T>> h() {
        return this.f125106f.invoke().k();
    }

    @dl.d
    public final MemberScope h0() {
        return a().v().u();
    }

    @Override // kotlin.reflect.d
    public int hashCode() {
        return xh.a.g(this).hashCode();
    }

    @Override // kotlin.jvm.internal.r
    @dl.d
    public Class<T> i() {
        return this.f125105e;
    }

    @dl.d
    public final MemberScope i0() {
        MemberScope memberScopeX0 = a().x0();
        f0.o(memberScopeX0, "descriptor.staticScope");
        return memberScopeX0;
    }

    @Override // kotlin.reflect.d
    public boolean isAbstract() {
        return a().l() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.d
    public boolean isFinal() {
        return a().l() == Modality.FINAL;
    }

    @Override // kotlin.reflect.d
    public boolean isOpen() {
        return a().l() == Modality.OPEN;
    }

    @Override // kotlin.reflect.d
    @dl.d
    public List<kotlin.reflect.r> l() {
        return this.f125106f.invoke().w();
    }

    @Override // kotlin.reflect.d
    public boolean m() {
        return a().m();
    }

    @Override // kotlin.reflect.d
    @dl.d
    public List<kotlin.reflect.d<? extends T>> s() {
        return this.f125106f.invoke().u();
    }

    @Override // kotlin.reflect.d
    public boolean t() {
        return a().l() == Modality.SEALED;
    }

    @dl.d
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        kotlin.reflect.jvm.internal.impl.name.b bVarD0 = d0();
        kotlin.reflect.jvm.internal.impl.name.c cVarH = bVarD0.h();
        f0.o(cVarH, "classId.packageFqName");
        if (cVarH.d()) {
            str = "";
        } else {
            str = cVarH.b() + lg.a.f131414g;
        }
        String strB = bVarD0.i().b();
        f0.o(strB, "classId.relativeClassName.asString()");
        sb2.append(str + u.k2(strB, lg.a.f131414g, y.f128594c, false, 4, null));
        return sb2.toString();
    }

    @Override // kotlin.reflect.d
    public boolean u(@dl.e Object obj) {
        Integer numC = ReflectClassUtilKt.c(i());
        if (numC != null) {
            return w0.B(obj, numC.intValue());
        }
        Class clsG = ReflectClassUtilKt.g(i());
        if (clsG == null) {
            clsG = i();
        }
        return clsG.isInstance(obj);
    }

    @Override // kotlin.reflect.h
    @dl.d
    public Collection<kotlin.reflect.c<?>> v() {
        return this.f125106f.invoke().g();
    }

    @Override // kotlin.reflect.d
    public boolean x() {
        return a().x();
    }

    @Override // kotlin.reflect.d
    public boolean y() {
        return a().y();
    }

    @Override // kotlin.reflect.d
    public boolean z() {
        return a().z();
    }
}
