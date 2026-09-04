package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.r;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import si.n;
import si.p;

/* JADX INFO: compiled from: AbstractSignatureParts.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: compiled from: AbstractSignatureParts.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final si.g f126331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final r f126332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private final n f126333c;

        public a(@dl.e si.g gVar, @dl.e r rVar, @dl.e n nVar) {
            this.f126331a = gVar;
            this.f126332b = rVar;
            this.f126333c = nVar;
        }

        @dl.e
        public final r a() {
            return this.f126332b;
        }

        @dl.e
        public final si.g b() {
            return this.f126331a;
        }

        @dl.e
        public final n c() {
            return this.f126333c;
        }
    }

    private final f B(f fVar, f fVar2) {
        if (fVar == null) {
            return fVar2;
        }
        if (fVar2 == null) {
            return fVar;
        }
        if (fVar.d() && !fVar2.d()) {
            return fVar2;
        }
        if (fVar.d() || !fVar2.d()) {
            return (fVar.c().compareTo(fVar2.c()) >= 0 && fVar.c().compareTo(fVar2.c()) > 0) ? fVar : fVar2;
        }
        return fVar;
    }

    private final List<a> C(si.g gVar) {
        final p pVarV = v();
        return f(new a(gVar, c(gVar, m()), null), new yh.l<a, Iterable<? extends a>>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$toIndexed$1$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractSignatureParts<TAnnotation> f126337b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f126337b = this;
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Iterable<AbstractSignatureParts.a> invoke(@dl.d AbstractSignatureParts.a it) {
                si.m mVarO;
                List<n> listR;
                AbstractSignatureParts.a aVar;
                si.e eVarD;
                f0.p(it, "it");
                if (this.f126337b.u()) {
                    si.g gVarB = it.b();
                    if (((gVarB == null || (eVarD = pVarV.D(gVarB)) == null) ? null : pVarV.y(eVarD)) != null) {
                        return null;
                    }
                }
                si.g gVarB2 = it.b();
                if (gVarB2 == null || (mVarO = pVarV.O(gVarB2)) == null || (listR = pVarV.R(mVarO)) == null) {
                    return null;
                }
                List<si.l> listO = pVarV.o(it.b());
                p pVar = pVarV;
                AbstractSignatureParts<TAnnotation> abstractSignatureParts = this.f126337b;
                Iterator<T> it2 = listR.iterator();
                Iterator<T> it3 = listO.iterator();
                ArrayList arrayList = new ArrayList(Math.min(t.Y(listR, 10), t.Y(listO, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    si.l lVar = (si.l) it3.next();
                    n nVar = (n) next;
                    if (pVar.q(lVar)) {
                        aVar = new AbstractSignatureParts.a(null, it.a(), nVar);
                    } else {
                        si.g gVarE0 = pVar.e0(lVar);
                        aVar = new AbstractSignatureParts.a(gVarE0, abstractSignatureParts.c(gVarE0, it.a()), nVar);
                    }
                    arrayList.add(aVar);
                }
                return arrayList;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r c(si.g gVar, r rVar) {
        return h().c(rVar, i(gVar));
    }

    private final d d(si.g gVar) {
        NullabilityQualifier nullabilityQualifierT;
        NullabilityQualifier nullabilityQualifierT2 = t(gVar);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifierT2 == null) {
            si.g gVarP = p(gVar);
            nullabilityQualifierT = gVarP != null ? t(gVarP) : null;
        } else {
            nullabilityQualifierT = nullabilityQualifierT2;
        }
        p pVarV = v();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a;
        if (cVar.l(s(pVarV.M(gVar)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (cVar.k(s(pVarV.k0(gVar)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new d(nullabilityQualifierT, mutabilityQualifier, v().H(gVar) || A(gVar), nullabilityQualifierT != nullabilityQualifierT2);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    private final d e(a aVar) {
        Iterable<TAnnotation> iterableE;
        f fVarD;
        boolean z10;
        f fVarJ;
        si.m mVarO;
        if (aVar.b() == null) {
            p pVarV = v();
            n nVarC = aVar.c();
            if ((nVarC != null ? pVarV.m0(nVarC) : null) == TypeVariance.IN) {
                return d.f126391e.a();
            }
        }
        boolean z11 = aVar.c() == null;
        si.g gVarB = aVar.b();
        if (gVarB == null || (iterableE = i(gVarB)) == null) {
            iterableE = CollectionsKt__CollectionsKt.E();
        }
        p pVarV2 = v();
        si.g gVarB2 = aVar.b();
        n nVarC0 = (gVarB2 == null || (mVarO = pVarV2.O(gVarB2)) == null) ? null : pVarV2.c0(mVarO);
        boolean z12 = l() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z11) {
            if (z12 || !o()) {
                iterableE = CollectionsKt___CollectionsKt.u4(k(), iterableE);
            } else {
                si.g gVarB3 = aVar.b();
                if (gVarB3 != null && w(gVarB3)) {
                    Iterable<TAnnotation> iterableK = k();
                    ArrayList arrayList = new ArrayList();
                    for (TAnnotation tannotation : iterableK) {
                        if (!h().m(tannotation)) {
                            arrayList.add(tannotation);
                        }
                    }
                    iterableE = CollectionsKt___CollectionsKt.y4(arrayList, iterableE);
                } else {
                    iterableE = CollectionsKt___CollectionsKt.u4(k(), iterableE);
                }
            }
        }
        MutabilityQualifier mutabilityQualifierE = h().e(iterableE);
        f fVarF = h().f(iterableE, new yh.l<TAnnotation, Boolean>(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractSignatureParts<TAnnotation> f126336b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f126336b = this;
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d TAnnotation extractNullability) {
                f0.p(extractNullability, "$this$extractNullability");
                return Boolean.valueOf(this.f126336b.r(extractNullability));
            }
        });
        if (fVarF != null) {
            return new d(fVarF.c(), mutabilityQualifierE, fVarF.c() == NullabilityQualifier.NOT_NULL && nVarC0 != null, fVarF.d());
        }
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityTypeL = (z11 || z12) ? l() : AnnotationQualifierApplicabilityType.TYPE_USE;
        r rVarA = aVar.a();
        kotlin.reflect.jvm.internal.impl.load.java.l lVarA = rVarA != null ? rVarA.a(annotationQualifierApplicabilityTypeL) : null;
        f fVarJ2 = nVarC0 != null ? j(nVarC0) : null;
        if (fVarJ2 == null || (fVarD = f.b(fVarJ2, NullabilityQualifier.NOT_NULL, false, 2, null)) == null) {
            fVarD = lVarA != null ? lVarA.d() : null;
        }
        if ((fVarJ2 != null ? fVarJ2.c() : null) != NullabilityQualifier.NOT_NULL) {
            if (nVarC0 != null) {
                z10 = lVarA != null && lVarA.c();
            }
        }
        n nVarC2 = aVar.c();
        if (nVarC2 == null || (fVarJ = j(nVarC2)) == null) {
            fVarJ = null;
        } else if (fVarJ.c() == NullabilityQualifier.NULLABLE) {
            fVarJ = f.b(fVarJ, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        f fVarB = B(fVarJ, fVarD);
        return new d(fVarB != null ? fVarB.c() : null, mutabilityQualifierE, z10, fVarB != null && fVarB.d());
    }

    private final <T> List<T> f(T t10, yh.l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        g(t10, arrayList, lVar);
        return arrayList;
    }

    private final <T> void g(T t10, List<T> list, yh.l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t10);
        Iterable<? extends T> iterableInvoke = lVar.invoke(t10);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                g(it.next(), list, lVar);
            }
        }
    }

    private final f j(n nVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        List<si.g> arrayList;
        boolean z13;
        p pVarV = v();
        f fVar = null;
        if (!z(nVar)) {
            return null;
        }
        List<si.g> listA = pVarV.A(nVar);
        boolean z14 = listA instanceof Collection;
        if (!z14 || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (!pVarV.f0((si.g) it.next())) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (z10) {
            return null;
        }
        if (!z14 || !listA.isEmpty()) {
            Iterator<T> it2 = listA.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
                if (t((si.g) it2.next()) != null) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        if (!z11) {
            if (!z14 || !listA.isEmpty()) {
                Iterator<T> it3 = listA.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z12 = false;
                        break;
                    }
                    if (p((si.g) it3.next()) != null) {
                        z12 = true;
                        break;
                    }
                }
            } else {
                z12 = false;
                break;
            }
            if (z12) {
                arrayList = new ArrayList<>();
                Iterator<T> it4 = listA.iterator();
                while (it4.hasNext()) {
                    si.g gVarP = p((si.g) it4.next());
                    if (gVarP != null) {
                        arrayList.add(gVarP);
                    }
                }
            }
            return fVar;
        }
        arrayList = listA;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it5 = arrayList.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    z13 = true;
                    break;
                }
                if (!pVarV.w((si.g) it5.next())) {
                    z13 = false;
                    break;
                }
            }
        } else {
            z13 = true;
            break;
        }
        fVar = new f(z13 ? NullabilityQualifier.NULLABLE : NullabilityQualifier.NOT_NULL, arrayList != listA);
        return fVar;
    }

    private final NullabilityQualifier t(si.g gVar) {
        p pVarV = v();
        if (pVarV.F(pVarV.M(gVar))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (pVarV.F(pVarV.k0(gVar))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    public boolean A(@dl.d si.g gVar) {
        f0.p(gVar, "<this>");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    @dl.d
    public final yh.l<Integer, d> b(@dl.d si.g gVar, @dl.d Iterable<? extends si.g> overrides, @dl.e final k kVar, boolean z10) {
        boolean z11;
        si.g gVarB;
        boolean z12;
        f0.p(gVar, "<this>");
        f0.p(overrides, "overrides");
        List<a> listC = C(gVar);
        ArrayList arrayList = new ArrayList(t.Y(overrides, 10));
        Iterator<? extends si.g> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(C(it.next()));
        }
        if (q()) {
            z11 = true;
        } else {
            if (x()) {
                if (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty()) {
                    Iterator<? extends si.g> it2 = overrides.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z12 = false;
                            break;
                        }
                        if (!y(gVar, it2.next())) {
                            z12 = true;
                            break;
                        }
                    }
                } else {
                    z12 = false;
                    break;
                }
                if (z12) {
                    z11 = true;
                }
            }
            z11 = false;
        }
        int size = z11 ? 1 : listC.size();
        final d[] dVarArr = new d[size];
        int i10 = 0;
        while (i10 < size) {
            d dVarE = e(listC.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) CollectionsKt___CollectionsKt.R2((List) it3.next(), i10);
                d dVarD = (aVar == null || (gVarB = aVar.b()) == null) ? null : d(gVarB);
                if (dVarD != null) {
                    arrayList2.add(dVarD);
                }
            }
            dVarArr[i10] = m.a(dVarE, arrayList2, i10 == 0 && x(), i10 == 0 && n(), z10);
            i10++;
        }
        return new yh.l<Integer, d>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$computeIndexedQualifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final d a(int i11) {
                Map<Integer, d> mapA;
                d dVar;
                k kVar2 = kVar;
                if (kVar2 != null && (mapA = kVar2.a()) != null && (dVar = mapA.get(Integer.valueOf(i11))) != null) {
                    return dVar;
                }
                d[] dVarArr2 = dVarArr;
                return (i11 < 0 || i11 > ArraysKt___ArraysKt.Xe(dVarArr2)) ? d.f126391e.a() : dVarArr2[i11];
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ d invoke(Integer num) {
                return a(num.intValue());
            }
        };
    }

    @dl.d
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> h();

    @dl.d
    public abstract Iterable<TAnnotation> i(@dl.d si.g gVar);

    @dl.d
    public abstract Iterable<TAnnotation> k();

    @dl.d
    public abstract AnnotationQualifierApplicabilityType l();

    @dl.e
    public abstract r m();

    public abstract boolean n();

    public abstract boolean o();

    @dl.e
    public abstract si.g p(@dl.d si.g gVar);

    public boolean q() {
        return false;
    }

    public abstract boolean r(@dl.d TAnnotation tannotation);

    @dl.e
    public abstract kotlin.reflect.jvm.internal.impl.name.d s(@dl.d si.g gVar);

    public abstract boolean u();

    @dl.d
    public abstract p v();

    public abstract boolean w(@dl.d si.g gVar);

    public abstract boolean x();

    public abstract boolean y(@dl.d si.g gVar, @dl.d si.g gVar2);

    public abstract boolean z(@dl.d n nVar);
}
