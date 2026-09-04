package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyMeasuredLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BV\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\b\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R \u0010\u000f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\rR\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\rR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b\u001a\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/grid/y;", "", "", "e", "", androidx.constraintlayout.core.motion.utils.w.c.R, "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/grid/q;", "f", "Landroidx/compose/foundation/lazy/grid/a0;", ak.av, "I", "()I", UCropPlusActivity.ARG_INDEX, "", "Landroidx/compose/foundation/lazy/grid/w;", "b", "[Landroidx/compose/foundation/lazy/grid/w;", "()[Landroidx/compose/foundation/lazy/grid/w;", "items", "Landroidx/compose/foundation/lazy/grid/d;", ak.aF, "Ljava/util/List;", "spans", "d", "Z", "isVertical", "slotsPerLine", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "g", "mainAxisSpacing", RXScreenCaptureService.KEY_HEIGHT, "crossAxisSpacing", "i", "mainAxisSize", "j", "mainAxisSizeWithSpacings", "<init>", "(I[Landroidx/compose/foundation/lazy/grid/w;Ljava/util/List;ZILandroidx/compose/ui/unit/LayoutDirection;IILkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final w[] items;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<d> spans;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int slotsPerLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    private y(int i10, w[] wVarArr, List<d> list, boolean z10, int i11, LayoutDirection layoutDirection, int i12, int i13) {
        this.index = i10;
        this.items = wVarArr;
        this.spans = list;
        this.isVertical = z10;
        this.slotsPerLine = i11;
        this.layoutDirection = layoutDirection;
        this.mainAxisSpacing = i12;
        this.crossAxisSpacing = i13;
        int iMax = 0;
        for (w wVar : wVarArr) {
            iMax = Math.max(iMax, wVar.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = fi.u.u(iMax + this.mainAxisSpacing, 0);
    }

    public /* synthetic */ y(int i10, w[] wVarArr, List list, boolean z10, int i11, LayoutDirection layoutDirection, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this(i10, wVarArr, list, z10, i11, layoutDirection, i12, i13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final w[] getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean e() {
        return this.items.length == 0;
    }

    @dl.d
    public final List<q> f(int offset, int layoutWidth, int layoutHeight) {
        w[] wVarArr = this.items;
        ArrayList arrayList = new ArrayList(wVarArr.length);
        int length = wVarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int crossAxisSize = 0;
        while (i10 < length) {
            w wVar = wVarArr[i10];
            int i13 = i11 + 1;
            int iF = d.f(this.spans.get(i11).getPackedValue());
            int i14 = this.layoutDirection == LayoutDirection.Rtl ? (this.slotsPerLine - i12) - iF : i12;
            boolean z10 = this.isVertical;
            int i15 = z10 ? this.index : i14;
            if (!z10) {
                i14 = this.index;
            }
            q qVarH = wVar.h(offset, crossAxisSize, layoutWidth, layoutHeight, i15, i14, this.mainAxisSize);
            crossAxisSize += wVar.getCrossAxisSize() + this.crossAxisSpacing;
            i12 += iF;
            arrayList.add(qVarH);
            i10++;
            i11 = i13;
        }
        return arrayList;
    }
}
