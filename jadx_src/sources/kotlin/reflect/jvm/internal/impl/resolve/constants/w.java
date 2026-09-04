package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends y<Long> {
    public w(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public d0 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 module) {
        f0.p(module, "module");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = FindClassInModuleKt.a(module, kotlin.reflect.jvm.internal.impl.builtins.h.a.B0);
        j0 j0VarV = dVarA != null ? dVarA.v() : null;
        return j0VarV == null ? kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : j0VarV;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public String toString() {
        return b().longValue() + ".toULong()";
    }
}
