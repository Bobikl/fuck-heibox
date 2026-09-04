package androidx.compose.ui.node;

import androidx.compose.ui.CombinedModifier;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000b*\u0001\u000e\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a$\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/n$c;", "prev", "next", "", "e", "Landroidx/compose/ui/n$d;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/node/o0;", "node", "f", "Landroidx/compose/ui/n;", "Landroidx/compose/runtime/collection/e;", "result", "d", "androidx/compose/ui/node/NodeChainKt$a", ak.av, "Landroidx/compose/ui/node/NodeChainKt$a;", "SentinelHead", "b", "I", "ActionReplace", ak.aF, "ActionUpdate", "ActionReuse", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class NodeChainKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final a f15228a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f15229b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15230c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f15231d = 2;

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/compose/ui/node/NodeChainKt$a", "Landroidx/compose/ui/n$d;", "", "toString", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends androidx.compose.ui.n.d {
        a() {
        }

        @dl.d
        public String toString() {
            return "<Head>";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> d(androidx.compose.ui.n nVar, final androidx.compose.runtime.collection.e<androidx.compose.ui.n.c> eVar) {
        androidx.compose.runtime.collection.e eVar2 = new androidx.compose.runtime.collection.e(new androidx.compose.ui.n[eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()], 0);
        eVar2.b(nVar);
        while (eVar2.Q()) {
            androidx.compose.ui.n nVar2 = (androidx.compose.ui.n) eVar2.g0(eVar2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            if (nVar2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) nVar2;
                eVar2.b(combinedModifier.getInner());
                eVar2.b(combinedModifier.getOuter());
            } else if (nVar2 instanceof androidx.compose.ui.n.c) {
                eVar.b(nVar2);
            } else {
                nVar2.a0(new yh.l<androidx.compose.ui.n.c, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(@dl.d androidx.compose.ui.n.c it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        eVar.b(it);
                        return Boolean.TRUE;
                    }
                });
            }
        }
        return eVar;
    }

    public static final int e(@dl.d androidx.compose.ui.n.c prev, @dl.d androidx.compose.ui.n.c next) {
        kotlin.jvm.internal.f0.p(prev, "prev");
        kotlin.jvm.internal.f0.p(next, "next");
        if (kotlin.jvm.internal.f0.g(prev, next)) {
            return 2;
        }
        return androidx.compose.ui.b.a(prev, next) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends androidx.compose.ui.n.d> androidx.compose.ui.n.d f(o0<T> o0Var, androidx.compose.ui.n.d dVar) {
        kotlin.jvm.internal.f0.n(dVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        return o0Var.m(dVar);
    }
}
