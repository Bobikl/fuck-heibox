package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o f128088a = new o();

    private o() {
    }

    @Override // si.p
    @dl.d
    public List<si.g> A(@dl.d si.n nVar) {
        return b.a.z(this, nVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.e
    public si.g A0(@dl.d si.g gVar) {
        return b.a.y(this, gVar);
    }

    @Override // si.p
    @dl.e
    public List<si.i> B(si.i iVar, si.m constructor) {
        f0.p(iVar, "<this>");
        f0.p(constructor, "constructor");
        return null;
    }

    @Override // si.p
    @dl.e
    public si.c B0(@dl.d si.i iVar) {
        return b.a.e(this, iVar);
    }

    @Override // si.p
    public boolean C(si.g gVar) {
        f0.p(gVar, "<this>");
        si.e eVarD = D(gVar);
        return (eVarD != null ? h(eVarD) : null) != null;
    }

    @Override // si.p
    @dl.d
    public si.l C0(si.k kVar, int i10) {
        f0.p(kVar, "<this>");
        if (kVar instanceof si.i) {
            return Z((si.g) kVar, i10);
        }
        if (kVar instanceof ArgumentList) {
            si.l lVar = ((ArgumentList) kVar).get(i10);
            f0.o(lVar, "get(index)");
            return lVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + n0.d(kVar.getClass())).toString());
    }

    @Override // si.p
    @dl.e
    public si.e D(@dl.d si.g gVar) {
        return b.a.g(this, gVar);
    }

    @Override // si.p
    public boolean D0(@dl.d si.m mVar) {
        return b.a.Q(this, mVar);
    }

    @Override // si.p
    @dl.d
    public Collection<si.g> E(@dl.d si.m mVar) {
        return b.a.l0(this, mVar);
    }

    @Override // si.p
    @dl.d
    public si.g E0(@dl.d si.g gVar) {
        return b.a.e0(this, gVar);
    }

    @Override // si.p
    public boolean F(@dl.d si.i iVar) {
        return b.a.O(this, iVar);
    }

    @Override // si.p
    public boolean F0(si.g gVar) {
        f0.p(gVar, "<this>");
        return (gVar instanceof si.i) && F((si.i) gVar);
    }

    @Override // si.p
    @dl.d
    public si.g G(@dl.d List<? extends si.g> list) {
        return b.a.F(this, list);
    }

    @dl.d
    public TypeCheckerState G0(boolean z10, boolean z11) {
        return b.a.f0(this, z10, z11);
    }

    @Override // si.p
    public boolean H(si.g gVar) {
        f0.p(gVar, "<this>");
        si.i iVarC = c(gVar);
        return (iVarC != null ? B0(iVarC) : null) != null;
    }

    @Override // si.p
    public boolean I(@dl.d si.b bVar) {
        return b.a.S(this, bVar);
    }

    @Override // si.p
    public int J(@dl.d si.m mVar) {
        return b.a.h0(this, mVar);
    }

    @Override // si.p
    public boolean K(@dl.d si.b bVar) {
        return b.a.U(this, bVar);
    }

    @Override // si.p
    @dl.e
    public si.n L(@dl.d si.t tVar) {
        return b.a.w(this, tVar);
    }

    @Override // si.p
    @dl.d
    public si.i M(si.g gVar) {
        si.i iVarD;
        f0.p(gVar, "<this>");
        si.e eVarD = D(gVar);
        if (eVarD != null && (iVarD = d(eVarD)) != null) {
            return iVarD;
        }
        si.i iVarC = c(gVar);
        f0.m(iVarC);
        return iVarC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.e
    public PrimitiveType N(@dl.d si.m mVar) {
        return b.a.s(this, mVar);
    }

    @Override // si.p
    @dl.d
    public si.m O(si.g gVar) {
        f0.p(gVar, "<this>");
        si.i iVarC = c(gVar);
        if (iVarC == null) {
            iVarC = M(gVar);
        }
        return g(iVarC);
    }

    @Override // si.p
    @dl.d
    public si.n P(@dl.d si.m mVar, int i10) {
        return b.a.q(this, mVar, i10);
    }

    @Override // si.p
    @dl.e
    public si.g Q(@dl.d si.b bVar) {
        return b.a.d0(this, bVar);
    }

    @Override // si.p
    @dl.d
    public List<si.n> R(@dl.d si.m mVar) {
        return b.a.r(this, mVar);
    }

    @Override // si.p
    @dl.d
    public CaptureStatus S(@dl.d si.b bVar) {
        return b.a.l(this, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.d
    public si.g T(si.g gVar) {
        si.i iVarA;
        f0.p(gVar, "<this>");
        si.i iVarC = c(gVar);
        return (iVarC == null || (iVarA = a(iVarC, true)) == null) ? gVar : iVarA;
    }

    @Override // si.p
    public boolean U(@dl.d si.m mVar) {
        return b.a.I(this, mVar);
    }

    @Override // si.p
    public int V(@dl.d si.g gVar) {
        return b.a.b(this, gVar);
    }

    @Override // si.p
    public boolean W(si.i iVar) {
        f0.p(iVar, "<this>");
        return a0(g(iVar));
    }

    @Override // si.p
    @dl.e
    public si.l X(si.i iVar, int i10) {
        f0.p(iVar, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < V(iVar)) {
            z10 = true;
        }
        if (z10) {
            return Z(iVar, i10);
        }
        return null;
    }

    @Override // si.p
    public boolean Y(@dl.d si.m mVar) {
        return b.a.N(this, mVar);
    }

    @Override // si.p
    @dl.d
    public si.l Z(@dl.d si.g gVar, int i10) {
        return b.a.n(this, gVar, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.d
    public si.i a(@dl.d si.i iVar, boolean z10) {
        return b.a.q0(this, iVar, z10);
    }

    @Override // si.p
    public boolean a0(@dl.d si.m mVar) {
        return b.a.H(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    public boolean b(@dl.d si.i iVar) {
        return b.a.V(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean b0(@dl.d si.m mVar) {
        return b.a.L(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.e
    public si.i c(@dl.d si.g gVar) {
        return b.a.i(this, gVar);
    }

    @Override // si.p
    @dl.e
    public si.n c0(@dl.d si.m mVar) {
        return b.a.x(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.d
    public si.i d(@dl.d si.e eVar) {
        return b.a.c0(this, eVar);
    }

    @Override // si.s
    public boolean d0(@dl.d si.i iVar, @dl.d si.i iVar2) {
        return b.a.E(this, iVar, iVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.e
    public si.b e(@dl.d si.i iVar) {
        return b.a.d(this, iVar);
    }

    @Override // si.p
    @dl.d
    public si.g e0(@dl.d si.l lVar) {
        return b.a.v(this, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.d
    public si.i f(@dl.d si.e eVar) {
        return b.a.o0(this, eVar);
    }

    @Override // si.p
    public boolean f0(@dl.d si.g gVar) {
        return b.a.K(this, gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.d
    public si.m g(@dl.d si.i iVar) {
        return b.a.n0(this, iVar);
    }

    @Override // si.p
    public boolean g0(@dl.d si.i iVar) {
        return b.a.Y(this, iVar);
    }

    @Override // si.p
    @dl.e
    public si.d h(@dl.d si.e eVar) {
        return b.a.f(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.d h0(@dl.d si.m mVar) {
        return b.a.p(this, mVar);
    }

    @Override // si.p
    @dl.e
    public si.i i(@dl.d si.i iVar, @dl.d CaptureStatus captureStatus) {
        return b.a.k(this, iVar, captureStatus);
    }

    @Override // si.p
    public boolean i0(@dl.d si.i iVar) {
        return b.a.Z(this, iVar);
    }

    @Override // si.p
    @dl.d
    public si.k j(@dl.d si.i iVar) {
        return b.a.c(this, iVar);
    }

    @Override // si.p
    public boolean j0(@dl.d si.m mVar) {
        return b.a.G(this, mVar);
    }

    @Override // si.p
    public boolean k(@dl.d si.n nVar, @dl.e si.m mVar) {
        return b.a.D(this, nVar, mVar);
    }

    @Override // si.p
    @dl.d
    public si.i k0(si.g gVar) {
        si.i iVarF;
        f0.p(gVar, "<this>");
        si.e eVarD = D(gVar);
        if (eVarD != null && (iVarF = f(eVarD)) != null) {
            return iVarF;
        }
        si.i iVarC = c(gVar);
        f0.m(iVarC);
        return iVarC;
    }

    @Override // si.p
    public boolean l(si.g gVar) {
        f0.p(gVar, "<this>");
        si.i iVarC = c(gVar);
        return (iVarC != null ? e(iVarC) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.e
    public PrimitiveType l0(@dl.d si.m mVar) {
        return b.a.t(this, mVar);
    }

    @Override // si.p
    @dl.d
    public TypeVariance m(@dl.d si.l lVar) {
        return b.a.A(this, lVar);
    }

    @Override // si.p
    @dl.d
    public TypeVariance m0(@dl.d si.n nVar) {
        return b.a.B(this, nVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.d
    public si.g n(@dl.d si.n nVar) {
        return b.a.u(this, nVar);
    }

    @Override // si.p
    public int n0(si.k kVar) {
        f0.p(kVar, "<this>");
        if (kVar instanceof si.i) {
            return V((si.g) kVar);
        }
        if (kVar instanceof ArgumentList) {
            return ((ArgumentList) kVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + n0.d(kVar.getClass())).toString());
    }

    @Override // si.p
    @dl.d
    public List<si.l> o(@dl.d si.g gVar) {
        return b.a.o(this, gVar);
    }

    @Override // si.p
    @dl.d
    public si.i o0(si.i iVar) {
        si.i iVarR;
        f0.p(iVar, "<this>");
        si.c cVarB0 = B0(iVar);
        return (cVarB0 == null || (iVarR = r(cVarB0)) == null) ? iVar : iVarR;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean p(@dl.d si.m mVar) {
        return b.a.b0(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @dl.d
    public si.g p0(@dl.d si.i iVar, @dl.d si.i iVar2) {
        return b.a.m(this, iVar, iVar2);
    }

    @Override // si.p
    public boolean q(@dl.d si.l lVar) {
        return b.a.X(this, lVar);
    }

    @Override // si.p
    @dl.d
    public Collection<si.g> q0(@dl.d si.i iVar) {
        return b.a.i0(this, iVar);
    }

    @Override // si.p
    @dl.d
    public si.i r(@dl.d si.c cVar) {
        return b.a.g0(this, cVar);
    }

    @Override // si.p
    public boolean r0(@dl.d si.m mVar) {
        return b.a.J(this, mVar);
    }

    @Override // si.p
    public boolean s(@dl.d si.g gVar) {
        return b.a.P(this, gVar);
    }

    @Override // si.p
    public boolean s0(si.i iVar) {
        f0.p(iVar, "<this>");
        return z(g(iVar));
    }

    @Override // si.p
    @dl.d
    public si.l t(@dl.d si.g gVar) {
        return b.a.j(this, gVar);
    }

    @Override // si.p
    @dl.d
    public TypeCheckerState.b t0(@dl.d si.i iVar) {
        return b.a.k0(this, iVar);
    }

    @Override // si.p
    @dl.d
    public si.g u(@dl.d si.g gVar, boolean z10) {
        return b.a.p0(this, gVar, z10);
    }

    @Override // si.p
    public boolean u0(si.g gVar) {
        f0.p(gVar, "<this>");
        return F(M(gVar)) != F(k0(gVar));
    }

    @Override // si.p
    public boolean v(@dl.d si.g gVar) {
        return b.a.a0(this, gVar);
    }

    @Override // si.p
    @dl.d
    public si.l v0(@dl.d si.a aVar) {
        return b.a.j0(this, aVar);
    }

    @Override // si.p
    public boolean w(@dl.d si.g gVar) {
        return b.a.R(this, gVar);
    }

    @Override // si.p
    public boolean w0(@dl.d si.m mVar, @dl.d si.m mVar2) {
        return b.a.a(this, mVar, mVar2);
    }

    @Override // si.p
    public boolean x(@dl.d si.i iVar) {
        return b.a.T(this, iVar);
    }

    @Override // si.p
    public boolean x0(si.g gVar) {
        f0.p(gVar, "<this>");
        return D0(O(gVar)) && !w(gVar);
    }

    @Override // si.p
    @dl.e
    public si.h y(@dl.d si.e eVar) {
        return b.a.h(this, eVar);
    }

    @Override // si.p
    @dl.d
    public si.a y0(@dl.d si.b bVar) {
        return b.a.m0(this, bVar);
    }

    @Override // si.p
    public boolean z(@dl.d si.m mVar) {
        return b.a.M(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean z0(@dl.d si.g gVar, @dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return b.a.C(this, gVar, cVar);
    }
}
