package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AbstractTypeChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final AbstractTypeChecker f127958a = new AbstractTypeChecker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @xh.e
    public static boolean f127959b;

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f127961b;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127960a = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f127961b = iArr2;
        }
    }

    private AbstractTypeChecker() {
    }

    private final Boolean a(TypeCheckerState typeCheckerState, si.i iVar, si.i iVar2) {
        si.p pVarJ = typeCheckerState.j();
        if (!pVarJ.s0(iVar) && !pVarJ.s0(iVar2)) {
            return null;
        }
        if (d(pVarJ, iVar) && d(pVarJ, iVar2)) {
            return Boolean.TRUE;
        }
        if (pVarJ.s0(iVar)) {
            if (e(pVarJ, typeCheckerState, iVar, iVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (pVarJ.s0(iVar2) && (c(pVarJ, iVar) || e(pVarJ, typeCheckerState, iVar2, iVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean b(si.p pVar, si.i iVar) {
        if (!(iVar instanceof si.b)) {
            return false;
        }
        si.l lVarV0 = pVar.v0(pVar.y0((si.b) iVar));
        return !pVar.q(lVarV0) && pVar.s0(pVar.k0(pVar.e0(lVarV0)));
    }

    private static final boolean c(si.p pVar, si.i iVar) {
        boolean z10;
        si.m mVarG = pVar.g(iVar);
        if (mVarG instanceof si.f) {
            Collection<si.g> collectionE = pVar.E(mVarG);
            if (!(collectionE instanceof Collection) || !collectionE.isEmpty()) {
                Iterator<T> it = collectionE.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    si.i iVarC = pVar.c((si.g) it.next());
                    if (iVarC != null && pVar.s0(iVarC)) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private static final boolean d(si.p pVar, si.i iVar) {
        return pVar.s0(iVar) || b(pVar, iVar);
    }

    private static final boolean e(si.p pVar, TypeCheckerState typeCheckerState, si.i iVar, si.i iVar2, boolean z10) {
        Collection<si.g> collectionQ0 = pVar.q0(iVar);
        if (!(collectionQ0 instanceof Collection) || !collectionQ0.isEmpty()) {
            for (si.g gVar : collectionQ0) {
                if (kotlin.jvm.internal.f0.g(pVar.O(gVar), pVar.g(iVar2)) || (z10 && t(f127958a, typeCheckerState, iVar2, gVar, false, 8, null))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0129  */
    private final Boolean f(TypeCheckerState typeCheckerState, si.i iVar, si.i iVar2) {
        si.i iVarR;
        si.n nVarM;
        si.p pVarJ = typeCheckerState.j();
        boolean z10 = false;
        if (pVarJ.f0(iVar) || pVarJ.f0(iVar2)) {
            if (typeCheckerState.m()) {
                return Boolean.TRUE;
            }
            return (!pVarJ.F(iVar) || pVarJ.F(iVar2)) ? Boolean.valueOf(d.f128095a.b(pVarJ, pVarJ.a(iVar, false), pVarJ.a(iVar2, false))) : Boolean.FALSE;
        }
        if (pVarJ.i0(iVar) && pVarJ.i0(iVar2)) {
            return Boolean.valueOf(f127958a.p(pVarJ, iVar, iVar2) || typeCheckerState.n());
        }
        if (pVarJ.g0(iVar) || pVarJ.g0(iVar2)) {
            return Boolean.valueOf(typeCheckerState.n());
        }
        si.c cVarB0 = pVarJ.B0(iVar2);
        if (cVarB0 == null || (iVarR = pVarJ.r(cVarB0)) == null) {
            iVarR = iVar2;
        }
        si.b bVarE = pVarJ.e(iVarR);
        si.g gVarQ = bVarE != null ? pVarJ.Q(bVarE) : null;
        if (bVarE != null && gVarQ != null) {
            if (pVarJ.F(iVar2)) {
                gVarQ = pVarJ.u(gVarQ, true);
            } else if (pVarJ.H(iVar2)) {
                gVarQ = pVarJ.E0(gVarQ);
            }
            si.g gVar = gVarQ;
            int i10 = a.f127961b[typeCheckerState.g(iVar, bVarE).ordinal()];
            if (i10 == 1) {
                return Boolean.valueOf(t(f127958a, typeCheckerState, iVar, gVar, false, 8, null));
            }
            if (i10 == 2 && t(f127958a, typeCheckerState, iVar, gVar, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        si.m mVarG = pVarJ.g(iVar2);
        if (pVarJ.Y(mVarG)) {
            pVarJ.F(iVar2);
            Collection<si.g> collectionE = pVarJ.E(mVarG);
            if ((collectionE instanceof Collection) && collectionE.isEmpty()) {
                z10 = true;
            } else {
                Iterator<T> it = collectionE.iterator();
                while (it.hasNext()) {
                    if (!t(f127958a, typeCheckerState, iVar, (si.g) it.next(), false, 8, null)) {
                    }
                }
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        si.m mVarG2 = pVarJ.g(iVar);
        if (iVar instanceof si.b) {
            nVarM = f127958a.m(typeCheckerState.j(), iVar2, iVar);
            if (nVarM != null && pVarJ.k(nVarM, pVarJ.g(iVar2))) {
                return Boolean.TRUE;
            }
        } else if (pVarJ.Y(mVarG2)) {
            Collection<si.g> collectionE2 = pVarJ.E(mVarG2);
            if (!(collectionE2 instanceof Collection) || !collectionE2.isEmpty()) {
                Iterator<T> it2 = collectionE2.iterator();
                do {
                    if (!it2.hasNext()) {
                        z10 = true;
                        break;
                    }
                } while (((si.g) it2.next()) instanceof si.b);
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                nVarM = f127958a.m(typeCheckerState.j(), iVar2, iVar);
                if (nVarM != null) {
                    return Boolean.TRUE;
                }
            }
        }
        return null;
    }

    private final List<si.i> g(TypeCheckerState typeCheckerState, si.i iVar, si.m mVar) {
        TypeCheckerState.b bVarT0;
        si.p pVarJ = typeCheckerState.j();
        List<si.i> listB = pVarJ.B(iVar, mVar);
        if (listB != null) {
            return listB;
        }
        if (!pVarJ.a0(mVar) && pVarJ.W(iVar)) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (pVarJ.U(mVar)) {
            if (!pVarJ.w0(pVarJ.g(iVar), mVar)) {
                return CollectionsKt__CollectionsKt.E();
            }
            si.i iVarI = pVarJ.i(iVar, CaptureStatus.FOR_SUBTYPING);
            if (iVarI != null) {
                iVar = iVarI;
            }
            return kotlin.collections.s.k(iVar);
        }
        kotlin.reflect.jvm.internal.impl.utils.d dVar = new kotlin.reflect.jvm.internal.impl.utils.d();
        typeCheckerState.k();
        ArrayDeque<si.i> arrayDequeH = typeCheckerState.h();
        kotlin.jvm.internal.f0.m(arrayDequeH);
        Set<si.i> setI = typeCheckerState.i();
        kotlin.jvm.internal.f0.m(setI);
        arrayDequeH.push(iVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + CollectionsKt___CollectionsKt.h3(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            si.i current = arrayDequeH.pop();
            kotlin.jvm.internal.f0.o(current, "current");
            if (setI.add(current)) {
                si.i iVarI2 = pVarJ.i(current, CaptureStatus.FOR_SUBTYPING);
                if (iVarI2 == null) {
                    iVarI2 = current;
                }
                if (pVarJ.w0(pVarJ.g(iVarI2), mVar)) {
                    dVar.add(iVarI2);
                    bVarT0 = TypeCheckerState.b.c.f128027a;
                } else {
                    bVarT0 = pVarJ.V(iVarI2) == 0 ? TypeCheckerState.b.C1180b.f128026a : typeCheckerState.j().t0(iVarI2);
                }
                if (!(!kotlin.jvm.internal.f0.g(bVarT0, TypeCheckerState.b.c.f128027a))) {
                    bVarT0 = null;
                }
                if (bVarT0 != null) {
                    si.p pVarJ2 = typeCheckerState.j();
                    Iterator<si.g> it = pVarJ2.E(pVarJ2.g(current)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(bVarT0.a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.e();
        return dVar;
    }

    private final List<si.i> h(TypeCheckerState typeCheckerState, si.i iVar, si.m mVar) {
        return w(typeCheckerState, g(typeCheckerState, iVar, mVar));
    }

    private final boolean i(TypeCheckerState typeCheckerState, si.g gVar, si.g gVar2, boolean z10) {
        si.p pVarJ = typeCheckerState.j();
        si.g gVarO = typeCheckerState.o(typeCheckerState.p(gVar));
        si.g gVarO2 = typeCheckerState.o(typeCheckerState.p(gVar2));
        AbstractTypeChecker abstractTypeChecker = f127958a;
        Boolean boolF = abstractTypeChecker.f(typeCheckerState, pVarJ.M(gVarO), pVarJ.k0(gVarO2));
        if (boolF == null) {
            Boolean boolC = typeCheckerState.c(gVarO, gVarO2, z10);
            return boolC != null ? boolC.booleanValue() : abstractTypeChecker.u(typeCheckerState, pVarJ.M(gVarO), pVarJ.k0(gVarO2));
        }
        boolean zBooleanValue = boolF.booleanValue();
        typeCheckerState.c(gVarO, gVarO2, z10);
        return zBooleanValue;
    }

    private final si.n m(si.p pVar, si.g gVar, si.g gVar2) {
        si.g gVarE0;
        int iV = pVar.V(gVar);
        int i10 = 0;
        while (true) {
            if (i10 >= iV) {
                return null;
            }
            si.l lVarZ = pVar.Z(gVar, i10);
            si.l lVar = pVar.q(lVarZ) ^ true ? lVarZ : null;
            if (lVar != null && (gVarE0 = pVar.e0(lVar)) != null) {
                boolean z10 = pVar.l(pVar.o0(pVar.M(gVarE0))) && pVar.l(pVar.o0(pVar.M(gVar2)));
                if (kotlin.jvm.internal.f0.g(gVarE0, gVar2) || (z10 && kotlin.jvm.internal.f0.g(pVar.O(gVarE0), pVar.O(gVar2)))) {
                    return pVar.P(pVar.O(gVar), i10);
                }
                si.n nVarM = m(pVar, gVarE0, gVar2);
                if (nVarM != null) {
                    return nVarM;
                }
            }
            i10++;
        }
    }

    private final boolean n(TypeCheckerState typeCheckerState, si.i iVar) {
        si.p pVarJ = typeCheckerState.j();
        si.m mVarG = pVarJ.g(iVar);
        if (pVarJ.a0(mVarG)) {
            return pVarJ.D0(mVarG);
        }
        if (pVarJ.D0(pVarJ.g(iVar))) {
            return true;
        }
        typeCheckerState.k();
        ArrayDeque<si.i> arrayDequeH = typeCheckerState.h();
        kotlin.jvm.internal.f0.m(arrayDequeH);
        Set<si.i> setI = typeCheckerState.i();
        kotlin.jvm.internal.f0.m(setI);
        arrayDequeH.push(iVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + CollectionsKt___CollectionsKt.h3(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            si.i current = arrayDequeH.pop();
            kotlin.jvm.internal.f0.o(current, "current");
            if (setI.add(current)) {
                TypeCheckerState.b bVar = pVarJ.W(current) ? TypeCheckerState.b.c.f128027a : TypeCheckerState.b.C1180b.f128026a;
                if (!(!kotlin.jvm.internal.f0.g(bVar, TypeCheckerState.b.c.f128027a))) {
                    bVar = null;
                }
                if (bVar == null) {
                    continue;
                } else {
                    si.p pVarJ2 = typeCheckerState.j();
                    Iterator<si.g> it = pVarJ2.E(pVarJ2.g(current)).iterator();
                    while (it.hasNext()) {
                        si.i iVarA = bVar.a(typeCheckerState, it.next());
                        if (pVarJ.D0(pVarJ.g(iVarA))) {
                            typeCheckerState.e();
                            return true;
                        }
                        arrayDequeH.add(iVarA);
                    }
                }
            }
        }
        typeCheckerState.e();
        return false;
    }

    private final boolean o(si.p pVar, si.g gVar) {
        return (!pVar.r0(pVar.O(gVar)) || pVar.C(gVar) || pVar.H(gVar) || pVar.s(gVar) || !kotlin.jvm.internal.f0.g(pVar.g(pVar.M(gVar)), pVar.g(pVar.k0(gVar)))) ? false : true;
    }

    private final boolean p(si.p pVar, si.i iVar, si.i iVar2) {
        si.i iVarR;
        si.i iVarR2;
        si.c cVarB0 = pVar.B0(iVar);
        if (cVarB0 == null || (iVarR = pVar.r(cVarB0)) == null) {
            iVarR = iVar;
        }
        si.c cVarB1 = pVar.B0(iVar2);
        if (cVarB1 == null || (iVarR2 = pVar.r(cVarB1)) == null) {
            iVarR2 = iVar2;
        }
        if (pVar.g(iVarR) != pVar.g(iVarR2)) {
            return false;
        }
        if (pVar.H(iVar) || !pVar.H(iVar2)) {
            return !pVar.F(iVar) || pVar.F(iVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean t(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, si.g gVar, si.g gVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return abstractTypeChecker.s(typeCheckerState, gVar, gVar2, z10);
    }

    private final boolean u(final TypeCheckerState typeCheckerState, si.i iVar, final si.i iVar2) {
        si.g gVarE0;
        final si.p pVarJ = typeCheckerState.j();
        if (f127959b) {
            if (!pVarJ.b(iVar) && !pVarJ.Y(pVarJ.g(iVar))) {
                typeCheckerState.l(iVar);
            }
            if (!pVarJ.b(iVar2)) {
                typeCheckerState.l(iVar2);
            }
        }
        boolean z10 = false;
        if (!c.f128052a.d(typeCheckerState, iVar, iVar2)) {
            return false;
        }
        AbstractTypeChecker abstractTypeChecker = f127958a;
        Boolean boolA = abstractTypeChecker.a(typeCheckerState, pVarJ.M(iVar), pVarJ.k0(iVar2));
        if (boolA != null) {
            boolean zBooleanValue = boolA.booleanValue();
            TypeCheckerState.d(typeCheckerState, iVar, iVar2, false, 4, null);
            return zBooleanValue;
        }
        si.m mVarG = pVarJ.g(iVar2);
        boolean z11 = true;
        if ((pVarJ.w0(pVarJ.g(iVar), mVarG) && pVarJ.J(mVarG) == 0) || pVarJ.j0(pVarJ.g(iVar2))) {
            return true;
        }
        List<si.i> listL = abstractTypeChecker.l(typeCheckerState, iVar, mVarG);
        int i10 = 10;
        final ArrayList<si.i> arrayList = new ArrayList(kotlin.collections.t.Y(listL, 10));
        for (si.i iVar3 : listL) {
            si.i iVarC = pVarJ.c(typeCheckerState.o(iVar3));
            if (iVarC != null) {
                iVar3 = iVarC;
            }
            arrayList.add(iVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f127958a.n(typeCheckerState, iVar);
        }
        if (size == 1) {
            return f127958a.q(typeCheckerState, pVarJ.j((si.i) CollectionsKt___CollectionsKt.w2(arrayList)), iVar2);
        }
        ArgumentList argumentList = new ArgumentList(pVarJ.J(mVarG));
        int iJ = pVarJ.J(mVarG);
        int i11 = 0;
        boolean z12 = false;
        while (i11 < iJ) {
            z12 = (z12 || pVarJ.m0(pVarJ.P(mVarG, i11)) != TypeVariance.OUT) ? z11 : z10;
            if (!z12) {
                ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(arrayList, i10));
                for (si.i iVar4 : arrayList) {
                    si.l lVarX = pVarJ.X(iVar4, i11);
                    if (lVarX != null) {
                        if (!(pVarJ.m(lVarX) == TypeVariance.INV)) {
                            lVarX = null;
                        }
                        if (lVarX != null && (gVarE0 = pVarJ.e0(lVarX)) != null) {
                            arrayList2.add(gVarE0);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + iVar4 + ", subType: " + iVar + ", superType: " + iVar2).toString());
                }
                argumentList.add(pVarJ.t(pVarJ.G(arrayList2)));
            }
            i11++;
            z10 = false;
            z11 = true;
            i10 = 10;
        }
        if (z12 || !f127958a.q(typeCheckerState, argumentList, iVar2)) {
            return typeCheckerState.q(new yh.l<TypeCheckerState.a, b2>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(@dl.d TypeCheckerState.a runForkingPoint) {
                    kotlin.jvm.internal.f0.p(runForkingPoint, "$this$runForkingPoint");
                    for (final si.i iVar5 : arrayList) {
                        final TypeCheckerState typeCheckerState2 = typeCheckerState;
                        final si.p pVar = pVarJ;
                        final si.i iVar6 = iVar2;
                        runForkingPoint.a(new yh.a<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke() {
                                return Boolean.valueOf(AbstractTypeChecker.f127958a.q(typeCheckerState2, pVar.j(iVar5), iVar6));
                            }
                        });
                    }
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(TypeCheckerState.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            });
        }
        return true;
    }

    private final boolean v(si.p pVar, si.g gVar, si.g gVar2, si.m mVar) {
        si.n nVarL;
        si.i iVarC = pVar.c(gVar);
        if (!(iVarC instanceof si.b)) {
            return false;
        }
        si.b bVar = (si.b) iVarC;
        if (pVar.I(bVar) || !pVar.q(pVar.v0(pVar.y0(bVar))) || pVar.S(bVar) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        si.m mVarO = pVar.O(gVar2);
        si.t tVar = mVarO instanceof si.t ? (si.t) mVarO : null;
        return (tVar == null || (nVarL = pVar.L(tVar)) == null || !pVar.k(nVarL, mVar)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<si.i> w(TypeCheckerState typeCheckerState, List<? extends si.i> list) {
        si.p pVarJ = typeCheckerState.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            si.k kVarJ = pVarJ.j((si.i) next);
            int iN0 = pVarJ.n0(kVarJ);
            for (int i10 = 0; i10 < iN0; i10++) {
                if (!(pVarJ.D(pVarJ.e0(pVarJ.C0(kVarJ, i10))) == null)) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    @dl.e
    public final TypeVariance j(@dl.d TypeVariance declared, @dl.d TypeVariance useSite) {
        kotlin.jvm.internal.f0.p(declared, "declared");
        kotlin.jvm.internal.f0.p(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean k(@dl.d TypeCheckerState state, @dl.d si.g a10, @dl.d si.g b10) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(a10, "a");
        kotlin.jvm.internal.f0.p(b10, "b");
        si.p pVarJ = state.j();
        if (a10 == b10) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = f127958a;
        if (abstractTypeChecker.o(pVarJ, a10) && abstractTypeChecker.o(pVarJ, b10)) {
            si.g gVarO = state.o(state.p(a10));
            si.g gVarO2 = state.o(state.p(b10));
            si.i iVarM = pVarJ.M(gVarO);
            if (!pVarJ.w0(pVarJ.O(gVarO), pVarJ.O(gVarO2))) {
                return false;
            }
            if (pVarJ.V(iVarM) == 0) {
                return pVarJ.u0(gVarO) || pVarJ.u0(gVarO2) || pVarJ.F(iVarM) == pVarJ.F(pVarJ.M(gVarO2));
            }
        }
        return t(abstractTypeChecker, state, a10, b10, false, 8, null) && t(abstractTypeChecker, state, b10, a10, false, 8, null);
    }

    @dl.d
    public final List<si.i> l(@dl.d TypeCheckerState state, @dl.d si.i subType, @dl.d si.m superConstructor) {
        TypeCheckerState.b bVar;
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(subType, "subType");
        kotlin.jvm.internal.f0.p(superConstructor, "superConstructor");
        si.p pVarJ = state.j();
        if (pVarJ.W(subType)) {
            return f127958a.h(state, subType, superConstructor);
        }
        if (!pVarJ.a0(superConstructor) && !pVarJ.z(superConstructor)) {
            return f127958a.g(state, subType, superConstructor);
        }
        kotlin.reflect.jvm.internal.impl.utils.d<si.i> dVar = new kotlin.reflect.jvm.internal.impl.utils.d();
        state.k();
        ArrayDeque<si.i> arrayDequeH = state.h();
        kotlin.jvm.internal.f0.m(arrayDequeH);
        Set<si.i> setI = state.i();
        kotlin.jvm.internal.f0.m(setI);
        arrayDequeH.push(subType);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + CollectionsKt___CollectionsKt.h3(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            si.i current = arrayDequeH.pop();
            kotlin.jvm.internal.f0.o(current, "current");
            if (setI.add(current)) {
                if (pVarJ.W(current)) {
                    dVar.add(current);
                    bVar = TypeCheckerState.b.c.f128027a;
                } else {
                    bVar = TypeCheckerState.b.C1180b.f128026a;
                }
                if (!(!kotlin.jvm.internal.f0.g(bVar, TypeCheckerState.b.c.f128027a))) {
                    bVar = null;
                }
                if (bVar != null) {
                    si.p pVarJ2 = state.j();
                    Iterator<si.g> it = pVarJ2.E(pVarJ2.g(current)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(bVar.a(state, it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (si.i it2 : dVar) {
            AbstractTypeChecker abstractTypeChecker = f127958a;
            kotlin.jvm.internal.f0.o(it2, "it");
            kotlin.collections.x.n0(arrayList, abstractTypeChecker.h(state, it2, superConstructor));
        }
        return arrayList;
    }

    public final boolean q(@dl.d TypeCheckerState typeCheckerState, @dl.d si.k capturedSubArguments, @dl.d si.i superType) {
        boolean zK;
        kotlin.jvm.internal.f0.p(typeCheckerState, "<this>");
        kotlin.jvm.internal.f0.p(capturedSubArguments, "capturedSubArguments");
        kotlin.jvm.internal.f0.p(superType, "superType");
        si.p pVarJ = typeCheckerState.j();
        si.m mVarG = pVarJ.g(superType);
        int iN0 = pVarJ.n0(capturedSubArguments);
        int iJ = pVarJ.J(mVarG);
        if (iN0 != iJ || iN0 != pVarJ.V(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iJ; i10++) {
            si.l lVarZ = pVarJ.Z(superType, i10);
            if (!pVarJ.q(lVarZ)) {
                si.g gVarE0 = pVarJ.e0(lVarZ);
                si.l lVarC0 = pVarJ.C0(capturedSubArguments, i10);
                pVarJ.m(lVarC0);
                TypeVariance typeVariance = TypeVariance.INV;
                si.g gVarE1 = pVarJ.e0(lVarC0);
                AbstractTypeChecker abstractTypeChecker = f127958a;
                TypeVariance typeVarianceJ = abstractTypeChecker.j(pVarJ.m0(pVarJ.P(mVarG, i10)), pVarJ.m(lVarZ));
                if (typeVarianceJ == null) {
                    return typeCheckerState.m();
                }
                if (typeVarianceJ == typeVariance && (abstractTypeChecker.v(pVarJ, gVarE1, gVarE0, mVarG) || abstractTypeChecker.v(pVarJ, gVarE0, gVarE1, mVarG))) {
                    continue;
                } else {
                    if (typeCheckerState.f128021g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + gVarE1).toString());
                    }
                    typeCheckerState.f128021g++;
                    int i11 = a.f127960a[typeVarianceJ.ordinal()];
                    if (i11 == 1) {
                        zK = abstractTypeChecker.k(typeCheckerState, gVarE1, gVarE0);
                    } else if (i11 == 2) {
                        zK = t(abstractTypeChecker, typeCheckerState, gVarE1, gVarE0, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zK = t(abstractTypeChecker, typeCheckerState, gVarE0, gVarE1, false, 8, null);
                    }
                    typeCheckerState.f128021g--;
                    if (!zK) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @xh.i
    public final boolean r(@dl.d TypeCheckerState state, @dl.d si.g subType, @dl.d si.g superType) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(subType, "subType");
        kotlin.jvm.internal.f0.p(superType, "superType");
        return t(this, state, subType, superType, false, 8, null);
    }

    @xh.i
    public final boolean s(@dl.d TypeCheckerState state, @dl.d si.g subType, @dl.d si.g superType, boolean z10) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(subType, "subType");
        kotlin.jvm.internal.f0.p(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return i(state, subType, superType, z10);
        }
        return false;
    }
}
