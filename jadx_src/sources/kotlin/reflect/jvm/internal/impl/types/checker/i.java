package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    private static final List<c1> a(l1 l1Var, CaptureStatus captureStatus) {
        if (l1Var.M0().size() != l1Var.O0().getParameters().size()) {
            return null;
        }
        List<c1> listM0 = l1Var.M0();
        boolean z10 = true;
        if (!(listM0 instanceof Collection) || !listM0.isEmpty()) {
            Iterator<T> it = listM0.iterator();
            while (it.hasNext()) {
                if (!(((c1) it.next()).c() == Variance.INVARIANT)) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            return null;
        }
        List<y0> parameters = l1Var.O0().getParameters();
        f0.o(parameters, "type.constructor.parameters");
        List<Pair> listD6 = CollectionsKt___CollectionsKt.d6(listM0, parameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listD6, 10));
        for (Pair pair : listD6) {
            c1 c1VarA = (c1) pair.a();
            y0 parameter = (y0) pair.b();
            if (c1VarA.c() != Variance.INVARIANT) {
                l1 l1VarR0 = (c1VarA.b() || c1VarA.c() != Variance.IN_VARIANCE) ? null : c1VarA.getType().R0();
                f0.o(parameter, "parameter");
                c1VarA = TypeUtilsKt.a(new h(captureStatus, l1VarR0, c1VarA, parameter));
            }
            arrayList.add(c1VarA);
        }
        TypeSubstitutor typeSubstitutorC = a1.f128047c.b(l1Var.O0(), arrayList).c();
        int size = listM0.size();
        for (int i10 = 0; i10 < size; i10++) {
            c1 c1Var = listM0.get(i10);
            c1 c1Var2 = (c1) arrayList.get(i10);
            if (c1Var.c() != Variance.INVARIANT) {
                List<d0> upperBounds = l1Var.O0().getParameters().get(i10).getUpperBounds();
                f0.o(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = upperBounds.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(KotlinTypePreparator.a.f128056a.a(typeSubstitutorC.n((d0) it2.next(), Variance.INVARIANT).R0()));
                }
                if (!c1Var.b() && c1Var.c() == Variance.OUT_VARIANCE) {
                    arrayList2.add(KotlinTypePreparator.a.f128056a.a(c1Var.getType().R0()));
                }
                d0 type = c1Var2.getType();
                f0.n(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((h) type).O0().i(arrayList2);
            }
        }
        return arrayList;
    }

    @dl.e
    public static final j0 b(@dl.d j0 type, @dl.d CaptureStatus status) {
        f0.p(type, "type");
        f0.p(status, "status");
        List<c1> listA = a(type, status);
        if (listA != null) {
            return c(type, listA);
        }
        return null;
    }

    private static final j0 c(l1 l1Var, List<? extends c1> list) {
        return KotlinTypeFactory.l(l1Var.N0(), l1Var.O0(), list, l1Var.P0(), null, 16, null);
    }
}
