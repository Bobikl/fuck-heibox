package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: TestModifierUpdater.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/layout/s1;", "", "Landroidx/compose/ui/n;", "modifier", "Lkotlin/b2;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNode;", "node", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15043b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode node;

    public s1(@dl.d LayoutNode node) {
        kotlin.jvm.internal.f0.p(node, "node");
        this.node = node;
    }

    public final void a(@dl.d androidx.compose.ui.n modifier) {
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        this.node.f(modifier);
    }
}
