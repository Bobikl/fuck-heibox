package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J\u001c\u0010\n\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&R\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/a;", "Landroidx/compose/ui/layout/g0;", "Lkotlin/b2;", "I0", "", "Landroidx/compose/ui/layout/a;", "", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/Function1;", "block", "j", "requestLayout", "l", "", "t", "()Z", "isPlaced", "Landroidx/compose/ui/node/NodeCoordinator;", "R0", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/AlignmentLines;", "i", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "g0", "()Landroidx/compose/ui/node/a;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface a extends androidx.compose.ui.layout.g0 {
    void I0();

    @dl.d
    NodeCoordinator R0();

    @dl.e
    a g0();

    @dl.d
    Map<androidx.compose.ui.layout.a, Integer> h();

    @dl.d
    /* JADX INFO: renamed from: i */
    AlignmentLines getAlignmentLines();

    void j(@dl.d yh.l<? super a, b2> lVar);

    void l();

    void requestLayout();

    /* JADX INFO: renamed from: t */
    boolean getIsPlaced();
}
