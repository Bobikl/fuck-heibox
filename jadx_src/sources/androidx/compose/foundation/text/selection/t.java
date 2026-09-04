package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.x;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B:\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/selection/t;", "Landroidx/compose/foundation/text/selection/a;", "Landroidx/compose/ui/text/d;", "originalText", "Landroidx/compose/ui/text/o0;", "originalSelection", "Landroidx/compose/ui/text/i0;", "layoutResult", "Landroidx/compose/ui/text/input/x;", "offsetMapping", "Landroidx/compose/foundation/text/selection/u;", "state", "<init>", "(Landroidx/compose/ui/text/d;JLandroidx/compose/ui/text/i0;Landroidx/compose/ui/text/input/x;Landroidx/compose/foundation/text/selection/u;Lkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class t extends a<t> {
    private t(androidx.compose.ui.text.d dVar, long j10, TextLayoutResult textLayoutResult, x xVar, u uVar) {
        super(dVar, j10, textLayoutResult, xVar, uVar, null);
    }

    public /* synthetic */ t(androidx.compose.ui.text.d dVar, long j10, TextLayoutResult textLayoutResult, x xVar, u uVar, int i10, kotlin.jvm.internal.u uVar2) {
        this(dVar, j10, (i10 & 4) != 0 ? null : textLayoutResult, (i10 & 8) != 0 ? x.INSTANCE.a() : xVar, (i10 & 16) != 0 ? new u() : uVar, null);
    }

    public /* synthetic */ t(androidx.compose.ui.text.d dVar, long j10, TextLayoutResult textLayoutResult, x xVar, u uVar, kotlin.jvm.internal.u uVar2) {
        this(dVar, j10, textLayoutResult, xVar, uVar);
    }
}
