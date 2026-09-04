package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;

/* JADX INFO: compiled from: SubpackagesScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e0 extends kotlin.reflect.jvm.internal.impl.resolve.scopes.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.d0 f125699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c f125700c;

    public e0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 moduleDescriptor, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.jvm.internal.f0.p(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        this.f125699b = moduleDescriptor;
        this.f125700c = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return d1.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        kotlin.jvm.internal.f0.p(kindFilter, "kindFilter");
        kotlin.jvm.internal.f0.p(nameFilter, "nameFilter");
        if (!kindFilter.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127613c.f())) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (this.f125700c.d() && kindFilter.l().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.c.b.f127612a)) {
            return CollectionsKt__CollectionsKt.E();
        }
        Collection<kotlin.reflect.jvm.internal.impl.name.c> collectionP = this.f125699b.p(this.f125700c, nameFilter);
        ArrayList arrayList = new ArrayList(collectionP.size());
        Iterator<kotlin.reflect.jvm.internal.impl.name.c> it = collectionP.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.f fVarG = it.next().g();
            kotlin.jvm.internal.f0.o(fVarG, "subFqName.shortName()");
            if (nameFilter.invoke(fVarG).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, i(fVarG));
            }
        }
        return arrayList;
    }

    @dl.e
    protected final k0 i(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        kotlin.jvm.internal.f0.p(name, "name");
        if (name.g()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d0 d0Var = this.f125699b;
        kotlin.reflect.jvm.internal.impl.name.c cVarC = this.f125700c.c(name);
        kotlin.jvm.internal.f0.o(cVarC, "fqName.child(name)");
        k0 k0VarR = d0Var.R(cVarC);
        if (k0VarR.isEmpty()) {
            return null;
        }
        return k0VarR;
    }

    @dl.d
    public String toString() {
        return "subpackages of " + this.f125700c + " from " + this.f125699b;
    }
}
