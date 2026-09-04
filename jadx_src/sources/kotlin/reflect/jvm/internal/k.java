package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.i1;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    public static final kotlin.reflect.jvm.internal.calls.c<?> b(KPropertyImpl.a<?, ?> aVar, boolean z10) {
        JvmFunctionSignature.c cVarC;
        Method methodC;
        kotlin.reflect.jvm.internal.calls.c aVar2;
        JvmProtoBuf.JvmMethodSignature jvmMethodSignatureD;
        kotlin.reflect.jvm.internal.calls.c cVar;
        Method methodF;
        if (KDeclarationContainerImpl.f125156b.a().k(aVar.a().S())) {
            return kotlin.reflect.jvm.internal.calls.i.f125315a;
        }
        h hVarF = p.f128319a.f(aVar.a().L());
        if (hVarF instanceof h.c) {
            h.c cVar2 = (h.c) hVarF;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignatureF = cVar2.f();
            if (z10) {
                if (jvmPropertySignatureF.H()) {
                    jvmMethodSignatureD = jvmPropertySignatureF.C();
                } else {
                    jvmMethodSignatureD = null;
                }
            } else if (jvmPropertySignatureF.J()) {
                jvmMethodSignatureD = jvmPropertySignatureF.D();
            } else {
                jvmMethodSignatureD = null;
            }
            Method methodJ = jvmMethodSignatureD != null ? aVar.a().w().J(cVar2.d().getString(jvmMethodSignatureD.y()), cVar2.d().getString(jvmMethodSignatureD.x())) : null;
            if (methodJ != null) {
                if (!Modifier.isStatic(methodJ.getModifiers())) {
                    cVar = aVar.J() ? new kotlin.reflect.jvm.internal.calls.d.h.a(methodJ, f(aVar)) : new kotlin.reflect.jvm.internal.calls.d.h.C1137d(methodJ);
                } else if (d(aVar)) {
                    cVar = aVar.J() ? new kotlin.reflect.jvm.internal.calls.d.h.b(methodJ) : new kotlin.reflect.jvm.internal.calls.d.h.e(methodJ);
                } else {
                    cVar = aVar.J() ? new kotlin.reflect.jvm.internal.calls.d.h.c(methodJ, f(aVar)) : new kotlin.reflect.jvm.internal.calls.d.h.f(methodJ);
                }
                aVar2 = cVar;
            } else if (kotlin.reflect.jvm.internal.impl.resolve.e.d(aVar.a().L()) && f0.g(aVar.a().L().getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.r.f125867d)) {
                Class<?> clsH = kotlin.reflect.jvm.internal.calls.g.h(aVar.a().L().c());
                if (clsH == null || (methodF = kotlin.reflect.jvm.internal.calls.g.f(clsH, aVar.a().L())) == null) {
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + aVar.a() + " should have a field");
                }
                aVar2 = aVar.J() ? new kotlin.reflect.jvm.internal.calls.h.a(methodF, f(aVar)) : new kotlin.reflect.jvm.internal.calls.h.b(methodF);
            } else {
                Field fieldR = aVar.a().R();
                if (fieldR == null) {
                    throw new KotlinReflectionInternalError("No accessors or field is found for property " + aVar.a());
                }
                aVar2 = c(aVar, z10, fieldR);
            }
        } else if (hVarF instanceof h.a) {
            aVar2 = c(aVar, z10, ((h.a) hVarF).b());
        } else {
            if (!(hVarF instanceof h.b)) {
                if (!(hVarF instanceof h.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z10) {
                    cVarC = ((h.d) hVarF).b();
                } else {
                    cVarC = ((h.d) hVarF).c();
                    if (cVarC == null) {
                        throw new KotlinReflectionInternalError("No setter found for property " + aVar.a());
                    }
                }
                Method methodJ2 = aVar.a().w().J(cVarC.c(), cVarC.b());
                if (methodJ2 != null) {
                    Modifier.isStatic(methodJ2.getModifiers());
                    return aVar.J() ? new kotlin.reflect.jvm.internal.calls.d.h.a(methodJ2, f(aVar)) : new kotlin.reflect.jvm.internal.calls.d.h.C1137d(methodJ2);
                }
                throw new KotlinReflectionInternalError("No accessor found for property " + aVar.a());
            }
            if (z10) {
                methodC = ((h.b) hVarF).b();
            } else {
                h.b bVar = (h.b) hVarF;
                methodC = bVar.c();
                if (methodC == null) {
                    throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + bVar.b());
                }
            }
            aVar2 = aVar.J() ? new kotlin.reflect.jvm.internal.calls.d.h.a(methodC, f(aVar)) : new kotlin.reflect.jvm.internal.calls.d.h.C1137d(methodC);
        }
        return kotlin.reflect.jvm.internal.calls.g.c(aVar2, aVar.L(), false, 2, null);
    }

    private static final kotlin.reflect.jvm.internal.calls.d<Field> c(KPropertyImpl.a<?, ?> aVar, boolean z10, Field field) {
        kotlin.reflect.jvm.internal.calls.d<Field> aVar2;
        if (g(aVar.a().L()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z10) {
                aVar2 = aVar.J() ? new kotlin.reflect.jvm.internal.calls.d.g.a(field, e(aVar), f(aVar)) : new kotlin.reflect.jvm.internal.calls.d.g.c(field, e(aVar));
            } else {
                if (!aVar.J()) {
                    return new kotlin.reflect.jvm.internal.calls.d.f.c(field);
                }
                aVar2 = new kotlin.reflect.jvm.internal.calls.d.f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z10) {
                return aVar.J() ? new kotlin.reflect.jvm.internal.calls.d.f.b(field) : new kotlin.reflect.jvm.internal.calls.d.f.C1135d(field);
            }
            aVar2 = aVar.J() ? new kotlin.reflect.jvm.internal.calls.d.g.b(field, e(aVar)) : new kotlin.reflect.jvm.internal.calls.d.g.C1136d(field, e(aVar));
        } else {
            if (z10) {
                return new kotlin.reflect.jvm.internal.calls.d.f.e(field);
            }
            aVar2 = new kotlin.reflect.jvm.internal.calls.d.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(KPropertyImpl.a<?, ?> aVar) {
        return aVar.a().L().getAnnotations().J1(s.j());
    }

    private static final boolean e(KPropertyImpl.a<?, ?> aVar) {
        return !i1.l(aVar.a().L().getType());
    }

    @dl.e
    public static final Object f(@dl.d KPropertyImpl.a<?, ?> aVar) {
        f0.p(aVar, "<this>");
        return aVar.a().N();
    }

    private static final boolean g(o0 o0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.k containingDeclaration = o0Var.c();
        f0.o(containingDeclaration, "containingDeclaration");
        if (!kotlin.reflect.jvm.internal.impl.resolve.d.x(containingDeclaration)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = containingDeclaration.c();
        return !(kotlin.reflect.jvm.internal.impl.resolve.d.C(kVarC) || kotlin.reflect.jvm.internal.impl.resolve.d.t(kVarC)) || ((o0Var instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h) && kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h) o0Var).P()));
    }
}
