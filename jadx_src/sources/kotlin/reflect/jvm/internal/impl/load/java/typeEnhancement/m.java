package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.java.t;
import kotlin.reflect.jvm.internal.impl.types.h1;

/* JADX INFO: compiled from: typeEnhancementUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    @dl.d
    public static final d a(@dl.d d dVar, @dl.d Collection<d> superQualifiers, boolean z10, boolean z11, boolean z12) {
        NullabilityQualifier nullabilityQualifierE;
        boolean z13;
        boolean z14;
        f0.p(dVar, "<this>");
        f0.p(superQualifiers, "superQualifiers");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = superQualifiers.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityQualifierB = b((d) it.next());
            if (nullabilityQualifierB != null) {
                arrayList.add(nullabilityQualifierB);
            }
        }
        NullabilityQualifier nullabilityQualifierE2 = e(CollectionsKt___CollectionsKt.V5(arrayList), b(dVar), z10);
        if (nullabilityQualifierE2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = superQualifiers.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullabilityQualifierD = ((d) it2.next()).d();
                if (nullabilityQualifierD != null) {
                    arrayList2.add(nullabilityQualifierD);
                }
            }
            nullabilityQualifierE = e(CollectionsKt___CollectionsKt.V5(arrayList2), dVar.d(), z10);
        } else {
            nullabilityQualifierE = nullabilityQualifierE2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = superQualifiers.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutabilityQualifierC = ((d) it3.next()).c();
            if (mutabilityQualifierC != null) {
                arrayList3.add(mutabilityQualifierC);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) d(CollectionsKt___CollectionsKt.V5(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, dVar.c(), z10);
        NullabilityQualifier nullabilityQualifier = null;
        if (nullabilityQualifierE != null) {
            if (!(z12 || (z11 && nullabilityQualifierE == NullabilityQualifier.NULLABLE))) {
                nullabilityQualifier = nullabilityQualifierE;
            }
        }
        if (nullabilityQualifier != NullabilityQualifier.NOT_NULL) {
            z13 = false;
        } else {
            if (!dVar.b()) {
                if (!superQualifiers.isEmpty()) {
                    Iterator<T> it4 = superQualifiers.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z14 = false;
                            break;
                        }
                        if (((d) it4.next()).b()) {
                            z14 = true;
                            break;
                        }
                    }
                } else {
                    z14 = false;
                    break;
                }
                if (!z14) {
                    z13 = false;
                }
            }
            z13 = true;
        }
        return new d(nullabilityQualifier, mutabilityQualifier, z13, (nullabilityQualifier == null || nullabilityQualifierE2 == nullabilityQualifierE) ? false : true);
    }

    private static final NullabilityQualifier b(d dVar) {
        if (dVar.e()) {
            return null;
        }
        return dVar.d();
    }

    public static final boolean c(@dl.d h1 h1Var, @dl.d si.g type) {
        f0.p(h1Var, "<this>");
        f0.p(type, "type");
        kotlin.reflect.jvm.internal.impl.name.c ENHANCED_NULLABILITY_ANNOTATION = t.f126329u;
        f0.o(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return h1Var.z0(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final <T> T d(Set<? extends T> set, T t10, T t11, T t12, boolean z10) {
        Set<? extends T> setV5;
        T t13;
        if (!z10) {
            if (t12 != null && (setV5 = CollectionsKt___CollectionsKt.V5(e1.D(set, t12))) != null) {
                set = setV5;
            }
            return (T) CollectionsKt___CollectionsKt.d5(set);
        }
        if (set.contains(t10)) {
            t13 = t10;
        } else {
            t13 = set.contains(t11) ? t11 : null;
        }
        if (f0.g(t13, t10) && f0.g(t12, t11)) {
            return null;
        }
        return t12 == null ? t13 : t12;
    }

    private static final NullabilityQualifier e(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z10) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) d(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z10);
    }
}
