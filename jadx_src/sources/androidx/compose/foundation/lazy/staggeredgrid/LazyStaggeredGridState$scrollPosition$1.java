package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements yh.p<Integer, Integer, int[]> {
    LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @dl.d
    public final int[] i(int i10, int i11) {
        return ((LazyStaggeredGridState) this.receiver).m(i10, i11);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ int[] invoke(Integer num, Integer num2) {
        return i(num.intValue(), num2.intValue());
    }
}
