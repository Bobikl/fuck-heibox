package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.z0;
import si.n;
import si.t;
import yh.p;

/* JADX INFO: compiled from: OverridingUtilTypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements kotlin.reflect.jvm.internal.impl.types.checker.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final Map<z0, z0> f127560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.e.a f127561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f127562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final KotlinTypePreparator f127563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final p<d0, d0, Boolean> f127564e;

    /* JADX INFO: compiled from: OverridingUtilTypeSystemContext.kt */
    public static final class a extends TypeCheckerState {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ i f127565k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, i iVar, KotlinTypePreparator kotlinTypePreparator, kotlin.reflect.jvm.internal.impl.types.checker.f fVar) {
            super(z10, z11, true, iVar, kotlinTypePreparator, fVar);
            this.f127565k = iVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
        public boolean f(@dl.d si.g subType, @dl.d si.g superType) {
            f0.p(subType, "subType");
            f0.p(superType, "superType");
            if (!(subType instanceof d0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (superType instanceof d0) {
                return ((Boolean) this.f127565k.f127564e.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@dl.e Map<z0, ? extends z0> map, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.e.a equalityAxioms, @dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner, @dl.d KotlinTypePreparator kotlinTypePreparator, @dl.e p<? super d0, ? super d0, Boolean> pVar) {
        f0.p(equalityAxioms, "equalityAxioms");
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        f0.p(kotlinTypePreparator, "kotlinTypePreparator");
        this.f127560a = map;
        this.f127561b = equalityAxioms;
        this.f127562c = kotlinTypeRefiner;
        this.f127563d = kotlinTypePreparator;
        this.f127564e = pVar;
    }

    private final boolean H0(z0 z0Var, z0 z0Var2) {
        if (this.f127561b.a(z0Var, z0Var2)) {
            return true;
        }
        Map<z0, z0> map = this.f127560a;
        if (map == null) {
            return false;
        }
        z0 z0Var3 = map.get(z0Var);
        z0 z0Var4 = this.f127560a.get(z0Var2);
        if (z0Var3 == null || !f0.g(z0Var3, z0Var2)) {
            return z0Var4 != null && f0.g(z0Var4, z0Var);
        }
        return true;
    }

    @Override // si.p
    @dl.d
    public List<si.g> A(@dl.d n nVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.z(this, nVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.e
    public si.g A0(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.y(this, gVar);
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
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.e(this, iVar);
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
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.g(this, gVar);
    }

    @Override // si.p
    public boolean D0(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.Q(this, mVar);
    }

    @Override // si.p
    @dl.d
    public Collection<si.g> E(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.l0(this, mVar);
    }

    @Override // si.p
    @dl.d
    public si.g E0(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.e0(this, gVar);
    }

    @Override // si.p
    public boolean F(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.O(this, iVar);
    }

    @Override // si.p
    public boolean F0(si.g gVar) {
        f0.p(gVar, "<this>");
        return (gVar instanceof si.i) && F((si.i) gVar);
    }

    @Override // si.p
    @dl.d
    public si.g G(@dl.d List<? extends si.g> list) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.F(this, list);
    }

    @Override // si.p
    public boolean H(si.g gVar) {
        f0.p(gVar, "<this>");
        si.i iVarC = c(gVar);
        return (iVarC != null ? B0(iVarC) : null) != null;
    }

    @Override // si.p
    public boolean I(@dl.d si.b bVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.S(this, bVar);
    }

    @dl.d
    public TypeCheckerState I0(boolean z10, boolean z11) {
        if (this.f127564e != null) {
            return new a(z10, z11, this, this.f127563d, this.f127562c);
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.a.a(z10, z11, this, this.f127563d, this.f127562c);
    }

    @Override // si.p
    public int J(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.h0(this, mVar);
    }

    @Override // si.p
    public boolean K(@dl.d si.b bVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.U(this, bVar);
    }

    @Override // si.p
    @dl.e
    public n L(@dl.d t tVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.w(this, tVar);
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
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.s(this, mVar);
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
    public n P(@dl.d si.m mVar, int i10) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.q(this, mVar, i10);
    }

    @Override // si.p
    @dl.e
    public si.g Q(@dl.d si.b bVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.d0(this, bVar);
    }

    @Override // si.p
    @dl.d
    public List<n> R(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.r(this, mVar);
    }

    @Override // si.p
    @dl.d
    public CaptureStatus S(@dl.d si.b bVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.l(this, bVar);
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
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.I(this, mVar);
    }

    @Override // si.p
    public int V(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.b(this, gVar);
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
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.N(this, mVar);
    }

    @Override // si.p
    @dl.d
    public si.l Z(@dl.d si.g gVar, int i10) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.n(this, gVar, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.d
    public si.i a(@dl.d si.i iVar, boolean z10) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.q0(this, iVar, z10);
    }

    @Override // si.p
    public boolean a0(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.H(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    public boolean b(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.V(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean b0(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.L(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.e
    public si.i c(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.i(this, gVar);
    }

    @Override // si.p
    @dl.e
    public n c0(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.x(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.d
    public si.i d(@dl.d si.e eVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.c0(this, eVar);
    }

    @Override // si.s
    public boolean d0(@dl.d si.i iVar, @dl.d si.i iVar2) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.E(this, iVar, iVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.e
    public si.b e(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.d(this, iVar);
    }

    @Override // si.p
    @dl.d
    public si.g e0(@dl.d si.l lVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.v(this, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.d
    public si.i f(@dl.d si.e eVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.o0(this, eVar);
    }

    @Override // si.p
    public boolean f0(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.K(this, gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, si.p
    @dl.d
    public si.m g(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.n0(this, iVar);
    }

    @Override // si.p
    public boolean g0(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.Y(this, iVar);
    }

    @Override // si.p
    @dl.e
    public si.d h(@dl.d si.e eVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.f(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.d h0(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.p(this, mVar);
    }

    @Override // si.p
    @dl.e
    public si.i i(@dl.d si.i iVar, @dl.d CaptureStatus captureStatus) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.k(this, iVar, captureStatus);
    }

    @Override // si.p
    public boolean i0(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.Z(this, iVar);
    }

    @Override // si.p
    @dl.d
    public si.k j(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.c(this, iVar);
    }

    @Override // si.p
    public boolean j0(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.G(this, mVar);
    }

    @Override // si.p
    public boolean k(@dl.d n nVar, @dl.e si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.D(this, nVar, mVar);
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
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.t(this, mVar);
    }

    @Override // si.p
    @dl.d
    public TypeVariance m(@dl.d si.l lVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.A(this, lVar);
    }

    @Override // si.p
    @dl.d
    public TypeVariance m0(@dl.d n nVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.B(this, nVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @dl.d
    public si.g n(@dl.d n nVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.u(this, nVar);
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
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.o(this, gVar);
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
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.b0(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    @dl.d
    public si.g p0(@dl.d si.i iVar, @dl.d si.i iVar2) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.m(this, iVar, iVar2);
    }

    @Override // si.p
    public boolean q(@dl.d si.l lVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.X(this, lVar);
    }

    @Override // si.p
    @dl.d
    public Collection<si.g> q0(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.i0(this, iVar);
    }

    @Override // si.p
    @dl.d
    public si.i r(@dl.d si.c cVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.g0(this, cVar);
    }

    @Override // si.p
    public boolean r0(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.J(this, mVar);
    }

    @Override // si.p
    public boolean s(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.P(this, gVar);
    }

    @Override // si.p
    public boolean s0(si.i iVar) {
        f0.p(iVar, "<this>");
        return z(g(iVar));
    }

    @Override // si.p
    @dl.d
    public si.l t(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.j(this, gVar);
    }

    @Override // si.p
    @dl.d
    public TypeCheckerState.b t0(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.k0(this, iVar);
    }

    @Override // si.p
    @dl.d
    public si.g u(@dl.d si.g gVar, boolean z10) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.p0(this, gVar, z10);
    }

    @Override // si.p
    public boolean u0(si.g gVar) {
        f0.p(gVar, "<this>");
        return F(M(gVar)) != F(k0(gVar));
    }

    @Override // si.p
    public boolean v(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.a0(this, gVar);
    }

    @Override // si.p
    @dl.d
    public si.l v0(@dl.d si.a aVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.j0(this, aVar);
    }

    @Override // si.p
    public boolean w(@dl.d si.g gVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.R(this, gVar);
    }

    @Override // si.p
    public boolean w0(@dl.d si.m c10, @dl.d si.m c11) {
        f0.p(c10, "c1");
        f0.p(c11, "c2");
        if (!(c10 instanceof z0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c11 instanceof z0) {
            return kotlin.reflect.jvm.internal.impl.types.checker.b.a.a(this, c10, c11) || H0((z0) c10, (z0) c11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // si.p
    public boolean x(@dl.d si.i iVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.T(this, iVar);
    }

    @Override // si.p
    public boolean x0(si.g gVar) {
        f0.p(gVar, "<this>");
        return D0(O(gVar)) && !w(gVar);
    }

    @Override // si.p
    @dl.e
    public si.h y(@dl.d si.e eVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.h(this, eVar);
    }

    @Override // si.p
    @dl.d
    public si.a y0(@dl.d si.b bVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.m0(this, bVar);
    }

    @Override // si.p
    public boolean z(@dl.d si.m mVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.M(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean z0(@dl.d si.g gVar, @dl.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return kotlin.reflect.jvm.internal.impl.types.checker.b.a.C(this, gVar, cVar);
    }
}
