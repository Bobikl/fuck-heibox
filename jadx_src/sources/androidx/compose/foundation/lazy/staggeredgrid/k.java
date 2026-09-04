package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.j0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bx\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u0019\u0012\u0006\u0010%\u001a\u00020!\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00101\u001a\u00020!\u0012\u0006\u00102\u001a\u00020!\u0012\u0006\u00103\u001a\u00020!\u0012\u0006\u00104\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u000f\u0010\u001dR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0014\u0010$R \u0010+\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001f\u0010*R#\u00100\u001a\u00020,8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0006\u0010/R\u001a\u00101\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u001a\u0010$R\u001a\u00102\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b\"\u0010$R\u001a\u00103\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b(\u0010$R\u001a\u00104\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\u000b\u0010$R \u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020!058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u00107R\u0014\u0010:\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010$R\u0014\u0010<\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/k;", "Landroidx/compose/foundation/lazy/staggeredgrid/h;", "Landroidx/compose/ui/layout/j0;", "Lkotlin/b2;", "k", "", ak.av, "[I", "m", "()[I", "firstVisibleItemIndices", "b", "n", "firstVisibleItemScrollOffsets", "", ak.aF, "F", "l", "()F", "consumedScroll", "d", "Landroidx/compose/ui/layout/j0;", "o", "()Landroidx/compose/ui/layout/j0;", "measureResult", "", "e", "Z", "j", "()Z", "canScrollForward", "f", "canScrollBackward", "", "g", "I", "()I", "totalItemsCount", "", "Landroidx/compose/foundation/lazy/staggeredgrid/e;", RXScreenCaptureService.KEY_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "visibleItemsInfo", "Ls1/r;", "i", "J", "()J", "viewportSize", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/a;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "<init>", "([I[IFLandroidx/compose/ui/layout/j0;ZZILjava/util/List;JIIIILkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class k implements h, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] firstVisibleItemIndices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] firstVisibleItemScrollOffsets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float consumedScroll;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j0 measureResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollBackward;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<e> visibleItemsInfo;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long viewportSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX WARN: Multi-variable type inference failed */
    private k(int[] iArr, int[] iArr2, float f10, j0 j0Var, boolean z10, boolean z11, int i10, List<? extends e> list, long j10, int i11, int i12, int i13, int i14) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f10;
        this.measureResult = j0Var;
        this.canScrollForward = z10;
        this.canScrollBackward = z11;
        this.totalItemsCount = i10;
        this.visibleItemsInfo = list;
        this.viewportSize = j10;
        this.viewportStartOffset = i11;
        this.viewportEndOffset = i12;
        this.beforeContentPadding = i13;
        this.afterContentPadding = i14;
    }

    public /* synthetic */ k(int[] iArr, int[] iArr2, float f10, j0 j0Var, boolean z10, boolean z11, int i10, List list, long j10, int i11, int i12, int i13, int i14, u uVar) {
        this(iArr, iArr2, f10, j0Var, z10, z11, i10, list, j10, i11, i12, i13, i14);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanScrollBackward() {
        return this.canScrollBackward;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    @dl.d
    public List<e> f() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.ui.layout.j0
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.ui.layout.j0
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.h
    /* JADX INFO: renamed from: h, reason: from getter */
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    @Override // androidx.compose.ui.layout.j0
    @dl.d
    public Map<androidx.compose.ui.layout.a, Integer> i() {
        return this.measureResult.i();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @Override // androidx.compose.ui.layout.j0
    public void k() {
        this.measureResult.k();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public final j0 getMeasureResult() {
        return this.measureResult;
    }
}
