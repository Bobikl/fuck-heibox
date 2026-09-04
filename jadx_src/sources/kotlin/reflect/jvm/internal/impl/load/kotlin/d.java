package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f126489b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.h f126490a;

    /* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
        public static final class C1160a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final d f126491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            private final DeserializedDescriptorResolver f126492b;

            public C1160a(@dl.d d deserializationComponentsForJava, @dl.d DeserializedDescriptorResolver deserializedDescriptorResolver) {
                f0.p(deserializationComponentsForJava, "deserializationComponentsForJava");
                f0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f126491a = deserializationComponentsForJava;
                this.f126492b = deserializedDescriptorResolver;
            }

            @dl.d
            public final d a() {
                return this.f126491a;
            }

            @dl.d
            public final DeserializedDescriptorResolver b() {
                return this.f126492b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final C1160a a(@dl.d m kotlinClassFinder, @dl.d m jvmBuiltInsKotlinClassFinder, @dl.d kotlin.reflect.jvm.internal.impl.load.java.j javaClassFinder, @dl.d String moduleName, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.m errorReporter, @dl.d li.b javaSourceElementFactory) {
            f0.p(kotlinClassFinder, "kotlinClassFinder");
            f0.p(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            f0.p(javaClassFinder, "javaClassFinder");
            f0.p(moduleName, "moduleName");
            f0.p(errorReporter, "errorReporter");
            f0.p(javaSourceElementFactory, "javaSourceElementFactory");
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            kotlin.reflect.jvm.internal.impl.name.f fVarI = kotlin.reflect.jvm.internal.impl.name.f.i(kotlin.text.y.f128596e + moduleName + kotlin.text.y.f128597f);
            f0.o(fVarI, "special(\"<$moduleName>\")");
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(fVarI, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.D0(moduleDescriptorImpl);
            jvmBuiltIns.I0(moduleDescriptorImpl, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.f fVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.f();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProviderB = e.b(javaClassFinder, moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, fVar, (512 & 512) != 0 ? u.a.f126560a : null);
            d dVarA = e.a(moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, lazyJavaPackageFragmentProviderB, kotlinClassFinder, deserializedDescriptorResolver, errorReporter);
            deserializedDescriptorResolver.l(dVarA);
            kotlin.reflect.jvm.internal.impl.load.java.components.d EMPTY = kotlin.reflect.jvm.internal.impl.load.java.components.d.f126044a;
            f0.o(EMPTY, "EMPTY");
            kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar = new kotlin.reflect.jvm.internal.impl.resolve.jvm.c(lazyJavaPackageFragmentProviderB, EMPTY);
            fVar.c(cVar);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.g gVar = new kotlin.reflect.jvm.internal.impl.builtins.jvm.g(lockBasedStorageManager, jvmBuiltInsKotlinClassFinder, moduleDescriptorImpl, notFoundClasses, jvmBuiltIns.H0(), jvmBuiltIns.H0(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.a.f127875a, kotlin.reflect.jvm.internal.impl.types.checker.j.f128080b.a(), new pi.b(lockBasedStorageManager, CollectionsKt__CollectionsKt.E()));
            moduleDescriptorImpl.Z0(moduleDescriptorImpl);
            moduleDescriptorImpl.T0(new kotlin.reflect.jvm.internal.impl.descriptors.impl.h(CollectionsKt__CollectionsKt.L(cVar.a(), gVar), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl));
            return new C1160a(dVarA, deserializedDescriptorResolver);
        }
    }

    public d(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d d0 moduleDescriptor, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.i configuration, @dl.d f classDataFinder, @dl.d b annotationAndConstantLoader, @dl.d LazyJavaPackageFragmentProvider packageFragmentProvider, @dl.d NotFoundClasses notFoundClasses, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.m errorReporter, @dl.d ki.c lookupTracker, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.g contractDeserializer, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.j kotlinTypeChecker, @dl.d ri.a typeAttributeTranslators) {
        gi.c cVarH0;
        gi.a aVarH0;
        f0.p(storageManager, "storageManager");
        f0.p(moduleDescriptor, "moduleDescriptor");
        f0.p(configuration, "configuration");
        f0.p(classDataFinder, "classDataFinder");
        f0.p(annotationAndConstantLoader, "annotationAndConstantLoader");
        f0.p(packageFragmentProvider, "packageFragmentProvider");
        f0.p(notFoundClasses, "notFoundClasses");
        f0.p(errorReporter, "errorReporter");
        f0.p(lookupTracker, "lookupTracker");
        f0.p(contractDeserializer, "contractDeserializer");
        f0.p(kotlinTypeChecker, "kotlinTypeChecker");
        f0.p(typeAttributeTranslators, "typeAttributeTranslators");
        kotlin.reflect.jvm.internal.impl.builtins.g gVarT = moduleDescriptor.t();
        JvmBuiltIns jvmBuiltIns = gVarT instanceof JvmBuiltIns ? (JvmBuiltIns) gVarT : null;
        this.f126490a = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.h(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, kotlin.reflect.jvm.internal.impl.serialization.deserialization.q.a.f127893a, errorReporter, lookupTracker, g.f126495a, CollectionsKt__CollectionsKt.E(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (aVarH0 = jvmBuiltIns.H0()) == null) ? gi.a.C1078a.f119063a : aVarH0, (jvmBuiltIns == null || (cVarH0 = jvmBuiltIns.H0()) == null) ? gi.c.b.f119065a : cVarH0, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f127181a.a(), kotlinTypeChecker, new pi.b(storageManager, CollectionsKt__CollectionsKt.E()), null, typeAttributeTranslators.a(), 262144, null);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.h a() {
        return this.f126490a;
    }
}
