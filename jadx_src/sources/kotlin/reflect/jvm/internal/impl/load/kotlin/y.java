package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y {
    @dl.d
    public static final <T> T a(@dl.d k<T> kVar, @dl.d T possiblyPrimitiveType, boolean z10) {
        f0.p(kVar, "<this>");
        f0.p(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? kVar.c(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    @dl.e
    public static final <T> T b(@dl.d h1 h1Var, @dl.d si.g type, @dl.d k<T> typeFactory, @dl.d x mode) {
        f0.p(h1Var, "<this>");
        f0.p(type, "type");
        f0.p(typeFactory, "typeFactory");
        f0.p(mode, "mode");
        si.m mVarO = h1Var.O(type);
        if (!h1Var.a0(mVarO)) {
            return null;
        }
        PrimitiveType primitiveTypeL0 = h1Var.l0(mVarO);
        boolean z10 = true;
        if (primitiveTypeL0 != null) {
            T tD = typeFactory.d(primitiveTypeL0);
            if (!h1Var.w(type) && !kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m.c(h1Var, type)) {
                z10 = false;
            }
            return (T) a(typeFactory, tD, z10);
        }
        PrimitiveType primitiveTypeN = h1Var.N(mVarO);
        if (primitiveTypeN != null) {
            return typeFactory.a('[' + JvmPrimitiveType.get(primitiveTypeN).getDesc());
        }
        if (h1Var.p(mVarO)) {
            kotlin.reflect.jvm.internal.impl.name.d dVarH0 = h1Var.h0(mVarO);
            kotlin.reflect.jvm.internal.impl.name.b bVarN = dVarH0 != null ? kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a.n(dVarH0) : null;
            if (bVarN != null) {
                if (!mode.a()) {
                    List<kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a> listI = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a.i();
                    if (!(listI instanceof Collection) || !listI.isEmpty()) {
                        Iterator<T> it = listI.iterator();
                        do {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                        } while (!f0.g(((kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a) it.next()).d(), bVarN));
                    } else {
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        return null;
                    }
                }
                String strF = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(bVarN).f();
                f0.o(strF, "byClassId(classId).internalName");
                return typeFactory.f(strF);
            }
        }
        return null;
    }
}
