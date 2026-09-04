package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q extends g<Void> {
    public q() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 a(@dl.d d0 module) {
        f0.p(module, "module");
        j0 j0VarJ = module.t().J();
        f0.o(j0VarJ, "module.builtIns.nullableNothingType");
        return j0VarJ;
    }
}
