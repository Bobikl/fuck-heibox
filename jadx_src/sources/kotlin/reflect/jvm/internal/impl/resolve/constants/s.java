package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s extends m<Short> {
    public s(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 a(@dl.d d0 module) {
        f0.p(module, "module");
        j0 j0VarT = module.t().T();
        f0.o(j0VarT, "module.builtIns.shortType");
        return j0VarT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public String toString() {
        return b().intValue() + ".toShort()";
    }
}
