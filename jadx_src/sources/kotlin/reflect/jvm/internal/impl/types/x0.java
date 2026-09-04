package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x0 {
    @dl.d
    public static final w0 a(@dl.d w0 w0Var, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e newAnnotations) {
        w0 w0VarO;
        kotlin.jvm.internal.f0.p(w0Var, "<this>");
        kotlin.jvm.internal.f0.p(newAnnotations, "newAnnotations");
        if (i.a(w0Var) == newAnnotations) {
            return w0Var;
        }
        h hVarB = i.b(w0Var);
        if (hVarB != null && (w0VarO = w0Var.o(hVarB)) != null) {
            w0Var = w0VarO;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? w0Var.l(new h(newAnnotations)) : w0Var;
    }

    @dl.d
    public static final w0 b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        return v0.a.a(m.f128152a, eVar, null, null, 6, null);
    }
}
