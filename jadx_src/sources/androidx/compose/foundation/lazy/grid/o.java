package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.j0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bo\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\u0006\u0010+\u001a\u00020\u0011\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\b>\u0010?J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010&\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b%\u0010\u000fR\u001a\u0010(\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010+\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b*\u0010\u0015R\u001a\u0010/\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b\u0012\u0010.R\u001a\u00100\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\f\u0010\u000fR \u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000b018\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u00103R\u0014\u00106\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010\u000fR\u0014\u00108\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010\u000fR\u001d\u0010;\u001a\u0002098VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010:R\u0014\u0010<\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/foundation/lazy/grid/o;", "Landroidx/compose/foundation/lazy/grid/n;", "Landroidx/compose/ui/layout/j0;", "Lkotlin/b2;", "k", "Landroidx/compose/foundation/lazy/grid/y;", ak.av, "Landroidx/compose/foundation/lazy/grid/y;", "n", "()Landroidx/compose/foundation/lazy/grid/y;", "firstVisibleLine", "", "b", "I", "o", "()I", "firstVisibleLineScrollOffset", "", ak.aF, "Z", "l", "()Z", "canScrollForward", "", "d", "F", "m", "()F", "consumedScroll", "", "Landroidx/compose/foundation/lazy/grid/h;", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "visibleItemsInfo", "viewportStartOffset", "g", "viewportEndOffset", RXScreenCaptureService.KEY_HEIGHT, "totalItemsCount", "i", "j", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/Orientation;", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "", "Landroidx/compose/ui/layout/a;", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "Ls1/r;", "()J", "viewportSize", "beforeContentPadding", "measureResult", "<init>", "(Landroidx/compose/foundation/lazy/grid/y;IZFLandroidx/compose/ui/layout/j0;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;I)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class o implements n, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final y firstVisibleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int firstVisibleLineScrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canScrollForward;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float consumedScroll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<h> visibleItemsInfo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Orientation orientation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final /* synthetic */ j0 f6927l;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@dl.e y yVar, int i10, boolean z10, float f10, @dl.d j0 measureResult, @dl.d List<? extends h> visibleItemsInfo, int i11, int i12, int i13, boolean z11, @dl.d Orientation orientation, int i14) {
        f0.p(measureResult, "measureResult");
        f0.p(visibleItemsInfo, "visibleItemsInfo");
        f0.p(orientation, "orientation");
        this.firstVisibleLine = yVar;
        this.firstVisibleLineScrollOffset = i10;
        this.canScrollForward = z10;
        this.consumedScroll = f10;
        this.visibleItemsInfo = visibleItemsInfo;
        this.viewportStartOffset = i11;
        this.viewportEndOffset = i12;
        this.totalItemsCount = i13;
        this.reverseLayout = z11;
        this.orientation = orientation;
        this.afterContentPadding = i14;
        this.f6927l = measureResult;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public long a() {
        return s1.s.a(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    @dl.d
    public List<h> f() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.ui.layout.j0
    public int getHeight() {
        return this.f6927l.getHeight();
    }

    @Override // androidx.compose.ui.layout.j0
    public int getWidth() {
        return this.f6927l.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    public int h() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.ui.layout.j0
    @dl.d
    public Map<androidx.compose.ui.layout.a, Integer> i() {
        return this.f6927l.i();
    }

    @Override // androidx.compose.foundation.lazy.grid.n
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.j0
    public void k() {
        this.f6927l.k();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @dl.e
    /* JADX INFO: renamed from: n, reason: from getter */
    public final y getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }
}
