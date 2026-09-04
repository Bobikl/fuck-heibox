package mi;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: javaLoading.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p {
    private static final boolean a(r rVar) {
        kotlin.reflect.jvm.internal.impl.name.c cVarE;
        b0 b0Var = (b0) CollectionsKt___CollectionsKt.f5(rVar.i());
        x type = b0Var != null ? b0Var.getType() : null;
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i iVarO = jVar.o();
        return (iVarO instanceof g) && (cVarE = ((g) iVarO).e()) != null && f0.g(cVarE.b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0.equals("hashCode") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r0.equals("toString") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r3.i().isEmpty();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean b(mi.r r3) {
        /*
            kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L44
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L44
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            boolean r3 = a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
        L3b:
            java.util.List r3 = r3.i()
            boolean r3 = r3.isEmpty()
            goto L45
        L44:
            r3 = 0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.p.b(mi.r):boolean");
    }

    public static final boolean c(@dl.d q qVar) {
        f0.p(qVar, "<this>");
        return qVar.H().n() && (qVar instanceof r) && b((r) qVar);
    }
}
