package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;

/* JADX INFO: compiled from: PackageFragmentDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w extends j implements kotlin.reflect.jvm.internal.impl.descriptors.g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c f125817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final String f125818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 module, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        super(module, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), fqName.h(), t0.f125942a);
        kotlin.jvm.internal.f0.p(module, "module");
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        this.f125817f = fqName;
        this.f125818g = "package " + fqName + " of " + module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.d0 c() {
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = super.c();
        kotlin.jvm.internal.f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (kotlin.reflect.jvm.internal.impl.descriptors.d0) kVarC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> visitor, D d10) {
        kotlin.jvm.internal.f0.p(visitor, "visitor");
        return visitor.k(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.c e() {
        return this.f125817f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j, kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        t0 NO_SOURCE = t0.f125942a;
        kotlin.jvm.internal.f0.o(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i
    @dl.d
    public String toString() {
        return this.f125818g;
    }
}
