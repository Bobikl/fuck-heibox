package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.c0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.load.java.i;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import mi.u;
import yh.l;

/* JADX INFO: compiled from: LazyJavaPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaPackageFragmentProvider implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d f126072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, LazyJavaPackageFragment> f126073b;

    public LazyJavaPackageFragmentProvider(@dl.d a components) {
        f0.p(components, "components");
        d dVar = new d(components, g.a.f126258a, c0.e(null));
        this.f126072a = dVar;
        this.f126073b = dVar.e().e();
    }

    private final LazyJavaPackageFragment e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        final u uVarA = i.a(this.f126072a.a().d(), cVar, false, 2, null);
        if (uVarA == null) {
            return null;
        }
        return this.f126073b.a(cVar, new yh.a<LazyJavaPackageFragment>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$getPackageFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LazyJavaPackageFragment invoke() {
                return new LazyJavaPackageFragment(this.f126074b.f126072a, uVarA);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @dl.d
    @k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<LazyJavaPackageFragment> a(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return CollectionsKt__CollectionsKt.M(e(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    public void b(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d Collection<g0> packageFragments) {
        f0.p(fqName, "fqName");
        f0.p(packageFragments, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.a.a(packageFragments, e(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    public boolean c(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return i.a(this.f126072a.a().d(), fqName, false, 2, null) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.name.c> p(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(fqName, "fqName");
        f0.p(nameFilter, "nameFilter");
        LazyJavaPackageFragment lazyJavaPackageFragmentE = e(fqName);
        List<kotlin.reflect.jvm.internal.impl.name.c> listP0 = lazyJavaPackageFragmentE != null ? lazyJavaPackageFragmentE.P0() : null;
        return listP0 == null ? CollectionsKt__CollectionsKt.E() : listP0;
    }

    @dl.d
    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f126072a.a().m();
    }
}
