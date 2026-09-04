package androidx.compose.foundation.lazy.staggeredgrid;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/h;", "", "itemIndex", "Landroidx/compose/foundation/lazy/staggeredgrid/e;", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyStaggeredGridMeasureResultKt {
    @dl.e
    public static final e a(@dl.d h hVar, final int i10) {
        f0.p(hVar, "<this>");
        if (hVar.f().isEmpty()) {
            return null;
        }
        int index = ((e) CollectionsKt___CollectionsKt.w2(hVar.f())).getIndex();
        boolean z10 = false;
        if (i10 <= ((e) CollectionsKt___CollectionsKt.k3(hVar.f())).getIndex() && index <= i10) {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        return (e) CollectionsKt___CollectionsKt.R2(hVar.f(), CollectionsKt__CollectionsKt.w(hVar.f(), 0, 0, new yh.l<e, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d e it) {
                f0.p(it, "it");
                return Integer.valueOf(it.getIndex() - i10);
            }
        }, 3, null));
    }
}
