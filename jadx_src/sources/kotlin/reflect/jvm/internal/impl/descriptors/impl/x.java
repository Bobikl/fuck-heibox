package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.k0;

/* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f125819a = a.f125820a;

    /* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f125820a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private static final kotlin.reflect.jvm.internal.impl.descriptors.c0<x> f125821b = new kotlin.reflect.jvm.internal.impl.descriptors.c0<>("PackageViewDescriptorFactory");

        private a() {
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.c0<x> a() {
            return f125821b;
        }
    }

    /* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
    public static final class b implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final b f125822b = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.x
        @dl.d
        public k0 a(@dl.d ModuleDescriptorImpl module, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager) {
            kotlin.jvm.internal.f0.p(module, "module");
            kotlin.jvm.internal.f0.p(fqName, "fqName");
            kotlin.jvm.internal.f0.p(storageManager, "storageManager");
            return new LazyPackageViewDescriptorImpl(module, fqName, storageManager);
        }
    }

    @dl.d
    k0 a(@dl.d ModuleDescriptorImpl moduleDescriptorImpl, @dl.d kotlin.reflect.jvm.internal.impl.name.c cVar, @dl.d kotlin.reflect.jvm.internal.impl.storage.m mVar);
}
