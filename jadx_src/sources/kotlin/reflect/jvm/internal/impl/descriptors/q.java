package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: descriptorUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {
    @dl.e
    public static final f a(@dl.d k kVar) {
        kotlin.jvm.internal.f0.p(kVar, "<this>");
        k kVarC = kVar.c();
        if (kVarC == null || (kVar instanceof g0)) {
            return null;
        }
        if (!b(kVarC)) {
            return a(kVarC);
        }
        if (kVarC instanceof f) {
            return (f) kVarC;
        }
        return null;
    }

    public static final boolean b(@dl.d k kVar) {
        kotlin.jvm.internal.f0.p(kVar, "<this>");
        return kVar.c() instanceof g0;
    }

    @dl.e
    public static final d c(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d ki.b lookupLocation) {
        f fVarH;
        MemberScope memberScopeL;
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        kotlin.jvm.internal.f0.p(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarE = fqName.e();
        kotlin.jvm.internal.f0.o(cVarE, "fqName.parent()");
        MemberScope memberScopeU = d0Var.R(cVarE).u();
        kotlin.reflect.jvm.internal.impl.name.f fVarG = fqName.g();
        kotlin.jvm.internal.f0.o(fVarG, "fqName.shortName()");
        f fVarH2 = memberScopeU.h(fVarG, lookupLocation);
        d dVar = fVarH2 instanceof d ? (d) fVarH2 : null;
        if (dVar != null) {
            return dVar;
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarE2 = fqName.e();
        kotlin.jvm.internal.f0.o(cVarE2, "fqName.parent()");
        d dVarC = c(d0Var, cVarE2, lookupLocation);
        if (dVarC == null || (memberScopeL = dVarC.L()) == null) {
            fVarH = null;
        } else {
            kotlin.reflect.jvm.internal.impl.name.f fVarG2 = fqName.g();
            kotlin.jvm.internal.f0.o(fVarG2, "fqName.shortName()");
            fVarH = memberScopeL.h(fVarG2, lookupLocation);
        }
        if (fVarH instanceof d) {
            return (d) fVarH;
        }
        return null;
    }
}
