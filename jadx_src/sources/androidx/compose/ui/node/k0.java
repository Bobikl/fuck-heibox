package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MeasureBlocks.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "MeasureBlocks was deprecated. Please use MeasurePolicy instead.")
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&J&\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0012\u001a\u00020\u000fH&J&\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&J&\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0012\u001a\u00020\u000fH&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/k0;", "", "Landroidx/compose/ui/layout/l0;", "measureScope", "", "Landroidx/compose/ui/layout/g0;", "measurables", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.av, "(Landroidx/compose/ui/layout/l0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/layout/n;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/m;", "", RXScreenCaptureService.KEY_HEIGHT, ak.aF, RXScreenCaptureService.KEY_WIDTH, "b", "e", "d", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface k0 {
    @dl.d
    androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 measureScope, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long constraints);

    int b(@dl.d androidx.compose.ui.layout.n intrinsicMeasureScope, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int w10);

    int c(@dl.d androidx.compose.ui.layout.n intrinsicMeasureScope, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int h10);

    int d(@dl.d androidx.compose.ui.layout.n intrinsicMeasureScope, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int w10);

    int e(@dl.d androidx.compose.ui.layout.n intrinsicMeasureScope, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int h10);
}
