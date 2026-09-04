package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a2\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a$\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/i0;", "textLayoutResult", "", androidx.constraintlayout.core.motion.utils.w.c.R, "", "isStart", "areHandlesCrossed", "Lb1/f;", "b", "(Landroidx/compose/ui/text/i0;IZZ)J", "", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class w {
    public static final float a(@dl.d TextLayoutResult textLayoutResult, int i10, boolean z10, boolean z11) {
        f0.p(textLayoutResult, "<this>");
        return textLayoutResult.j(i10, textLayoutResult.c(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == textLayoutResult.y(i10));
    }

    public static final long b(@dl.d TextLayoutResult textLayoutResult, int i10, boolean z10, boolean z11) {
        f0.p(textLayoutResult, "textLayoutResult");
        return b1.g.a(a(textLayoutResult, i10, z10, z11), textLayoutResult.m(textLayoutResult.q(i10)));
    }
}
