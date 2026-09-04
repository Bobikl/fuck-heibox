package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002`aB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b^\u0010_J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\"R$\u0010-\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R$\u00100\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R\u0016\u00102\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\"R*\u00108\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$\"\u0004\b6\u00107R*\u0010?\u001a\u0002092\u0006\u00103\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\n\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010E\u001a\u00060@R\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR0\u0010K\u001a\b\u0018\u00010FR\u00020\u00002\f\u0010\u001b\u001a\b\u0018\u00010FR\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001c\u0010R\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001c\u0010T\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010V\u001a\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010<R\u0014\u0010X\u001a\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010<R\u0014\u0010[\u001a\u00020Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ZR\u0016\u0010]\u001a\u0004\u0018\u00010Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010Z\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "", "B", "Ls1/b;", "constraints", "Lkotlin/b2;", "J", "(J)V", "I", "D", "()V", "G", androidx.exifinterface.media.a.S4, "F", "Landroidx/compose/ui/layout/f0;", "newScope", "H", "(Landroidx/compose/ui/layout/f0;)V", "N", "K", "C", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "<set-?>", "b", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", ak.aB, "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", ak.aF, "Z", "y", "()Z", "measurePending", "d", "r", "layoutPending", "e", "layoutPendingForAlignment", "f", "v", "lookaheadMeasurePending", "g", ak.aG, "lookaheadLayoutPending", RXScreenCaptureService.KEY_HEIGHT, "lookaheadLayoutPendingForAlignment", "value", "i", "n", "M", "(Z)V", "coordinatesAccessedDuringPlacement", "", "j", "m", "()I", "L", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "k", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "x", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "l", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", ak.aD, "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "p", "()Ls1/b;", "lastConstraints", "q", "lastLookaheadConstraints", "o", "height", androidx.exifinterface.media.a.W4, "width", "Landroidx/compose/ui/node/a;", "()Landroidx/compose/ui/node/a;", "alignmentLinesOwner", "t", "lookaheadAlignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class LayoutNodeLayoutDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutNode.LayoutState layoutState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean measurePending;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPending;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadMeasurePending;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPending;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPendingForAlignment;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MeasurePassDelegate measurePassDelegate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private LookaheadPassDelegate lookaheadPassDelegate;

    /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u00108\u001a\u000205¢\u0006\u0004\bq\u0010rJ!\u0010\b\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0082\bJ\b\u0010\t\u001a\u00020\u0006H\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\u001c\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0006\u0010\u0017\u001a\u00020\u0006J\u001d\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010&\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0019\u0010%\u001a\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b$H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0011H\u0096\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010/\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0016J\u000e\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u001cJ\u0006\u00102\u001a\u00020\u001cJ\u0006\u00103\u001a\u00020\u0006J\u0006\u00104\u001a\u00020\u0006R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010>\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109R\u0016\u0010A\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00109R\u001f\u0010C\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010BR\"\u0010G\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u00109\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R\u0016\u0010I\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00109R\u001a\u0010N\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b?\u0010MR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010V\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u00109\u001a\u0004\bT\u0010;\"\u0004\bU\u0010=R(\u0010]\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010W8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010`\u001a\u0004\u0018\u00010\u00188Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0016\u0010k\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010m\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006s"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/layout/g0;", "Landroidx/compose/ui/node/a;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Lkotlin/b2;", "block", "a2", "g2", "Landroidx/compose/ui/node/LayoutNode;", "r2", "j2", "n2", "i2", "I0", "", "Landroidx/compose/ui/layout/a;", "", RXScreenCaptureService.KEY_HEIGHT, "j", "requestLayout", "l", "h2", "Ls1/b;", "constraints", "z1", "(J)Landroidx/compose/ui/layout/e1;", "", "l2", "(J)Z", "Ls1/n;", CommonNetImpl.POSITION, "", "zIndex", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/t;", "layerBlock", "U1", "(JFLyh/l;)V", "alignmentLine", "v", "height", "l1", "w1", "width", "L0", androidx.exifinterface.media.a.X4, "forceRequest", "f2", "s2", "k2", "m2", "Landroidx/compose/ui/layout/f0;", "g", "Landroidx/compose/ui/layout/f0;", "lookaheadScope", "Z", "d2", "()Z", "p2", "(Z)V", "duringAlignmentLinesQuery", "i", "placedOnce", "measuredOnce", "J", "lastPosition", "m", "t", "q2", "isPlaced", "n", "isPreviouslyPlaced", "Landroidx/compose/ui/node/AlignmentLines;", "o", "Landroidx/compose/ui/node/AlignmentLines;", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/runtime/collection/e;", "p", "Landroidx/compose/runtime/collection/e;", "_childMeasurables", "q", "c2", "o2", "childMeasurablesDirty", "", "<set-?>", "r", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "parentData", "e2", "()Ls1/b;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "R0", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "b2", "()Ljava/util/List;", "childMeasurables", "g0", "()Landroidx/compose/ui/node/a;", "parentAlignmentLinesOwner", "k", "()I", "measuredWidth", androidx.exifinterface.media.a.T4, "measuredHeight", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;Landroidx/compose/ui/layout/f0;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class LookaheadPassDelegate extends androidx.compose.ui.layout.e1 implements androidx.compose.ui.layout.g0, androidx.compose.ui.node.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.ui.layout.f0 lookaheadScope;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean duringAlignmentLinesQuery;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean placedOnce;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean measuredOnce;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @dl.e
        private s1.b f15180k;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean isPlaced;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean isPreviouslyPlaced;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final AlignmentLines alignmentLines;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.collection.e<androidx.compose.ui.layout.g0> _childMeasurables;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean childMeasurablesDirty;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Object parentData;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ LayoutNodeLayoutDelegate f15188s;

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15189a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f15190b;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                f15189a = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                f15190b = iArr2;
            }
        }

        public LookaheadPassDelegate(@dl.d LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, androidx.compose.ui.layout.f0 lookaheadScope) {
            kotlin.jvm.internal.f0.p(lookaheadScope, "lookaheadScope");
            this.f15188s = layoutNodeLayoutDelegate;
            this.lookaheadScope = lookaheadScope;
            this.lastPosition = s1.n.f139237b.a();
            this.isPlaced = true;
            this.alignmentLines = new g0(this);
            this._childMeasurables = new androidx.compose.runtime.collection.e<>(new androidx.compose.ui.layout.g0[16], 0);
            this.childMeasurablesDirty = true;
            this.parentData = layoutNodeLayoutDelegate.getMeasurePassDelegate().getParentData();
        }

        private final void a2(yh.l<? super LookaheadPassDelegate, b2> lVar) {
            androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = this.f15188s.layoutNode.B0();
            int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                int i11 = 0;
                LayoutNode[] layoutNodeArrG = eVarB0.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArrG[i11].getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.f0.m(lookaheadPassDelegate);
                    lVar.invoke(lookaheadPassDelegate);
                    i11++;
                } while (i11 < i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g2() {
            int i10 = 0;
            q2(false);
            androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = this.f15188s.layoutNode.B0();
            int i11 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i11 > 0) {
                LayoutNode[] layoutNodeArrG = eVarB0.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArrG[i10].getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.f0.m(lookaheadPassDelegate);
                    lookaheadPassDelegate.g2();
                    i10++;
                } while (i10 < i11);
            }
        }

        private final void i2() {
            LayoutNode layoutNode = this.f15188s.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f15188s;
            androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = layoutNode.B0();
            int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                LayoutNode[] layoutNodeArrG = eVarB0.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArrG[i11];
                    if (layoutNode2.h0() && layoutNode2.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.f0.m(lookaheadPassDelegate);
                        s1.b f15180k = getF15180k();
                        kotlin.jvm.internal.f0.m(f15180k);
                        if (lookaheadPassDelegate.l2(f15180k.getF139216a())) {
                            LayoutNode.m1(layoutNodeLayoutDelegate.layoutNode, false, 1, null);
                        }
                    }
                    i11++;
                } while (i11 < i10);
            }
        }

        private final void j2() {
            LayoutNode.UsageByParent intrinsicsUsageByParent;
            LayoutNode.m1(this.f15188s.layoutNode, false, 1, null);
            LayoutNode layoutNodeV0 = this.f15188s.layoutNode.v0();
            if (layoutNodeV0 == null || this.f15188s.layoutNode.getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = this.f15188s.layoutNode;
            int i10 = a.f15189a[layoutNodeV0.f0().ordinal()];
            if (i10 != 2) {
                intrinsicsUsageByParent = i10 != 3 ? layoutNodeV0.getIntrinsicsUsageByParent() : LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            }
            layoutNode.w1(intrinsicsUsageByParent);
        }

        private final void n2() {
            androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = this.f15188s.layoutNode.B0();
            int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                int i11 = 0;
                LayoutNode[] layoutNodeArrG = eVarB0.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LayoutNode layoutNode = layoutNodeArrG[i11];
                    layoutNode.r1(layoutNode);
                    LookaheadPassDelegate lookaheadPassDelegate = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.f0.m(lookaheadPassDelegate);
                    lookaheadPassDelegate.n2();
                    i11++;
                } while (i11 < i10);
            }
        }

        private final void r2(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode layoutNodeV0 = layoutNode.v0();
            if (layoutNodeV0 == null) {
                layoutNode.A1(LayoutNode.UsageByParent.NotUsed);
                return;
            }
            if (!(layoutNode.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure())) {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.getMeasuredByParentInLookahead() + ". Parent state " + layoutNodeV0.f0() + lg.a.f131414g).toString());
            }
            int i10 = a.f15189a[layoutNodeV0.f0().ordinal()];
            if (i10 == 1 || i10 == 2) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeV0.f0());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            layoutNode.A1(usageByParent);
        }

        @Override // androidx.compose.ui.node.a
        public void I0() {
            getAlignmentLines().s();
            if (this.f15188s.getLookaheadLayoutPending()) {
                i2();
            }
            final i0 lookaheadDelegate = R0().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            if (this.f15188s.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && this.f15188s.getLookaheadLayoutPending())) {
                this.f15188s.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState = this.f15188s.getLayoutState();
                this.f15188s.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                OwnerSnapshotObserver snapshotObserver = d0.b(this.f15188s.layoutNode).getSnapshotObserver();
                LayoutNode layoutNode = this.f15188s.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f15188s;
                OwnerSnapshotObserver.f(snapshotObserver, layoutNode, false, new yh.a<b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = this.f15192b.f15188s.layoutNode.B0();
                        int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                        int i11 = 0;
                        if (i10 > 0) {
                            LayoutNode[] layoutNodeArrG = eVarB0.G();
                            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            int i12 = 0;
                            do {
                                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArrG[i12].getLayoutDelegate().getLookaheadPassDelegate();
                                kotlin.jvm.internal.f0.m(lookaheadPassDelegate);
                                lookaheadPassDelegate.isPreviouslyPlaced = lookaheadPassDelegate.getIsPlaced();
                                lookaheadPassDelegate.q2(false);
                                i12++;
                            } while (i12 < i10);
                        }
                        androidx.compose.runtime.collection.e<LayoutNode> eVarB1 = layoutNodeLayoutDelegate.layoutNode.B0();
                        int i13 = eVarB1.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                        if (i13 > 0) {
                            LayoutNode[] layoutNodeArrG2 = eVarB1.G();
                            kotlin.jvm.internal.f0.n(layoutNodeArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            int i14 = 0;
                            do {
                                LayoutNode layoutNode2 = layoutNodeArrG2[i14];
                                if (layoutNode2.getMeasuredByParentInLookahead() == LayoutNode.UsageByParent.InLayoutBlock) {
                                    layoutNode2.A1(LayoutNode.UsageByParent.NotUsed);
                                }
                                i14++;
                            } while (i14 < i13);
                        }
                        this.f15192b.j(new yh.l<a, b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.3
                            public final void a(@dl.d a child) {
                                kotlin.jvm.internal.f0.p(child, "child");
                                child.getAlignmentLines().y(false);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                                a(aVar);
                                return b2.f124493a;
                            }
                        });
                        lookaheadDelegate.d2().k();
                        this.f15192b.j(new yh.l<a, b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.4
                            public final void a(@dl.d a child) {
                                kotlin.jvm.internal.f0.p(child, "child");
                                child.getAlignmentLines().v(child.getAlignmentLines().getUsedDuringParentLayout());
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                                a(aVar);
                                return b2.f124493a;
                            }
                        });
                        androidx.compose.runtime.collection.e<LayoutNode> eVarB2 = this.f15192b.f15188s.layoutNode.B0();
                        int i15 = eVarB2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                        if (i15 > 0) {
                            LayoutNode[] layoutNodeArrG3 = eVarB2.G();
                            kotlin.jvm.internal.f0.n(layoutNodeArrG3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            do {
                                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNodeArrG3[i11].getLayoutDelegate().getLookaheadPassDelegate();
                                kotlin.jvm.internal.f0.m(lookaheadPassDelegate2);
                                if (!lookaheadPassDelegate2.getIsPlaced()) {
                                    lookaheadPassDelegate2.g2();
                                }
                                i11++;
                            } while (i11 < i15);
                        }
                    }
                }, 2, null);
                this.f15188s.layoutState = layoutState;
                if (this.f15188s.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                    requestLayout();
                }
                this.f15188s.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().v(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().l()) {
                getAlignmentLines().r();
            }
        }

        @Override // androidx.compose.ui.layout.m
        public int L0(int width) {
            j2();
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return lookaheadDelegate.L0(width);
        }

        @Override // androidx.compose.ui.node.a
        @dl.d
        public NodeCoordinator R0() {
            return this.f15188s.layoutNode.Y();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.e1
        public void U1(final long position, float zIndex, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
            this.f15188s.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            this.placedOnce = true;
            if (!s1.n.j(position, this.lastPosition)) {
                h2();
            }
            getAlignmentLines().w(false);
            b1 b1VarB = d0.b(this.f15188s.layoutNode);
            this.f15188s.M(false);
            OwnerSnapshotObserver snapshotObserver = b1VarB.getSnapshotObserver();
            LayoutNode layoutNode = this.f15188s.layoutNode;
            final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f15188s;
            OwnerSnapshotObserver.d(snapshotObserver, layoutNode, false, new yh.a<b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.layout.e1.a.Companion companion = androidx.compose.ui.layout.e1.a.INSTANCE;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeLayoutDelegate;
                    long j10 = position;
                    i0 lookaheadDelegate = layoutNodeLayoutDelegate2.z().getLookaheadDelegate();
                    kotlin.jvm.internal.f0.m(lookaheadDelegate);
                    androidx.compose.ui.layout.e1.a.r(companion, lookaheadDelegate, j10, 0.0f, 2, null);
                }
            }, 2, null);
            this.lastPosition = position;
            this.f15188s.layoutState = LayoutNode.LayoutState.Idle;
        }

        @Override // androidx.compose.ui.layout.m
        public int V(int width) {
            j2();
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return lookaheadDelegate.V(width);
        }

        @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.n0
        public int W() {
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return lookaheadDelegate.W();
        }

        @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.n0
        @dl.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        @dl.d
        public final List<androidx.compose.ui.layout.g0> b2() {
            this.f15188s.layoutNode.V();
            if (!this.childMeasurablesDirty) {
                return this._childMeasurables.l();
            }
            e0.b(this.f15188s.layoutNode, this._childMeasurables, new yh.l<LayoutNode, androidx.compose.ui.layout.g0>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$childMeasurables$2
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.ui.layout.g0 invoke(@dl.d LayoutNode it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = it.getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.f0.m(lookaheadPassDelegate);
                    return lookaheadPassDelegate;
                }
            });
            this.childMeasurablesDirty = false;
            return this._childMeasurables.l();
        }

        /* JADX INFO: renamed from: c2, reason: from getter */
        public final boolean getChildMeasurablesDirty() {
            return this.childMeasurablesDirty;
        }

        /* JADX INFO: renamed from: d2, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        @dl.e
        /* JADX INFO: renamed from: e2, reason: from getter */
        public final s1.b getF15180k() {
            return this.f15180k;
        }

        public final void f2(boolean z10) {
            LayoutNode layoutNodeV0;
            LayoutNode layoutNodeV1 = this.f15188s.layoutNode.v0();
            LayoutNode.UsageByParent intrinsicsUsageByParent = this.f15188s.layoutNode.getIntrinsicsUsageByParent();
            if (layoutNodeV1 == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (layoutNodeV1.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (layoutNodeV0 = layoutNodeV1.v0()) != null) {
                layoutNodeV1 = layoutNodeV0;
            }
            int i10 = a.f15190b[intrinsicsUsageByParent.ordinal()];
            if (i10 == 1) {
                layoutNodeV1.l1(z10);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                layoutNodeV1.j1(z10);
            }
        }

        @Override // androidx.compose.ui.node.a
        @dl.e
        public androidx.compose.ui.node.a g0() {
            LayoutNodeLayoutDelegate layoutDelegate;
            LayoutNode layoutNodeV0 = this.f15188s.layoutNode.v0();
            if (layoutNodeV0 == null || (layoutDelegate = layoutNodeV0.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.t();
        }

        @Override // androidx.compose.ui.node.a
        @dl.d
        public Map<androidx.compose.ui.layout.a, Integer> h() {
            if (!this.duringAlignmentLinesQuery) {
                if (this.f15188s.getLayoutState() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().x(true);
                    if (getAlignmentLines().getDirty()) {
                        this.f15188s.E();
                    }
                } else {
                    getAlignmentLines().w(true);
                }
            }
            i0 lookaheadDelegate = R0().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.k2(true);
            }
            I0();
            i0 lookaheadDelegate2 = R0().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.k2(false);
            }
            return getAlignmentLines().h();
        }

        public final void h2() {
            if (this.f15188s.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                List<LayoutNode> listV = this.f15188s.layoutNode.V();
                int size = listV.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LayoutNode layoutNode = listV.get(i10);
                    LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                    if (layoutDelegate.getCoordinatesAccessedDuringPlacement() && !layoutDelegate.getLayoutPending()) {
                        LayoutNode.k1(layoutNode, false, 1, null);
                    }
                    LookaheadPassDelegate lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                    if (lookaheadPassDelegate != null) {
                        lookaheadPassDelegate.h2();
                    }
                }
            }
        }

        @Override // androidx.compose.ui.node.a
        @dl.d
        /* JADX INFO: renamed from: i, reason: from getter */
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.node.a
        public void j(@dl.d yh.l<? super androidx.compose.ui.node.a, b2> block) {
            kotlin.jvm.internal.f0.p(block, "block");
            List<LayoutNode> listV = this.f15188s.layoutNode.V();
            int size = listV.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.node.a aVarT = listV.get(i10).getLayoutDelegate().t();
                kotlin.jvm.internal.f0.m(aVarT);
                block.invoke(aVarT);
            }
        }

        @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.n0
        public int k() {
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return lookaheadDelegate.k();
        }

        public final void k2() {
            if (getIsPlaced()) {
                return;
            }
            q2(true);
            if (this.isPreviouslyPlaced) {
                return;
            }
            n2();
        }

        @Override // androidx.compose.ui.node.a
        public void l() {
            LayoutNode.m1(this.f15188s.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.layout.m
        public int l1(int height) {
            j2();
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return lookaheadDelegate.l1(height);
        }

        public final boolean l2(long constraints) {
            LayoutNode layoutNodeV0 = this.f15188s.layoutNode.v0();
            this.f15188s.layoutNode.t1(this.f15188s.layoutNode.getCanMultiMeasure() || (layoutNodeV0 != null && layoutNodeV0.getCanMultiMeasure()));
            if (!this.f15188s.layoutNode.h0()) {
                s1.b bVar = this.f15180k;
                if (bVar == null ? false : s1.b.g(bVar.getF139216a(), constraints)) {
                    return false;
                }
            }
            this.f15180k = s1.b.b(constraints);
            getAlignmentLines().x(false);
            j(new yh.l<androidx.compose.ui.node.a, b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1
                public final void a(@dl.d a it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    it.getAlignmentLines().z(false);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            });
            this.measuredOnce = true;
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            long jA = s1.s.a(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
            this.f15188s.I(constraints);
            W1(s1.s.a(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
            return (s1.r.m(jA) == lookaheadDelegate.getWidth() && s1.r.j(jA) == lookaheadDelegate.getHeight()) ? false : true;
        }

        public final void m2() {
            if (!this.placedOnce) {
                throw new IllegalStateException("Check failed.".toString());
            }
            U1(this.lastPosition, 0.0f, null);
        }

        public final void o2(boolean z10) {
            this.childMeasurablesDirty = z10;
        }

        public final void p2(boolean z10) {
            this.duringAlignmentLinesQuery = z10;
        }

        public void q2(boolean z10) {
            this.isPlaced = z10;
        }

        @Override // androidx.compose.ui.node.a
        public void requestLayout() {
            LayoutNode.k1(this.f15188s.layoutNode, false, 1, null);
        }

        public final boolean s2() {
            Object parentData = getParentData();
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            boolean z10 = !kotlin.jvm.internal.f0.g(parentData, lookaheadDelegate.getParentData());
            i0 lookaheadDelegate2 = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return z10;
        }

        @Override // androidx.compose.ui.node.a
        /* JADX INFO: renamed from: t, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // androidx.compose.ui.layout.n0
        public int v(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            LayoutNode layoutNodeV0 = this.f15188s.layoutNode.v0();
            if ((layoutNodeV0 != null ? layoutNodeV0.f0() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().z(true);
            } else {
                LayoutNode layoutNodeV1 = this.f15188s.layoutNode.v0();
                if ((layoutNodeV1 != null ? layoutNodeV1.f0() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().y(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            int iV = lookaheadDelegate.v(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return iV;
        }

        @Override // androidx.compose.ui.layout.m
        public int w1(int height) {
            j2();
            i0 lookaheadDelegate = this.f15188s.z().getLookaheadDelegate();
            kotlin.jvm.internal.f0.m(lookaheadDelegate);
            return lookaheadDelegate.w1(height);
        }

        @Override // androidx.compose.ui.layout.g0
        @dl.d
        public androidx.compose.ui.layout.e1 z1(long constraints) {
            r2(this.f15188s.layoutNode);
            if (this.f15188s.layoutNode.getIntrinsicsUsageByParent() == LayoutNode.UsageByParent.NotUsed) {
                this.f15188s.layoutNode.F();
            }
            l2(constraints);
            return this;
        }
    }

    /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bh\u0010iJ\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J@\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u001d\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0002J@\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\rH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0010J\u0006\u0010 \u001a\u00020\u0005J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0006\u0010'\u001a\u00020\u0018J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0(H\u0016J\u001c\u0010+\u001a\u00020\u00052\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0006\u0010.\u001a\u00020\u0005J\u000e\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0018R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00102R\"\u0010:\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001f\u0010<\u001a\u00020\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010;R\u0016\u0010>\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010=R(\u0010E\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010J\u001a\u00020F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b5\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00010K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010R\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u00102\u001a\u0004\bP\u00107\"\u0004\bQ\u00109R\u001c\u0010U\u001a\u0004\u0018\u00010\u00148Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u00107R\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00010\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010aR\u0016\u0010g\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/g0;", "Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/node/a;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/b2;", "l2", "Ls1/n;", CommonNetImpl.POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/t;", "layerBlock", "g2", "(JFLyh/l;)V", "f2", "e2", "I0", "Ls1/b;", "constraints", "z1", "(J)Landroidx/compose/ui/layout/e1;", "", "h2", "(J)Z", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "v", "U1", "i2", "height", "l1", "w1", "width", "L0", androidx.exifinterface.media.a.X4, "m2", "", RXScreenCaptureService.KEY_HEIGHT, "block", "j", "requestLayout", "l", "d2", "forceRequest", "c2", "g", "Z", "measuredOnce", "placedOnce", "i", "a2", "()Z", "k2", "(Z)V", "duringAlignmentLinesQuery", "J", "lastPosition", "F", "lastZIndex", "", "<set-?>", "m", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "parentData", "Landroidx/compose/ui/node/AlignmentLines;", "n", "Landroidx/compose/ui/node/AlignmentLines;", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/runtime/collection/e;", "o", "Landroidx/compose/runtime/collection/e;", "_childMeasurables", "p", "Z1", "j2", "childMeasurablesDirty", "b2", "()Ls1/b;", "lastConstraints", "t", "isPlaced", "Landroidx/compose/ui/node/NodeCoordinator;", "R0", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "Y1", "()Ljava/util/List;", "childMeasurables", "k", "()I", "measuredWidth", androidx.exifinterface.media.a.T4, "measuredHeight", "g0", "()Landroidx/compose/ui/node/a;", "parentAlignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public final class MeasurePassDelegate extends androidx.compose.ui.layout.e1 implements androidx.compose.ui.layout.g0, androidx.compose.ui.node.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean measuredOnce;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean placedOnce;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean duringAlignmentLinesQuery;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @dl.e
        private yh.l<? super androidx.compose.ui.graphics.v0, b2> f15204k;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private float lastZIndex;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Object parentData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long lastPosition = s1.n.f139237b.a();

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final AlignmentLines alignmentLines = new a0(this);

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.runtime.collection.e<androidx.compose.ui.layout.g0> _childMeasurables = new androidx.compose.runtime.collection.e<>(new androidx.compose.ui.layout.g0[16], 0);

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private boolean childMeasurablesDirty = true;

        /* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f15212b;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                f15211a = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                f15212b = iArr2;
            }
        }

        public MeasurePassDelegate() {
        }

        private final void e2() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = layoutNode.B0();
            int i10 = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i10 > 0) {
                LayoutNode[] layoutNodeArrG = eVarB0.G();
                kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i11 = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArrG[i11];
                    if (layoutNode2.m0() && layoutNode2.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.f1(layoutNode2, null, 1, null)) {
                        LayoutNode.q1(layoutNodeLayoutDelegate.layoutNode, false, 1, null);
                    }
                    i11++;
                } while (i11 < i10);
            }
        }

        private final void f2() {
            LayoutNode.UsageByParent intrinsicsUsageByParent;
            LayoutNode.q1(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
            LayoutNode layoutNodeV0 = LayoutNodeLayoutDelegate.this.layoutNode.v0();
            if (layoutNodeV0 == null || LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i10 = a.f15211a[layoutNodeV0.f0().ordinal()];
            if (i10 != 1) {
                intrinsicsUsageByParent = i10 != 2 ? layoutNodeV0.getIntrinsicsUsageByParent() : LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            }
            layoutNode.w1(intrinsicsUsageByParent);
        }

        private final void g2(final long position, final float zIndex, final yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.f15204k = layerBlock;
            this.placedOnce = true;
            getAlignmentLines().w(false);
            LayoutNodeLayoutDelegate.this.M(false);
            OwnerSnapshotObserver snapshotObserver = d0.b(LayoutNodeLayoutDelegate.this.layoutNode).getSnapshotObserver();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            snapshotObserver.c(layoutNode, false, new yh.a<b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.layout.e1.a.Companion companion = androidx.compose.ui.layout.e1.a.INSTANCE;
                    yh.l<androidx.compose.ui.graphics.v0, b2> lVar = layerBlock;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNodeLayoutDelegate;
                    long j10 = position;
                    float f10 = zIndex;
                    if (lVar == null) {
                        companion.q(layoutNodeLayoutDelegate2.z(), j10, f10);
                    } else {
                        companion.E(layoutNodeLayoutDelegate2.z(), j10, f10, lVar);
                    }
                }
            });
        }

        private final void l2(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode layoutNodeV0 = layoutNode.v0();
            if (layoutNodeV0 == null) {
                layoutNode.z1(LayoutNode.UsageByParent.NotUsed);
                return;
            }
            if (!(layoutNode.getMeasuredByParent() == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure())) {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.getMeasuredByParent() + ". Parent state " + layoutNodeV0.f0() + lg.a.f131414g).toString());
            }
            int i10 = a.f15211a[layoutNodeV0.f0().ordinal()];
            if (i10 == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeV0.f0());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            layoutNode.z1(usageByParent);
        }

        @Override // androidx.compose.ui.node.a
        public void I0() {
            getAlignmentLines().s();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending()) {
                e2();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !R0().getIsPlacingForAlignment() && LayoutNodeLayoutDelegate.this.getLayoutPending())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState = LayoutNodeLayoutDelegate.this.getLayoutState();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                final LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                d0.b(layoutNode).getSnapshotObserver().e(layoutNode, false, new yh.a<b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        layoutNodeLayoutDelegate.layoutNode.E();
                        this.j(new yh.l<a, b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1.1
                            public final void a(@dl.d a it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                it.getAlignmentLines().getUsedDuringParentLayout();
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                                a(aVar);
                                return b2.f124493a;
                            }
                        });
                        layoutNode.Y().d2().k();
                        layoutNodeLayoutDelegate.layoutNode.C();
                        this.j(new yh.l<a, b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1.2
                            public final void a(@dl.d a it) {
                                kotlin.jvm.internal.f0.p(it, "it");
                                it.getAlignmentLines().v(it.getAlignmentLines().getUsedDuringParentLayout());
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                                a(aVar);
                                return b2.f124493a;
                            }
                        });
                    }
                });
                LayoutNodeLayoutDelegate.this.layoutState = layoutState;
                if (R0().getIsPlacingForAlignment() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().v(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().l()) {
                getAlignmentLines().r();
            }
        }

        @Override // androidx.compose.ui.layout.m
        public int L0(int width) {
            f2();
            return LayoutNodeLayoutDelegate.this.z().L0(width);
        }

        @Override // androidx.compose.ui.node.a
        @dl.d
        public NodeCoordinator R0() {
            return LayoutNodeLayoutDelegate.this.layoutNode.Y();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.e1
        public void U1(long position, float zIndex, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
            if (!s1.n.j(position, this.lastPosition)) {
                d2();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.B(layoutNodeLayoutDelegate.layoutNode)) {
                androidx.compose.ui.layout.e1.a.Companion companion = androidx.compose.ui.layout.e1.a.INSTANCE;
                LookaheadPassDelegate lookaheadPassDelegate = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
                kotlin.jvm.internal.f0.m(lookaheadPassDelegate);
                androidx.compose.ui.layout.e1.a.p(companion, lookaheadPassDelegate, s1.n.m(position), s1.n.o(position), 0.0f, 4, null);
            }
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
            g2(position, zIndex, layerBlock);
            LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
        }

        @Override // androidx.compose.ui.layout.m
        public int V(int width) {
            f2();
            return LayoutNodeLayoutDelegate.this.z().V(width);
        }

        @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.n0
        public int W() {
            return LayoutNodeLayoutDelegate.this.z().W();
        }

        @dl.d
        public final List<androidx.compose.ui.layout.g0> Y1() {
            LayoutNodeLayoutDelegate.this.layoutNode.G1();
            if (!this.childMeasurablesDirty) {
                return this._childMeasurables.l();
            }
            e0.b(LayoutNodeLayoutDelegate.this.layoutNode, this._childMeasurables, new yh.l<LayoutNode, androidx.compose.ui.layout.g0>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.ui.layout.g0 invoke(@dl.d LayoutNode it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return it.getLayoutDelegate().getMeasurePassDelegate();
                }
            });
            this.childMeasurablesDirty = false;
            return this._childMeasurables.l();
        }

        /* JADX INFO: renamed from: Z1, reason: from getter */
        public final boolean getChildMeasurablesDirty() {
            return this.childMeasurablesDirty;
        }

        /* JADX INFO: renamed from: a2, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.n0
        @dl.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        @dl.e
        public final s1.b b2() {
            if (this.measuredOnce) {
                return s1.b.b(getMeasurementConstraints());
            }
            return null;
        }

        public final void c2(boolean z10) {
            LayoutNode layoutNodeV0;
            LayoutNode layoutNodeV1 = LayoutNodeLayoutDelegate.this.layoutNode.v0();
            LayoutNode.UsageByParent intrinsicsUsageByParent = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            if (layoutNodeV1 == null || intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (layoutNodeV1.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (layoutNodeV0 = layoutNodeV1.v0()) != null) {
                layoutNodeV1 = layoutNodeV0;
            }
            int i10 = a.f15212b[intrinsicsUsageByParent.ordinal()];
            if (i10 == 1) {
                layoutNodeV1.p1(z10);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                layoutNodeV1.n1(z10);
            }
        }

        public final void d2() {
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                List<LayoutNode> listV = LayoutNodeLayoutDelegate.this.layoutNode.V();
                int size = listV.size();
                for (int i10 = 0; i10 < size; i10++) {
                    LayoutNode layoutNode = listV.get(i10);
                    LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                    if (layoutDelegate.getCoordinatesAccessedDuringPlacement() && !layoutDelegate.getLayoutPending()) {
                        LayoutNode.o1(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().d2();
                }
            }
        }

        @Override // androidx.compose.ui.node.a
        @dl.e
        public androidx.compose.ui.node.a g0() {
            LayoutNodeLayoutDelegate layoutDelegate;
            LayoutNode layoutNodeV0 = LayoutNodeLayoutDelegate.this.layoutNode.v0();
            if (layoutNodeV0 == null || (layoutDelegate = layoutNodeV0.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.l();
        }

        @Override // androidx.compose.ui.node.a
        @dl.d
        public Map<androidx.compose.ui.layout.a, Integer> h() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().x(true);
                    if (getAlignmentLines().getDirty()) {
                        LayoutNodeLayoutDelegate.this.D();
                    }
                } else {
                    getAlignmentLines().w(true);
                }
            }
            R0().k2(true);
            I0();
            R0().k2(false);
            return getAlignmentLines().h();
        }

        public final boolean h2(long constraints) {
            b1 b1VarB = d0.b(LayoutNodeLayoutDelegate.this.layoutNode);
            LayoutNode layoutNodeV0 = LayoutNodeLayoutDelegate.this.layoutNode.v0();
            boolean z10 = true;
            LayoutNodeLayoutDelegate.this.layoutNode.t1(LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure() || (layoutNodeV0 != null && layoutNodeV0.getCanMultiMeasure()));
            if (!LayoutNodeLayoutDelegate.this.layoutNode.m0() && s1.b.g(getMeasurementConstraints(), constraints)) {
                b1VarB.u(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNodeLayoutDelegate.this.layoutNode.s1();
                return false;
            }
            getAlignmentLines().x(false);
            j(new yh.l<androidx.compose.ui.node.a, b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1
                public final void a(@dl.d a it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    it.getAlignmentLines().z(false);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            });
            this.measuredOnce = true;
            long jA = LayoutNodeLayoutDelegate.this.z().a();
            X1(constraints);
            LayoutNodeLayoutDelegate.this.J(constraints);
            if (s1.r.h(LayoutNodeLayoutDelegate.this.z().a(), jA) && LayoutNodeLayoutDelegate.this.z().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.z().getHeight() == getHeight()) {
                z10 = false;
            }
            W1(s1.s.a(LayoutNodeLayoutDelegate.this.z().getWidth(), LayoutNodeLayoutDelegate.this.z().getHeight()));
            return z10;
        }

        @Override // androidx.compose.ui.node.a
        @dl.d
        /* JADX INFO: renamed from: i, reason: from getter */
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        public final void i2() {
            if (!this.placedOnce) {
                throw new IllegalStateException("Check failed.".toString());
            }
            g2(this.lastPosition, this.lastZIndex, this.f15204k);
        }

        @Override // androidx.compose.ui.node.a
        public void j(@dl.d yh.l<? super androidx.compose.ui.node.a, b2> block) {
            kotlin.jvm.internal.f0.p(block, "block");
            List<LayoutNode> listV = LayoutNodeLayoutDelegate.this.layoutNode.V();
            int size = listV.size();
            for (int i10 = 0; i10 < size; i10++) {
                block.invoke(listV.get(i10).getLayoutDelegate().l());
            }
        }

        public final void j2(boolean z10) {
            this.childMeasurablesDirty = z10;
        }

        @Override // androidx.compose.ui.layout.e1, androidx.compose.ui.layout.n0
        public int k() {
            return LayoutNodeLayoutDelegate.this.z().k();
        }

        public final void k2(boolean z10) {
            this.duringAlignmentLinesQuery = z10;
        }

        @Override // androidx.compose.ui.node.a
        public void l() {
            LayoutNode.q1(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.layout.m
        public int l1(int height) {
            f2();
            return LayoutNodeLayoutDelegate.this.z().l1(height);
        }

        public final boolean m2() {
            boolean z10 = !kotlin.jvm.internal.f0.g(getParentData(), LayoutNodeLayoutDelegate.this.z().getParentData());
            this.parentData = LayoutNodeLayoutDelegate.this.z().getParentData();
            return z10;
        }

        @Override // androidx.compose.ui.node.a
        public void requestLayout() {
            LayoutNode.o1(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.a
        /* JADX INFO: renamed from: t */
        public boolean getIsPlaced() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getIsPlaced();
        }

        @Override // androidx.compose.ui.layout.n0
        public int v(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            LayoutNode layoutNodeV0 = LayoutNodeLayoutDelegate.this.layoutNode.v0();
            if ((layoutNodeV0 != null ? layoutNodeV0.f0() : null) == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().z(true);
            } else {
                LayoutNode layoutNodeV1 = LayoutNodeLayoutDelegate.this.layoutNode.v0();
                if ((layoutNodeV1 != null ? layoutNodeV1.f0() : null) == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().y(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            int iV = LayoutNodeLayoutDelegate.this.z().v(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return iV;
        }

        @Override // androidx.compose.ui.layout.m
        public int w1(int height) {
            f2();
            return LayoutNodeLayoutDelegate.this.z().w1(height);
        }

        @Override // androidx.compose.ui.layout.g0
        @dl.d
        public androidx.compose.ui.layout.e1 z1(long constraints) {
            LayoutNode.UsageByParent intrinsicsUsageByParent = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent == usageByParent) {
                LayoutNodeLayoutDelegate.this.layoutNode.F();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.B(layoutNodeLayoutDelegate.layoutNode)) {
                this.measuredOnce = true;
                X1(constraints);
                LayoutNodeLayoutDelegate.this.layoutNode.A1(usageByParent);
                LookaheadPassDelegate lookaheadPassDelegate = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
                kotlin.jvm.internal.f0.m(lookaheadPassDelegate);
                lookaheadPassDelegate.z1(constraints);
            }
            l2(LayoutNodeLayoutDelegate.this.layoutNode);
            h2(constraints);
            return this;
        }
    }

    public LayoutNodeLayoutDelegate(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layoutState = LayoutNode.LayoutState.Idle;
        this.measurePassDelegate = new MeasurePassDelegate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B(LayoutNode layoutNode) {
        androidx.compose.ui.layout.f0 mLookaheadScope = layoutNode.getMLookaheadScope();
        return kotlin.jvm.internal.f0.g(mLookaheadScope != null ? mLookaheadScope.getRoot() : null, layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(final long constraints) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.h(d0.b(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new yh.a<b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performLookaheadMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                i0 lookaheadDelegate = this.f15224b.z().getLookaheadDelegate();
                kotlin.jvm.internal.f0.m(lookaheadDelegate);
                lookaheadDelegate.z1(constraints);
            }
        }, 2, null);
        E();
        if (B(this.layoutNode)) {
            D();
        } else {
            G();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(final long constraints) {
        LayoutNode.LayoutState layoutState = this.layoutState;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (!(layoutState == layoutState2)) {
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
        this.layoutState = layoutState3;
        this.measurePending = false;
        d0.b(this.layoutNode).getSnapshotObserver().g(this.layoutNode, false, new yh.a<b2>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f15226b.z().z1(constraints);
            }
        });
        if (this.layoutState == layoutState3) {
            D();
            this.layoutState = layoutState2;
        }
    }

    public final int A() {
        return this.measurePassDelegate.getWidth();
    }

    public final void C() {
        this.measurePassDelegate.j2(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.o2(true);
        }
    }

    public final void D() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void E() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void F() {
        this.lookaheadMeasurePending = true;
    }

    public final void G() {
        this.measurePending = true;
    }

    public final void H(@dl.e androidx.compose.ui.layout.f0 newScope) {
        this.lookaheadPassDelegate = newScope != null ? new LookaheadPassDelegate(this, newScope) : null;
    }

    public final void K() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().t();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.t();
    }

    public final void L(int i10) {
        int i11 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode layoutNodeV0 = this.layoutNode.v0();
            LayoutNodeLayoutDelegate layoutDelegate = layoutNodeV0 != null ? layoutNodeV0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i10 == 0) {
                    layoutDelegate.L(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.L(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void M(boolean z10) {
        if (this.coordinatesAccessedDuringPlacement != z10) {
            this.coordinatesAccessedDuringPlacement = z10;
            if (z10) {
                L(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                L(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void N() {
        LayoutNode layoutNodeV0;
        if (this.measurePassDelegate.m2() && (layoutNodeV0 = this.layoutNode.v0()) != null) {
            LayoutNode.q1(layoutNodeV0, false, 1, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null && lookaheadPassDelegate.s2()) {
            if (B(this.layoutNode)) {
                LayoutNode layoutNodeV1 = this.layoutNode.v0();
                if (layoutNodeV1 != null) {
                    LayoutNode.q1(layoutNodeV1, false, 1, null);
                    return;
                }
                return;
            }
            LayoutNode layoutNodeV2 = this.layoutNode.v0();
            if (layoutNodeV2 != null) {
                LayoutNode.m1(layoutNodeV2, false, 1, null);
            }
        }
    }

    @dl.d
    public final a l() {
        return this.measurePassDelegate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final int o() {
        return this.measurePassDelegate.getHeight();
    }

    @dl.e
    public final s1.b p() {
        return this.measurePassDelegate.b2();
    }

    @dl.e
    public final s1.b q() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.getF15180k();
        }
        return null;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    @dl.d
    /* JADX INFO: renamed from: s, reason: from getter */
    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutState;
    }

    @dl.e
    public final a t() {
        return this.lookaheadPassDelegate;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    @dl.e
    /* JADX INFO: renamed from: w, reason: from getter */
    public final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    @dl.d
    /* JADX INFO: renamed from: x, reason: from getter */
    public final MeasurePassDelegate getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    @dl.d
    public final NodeCoordinator z() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }
}
