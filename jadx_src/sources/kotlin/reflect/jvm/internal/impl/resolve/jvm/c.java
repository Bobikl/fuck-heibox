package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mi.g;

/* JADX INFO: compiled from: JavaDescriptorResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final LazyJavaPackageFragmentProvider f127567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.load.java.components.d f127568b;

    public c(@dl.d LazyJavaPackageFragmentProvider packageFragmentProvider, @dl.d kotlin.reflect.jvm.internal.impl.load.java.components.d javaResolverCache) {
        f0.p(packageFragmentProvider, "packageFragmentProvider");
        f0.p(javaResolverCache, "javaResolverCache");
        this.f127567a = packageFragmentProvider;
        this.f127568b = javaResolverCache;
    }

    @dl.d
    public final LazyJavaPackageFragmentProvider a() {
        return this.f127567a;
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.d b(@dl.d g javaClass) {
        f0.p(javaClass, "javaClass");
        kotlin.reflect.jvm.internal.impl.name.c cVarE = javaClass.e();
        if (cVarE != null && javaClass.E() == LightClassOriginKind.SOURCE) {
            return this.f127568b.d(cVarE);
        }
        g gVarQ = javaClass.q();
        if (gVarQ != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarB = b(gVarQ);
            MemberScope memberScopeL = dVarB != null ? dVarB.L() : null;
            f fVarH = memberScopeL != null ? memberScopeL.h(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
            if (fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarH;
            }
            return null;
        }
        if (cVarE == null) {
            return null;
        }
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = this.f127567a;
        kotlin.reflect.jvm.internal.impl.name.c cVarE2 = cVarE.e();
        f0.o(cVarE2, "fqName.parent()");
        LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt___CollectionsKt.B2(lazyJavaPackageFragmentProvider.a(cVarE2));
        if (lazyJavaPackageFragment != null) {
            return lazyJavaPackageFragment.M0(javaClass);
        }
        return null;
    }
}
