package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: ErasureProjectionComputer.kt */
/* JADX INFO: loaded from: classes5.dex */
public class v {
    public static /* synthetic */ c1 b(v vVar, kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var, w wVar, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, d0 d0Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            d0Var = typeParameterUpperBoundEraser.c(y0Var, wVar);
        }
        return vVar.a(y0Var, wVar, typeParameterUpperBoundEraser, d0Var);
    }

    @dl.d
    public c1 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 parameter, @dl.d w typeAttr, @dl.d TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, @dl.d d0 erasedUpperBound) {
        kotlin.jvm.internal.f0.p(parameter, "parameter");
        kotlin.jvm.internal.f0.p(typeAttr, "typeAttr");
        kotlin.jvm.internal.f0.p(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        kotlin.jvm.internal.f0.p(erasedUpperBound, "erasedUpperBound");
        return new e1(Variance.OUT_VARIANCE, erasedUpperBound);
    }
}
