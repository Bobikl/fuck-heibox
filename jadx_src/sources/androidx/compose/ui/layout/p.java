package androidx.compose.ui.layout;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p {
    public static void a(q qVar, @dl.d q sourceCoordinates, @dl.d float[] matrix) {
        kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    public static /* synthetic */ b1.i c(q qVar, q qVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return qVar.x(qVar2, z10);
    }
}
