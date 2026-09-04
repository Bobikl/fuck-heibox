package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.f0;
import androidx.compose.ui.layout.e1;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bh\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020!\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010.\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b6\u00107J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u00101\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b\u0015\u00100R\u0018\u00104\u001a\u00020\u0002*\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u00103R\u0011\u00105\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, d2 = {"Landroidx/compose/foundation/lazy/v;", "Landroidx/compose/foundation/lazy/m;", "", UCropPlusActivity.ARG_INDEX, "Ls1/n;", "f", "(I)J", "d", "Landroidx/compose/animation/core/f0;", "b", "Landroidx/compose/ui/layout/e1$a;", "scope", "Lkotlin/b2;", "i", ak.av, "I", "getOffset", "()I", androidx.constraintlayout.core.motion.utils.w.c.R, "getIndex", "", ak.aF, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", UiKitSpanObj.TYPE_SIZE, "e", RXScreenCaptureService.KEY_HEIGHT, "sizeWithSpacings", "minMainAxisOffset", "g", "maxMainAxisOffset", "", "Z", "isVertical", "", "Landroidx/compose/foundation/lazy/u;", "Ljava/util/List;", "wrappers", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "j", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "k", "J", "visualOffset", "l", "()Z", "hasAnimations", "Landroidx/compose/ui/layout/e1;", "(Landroidx/compose/ui/layout/e1;)I", "mainAxisSize", "placeablesCount", "<init>", "(IILjava/lang/Object;IIIIZLjava/util/List;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;JLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class v implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object key;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int sizeWithSpacings;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int minMainAxisOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int maxMainAxisOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<u> wrappers;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyListItemPlacementAnimator placementAnimator;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean hasAnimations;

    private v(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, boolean z10, List<u> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j10) {
        this.offset = i10;
        this.index = i11;
        this.key = obj;
        this.size = i12;
        this.sizeWithSpacings = i13;
        this.minMainAxisOffset = i14;
        this.maxMainAxisOffset = i15;
        this.isVertical = z10;
        this.wrappers = list;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.visualOffset = j10;
        int iG = g();
        boolean z11 = false;
        for (int i16 = 0; i16 < iG; i16++) {
            if (b(i16) != null) {
                z11 = true;
                break;
            }
        }
        this.hasAnimations = z11;
    }

    public /* synthetic */ v(int i10, int i11, Object obj, int i12, int i13, int i14, int i15, boolean z10, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j10, kotlin.jvm.internal.u uVar) {
        this(i10, i11, obj, i12, i13, i14, i15, z10, list, lazyListItemPlacementAnimator, j10);
    }

    private final int e(e1 e1Var) {
        return this.isVertical ? e1Var.getHeight() : e1Var.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.m
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @dl.e
    public final f0<s1.n> b(int index) {
        Object parentData = this.wrappers.get(index).getParentData();
        if (parentData instanceof f0) {
            return (f0) parentData;
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    public final int d(int index) {
        return e(this.wrappers.get(index).getPlaceable());
    }

    public final long f(int index) {
        return this.wrappers.get(index).getOffset();
    }

    public final int g() {
        return this.wrappers.size();
    }

    @Override // androidx.compose.foundation.lazy.m
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.m
    @dl.d
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.m
    public int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final void i(@dl.d e1.a scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        int iG = g();
        for (int i10 = 0; i10 < iG; i10++) {
            e1 placeable = this.wrappers.get(i10).getPlaceable();
            long jB = b(i10) != null ? this.placementAnimator.b(getKey(), i10, this.minMainAxisOffset - e(placeable), this.maxMainAxisOffset, f(i10)) : f(i10);
            if (this.isVertical) {
                long j10 = this.visualOffset;
                e1.a.F(scope, placeable, s1.o.a(s1.n.m(jB) + s1.n.m(j10), s1.n.o(jB) + s1.n.o(j10)), 0.0f, null, 6, null);
            } else {
                long j11 = this.visualOffset;
                e1.a.B(scope, placeable, s1.o.a(s1.n.m(jB) + s1.n.m(j11), s1.n.o(jB) + s1.n.o(j11)), 0.0f, null, 6, null);
            }
        }
    }
}
