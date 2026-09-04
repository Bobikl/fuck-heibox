package kotlin.reflect.jvm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;
import kotlin.reflect.i;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.s;
import kotlin.reflect.n;
import xh.h;

/* JADX INFO: compiled from: KCallablesJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "KCallablesJvm")
public final class b {
    public static final boolean a(@dl.d kotlin.reflect.c<?> cVar) {
        kotlin.reflect.jvm.internal.calls.c<?> cVarG;
        f0.p(cVar, "<this>");
        if (cVar instanceof j) {
            n nVar = (n) cVar;
            Field fieldC = e.c(nVar);
            if (!(fieldC != null ? fieldC.isAccessible() : true)) {
                return false;
            }
            Method methodD = e.d(nVar);
            if (!(methodD != null ? methodD.isAccessible() : true)) {
                return false;
            }
            Method methodF = e.f((j) cVar);
            if (!(methodF != null ? methodF.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof n) {
            n nVar2 = (n) cVar;
            Field fieldC2 = e.c(nVar2);
            if (!(fieldC2 != null ? fieldC2.isAccessible() : true)) {
                return false;
            }
            Method methodD2 = e.d(nVar2);
            if (!(methodD2 != null ? methodD2.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof n.c) {
            Field fieldC3 = e.c(((n.c) cVar).a());
            if (!(fieldC3 != null ? fieldC3.isAccessible() : true)) {
                return false;
            }
            Method methodE = e.e((i) cVar);
            if (!(methodE != null ? methodE.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof j.a) {
            Field fieldC4 = e.c(((j.a) cVar).a());
            if (!(fieldC4 != null ? fieldC4.isAccessible() : true)) {
                return false;
            }
            Method methodE2 = e.e((i) cVar);
            if (!(methodE2 != null ? methodE2.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(cVar instanceof i)) {
                throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
            }
            i iVar = (i) cVar;
            Method methodE3 = e.e(iVar);
            if (!(methodE3 != null ? methodE3.isAccessible() : true)) {
                return false;
            }
            KCallableImpl<?> kCallableImplB = s.b(cVar);
            Member memberD = (kCallableImplB == null || (cVarG = kCallableImplB.G()) == null) ? null : cVarG.d();
            AccessibleObject accessibleObject = memberD instanceof AccessibleObject ? (AccessibleObject) memberD : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor constructorA = e.a(iVar);
            if (!(constructorA != null ? constructorA.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final void b(@dl.d kotlin.reflect.c<?> cVar, boolean z10) {
        kotlin.reflect.jvm.internal.calls.c<?> cVarG;
        f0.p(cVar, "<this>");
        if (cVar instanceof j) {
            n nVar = (n) cVar;
            Field fieldC = e.c(nVar);
            if (fieldC != null) {
                fieldC.setAccessible(z10);
            }
            Method methodD = e.d(nVar);
            if (methodD != null) {
                methodD.setAccessible(z10);
            }
            Method methodF = e.f((j) cVar);
            if (methodF == null) {
                return;
            }
            methodF.setAccessible(z10);
            return;
        }
        if (cVar instanceof n) {
            n nVar2 = (n) cVar;
            Field fieldC2 = e.c(nVar2);
            if (fieldC2 != null) {
                fieldC2.setAccessible(z10);
            }
            Method methodD2 = e.d(nVar2);
            if (methodD2 == null) {
                return;
            }
            methodD2.setAccessible(z10);
            return;
        }
        if (cVar instanceof n.c) {
            Field fieldC3 = e.c(((n.c) cVar).a());
            if (fieldC3 != null) {
                fieldC3.setAccessible(z10);
            }
            Method methodE = e.e((i) cVar);
            if (methodE == null) {
                return;
            }
            methodE.setAccessible(z10);
            return;
        }
        if (cVar instanceof j.a) {
            Field fieldC4 = e.c(((j.a) cVar).a());
            if (fieldC4 != null) {
                fieldC4.setAccessible(z10);
            }
            Method methodE2 = e.e((i) cVar);
            if (methodE2 == null) {
                return;
            }
            methodE2.setAccessible(z10);
            return;
        }
        if (!(cVar instanceof i)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        i iVar = (i) cVar;
        Method methodE3 = e.e(iVar);
        if (methodE3 != null) {
            methodE3.setAccessible(z10);
        }
        KCallableImpl<?> kCallableImplB = s.b(cVar);
        Member memberD = (kCallableImplB == null || (cVarG = kCallableImplB.G()) == null) ? null : cVarG.d();
        AccessibleObject accessibleObject = memberD instanceof AccessibleObject ? (AccessibleObject) memberD : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor constructorA = e.a(iVar);
        if (constructorA == null) {
            return;
        }
        constructorA.setAccessible(z10);
    }
}
