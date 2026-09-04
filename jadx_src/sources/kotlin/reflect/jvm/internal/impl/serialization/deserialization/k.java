package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;

/* JADX INFO: compiled from: DeserializedClassDataFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final h0 f127885a;

    public k(@dl.d h0 packageFragmentProvider) {
        f0.p(packageFragmentProvider, "packageFragmentProvider");
        this.f127885a = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
    @dl.e
    public e a(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
        e eVarA;
        f0.p(classId, "classId");
        h0 h0Var = this.f127885a;
        kotlin.reflect.jvm.internal.impl.name.c cVarH = classId.h();
        f0.o(cVarH, "classId.packageFqName");
        for (g0 g0Var : i0.c(h0Var, cVarH)) {
            if ((g0Var instanceof l) && (eVarA = ((l) g0Var).K0().a(classId)) != null) {
                return eVarA;
            }
        }
        return null;
    }
}
