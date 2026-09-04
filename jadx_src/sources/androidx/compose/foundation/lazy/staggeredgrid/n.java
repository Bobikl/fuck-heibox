package androidx.compose.foundation.lazy.staggeredgrid;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n {
    public static /* synthetic */ void a(o oVar, Object obj, Object obj2, yh.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        oVar.a(obj, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(o oVar, int i10, yh.l lVar, yh.l lVar2, yh.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = new yh.l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$items$1
                @dl.e
                public final Void a(int i12) {
                    return null;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        oVar.b(i10, lVar, lVar2, rVar);
    }
}
