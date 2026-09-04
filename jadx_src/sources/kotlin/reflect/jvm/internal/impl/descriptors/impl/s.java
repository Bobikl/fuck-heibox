package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.f1;

/* JADX INFO: compiled from: ModuleAwareClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s {
    @dl.d
    public static final MemberScope a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d f1 typeSubstitution, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(typeSubstitution, "typeSubstitution");
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return r.f125803b.a(dVar, typeSubstitution, kotlinTypeRefiner);
    }

    @dl.d
    public static final MemberScope b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return r.f125803b.b(dVar, kotlinTypeRefiner);
    }
}
