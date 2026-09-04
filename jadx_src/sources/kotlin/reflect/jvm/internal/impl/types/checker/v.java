package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v {
    private static final d0 a(d0 d0Var) {
        return CapturedTypeApproximationKt.a(d0Var).d();
    }

    private static final String b(z0 z0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + z0Var, sb2);
        c("hashCode: " + z0Var.hashCode(), sb2);
        c("javaClass: " + z0Var.getClass().getCanonicalName(), sb2);
        for (kotlin.reflect.jvm.internal.impl.descriptors.k kVarD = z0Var.d(); kVarD != null; kVarD = kVarD.c()) {
            c("fqName: " + DescriptorRenderer.f127417g.s(kVarD), sb2);
            c("javaClass: " + kVarD.getClass().getCanonicalName(), sb2);
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        f0.p(str, "<this>");
        sb2.append(str);
        f0.o(sb2, "append(value)");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }

    @dl.e
    public static final d0 d(@dl.d d0 subtype, @dl.d d0 supertype, @dl.d t typeCheckingProcedureCallbacks) {
        boolean z10;
        f0.p(subtype, "subtype");
        f0.p(supertype, "supertype");
        f0.p(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new q(subtype, null));
        z0 z0VarO0 = supertype.O0();
        while (!arrayDeque.isEmpty()) {
            q qVar = (q) arrayDeque.poll();
            d0 d0VarB = qVar.b();
            z0 z0VarO1 = d0VarB.O0();
            if (typeCheckingProcedureCallbacks.a(z0VarO1, z0VarO0)) {
                boolean zP0 = d0VarB.P0();
                for (q qVarA = qVar.a(); qVarA != null; qVarA = qVarA.a()) {
                    d0 d0VarB2 = qVarA.b();
                    List<c1> listM0 = d0VarB2.M0();
                    if (!(listM0 instanceof Collection) || !listM0.isEmpty()) {
                        Iterator<T> it = listM0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z10 = false;
                                break;
                            }
                            if (((c1) it.next()).c() != Variance.INVARIANT) {
                                z10 = true;
                                break;
                            }
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        d0 d0VarN = CapturedTypeConstructorKt.f(a1.f128047c.a(d0VarB2), false, 1, null).c().n(d0VarB, Variance.INVARIANT);
                        f0.o(d0VarN, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        d0VarB = a(d0VarN);
                    } else {
                        d0VarB = a1.f128047c.a(d0VarB2).c().n(d0VarB, Variance.INVARIANT);
                        f0.o(d0VarB, "{\n                    Ty…ARIANT)\n                }");
                    }
                    zP0 = zP0 || d0VarB2.P0();
                }
                z0 z0VarO2 = d0VarB.O0();
                if (typeCheckingProcedureCallbacks.a(z0VarO2, z0VarO0)) {
                    return i1.p(d0VarB, zP0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(z0VarO2) + ", \n\nsupertype: " + b(z0VarO0) + " \n" + typeCheckingProcedureCallbacks.a(z0VarO2, z0VarO0));
            }
            for (d0 immediateSupertype : z0VarO1.l()) {
                f0.o(immediateSupertype, "immediateSupertype");
                arrayDeque.add(new q(immediateSupertype, qVar));
            }
        }
        return null;
    }
}
