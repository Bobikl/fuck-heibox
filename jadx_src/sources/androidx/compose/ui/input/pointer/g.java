package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.f1;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/g;", "", "Landroidx/compose/ui/input/pointer/x;", "pointerId", "", "Landroidx/compose/ui/node/f1;", "pointerInputNodes", "Lkotlin/b2;", ak.av, "(JLjava/util/List;)V", "Landroidx/compose/ui/input/pointer/h;", "internalPointerEvent", "", "isInBounds", "b", "e", "f", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/q;", "rootCoordinates", "Landroidx/compose/ui/input/pointer/n;", "Landroidx/compose/ui/input/pointer/n;", "d", "()Landroidx/compose/ui/input/pointer/n;", "root", "<init>", "(Landroidx/compose/ui/layout/q;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.layout.q rootCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n root;

    public g(@dl.d androidx.compose.ui.layout.q rootCoordinates) {
        kotlin.jvm.internal.f0.p(rootCoordinates, "rootCoordinates");
        this.rootCoordinates = rootCoordinates;
        this.root = new n();
    }

    public static /* synthetic */ boolean c(g gVar, h hVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return gVar.b(hVar, z10);
    }

    public final void a(long pointerId, @dl.d List<? extends f1> pointerInputNodes) {
        Node node;
        kotlin.jvm.internal.f0.p(pointerInputNodes, "pointerInputNodes");
        n nVar = this.root;
        int size = pointerInputNodes.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            f1 f1Var = pointerInputNodes.get(i10);
            if (z10) {
                androidx.compose.runtime.collection.e<Node> eVarG = nVar.g();
                int i11 = eVarG.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                if (i11 <= 0) {
                    node = null;
                    break;
                }
                Node[] nodeArrG = eVarG.G();
                kotlin.jvm.internal.f0.n(nodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i12 = 0;
                while (true) {
                    node = nodeArrG[i12];
                    if (kotlin.jvm.internal.f0.g(node.getPointerInputFilter(), f1Var)) {
                        break;
                    }
                    i12++;
                    if (i12 >= i11) {
                        node = null;
                        break;
                    }
                }
                Node node2 = node;
                if (node2 != null) {
                    node2.n();
                    if (!node2.k().n(x.a(pointerId))) {
                        node2.k().b(x.a(pointerId));
                    }
                    nVar = node2;
                } else {
                    z10 = false;
                    Node node3 = new Node(f1Var);
                    node3.k().b(x.a(pointerId));
                    nVar.g().b(node3);
                    nVar = node3;
                }
            } else {
                Node node4 = new Node(f1Var);
                node4.k().b(x.a(pointerId));
                nVar.g().b(node4);
                nVar = node4;
            }
        }
    }

    public final boolean b(@dl.d h internalPointerEvent, boolean isInBounds) {
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        if (this.root.a(internalPointerEvent.a(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return this.root.e(internalPointerEvent) || this.root.f(internalPointerEvent.a(), this.rootCoordinates, internalPointerEvent, isInBounds);
        }
        return false;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final n getRoot() {
        return this.root;
    }

    public final void e() {
        this.root.d();
        this.root.c();
    }

    public final void f() {
        this.root.h();
    }
}
