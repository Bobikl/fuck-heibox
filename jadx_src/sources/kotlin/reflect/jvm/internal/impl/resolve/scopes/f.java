package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import yh.l;

/* JADX INFO: compiled from: MemberScopeImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<? extends s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        Collection<k> collectionG = g(d.f127632v, FunctionsKt.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof s0) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((s0) obj).getName();
                f0.o(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<? extends o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        Collection<k> collectionG = g(d.f127633w, FunctionsKt.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof s0) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((s0) obj).getName();
                f0.o(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar) {
        MemberScope.a.a(this, fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return null;
    }
}
