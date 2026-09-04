package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¨\u0006\u0006"}, d2 = {"", "gridSize", "slotCount", "spacing", "", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> b(int i10, int i11, int i12) {
        int i13 = i10 - (i12 * (i11 - 1));
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }
}
