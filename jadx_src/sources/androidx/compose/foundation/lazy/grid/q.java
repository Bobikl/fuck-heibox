package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.f0;
import androidx.compose.ui.layout.e1;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import org.apache.tools.ant.taskdefs.a6;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0088\u0001\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u00100\u001a\u00020-\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u00020201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010:\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR#\u0010\u0011\u001a\u00020\b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\"\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016R#\u0010&\u001a\u00020#8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0014R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u0010:\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b9\u0010\u000eR\u0017\u0010=\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b\u0018\u0010<R\u001b\u0010?\u001a\u00020\u0002*\u00020\b8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010>R\u0018\u0010B\u001a\u00020\u0002*\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010AR\u0011\u0010C\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\u0016R\u0011\u0010D\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0011\u0010E\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/foundation/lazy/grid/q;", "Landroidx/compose/foundation/lazy/grid/h;", "", UCropPlusActivity.ARG_INDEX, "k", "f", "e", "Landroidx/compose/animation/core/f0;", "Ls1/n;", "d", "Landroidx/compose/ui/layout/e1$a;", "scope", "Lkotlin/b2;", "p", "J", ak.aF, "()J", androidx.constraintlayout.core.motion.utils.w.c.R, "n", "placeableOffset", "I", "getIndex", "()I", "", "g", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", RXScreenCaptureService.KEY_HEIGHT, "getRow", a6.a.f133725d, "i", "b", "column", "Ls1/r;", "j", ak.av, UiKitSpanObj.TYPE_SIZE, "lineMainAxisSize", "l", "mainAxisSpacing", "m", "minMainAxisOffset", "maxMainAxisOffset", "", "o", "Z", "isVertical", "", "Landroidx/compose/foundation/lazy/grid/p;", "Ljava/util/List;", "wrappers", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "q", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "r", "visualOffset", ak.aB, "()Z", "hasAnimations", "(J)I", "mainAxis", "Landroidx/compose/ui/layout/e1;", "(Landroidx/compose/ui/layout/e1;)I", "mainAxisSize", "placeablesCount", "mainAxisSizeWithSpacings", "lineMainAxisSizeWithSpacings", "<init>", "(JJILjava/lang/Object;IIJIIIIZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class q implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long placeableOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object key;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int row;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int column;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int lineMainAxisSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int minMainAxisOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int maxMainAxisOffset;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<p> wrappers;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyGridItemPlacementAnimator placementAnimator;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean hasAnimations;

    private q(long j10, long j11, int i10, Object obj, int i11, int i12, long j12, int i13, int i14, int i15, int i16, boolean z10, List<p> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j13) {
        this.offset = j10;
        this.placeableOffset = j11;
        this.index = i10;
        this.key = obj;
        this.row = i11;
        this.column = i12;
        this.size = j12;
        this.lineMainAxisSize = i13;
        this.mainAxisSpacing = i14;
        this.minMainAxisOffset = i15;
        this.maxMainAxisOffset = i16;
        this.isVertical = z10;
        this.wrappers = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j13;
        int iO = o();
        boolean z11 = false;
        for (int i17 = 0; i17 < iO; i17++) {
            if (d(i17) != null) {
                z11 = true;
                break;
            }
        }
        this.hasAnimations = z11;
    }

    public /* synthetic */ q(long j10, long j11, int i10, Object obj, int i11, int i12, long j12, int i13, int i14, int i15, int i16, boolean z10, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j13, kotlin.jvm.internal.u uVar) {
        this(j10, j11, i10, obj, i11, i12, j12, i13, i14, i15, i16, z10, list, lazyGridItemPlacementAnimator, j13);
    }

    private final int j(long j10) {
        return this.isVertical ? s1.n.o(j10) : s1.n.m(j10);
    }

    private final int l(e1 e1Var) {
        return this.isVertical ? e1Var.getHeight() : e1Var.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @dl.e
    public final f0<s1.n> d(int index) {
        Object parentData = this.wrappers.get(index).getParentData();
        if (parentData instanceof f0) {
            return (f0) parentData;
        }
        return null;
    }

    public final int e() {
        return this.isVertical ? s1.n.m(getOffset()) : s1.n.o(getOffset());
    }

    public final int f() {
        return this.isVertical ? s1.r.m(getSize()) : s1.r.j(getSize());
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    @dl.d
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.grid.h
    public int getRow() {
        return this.row;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getLineMainAxisSize() {
        return this.lineMainAxisSize;
    }

    public final int i() {
        return this.mainAxisSpacing + this.lineMainAxisSize;
    }

    public final int k(int index) {
        return l(this.wrappers.get(index).getPlaceable());
    }

    public final int m() {
        return this.mainAxisSpacing + (this.isVertical ? s1.r.j(getSize()) : s1.r.m(getSize()));
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getPlaceableOffset() {
        return this.placeableOffset;
    }

    public final int o() {
        return this.wrappers.size();
    }

    public final void p(@dl.d e1.a scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        int iO = o();
        for (int i10 = 0; i10 < iO; i10++) {
            e1 placeable = this.wrappers.get(i10).getPlaceable();
            int iL = this.minMainAxisOffset - l(placeable);
            int i11 = this.maxMainAxisOffset;
            long jC = d(i10) != null ? this.placementAnimator.c(getKey(), i10, iL, i11, this.placeableOffset) : this.placeableOffset;
            if (j(jC) > iL && j(jC) < i11) {
                if (this.isVertical) {
                    long j10 = this.visualOffset;
                    e1.a.F(scope, placeable, s1.o.a(s1.n.m(jC) + s1.n.m(j10), s1.n.o(jC) + s1.n.o(j10)), 0.0f, null, 6, null);
                } else {
                    long j11 = this.visualOffset;
                    e1.a.B(scope, placeable, s1.o.a(s1.n.m(jC) + s1.n.m(j11), s1.n.o(jC) + s1.n.o(j11)), 0.0f, null, 6, null);
                }
            }
        }
    }
}
