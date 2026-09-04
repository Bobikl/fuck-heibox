package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/b1;", "b", "child", "Lkotlin/b2;", ak.av, "", "Z", "DebugChanges", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f15304a = false;

    public static final void a(@dl.d LayoutNode layoutNode, @dl.d LayoutNode child) {
        kotlin.jvm.internal.f0.p(layoutNode, "<this>");
        kotlin.jvm.internal.f0.p(child, "child");
        layoutNode.H0(layoutNode.V().size(), child);
    }

    @dl.d
    public static final b1 b(@dl.d LayoutNode layoutNode) {
        kotlin.jvm.internal.f0.p(layoutNode, "<this>");
        b1 owner = layoutNode.getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
