package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.y;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    @dl.d
    public static final l1 a(@dl.d List<? extends l1> types) {
        j0 j0VarW0;
        f0.p(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (l1) CollectionsKt___CollectionsKt.c5(types);
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(types, 10));
        boolean z10 = false;
        boolean z11 = false;
        for (l1 l1Var : types) {
            z10 = z10 || e0.a(l1Var);
            if (l1Var instanceof j0) {
                j0VarW0 = (j0) l1Var;
            } else {
                if (!(l1Var instanceof y)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (kotlin.reflect.jvm.internal.impl.types.u.a(l1Var)) {
                    return l1Var;
                }
                j0VarW0 = ((y) l1Var).W0();
                z11 = true;
            }
            arrayList.add(j0VarW0);
        }
        if (z10) {
            return kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z11) {
            return TypeIntersector.f128067a.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList2.add(b0.d((l1) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.f128067a;
        return KotlinTypeFactory.d(typeIntersector.c(arrayList), typeIntersector.c(arrayList2));
    }
}
