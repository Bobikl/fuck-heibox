package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p0 {

    /* JADX INFO: compiled from: StarProjectionImpl.kt */
    public static final class a extends a1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<z0> f128160d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends z0> list) {
            this.f128160d = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.a1
        @dl.e
        public c1 k(@dl.d z0 key) {
            kotlin.jvm.internal.f0.p(key, "key");
            if (!this.f128160d.contains(key)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = key.d();
            kotlin.jvm.internal.f0.n(fVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return i1.s((kotlin.reflect.jvm.internal.impl.descriptors.y0) fVarD);
        }
    }

    private static final d0 a(List<? extends z0> list, List<? extends d0> list2, kotlin.reflect.jvm.internal.impl.builtins.g gVar) {
        d0 d0VarP = TypeSubstitutor.g(new a(list)).p((d0) CollectionsKt___CollectionsKt.w2(list2), Variance.OUT_VARIANCE);
        if (d0VarP == null) {
            d0VarP = gVar.y();
        }
        kotlin.jvm.internal.f0.o(d0VarP, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return d0VarP;
    }

    @dl.d
    public static final d0 b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var) {
        kotlin.jvm.internal.f0.p(y0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = y0Var.c();
        kotlin.jvm.internal.f0.o(kVarC, "this.containingDeclaration");
        if (kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters = ((kotlin.reflect.jvm.internal.impl.descriptors.g) kVarC).r().getParameters();
            kotlin.jvm.internal.f0.o(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                z0 z0VarR = ((kotlin.reflect.jvm.internal.impl.descriptors.y0) it.next()).r();
                kotlin.jvm.internal.f0.o(z0VarR, "it.typeConstructor");
                arrayList.add(z0VarR);
            }
            List<d0> upperBounds = y0Var.getUpperBounds();
            kotlin.jvm.internal.f0.o(upperBounds, "upperBounds");
            return a(arrayList, upperBounds, DescriptorUtilsKt.j(y0Var));
        }
        if (!(kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.w)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<kotlin.reflect.jvm.internal.impl.descriptors.y0> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.w) kVarC).getTypeParameters();
        kotlin.jvm.internal.f0.o(typeParameters, "descriptor.typeParameters");
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(typeParameters, 10));
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            z0 z0VarR2 = ((kotlin.reflect.jvm.internal.impl.descriptors.y0) it2.next()).r();
            kotlin.jvm.internal.f0.o(z0VarR2, "it.typeConstructor");
            arrayList2.add(z0VarR2);
        }
        List<d0> upperBounds2 = y0Var.getUpperBounds();
        kotlin.jvm.internal.f0.o(upperBounds2, "upperBounds");
        return a(arrayList2, upperBounds2, DescriptorUtilsKt.j(y0Var));
    }
}
