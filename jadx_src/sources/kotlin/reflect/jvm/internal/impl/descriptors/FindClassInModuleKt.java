package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: findClassInModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FindClassInModuleKt {
    @dl.e
    public static final d a(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(classId, "classId");
        f fVarB = b(d0Var, classId);
        if (fVarB instanceof d) {
            return (d) fVarB;
        }
        return null;
    }

    @dl.e
    public static final f b(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        f fVarH;
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(classId, "classId");
        d0 d0VarA = kotlin.reflect.jvm.internal.impl.resolve.k.a(d0Var);
        if (d0VarA == null) {
            kotlin.reflect.jvm.internal.impl.name.c cVarH = classId.h();
            kotlin.jvm.internal.f0.o(cVarH, "classId.packageFqName");
            k0 k0VarR = d0Var.R(cVarH);
            List<kotlin.reflect.jvm.internal.impl.name.f> listF = classId.i().f();
            kotlin.jvm.internal.f0.o(listF, "classId.relativeClassName.pathSegments()");
            MemberScope memberScopeU = k0VarR.u();
            Object objW2 = CollectionsKt___CollectionsKt.w2(listF);
            kotlin.jvm.internal.f0.o(objW2, "segments.first()");
            fVarH = memberScopeU.h((kotlin.reflect.jvm.internal.impl.name.f) objW2, NoLookupLocation.FROM_DESERIALIZATION);
            if (fVarH == null) {
                return null;
            }
            for (kotlin.reflect.jvm.internal.impl.name.f name : listF.subList(1, listF.size())) {
                if (!(fVarH instanceof d)) {
                    return null;
                }
                MemberScope memberScopeL = ((d) fVarH).L();
                kotlin.jvm.internal.f0.o(name, "name");
                f fVarH2 = memberScopeL.h(name, NoLookupLocation.FROM_DESERIALIZATION);
                fVarH = fVarH2 instanceof d ? (d) fVarH2 : null;
                if (fVarH == null) {
                    return null;
                }
            }
        } else {
            kotlin.reflect.jvm.internal.impl.name.c cVarH2 = classId.h();
            kotlin.jvm.internal.f0.o(cVarH2, "classId.packageFqName");
            k0 k0VarR2 = d0VarA.R(cVarH2);
            List<kotlin.reflect.jvm.internal.impl.name.f> listF2 = classId.i().f();
            kotlin.jvm.internal.f0.o(listF2, "classId.relativeClassName.pathSegments()");
            MemberScope memberScopeU2 = k0VarR2.u();
            Object objW3 = CollectionsKt___CollectionsKt.w2(listF2);
            kotlin.jvm.internal.f0.o(objW3, "segments.first()");
            f fVarH3 = memberScopeU2.h((kotlin.reflect.jvm.internal.impl.name.f) objW3, NoLookupLocation.FROM_DESERIALIZATION);
            if (fVarH3 == null) {
                fVarH3 = null;
                break;
            }
            for (kotlin.reflect.jvm.internal.impl.name.f name2 : listF2.subList(1, listF2.size())) {
                if (fVarH3 instanceof d) {
                    MemberScope memberScopeL2 = ((d) fVarH3).L();
                    kotlin.jvm.internal.f0.o(name2, "name");
                    f fVarH4 = memberScopeL2.h(name2, NoLookupLocation.FROM_DESERIALIZATION);
                    fVarH3 = fVarH4 instanceof d ? (d) fVarH4 : null;
                    if (fVarH3 != null) {
                    }
                }
                fVarH3 = null;
            }
            if (fVarH3 != null) {
                return fVarH3;
            }
            kotlin.reflect.jvm.internal.impl.name.c cVarH3 = classId.h();
            kotlin.jvm.internal.f0.o(cVarH3, "classId.packageFqName");
            k0 k0VarR3 = d0Var.R(cVarH3);
            List<kotlin.reflect.jvm.internal.impl.name.f> listF3 = classId.i().f();
            kotlin.jvm.internal.f0.o(listF3, "classId.relativeClassName.pathSegments()");
            MemberScope memberScopeU3 = k0VarR3.u();
            Object objW4 = CollectionsKt___CollectionsKt.w2(listF3);
            kotlin.jvm.internal.f0.o(objW4, "segments.first()");
            fVarH = memberScopeU3.h((kotlin.reflect.jvm.internal.impl.name.f) objW4, NoLookupLocation.FROM_DESERIALIZATION);
            if (fVarH == null) {
                return null;
            }
            for (kotlin.reflect.jvm.internal.impl.name.f name3 : listF3.subList(1, listF3.size())) {
                if (!(fVarH instanceof d)) {
                    return null;
                }
                MemberScope memberScopeL3 = ((d) fVarH).L();
                kotlin.jvm.internal.f0.o(name3, "name");
                f fVarH5 = memberScopeL3.h(name3, NoLookupLocation.FROM_DESERIALIZATION);
                fVarH = fVarH5 instanceof d ? (d) fVarH5 : null;
                if (fVarH == null) {
                    return null;
                }
            }
        }
        return fVarH;
    }

    @dl.d
    public static final d c(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.d NotFoundClasses notFoundClasses) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(classId, "classId");
        kotlin.jvm.internal.f0.p(notFoundClasses, "notFoundClasses");
        d dVarA = a(d0Var, classId);
        return dVarA != null ? dVarA : notFoundClasses.d(classId, SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.k1(SequencesKt__SequencesKt.l(classId, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.f125555d), new yh.l<kotlin.reflect.jvm.internal.impl.name.b, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.b it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return 0;
            }
        })));
    }

    @dl.e
    public static final x0 d(@dl.d d0 d0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.jvm.internal.f0.p(classId, "classId");
        f fVarB = b(d0Var, classId);
        if (fVarB instanceof x0) {
            return (x0) fVarB;
        }
        return null;
    }
}
