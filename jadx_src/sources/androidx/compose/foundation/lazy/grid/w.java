package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.e1;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.apache.tools.ant.taskdefs.a6;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200ø\u0001\u0000¢\u0006\u0004\b8\u00109J>\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002R \u0010\u0011\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u000eR\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b \u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00103\u001a\u0002008\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/foundation/lazy/grid/w;", "", "", "rawMainAxisOffset", "rawCrossAxisOffset", "layoutWidth", "layoutHeight", a6.a.f133725d, "column", "lineMainAxisSize", "Landroidx/compose/foundation/lazy/grid/q;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/foundation/lazy/grid/e;", ak.av, "I", "b", "()I", UCropPlusActivity.ARG_INDEX, "Ljava/lang/Object;", ak.aF, "()Ljava/lang/Object;", "key", "", "Z", "isVertical", "d", "crossAxisSize", "e", "f", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "g", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "i", "afterContentPadding", "", "Landroidx/compose/ui/layout/e1;", "j", "Ljava/util/List;", "()Ljava/util/List;", "placeables", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "k", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Ls1/n;", "l", "J", "visualOffset", "m", "mainAxisSize", "n", "mainAxisSizeWithSpacings", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<e1> placeables;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyGridItemPlacementAnimator placementAnimator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* JADX WARN: Multi-variable type inference failed */
    private w(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List<? extends e1> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j10) {
        this.index = i10;
        this.key = obj;
        this.isVertical = z10;
        this.crossAxisSize = i11;
        this.mainAxisSpacing = i12;
        this.reverseLayout = z11;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i13;
        this.afterContentPadding = i14;
        this.placeables = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j10;
        int size = list.size();
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            e1 e1Var = (e1) list.get(i15);
            iMax = Math.max(iMax, this.isVertical ? e1Var.getHeight() : e1Var.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = fi.u.u(iMax + this.mainAxisSpacing, 0);
    }

    public /* synthetic */ w(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j10, kotlin.jvm.internal.u uVar) {
        this(i10, obj, z10, i11, i12, z11, layoutDirection, i13, i14, list, lazyGridItemPlacementAnimator, j10);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @dl.d
    public final List<e1> g() {
        return this.placeables;
    }

    @dl.d
    public final q h(int rawMainAxisOffset, int rawCrossAxisOffset, int layoutWidth, int layoutHeight, int row, int column, int lineMainAxisSize) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.isVertical;
        int i10 = z10 ? layoutHeight : layoutWidth;
        int i11 = this.reverseLayout ? (i10 - rawMainAxisOffset) - this.mainAxisSize : rawMainAxisOffset;
        int i12 = (z10 && this.layoutDirection == LayoutDirection.Rtl) ? ((z10 ? layoutWidth : layoutHeight) - rawCrossAxisOffset) - this.crossAxisSize : rawCrossAxisOffset;
        long jA = z10 ? s1.o.a(i12, i11) : s1.o.a(i11, i12);
        int iG = this.reverseLayout ? CollectionsKt__CollectionsKt.G(this.placeables) : 0;
        while (true) {
            boolean z11 = true;
            if (!this.reverseLayout ? iG >= this.placeables.size() : iG < 0) {
                z11 = false;
            }
            if (!z11) {
                break;
            }
            arrayList.add(this.reverseLayout ? 0 : arrayList.size(), new p(jA, this.placeables.get(iG), this.placeables.get(iG).b(), null));
            iG = this.reverseLayout ? iG - 1 : iG + 1;
        }
        long jA2 = this.isVertical ? s1.o.a(rawCrossAxisOffset, rawMainAxisOffset) : s1.o.a(rawMainAxisOffset, rawCrossAxisOffset);
        int i13 = this.index;
        Object obj = this.key;
        long jA3 = this.isVertical ? s1.s.a(this.crossAxisSize, this.mainAxisSize) : s1.s.a(this.mainAxisSize, this.crossAxisSize);
        int i14 = this.mainAxisSpacing;
        boolean z12 = this.reverseLayout;
        return new q(jA2, jA, i13, obj, row, column, jA3, lineMainAxisSize, i14, -(!z12 ? this.beforeContentPadding : this.afterContentPadding), i10 + (!z12 ? this.afterContentPadding : this.beforeContentPadding), this.isVertical, arrayList, this.placementAnimator, this.visualOffset, null);
    }
}
