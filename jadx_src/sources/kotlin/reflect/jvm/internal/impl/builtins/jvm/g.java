package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.InputStream;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.n;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.checker.j;

/* JADX INFO: compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends AbstractDeserializedPackageFragmentProvider {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f125547f = new a(null);

    /* JADX INFO: compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@dl.d m storageManager, @dl.d kotlin.reflect.jvm.internal.impl.load.kotlin.m finder, @dl.d d0 moduleDescriptor, @dl.d NotFoundClasses notFoundClasses, @dl.d gi.a additionalClassPartsProvider, @dl.d gi.c platformDependentDeclarationFilter, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.i deserializationConfiguration, @dl.d j kotlinTypeChecker, @dl.d pi.a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        f0.p(storageManager, "storageManager");
        f0.p(finder, "finder");
        f0.p(moduleDescriptor, "moduleDescriptor");
        f0.p(notFoundClasses, "notFoundClasses");
        f0.p(additionalClassPartsProvider, "additionalClassPartsProvider");
        f0.p(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        f0.p(deserializationConfiguration, "deserializationConfiguration");
        f0.p(kotlinTypeChecker, "kotlinTypeChecker");
        f0.p(samConversionResolver, "samConversionResolver");
        k kVar = new k(this);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f127722n;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.b(moduleDescriptor, notFoundClasses, aVar);
        q.a aVar2 = q.a.f127893a;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.m DO_NOTHING = kotlin.reflect.jvm.internal.impl.serialization.deserialization.m.f127887a;
        f0.o(DO_NOTHING, "DO_NOTHING");
        i(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.h(storageManager, moduleDescriptor, deserializationConfiguration, kVar, bVar, this, aVar2, DO_NOTHING, ki.c.a.f124469a, n.a.f127888a, CollectionsKt__CollectionsKt.L(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(storageManager, moduleDescriptor), new JvmBuiltInClassDescriptorFactory(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.g.f127851a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.e(), kotlinTypeChecker, samConversionResolver, null, null, 786432, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    @dl.e
    protected l d(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        InputStream inputStreamB = f().b(fqName);
        if (inputStreamB != null) {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.b.f127723p.a(fqName, h(), g(), inputStreamB, false);
        }
        return null;
    }
}
