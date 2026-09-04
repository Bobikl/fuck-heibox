package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.e1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001Bj\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010(\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020$\u0012\u0006\u0010.\u001a\u00020$\u0012\u0006\u0010/\u001a\u00020$\u0012\u0006\u00101\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0018\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R \u0010+\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010,\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b\t\u0010'R\u0017\u0010.\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b\u0003\u0010'R\u0017\u0010/\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b*\u0010'R\u0017\u00101\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b\u001a\u0010'R\u0017\u00105\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b-\u00104R\u0017\u00109\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b0\u00108\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/i;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", ak.av, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "m", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/lazy/layout/i;", "b", "Landroidx/compose/foundation/lazy/layout/i;", "f", "()Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "", ak.aF, "[I", "k", "()[I", "resolvedSlotSums", "Ls1/b;", "d", "J", "()J", "constraints", "", "e", "Z", "n", "()Z", "isVertical", "Landroidx/compose/foundation/lazy/layout/m;", "Landroidx/compose/foundation/lazy/layout/m;", "i", "()Landroidx/compose/foundation/lazy/layout/m;", "measureScope", "", "g", "I", "()I", "mainAxisAvailableSize", "Ls1/n;", RXScreenCaptureService.KEY_HEIGHT, "contentOffset", "beforeContentPadding", "j", "afterContentPadding", "mainAxisSpacing", "l", "crossAxisSpacing", "Landroidx/compose/foundation/lazy/staggeredgrid/j;", "Landroidx/compose/foundation/lazy/staggeredgrid/j;", "()Landroidx/compose/foundation/lazy/staggeredgrid/j;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/r;", "Landroidx/compose/foundation/lazy/staggeredgrid/r;", "()Landroidx/compose/foundation/lazy/staggeredgrid/r;", "spans", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/layout/i;[IJZLandroidx/compose/foundation/lazy/layout/m;IJIIIILkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyStaggeredGridState state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.i itemProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] resolvedSlotSums;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.foundation.lazy.layout.m measureScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisAvailableSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long contentOffset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSpacing;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j measuredItemProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r spans;

    /* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"", UCropPlusActivity.ARG_INDEX, "lane", "", "key", "", "Landroidx/compose/ui/layout/e1;", "placeables", "Landroidx/compose/foundation/lazy/staggeredgrid/l;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements s {
        a() {
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.s
        @dl.d
        public final l a(int i10, int i11, @dl.d Object key, @dl.d List<? extends e1> placeables) {
            f0.p(key, "key");
            f0.p(placeables, "placeables");
            return new l(i10, key, placeables, i.this.getIsVertical(), i.this.getContentOffset(), i.this.getSpans().d(i10, i11) >= i.this.getItemProvider().a() ? 0 : i.this.getMainAxisSpacing(), null);
        }
    }

    private i(LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.lazy.layout.i iVar, int[] iArr, long j10, boolean z10, androidx.compose.foundation.lazy.layout.m mVar, int i10, long j11, int i11, int i12, int i13, int i14) {
        this.state = lazyStaggeredGridState;
        this.itemProvider = iVar;
        this.resolvedSlotSums = iArr;
        this.constraints = j10;
        this.isVertical = z10;
        this.measureScope = mVar;
        this.mainAxisAvailableSize = i10;
        this.contentOffset = j11;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.mainAxisSpacing = i13;
        this.crossAxisSpacing = i14;
        this.measuredItemProvider = new j(z10, iVar, mVar, iArr, new a());
        this.spans = lazyStaggeredGridState.getSpans();
    }

    public /* synthetic */ i(LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.lazy.layout.i iVar, int[] iArr, long j10, boolean z10, androidx.compose.foundation.lazy.layout.m mVar, int i10, long j11, int i11, int i12, int i13, int i14, u uVar) {
        this(lazyStaggeredGridState, iVar, iArr, j10, z10, mVar, i10, j11, i11, i12, i13, i14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCrossAxisSpacing() {
        return this.crossAxisSpacing;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.i getItemProvider() {
        return this.itemProvider;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.m getMeasureScope() {
        return this.measureScope;
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final j getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    @dl.d
    /* JADX INFO: renamed from: k, reason: from getter */
    public final int[] getResolvedSlotSums() {
        return this.resolvedSlotSums;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final r getSpans() {
        return this.spans;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }
}
