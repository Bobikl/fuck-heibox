package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.x;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.f;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.n;
import mi.b0;
import mi.r;
import mi.y;
import yh.l;

/* JADX INFO: compiled from: LazyJavaScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class LazyJavaScope extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f126208m = {n0.u(new PropertyReference1Impl(n0.d(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), n0.u(new PropertyReference1Impl(n0.d(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), n0.u(new PropertyReference1Impl(n0.d(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final LazyJavaScope f126210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final h<Collection<k>> f126211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final h<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a> f126212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.f, Collection<s0>> f126213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final g<kotlin.reflect.jvm.internal.impl.name.f, o0> f126214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.f, Collection<s0>> f126215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final h f126216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final h f126217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final h f126218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.f, List<o0>> f126219l;

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final d0 f126220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final d0 f126221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final List<b1> f126222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final List<y0> f126223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f126224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final List<String> f126225f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d d0 returnType, @dl.e d0 d0Var, @dl.d List<? extends b1> valueParameters, @dl.d List<? extends y0> typeParameters, boolean z10, @dl.d List<String> errors) {
            f0.p(returnType, "returnType");
            f0.p(valueParameters, "valueParameters");
            f0.p(typeParameters, "typeParameters");
            f0.p(errors, "errors");
            this.f126220a = returnType;
            this.f126221b = d0Var;
            this.f126222c = valueParameters;
            this.f126223d = typeParameters;
            this.f126224e = z10;
            this.f126225f = errors;
        }

        @dl.d
        public final List<String> a() {
            return this.f126225f;
        }

        public final boolean b() {
            return this.f126224e;
        }

        @dl.e
        public final d0 c() {
            return this.f126221b;
        }

        @dl.d
        public final d0 d() {
            return this.f126220a;
        }

        @dl.d
        public final List<y0> e() {
            return this.f126223d;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f0.g(this.f126220a, aVar.f126220a) && f0.g(this.f126221b, aVar.f126221b) && f0.g(this.f126222c, aVar.f126222c) && f0.g(this.f126223d, aVar.f126223d) && this.f126224e == aVar.f126224e && f0.g(this.f126225f, aVar.f126225f);
        }

        @dl.d
        public final List<b1> f() {
            return this.f126222c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        public int hashCode() {
            int iHashCode = this.f126220a.hashCode() * 31;
            d0 d0Var = this.f126221b;
            int iHashCode2 = (((((iHashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31) + this.f126222c.hashCode()) * 31) + this.f126223d.hashCode()) * 31;
            boolean z10 = this.f126224e;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return ((iHashCode2 + r10) * 31) + this.f126225f.hashCode();
        }

        @dl.d
        public String toString() {
            return "MethodSignatureData(returnType=" + this.f126220a + ", receiverType=" + this.f126221b + ", valueParameters=" + this.f126222c + ", typeParameters=" + this.f126223d + ", hasStableParameterNames=" + this.f126224e + ", errors=" + this.f126225f + ')';
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final List<b1> f126227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f126228b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@dl.d List<? extends b1> descriptors, boolean z10) {
            f0.p(descriptors, "descriptors");
            this.f126227a = descriptors;
            this.f126228b = z10;
        }

        @dl.d
        public final List<b1> a() {
            return this.f126227a;
        }

        public final boolean b() {
            return this.f126228b;
        }
    }

    public LazyJavaScope(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.e LazyJavaScope lazyJavaScope) {
        f0.p(c10, "c");
        this.f126209b = c10;
        this.f126210c = lazyJavaScope;
        this.f126211d = c10.e().i(new yh.a<Collection<? extends k>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$allDescriptors$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<k> invoke() {
                return this.f126226b.n(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127625o, MemberScope.f127583a.a());
            }
        }, CollectionsKt__CollectionsKt.E());
        this.f126212e = c10.e().c(new yh.a<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredMemberIndex$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                return this.f126232b.q();
            }
        });
        this.f126213f = c10.e().a(new l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredFunctions$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<s0> invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
                f0.p(name, "name");
                if (this.f126231b.C() != null) {
                    return (Collection) this.f126231b.C().f126213f.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                for (r rVar : this.f126231b.z().invoke().e(name)) {
                    JavaMethodDescriptor javaMethodDescriptorJ = this.f126231b.J(rVar);
                    if (this.f126231b.H(javaMethodDescriptorJ)) {
                        this.f126231b.x().a().h().c(rVar, javaMethodDescriptorJ);
                        arrayList.add(javaMethodDescriptorJ);
                    }
                }
                this.f126231b.p(arrayList, name);
                return arrayList;
            }
        });
        this.f126214g = c10.e().h(new l<kotlin.reflect.jvm.internal.impl.name.f, o0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredField$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
                f0.p(name, "name");
                if (this.f126230b.C() != null) {
                    return (o0) this.f126230b.C().f126214g.invoke(name);
                }
                mi.n nVarC = this.f126230b.z().invoke().c(name);
                if (nVarC == null || nVarC.N()) {
                    return null;
                }
                return this.f126230b.K(nVarC);
            }
        });
        this.f126215h = c10.e().a(new l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functions$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<s0> invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
                f0.p(name, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) this.f126234b.f126213f.invoke(name));
                this.f126234b.M(linkedHashSet);
                this.f126234b.s(linkedHashSet, name);
                return CollectionsKt___CollectionsKt.Q5(this.f126234b.x().a().r().g(this.f126234b.x(), linkedHashSet));
            }
        });
        this.f126216i = c10.e().c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return this.f126233b.o(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127632v, null);
            }
        });
        this.f126217j = c10.e().c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$propertyNamesLazy$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return this.f126236b.u(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127633w, null);
            }
        });
        this.f126218k = c10.e().c(new yh.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$classNamesLazy$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return this.f126229b.m(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127630t, null);
            }
        });
        this.f126219l = c10.e().a(new l<kotlin.reflect.jvm.internal.impl.name.f, List<? extends o0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$properties$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<o0> invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
                f0.p(name, "name");
                ArrayList arrayList = new ArrayList();
                kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, this.f126235b.f126214g.invoke(name));
                this.f126235b.t(name, arrayList);
                return kotlin.reflect.jvm.internal.impl.resolve.d.t(this.f126235b.D()) ? CollectionsKt___CollectionsKt.Q5(arrayList) : CollectionsKt___CollectionsKt.Q5(this.f126235b.x().a().r().g(this.f126235b.x(), arrayList));
            }
        });
    }

    public /* synthetic */ LazyJavaScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, LazyJavaScope lazyJavaScope, int i10, u uVar) {
        this(dVar, (i10 & 2) != 0 ? null : lazyJavaScope);
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> B() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f126216i, this, f126208m[0]);
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> E() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f126217j, this, f126208m[1]);
    }

    private final d0 F(mi.n nVar) {
        d0 d0VarO = this.f126209b.g().o(nVar.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, false, false, null, 7, null));
        if (!((kotlin.reflect.jvm.internal.impl.builtins.g.r0(d0VarO) || kotlin.reflect.jvm.internal.impl.builtins.g.u0(d0VarO)) && G(nVar) && nVar.F())) {
            return d0VarO;
        }
        d0 d0VarN = i1.n(d0VarO);
        f0.o(d0VarN, "makeNotNullable(propertyType)");
        return d0VarN;
    }

    private final boolean G(mi.n nVar) {
        return nVar.isFinal() && nVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final o0 K(final mi.n nVar) {
        final z zVarV = v(nVar);
        zVarV.X0(null, null, null, null);
        zVarV.d1(F(nVar), CollectionsKt__CollectionsKt.E(), A(), null, CollectionsKt__CollectionsKt.E());
        if (kotlin.reflect.jvm.internal.impl.resolve.d.K(zVarV, zVarV.getType())) {
            zVarV.N0(new yh.a<i<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
                    m mVarE = this.f126237b.x().e();
                    final LazyJavaScope lazyJavaScope = this.f126237b;
                    final mi.n nVar2 = nVar;
                    final z zVar = zVarV;
                    return mVarE.b(new yh.a<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.e
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> invoke() {
                            return lazyJavaScope.x().a().g().a(nVar2, zVar);
                        }
                    });
                }
            });
        }
        this.f126209b.a().h().a(nVar, zVarV);
        return zVarV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Set<s0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = t.c((s0) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends s0> collectionA = OverridingUtilsKt.a(list, new l<s0, kotlin.reflect.jvm.internal.impl.descriptors.a>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1
                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(@dl.d s0 selectMostSpecificInEachOverridableGroup) {
                        f0.p(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                        return selectMostSpecificInEachOverridableGroup;
                    }
                });
                set.removeAll(list);
                set.addAll(collectionA);
            }
        }
    }

    private final z v(mi.n nVar) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVarH1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.h1(D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(this.f126209b, nVar), Modality.FINAL, x.d(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f126209b.a().t().a(nVar), G(nVar));
        f0.o(eVarH1, "create(\n            owne…d.isFinalStatic\n        )");
        return eVarH1;
    }

    private final Set<kotlin.reflect.jvm.internal.impl.name.f> y() {
        return (Set) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f126218k, this, f126208m[2]);
    }

    @dl.e
    protected abstract r0 A();

    @dl.e
    protected final LazyJavaScope C() {
        return this.f126210c;
    }

    @dl.d
    protected abstract k D();

    protected boolean H(@dl.d JavaMethodDescriptor javaMethodDescriptor) {
        f0.p(javaMethodDescriptor, "<this>");
        return true;
    }

    @dl.d
    protected abstract a I(@dl.d r rVar, @dl.d List<? extends y0> list, @dl.d d0 d0Var, @dl.d List<? extends b1> list2);

    @dl.d
    protected final JavaMethodDescriptor J(@dl.d r method) {
        f0.p(method, "method");
        JavaMethodDescriptor javaMethodDescriptorQ1 = JavaMethodDescriptor.q1(D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(this.f126209b, method), method.getName(), this.f126209b.a().t().a(method), this.f126212e.invoke().f(method.getName()) != null && method.i().isEmpty());
        f0.o(javaMethodDescriptorQ1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVarF = ContextKt.f(this.f126209b, javaMethodDescriptorQ1, method, 0, 4, null);
        List<y> typeParameters = method.getTypeParameters();
        List<? extends y0> arrayList = new ArrayList<>(kotlin.collections.t.Y(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            y0 y0VarA = dVarF.f().a((y) it.next());
            f0.m(y0VarA);
            arrayList.add(y0VarA);
        }
        b bVarL = L(dVarF, javaMethodDescriptorQ1, method.i());
        a aVarI = I(method, arrayList, r(method, dVarF), bVarL.a());
        d0 d0VarC = aVarI.c();
        javaMethodDescriptorQ1.p1(d0VarC != null ? kotlin.reflect.jvm.internal.impl.resolve.c.i(javaMethodDescriptorQ1, d0VarC, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b()) : null, A(), CollectionsKt__CollectionsKt.E(), aVarI.e(), aVarI.f(), aVarI.d(), Modality.Companion.a(false, method.isAbstract(), !method.isFinal()), x.d(method.getVisibility()), aVarI.c() != null ? kotlin.collections.r0.k(c1.a(JavaMethodDescriptor.H, CollectionsKt___CollectionsKt.w2(bVarL.a()))) : kotlin.collections.s0.z());
        javaMethodDescriptorQ1.t1(aVarI.b(), bVarL.b());
        if (!aVarI.a().isEmpty()) {
            dVarF.a().s().a(javaMethodDescriptorQ1, aVarI.a());
        }
        return javaMethodDescriptorQ1;
    }

    @dl.d
    protected final b L(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, @dl.d w function, @dl.d List<? extends b0> jValueParameters) {
        Pair pairA;
        kotlin.reflect.jvm.internal.impl.name.f name;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10 = dVar;
        f0.p(c10, "c");
        f0.p(function, "function");
        f0.p(jValueParameters, "jValueParameters");
        Iterable<h0> iterableC6 = CollectionsKt___CollectionsKt.c6(jValueParameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(iterableC6, 10));
        boolean z10 = false;
        for (h0 h0Var : iterableC6) {
            int iA = h0Var.a();
            b0 b0Var = (b0) h0Var.b();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(c10, b0Var);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarB = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, false, false, null, 7, null);
            if (b0Var.c()) {
                mi.x type = b0Var.getType();
                mi.f fVar = type instanceof mi.f ? (mi.f) type : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + b0Var);
                }
                d0 d0VarK = dVar.g().k(fVar, aVarB, true);
                pairA = c1.a(d0VarK, dVar.d().t().k(d0VarK));
            } else {
                pairA = c1.a(dVar.g().o(b0Var.getType(), aVarB), null);
            }
            d0 d0Var = (d0) pairA.a();
            d0 d0Var2 = (d0) pairA.b();
            if (f0.g(function.getName().b(), "equals") && jValueParameters.size() == 1 && f0.g(dVar.d().t().I(), d0Var)) {
                name = kotlin.reflect.jvm.internal.impl.name.f.f("other");
            } else {
                name = b0Var.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(iA);
                    name = kotlin.reflect.jvm.internal.impl.name.f.f(sb2.toString());
                    f0.o(name, "identifier(\"p$index\")");
                }
            }
            kotlin.reflect.jvm.internal.impl.name.f fVar2 = name;
            f0.o(fVar2, "if (function.name.asStri…(\"p$index\")\n            }");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(function, null, iA, eVarA, fVar2, d0Var, false, false, false, d0Var2, dVar.a().t().a(b0Var)));
            arrayList = arrayList2;
            z10 = z10;
            c10 = dVar;
        }
        return new b(CollectionsKt___CollectionsKt.Q5(arrayList), z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return !b().contains(name) ? CollectionsKt__CollectionsKt.E() : this.f126215h.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return B();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return !d().contains(name) ? CollectionsKt__CollectionsKt.E() : this.f126219l.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        return this.f126211d.invoke();
    }

    @dl.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> m(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @dl.e l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @dl.d
    protected final List<k> n(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.c())) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : m(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(linkedHashSet, h(fVar, noLookupLocation));
                }
            }
        }
        if (kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.d()) && !kindFilter.l().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.f127610a)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : o(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, noLookupLocation));
                }
            }
        }
        if (kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.i()) && !kindFilter.l().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.c.a.f127610a)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar3 : u(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar3).booleanValue()) {
                    linkedHashSet.addAll(c(fVar3, noLookupLocation));
                }
            }
        }
        return CollectionsKt___CollectionsKt.Q5(linkedHashSet);
    }

    @dl.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> o(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @dl.e l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    protected void p(@dl.d Collection<s0> result, @dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(result, "result");
        f0.p(name, "name");
    }

    @dl.d
    protected abstract kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a q();

    @dl.d
    protected final d0 r(@dl.d r method, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10) {
        f0.p(method, "method");
        f0.p(c10, "c");
        return c10.g().o(method.getReturnType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, method.H().s(), false, null, 6, null));
    }

    protected abstract void s(@dl.d Collection<s0> collection, @dl.d kotlin.reflect.jvm.internal.impl.name.f fVar);

    protected abstract void t(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Collection<o0> collection);

    @dl.d
    public String toString() {
        return "Lazy scope for " + D();
    }

    @dl.d
    protected abstract Set<kotlin.reflect.jvm.internal.impl.name.f> u(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @dl.e l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @dl.d
    protected final h<Collection<k>> w() {
        return this.f126211d;
    }

    @dl.d
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.d x() {
        return this.f126209b;
    }

    @dl.d
    protected final h<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a> z() {
        return this.f126212e;
    }
}
