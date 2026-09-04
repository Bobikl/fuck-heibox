package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: PackageFragmentProviderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PackageFragmentProviderImpl implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Collection<g0> f125568a;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(@dl.d Collection<? extends g0> packageFragments) {
        kotlin.jvm.internal.f0.p(packageFragments, "packageFragments");
        this.f125568a = packageFragments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @dl.d
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<g0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        Collection<g0> collection = this.f125568a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.jvm.internal.f0.g(((g0) obj).e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    public void b(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d Collection<g0> packageFragments) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        kotlin.jvm.internal.f0.p(packageFragments, "packageFragments");
        for (Object obj : this.f125568a) {
            if (kotlin.jvm.internal.f0.g(((g0) obj).e(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    public boolean c(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        Collection<g0> collection = this.f125568a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.f0.g(((g0) it.next()).e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> p(@dl.d final kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        kotlin.jvm.internal.f0.p(nameFilter, "nameFilter");
        return SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.p0(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(this.f125568a), new yh.l<g0, kotlin.reflect.jvm.internal.impl.name.c>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.name.c invoke(@dl.d g0 it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it.e();
            }
        }), new yh.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$2
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.c it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.valueOf(!it.d() && kotlin.jvm.internal.f0.g(it.e(), fqName));
            }
        }));
    }
}
