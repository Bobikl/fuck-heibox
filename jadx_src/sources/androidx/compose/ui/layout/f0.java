package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/f0;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "block", "b", "(Lyh/a;)Ljava/lang/Object;", "Landroidx/compose/ui/node/LayoutNode;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/b;", "disposableSnapshot", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.snapshots.b disposableSnapshot;

    public f0(@dl.d LayoutNode root) {
        kotlin.jvm.internal.f0.p(root, "root");
        this.root = root;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LayoutNode getRoot() {
        return this.root;
    }

    public final <T> T b(@dl.d yh.a<? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        if (!(this.disposableSnapshot == null)) {
            throw new IllegalStateException("Disposable snapshot is already active".toString());
        }
        androidx.compose.runtime.snapshots.b bVarN = androidx.compose.runtime.snapshots.f.Companion.n(androidx.compose.runtime.snapshots.f.INSTANCE, null, null, 3, null);
        this.disposableSnapshot = bVarN;
        try {
            androidx.compose.runtime.snapshots.f fVarP = bVarN.p();
            try {
                T tInvoke = block.invoke();
                bVarN.w(fVarP);
                bVarN.d();
                this.disposableSnapshot = null;
                return tInvoke;
            } catch (Throwable th2) {
                bVarN.w(fVarP);
                throw th2;
            }
        } catch (Throwable th3) {
            bVarN.d();
            this.disposableSnapshot = null;
            throw th3;
        }
    }
}
