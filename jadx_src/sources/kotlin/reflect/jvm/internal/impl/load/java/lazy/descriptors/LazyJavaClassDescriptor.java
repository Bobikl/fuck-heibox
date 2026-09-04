package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.max.xiaoheihe.module.mall.SteamStoreRedeemWalletCodeActivity;
import fi.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.b0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.k0;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.m;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.z;
import mi.g;
import mi.j;
import mi.x;
import mi.y;

/* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaClassDescriptor extends f implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.c {

    @dl.d
    public static final a A = new a(null);

    @dl.d
    private static final Set<String> B = d1.u("equals", "hashCode", "getClass", SteamStoreRedeemWalletCodeActivity.N3, "notify", "notifyAll", "toString");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final g f126140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.descriptors.d f126141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final z f126143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final ClassKind f126144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final Modality f126145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final g1 f126146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f126147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final LazyJavaClassTypeConstructor f126148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final LazyJavaClassMemberScope f126149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final ScopesHolderForClass<LazyJavaClassMemberScope> f126150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.e f126151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final LazyJavaStaticClassScope f126152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e f126153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final h<List<y0>> f126154z;

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    public final class LazyJavaClassTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final h<List<y0>> f126155d;

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f126142n.e());
            this.f126155d = LazyJavaClassDescriptor.this.f126142n.e().c(new yh.a<List<? extends y0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends y0> invoke() {
                    return TypeParameterUtilsKt.d(lazyJavaClassDescriptor);
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        private final d0 x() {
            kotlin.reflect.jvm.internal.impl.name.c cVarB;
            ArrayList arrayList;
            kotlin.reflect.jvm.internal.impl.name.c cVarY = y();
            if (cVarY == null) {
                cVarY = null;
            } else {
                if (!(!cVarY.d() && cVarY.i(kotlin.reflect.jvm.internal.impl.builtins.h.f125411t))) {
                    cVarY = null;
                }
            }
            if (cVarY == null) {
                cVarB = kotlin.reflect.jvm.internal.impl.load.java.g.f126053a.b(DescriptorUtilsKt.l(LazyJavaClassDescriptor.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarY;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarV = DescriptorUtilsKt.v(LazyJavaClassDescriptor.this.f126142n.d(), cVarB, NoLookupLocation.FROM_JAVA_LOADER);
            if (dVarV == null) {
                return null;
            }
            int size = dVarV.r().getParameters().size();
            List<y0> parameters = LazyJavaClassDescriptor.this.r().getParameters();
            f0.o(parameters, "getTypeConstructor().parameters");
            int size2 = parameters.size();
            if (size2 == size) {
                arrayList = new ArrayList(t.Y(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new e1(Variance.INVARIANT, ((y0) it.next()).v()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarY != null) {
                    return null;
                }
                e1 e1Var = new e1(Variance.INVARIANT, ((y0) CollectionsKt___CollectionsKt.c5(parameters)).v());
                l lVar = new l(1, size);
                ArrayList arrayList2 = new ArrayList(t.Y(lVar, 10));
                Iterator<Integer> it2 = lVar.iterator();
                while (it2.hasNext()) {
                    ((k0) it2).nextInt();
                    arrayList2.add(e1Var);
                }
                arrayList = arrayList2;
            }
            return KotlinTypeFactory.g(w0.f128193c.h(), dVarV, arrayList);
        }

        private final kotlin.reflect.jvm.internal.impl.name.c y() {
            String strB;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations = LazyJavaClassDescriptor.this.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.c PURELY_IMPLEMENTS_ANNOTATION = kotlin.reflect.jvm.internal.impl.load.java.t.f126325q;
            f0.o(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarK = annotations.k(PURELY_IMPLEMENTS_ANNOTATION);
            if (cVarK == null) {
                return null;
            }
            Object objD5 = CollectionsKt___CollectionsKt.d5(cVarK.a().values());
            kotlin.reflect.jvm.internal.impl.resolve.constants.t tVar = objD5 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t ? (kotlin.reflect.jvm.internal.impl.resolve.constants.t) objD5 : null;
            if (tVar == null || (strB = tVar.b()) == null || !kotlin.reflect.jvm.internal.impl.name.e.e(strB)) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.name.c(strB);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        public boolean e() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        public List<y0> getParameters() {
            return this.f126155d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected Collection<d0> k() {
            Collection<j> collectionL = LazyJavaClassDescriptor.this.Q0().l();
            ArrayList arrayList = new ArrayList(collectionL.size());
            ArrayList<x> arrayList2 = new ArrayList(0);
            d0 d0VarX = x();
            Iterator<j> it = collectionL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j next = it.next();
                d0 d0VarH = LazyJavaClassDescriptor.this.f126142n.a().r().h(LazyJavaClassDescriptor.this.f126142n.g().o(next, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.SUPERTYPE, false, false, null, 7, null)), LazyJavaClassDescriptor.this.f126142n);
                if (d0VarH.O0().d() instanceof NotFoundClasses.b) {
                    arrayList2.add(next);
                }
                if (!f0.g(d0VarH.O0(), d0VarX != null ? d0VarX.O0() : null) && !kotlin.reflect.jvm.internal.impl.builtins.g.b0(d0VarH)) {
                    arrayList.add(d0VarH);
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = LazyJavaClassDescriptor.this.f126141m;
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, dVar != null ? i.a(dVar, LazyJavaClassDescriptor.this).c().p(dVar.v(), Variance.INVARIANT) : null);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, d0VarX);
            if (!arrayList2.isEmpty()) {
                m mVarC = LazyJavaClassDescriptor.this.f126142n.a().c();
                kotlin.reflect.jvm.internal.impl.descriptors.d dVarD = d();
                ArrayList arrayList3 = new ArrayList(t.Y(arrayList2, 10));
                for (x xVar : arrayList2) {
                    f0.n(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((j) xVar).B());
                }
                mVarC.b(dVarD, arrayList3);
            }
            return arrayList.isEmpty() ^ true ? CollectionsKt___CollectionsKt.Q5(arrayList) : s.k(LazyJavaClassDescriptor.this.f126142n.d().t().i());
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @dl.d
        protected kotlin.reflect.jvm.internal.impl.descriptors.w0 p() {
            return LazyJavaClassDescriptor.this.f126142n.a().v();
        }

        @dl.d
        public String toString() {
            String strB = LazyJavaClassDescriptor.this.getName().b();
            f0.o(strB, "name.asString()");
            return strB;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.k, kotlin.reflect.jvm.internal.impl.types.z0
        @dl.d
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.d d() {
            return LazyJavaClassDescriptor.this;
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.g.l(DescriptorUtilsKt.l((kotlin.reflect.jvm.internal.impl.descriptors.d) t10).b(), DescriptorUtilsKt.l((kotlin.reflect.jvm.internal.impl.descriptors.d) t11).b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d outerContext, @dl.d k containingDeclaration, @dl.d g jClass, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        Modality modalityA;
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        f0.p(outerContext, "outerContext");
        f0.p(containingDeclaration, "containingDeclaration");
        f0.p(jClass, "jClass");
        this.f126139k = outerContext;
        this.f126140l = jClass;
        this.f126141m = dVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVarD = ContextKt.d(outerContext, this, jClass, 0, 4, null);
        this.f126142n = dVarD;
        dVarD.a().h().b(jClass, this);
        jClass.E();
        this.f126143o = b0.c(new yh.a<List<? extends mi.a>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$moduleAnnotations$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            public final List<? extends mi.a> invoke() {
                kotlin.reflect.jvm.internal.impl.name.b bVarK = DescriptorUtilsKt.k(this.f126159b);
                if (bVarK != null) {
                    return this.f126159b.S0().a().f().a(bVarK);
                }
                return null;
            }
        });
        this.f126144p = jClass.s() ? ClassKind.ANNOTATION_CLASS : jClass.n() ? ClassKind.INTERFACE : jClass.m() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        if (jClass.s() || jClass.m()) {
            modalityA = Modality.FINAL;
        } else {
            modalityA = Modality.Companion.a(jClass.t(), jClass.t() || jClass.isAbstract() || jClass.n(), !jClass.isFinal());
        }
        this.f126145q = modalityA;
        this.f126146r = jClass.getVisibility();
        this.f126147s = (jClass.q() == null || jClass.p()) ? false : true;
        this.f126148t = new LazyJavaClassTypeConstructor();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(dVarD, this, jClass, dVar != null, null, 16, null);
        this.f126149u = lazyJavaClassMemberScope;
        this.f126150v = ScopesHolderForClass.f125571e.a(this, dVarD.e(), dVarD.a().k().c(), new yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, LazyJavaClassMemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$scopeHolder$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LazyJavaClassMemberScope invoke(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f it) {
                f0.p(it, "it");
                kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar2 = this.f126160b.f126142n;
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f126160b;
                return new LazyJavaClassMemberScope(dVar2, lazyJavaClassDescriptor, lazyJavaClassDescriptor.Q0(), this.f126160b.f126141m != null, this.f126160b.f126149u);
            }
        });
        this.f126151w = new kotlin.reflect.jvm.internal.impl.resolve.scopes.e(lazyJavaClassMemberScope);
        this.f126152x = new LazyJavaStaticClassScope(dVarD, jClass, this);
        this.f126153y = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(dVarD, jClass);
        this.f126154z = dVarD.e().c(new yh.a<List<? extends y0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends y0> invoke() {
                List<y> typeParameters = this.f126158b.Q0().getTypeParameters();
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f126158b;
                ArrayList arrayList = new ArrayList(t.Y(typeParameters, 10));
                for (y yVar : typeParameters) {
                    y0 y0VarA = lazyJavaClassDescriptor.f126142n.f().a(yVar);
                    if (y0VarA == null) {
                        throw new AssertionError("Parameter " + yVar + " surely belongs to class " + lazyJavaClassDescriptor.Q0() + ", so it must be resolved");
                    }
                    arrayList.add(y0VarA);
                }
                return arrayList;
            }
        });
    }

    public /* synthetic */ LazyJavaClassDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, k kVar, g gVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar2, int i10, u uVar) {
        this(dVar, kVar, gVar, (i10 & 8) != 0 ? null : dVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.c D() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public MemberScope L() {
        return this.f126151w;
    }

    @dl.d
    public final LazyJavaClassDescriptor O0(@dl.d kotlin.reflect.jvm.internal.impl.load.java.components.d javaResolverCache, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        f0.p(javaResolverCache, "javaResolverCache");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar2 = this.f126142n;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVarI = ContextKt.i(dVar2, dVar2.a().x(javaResolverCache));
        k containingDeclaration = c();
        f0.o(containingDeclaration, "containingDeclaration");
        return new LazyJavaClassDescriptor(dVarI, containingDeclaration, this.f126140l, dVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        return this.f126149u.y0().invoke();
    }

    @dl.d
    public final g Q0() {
        return this.f126140l;
    }

    @dl.e
    public final List<mi.a> R0() {
        return (List) this.f126143o.getValue();
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.d S0() {
        return this.f126139k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.a, kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope M() {
        MemberScope memberScopeM = super.M();
        f0.n(memberScopeM, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) memberScopeM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.r
    @dl.d
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.f126150v.c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public ClassKind b() {
        return this.f126144p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean g() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        return this.f126153y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.o, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
        if (!f0.g(this.f126146r, r.f125864a) || this.f126140l.q() != null) {
            return kotlin.reflect.jvm.internal.impl.load.java.x.d(this.f126146r);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.s sVar = kotlin.reflect.jvm.internal.impl.load.java.m.f126286a;
        f0.o(sVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return sVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.a0
    @dl.d
    public Modality l() {
        return this.f126145q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean m() {
        return this.f126147s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.e
    public z0<j0> m0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a0
    public boolean o0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.z0 r() {
        return this.f126148t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean r0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> s() {
        if (this.f126145q != Modality.SEALED) {
            return CollectionsKt__CollectionsKt.E();
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarB = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, false, false, null, 7, null);
        Collection<j> collectionZ = this.f126140l.z();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionZ.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = this.f126142n.g().o((j) it.next(), aVarB).O0().d();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return CollectionsKt___CollectionsKt.p5(arrayList, new b());
    }

    @dl.d
    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.m(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @dl.d
    public List<y0> w() {
        return this.f126154z.invoke();
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
        return this.f126152x;
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
