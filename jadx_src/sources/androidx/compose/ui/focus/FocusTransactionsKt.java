package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.b1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002\u001a\f\u0010\r\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lkotlin/b2;", "j", ak.av, "f", "", "b", "g", "forcedClear", "d", RXScreenCaptureService.KEY_HEIGHT, "childNode", "i", ak.aF, "k", "l", "m", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class FocusTransactionsKt {

    /* JADX INFO: compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13556a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f13556a = iArr;
        }
    }

    public static final void a(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "<this>");
        int i10 = a.f13556a[focusModifier.getFocusState().ordinal()];
        if (i10 == 4) {
            focusModifier.P(FocusStateImpl.Inactive);
        } else {
            if (i10 != 5) {
                return;
            }
            focusModifier.P(FocusStateImpl.ActiveParent);
        }
    }

    public static final boolean b(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "<this>");
        switch (a.f13556a[focusModifier.getFocusState().ordinal()]) {
            case 1:
                focusModifier.P(FocusStateImpl.Captured);
                return true;
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean c(FocusModifier focusModifier) {
        FocusModifier focusedChild = focusModifier.getFocusedChild();
        if (focusedChild == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (!e(focusedChild, false, 1, null)) {
            return false;
        }
        focusModifier.Q(null);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean d(@dl.d FocusModifier focusModifier, boolean z10) {
        f0.p(focusModifier, "<this>");
        switch (a.f13556a[focusModifier.getFocusState().ordinal()]) {
            case 1:
                focusModifier.P(FocusStateImpl.Inactive);
                return true;
            case 2:
                if (!z10) {
                    return z10;
                }
                focusModifier.P(FocusStateImpl.Inactive);
                return z10;
            case 3:
                if (c(focusModifier)) {
                    focusModifier.P(FocusStateImpl.Inactive);
                    return true;
                }
                return false;
            case 4:
            case 6:
                return true;
            case 5:
                if (c(focusModifier)) {
                    focusModifier.P(FocusStateImpl.Deactivated);
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ boolean e(FocusModifier focusModifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return d(focusModifier, z10);
    }

    public static final void f(@dl.d FocusModifier focusModifier) {
        LayoutNode layoutNode;
        b1 owner;
        g focusManager;
        f0.p(focusModifier, "<this>");
        int i10 = a.f13556a[focusModifier.getFocusState().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                focusModifier.P(FocusStateImpl.DeactivatedParent);
                return;
            } else {
                if (i10 != 6) {
                    return;
                }
                focusModifier.P(FocusStateImpl.Deactivated);
                return;
            }
        }
        NodeCoordinator coordinator = focusModifier.getCoordinator();
        if (coordinator != null && (layoutNode = coordinator.getLayoutNode()) != null && (owner = layoutNode.getOwner()) != null && (focusManager = owner.getFocusManager()) != null) {
            focusManager.b(true);
        }
        focusModifier.P(FocusStateImpl.Deactivated);
    }

    public static final boolean g(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "<this>");
        switch (a.f13556a[focusModifier.getFocusState().ordinal()]) {
            case 1:
                return true;
            case 2:
                focusModifier.P(FocusStateImpl.Active);
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final void h(FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl;
        switch (a.f13556a[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 3:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 4:
            case 5:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        focusModifier.P(focusStateImpl);
    }

    private static final boolean i(FocusModifier focusModifier, FocusModifier focusModifier2) {
        focusModifier.Q(focusModifier2);
        h(focusModifier2);
        return true;
    }

    public static final void j(@dl.d FocusModifier focusModifier) {
        LayoutNode layoutNode;
        f0.p(focusModifier, "<this>");
        NodeCoordinator coordinator = focusModifier.getCoordinator();
        if (((coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null) ? null : layoutNode.getOwner()) == null) {
            focusModifier.N(true);
        }
        switch (a.f13556a[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                m(focusModifier);
                break;
            case 3:
                if (c(focusModifier)) {
                    h(focusModifier);
                }
                break;
            case 4:
            case 5:
                TwoDimensionalFocusSearchKt.j(focusModifier, b.INSTANCE.b(), new yh.l<FocusModifier, Boolean>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$requestFocus$1
                    @Override // yh.l
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(@dl.d FocusModifier it) {
                        f0.p(it, "it");
                        FocusTransactionsKt.j(it);
                        return Boolean.TRUE;
                    }
                });
                break;
            case 6:
                FocusModifier parent = focusModifier.getParent();
                if (parent != null) {
                    k(parent, focusModifier);
                } else if (l(focusModifier)) {
                    h(focusModifier);
                }
                break;
        }
    }

    private static final boolean k(FocusModifier focusModifier, FocusModifier focusModifier2) {
        if (!focusModifier.m().n(focusModifier2)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        switch (a.f13556a[focusModifier.getFocusState().ordinal()]) {
            case 1:
                focusModifier.P(FocusStateImpl.ActiveParent);
                return i(focusModifier, focusModifier2);
            case 2:
                return false;
            case 3:
                if (c(focusModifier)) {
                    return i(focusModifier, focusModifier2);
                }
                return false;
            case 4:
                a(focusModifier);
                boolean zK = k(focusModifier, focusModifier2);
                f(focusModifier);
                return zK;
            case 5:
                if (focusModifier.getFocusedChild() == null || c(focusModifier)) {
                    return i(focusModifier, focusModifier2);
                }
                return false;
            case 6:
                FocusModifier parent = focusModifier.getParent();
                if (parent == null && l(focusModifier)) {
                    focusModifier.P(FocusStateImpl.Active);
                    return k(focusModifier, focusModifier2);
                }
                if (parent == null || !k(parent, focusModifier)) {
                    return false;
                }
                return k(focusModifier, focusModifier2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean l(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        b1 owner;
        NodeCoordinator coordinator = focusModifier.getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return owner.requestFocus();
    }

    public static final void m(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "<this>");
        e focusEventListener = focusModifier.getFocusEventListener();
        if (focusEventListener != null) {
            focusEventListener.g();
        }
    }
}
