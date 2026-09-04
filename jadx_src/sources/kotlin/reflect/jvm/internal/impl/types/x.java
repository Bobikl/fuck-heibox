package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;

/* JADX INFO: compiled from: expandedTypeUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x {
    @dl.e
    public static final si.g a(@dl.d h1 h1Var, @dl.d si.g inlineClassType) {
        kotlin.jvm.internal.f0.p(h1Var, "<this>");
        kotlin.jvm.internal.f0.p(inlineClassType, "inlineClassType");
        return b(h1Var, inlineClassType, new HashSet());
    }

    private static final si.g b(h1 h1Var, si.g gVar, HashSet<si.m> hashSet) {
        si.g gVarB;
        si.g gVarT;
        si.m mVarO = h1Var.O(gVar);
        if (!hashSet.add(mVarO)) {
            return null;
        }
        si.n nVarC0 = h1Var.c0(mVarO);
        if (nVarC0 != null) {
            si.g gVarN = h1Var.n(nVarC0);
            gVarB = b(h1Var, gVarN, hashSet);
            if (gVarB == null) {
                return null;
            }
            boolean z10 = h1Var.b0(h1Var.O(gVarN)) || ((gVarN instanceof si.i) && h1Var.x((si.i) gVarN));
            if ((gVarB instanceof si.i) && h1Var.x((si.i) gVarB) && h1Var.w(gVar) && z10) {
                gVarT = h1Var.T(gVarN);
            } else if (!h1Var.w(gVarB) && h1Var.F0(gVar)) {
                gVarT = h1Var.T(gVarB);
            }
            return gVarT;
        }
        if (!h1Var.b0(mVarO)) {
            return gVar;
        }
        si.g gVarA0 = h1Var.A0(gVar);
        if (gVarA0 == null || (gVarB = b(h1Var, gVarA0, hashSet)) == null) {
            return null;
        }
        if (h1Var.w(gVar)) {
            if (h1Var.w(gVarB)) {
                return gVar;
            }
            return ((gVarB instanceof si.i) && h1Var.x((si.i) gVarB)) ? gVar : h1Var.T(gVarB);
        }
        return gVarB;
    }
}
