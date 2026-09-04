package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import dl.d;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.n;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.storage.m;
import yh.l;

/* JADX INFO: compiled from: BuiltInsLoaderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final c f127721b = new c();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    @d
    public h0 a(@d m storageManager, @d d0 builtInsModule, @d Iterable<? extends gi.b> classDescriptorFactories, @d gi.c platformDependentDeclarationFilter, @d gi.a additionalClassPartsProvider, boolean z10) {
        f0.p(storageManager, "storageManager");
        f0.p(builtInsModule, "builtInsModule");
        f0.p(classDescriptorFactories, "classDescriptorFactories");
        f0.p(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        f0.p(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, h.A, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z10, new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f127721b));
    }

    @d
    public final h0 b(@d m storageManager, @d d0 module, @d Set<kotlin.reflect.jvm.internal.impl.name.c> packageFqNames, @d Iterable<? extends gi.b> classDescriptorFactories, @d gi.c platformDependentDeclarationFilter, @d gi.a additionalClassPartsProvider, boolean z10, @d l<? super String, ? extends InputStream> loadResource) {
        f0.p(storageManager, "storageManager");
        f0.p(module, "module");
        f0.p(packageFqNames, "packageFqNames");
        f0.p(classDescriptorFactories, "classDescriptorFactories");
        f0.p(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        f0.p(additionalClassPartsProvider, "additionalClassPartsProvider");
        f0.p(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList(t.Y(packageFqNames, 10));
        for (kotlin.reflect.jvm.internal.impl.name.c cVar : packageFqNames) {
            String strN = a.f127722n.n(cVar);
            InputStream inputStreamInvoke = loadResource.invoke(strN);
            if (inputStreamInvoke == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strN);
            }
            arrayList.add(b.f127723p.a(cVar, storageManager, module, inputStreamInvoke, z10));
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager, module);
        i.a aVar = i.a.f127875a;
        k kVar = new k(packageFragmentProviderImpl);
        a aVar2 = a.f127722n;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.b(module, notFoundClasses, aVar2);
        q.a aVar3 = q.a.f127893a;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.m DO_NOTHING = kotlin.reflect.jvm.internal.impl.serialization.deserialization.m.f127887a;
        f0.o(DO_NOTHING, "DO_NOTHING");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.h hVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.h(storageManager, module, aVar, kVar, bVar, packageFragmentProviderImpl, aVar3, DO_NOTHING, ki.c.a.f124469a, n.a.f127888a, classDescriptorFactories, notFoundClasses, g.f127851a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, aVar2.e(), null, new pi.b(storageManager, CollectionsKt__CollectionsKt.E()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).M0(hVar);
        }
        return packageFragmentProviderImpl;
    }
}
