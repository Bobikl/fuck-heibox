package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;

/* JADX INFO: compiled from: CompositePackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<kotlin.reflect.jvm.internal.impl.descriptors.h0> f125714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f125715b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@dl.d List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h0> providers, @dl.d String debugName) {
        kotlin.jvm.internal.f0.p(providers, "providers");
        kotlin.jvm.internal.f0.p(debugName, "debugName");
        this.f125714a = providers;
        this.f125715b = debugName;
        providers.size();
        CollectionsKt___CollectionsKt.V5(providers).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @dl.d
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<kotlin.reflect.jvm.internal.impl.descriptors.g0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.h0> it = this.f125714a.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.i0.a(it.next(), fqName, arrayList);
        }
        return CollectionsKt___CollectionsKt.Q5(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    public void b(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d Collection<kotlin.reflect.jvm.internal.impl.descriptors.g0> packageFragments) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        kotlin.jvm.internal.f0.p(packageFragments, "packageFragments");
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.h0> it = this.f125714a.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.i0.a(it.next(), fqName, packageFragments);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    public boolean c(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        List<kotlin.reflect.jvm.internal.impl.descriptors.h0> list = this.f125714a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!kotlin.reflect.jvm.internal.impl.descriptors.i0.b((kotlin.reflect.jvm.internal.impl.descriptors.h0) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> p(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        kotlin.jvm.internal.f0.p(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.h0> it = this.f125714a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().p(fqName, nameFilter));
        }
        return hashSet;
    }

    @dl.d
    public String toString() {
        return this.f125715b;
    }
}
