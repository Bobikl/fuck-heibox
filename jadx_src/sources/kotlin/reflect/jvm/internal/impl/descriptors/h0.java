package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface h0 {
    @dl.d
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    List<g0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    @dl.d
    Collection<kotlin.reflect.jvm.internal.impl.name.c> p(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);
}
