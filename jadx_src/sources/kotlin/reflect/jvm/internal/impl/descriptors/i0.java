package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i0 {
    public static final void a(@dl.d h0 h0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d Collection<g0> packageFragments) {
        kotlin.jvm.internal.f0.p(h0Var, "<this>");
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        kotlin.jvm.internal.f0.p(packageFragments, "packageFragments");
        if (h0Var instanceof j0) {
            ((j0) h0Var).b(fqName, packageFragments);
        } else {
            packageFragments.addAll(h0Var.a(fqName));
        }
    }

    public static final boolean b(@dl.d h0 h0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.jvm.internal.f0.p(h0Var, "<this>");
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        return h0Var instanceof j0 ? ((j0) h0Var).c(fqName) : c(h0Var, fqName).isEmpty();
    }

    @dl.d
    public static final List<g0> c(@dl.d h0 h0Var, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.jvm.internal.f0.p(h0Var, "<this>");
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(h0Var, fqName, arrayList);
        return arrayList;
    }
}
