package androidx.compose.ui.node;

import androidx.compose.runtime.h2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: IntrinsicsPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R/\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/q;", "", "Landroidx/compose/ui/layout/i0;", "g", "measurePolicy", "Lkotlin/b2;", "m", "", "height", "i", "width", RXScreenCaptureService.KEY_HEIGHT, "d", ak.aF, "k", "j", "f", "e", "Landroidx/compose/ui/node/LayoutNode;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<set-?>", "b", "Landroidx/compose/runtime/a1;", "()Landroidx/compose/ui/layout/i0;", "l", "(Landroidx/compose/ui/layout/i0;)V", "measurePolicyState", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final a f15358c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final String f15359d = "Intrinsic size is queried but there is no measure policy in place.";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 measurePolicyState;

    /* JADX INFO: compiled from: IntrinsicsPolicy.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/q$a;", "", "", "NoPolicyError", "Ljava/lang/String;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public q(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.measurePolicyState = h2.g(null, null, 2, null);
    }

    private final androidx.compose.ui.layout.i0 b() {
        return (androidx.compose.ui.layout.i0) this.measurePolicyState.getValue();
    }

    private final androidx.compose.ui.layout.i0 g() {
        androidx.compose.ui.layout.i0 i0VarB = b();
        if (i0VarB != null) {
            return i0VarB;
        }
        throw new IllegalStateException(f15359d.toString());
    }

    private final void l(androidx.compose.ui.layout.i0 i0Var) {
        this.measurePolicyState.setValue(i0Var);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int c(int width) {
        return g().d(this.layoutNode.t0(), this.layoutNode.U(), width);
    }

    public final int d(int height) {
        return g().e(this.layoutNode.t0(), this.layoutNode.U(), height);
    }

    public final int e(int width) {
        return g().d(this.layoutNode.t0(), this.layoutNode.T(), width);
    }

    public final int f(int height) {
        return g().e(this.layoutNode.t0(), this.layoutNode.T(), height);
    }

    public final int h(int width) {
        return g().b(this.layoutNode.t0(), this.layoutNode.U(), width);
    }

    public final int i(int height) {
        return g().c(this.layoutNode.t0(), this.layoutNode.U(), height);
    }

    public final int j(int width) {
        return g().b(this.layoutNode.t0(), this.layoutNode.T(), width);
    }

    public final int k(int height) {
        return g().c(this.layoutNode.t0(), this.layoutNode.T(), height);
    }

    public final void m(@dl.d androidx.compose.ui.layout.i0 measurePolicy) {
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        l(measurePolicy);
    }
}
