package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<ModuleDescriptorImpl> f125804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Set<ModuleDescriptorImpl> f125805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<ModuleDescriptorImpl> f125806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Set<ModuleDescriptorImpl> f125807d;

    public u(@dl.d List<ModuleDescriptorImpl> allDependencies, @dl.d Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible, @dl.d List<ModuleDescriptorImpl> directExpectedByDependencies, @dl.d Set<ModuleDescriptorImpl> allExpectedByDependencies) {
        kotlin.jvm.internal.f0.p(allDependencies, "allDependencies");
        kotlin.jvm.internal.f0.p(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        kotlin.jvm.internal.f0.p(directExpectedByDependencies, "directExpectedByDependencies");
        kotlin.jvm.internal.f0.p(allExpectedByDependencies, "allExpectedByDependencies");
        this.f125804a = allDependencies;
        this.f125805b = modulesWhoseInternalsAreVisible;
        this.f125806c = directExpectedByDependencies;
        this.f125807d = allExpectedByDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @dl.d
    public List<ModuleDescriptorImpl> a() {
        return this.f125806c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @dl.d
    public Set<ModuleDescriptorImpl> b() {
        return this.f125805b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    @dl.d
    public List<ModuleDescriptorImpl> c() {
        return this.f125804a;
    }
}
