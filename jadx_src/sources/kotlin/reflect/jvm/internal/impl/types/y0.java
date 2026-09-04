package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeCapabilities.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y0 {
    @dl.e
    public static final l a(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVarR0 = d0Var.R0();
        l lVar = aVarR0 instanceof l ? (l) aVarR0 : null;
        if (lVar == null || !lVar.K0()) {
            return null;
        }
        return lVar;
    }

    public static final boolean b(@dl.d d0 d0Var) {
        kotlin.jvm.internal.f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVarR0 = d0Var.R0();
        l lVar = aVarR0 instanceof l ? (l) aVarR0 : null;
        if (lVar != null) {
            return lVar.K0();
        }
        return false;
    }
}
