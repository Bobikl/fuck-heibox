package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a=\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\f\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000\u001a\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u0000H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0000\u001a\u001a\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016\"\u0018\u0010\u001a\u001a\u00020\u0006*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/b;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusModifier;ILandroidx/compose/ui/unit/LayoutDirection;Lyh/l;)Z", "b", ak.aF, "Lb1/i;", "e", "Landroidx/compose/runtime/collection/e;", ak.av, "Landroidx/compose/ui/input/key/e;", "d", "one", "two", RXScreenCaptureService.KEY_HEIGHT, "", "Ljava/lang/String;", "invalidFocusDirection", "g", "(Landroidx/compose/ui/focus/FocusModifier;)Z", "isEligibleForFocusSearch", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f13602a = "Invalid FocusDirection";

    /* JADX INFO: compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13604b;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            f13603a = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            f13604b = iArr2;
        }
    }

    @dl.d
    public static final androidx.compose.runtime.collection.e<FocusModifier> a(@dl.d FocusModifier focusModifier) {
        boolean z10;
        f0.p(focusModifier, "<this>");
        androidx.compose.runtime.collection.e<FocusModifier> eVarM = focusModifier.m();
        int i10 = eVarM.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 <= 0) {
            z10 = false;
            break;
        }
        FocusModifier[] focusModifierArrG = eVarM.G();
        f0.n(focusModifierArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i11 = 0;
        while (true) {
            if (focusModifierArrG[i11].getFocusState().isDeactivated()) {
                z10 = true;
                break;
            }
            i11++;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return focusModifier.m();
        }
        androidx.compose.runtime.collection.e<FocusModifier> eVar = new androidx.compose.runtime.collection.e<>(new FocusModifier[16], 0);
        androidx.compose.runtime.collection.e<FocusModifier> eVarM2 = focusModifier.m();
        int i12 = eVarM2.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i12 > 0) {
            FocusModifier[] focusModifierArrG2 = eVarM2.G();
            f0.n(focusModifierArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i13 = 0;
            do {
                FocusModifier focusModifier2 = focusModifierArrG2[i13];
                if (focusModifier2.getFocusState().isDeactivated()) {
                    FocusRequester focusRequesterInvoke = focusModifier2.getFocusProperties().S().invoke(b.k(b.INSTANCE.b()));
                    FocusRequester.Companion companion = FocusRequester.INSTANCE;
                    if (f0.g(focusRequesterInvoke, companion.b())) {
                        return new androidx.compose.runtime.collection.e<>(new FocusModifier[16], 0);
                    }
                    if (f0.g(focusRequesterInvoke, companion.d())) {
                        eVar.c(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), a(focusModifier2));
                    } else {
                        androidx.compose.runtime.collection.e<u> eVarE = focusRequesterInvoke.e();
                        int i14 = eVarE.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
                        if (i14 > 0) {
                            u[] uVarArrG = eVarE.G();
                            f0.n(uVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            int i15 = 0;
                            do {
                                FocusModifier focusModifierD = uVarArrG[i15].d();
                                if (focusModifierD != null) {
                                    eVar.b(focusModifierD);
                                }
                                i15++;
                            } while (i15 < i14);
                        }
                    }
                } else {
                    eVar.b(focusModifier2);
                }
                i13++;
            } while (i13 < i12);
        }
        return eVar;
    }

    @dl.e
    public static final FocusModifier b(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "<this>");
        switch (a.f13604b[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier focusedChild = focusModifier.getFocusedChild();
                if (focusedChild != null) {
                    return b(focusedChild);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @dl.e
    public static final FocusModifier c(@dl.d FocusModifier focusModifier) {
        f0.p(focusModifier, "<this>");
        FocusModifier parent = focusModifier.getParent();
        if (parent == null) {
            return null;
        }
        switch (a.f13604b[focusModifier.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return c(parent);
            case 3:
                return focusModifier;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @dl.e
    public static final androidx.compose.ui.input.key.e d(@dl.d FocusModifier focusModifier) {
        LayoutNode layoutNode;
        f0.p(focusModifier, "<this>");
        NodeCoordinator coordinator = focusModifier.getCoordinator();
        androidx.compose.ui.input.key.e eVarH = null;
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null) {
            return null;
        }
        androidx.compose.runtime.collection.e<androidx.compose.ui.input.key.e> eVarA = focusModifier.A();
        int i10 = eVarA.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            androidx.compose.ui.input.key.e[] eVarArrG = eVarA.G();
            f0.n(eVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                androidx.compose.ui.input.key.e eVar = eVarArrG[i11];
                if (f0.g(eVar.getLayoutNode(), layoutNode)) {
                    eVarH = h(eVar, eVarH);
                }
                i11++;
            } while (i11 < i10);
        }
        return eVarH != null ? eVarH : focusModifier.getKeyInputModifier();
    }

    @dl.d
    public static final b1.i e(@dl.d FocusModifier focusModifier) {
        b1.i iVarX;
        f0.p(focusModifier, "<this>");
        NodeCoordinator coordinator = focusModifier.getCoordinator();
        return (coordinator == null || (iVarX = androidx.compose.ui.layout.r.d(coordinator).x(coordinator, false)) == null) ? b1.i.f30369e.a() : iVarX;
    }

    public static final boolean f(@dl.d FocusModifier focusSearch, int i10, @dl.d LayoutDirection layoutDirection, @dl.d yh.l<? super FocusModifier, Boolean> onFound) {
        int iH;
        f0.p(focusSearch, "$this$focusSearch");
        f0.p(layoutDirection, "layoutDirection");
        f0.p(onFound, "onFound");
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.i()) ? true : b.n(i10, companion.l())) {
            return OneDimensionalFocusSearchKt.h(focusSearch, i10, onFound);
        }
        if (b.n(i10, companion.h()) ? true : b.n(i10, companion.m()) ? true : b.n(i10, companion.n()) ? true : b.n(i10, companion.a())) {
            return TwoDimensionalFocusSearchKt.s(focusSearch, i10, onFound);
        }
        if (!b.n(i10, companion.b())) {
            if (!b.n(i10, companion.d())) {
                throw new IllegalStateException(f13602a.toString());
            }
            FocusModifier focusModifierB = b(focusSearch);
            FocusModifier focusModifierC = focusModifierB != null ? c(focusModifierB) : null;
            if (f0.g(focusModifierC, focusSearch) || focusModifierC == null) {
                return false;
            }
            return onFound.invoke(focusModifierC).booleanValue();
        }
        int i11 = a.f13603a[layoutDirection.ordinal()];
        if (i11 == 1) {
            iH = companion.h();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iH = companion.m();
        }
        FocusModifier focusModifierB2 = b(focusSearch);
        if (focusModifierB2 != null) {
            return TwoDimensionalFocusSearchKt.s(focusModifierB2, iH, onFound);
        }
        return false;
    }

    public static final boolean g(@dl.d FocusModifier focusModifier) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        f0.p(focusModifier, "<this>");
        NodeCoordinator coordinator = focusModifier.getCoordinator();
        if ((coordinator == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.getIsPlaced()) ? false : true) {
            NodeCoordinator coordinator2 = focusModifier.getCoordinator();
            if ((coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.p()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private static final androidx.compose.ui.input.key.e h(androidx.compose.ui.input.key.e eVar, androidx.compose.ui.input.key.e eVar2) {
        if (eVar2 == null) {
            return eVar;
        }
        LayoutNode layoutNode = eVar.getLayoutNode();
        androidx.compose.ui.input.key.e parent = eVar2;
        while (!f0.g(parent, eVar)) {
            parent = parent.getParent();
            if (parent == null || !f0.g(parent.getLayoutNode(), layoutNode)) {
                return eVar;
            }
        }
        return eVar2;
    }
}
