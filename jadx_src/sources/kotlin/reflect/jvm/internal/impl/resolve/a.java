package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: SealedClassInheritorsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f127506a = new a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class C1175a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.g.l(DescriptorUtilsKt.l((kotlin.reflect.jvm.internal.impl.descriptors.d) t10).b(), DescriptorUtilsKt.l((kotlin.reflect.jvm.internal.impl.descriptors.d) t11).b());
        }
    }

    private a() {
    }

    private static final void b(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.d> linkedHashSet, MemberScope memberScope, boolean z10) {
        for (kotlin.reflect.jvm.internal.impl.descriptors.k kVar : kotlin.reflect.jvm.internal.impl.resolve.scopes.h.a.a(memberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f127630t, null, 2, null)) {
            if (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = (kotlin.reflect.jvm.internal.impl.descriptors.d) kVar;
                if (dVarO.w0()) {
                    kotlin.reflect.jvm.internal.impl.name.f name = dVarO.getName();
                    f0.o(name, "descriptor.name");
                    kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = memberScope.h(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    dVarO = fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarH : fVarH instanceof x0 ? ((x0) fVarH).o() : null;
                }
                if (dVarO != null) {
                    if (d.z(dVarO, dVar)) {
                        linkedHashSet.add(dVarO);
                    }
                    if (z10) {
                        MemberScope memberScopeL = dVarO.L();
                        f0.o(memberScopeL, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        b(dVar, linkedHashSet, memberScopeL, z10);
                    }
                }
            }
        }
    }

    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d sealedClass, boolean z10) {
        kotlin.reflect.jvm.internal.impl.descriptors.k next;
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC;
        f0.p(sealedClass, "sealedClass");
        if (sealedClass.l() != Modality.SEALED) {
            return CollectionsKt__CollectionsKt.E();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.k> it = DescriptorUtilsKt.q(sealedClass).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof g0));
            kVarC = next;
        } else {
            kVarC = sealedClass.c();
        }
        if (kVarC instanceof g0) {
            b(sealedClass, linkedHashSet, ((g0) kVarC).u(), z10);
        }
        MemberScope memberScopeL = sealedClass.L();
        f0.o(memberScopeL, "sealedClass.unsubstitutedInnerClassesScope");
        b(sealedClass, linkedHashSet, memberScopeL, true);
        return CollectionsKt___CollectionsKt.p5(linkedHashSet, new C1175a());
    }
}
