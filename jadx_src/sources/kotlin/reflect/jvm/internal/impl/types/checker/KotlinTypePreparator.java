package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: KotlinTypePreparator.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class KotlinTypePreparator extends kotlin.reflect.jvm.internal.impl.types.f {

    /* JADX INFO: compiled from: KotlinTypePreparator.kt */
    public static final class a extends KotlinTypePreparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f128056a = new a();

        private a() {
        }
    }

    private final j0 c(j0 j0Var) {
        d0 type;
        z0 z0VarO0 = j0Var.O0();
        boolean z10 = false;
        IntersectionTypeConstructor intersectionTypeConstructorM = null;
        l1VarR0 = null;
        l1 l1VarR0 = null;
        if (z0VarO0 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) {
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c cVar = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) z0VarO0;
            c1 c1VarC = cVar.c();
            if (!(c1VarC.c() == Variance.IN_VARIANCE)) {
                c1VarC = null;
            }
            if (c1VarC != null && (type = c1VarC.getType()) != null) {
                l1VarR0 = type.R0();
            }
            l1 l1Var = l1VarR0;
            if (cVar.g() == null) {
                c1 c1VarC2 = cVar.c();
                Collection<d0> collectionL = cVar.l();
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(collectionL, 10));
                Iterator<T> it = collectionL.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d0) it.next()).R0());
                }
                cVar.i(new NewCapturedTypeConstructor(c1VarC2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedTypeConstructor newCapturedTypeConstructorG = cVar.g();
            f0.m(newCapturedTypeConstructorG);
            return new h(captureStatus, newCapturedTypeConstructorG, l1Var, j0Var.N0(), j0Var.P0(), false, 32, null);
        }
        if (z0VarO0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n) {
            Collection<d0> collectionL2 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.n) z0VarO0).l();
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(collectionL2, 10));
            Iterator<T> it2 = collectionL2.iterator();
            while (it2.hasNext()) {
                d0 d0VarP = i1.p((d0) it2.next(), j0Var.P0());
                f0.o(d0VarP, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(d0VarP);
            }
            return KotlinTypeFactory.m(j0Var.N0(), new IntersectionTypeConstructor(arrayList2), CollectionsKt__CollectionsKt.E(), false, j0Var.u());
        }
        if (!(z0VarO0 instanceof IntersectionTypeConstructor) || !j0Var.P0()) {
            return j0Var;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) z0VarO0;
        Collection<d0> collectionL3 = intersectionTypeConstructor.l();
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(collectionL3, 10));
        Iterator<T> it3 = collectionL3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(TypeUtilsKt.u((d0) it3.next()));
            z10 = true;
        }
        if (z10) {
            d0 d0VarH = intersectionTypeConstructor.h();
            intersectionTypeConstructorM = new IntersectionTypeConstructor(arrayList3).m(d0VarH != null ? TypeUtilsKt.u(d0VarH) : null);
        }
        if (intersectionTypeConstructorM != null) {
            intersectionTypeConstructor = intersectionTypeConstructorM;
        }
        return intersectionTypeConstructor.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f
    @dl.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l1 a(@dl.d si.g type) {
        l1 l1VarD;
        f0.p(type, "type");
        if (!(type instanceof d0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        l1 l1VarR0 = ((d0) type).R0();
        if (l1VarR0 instanceof j0) {
            l1VarD = c((j0) l1VarR0);
        } else {
            if (!(l1VarR0 instanceof y)) {
                throw new NoWhenBranchMatchedException();
            }
            y yVar = (y) l1VarR0;
            j0 j0VarC = c(yVar.W0());
            j0 j0VarC2 = c(yVar.X0());
            l1VarD = (j0VarC == yVar.W0() && j0VarC2 == yVar.X0()) ? l1VarR0 : KotlinTypeFactory.d(j0VarC, j0VarC2);
        }
        return k1.c(l1VarD, l1VarR0, new KotlinTypePreparator$prepareType$1(this));
    }
}
