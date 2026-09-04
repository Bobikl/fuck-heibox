package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.f1;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b \u0010!J0\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/c0;", "", "Landroidx/compose/ui/input/pointer/a0;", "pointerEvent", "Landroidx/compose/ui/input/pointer/n0;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/o0;", "b", "(Landroidx/compose/ui/input/pointer/a0;Landroidx/compose/ui/input/pointer/n0;Z)I", "Lkotlin/b2;", "d", "Landroidx/compose/ui/node/LayoutNode;", ak.av, "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/input/pointer/g;", "Landroidx/compose/ui/input/pointer/g;", "hitPathTracker", "Landroidx/compose/ui/input/pointer/z;", ak.aF, "Landroidx/compose/ui/input/pointer/z;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/node/k;", "Landroidx/compose/ui/node/f1;", "Landroidx/compose/ui/node/k;", "hitResult", "e", "Z", "isProcessing", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g hitPathTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final z pointerInputChangeEventProducer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.node.k<f1> hitResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    public c0(@dl.d LayoutNode root) {
        kotlin.jvm.internal.f0.p(root, "root");
        this.root = root;
        this.hitPathTracker = new g(root.u());
        this.pointerInputChangeEventProducer = new z();
        this.hitResult = new androidx.compose.ui.node.k<>();
    }

    public static /* synthetic */ int c(c0 c0Var, a0 a0Var, n0 n0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return c0Var.b(a0Var, n0Var, z10);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LayoutNode getRoot() {
        return this.root;
    }

    public final int b(@dl.d a0 pointerEvent, @dl.d n0 positionCalculator, boolean isInBounds) {
        boolean z10;
        PointerInputChange pointerInputChange;
        kotlin.jvm.internal.f0.p(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.f0.p(positionCalculator, "positionCalculator");
        if (this.isProcessing) {
            return d0.a(false, false);
        }
        boolean z11 = true;
        try {
            this.isProcessing = true;
            h hVarB = this.pointerInputChangeEventProducer.b(pointerEvent, positionCalculator);
            Collection<PointerInputChange> collectionValues = hVarB.a().values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) it.next();
                    if (pointerInputChange2.getPressed() || pointerInputChange2.getPreviousPressed()) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            boolean z12 = !z10;
            for (PointerInputChange pointerInputChange3 : hVarB.a().values()) {
                if (z12 || q.c(pointerInputChange3)) {
                    LayoutNode.D0(this.root, pointerInputChange3.getPosition(), this.hitResult, m0.i(pointerInputChange3.getType(), m0.INSTANCE.d()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.a(pointerInputChange3.getId(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.f();
            boolean zB = this.hitPathTracker.b(hVarB, isInBounds);
            if (!hVarB.getSuppressMovementConsumption()) {
                Collection<PointerInputChange> collectionValues2 = hVarB.a().values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    Iterator<T> it2 = collectionValues2.iterator();
                    do {
                        if (it2.hasNext()) {
                            pointerInputChange = (PointerInputChange) it2.next();
                        }
                    } while (!(q.q(pointerInputChange) && pointerInputChange.A()));
                }
                z11 = false;
                break;
            }
            z11 = false;
            break;
            return d0.a(zB, z11);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void d() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.a();
        this.hitPathTracker.e();
    }
}
