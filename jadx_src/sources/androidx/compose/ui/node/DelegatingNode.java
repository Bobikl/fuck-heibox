package androidx.compose.ui.node;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: DelegatingNode.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u001d\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005H\u0082\bJ\u0019\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\f*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/n$d;", "node", "Lkotlin/b2;", "P", "Lkotlin/Function1;", "block", "R", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "O", "(Landroidx/compose/ui/node/NodeCoordinator;)V", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "fn", "Q", "(Lyh/a;)Landroidx/compose/ui/n$d;", "Lkotlin/z;", androidx.exifinterface.media.a.R4, "F", "G", "j", "Landroidx/compose/ui/n$d;", "delegate", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class DelegatingNode extends androidx.compose.ui.n.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f15126k = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.n.d delegate;

    private final void P(androidx.compose.ui.n.d dVar) {
        androidx.compose.ui.n.d dVar2 = this.delegate;
        if (dVar2 != null) {
            dVar.M(dVar2);
        }
        this.delegate = dVar;
    }

    private final void R(yh.l<? super androidx.compose.ui.n.d, b2> lVar) {
        for (androidx.compose.ui.n.d parent = this.delegate; parent != null; parent = parent.getParent()) {
            lVar.invoke(parent);
        }
    }

    @Override // androidx.compose.ui.n.d
    public void F() {
        super.F();
        for (androidx.compose.ui.n.d parent = this.delegate; parent != null; parent = parent.getParent()) {
            O(getCoordinator());
            parent.t();
        }
    }

    @Override // androidx.compose.ui.n.d
    public void G() {
        for (androidx.compose.ui.n.d parent = this.delegate; parent != null; parent = parent.getParent()) {
            parent.u();
        }
        super.G();
    }

    @Override // androidx.compose.ui.n.d
    public void O(@dl.e NodeCoordinator coordinator) {
        super.O(coordinator);
        for (androidx.compose.ui.n.d parent = this.delegate; parent != null; parent = parent.getParent()) {
            parent.O(coordinator);
        }
    }

    @dl.d
    public final <T extends androidx.compose.ui.n.d> T Q(@dl.d yh.a<? extends T> fn) {
        kotlin.jvm.internal.f0.p(fn, "fn");
        androidx.compose.ui.n.d node = getNode();
        T tInvoke = fn.invoke();
        tInvoke.I(node);
        if (getIsAttached()) {
            O(node.getCoordinator());
            tInvoke.t();
        }
        P(tInvoke);
        return tInvoke;
    }

    @dl.d
    public final <T extends androidx.compose.ui.n.d> kotlin.z<T> S(@dl.d final yh.a<? extends T> fn) {
        kotlin.jvm.internal.f0.p(fn, "fn");
        return kotlin.b0.b(LazyThreadSafetyMode.NONE, new yh.a<T>() { // from class: androidx.compose.ui.node.DelegatingNode$lazyDelegated$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.n.d invoke() {
                return this.f15128b.Q(fn);
            }
        });
    }
}
