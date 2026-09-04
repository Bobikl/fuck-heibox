package androidx.compose.foundation.lazy.staggeredgrid;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/j;", "", "", "slot", "Ls1/b;", ak.av, "(I)J", UCropPlusActivity.ARG_INDEX, "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/l;", "b", "", "Z", "isVertical", "Landroidx/compose/foundation/lazy/layout/i;", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/m;", ak.aF, "Landroidx/compose/foundation/lazy/layout/m;", "measureScope", "", "d", "[I", "resolvedSlotSums", "Landroidx/compose/foundation/lazy/staggeredgrid/s;", "e", "Landroidx/compose/foundation/lazy/staggeredgrid/s;", "measuredItemFactory", "<init>", "(ZLandroidx/compose/foundation/lazy/layout/i;Landroidx/compose/foundation/lazy/layout/m;[ILandroidx/compose/foundation/lazy/staggeredgrid/s;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.i itemProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.m measureScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] resolvedSlotSums;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final s measuredItemFactory;

    public j(boolean z10, @dl.d androidx.compose.foundation.lazy.layout.i itemProvider, @dl.d androidx.compose.foundation.lazy.layout.m measureScope, @dl.d int[] resolvedSlotSums, @dl.d s measuredItemFactory) {
        f0.p(itemProvider, "itemProvider");
        f0.p(measureScope, "measureScope");
        f0.p(resolvedSlotSums, "resolvedSlotSums");
        f0.p(measuredItemFactory, "measuredItemFactory");
        this.isVertical = z10;
        this.itemProvider = itemProvider;
        this.measureScope = measureScope;
        this.resolvedSlotSums = resolvedSlotSums;
        this.measuredItemFactory = measuredItemFactory;
    }

    private final long a(int slot) {
        int i10 = this.resolvedSlotSums[slot] - (slot == 0 ? 0 : this.resolvedSlotSums[slot - 1]);
        return this.isVertical ? s1.b.f139198b.e(i10) : s1.b.f139198b.d(i10);
    }

    @dl.d
    public final l b(int index, int lane) {
        return this.measuredItemFactory.a(index, lane, this.itemProvider.e(index), this.measureScope.k0(index, a(lane)));
    }
}
