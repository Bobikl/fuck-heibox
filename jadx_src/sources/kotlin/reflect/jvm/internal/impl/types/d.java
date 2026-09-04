package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: AbstractStrictEqualityTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f128095a = new d();

    private d() {
    }

    private final boolean a(si.p pVar, si.i iVar, si.i iVar2) {
        if (pVar.V(iVar) == pVar.V(iVar2) && pVar.F(iVar) == pVar.F(iVar2)) {
            if ((pVar.B0(iVar) == null) == (pVar.B0(iVar2) == null) && pVar.w0(pVar.g(iVar), pVar.g(iVar2))) {
                if (pVar.d0(iVar, iVar2)) {
                    return true;
                }
                int iV = pVar.V(iVar);
                for (int i10 = 0; i10 < iV; i10++) {
                    si.l lVarZ = pVar.Z(iVar, i10);
                    si.l lVarZ2 = pVar.Z(iVar2, i10);
                    if (pVar.q(lVarZ) != pVar.q(lVarZ2)) {
                        return false;
                    }
                    if (!pVar.q(lVarZ) && (pVar.m(lVarZ) != pVar.m(lVarZ2) || !c(pVar, pVar.e0(lVarZ), pVar.e0(lVarZ2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(si.p pVar, si.g gVar, si.g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        si.i iVarC = pVar.c(gVar);
        si.i iVarC2 = pVar.c(gVar2);
        if (iVarC != null && iVarC2 != null) {
            return a(pVar, iVarC, iVarC2);
        }
        si.e eVarD = pVar.D(gVar);
        si.e eVarD2 = pVar.D(gVar2);
        if (eVarD == null || eVarD2 == null) {
            return false;
        }
        return a(pVar, pVar.d(eVarD), pVar.d(eVarD2)) && a(pVar, pVar.f(eVarD), pVar.f(eVarD2));
    }

    public final boolean b(@dl.d si.p context, @dl.d si.g a10, @dl.d si.g b10) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(a10, "a");
        kotlin.jvm.internal.f0.p(b10, "b");
        return c(context, a10, b10);
    }
}
