package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ak\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/i0;", "textLayoutResult", "Lb1/f;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "selectableId", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/j;", "previousSelection", "", "isStartHandle", "Lkotlin/Pair;", "d", "(Landroidx/compose/ui/text/i0;JJLb1/f;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/j;Z)Lkotlin/Pair;", "Lb1/i;", "bounds", CommonNetImpl.POSITION, "", ak.aF, "(Landroidx/compose/ui/text/i0;Lb1/i;J)I", "Landroidx/compose/ui/text/o0;", "newSelectionRange", "handlesCrossed", "b", "(JZJLandroidx/compose/ui/text/i0;)Landroidx/compose/foundation/text/selection/j;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection b(long j10, boolean z10, long j11, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.c(o0.n(j10)), o0.n(j10), j11), new Selection.AnchorInfo(textLayoutResult.c(Math.max(o0.i(j10) - 1, 0)), o0.i(j10), j11), z10);
    }

    public static final int c(@dl.d TextLayoutResult textLayoutResult, @dl.d b1.i bounds, long j10) {
        f0.p(textLayoutResult, "textLayoutResult");
        f0.p(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.f(j10)) {
            return fi.u.I(textLayoutResult.x(j10), 0, length);
        }
        if (SelectionMode.Vertical.mo0compare3MmeM6k$foundation_release(j10, bounds) < 0) {
            return 0;
        }
        return length;
    }

    @dl.d
    public static final Pair<Selection, Boolean> d(@dl.d TextLayoutResult textLayoutResult, long j10, long j11, @dl.e b1.f fVar, long j12, @dl.d SelectionAdjustment adjustment, @dl.e Selection selection, boolean z10) {
        f0.p(textLayoutResult, "textLayoutResult");
        f0.p(adjustment, "adjustment");
        b1.i iVar = new b1.i(0.0f, 0.0f, s1.r.m(textLayoutResult.getSize()), s1.r.j(textLayoutResult.getSize()));
        if (!SelectionMode.Vertical.m1isSelected2x9bVx0$foundation_release(iVar, j10, j11)) {
            return new Pair<>(null, Boolean.FALSE);
        }
        int iC = c(textLayoutResult, iVar, j10);
        int iC2 = c(textLayoutResult, iVar, j11);
        int iC3 = fVar != null ? c(textLayoutResult, iVar, fVar.getF30368a()) : -1;
        long jA = adjustment.a(textLayoutResult, p0.b(iC, iC2), iC3, z10, selection != null ? o0.b(selection.j()) : null);
        Selection selectionB = b(jA, o0.m(jA), j12, textLayoutResult);
        boolean z11 = true;
        boolean z12 = !f0.g(selectionB, selection);
        if (!(!z10 ? iC2 == iC3 : iC == iC3) && !z12) {
            z11 = false;
        }
        return new Pair<>(selectionB, Boolean.valueOf(z11));
    }
}
