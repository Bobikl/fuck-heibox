package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;

/* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
    public static final class a implements kotlin.reflect.jvm.internal.impl.load.java.o {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.o
        @dl.e
        public List<mi.a> a(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
            f0.p(classId, "classId");
            return null;
        }
    }

    @dl.d
    public static final d a(@dl.d d0 module, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d NotFoundClasses notFoundClasses, @dl.d LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @dl.d m reflectKotlinClassFinder, @dl.d DeserializedDescriptorResolver deserializedDescriptorResolver, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.m errorReporter) {
        f0.p(module, "module");
        f0.p(storageManager, "storageManager");
        f0.p(notFoundClasses, "notFoundClasses");
        f0.p(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        f0.p(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        f0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        f0.p(errorReporter, "errorReporter");
        return new d(storageManager, module, kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.a.f127875a, new f(reflectKotlinClassFinder, deserializedDescriptorResolver), new b(module, notFoundClasses, storageManager, reflectKotlinClassFinder), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, ki.c.a.f124469a, kotlin.reflect.jvm.internal.impl.serialization.deserialization.g.f127851a.a(), kotlin.reflect.jvm.internal.impl.types.checker.j.f128080b.a(), new ri.a(kotlin.collections.s.k(kotlin.reflect.jvm.internal.impl.types.m.f128152a)));
    }

    @dl.d
    public static final LazyJavaPackageFragmentProvider b(@dl.d kotlin.reflect.jvm.internal.impl.load.java.j javaClassFinder, @dl.d d0 module, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d NotFoundClasses notFoundClasses, @dl.d m reflectKotlinClassFinder, @dl.d DeserializedDescriptorResolver deserializedDescriptorResolver, @dl.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.m errorReporter, @dl.d li.b javaSourceElementFactory, @dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.e singleModuleClassResolver, @dl.d u packagePartProvider) {
        f0.p(javaClassFinder, "javaClassFinder");
        f0.p(module, "module");
        f0.p(storageManager, "storageManager");
        f0.p(notFoundClasses, "notFoundClasses");
        f0.p(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        f0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        f0.p(errorReporter, "errorReporter");
        f0.p(javaSourceElementFactory, "javaSourceElementFactory");
        f0.p(singleModuleClassResolver, "singleModuleClassResolver");
        f0.p(packagePartProvider, "packagePartProvider");
        kotlin.reflect.jvm.internal.impl.load.java.components.e DO_NOTHING = kotlin.reflect.jvm.internal.impl.load.java.components.e.f126045a;
        f0.o(DO_NOTHING, "DO_NOTHING");
        kotlin.reflect.jvm.internal.impl.load.java.components.d EMPTY = kotlin.reflect.jvm.internal.impl.load.java.components.d.f126044a;
        f0.o(EMPTY, "EMPTY");
        kotlin.reflect.jvm.internal.impl.load.java.components.c.a aVar = kotlin.reflect.jvm.internal.impl.load.java.components.c.a.f126043a;
        pi.b bVar = new pi.b(storageManager, CollectionsKt__CollectionsKt.E());
        w0.a aVar2 = w0.a.f125944a;
        ki.c.a aVar3 = ki.c.a.f124469a;
        ReflectionTypes reflectionTypes = new ReflectionTypes(module, notFoundClasses);
        JavaTypeEnhancementState.a aVar4 = JavaTypeEnhancementState.f125966d;
        kotlin.reflect.jvm.internal.impl.load.java.b bVar2 = new kotlin.reflect.jvm.internal.impl.load.java.b(aVar4.a());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.b.C1151b c1151b = kotlin.reflect.jvm.internal.impl.load.java.lazy.b.C1151b.f126108b;
        return new LazyJavaPackageFragmentProvider(new kotlin.reflect.jvm.internal.impl.load.java.lazy.a(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, aVar, bVar, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, reflectionTypes, bVar2, new SignatureEnhancement(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c(c1151b)), kotlin.reflect.jvm.internal.impl.load.java.k.a.f126059a, c1151b, kotlin.reflect.jvm.internal.impl.types.checker.j.f128080b.a(), aVar4.a(), new a(), null, 8388608, null));
    }
}
