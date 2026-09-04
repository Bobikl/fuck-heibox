package androidx.compose.foundation.text.selection;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: Selectable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001Jc\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH&J(\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H&J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/i;", "", "Lb1/f;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "isStartHandle", "Landroidx/compose/ui/layout/q;", "containerLayoutCoordinates", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/j;", "previousSelection", "Lkotlin/Pair;", "i", "(JJLb1/f;ZLandroidx/compose/ui/layout/q;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/j;)Lkotlin/Pair;", "g", "selection", "e", "(Landroidx/compose/foundation/text/selection/j;Z)J", "d", "Landroidx/compose/ui/text/d;", "getText", "", androidx.constraintlayout.core.motion.utils.w.c.R, "Lb1/i;", ak.aF, "Landroidx/compose/ui/text/o0;", RXScreenCaptureService.KEY_HEIGHT, "(I)J", "", "f", "()J", "selectableId", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface i {
    @dl.d
    b1.i c(int offset);

    @dl.e
    androidx.compose.ui.layout.q d();

    long e(@dl.d Selection selection, boolean isStartHandle);

    long f();

    @dl.e
    Selection g();

    @dl.d
    androidx.compose.ui.text.d getText();

    long h(int offset);

    @dl.d
    Pair<Selection, Boolean> i(long startHandlePosition, long endHandlePosition, @dl.e b1.f previousHandlePosition, boolean isStartHandle, @dl.d androidx.compose.ui.layout.q containerLayoutCoordinates, @dl.d SelectionAdjustment adjustment, @dl.e Selection previousSelection);
}
