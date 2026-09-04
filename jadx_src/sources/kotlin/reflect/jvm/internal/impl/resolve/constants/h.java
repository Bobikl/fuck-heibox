package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends g<Double> {
    public h(double d10) {
        super(Double.valueOf(d10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 a(@dl.d d0 module) {
        f0.p(module, "module");
        j0 j0VarZ = module.t().z();
        f0.o(j0VarZ, "module.builtIns.doubleType");
        return j0VarZ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public String toString() {
        return b().doubleValue() + ".toDouble()";
    }
}
