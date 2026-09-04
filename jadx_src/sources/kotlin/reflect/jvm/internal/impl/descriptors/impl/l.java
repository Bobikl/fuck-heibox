package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: EmptyPackageFragmentDesciptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 module, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        super(module, fqName);
        kotlin.jvm.internal.f0.p(module, "module");
        kotlin.jvm.internal.f0.p(fqName, "fqName");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @dl.d
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public MemberScope.b u() {
        return MemberScope.b.f127587b;
    }
}
