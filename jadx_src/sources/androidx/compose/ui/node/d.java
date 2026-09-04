package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: DelegatableNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a,\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a,\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0002\u001a,\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001a,\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0006H\u0081\bø\u0001\u0000\u001a,\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001a,\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001aG\u0010\u0017\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0014\u0018\u0001*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aG\u0010\u0019\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0014\u0018\u0001*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0018\u001a2\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0014\u0018\u0001*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0081\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a2\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0014\u0018\u0001*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0081\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001b\u001aG\u0010\u001d\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0014\u0018\u0001*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u0018\u001a6\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\u001e*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0081\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\u001b\u001aG\u0010 \u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0014\u0018\u0001*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010\u0018\u001aG\u0010!\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0014\u0018\u0001*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\u0018\u001aG\u0010\"\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0014\u0018\u0001*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010\u0018\u001a%\u0010#\u001a\u00020\u0010*\u00020\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010$\u001a%\u0010'\u001a\u00020&*\u00020\u00002\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b'\u0010(\u001a\f\u0010*\u001a\u00020)*\u00020\u0000H\u0001\u001a\f\u0010,\u001a\u00020+*\u00020\u0000H\u0001\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/node/c;", "", "mask", "Landroidx/compose/ui/n$d;", "d", "f", "Lkotlin/Function1;", "Lkotlin/b2;", "block", "m", RXScreenCaptureService.KEY_HEIGHT, ak.aG, "Landroidx/compose/runtime/collection/e;", "node", "b", "o", "", RXScreenCaptureService.KEY_WIDTH, "q", ak.aB, androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/node/v0;", "type", "r", "(Landroidx/compose/ui/node/c;ILyh/l;)V", "t", "g", "(Landroidx/compose/ui/node/c;I)Ljava/lang/Object;", "e", "n", "", "i", "v", "p", "x", ak.aF, "(Landroidx/compose/ui/node/c;I)Z", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "j", "(Landroidx/compose/ui/node/c;I)Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "k", "Landroidx/compose/ui/node/b1;", "l", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.runtime.collection.e<androidx.compose.ui.n.d> eVar, androidx.compose.ui.n.d dVar) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarB0 = k(dVar).B0();
        int iK = eVarB0.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (iK > 0) {
            int i10 = iK - 1;
            LayoutNode[] layoutNodeArrG = eVarB0.G();
            kotlin.jvm.internal.f0.n(layoutNodeArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                eVar.b(layoutNodeArrG[i10].getNodes().getHead());
                i10--;
            } while (i10 >= 0);
        }
    }

    @androidx.compose.ui.g
    public static final boolean c(@dl.d c has, int i10) {
        kotlin.jvm.internal.f0.p(has, "$this$has");
        return (has.getNode().getAggregateChildKindSet() & i10) != 0;
    }

    @androidx.compose.ui.g
    @dl.e
    public static final androidx.compose.ui.n.d d(@dl.d c cVar, int i10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        androidx.compose.ui.n.d child = cVar.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i10) == 0) {
            return null;
        }
        while (child != null) {
            if ((child.getKindSet() & i10) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> T e(c localChild, int i10) {
        kotlin.jvm.internal.f0.p(localChild, "$this$localChild");
        T t10 = (T) d(localChild, i10);
        kotlin.jvm.internal.f0.y(2, androidx.exifinterface.media.a.f23244d5);
        return t10;
    }

    @androidx.compose.ui.g
    @dl.e
    public static final androidx.compose.ui.n.d f(@dl.d c cVar, int i10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        for (androidx.compose.ui.n.d parent = cVar.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i10) != 0) {
                return parent;
            }
        }
        return null;
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> T g(c localParent, int i10) {
        kotlin.jvm.internal.f0.p(localParent, "$this$localParent");
        T t10 = (T) f(localParent, i10);
        kotlin.jvm.internal.f0.y(2, androidx.exifinterface.media.a.f23244d5);
        return t10;
    }

    @androidx.compose.ui.g
    @dl.e
    public static final androidx.compose.ui.n.d h(@dl.d c cVar, int i10) {
        t0 t0VarQ0;
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        if (!cVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d parent = cVar.getNode().getParent();
        LayoutNode layoutNodeK = k(cVar);
        while (layoutNodeK != null) {
            if ((layoutNodeK.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        return parent;
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeK = layoutNodeK.v0();
            parent = (layoutNodeK == null || (t0VarQ0 = layoutNodeK.getNodes()) == null) ? null : t0VarQ0.getTail();
        }
        return null;
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> T i(c nearestAncestor, int i10) {
        kotlin.jvm.internal.f0.p(nearestAncestor, "$this$nearestAncestor");
        T t10 = (T) h(nearestAncestor, i10);
        kotlin.jvm.internal.f0.y(2, androidx.exifinterface.media.a.f23244d5);
        return t10;
    }

    @androidx.compose.ui.g
    @dl.d
    public static final NodeCoordinator j(@dl.d c requireCoordinator, int i10) {
        kotlin.jvm.internal.f0.p(requireCoordinator, "$this$requireCoordinator");
        NodeCoordinator coordinator = requireCoordinator.getNode().getCoordinator();
        kotlin.jvm.internal.f0.m(coordinator);
        if (coordinator.getTail() != requireCoordinator || !w0.c(i10)) {
            return coordinator;
        }
        NodeCoordinator wrapped = coordinator.getWrapped();
        kotlin.jvm.internal.f0.m(wrapped);
        return wrapped;
    }

    @androidx.compose.ui.g
    @dl.d
    public static final LayoutNode k(@dl.d c cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        NodeCoordinator coordinator = cVar.getNode().getCoordinator();
        kotlin.jvm.internal.f0.m(coordinator);
        return coordinator.getLayoutNode();
    }

    @androidx.compose.ui.g
    @dl.d
    public static final b1 l(@dl.d c cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        b1 b1VarU0 = k(cVar).getOwner();
        kotlin.jvm.internal.f0.m(b1VarU0);
        return b1VarU0;
    }

    @androidx.compose.ui.g
    public static final void m(@dl.d c cVar, int i10, @dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        t0 t0VarQ0;
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!cVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d parent = cVar.getNode().getParent();
        LayoutNode layoutNodeK = k(cVar);
        while (layoutNodeK != null) {
            if ((layoutNodeK.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        block.invoke(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeK = layoutNodeK.v0();
            parent = (layoutNodeK == null || (t0VarQ0 = layoutNodeK.getNodes()) == null) ? null : t0VarQ0.getTail();
        }
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> void n(c visitAncestors, int i10, yh.l<? super T, b2> block) {
        t0 t0VarQ0;
        kotlin.jvm.internal.f0.p(visitAncestors, "$this$visitAncestors");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!visitAncestors.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d parent = visitAncestors.getNode().getParent();
        LayoutNode layoutNodeK = k(visitAncestors);
        while (layoutNodeK != null) {
            if ((layoutNodeK.getNodes().getHead().getAggregateChildKindSet() & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                        block.invoke(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeK = layoutNodeK.v0();
            parent = (layoutNodeK == null || (t0VarQ0 = layoutNodeK.getNodes()) == null) ? null : t0VarQ0.getTail();
        }
    }

    @androidx.compose.ui.g
    public static final void o(@dl.d c cVar, int i10, @dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!cVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new androidx.compose.ui.n.d[16], 0);
        androidx.compose.ui.n.d child = cVar.getNode().getChild();
        if (child == null) {
            b(eVar, cVar.getNode());
        } else {
            eVar.b(child);
        }
        while (eVar.Q()) {
            androidx.compose.ui.n.d child2 = (androidx.compose.ui.n.d) eVar.g0(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            if ((child2.getAggregateChildKindSet() & i10) == 0) {
                b(eVar, child2);
            } else {
                while (child2 != null) {
                    if ((child2.getKindSet() & i10) != 0) {
                        block.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> void p(c visitChildren, int i10, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(visitChildren, "$this$visitChildren");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!visitChildren.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new androidx.compose.ui.n.d[16], 0);
        androidx.compose.ui.n.d child = visitChildren.getNode().getChild();
        if (child == null) {
            b(eVar, visitChildren.getNode());
        } else {
            eVar.b(child);
        }
        while (eVar.Q()) {
            androidx.compose.ui.n.d child2 = (androidx.compose.ui.n.d) eVar.g0(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            if ((child2.getAggregateChildKindSet() & i10) == 0) {
                b(eVar, child2);
            } else {
                while (child2 != null) {
                    if ((child2.getKindSet() & i10) != 0) {
                        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                        block.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    @androidx.compose.ui.g
    public static final void q(@dl.d c cVar, int i10, @dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!cVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d node = cVar.getNode();
        if ((node.getAggregateChildKindSet() & i10) == 0) {
            return;
        }
        for (androidx.compose.ui.n.d child = node.getChild(); child != null; child = child.getChild()) {
            if ((child.getKindSet() & i10) != 0) {
                block.invoke(child);
            }
        }
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> void r(c visitLocalChildren, int i10, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(visitLocalChildren, "$this$visitLocalChildren");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!visitLocalChildren.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d node = visitLocalChildren.getNode();
        if ((node.getAggregateChildKindSet() & i10) != 0) {
            for (androidx.compose.ui.n.d child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i10) != 0) {
                    kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                    block.invoke(child);
                }
            }
        }
    }

    @androidx.compose.ui.g
    public static final void s(@dl.d c cVar, int i10, @dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!cVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        for (androidx.compose.ui.n.d parent = cVar.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i10) != 0) {
                block.invoke(parent);
            }
        }
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> void t(c visitLocalParents, int i10, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(visitLocalParents, "$this$visitLocalParents");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!visitLocalParents.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        for (androidx.compose.ui.n.d parent = visitLocalParents.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i10) != 0) {
                kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                block.invoke(parent);
            }
        }
    }

    @androidx.compose.ui.g
    public static final void u(@dl.d c cVar, int i10, @dl.d yh.l<? super androidx.compose.ui.n.d, b2> block) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!cVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d child = cVar.getNode().getChild();
        LayoutNode layoutNodeK = k(cVar);
        s0 s0Var = new s0();
        while (layoutNodeK != null) {
            if (child == null) {
                child = layoutNodeK.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i10) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i10) != 0) {
                        block.invoke(child);
                    }
                    child = child.getChild();
                }
                child = null;
            }
            s0Var.c(layoutNodeK.B0());
            layoutNodeK = s0Var.a() ? (LayoutNode) s0Var.b() : null;
        }
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> void v(c visitSubtree, int i10, yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(visitSubtree, "$this$visitSubtree");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!visitSubtree.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.ui.n.d child = visitSubtree.getNode().getChild();
        LayoutNode layoutNodeK = k(visitSubtree);
        s0 s0Var = new s0();
        while (layoutNodeK != null) {
            if (child == null) {
                child = layoutNodeK.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i10) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i10) != 0) {
                        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                        block.invoke(child);
                    }
                    child = child.getChild();
                }
                child = null;
            }
            s0Var.c(layoutNodeK.B0());
            layoutNodeK = s0Var.a() ? (LayoutNode) s0Var.b() : null;
        }
    }

    @androidx.compose.ui.g
    public static final void w(@dl.d c cVar, int i10, @dl.d yh.l<? super androidx.compose.ui.n.d, Boolean> block) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!cVar.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new androidx.compose.ui.n.d[16], 0);
        androidx.compose.ui.n.d child = cVar.getNode().getChild();
        if (child == null) {
            b(eVar, cVar.getNode());
        } else {
            eVar.b(child);
        }
        while (eVar.Q()) {
            androidx.compose.ui.n.d dVar = (androidx.compose.ui.n.d) eVar.g0(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            if ((dVar.getAggregateChildKindSet() & i10) != 0) {
                androidx.compose.ui.n.d child2 = dVar;
                while (true) {
                    if (child2 != null) {
                        if ((child2.getKindSet() & i10) != 0 && !block.invoke(child2).booleanValue()) {
                            break;
                        } else {
                            child2 = child2.getChild();
                        }
                    }
                }
            }
            b(eVar, dVar);
        }
    }

    @androidx.compose.ui.g
    public static final /* synthetic */ <T> void x(c visitSubtreeIf, int i10, yh.l<? super T, Boolean> block) {
        kotlin.jvm.internal.f0.p(visitSubtreeIf, "$this$visitSubtreeIf");
        kotlin.jvm.internal.f0.p(block, "block");
        if (!visitSubtreeIf.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new androidx.compose.ui.n.d[16], 0);
        androidx.compose.ui.n.d child = visitSubtreeIf.getNode().getChild();
        if (child == null) {
            b(eVar, visitSubtreeIf.getNode());
        } else {
            eVar.b(child);
        }
        while (eVar.Q()) {
            androidx.compose.ui.n.d dVar = (androidx.compose.ui.n.d) eVar.g0(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            if ((dVar.getAggregateChildKindSet() & i10) != 0) {
                androidx.compose.ui.n.d child2 = dVar;
                while (true) {
                    if (child2 != null) {
                        if ((child2.getKindSet() & i10) != 0) {
                            kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.f23244d5);
                            if (!block.invoke(child2).booleanValue()) {
                                break;
                            }
                        }
                        child2 = child2.getChild();
                    }
                }
            }
            b(eVar, dVar);
        }
    }
}
