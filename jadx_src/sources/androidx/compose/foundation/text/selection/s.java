package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u000b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/i0;", "textLayoutResult", "", "rawStartOffset", "rawEndOffset", "Landroidx/compose/ui/text/o0;", "previousSelection", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", ak.av, "(Landroidx/compose/ui/text/i0;IILandroidx/compose/ui/text/o0;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class s {
    public static final long a(@dl.e TextLayoutResult textLayoutResult, int i10, int i11, @dl.e o0 o0Var, boolean z10, @dl.d SelectionAdjustment adjustment) {
        f0.p(adjustment, "adjustment");
        if (textLayoutResult == null) {
            return p0.b(0, 0);
        }
        long jB = p0.b(i10, i11);
        return (o0Var == null && f0.g(adjustment, SelectionAdjustment.INSTANCE.c())) ? jB : adjustment.a(textLayoutResult, jB, -1, z10, o0Var);
    }
}
