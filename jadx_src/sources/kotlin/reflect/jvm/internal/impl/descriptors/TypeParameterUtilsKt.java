package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeParameterUtilsKt {
    @dl.e
    public static final m0 a(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        f fVarD = d0Var.O0().d();
        return b(d0Var, fVarD instanceof g ? (g) fVarD : null, 0);
    }

    private static final m0 b(kotlin.reflect.jvm.internal.impl.types.d0 d0Var, g gVar, int i10) {
        if (gVar == null || kotlin.reflect.jvm.internal.impl.types.error.h.m(gVar)) {
            return null;
        }
        int size = gVar.w().size() + i10;
        if (gVar.m()) {
            List<kotlin.reflect.jvm.internal.impl.types.c1> listSubList = d0Var.M0().subList(i10, size);
            k kVarC = gVar.c();
            return new m0(gVar, listSubList, b(d0Var, kVarC instanceof g ? (g) kVarC : null, size));
        }
        if (size != d0Var.M0().size()) {
            kotlin.reflect.jvm.internal.impl.resolve.d.E(gVar);
        }
        return new m0(gVar, d0Var.M0().subList(i10, d0Var.M0().size()), null);
    }

    private static final b c(y0 y0Var, k kVar, int i10) {
        return new b(y0Var, kVar, i10);
    }

    @dl.d
    public static final List<y0> d(@dl.d g gVar) {
        List<y0> listE;
        k next;
        kotlin.reflect.jvm.internal.impl.types.z0 z0VarR;
        kotlin.jvm.internal.f0.p(gVar, "<this>");
        List<y0> declaredTypeParameters = gVar.w();
        kotlin.jvm.internal.f0.o(declaredTypeParameters, "declaredTypeParameters");
        if (!gVar.m() && !(gVar.c() instanceof a)) {
            return declaredTypeParameters;
        }
        List listC3 = SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.H0(SequencesKt___SequencesKt.p0(SequencesKt___SequencesKt.Z2(DescriptorUtilsKt.q(gVar), new yh.l<k, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d k it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.valueOf(it instanceof a);
            }
        }), new yh.l<k, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d k it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Boolean.valueOf(!(it instanceof j));
            }
        }), new yh.l<k, kotlin.sequences.m<? extends y0>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.sequences.m<y0> invoke(@dl.d k it) {
                kotlin.jvm.internal.f0.p(it, "it");
                List<y0> typeParameters = ((a) it).getTypeParameters();
                kotlin.jvm.internal.f0.o(typeParameters, "it as CallableDescriptor).typeParameters");
                return CollectionsKt___CollectionsKt.v1(typeParameters);
            }
        }));
        Iterator<k> it = DescriptorUtilsKt.q(gVar).iterator();
        do {
            listE = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof d));
        d dVar = (d) next;
        if (dVar != null && (z0VarR = dVar.r()) != null) {
            listE = z0VarR.getParameters();
        }
        if (listE == null) {
            listE = CollectionsKt__CollectionsKt.E();
        }
        if (listC3.isEmpty() && listE.isEmpty()) {
            List<y0> declaredTypeParameters2 = gVar.w();
            kotlin.jvm.internal.f0.o(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        List<y0> listY4 = CollectionsKt___CollectionsKt.y4(listC3, listE);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY4, 10));
        for (y0 it2 : listY4) {
            kotlin.jvm.internal.f0.o(it2, "it");
            arrayList.add(c(it2, gVar, declaredTypeParameters.size()));
        }
        return CollectionsKt___CollectionsKt.y4(declaredTypeParameters, arrayList);
    }
}
