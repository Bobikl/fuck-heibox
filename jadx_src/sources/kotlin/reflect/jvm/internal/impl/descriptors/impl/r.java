package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.f1;

/* JADX INFO: compiled from: ModuleAwareClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r implements kotlin.reflect.jvm.internal.impl.descriptors.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f125803b = new a(null);

    /* JADX INFO: compiled from: ModuleAwareClassDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final MemberScope a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d f1 typeSubstitution, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
            MemberScope memberScopeZ;
            kotlin.jvm.internal.f0.p(dVar, "<this>");
            kotlin.jvm.internal.f0.p(typeSubstitution, "typeSubstitution");
            kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            r rVar = dVar instanceof r ? (r) dVar : null;
            if (rVar != null && (memberScopeZ = rVar.Z(typeSubstitution, kotlinTypeRefiner)) != null) {
                return memberScopeZ;
            }
            MemberScope memberScopeB0 = dVar.B0(typeSubstitution);
            kotlin.jvm.internal.f0.o(memberScopeB0, "this.getMemberScope(\n   …ubstitution\n            )");
            return memberScopeB0;
        }

        @dl.d
        public final MemberScope b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
            MemberScope memberScopeU0;
            kotlin.jvm.internal.f0.p(dVar, "<this>");
            kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            r rVar = dVar instanceof r ? (r) dVar : null;
            if (rVar != null && (memberScopeU0 = rVar.u0(kotlinTypeRefiner)) != null) {
                return memberScopeU0;
            }
            MemberScope memberScopeM = dVar.M();
            kotlin.jvm.internal.f0.o(memberScopeM, "this.unsubstitutedMemberScope");
            return memberScopeM;
        }
    }

    @dl.d
    protected abstract MemberScope Z(@dl.d f1 f1Var, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f a() {
        return a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
        return a();
    }

    @dl.d
    protected abstract MemberScope u0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar);
}
