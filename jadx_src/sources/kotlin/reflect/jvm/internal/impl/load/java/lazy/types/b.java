package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import dl.e;
import kotlin.collections.c1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: compiled from: JavaTypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    @dl.d
    public static final a a(@dl.d TypeUsage typeUsage, boolean z10, boolean z11, @e y0 y0Var) {
        f0.p(typeUsage, "<this>");
        return new a(typeUsage, null, z11, z10, y0Var != null ? c1.f(y0Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(TypeUsage typeUsage, boolean z10, boolean z11, y0 y0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            y0Var = null;
        }
        return a(typeUsage, z10, z11, y0Var);
    }
}
