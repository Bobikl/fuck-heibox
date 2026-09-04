package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\bÃ\u0002\u0018\u00002\u00020\u0001:\u0004\u000f\u000e\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000bJ/\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics;", "", "Landroidx/compose/ui/node/v;", "node", "Landroidx/compose/ui/layout/n;", "instrinsicMeasureScope", "Landroidx/compose/ui/layout/m;", "intrinsicMeasurable", "", RXScreenCaptureService.KEY_HEIGHT, "d", "(Landroidx/compose/ui/node/v;Landroidx/compose/ui/layout/n;Landroidx/compose/ui/layout/m;I)I", RXScreenCaptureService.KEY_WIDTH, ak.aF, "b", ak.av, "<init>", "()V", "IntrinsicMinMax", "IntrinsicWidthHeight", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class NodeMeasuringIntrinsics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final NodeMeasuringIntrinsics f15280a = new NodeMeasuringIntrinsics();

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum IntrinsicMinMax {
        Min,
        Max
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", com.google.common.net.c.f58864t1, "Height", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum IntrinsicWidthHeight {
        Width,
        Height
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$a;", "Landroidx/compose/ui/layout/g0;", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/e1;", "z1", "(J)Landroidx/compose/ui/layout/e1;", "", "height", "l1", "w1", "width", "L0", androidx.exifinterface.media.a.X4, "Landroidx/compose/ui/layout/m;", "b", "Landroidx/compose/ui/layout/m;", ak.av, "()Landroidx/compose/ui/layout/m;", "measurable", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", ak.aF, "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "()Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "d", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "()Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "widthHeight", "", "()Ljava/lang/Object;", "parentData", "<init>", "(Landroidx/compose/ui/layout/m;Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements androidx.compose.ui.layout.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final androidx.compose.ui.layout.m measurable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final IntrinsicMinMax minMax;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final IntrinsicWidthHeight widthHeight;

        public a(@dl.d androidx.compose.ui.layout.m measurable, @dl.d IntrinsicMinMax minMax, @dl.d IntrinsicWidthHeight widthHeight) {
            kotlin.jvm.internal.f0.p(measurable, "measurable");
            kotlin.jvm.internal.f0.p(minMax, "minMax");
            kotlin.jvm.internal.f0.p(widthHeight, "widthHeight");
            this.measurable = measurable;
            this.minMax = minMax;
            this.widthHeight = widthHeight;
        }

        @Override // androidx.compose.ui.layout.m
        public int L0(int width) {
            return this.measurable.L0(width);
        }

        @Override // androidx.compose.ui.layout.m
        public int V(int width) {
            return this.measurable.V(width);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final androidx.compose.ui.layout.m getMeasurable() {
            return this.measurable;
        }

        @Override // androidx.compose.ui.layout.m
        @dl.e
        public Object b() {
            return this.measurable.b();
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.ui.layout.m
        public int l1(int height) {
            return this.measurable.l1(height);
        }

        @Override // androidx.compose.ui.layout.m
        public int w1(int height) {
            return this.measurable.w1(height);
        }

        @Override // androidx.compose.ui.layout.g0
        @dl.d
        public androidx.compose.ui.layout.e1 z1(long constraints) {
            if (this.widthHeight == IntrinsicWidthHeight.Width) {
                return new b(this.minMax == IntrinsicMinMax.Max ? this.measurable.w1(s1.b.o(constraints)) : this.measurable.l1(s1.b.o(constraints)), s1.b.o(constraints));
            }
            return new b(s1.b.p(constraints), this.minMax == IntrinsicMinMax.Max ? this.measurable.V(s1.b.p(constraints)) : this.measurable.L0(s1.b.p(constraints)));
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J@\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0002\b\rH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$b;", "Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "v", "Ls1/n;", CommonNetImpl.POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v0;", "Lkotlin/b2;", "Lkotlin/t;", "layerBlock", "U1", "(JFLyh/l;)V", "width", "height", "<init>", "(II)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends androidx.compose.ui.layout.e1 {
        public b(int i10, int i11) {
            W1(s1.s.a(i10, i11));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.e1
        public void U1(long position, float zIndex, @dl.e yh.l<? super androidx.compose.ui.graphics.v0, b2> layerBlock) {
        }

        @Override // androidx.compose.ui.layout.n0
        public int v(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            return Integer.MIN_VALUE;
        }
    }

    private NodeMeasuringIntrinsics() {
    }

    public final int a(@dl.d v node, @dl.d androidx.compose.ui.layout.n instrinsicMeasureScope, @dl.d androidx.compose.ui.layout.m intrinsicMeasurable, int w10) {
        kotlin.jvm.internal.f0.p(node, "node");
        kotlin.jvm.internal.f0.p(instrinsicMeasureScope, "instrinsicMeasureScope");
        kotlin.jvm.internal.f0.p(intrinsicMeasurable, "intrinsicMeasurable");
        return node.k(new androidx.compose.ui.layout.o(instrinsicMeasureScope, instrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), s1.c.b(0, w10, 0, 0, 13, null)).getHeight();
    }

    public final int b(@dl.d v node, @dl.d androidx.compose.ui.layout.n instrinsicMeasureScope, @dl.d androidx.compose.ui.layout.m intrinsicMeasurable, int h10) {
        kotlin.jvm.internal.f0.p(node, "node");
        kotlin.jvm.internal.f0.p(instrinsicMeasureScope, "instrinsicMeasureScope");
        kotlin.jvm.internal.f0.p(intrinsicMeasurable, "intrinsicMeasurable");
        return node.k(new androidx.compose.ui.layout.o(instrinsicMeasureScope, instrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), s1.c.b(0, 0, 0, h10, 7, null)).getWidth();
    }

    public final int c(@dl.d v node, @dl.d androidx.compose.ui.layout.n instrinsicMeasureScope, @dl.d androidx.compose.ui.layout.m intrinsicMeasurable, int w10) {
        kotlin.jvm.internal.f0.p(node, "node");
        kotlin.jvm.internal.f0.p(instrinsicMeasureScope, "instrinsicMeasureScope");
        kotlin.jvm.internal.f0.p(intrinsicMeasurable, "intrinsicMeasurable");
        return node.k(new androidx.compose.ui.layout.o(instrinsicMeasureScope, instrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), s1.c.b(0, w10, 0, 0, 13, null)).getHeight();
    }

    public final int d(@dl.d v node, @dl.d androidx.compose.ui.layout.n instrinsicMeasureScope, @dl.d androidx.compose.ui.layout.m intrinsicMeasurable, int h10) {
        kotlin.jvm.internal.f0.p(node, "node");
        kotlin.jvm.internal.f0.p(instrinsicMeasureScope, "instrinsicMeasureScope");
        kotlin.jvm.internal.f0.p(intrinsicMeasurable, "intrinsicMeasurable");
        return node.k(new androidx.compose.ui.layout.o(instrinsicMeasureScope, instrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), s1.c.b(0, 0, 0, h10, 7, null)).getWidth();
    }
}
