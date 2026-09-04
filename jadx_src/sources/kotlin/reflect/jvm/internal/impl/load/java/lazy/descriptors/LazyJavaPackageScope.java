package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.load.java.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.name.h;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import mi.u;
import yh.l;

/* JADX INFO: compiled from: LazyJavaPackageScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaPackageScope extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final u f126195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final LazyJavaPackageFragment f126196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final i<Set<String>> f126197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final g<a, kotlin.reflect.jvm.internal.impl.descriptors.d> f126198q;

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final f f126199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final mi.g f126200b;

        public a(@dl.d f name, @dl.e mi.g gVar) {
            f0.p(name, "name");
            this.f126199a = name;
            this.f126200b = gVar;
        }

        @dl.e
        public final mi.g a() {
            return this.f126200b;
        }

        @dl.d
        public final f b() {
            return this.f126199a;
        }

        public boolean equals(@dl.e Object obj) {
            return (obj instanceof a) && f0.g(this.f126199a, ((a) obj).f126199a);
        }

        public int hashCode() {
            return this.f126199a.hashCode();
        }
    }

    /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
    public static abstract class b {

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final kotlin.reflect.jvm.internal.impl.descriptors.d f126201a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d descriptor) {
                super(null);
                f0.p(descriptor, "descriptor");
                this.f126201a = descriptor;
            }

            @dl.d
            public final kotlin.reflect.jvm.internal.impl.descriptors.d a() {
                return this.f126201a;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class C1152b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final C1152b f126202a = new C1152b();

            private C1152b() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: LazyJavaPackageScope.kt */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            public static final c f126203a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(@dl.d final kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d u jPackage, @dl.d LazyJavaPackageFragment ownerDescriptor) {
        super(c10);
        f0.p(c10, "c");
        f0.p(jPackage, "jPackage");
        f0.p(ownerDescriptor, "ownerDescriptor");
        this.f126195n = jPackage;
        this.f126196o = ownerDescriptor;
        this.f126197p = c10.e().b(new yh.a<Set<? extends String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$knownClassNamesInPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<String> invoke() {
                return c10.a().d().a(this.D().e());
            }
        });
        this.f126198q = c10.e().h(new l<a, kotlin.reflect.jvm.internal.impl.descriptors.d>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$classes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.d invoke(@dl.d LazyJavaPackageScope.a request) {
                byte[] bArrB;
                f0.p(request, "request");
                kotlin.reflect.jvm.internal.impl.name.b bVar = new kotlin.reflect.jvm.internal.impl.name.b(this.f126204b.D().e(), request.b());
                m.a aVarA = request.a() != null ? c10.a().j().a(request.a()) : c10.a().j().c(bVar);
                o oVarA = aVarA != null ? aVarA.a() : null;
                kotlin.reflect.jvm.internal.impl.name.b bVarF = oVarA != null ? oVarA.f() : null;
                if (bVarF != null && (bVarF.l() || bVarF.k())) {
                    return null;
                }
                LazyJavaPackageScope.b bVarS = this.f126204b.S(oVarA);
                if (bVarS instanceof LazyJavaPackageScope.b.a) {
                    return ((LazyJavaPackageScope.b.a) bVarS).a();
                }
                if (bVarS instanceof LazyJavaPackageScope.b.c) {
                    return null;
                }
                if (!(bVarS instanceof LazyJavaPackageScope.b.C1152b)) {
                    throw new NoWhenBranchMatchedException();
                }
                mi.g gVarA = request.a();
                if (gVarA == null) {
                    j jVarD = c10.a().d();
                    if (aVarA == null) {
                        bArrB = null;
                    } else {
                        if (!(aVarA instanceof m.a.C1165a)) {
                            aVarA = null;
                        }
                        m.a.C1165a c1165a = (m.a.C1165a) aVarA;
                        if (c1165a != null) {
                            bArrB = c1165a.b();
                        } else {
                            bArrB = null;
                        }
                    }
                    gVarA = jVarD.b(new j.a(bVar, bArrB, null, 4, null));
                }
                mi.g gVar = gVarA;
                if ((gVar != null ? gVar.E() : null) != LightClassOriginKind.BINARY) {
                    kotlin.reflect.jvm.internal.impl.name.c cVarE = gVar != null ? gVar.e() : null;
                    if (cVarE == null || cVarE.d() || !f0.g(cVarE.e(), this.f126204b.D().e())) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(c10, this.f126204b.D(), gVar, null, 8, null);
                    c10.a().e().a(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + n.b(c10.a().j(), gVar) + "\nfindKotlinClass(ClassId) = " + n.a(c10.a().j(), bVar) + '\n');
            }
        });
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d O(f fVar, mi.g gVar) {
        if (!h.f127209a.a(fVar)) {
            return null;
        }
        Set<String> setInvoke = this.f126197p.invoke();
        if (gVar != null || setInvoke == null || setInvoke.contains(fVar.b())) {
            return this.f126198q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b S(o oVar) {
        if (oVar == null) {
            return b.C1152b.f126202a;
        }
        if (oVar.h().c() != KotlinClassHeader.Kind.CLASS) {
            return b.c.f126203a;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarK = x().a().b().k(oVar);
        return dVarK != null ? new b.a(dVarK) : b.C1152b.f126202a;
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.d P(@dl.d mi.g javaClass) {
        f0.p(javaClass, "javaClass");
        return O(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d h(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return O(name, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public LazyJavaPackageFragment D() {
        return this.f126196o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return CollectionsKt__CollectionsKt.E();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d l<? super f, Boolean> nameFilter) {
        boolean z10;
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c;
        if (!kindFilter.a(aVar.e() | aVar.c())) {
            return CollectionsKt__CollectionsKt.E();
        }
        Collection<k> collectionInvoke = w().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            k kVar = (k) obj;
            if (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                f name = ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar).getName();
                f0.o(name, "it.name");
                if (nameFilter.invoke(name).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected Set<f> m(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        if (!kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.e())) {
            return d1.k();
        }
        Set<String> setInvoke = this.f126197p.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(f.f((String) it.next()));
            }
            return hashSet;
        }
        u uVar = this.f126195n;
        if (lVar == null) {
            lVar = FunctionsKt.a();
        }
        Collection<mi.g> collectionG = uVar.G(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (mi.g gVar : collectionG) {
            f name = gVar.E() == LightClassOriginKind.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected Set<f> o(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        return d1.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a q() {
        return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a.C1153a.f126253a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void s(@dl.d Collection<s0> result, @dl.d f name) {
        f0.p(result, "result");
        f0.p(name, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected Set<f> u(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        return d1.k();
    }
}
