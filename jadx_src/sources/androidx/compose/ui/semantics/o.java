package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.j1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SemanticsOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/semantics/o;", "", "Landroidx/compose/ui/node/LayoutNode;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "()Landroidx/compose/ui/semantics/SemanticsNode;", "rootSemanticsNode", "b", "unmergedRootSemanticsNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16154b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode rootNode;

    public o(@dl.d LayoutNode rootNode) {
        f0.p(rootNode, "rootNode");
        this.rootNode = rootNode;
    }

    @dl.d
    public final SemanticsNode a() {
        j1 j1VarK = n.k(this.rootNode);
        f0.m(j1VarK);
        return new SemanticsNode(j1VarK, true, null, 4, null);
    }

    @dl.d
    public final SemanticsNode b() {
        j1 j1VarK = n.k(this.rootNode);
        f0.m(j1VarK);
        return new SemanticsNode(j1VarK, false, null, 4, null);
    }
}
