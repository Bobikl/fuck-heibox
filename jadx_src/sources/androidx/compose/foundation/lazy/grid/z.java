package androidx.compose.foundation.lazy.grid;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyMeasuredLineProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b)\u0010*J(\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020&8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010'\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/grid/z;", "", "", "startSlot", com.google.android.exoplayer2.text.ttml.d.f49805s, "Ls1/b;", ak.av, "(II)J", "Landroidx/compose/foundation/lazy/grid/a0;", "lineIndex", "Landroidx/compose/foundation/lazy/grid/y;", "b", "(I)Landroidx/compose/foundation/lazy/grid/y;", "", "Z", "isVertical", "", "Ljava/util/List;", "slotSizesSums", ak.aF, "I", "crossAxisSpacing", "d", "gridItemsCount", "e", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/x;", "f", "Landroidx/compose/foundation/lazy/grid/x;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "g", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/c0;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/foundation/lazy/grid/c0;", "measuredLineFactory", "", "()Ljava/util/Map;", "keyToIndexMap", "<init>", "(ZLjava/util/List;IIILandroidx/compose/foundation/lazy/grid/x;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/grid/c0;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Integer> slotSizesSums;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSpacing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int gridItemsCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int spaceBetweenLines;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x measuredItemProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final c0 measuredLineFactory;

    public z(boolean z10, @dl.d List<Integer> slotSizesSums, int i10, int i11, int i12, @dl.d x measuredItemProvider, @dl.d LazyGridSpanLayoutProvider spanLayoutProvider, @dl.d c0 measuredLineFactory) {
        f0.p(slotSizesSums, "slotSizesSums");
        f0.p(measuredItemProvider, "measuredItemProvider");
        f0.p(spanLayoutProvider, "spanLayoutProvider");
        f0.p(measuredLineFactory, "measuredLineFactory");
        this.isVertical = z10;
        this.slotSizesSums = slotSizesSums;
        this.crossAxisSpacing = i10;
        this.gridItemsCount = i11;
        this.spaceBetweenLines = i12;
        this.measuredItemProvider = measuredItemProvider;
        this.spanLayoutProvider = spanLayoutProvider;
        this.measuredLineFactory = measuredLineFactory;
    }

    public final long a(int startSlot, int span) {
        int iU = fi.u.u((this.slotSizesSums.get((startSlot + span) - 1).intValue() - (startSlot == 0 ? 0 : this.slotSizesSums.get(startSlot - 1).intValue())) + (this.crossAxisSpacing * (span - 1)), 0);
        return this.isVertical ? s1.b.f139198b.e(iU) : s1.b.f139198b.d(iU);
    }

    @dl.d
    public final y b(int lineIndex) {
        LazyGridSpanLayoutProvider.c cVarC = this.spanLayoutProvider.c(lineIndex);
        int size = cVarC.b().size();
        int i10 = (size == 0 || cVarC.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        w[] wVarArr = new w[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int iF = d.f(cVarC.b().get(i12).getPackedValue());
            w wVarA = this.measuredItemProvider.a(e.c(cVarC.getFirstItemIndex() + i12), i10, a(i11, iF));
            i11 += iF;
            b2 b2Var = b2.f124493a;
            wVarArr[i12] = wVarA;
        }
        return this.measuredLineFactory.a(lineIndex, wVarArr, cVarC.b(), i10);
    }

    @dl.d
    public final Map<Object, Integer> c() {
        return this.measuredItemProvider.c();
    }
}
