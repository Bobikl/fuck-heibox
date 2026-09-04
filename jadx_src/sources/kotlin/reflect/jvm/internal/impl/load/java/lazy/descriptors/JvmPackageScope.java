package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.d1;
import kotlin.collections.x;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.g;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.n;
import mi.u;

/* JADX INFO: compiled from: JvmPackageScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JvmPackageScope implements MemberScope {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f126121f = {n0.u(new PropertyReference1Impl(n0.d(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d f126122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final LazyJavaPackageFragment f126123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final LazyJavaPackageScope f126124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final h f126125e;

    public JvmPackageScope(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d u jPackage, @dl.d LazyJavaPackageFragment packageFragment) {
        f0.p(c10, "c");
        f0.p(jPackage, "jPackage");
        f0.p(packageFragment, "packageFragment");
        this.f126122b = c10;
        this.f126123c = packageFragment;
        this.f126124d = new LazyJavaPackageScope(c10, jPackage, packageFragment);
        this.f126125e = c10.e().c(new yh.a<MemberScope[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$kotlinScopes$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MemberScope[] invoke() {
                Collection<o> collectionValues = this.f126126b.f126123c.N0().values();
                JvmPackageScope jvmPackageScope = this.f126126b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    MemberScope memberScopeB = jvmPackageScope.f126122b.a().b().b(jvmPackageScope.f126123c, (o) it.next());
                    if (memberScopeB != null) {
                        arrayList.add(memberScopeB);
                    }
                }
                return (MemberScope[]) ui.a.b(arrayList).toArray(new MemberScope[0]);
            }
        });
    }

    private final MemberScope[] l() {
        return (MemberScope[]) l.a(this.f126125e, this, f126121f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<s0> a(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        e(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f126124d;
        MemberScope[] memberScopeArrL = l();
        Collection<? extends s0> collectionA = lazyJavaPackageScope.a(name, location);
        int length = memberScopeArrL.length;
        int i10 = 0;
        Collection collection = collectionA;
        while (i10 < length) {
            Collection collectionA2 = ui.a.a(collection, memberScopeArrL[i10].a(name, location));
            i10++;
            collection = collectionA2;
        }
        return collection == null ? d1.k() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<f> b() {
        MemberScope[] memberScopeArrL = l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrL) {
            x.n0(linkedHashSet, memberScope.b());
        }
        linkedHashSet.addAll(this.f126124d.b());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        e(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f126124d;
        MemberScope[] memberScopeArrL = l();
        Collection<? extends o0> collectionC = lazyJavaPackageScope.c(name, location);
        int length = memberScopeArrL.length;
        int i10 = 0;
        Collection collection = collectionC;
        while (i10 < length) {
            Collection collectionA = ui.a.a(collection, memberScopeArrL[i10].c(name, location));
            i10++;
            collection = collectionA;
        }
        return collection == null ? d1.k() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<f> d() {
        MemberScope[] memberScopeArrL = l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrL) {
            x.n0(linkedHashSet, memberScope.d());
        }
        linkedHashSet.addAll(this.f126124d.d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        ji.a.b(this.f126122b.a().l(), location, this.f126123c, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.e
    public Set<f> f() {
        Set<f> setA = g.a(ArraysKt___ArraysKt.c6(l()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f126124d.f());
        return setA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d yh.l<? super f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        LazyJavaPackageScope lazyJavaPackageScope = this.f126124d;
        MemberScope[] memberScopeArrL = l();
        Collection<k> collectionG = lazyJavaPackageScope.g(kindFilter, nameFilter);
        for (MemberScope memberScope : memberScopeArrL) {
            collectionG = ui.a.a(collectionG, memberScope.g(kindFilter, nameFilter));
        }
        return collectionG == null ? d1.k() : collectionG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        e(name, location);
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarQ = this.f126124d.h(name, location);
        if (dVarQ != null) {
            return dVarQ;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = null;
        for (MemberScope memberScope : l()) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = memberScope.h(name, location);
            if (fVarH != null) {
                if (!(fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) || !((kotlin.reflect.jvm.internal.impl.descriptors.g) fVarH).w0()) {
                    return fVarH;
                }
                if (fVar == null) {
                    fVar = fVarH;
                }
            }
        }
        return fVar;
    }

    @dl.d
    public final LazyJavaPackageScope k() {
        return this.f126124d;
    }

    @dl.d
    public String toString() {
        return "scope for " + this.f126123c;
    }
}
