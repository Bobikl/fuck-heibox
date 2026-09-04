package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.sequences.SequencesKt___SequencesKt;
import mi.g;
import mi.q;
import yh.l;

/* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaStaticClassScope extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final g f126244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.c f126245o;

    /* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
    public static final class a extends kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b<kotlin.reflect.jvm.internal.impl.descriptors.d, b2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f126246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<R> f126247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<MemberScope, Collection<R>> f126248c;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, Set<R> set, l<? super MemberScope, ? extends Collection<? extends R>> lVar) {
            this.f126246a = dVar;
            this.f126247b = set;
            this.f126248c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d current) {
            f0.p(current, "current");
            if (current == this.f126246a) {
                return true;
            }
            MemberScope memberScopeX0 = current.x0();
            f0.o(memberScopeX0, "current.staticScope");
            if (!(memberScopeX0 instanceof d)) {
                return true;
            }
            this.f126247b.addAll((Collection<? extends R>) ((Collection) this.f126248c.invoke(memberScopeX0)));
            return false;
        }

        public void d() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        public /* bridge */ /* synthetic */ Object result() {
            d();
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d g jClass, @dl.d kotlin.reflect.jvm.internal.impl.load.java.descriptors.c ownerDescriptor) {
        super(c10);
        f0.p(c10, "c");
        f0.p(jClass, "jClass");
        f0.p(ownerDescriptor, "ownerDescriptor");
        this.f126244n = jClass;
        this.f126245o = ownerDescriptor;
    }

    private final <R> Set<R> P(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, Set<R> set, l<? super MemberScope, ? extends Collection<? extends R>> lVar) {
        kotlin.reflect.jvm.internal.impl.utils.b.b(s.k(dVar), c.f126254a, new a(dVar, set, lVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable Q(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        Collection<d0> collectionL = dVar.r().l();
        f0.o(collectionL, "it.typeConstructor.supertypes");
        return SequencesKt___SequencesKt.N(SequencesKt___SequencesKt.p1(CollectionsKt___CollectionsKt.v1(collectionL), new l<d0, kotlin.reflect.jvm.internal.impl.descriptors.d>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.d invoke(d0 d0Var) {
                f fVarD = d0Var.O0().d();
                if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                    return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD;
                }
                return null;
            }
        }));
    }

    private final o0 S(o0 o0Var) {
        if (o0Var.b().isReal()) {
            return o0Var;
        }
        Collection<? extends o0> collectionF = o0Var.f();
        f0.o(collectionF, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(t.Y(collectionF, 10));
        for (o0 it : collectionF) {
            f0.o(it, "it");
            arrayList.add(S(it));
        }
        return (o0) CollectionsKt___CollectionsKt.c5(CollectionsKt___CollectionsKt.V1(arrayList));
    }

    private final Set<s0> T(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        LazyJavaStaticClassScope lazyJavaStaticClassScopeB = kotlin.reflect.jvm.internal.impl.load.java.descriptors.g.b(dVar);
        return lazyJavaStaticClassScopeB == null ? d1.k() : CollectionsKt___CollectionsKt.V5(lazyJavaStaticClassScopeB.a(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex q() {
        return new ClassDeclaredMemberIndex(this.f126244n, new l<q, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeMemberIndex$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d q it) {
                f0.p(it, "it");
                return Boolean.valueOf(it.p());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.c D() {
        return this.f126245o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> m(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        return d1.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> o(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        Set<kotlin.reflect.jvm.internal.impl.name.f> setU5 = CollectionsKt___CollectionsKt.U5(z().invoke().a());
        LazyJavaStaticClassScope lazyJavaStaticClassScopeB = kotlin.reflect.jvm.internal.impl.load.java.descriptors.g.b(D());
        Set<kotlin.reflect.jvm.internal.impl.name.f> setB = lazyJavaStaticClassScopeB != null ? lazyJavaStaticClassScopeB.b() : null;
        if (setB == null) {
            setB = d1.k();
        }
        setU5.addAll(setB);
        if (this.f126244n.m()) {
            setU5.addAll(CollectionsKt__CollectionsKt.L(h.f125397f, h.f125395d));
        }
        setU5.addAll(x().a().w().d(x(), D()));
        return setU5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void p(@dl.d Collection<s0> result, @dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(result, "result");
        f0.p(name, "name");
        x().a().w().e(x(), D(), name, result);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void s(@dl.d Collection<s0> result, @dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(result, "result");
        f0.p(name, "name");
        Collection<? extends s0> collectionE = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(name, T(name, D()), result, D(), x().a().c(), x().a().k().b());
        f0.o(collectionE, "resolveOverridesForStati…rridingUtil\n            )");
        result.addAll(collectionE);
        if (this.f126244n.m()) {
            if (f0.g(name, h.f125397f)) {
                s0 s0VarG = kotlin.reflect.jvm.internal.impl.resolve.c.g(D());
                f0.o(s0VarG, "createEnumValueOfMethod(ownerDescriptor)");
                result.add(s0VarG);
            } else if (f0.g(name, h.f125395d)) {
                s0 s0VarH = kotlin.reflect.jvm.internal.impl.resolve.c.h(D());
                f0.o(s0VarH, "createEnumValuesMethod(ownerDescriptor)");
                result.add(s0VarH);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void t(@dl.d final kotlin.reflect.jvm.internal.impl.name.f name, @dl.d Collection<o0> result) {
        f0.p(name, "name");
        f0.p(result, "result");
        Set setP = P(D(), new LinkedHashSet(), new l<MemberScope, Collection<? extends o0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<? extends o0> invoke(@dl.d MemberScope it) {
                f0.p(it, "it");
                return it.c(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            }
        });
        if (!result.isEmpty()) {
            Collection<? extends o0> collectionE = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(name, setP, result, D(), x().a().c(), x().a().k().b());
            f0.o(collectionE, "resolveOverridesForStati…ingUtil\n                )");
            result.addAll(collectionE);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP) {
                o0 o0VarS = S((o0) obj);
                Object arrayList = linkedHashMap.get(o0VarS);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(o0VarS, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE2 = kotlin.reflect.jvm.internal.impl.load.java.components.a.e(name, (Collection) ((Map.Entry) it.next()).getValue(), result, D(), x().a().c(), x().a().k().b());
                f0.o(collectionE2, "resolveOverridesForStati…ingUtil\n                )");
                x.n0(arrayList2, collectionE2);
            }
            result.addAll(arrayList2);
        }
        if (this.f126244n.m() && f0.g(name, h.f125396e)) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(result, kotlin.reflect.jvm.internal.impl.resolve.c.f(D()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected Set<kotlin.reflect.jvm.internal.impl.name.f> u(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        Set<kotlin.reflect.jvm.internal.impl.name.f> setU5 = CollectionsKt___CollectionsKt.U5(z().invoke().d());
        P(D(), setU5, new l<MemberScope, Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computePropertyNames$1$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<kotlin.reflect.jvm.internal.impl.name.f> invoke(@dl.d MemberScope it) {
                f0.p(it, "it");
                return it.d();
            }
        });
        if (this.f126244n.m()) {
            setU5.add(h.f125396e);
        }
        return setU5;
    }
}
