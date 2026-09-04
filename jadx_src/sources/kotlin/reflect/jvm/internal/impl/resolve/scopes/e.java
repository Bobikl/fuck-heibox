package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import yh.l;

/* JADX INFO: compiled from: InnerClassesScopeWrapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final MemberScope f127641b;

    public e(@dl.d MemberScope workerScope) {
        f0.p(workerScope, "workerScope");
        this.f127641b = workerScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f127641b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return this.f127641b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        this.f127641b.e(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return this.f127641b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = this.f127641b.h(name, location);
        if (fVarH == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarH : null;
        if (dVar != null) {
            return dVar;
        }
        if (fVarH instanceof x0) {
            return (x0) fVarH;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.f> g(@dl.d d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        d dVarN = kindFilter.n(d.f127613c.c());
        if (dVarN == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        Collection<k> collectionG = this.f127641b.g(dVarN, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionG) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @dl.d
    public String toString() {
        return "Classes from " + this.f127641b;
    }
}
